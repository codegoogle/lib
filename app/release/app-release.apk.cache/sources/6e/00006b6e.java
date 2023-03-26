package org.xbill.DNS;

import com.p7700g.p99005.gc0;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes4.dex */
public class SimpleResolver implements Resolver {
    public static final int DEFAULT_EDNS_PAYLOADSIZE = 1280;
    public static final int DEFAULT_PORT = 53;
    private static final short DEFAULT_UDPSIZE = 512;
    private static String defaultResolver = "localhost";
    private static int uniqueID;
    private InetSocketAddress address;
    private boolean ignoreTruncation;
    private InetSocketAddress localAddress;
    private OPTRecord queryOPT;
    private long timeoutValue;
    private TSIG tsig;
    private boolean useTCP;

    public SimpleResolver(String str) throws UnknownHostException {
        InetAddress byName;
        this.timeoutValue = gc0.c;
        if (str == null && (str = ResolverConfig.getCurrentConfig().server()) == null) {
            str = defaultResolver;
        }
        if (str.equals("0")) {
            byName = InetAddress.getLocalHost();
        } else {
            byName = InetAddress.getByName(str);
        }
        this.address = new InetSocketAddress(byName, 53);
    }

    private void applyEDNS(Message message) {
        if (this.queryOPT == null || message.getOPT() != null) {
            return;
        }
        message.addRecord(this.queryOPT, 3);
    }

    private int maxUDPSize(Message message) {
        OPTRecord opt = message.getOPT();
        if (opt == null) {
            return 512;
        }
        return opt.getPayloadSize();
    }

    private Message parseMessage(byte[] bArr) throws WireParseException {
        try {
            return new Message(bArr);
        } catch (IOException e) {
            e = e;
            if (Options.check("verbose")) {
                e.printStackTrace();
            }
            if (!(e instanceof WireParseException)) {
                e = new WireParseException("Error parsing message");
            }
            throw ((WireParseException) e);
        }
    }

    private Message sendAXFR(Message message) throws IOException {
        ZoneTransferIn newAXFR = ZoneTransferIn.newAXFR(message.getQuestion().getName(), this.address, this.tsig);
        newAXFR.setTimeout((int) (getTimeout() / 1000));
        newAXFR.setLocalAddress(this.localAddress);
        try {
            newAXFR.run();
            List<Record> axfr = newAXFR.getAXFR();
            Message message2 = new Message(message.getHeader().getID());
            message2.getHeader().setFlag(5);
            message2.getHeader().setFlag(0);
            message2.addRecord(message.getQuestion(), 0);
            for (Record record : axfr) {
                message2.addRecord(record, 1);
            }
            return message2;
        } catch (ZoneTransferException e) {
            throw new WireParseException(e.getMessage());
        }
    }

    public static void setDefaultResolver(String str) {
        defaultResolver = str;
    }

    private void verifyTSIG(Message message, Message message2, byte[] bArr, TSIG tsig) {
        if (tsig == null) {
            return;
        }
        int verify = tsig.verify(message2, bArr, message.getTSIG());
        if (Options.check("verbose")) {
            PrintStream printStream = System.err;
            StringBuilder G = wo1.G("TSIG verify: ");
            G.append(Rcode.TSIGstring(verify));
            printStream.println(G.toString());
        }
    }

    public InetSocketAddress getAddress() {
        return this.address;
    }

    public long getTimeout() {
        return this.timeoutValue;
    }

    @Override // org.xbill.DNS.Resolver
    public Message send(Message message) throws IOException {
        byte[] sendrecv;
        Record question;
        if (Options.check("verbose")) {
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
                sendrecv = TCPClient.sendrecv(this.localAddress, this.address, wire, currentTimeMillis);
            } else {
                sendrecv = UDPClient.sendrecv(this.localAddress, this.address, wire, maxUDPSize, currentTimeMillis);
            }
            if (sendrecv.length >= 12) {
                int i = ((sendrecv[0] & 255) << 8) + (sendrecv[1] & 255);
                int id = message2.getHeader().getID();
                if (i != id) {
                    String o = wo1.o("invalid message id: expected ", id, "; got id ", i);
                    if (!z2) {
                        if (Options.check("verbose")) {
                            System.err.println(o);
                        }
                        z = z2;
                    } else {
                        throw new WireParseException(o);
                    }
                } else {
                    Message parseMessage = parseMessage(sendrecv);
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
    }

    @Override // org.xbill.DNS.Resolver
    public Object sendAsync(Message message, ResolverListener resolverListener) {
        Integer valueOf;
        synchronized (this) {
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

    public void setAddress(InetSocketAddress inetSocketAddress) {
        this.address = inetSocketAddress;
    }

    @Override // org.xbill.DNS.Resolver
    public void setEDNS(int i, int i2, int i3, List list) {
        if (i != 0 && i != -1) {
            throw new IllegalArgumentException("invalid EDNS level - must be 0 or -1");
        }
        this.queryOPT = new OPTRecord(i2 == 0 ? DEFAULT_EDNS_PAYLOADSIZE : i2, 0, i, i3, list);
    }

    @Override // org.xbill.DNS.Resolver
    public void setIgnoreTruncation(boolean z) {
        this.ignoreTruncation = z;
    }

    public void setLocalAddress(InetSocketAddress inetSocketAddress) {
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
    public void setTSIGKey(TSIG tsig) {
        this.tsig = tsig;
    }

    @Override // org.xbill.DNS.Resolver
    public void setTimeout(int i, int i2) {
        this.timeoutValue = (i * 1000) + i2;
    }

    public void setAddress(InetAddress inetAddress) {
        this.address = new InetSocketAddress(inetAddress, this.address.getPort());
    }

    public void setLocalAddress(InetAddress inetAddress) {
        this.localAddress = new InetSocketAddress(inetAddress, 0);
    }

    @Override // org.xbill.DNS.Resolver
    public void setTimeout(int i) {
        setTimeout(i, 0);
    }

    @Override // org.xbill.DNS.Resolver
    public void setEDNS(int i) {
        setEDNS(i, 0, 0, null);
    }

    public SimpleResolver() throws UnknownHostException {
        this(null);
    }
}