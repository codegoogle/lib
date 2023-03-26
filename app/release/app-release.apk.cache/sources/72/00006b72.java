package org.xbill.DNS;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* loaded from: classes4.dex */
public final class TCPClient extends Client {
    public TCPClient(long j) throws IOException {
        super(SocketChannel.open(), j);
    }

    private byte[] _recv(int i) throws IOException {
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

    public static byte[] sendrecv(SocketAddress socketAddress, SocketAddress socketAddress2, byte[] bArr, long j) throws IOException {
        TCPClient tCPClient = new TCPClient(j);
        if (socketAddress != null) {
            try {
                tCPClient.bind(socketAddress);
            } finally {
                tCPClient.cleanup();
            }
        }
        tCPClient.connect(socketAddress2);
        tCPClient.send(bArr);
        return tCPClient.recv();
    }

    public void bind(SocketAddress socketAddress) throws IOException {
        ((SocketChannel) this.key.channel()).socket().bind(socketAddress);
    }

    public void connect(SocketAddress socketAddress) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
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
            }
        }
    }

    public byte[] recv() throws IOException {
        byte[] _recv = _recv(2);
        byte[] _recv2 = _recv(((_recv[0] & 255) << 8) + (_recv[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.key.channel();
        Client.verboseLog("TCP read", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), _recv2);
        return _recv2;
    }

    public void send(byte[] bArr) throws IOException {
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

    public static byte[] sendrecv(SocketAddress socketAddress, byte[] bArr, long j) throws IOException {
        return sendrecv(null, socketAddress, bArr, j);
    }
}