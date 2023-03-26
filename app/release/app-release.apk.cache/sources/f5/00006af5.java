package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import org.xbill.DNS.utils.hexdump;

/* loaded from: classes4.dex */
public class Client {
    private static PacketLogger packetLogger;
    public long endTime;
    public SelectionKey key;

    public Client(SelectableChannel selectableChannel, long j) throws IOException {
        Selector selector;
        this.endTime = j;
        try {
            selector = Selector.open();
        } catch (Throwable th) {
            th = th;
            selector = null;
        }
        try {
            selectableChannel.configureBlocking(false);
            this.key = selectableChannel.register(selector, 1);
        } catch (Throwable th2) {
            th = th2;
            if (selector != null) {
                selector.close();
            }
            selectableChannel.close();
            throw th;
        }
    }

    public static void blockUntil(SelectionKey selectionKey, long j) throws IOException {
        int selectNow;
        long currentTimeMillis = j - System.currentTimeMillis();
        int i = (currentTimeMillis > 0L ? 1 : (currentTimeMillis == 0L ? 0 : -1));
        if (i > 0) {
            selectNow = selectionKey.selector().select(currentTimeMillis);
        } else {
            selectNow = i == 0 ? selectionKey.selector().selectNow() : 0;
        }
        if (selectNow == 0) {
            throw new SocketTimeoutException();
        }
    }

    public static void setPacketLogger(PacketLogger packetLogger2) {
        packetLogger = packetLogger2;
    }

    public static void verboseLog(String str, SocketAddress socketAddress, SocketAddress socketAddress2, byte[] bArr) {
        if (Options.check("verbosemsg")) {
            System.err.println(hexdump.dump(str, bArr));
        }
        PacketLogger packetLogger2 = packetLogger;
        if (packetLogger2 != null) {
            packetLogger2.log(str, socketAddress, socketAddress2, bArr);
        }
    }

    public void cleanup() throws IOException {
        this.key.selector().close();
        this.key.channel().close();
    }
}