package org.xbill.DNS;

import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* loaded from: classes4.dex */
public class DecorableTcpClient extends Client {
    @z1
    private final SocketDecorator decorator;

    public DecorableTcpClient(long j, @z1 SocketDecorator socketDecorator) throws IOException {
        super(SocketChannel.open(), j);
        this.decorator = socketDecorator;
    }

    @x1
    private byte[] recv(int i) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        byte[] bArr = new byte[i];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.key.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.key.isReadable()) {
                    long read = socketChannel.read(wrap);
                    if (read >= 0) {
                        i2 += (int) read;
                        if (i2 < i && System.currentTimeMillis() > this.endTime) {
                            throw new SocketTimeoutException();
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    Client.blockUntil(this.key, this.endTime);
                }
            } finally {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
            }
        }
        return bArr;
    }

    @x1
    public static byte[] sendrecv(@z1 SocketAddress socketAddress, @x1 SocketAddress socketAddress2, @x1 byte[] bArr, long j, @z1 SocketDecorator socketDecorator) throws IOException {
        DecorableTcpClient decorableTcpClient = new DecorableTcpClient(j, socketDecorator);
        if (socketAddress != null) {
            try {
                decorableTcpClient.bind(socketAddress);
            } finally {
                decorableTcpClient.cleanup();
            }
        }
        decorableTcpClient.connect(socketAddress2);
        decorableTcpClient.send(bArr);
        return decorableTcpClient.recv();
    }

    public void bind(@x1 SocketAddress socketAddress) throws IOException {
        ((SocketChannel) this.key.channel()).socket().bind(socketAddress);
    }

    public void connect(@x1 SocketAddress socketAddress) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
        SocketDecorator socketDecorator = this.decorator;
        DecorateInfo decorate = socketDecorator != null ? socketDecorator.decorate(socketChannel.socket()) : null;
        this.key.interestOps(8);
        while (true) {
            try {
                if (socketChannel.finishConnect()) {
                    break;
                } else if (!this.key.isConnectable()) {
                    Client.blockUntil(this.key, this.endTime);
                }
            } finally {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
                if (decorate != null) {
                    decorate.close();
                }
            }
        }
    }

    public void send(@x1 byte[] bArr) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        Client.verboseLog("TCP write", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArr);
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (bArr.length >>> 8), (byte) (bArr.length & 255)}), ByteBuffer.wrap(bArr)};
        this.key.interestOps(4);
        int i = 0;
        while (i < bArr.length + 2) {
            try {
                if (this.key.isWritable()) {
                    long write = socketChannel.write(byteBufferArr);
                    if (write >= 0) {
                        i += (int) write;
                        if (i < bArr.length + 2 && System.currentTimeMillis() > this.endTime) {
                            throw new SocketTimeoutException();
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    Client.blockUntil(this.key, this.endTime);
                }
            } finally {
                if (this.key.isValid()) {
                    this.key.interestOps(0);
                }
            }
        }
    }

    @x1
    public static byte[] sendrecv(@x1 SocketAddress socketAddress, @x1 byte[] bArr, long j, @z1 SocketDecorator socketDecorator) throws IOException {
        return sendrecv(null, socketAddress, bArr, j, socketDecorator);
    }

    @x1
    public byte[] recv() throws IOException {
        byte[] recv = recv(2);
        byte[] recv2 = recv(((recv[0] & 255) << 8) + (recv[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        Client.verboseLog("TCP read", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), recv2);
        return recv2;
    }
}