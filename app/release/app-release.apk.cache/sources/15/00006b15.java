package org.xbill.DNS;

import android.annotation.SuppressLint;
import com.p7700g.p99005.ix5;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public final class DecorableUdpClient extends Client {
    private static final int EPHEMERAL_RANGE = 64511;
    private static final int EPHEMERAL_START = 1024;
    private static final int EPHEMERAL_STOP = 65535;
    @x1
    @SuppressLint({"TrulyRandom"})
    private static SecureRandom prng = new SecureRandom();
    private static volatile boolean prngInitializing = true;
    private boolean bound;
    @z1
    private final SocketDecorator decorator;

    static {
        new Thread(ix5.s).start();
    }

    public DecorableUdpClient(long j, @z1 SocketDecorator socketDecorator) throws IOException {
        super(DatagramChannel.open(), j);
        this.bound = false;
        this.decorator = socketDecorator;
    }

    private void bindRandom(@z1 InetSocketAddress inetSocketAddress) throws IOException {
        InetSocketAddress inetSocketAddress2;
        if (prngInitializing) {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException unused) {
            }
            if (prngInitializing) {
                return;
            }
        }
        DatagramChannel datagramChannel = (DatagramChannel) this.key.channel();
        for (int i = 0; i < 1024; i++) {
            try {
                int nextInt = prng.nextInt(EPHEMERAL_RANGE) + 1024;
                if (inetSocketAddress != null) {
                    inetSocketAddress2 = new InetSocketAddress(inetSocketAddress.getAddress(), nextInt);
                } else {
                    inetSocketAddress2 = new InetSocketAddress(nextInt);
                }
                datagramChannel.socket().bind(inetSocketAddress2);
                this.bound = true;
                return;
            } catch (SocketException unused2) {
            }
        }
    }

    @x1
    public static byte[] sendrecv(@z1 SocketAddress socketAddress, @x1 SocketAddress socketAddress2, @x1 byte[] bArr, int i, long j, @z1 SocketDecorator socketDecorator) throws IOException {
        DecorableUdpClient decorableUdpClient = new DecorableUdpClient(j, socketDecorator);
        DecorateInfo decorateInfo = null;
        try {
            decorableUdpClient.bind(socketAddress);
            decorateInfo = decorableUdpClient.connect(socketAddress2);
            decorableUdpClient.send(bArr);
            return decorableUdpClient.recv(i);
        } finally {
            decorableUdpClient.cleanup();
            if (decorateInfo != null) {
                decorateInfo.close();
            }
        }
    }

    public void bind(@z1 SocketAddress socketAddress) throws IOException {
        if (socketAddress == null || ((socketAddress instanceof InetSocketAddress) && ((InetSocketAddress) socketAddress).getPort() == 0)) {
            bindRandom((InetSocketAddress) socketAddress);
            if (this.bound) {
                return;
            }
        }
        if (socketAddress != null) {
            ((DatagramChannel) this.key.channel()).socket().bind(socketAddress);
            this.bound = true;
        }
    }

    public DecorateInfo connect(@x1 SocketAddress socketAddress) throws IOException {
        if (!this.bound) {
            bind(null);
        }
        DatagramChannel datagramChannel = (DatagramChannel) this.key.channel();
        SocketDecorator socketDecorator = this.decorator;
        DecorateInfo decorate = socketDecorator != null ? socketDecorator.decorate(datagramChannel.socket()) : null;
        datagramChannel.connect(socketAddress);
        return decorate;
    }

    @x1
    public byte[] recv(int i) throws IOException {
        DatagramChannel datagramChannel = (DatagramChannel) this.key.channel();
        byte[] bArr = new byte[i];
        this.key.interestOps(1);
        while (true) {
            try {
                if (this.key.isReadable()) {
                    break;
                }
                Client.blockUntil(this.key, this.endTime);
            } finally {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
            }
        }
        long read = datagramChannel.read(ByteBuffer.wrap(bArr));
        if (read > 0) {
            int i2 = (int) read;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            Client.verboseLog("UDP read", datagramChannel.socket().getLocalSocketAddress(), datagramChannel.socket().getRemoteSocketAddress(), bArr2);
            return bArr2;
        }
        throw new EOFException();
    }

    public void send(@x1 byte[] bArr) throws IOException {
        DatagramChannel datagramChannel = (DatagramChannel) this.key.channel();
        Client.verboseLog("UDP write", datagramChannel.socket().getLocalSocketAddress(), datagramChannel.socket().getRemoteSocketAddress(), bArr);
        datagramChannel.write(ByteBuffer.wrap(bArr));
    }

    @x1
    public static byte[] sendrecv(@x1 SocketAddress socketAddress, @x1 byte[] bArr, int i, long j, @z1 SocketDecorator socketDecorator) throws IOException {
        return sendrecv(null, socketAddress, bArr, i, j, socketDecorator);
    }
}