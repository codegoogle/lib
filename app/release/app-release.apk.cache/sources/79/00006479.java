package com.p7700g.p99005;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JvmOkio.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/p7700g/p99005/ww5;", "Lcom/p7700g/p99005/qv5;", "Ljava/io/IOException;", "cause", "z", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lcom/p7700g/p99005/yq4;", "D", "()V", "Ljava/net/Socket;", "n", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class ww5 extends qv5 {
    private final Socket n;

    public ww5(@NotNull Socket socket) {
        c25.p(socket, "socket");
        this.n = socket;
    }

    @Override // com.p7700g.p99005.qv5
    public void D() {
        Logger logger;
        Logger logger2;
        try {
            this.n.close();
        } catch (AssertionError e) {
            if (jw5.k(e)) {
                logger2 = kw5.a;
                Level level = Level.WARNING;
                StringBuilder G = wo1.G("Failed to close timed out socket ");
                G.append(this.n);
                logger2.log(level, G.toString(), (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = kw5.a;
            Level level2 = Level.WARNING;
            StringBuilder G2 = wo1.G("Failed to close timed out socket ");
            G2.append(this.n);
            logger.log(level2, G2.toString(), (Throwable) e2);
        }
    }

    @Override // com.p7700g.p99005.qv5
    @NotNull
    public IOException z(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}