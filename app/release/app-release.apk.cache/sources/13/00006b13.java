package org.xbill.DNS;

import android.annotation.SuppressLint;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes4.dex */
public class DecorableProtectedResolver implements Resolver {
    private static final int DEFAULT_EDNS_PAYLOADSIZE = 1280;
    private static final int DEFAULT_PORT = 53;
    private static final short DEFAULT_UDPSIZE = 512;
    private static final String LOG_LEVEL_VERBOSE = "verbose";
    @x1
    private static String defaultResolver = "localhost";
    private static int uniqueID;
    @x1
    private InetSocketAddress address;
    @z1
    private final SocketDecorator decorator;
    private boolean ignoreTruncation;
    @z1
    private InetSocketAddress localAddress;
    @z1
    private OPTRecord queryOPT;
    private long timeoutValue = gc0.c;
    @z1
    private TSIG tsig;
    private boolean useTCP;

    public DecorableProtectedResolver(@x1 InetSocketAddress inetSocketAddress, @z1 SocketDecorator socketDecorator) {
        this.decorator = socketDecorator;
        this.address = inetSocketAddress;
    }

    private void applyEDNS(@x1 Message message) {
        if (this.queryOPT == null || message.getOPT() != null) {
            return;
        }
        message.addRecord(this.queryOPT, 3);
    }

    private static int checkPayloadSize(int i) {
        if (i == 0) {
            return 1280;
        }
        return i;
    }

    @x1
    public static DecorableProtectedResolver create(@z1 SocketDecorator socketDecorator) throws UnknownHostException {
        String server = ResolverConfig.getCurrentConfig().server();
        if (server == null) {
            server = defaultResolver;
        }
        return create(server, socketDecorator);
    }

    private int maxUDPSize(@x1 Message message) {
        OPTRecord opt = message.getOPT();
        if (opt == null) {
            return 512;
        }
        return opt.getPayloadSize();
    }

    @x1
    private Message parseMessage(@x1 byte[] bArr) throws WireParseException {
        try {
            return new Message(bArr);
        } catch (IOException e) {
            e = e;
            if (Options.check(LOG_LEVEL_VERBOSE)) {
                e.printStackTrace();
            }
            if (!(e instanceof WireParseException)) {
                e = new WireParseException("Error parsing message");
            }
            throw ((WireParseException) e);
        }
    }

    @x1
    private Message sendAXFR(@x1 Message message) throws IOException {
        ZoneTransferIn newAXFR = ZoneTransferIn.newAXFR(message.getQuestion().getName(), this.address, this.tsig);
        newAXFR.setTimeout((int) (getTimeout() / 1000));
        newAXFR.setLocalAddress(this.localAddress);
        try {
            newAXFR.run();
            Message message2 = new Message(message.getHeader().getID());
            message2.getHeader().setFlag(5);
            message2.getHeader().setFlag(0);
            message2.addRecord(message.getQuestion(), 0);
            for (Record record : newAXFR.getAXFR()) {
                message2.addRecord(record, 1);
            }
            return message2;
        } catch (ZoneTransferException e) {
            throw new WireParseException(e.getMessage());
        }
    }

    public static void setDefaultResolver(@x1 String str) {
        defaultResolver = str;
    }

    private void verifyTSIG(@x1 Message message, @x1 Message message2, @x1 byte[] bArr, @z1 TSIG tsig) {
        if (tsig == null) {
            return;
        }
        int verify = tsig.verify(message2, bArr, message.getTSIG());
        if (Options.check(LOG_LEVEL_VERBOSE)) {
            PrintStream printStream = System.err;
            StringBuilder G = wo1.G("TSIG verify: ");
            G.append(Rcode.TSIGstring(verify));
            printStream.println(G.toString());
        }
    }

    @z1
    public InetSocketAddress getAddress() {
        return this.address;
    }

    @z1
    public TSIG getTSIGKey() {
        return this.tsig;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public long getTimeout() {
        return this.timeoutValue;
    }

    @Override // org.xbill.DNS.Resolver
    @x1
    public Message send(@x1 Message message) throws IOException {
        byte[] sendrecv;
        Message parseMessage;
        Record question;
        if (Options.check(LOG_LEVEL_VERBOSE)) {
            PrintStream printStream = System.err;
            StringBuilder G = wo1.G("Sending to ");
            G.append(this.address.getAddress().getHostAddress());
            G.append(":");
            G.append(this.address.getPort());
            printStream.println(G.toString());
        }
        if (message.getHeader().getOpcode() == 0 && (question = message.getQuestion()) != null && question.getType() == 252) {
            return sendAXFR(message);
        }
        Message message2 = (Message) message.clone();
        applyEDNS(message2);
        TSIG tsig = this.tsig;
        if (tsig != null) {
            tsig.apply(message2, null);
        }
        byte[] wire = message2.toWire(65535);
        int maxUDPSize = maxUDPSize(message2);
        long currentTimeMillis = System.currentTimeMillis() + this.timeoutValue;
        boolean z = false;
        while (true) {
            boolean z2 = (this.useTCP || wire.length > maxUDPSize) ? true : z;
            if (z2) {
                sendrecv = DecorableTcpClient.sendrecv(this.localAddress, this.address, wire, currentTimeMillis, this.decorator);
            } else {
                sendrecv = DecorableUdpClient.sendrecv(this.localAddress, this.address, wire, maxUDPSize, currentTimeMillis, this.decorator);
            }
            if (sendrecv.length >= 12) {
                int i = ((sendrecv[0] & 255) << 8) + (sendrecv[1] & 255);
                int id = message2.getHeader().getID();
                if (i != id) {
                    String o = wo1.o("invalid message id: expected ", id, "; got id ", i);
                    if (!z2) {
                        if (Options.check(LOG_LEVEL_VERBOSE)) {
                            System.err.println(o);
                        }
                        z = z2;
                    } else {
                        throw new WireParseException(o);
                    }
                } else {
                    parseMessage = parseMessage(sendrecv);
                    verifyTSIG(message2, parseMessage, sendrecv, this.tsig);
                    if (z2 || this.ignoreTruncation || !parseMessage.getHeader().getFlag(6)) {
                        break;
                    }
                    z = true;
                }
            } else {
                throw new WireParseException("invalid DNS header - too short");
            }
        }
        return parseMessage;
    }

    @Override // org.xbill.DNS.Resolver
    @x1
    public Object sendAsync(@x1 Message message, @x1 ResolverListener resolverListener) {
        Integer valueOf;
        synchronized (DecorableProtectedResolver.class) {
            int i = uniqueID;
            uniqueID = i + 1;
            valueOf = Integer.valueOf(i);
        }
        Record question = message.getQuestion();
        String str = getClass() + ": " + (question != null ? question.getName().toString() : "(none)");
        ResolveThread resolveThread = new ResolveThread(this, message, valueOf, resolverListener);
        resolveThread.setName(str);
        resolveThread.setDaemon(true);
        resolveThread.start();
        return valueOf;
    }

    public void setAddress(@x1 InetAddress inetAddress) {
        this.address = new InetSocketAddress(inetAddress, this.address.getPort());
    }

    @Override // org.xbill.DNS.Resolver
    public void setEDNS(int i, int i2, int i3, @z1 List list) {
        if (i != 0 && i != -1) {
            throw new IllegalArgumentException("invalid EDNS level - must be 0 or -1");
        }
        this.queryOPT = new OPTRecord(checkPayloadSize(i2), 0, i, i3, list);
    }

    @Override // org.xbill.DNS.Resolver
    public void setIgnoreTruncation(boolean z) {
        this.ignoreTruncation = z;
    }

    public void setLocalAddress(@z1 InetSocketAddress inetSocketAddress) {
        this.localAddress = inetSocketAddress;
    }

    @Override // org.xbill.DNS.Resolver
    public void setPort(int i) {
        this.address = new InetSocketAddress(this.address.getAddress(), i);
    }

    @Override // org.xbill.DNS.Resolver
    public void setTCP(boolean z) {
        this.useTCP = z;
    }

    @Override // org.xbill.DNS.Resolver
    public void setTSIGKey(@z1 TSIG tsig) {
        this.tsig = tsig;
    }

    @Override // org.xbill.DNS.Resolver
    @SuppressLint({"KotlinPropertyAccess"})
    public void setTimeout(int i, int i2) {
        this.timeoutValue = (i * 1000) + i2;
    }

    public void setAddress(@x1 InetSocketAddress inetSocketAddress) {
        this.address = inetSocketAddress;
    }

    public void setLocalAddress(@x1 InetAddress inetAddress) {
        this.localAddress = new InetSocketAddress(inetAddress, 0);
    }

    @Override // org.xbill.DNS.Resolver
    @SuppressLint({"KotlinPropertyAccess"})
    public void setTimeout(int i) {
        setTimeout(i, 0);
    }

    @Override // org.xbill.DNS.Resolver
    public void setEDNS(int i) {
        setEDNS(i, 0, 0, null);
    }

    @x1
    public static DecorableProtectedResolver create(@x1 String str, @z1 SocketDecorator socketDecorator) throws UnknownHostException {
        return new DecorableProtectedResolver(new InetSocketAddress("0".equals(str) ? InetAddress.getLocalHost() : InetAddress.getByName(str), 53), socketDecorator);
    }
}