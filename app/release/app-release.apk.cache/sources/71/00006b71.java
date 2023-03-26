package org.xbill.DNS;

import com.p7700g.p99005.x1;
import java.net.DatagramSocket;
import java.net.Socket;

/* loaded from: classes4.dex */
public interface SocketDecorator {
    @x1
    DecorateInfo decorate(@x1 DatagramSocket datagramSocket);

    @x1
    DecorateInfo decorate(@x1 Socket socket);
}