package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.b35;
import com.p7700g.p99005.es5;
import com.p7700g.p99005.lt5;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.xu0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Http2Connection.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Ã\u00012\u00020\u0001:\u0007Ä\u0001Å\u0001Æ\u0001\rB\u0015\b\u0000\u0012\b\u0010À\u0001\u001a\u00030¿\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u000bJ#\u0010\u001d\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010!\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010,\u001a\u00020(H\u0000¢\u0006\u0004\b-\u0010+J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0018H\u0000¢\u0006\u0004\b/\u00100J%\u00104\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u000e¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000e¢\u0006\u0004\b8\u00107J\r\u00109\u001a\u00020\u000e¢\u0006\u0004\b9\u00107J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u00107J\u0015\u0010;\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u00107J)\u0010A\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020(2\b\u0010@\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\bA\u0010BJ#\u0010F\u001a\u00020\u000e2\b\b\u0002\u0010C\u001a\u00020\u00072\b\b\u0002\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bF\u0010GJ\u0015\u0010J\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0018¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u000eH\u0000¢\u0006\u0004\bO\u00107J\u0017\u0010P\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\bP\u0010QJ%\u0010R\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bR\u0010SJ-\u0010U\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010T\u001a\u00020\u0007H\u0000¢\u0006\u0004\bU\u0010VJ/\u0010Y\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\u0007H\u0000¢\u0006\u0004\bY\u0010ZJ\u001f\u0010[\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b[\u0010+R\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020\\8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\"\u0010h\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010\u0012\"\u0004\bf\u0010gR\u0016\u0010k\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010q\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010KR\u001c\u0010v\u001a\u00020r8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\ba\u0010uR\u0019\u0010{\u001a\u00020w8\u0006@\u0006¢\u0006\f\n\u0004\ba\u0010x\u001a\u0004\by\u0010zR\u0016\u0010}\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010jR\u0016\u0010\u007f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010jR#\u0010\u0085\u0001\u001a\u00070\u0080\u0001R\u00020\u00008\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0089\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010d\u001a\u0005\b\u0087\u0001\u0010\u0012\"\u0005\b\u0088\u0001\u0010gR\u0018\u0010\u008b\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010jR\"\u0010\u0091\u0001\u001a\u00030\u008c\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0094\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010\u0093\u0001R(\u0010\u0098\u0001\u001a\u00020\u00182\u0007\u0010\u0095\u0001\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\b\u000f\u0010j\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u009b\u0001\u001a\u00020\u00182\u0007\u0010\u0095\u0001\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010j\u001a\u0006\b\u009a\u0001\u0010\u0097\u0001R.\u0010¡\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u009c\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010jR)\u0010¨\u0001\u001a\u00020\u00182\u0007\u0010\u0095\u0001\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¦\u0001\u0010j\u001a\u0006\b§\u0001\u0010\u0097\u0001R\u001a\u0010ª\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010\u0093\u0001R\u0017\u0010«\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010jR\u0019\u0010¬\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010\u0093\u0001R\u0019\u0010¯\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010®\u0001R\u0018\u0010±\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010jR\"\u0010¶\u0001\u001a\u00030²\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\u001c\u0010¹\u0001\u001a\u00020H8\u0006@\u0006¢\u0006\u000e\n\u0005\b·\u0001\u0010m\u001a\u0005\b¸\u0001\u0010oR)\u0010»\u0001\u001a\u00020\u00182\u0007\u0010\u0095\u0001\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010j\u001a\u0006\bº\u0001\u0010\u0097\u0001R \u0010¾\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b¼\u0001\u0010a\u001a\u0006\b\u0099\u0001\u0010½\u0001¨\u0006Ç\u0001"}, d2 = {"Lcom/p7700g/p99005/jt5;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lcom/p7700g/p99005/gt5;", "requestHeaders", "", "out", "Lcom/p7700g/p99005/mt5;", com.anythink.expressad.foundation.g.a.O, "(ILjava/util/List;Z)Lcom/p7700g/p99005/mt5;", "Ljava/io/IOException;", "e", "Lcom/p7700g/p99005/yq4;", "U", "(Ljava/io/IOException;)V", "f2", "()I", "id", "T1", "(I)Lcom/p7700g/p99005/mt5;", "streamId", "m2", "", "read", "x2", "(J)V", "k2", "e2", "(Ljava/util/List;Z)Lcom/p7700g/p99005/mt5;", "outFinished", "alternating", "z2", "(IZLjava/util/List;)V", "Lcom/p7700g/p99005/sv5;", "buffer", "byteCount", "y2", "(IZLcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/ft5;", IronSourceConstants.EVENTS_ERROR_CODE, "E2", "(ILcom/p7700g/p99005/ft5;)V", "statusCode", "D2", "unacknowledgedBytesRead", "F2", "(IJ)V", "reply", "payload1", "payload2", "B2", "(ZII)V", "C2", "()V", "A2", "K", "flush", "s2", "(Lcom/p7700g/p99005/ft5;)V", com.anythink.expressad.foundation.d.c.cd, "connectionCode", "streamCode", "cause", "P", "(Lcom/p7700g/p99005/ft5;Lcom/p7700g/p99005/ft5;Ljava/io/IOException;)V", "sendConnectionPreface", "Lcom/p7700g/p99005/fs5;", "taskRunner", qh3.x, "(ZLcom/p7700g/p99005/fs5;)V", "Lcom/p7700g/p99005/qt5;", "settings", "r2", "(Lcom/p7700g/p99005/qt5;)V", "nowNs", "c2", "(J)Z", com.anythink.expressad.d.a.b.X, "l2", "(I)Z", "i2", "(ILjava/util/List;)V", "inFinished", "h2", "(ILjava/util/List;Z)V", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "g2", "(ILcom/p7700g/p99005/uv5;IZ)V", "j2", "", "v0", "Ljava/util/Set;", "currentPushRequests", "F", "Z", "isShutdown", "E", AFHydra.STATUS_IDLE, "x0", com.anythink.core.common.g.c.U, "(I)V", "nextStreamId", "O", "J", "degradedPongsReceived", "T", "Lcom/p7700g/p99005/qt5;", "c1", "()Lcom/p7700g/p99005/qt5;", "q2", "peerSettings", "Lcom/p7700g/p99005/jt5$d;", bx.B4, "Lcom/p7700g/p99005/jt5$d;", "()Lcom/p7700g/p99005/jt5$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/p7700g/p99005/nt5;", "Lcom/p7700g/p99005/nt5;", "b2", "()Lcom/p7700g/p99005/nt5;", "writer", "M", "intervalPongsReceived", "Q", "awaitPongsReceived", "Lcom/p7700g/p99005/jt5$e;", "u0", "Lcom/p7700g/p99005/jt5$e;", "J1", "()Lcom/p7700g/p99005/jt5$e;", "readerRunnable", "D", "Y", "o2", "lastGoodStreamId", "L", "intervalPingsSent", "", "C", "Ljava/lang/String;", "X", "()Ljava/lang/String;", "connectionName", "Lcom/p7700g/p99005/es5;", "Lcom/p7700g/p99005/es5;", "pushQueue", "<set-?>", "D1", "()J", "readBytesTotal", bx.y4, "a2", "writeBytesTotal", "", AFHydra.EV_BYTECOUNT, "Ljava/util/Map;", "Y1", "()Ljava/util/Map;", "streams", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "Lcom/p7700g/p99005/fs5;", "N", "degradedPingsSent", bx.C4, com.anythink.expressad.foundation.g.a.N, "readBytesAcknowledged", "H", "writerQueue", "awaitPingsSent", "settingsListenerQueue", "Lcom/p7700g/p99005/pt5;", "Lcom/p7700g/p99005/pt5;", "pushObserver", "R", "degradedPongDeadlineNs", "Ljava/net/Socket;", "Ljava/net/Socket;", "K1", "()Ljava/net/Socket;", "socket", "S", "X0", "okHttpSettings", "Z1", "writeBytesMaximum", "z", "()Z", m31.a, "Lcom/p7700g/p99005/jt5$b;", "builder", "<init>", "(Lcom/p7700g/p99005/jt5$b;)V", "y", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class jt5 implements Closeable {
    public static final int s = 16777216;
    @NotNull
    private static final qt5 t;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 1000000000;
    public static final c y = new c(null);
    @NotNull
    private final d A;
    @NotNull
    private final Map<Integer, mt5> B;
    @NotNull
    private final String C;
    private int D;
    private int E;
    private boolean F;
    private final fs5 G;
    private final es5 H;
    private final es5 I;
    private final es5 J;
    private final pt5 K;
    private long L;
    private long M;
    private long N;
    private long O;
    private long P;
    private long Q;
    private long R;
    @NotNull
    private final qt5 S;
    @NotNull
    private qt5 T;
    private long U;
    private long V;
    private long W;
    private long X;
    @NotNull
    private final Socket Y;
    @NotNull
    private final nt5 Z;
    @NotNull
    private final e u0;
    private final Set<Integer> v0;
    private final boolean z;

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$a", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$c"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a extends cs5 {
        public final /* synthetic */ String e;
        public final /* synthetic */ jt5 f;
        public final /* synthetic */ long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, jt5 jt5Var, long j) {
            super(str2, false, 2, null);
            this.e = str;
            this.f = jt5Var;
            this.g = j;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            boolean z;
            synchronized (this.f) {
                if (this.f.M < this.f.L) {
                    z = true;
                } else {
                    this.f.L++;
                    z = false;
                }
            }
            if (z) {
                this.f.U(null);
                return -1L;
            }
            this.f.B2(false, 1, 0);
            return this.g;
        }
    }

    /* compiled from: Http2Connection.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010)\u001a\u00020#\u0012\u0006\u0010>\u001a\u000209¢\u0006\u0004\bL\u0010MJ5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&\"\u0004\b'\u0010(R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001a\u00100\u001a\u0004\b$\u00101\"\u0004\b2\u00103R\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b*\u00106\"\u0004\b7\u00108R\u001c\u0010>\u001a\u0002098\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b?\u0010A\"\u0004\bB\u0010CR\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b,\u0010D\u001a\u0004\b4\u0010E\"\u0004\bF\u0010GR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001e\u0010H\u001a\u0004\b:\u0010I\"\u0004\bJ\u0010K¨\u0006N"}, d2 = {"com/p7700g/p99005/jt5$b", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "Lcom/p7700g/p99005/tv5;", "sink", "Lcom/p7700g/p99005/jt5$b;", "y", "(Ljava/net/Socket;Ljava/lang/String;Lcom/p7700g/p99005/uv5;Lcom/p7700g/p99005/tv5;)Lcom/p7700g/p99005/jt5$b;", "Lcom/p7700g/p99005/jt5$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "k", "(Lcom/p7700g/p99005/jt5$d;)Lcom/p7700g/p99005/jt5$b;", "Lcom/p7700g/p99005/pt5;", "pushObserver", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/pt5;)Lcom/p7700g/p99005/jt5$b;", "", "pingIntervalMillis", "l", "(I)Lcom/p7700g/p99005/jt5$b;", "Lcom/p7700g/p99005/jt5;", "a", "()Lcom/p7700g/p99005/jt5;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", ij3.b, "(Ljava/lang/String;)V", "connectionName", "", "h", "Z", "()Z", "n", "(Z)V", m31.a, "e", "Lcom/p7700g/p99005/jt5$d;", "d", "()Lcom/p7700g/p99005/jt5$d;", "p", "(Lcom/p7700g/p99005/jt5$d;)V", "Ljava/net/Socket;", "()Ljava/net/Socket;", "t", "(Ljava/net/Socket;)V", com.anythink.basead.d.g.i, AFHydra.STATUS_IDLE, "()I", "q", "(I)V", "Lcom/p7700g/p99005/fs5;", "i", "Lcom/p7700g/p99005/fs5;", "j", "()Lcom/p7700g/p99005/fs5;", "taskRunner", "f", "Lcom/p7700g/p99005/pt5;", "()Lcom/p7700g/p99005/pt5;", "r", "(Lcom/p7700g/p99005/pt5;)V", "Lcom/p7700g/p99005/tv5;", "()Lcom/p7700g/p99005/tv5;", "s", "(Lcom/p7700g/p99005/tv5;)V", "Lcom/p7700g/p99005/uv5;", "()Lcom/p7700g/p99005/uv5;", "u", "(Lcom/p7700g/p99005/uv5;)V", "<init>", "(ZLcom/p7700g/p99005/fs5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public Socket a;
        @NotNull
        public String b;
        @NotNull
        public uv5 c;
        @NotNull
        public tv5 d;
        @NotNull
        private d e;
        @NotNull
        private pt5 f;
        private int g;
        private boolean h;
        @NotNull
        private final fs5 i;

        public b(boolean z, @NotNull fs5 fs5Var) {
            c25.p(fs5Var, "taskRunner");
            this.h = z;
            this.i = fs5Var;
            this.e = d.a;
            this.f = pt5.a;
        }

        public static /* synthetic */ b z(b bVar, Socket socket, String str, uv5 uv5Var, tv5 tv5Var, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = sr5.O(socket);
            }
            if ((i & 4) != 0) {
                uv5Var = jw5.d(jw5.t(socket));
            }
            if ((i & 8) != 0) {
                tv5Var = jw5.c(jw5.o(socket));
            }
            return bVar.y(socket, str, uv5Var, tv5Var);
        }

        @NotNull
        public final jt5 a() {
            return new jt5(this);
        }

        public final boolean b() {
            return this.h;
        }

        @NotNull
        public final String c() {
            String str = this.b;
            if (str == null) {
                c25.S("connectionName");
            }
            return str;
        }

        @NotNull
        public final d d() {
            return this.e;
        }

        public final int e() {
            return this.g;
        }

        @NotNull
        public final pt5 f() {
            return this.f;
        }

        @NotNull
        public final tv5 g() {
            tv5 tv5Var = this.d;
            if (tv5Var == null) {
                c25.S("sink");
            }
            return tv5Var;
        }

        @NotNull
        public final Socket h() {
            Socket socket = this.a;
            if (socket == null) {
                c25.S("socket");
            }
            return socket;
        }

        @NotNull
        public final uv5 i() {
            uv5 uv5Var = this.c;
            if (uv5Var == null) {
                c25.S(rs2.f.b);
            }
            return uv5Var;
        }

        @NotNull
        public final fs5 j() {
            return this.i;
        }

        @NotNull
        public final b k(@NotNull d dVar) {
            c25.p(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.e = dVar;
            return this;
        }

        @NotNull
        public final b l(int i) {
            this.g = i;
            return this;
        }

        @NotNull
        public final b m(@NotNull pt5 pt5Var) {
            c25.p(pt5Var, "pushObserver");
            this.f = pt5Var;
            return this;
        }

        public final void n(boolean z) {
            this.h = z;
        }

        public final void o(@NotNull String str) {
            c25.p(str, "<set-?>");
            this.b = str;
        }

        public final void p(@NotNull d dVar) {
            c25.p(dVar, "<set-?>");
            this.e = dVar;
        }

        public final void q(int i) {
            this.g = i;
        }

        public final void r(@NotNull pt5 pt5Var) {
            c25.p(pt5Var, "<set-?>");
            this.f = pt5Var;
        }

        public final void s(@NotNull tv5 tv5Var) {
            c25.p(tv5Var, "<set-?>");
            this.d = tv5Var;
        }

        public final void t(@NotNull Socket socket) {
            c25.p(socket, "<set-?>");
            this.a = socket;
        }

        public final void u(@NotNull uv5 uv5Var) {
            c25.p(uv5Var, "<set-?>");
            this.c = uv5Var;
        }

        @gz4
        @NotNull
        public final b v(@NotNull Socket socket) throws IOException {
            return z(this, socket, null, null, null, 14, null);
        }

        @gz4
        @NotNull
        public final b w(@NotNull Socket socket, @NotNull String str) throws IOException {
            return z(this, socket, str, null, null, 12, null);
        }

        @gz4
        @NotNull
        public final b x(@NotNull Socket socket, @NotNull String str, @NotNull uv5 uv5Var) throws IOException {
            return z(this, socket, str, uv5Var, null, 8, null);
        }

        @gz4
        @NotNull
        public final b y(@NotNull Socket socket, @NotNull String str, @NotNull uv5 uv5Var, @NotNull tv5 tv5Var) throws IOException {
            String t;
            c25.p(socket, "socket");
            c25.p(str, "peerName");
            c25.p(uv5Var, rs2.f.b);
            c25.p(tv5Var, "sink");
            this.a = socket;
            if (this.h) {
                t = sr5.i + gl4.R + str;
            } else {
                t = wo1.t("MockWebServer ", str);
            }
            this.b = t;
            this.c = uv5Var;
            this.d = tv5Var;
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"com/p7700g/p99005/jt5$c", "", "Lcom/p7700g/p99005/qt5;", "DEFAULT_SETTINGS", "Lcom/p7700g/p99005/qt5;", "a", "()Lcom/p7700g/p99005/qt5;", "", "AWAIT_PING", AFHydra.STATUS_IDLE, "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        @NotNull
        public final qt5 a() {
            return jt5.t;
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Connection.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"com/p7700g/p99005/jt5$d", "", "Lcom/p7700g/p99005/mt5;", "stream", "Lcom/p7700g/p99005/yq4;", "f", "(Lcom/p7700g/p99005/mt5;)V", "Lcom/p7700g/p99005/jt5;", "connection", "Lcom/p7700g/p99005/qt5;", "settings", "e", "(Lcom/p7700g/p99005/jt5;Lcom/p7700g/p99005/qt5;)V", "<init>", "()V", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static abstract class d {
        public static final b b = new b(null);
        @cz4
        @NotNull
        public static final d a = new a();

        /* compiled from: Http2Connection.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/jt5$d$a", "Lcom/p7700g/p99005/jt5$d;", "Lcom/p7700g/p99005/mt5;", "stream", "Lcom/p7700g/p99005/yq4;", "f", "(Lcom/p7700g/p99005/mt5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a extends d {
            @Override // com.p7700g.p99005.jt5.d
            public void f(@NotNull mt5 mt5Var) throws IOException {
                c25.p(mt5Var, "stream");
                mt5Var.d(ft5.REFUSED_STREAM, null);
            }
        }

        /* compiled from: Http2Connection.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/jt5$d$b", "", "Lcom/p7700g/p99005/jt5$d;", "REFUSE_INCOMING_STREAMS", "Lcom/p7700g/p99005/jt5$d;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void e(@NotNull jt5 jt5Var, @NotNull qt5 qt5Var) {
            c25.p(jt5Var, "connection");
            c25.p(qt5Var, "settings");
        }

        public abstract void f(@NotNull mt5 mt5Var) throws IOException;
    }

    /* compiled from: Http2Connection.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010C\u001a\u00020?¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J'\u0010#\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J/\u00101\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u00102J-\u00105\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b5\u00106J?\u0010=\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020*H\u0016¢\u0006\u0004\b=\u0010>R\u001c\u0010C\u001a\u00020?8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010B¨\u0006F"}, d2 = {"com/p7700g/p99005/jt5$e", "Lcom/p7700g/p99005/lt5$c;", "Lkotlin/Function0;", "Lcom/p7700g/p99005/yq4;", "u", "()V", "", "inFinished", "", "streamId", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "length", "l", "(ZILcom/p7700g/p99005/uv5;I)V", "associatedStreamId", "", "Lcom/p7700g/p99005/gt5;", "headerBlock", "h", "(ZIILjava/util/List;)V", "Lcom/p7700g/p99005/ft5;", IronSourceConstants.EVENTS_ERROR_CODE, ij3.b, "(ILcom/p7700g/p99005/ft5;)V", "clearPrevious", "Lcom/p7700g/p99005/qt5;", "settings", "b", "(ZLcom/p7700g/p99005/qt5;)V", "r", "a", "ack", "payload1", "payload2", com.anythink.expressad.d.a.b.dH, "(ZII)V", "lastGoodStreamId", "Lcom/p7700g/p99005/vv5;", "debugData", "q", "(ILcom/p7700g/p99005/ft5;Lcom/p7700g/p99005/vv5;)V", "", "windowSizeIncrement", "j", "(IJ)V", "streamDependency", "weight", "exclusive", "n", "(IIIZ)V", "promisedStreamId", "requestHeaders", "p", "(IILjava/util/List;)V", "", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, xu0.f.m, "host", "port", "maxAge", "k", "(ILjava/lang/String;Lcom/p7700g/p99005/vv5;Ljava/lang/String;IJ)V", "Lcom/p7700g/p99005/lt5;", "s", "Lcom/p7700g/p99005/lt5;", "()Lcom/p7700g/p99005/lt5;", "reader", "<init>", "(Lcom/p7700g/p99005/jt5;Lcom/p7700g/p99005/lt5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class e implements lt5.c, uz4<yq4> {
        @NotNull
        private final lt5 s;
        public final /* synthetic */ jt5 t;

        /* compiled from: TaskQueue.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$e$a", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$synchronized$lambda$1"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a extends cs5 {
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ e g;
            public final /* synthetic */ b35.h h;
            public final /* synthetic */ boolean i;
            public final /* synthetic */ qt5 j;
            public final /* synthetic */ b35.g k;
            public final /* synthetic */ b35.h l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, e eVar, b35.h hVar, boolean z3, qt5 qt5Var, b35.g gVar, b35.h hVar2) {
                super(str2, z2);
                this.e = str;
                this.f = z;
                this.g = eVar;
                this.h = hVar;
                this.i = z3;
                this.j = qt5Var;
                this.k = gVar;
                this.l = hVar2;
            }

            @Override // com.p7700g.p99005.cs5
            public long f() {
                this.g.t.Z().e(this.g.t, (qt5) this.h.s);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$e$b", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "okhttp3/internal/http2/Http2Connection$ReaderRunnable$$special$$inlined$execute$1"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class b extends cs5 {
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ mt5 g;
            public final /* synthetic */ e h;
            public final /* synthetic */ mt5 i;
            public final /* synthetic */ int j;
            public final /* synthetic */ List k;
            public final /* synthetic */ boolean l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, String str2, boolean z2, mt5 mt5Var, e eVar, mt5 mt5Var2, int i, List list, boolean z3) {
                super(str2, z2);
                this.e = str;
                this.f = z;
                this.g = mt5Var;
                this.h = eVar;
                this.i = mt5Var2;
                this.j = i;
                this.k = list;
                this.l = z3;
            }

            @Override // com.p7700g.p99005.cs5
            public long f() {
                try {
                    this.h.t.Z().f(this.g);
                    return -1L;
                } catch (IOException e) {
                    au5 g = au5.e.g();
                    StringBuilder G = wo1.G("Http2Connection.Listener failure for ");
                    G.append(this.h.t.X());
                    g.m(G.toString(), 4, e);
                    try {
                        this.g.d(ft5.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* compiled from: TaskQueue.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$e$c", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class c extends cs5 {
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ e g;
            public final /* synthetic */ int h;
            public final /* synthetic */ int i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, String str2, boolean z2, e eVar, int i, int i2) {
                super(str2, z2);
                this.e = str;
                this.f = z;
                this.g = eVar;
                this.h = i;
                this.i = i2;
            }

            @Override // com.p7700g.p99005.cs5
            public long f() {
                this.g.t.B2(true, this.h, this.i);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$e$d", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class d extends cs5 {
            public final /* synthetic */ String e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ e g;
            public final /* synthetic */ boolean h;
            public final /* synthetic */ qt5 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, boolean z, String str2, boolean z2, e eVar, boolean z3, qt5 qt5Var) {
                super(str2, z2);
                this.e = str;
                this.f = z;
                this.g = eVar;
                this.h = z3;
                this.i = qt5Var;
            }

            @Override // com.p7700g.p99005.cs5
            public long f() {
                this.g.r(this.h, this.i);
                return -1L;
            }
        }

        public e(@NotNull jt5 jt5Var, lt5 lt5Var) {
            c25.p(lt5Var, "reader");
            this.t = jt5Var;
            this.s = lt5Var;
        }

        @Override // com.p7700g.p99005.lt5.c
        public void a() {
        }

        @Override // com.p7700g.p99005.lt5.c
        public void b(boolean z, @NotNull qt5 qt5Var) {
            c25.p(qt5Var, "settings");
            String str = this.t.X() + " applyAndAckSettings";
            this.t.H.n(new d(str, true, str, true, this, z, qt5Var), 0L);
        }

        @Override // com.p7700g.p99005.lt5.c
        public void h(boolean z, int i, int i2, @NotNull List<gt5> list) {
            c25.p(list, "headerBlock");
            if (this.t.l2(i)) {
                this.t.h2(i, list, z);
                return;
            }
            synchronized (this.t) {
                mt5 T1 = this.t.T1(i);
                if (T1 == null) {
                    if (this.t.F) {
                        return;
                    }
                    if (i <= this.t.Y()) {
                        return;
                    }
                    if (i % 2 == this.t.x0() % 2) {
                        return;
                    }
                    mt5 mt5Var = new mt5(i, this.t, false, z, sr5.X(list));
                    this.t.o2(i);
                    this.t.Y1().put(Integer.valueOf(i), mt5Var);
                    String str = this.t.X() + f14.u + i + "] onStream";
                    this.t.G.j().n(new b(str, true, str, true, mt5Var, this, T1, i, list, z), 0L);
                    return;
                }
                yq4 yq4Var = yq4.a;
                T1.z(sr5.X(list), z);
            }
        }

        @Override // com.p7700g.p99005.lt5.c
        public void j(int i, long j) {
            if (i == 0) {
                synchronized (this.t) {
                    jt5 jt5Var = this.t;
                    jt5Var.X = jt5Var.Z1() + j;
                    jt5 jt5Var2 = this.t;
                    if (jt5Var2 != null) {
                        jt5Var2.notifyAll();
                        yq4 yq4Var = yq4.a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            mt5 T1 = this.t.T1(i);
            if (T1 != null) {
                synchronized (T1) {
                    T1.a(j);
                    yq4 yq4Var2 = yq4.a;
                }
            }
        }

        @Override // com.p7700g.p99005.lt5.c
        public void k(int i, @NotNull String str, @NotNull vv5 vv5Var, @NotNull String str2, int i2, long j) {
            c25.p(str, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            c25.p(vv5Var, xu0.f.m);
            c25.p(str2, "host");
        }

        @Override // com.p7700g.p99005.lt5.c
        public void l(boolean z, int i, @NotNull uv5 uv5Var, int i2) throws IOException {
            c25.p(uv5Var, rs2.f.b);
            if (this.t.l2(i)) {
                this.t.g2(i, uv5Var, i2, z);
                return;
            }
            mt5 T1 = this.t.T1(i);
            if (T1 == null) {
                this.t.E2(i, ft5.PROTOCOL_ERROR);
                long j = i2;
                this.t.x2(j);
                uv5Var.skip(j);
                return;
            }
            T1.y(uv5Var, i2);
            if (z) {
                T1.z(sr5.b, true);
            }
        }

        @Override // com.p7700g.p99005.lt5.c
        public void m(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.t) {
                    if (i == 1) {
                        this.t.M++;
                    } else if (i != 2) {
                        if (i == 3) {
                            this.t.Q++;
                            jt5 jt5Var = this.t;
                            if (jt5Var == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            jt5Var.notifyAll();
                        }
                        yq4 yq4Var = yq4.a;
                    } else {
                        this.t.O++;
                    }
                }
                return;
            }
            String str = this.t.X() + " ping";
            this.t.H.n(new c(str, true, str, true, this, i, i2), 0L);
        }

        @Override // com.p7700g.p99005.lt5.c
        public void n(int i, int i2, int i3, boolean z) {
        }

        @Override // com.p7700g.p99005.lt5.c
        public void o(int i, @NotNull ft5 ft5Var) {
            c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
            if (this.t.l2(i)) {
                this.t.j2(i, ft5Var);
                return;
            }
            mt5 m2 = this.t.m2(i);
            if (m2 != null) {
                m2.A(ft5Var);
            }
        }

        @Override // com.p7700g.p99005.lt5.c
        public void p(int i, int i2, @NotNull List<gt5> list) {
            c25.p(list, "requestHeaders");
            this.t.i2(i2, list);
        }

        @Override // com.p7700g.p99005.lt5.c
        public void q(int i, @NotNull ft5 ft5Var, @NotNull vv5 vv5Var) {
            int i2;
            mt5[] mt5VarArr;
            c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
            c25.p(vv5Var, "debugData");
            vv5Var.C3();
            synchronized (this.t) {
                Object[] array = this.t.Y1().values().toArray(new mt5[0]);
                if (array != null) {
                    mt5VarArr = (mt5[]) array;
                    this.t.F = true;
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (mt5 mt5Var : mt5VarArr) {
                if (mt5Var.k() > i && mt5Var.v()) {
                    mt5Var.A(ft5.REFUSED_STREAM);
                    this.t.m2(mt5Var.k());
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:6|7|(1:9)(1:54)|10|(2:15|(10:17|18|19|20|21|22|23|24|25|26)(2:51|52))|53|18|19|20|21|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00d8, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00d9, code lost:
            r21.t.U(r0);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void r(boolean z, @NotNull qt5 qt5Var) {
            jt5 jt5Var;
            T t;
            long e;
            T t2;
            c25.p(qt5Var, "settings");
            b35.g gVar = new b35.g();
            b35.h hVar = new b35.h();
            b35.h hVar2 = new b35.h();
            synchronized (this.t.b2()) {
                jt5 jt5Var2 = this.t;
                synchronized (jt5Var2) {
                    try {
                        qt5 c1 = this.t.c1();
                        if (z) {
                            t = qt5Var;
                        } else {
                            qt5 qt5Var2 = new qt5();
                            qt5Var2.j(c1);
                            qt5Var2.j(qt5Var);
                            yq4 yq4Var = yq4.a;
                            t = qt5Var2;
                        }
                        hVar2.s = t;
                        e = ((qt5) t).e() - c1.e();
                        gVar.s = e;
                    } catch (Throwable th) {
                        th = th;
                        jt5Var = jt5Var2;
                    }
                    try {
                        if (e != 0 && !this.t.Y1().isEmpty()) {
                            Object[] array = this.t.Y1().values().toArray(new mt5[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            t2 = (mt5[]) array;
                            hVar.s = t2;
                            this.t.q2((qt5) hVar2.s);
                            String str = this.t.X() + " onSettings";
                            jt5Var = jt5Var2;
                            this.t.J.n(new a(str, true, str, true, this, hVar2, z, qt5Var, gVar, hVar), 0L);
                            yq4 yq4Var2 = yq4.a;
                            this.t.b2().a((qt5) hVar2.s);
                            yq4 yq4Var3 = yq4.a;
                        }
                        this.t.J.n(new a(str, true, str, true, this, hVar2, z, qt5Var, gVar, hVar), 0L);
                        yq4 yq4Var22 = yq4.a;
                        this.t.b2().a((qt5) hVar2.s);
                        yq4 yq4Var32 = yq4.a;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                    t2 = 0;
                    hVar.s = t2;
                    this.t.q2((qt5) hVar2.s);
                    String str2 = this.t.X() + " onSettings";
                    jt5Var = jt5Var2;
                }
            }
            T t3 = hVar.s;
            if (((mt5[]) t3) != null) {
                mt5[] mt5VarArr = (mt5[]) t3;
                c25.m(mt5VarArr);
                for (mt5 mt5Var : mt5VarArr) {
                    synchronized (mt5Var) {
                        mt5Var.a(gVar.s);
                        yq4 yq4Var4 = yq4.a;
                    }
                }
            }
        }

        @NotNull
        public final lt5 s() {
            return this.s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.p7700g.p99005.ft5] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.p7700g.p99005.lt5, java.io.Closeable] */
        public void u() {
            ft5 ft5Var;
            ft5 ft5Var2;
            ft5 ft5Var3 = ft5.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.s.d(this);
                    while (this.s.b(false, this)) {
                    }
                    ft5Var2 = ft5.NO_ERROR;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    ft5Var = ft5Var3;
                    this.t.P(ft5Var, ft5Var3, e);
                    sr5.l(this.s);
                    throw th;
                }
                try {
                    this.t.P(ft5Var2, ft5.CANCEL, null);
                    ft5Var = ft5Var2;
                } catch (IOException e3) {
                    e = e3;
                    ft5 ft5Var4 = ft5.PROTOCOL_ERROR;
                    jt5 jt5Var = this.t;
                    jt5Var.P(ft5Var4, ft5Var4, e);
                    ft5Var = jt5Var;
                    ft5Var3 = this.s;
                    sr5.l(ft5Var3);
                }
                ft5Var3 = this.s;
                sr5.l(ft5Var3);
            } catch (Throwable th2) {
                th = th2;
                this.t.P(ft5Var, ft5Var3, e);
                sr5.l(this.s);
                throw th;
            }
        }

        @Override // com.p7700g.p99005.uz4
        public /* bridge */ /* synthetic */ yq4 x() {
            u();
            return yq4.a;
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$f", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class f extends cs5 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ jt5 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ sv5 i;
        public final /* synthetic */ int j;
        public final /* synthetic */ boolean k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, String str2, boolean z2, jt5 jt5Var, int i, sv5 sv5Var, int i2, boolean z3) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = jt5Var;
            this.h = i;
            this.i = sv5Var;
            this.j = i2;
            this.k = z3;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            try {
                boolean d = this.g.K.d(this.h, this.i, this.j, this.k);
                if (d) {
                    this.g.b2().r(this.h, ft5.CANCEL);
                }
                if (d || this.k) {
                    synchronized (this.g) {
                        this.g.v0.remove(Integer.valueOf(this.h));
                    }
                    return -1L;
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$g", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class g extends cs5 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ jt5 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ List i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z, String str2, boolean z2, jt5 jt5Var, int i, List list, boolean z3) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = jt5Var;
            this.h = i;
            this.i = list;
            this.j = z3;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            boolean b = this.g.K.b(this.h, this.i, this.j);
            if (b) {
                try {
                    this.g.b2().r(this.h, ft5.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (b || this.j) {
                synchronized (this.g) {
                    this.g.v0.remove(Integer.valueOf(this.h));
                }
                return -1L;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$h", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class h extends cs5 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ jt5 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ List i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z, String str2, boolean z2, jt5 jt5Var, int i, List list) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = jt5Var;
            this.h = i;
            this.i = list;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            if (this.g.K.a(this.h, this.i)) {
                try {
                    this.g.b2().r(this.h, ft5.CANCEL);
                    synchronized (this.g) {
                        this.g.v0.remove(Integer.valueOf(this.h));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$i", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class i extends cs5 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ jt5 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ ft5 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z, String str2, boolean z2, jt5 jt5Var, int i, ft5 ft5Var) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = jt5Var;
            this.h = i;
            this.i = ft5Var;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            this.g.K.c(this.h, this.i);
            synchronized (this.g) {
                this.g.v0.remove(Integer.valueOf(this.h));
                yq4 yq4Var = yq4.a;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$j", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class j extends cs5 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ jt5 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, boolean z, String str2, boolean z2, jt5 jt5Var) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = jt5Var;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            this.g.B2(false, 2, 0);
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$k", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class k extends cs5 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ jt5 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ ft5 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z, String str2, boolean z2, jt5 jt5Var, int i, ft5 ft5Var) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = jt5Var;
            this.h = i;
            this.i = ft5Var;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            try {
                this.g.D2(this.h, this.i);
                return -1L;
            } catch (IOException e) {
                this.g.U(e);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0006"}, d2 = {"com/p7700g/p99005/jt5$l", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp", "com/p7700g/p99005/es5$b"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class l extends cs5 {
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ jt5 g;
        public final /* synthetic */ int h;
        public final /* synthetic */ long i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z, String str2, boolean z2, jt5 jt5Var, int i, long j) {
            super(str2, z2);
            this.e = str;
            this.f = z;
            this.g = jt5Var;
            this.h = i;
            this.i = j;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            try {
                this.g.b2().v(this.h, this.i);
                return -1L;
            } catch (IOException e) {
                this.g.U(e);
                return -1L;
            }
        }
    }

    static {
        qt5 qt5Var = new qt5();
        qt5Var.k(7, 65535);
        qt5Var.k(5, 16384);
        t = qt5Var;
    }

    public jt5(@NotNull b bVar) {
        c25.p(bVar, "builder");
        boolean b2 = bVar.b();
        this.z = b2;
        this.A = bVar.d();
        this.B = new LinkedHashMap();
        String c2 = bVar.c();
        this.C = c2;
        this.E = bVar.b() ? 3 : 2;
        fs5 j2 = bVar.j();
        this.G = j2;
        es5 j3 = j2.j();
        this.H = j3;
        this.I = j2.j();
        this.J = j2.j();
        this.K = bVar.f();
        qt5 qt5Var = new qt5();
        if (bVar.b()) {
            qt5Var.k(7, 16777216);
        }
        yq4 yq4Var = yq4.a;
        this.S = qt5Var;
        qt5 qt5Var2 = t;
        this.T = qt5Var2;
        this.X = qt5Var2.e();
        this.Y = bVar.h();
        this.Z = new nt5(bVar.g(), b2);
        this.u0 = new e(this, new lt5(bVar.i(), b2));
        this.v0 = new LinkedHashSet();
        if (bVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(bVar.e());
            String t2 = wo1.t(c2, " ping");
            j3.n(new a(t2, t2, this, nanos), nanos);
        }
    }

    public final void U(IOException iOException) {
        ft5 ft5Var = ft5.PROTOCOL_ERROR;
        P(ft5Var, ft5Var, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0048 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:48:0x0006, B:67:0x0053, B:69:0x0056, B:70:0x005c, B:72:0x0061, B:77:0x006f, B:78:0x007a, B:49:0x0007, B:51:0x000e, B:52:0x0013, B:54:0x0017, B:56:0x002a, B:58:0x0032, B:63:0x0042, B:65:0x0048, B:66:0x0051, B:79:0x007b, B:80:0x0080), top: B:87:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final mt5 d2(int i2, List<gt5> list, boolean z) throws IOException {
        int i3;
        mt5 mt5Var;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.Z) {
            synchronized (this) {
                if (this.E > 1073741823) {
                    s2(ft5.REFUSED_STREAM);
                }
                if (!this.F) {
                    i3 = this.E;
                    this.E = i3 + 2;
                    mt5Var = new mt5(i3, this, z3, false, null);
                    if (z && this.W < this.X && mt5Var.t() < mt5Var.s()) {
                        z2 = false;
                        if (mt5Var.w()) {
                            this.B.put(Integer.valueOf(i3), mt5Var);
                        }
                        yq4 yq4Var = yq4.a;
                    }
                    z2 = true;
                    if (mt5Var.w()) {
                    }
                    yq4 yq4Var2 = yq4.a;
                } else {
                    throw new et5();
                }
            }
            if (i2 == 0) {
                this.Z.k(z3, i3, list);
            } else if (true ^ this.z) {
                this.Z.q(i2, i3, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
            }
        }
        if (z2) {
            this.Z.flush();
        }
        return mt5Var;
    }

    public static /* synthetic */ void w2(jt5 jt5Var, boolean z, fs5 fs5Var, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            fs5Var = fs5.a;
        }
        jt5Var.v2(z, fs5Var);
    }

    public final void A2() throws InterruptedException {
        synchronized (this) {
            this.P++;
        }
        B2(false, 3, 1330343787);
    }

    public final void B2(boolean z, int i2, int i3) {
        try {
            this.Z.m(z, i2, i3);
        } catch (IOException e2) {
            U(e2);
        }
    }

    public final void C2() throws InterruptedException {
        A2();
        K();
    }

    public final long D1() {
        return this.U;
    }

    public final void D2(int i2, @NotNull ft5 ft5Var) throws IOException {
        c25.p(ft5Var, "statusCode");
        this.Z.r(i2, ft5Var);
    }

    public final void E2(int i2, @NotNull ft5 ft5Var) {
        c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
        String str = this.C + f14.u + i2 + "] writeSynReset";
        this.H.n(new k(str, true, str, true, this, i2, ft5Var), 0L);
    }

    public final void F2(int i2, long j2) {
        String str = this.C + f14.u + i2 + "] windowUpdate";
        this.H.n(new l(str, true, str, true, this, i2, j2), 0L);
    }

    @NotNull
    public final e J1() {
        return this.u0;
    }

    public final synchronized void K() throws InterruptedException {
        while (this.Q < this.P) {
            wait();
        }
    }

    @NotNull
    public final Socket K1() {
        return this.Y;
    }

    public final void P(@NotNull ft5 ft5Var, @NotNull ft5 ft5Var2, @Nullable IOException iOException) {
        int i2;
        c25.p(ft5Var, "connectionCode");
        c25.p(ft5Var2, "streamCode");
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        try {
            s2(ft5Var);
        } catch (IOException unused) {
        }
        mt5[] mt5VarArr = null;
        synchronized (this) {
            if (!this.B.isEmpty()) {
                Object[] array = this.B.values().toArray(new mt5[0]);
                if (array != null) {
                    mt5VarArr = (mt5[]) array;
                    this.B.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            yq4 yq4Var = yq4.a;
        }
        if (mt5VarArr != null) {
            for (mt5 mt5Var : mt5VarArr) {
                try {
                    mt5Var.d(ft5Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.Z.close();
        } catch (IOException unused3) {
        }
        try {
            this.Y.close();
        } catch (IOException unused4) {
        }
        this.H.u();
        this.I.u();
        this.J.u();
    }

    @Nullable
    public final synchronized mt5 T1(int i2) {
        return this.B.get(Integer.valueOf(i2));
    }

    public final boolean W() {
        return this.z;
    }

    @NotNull
    public final String X() {
        return this.C;
    }

    @NotNull
    public final qt5 X0() {
        return this.S;
    }

    public final int Y() {
        return this.D;
    }

    @NotNull
    public final Map<Integer, mt5> Y1() {
        return this.B;
    }

    @NotNull
    public final d Z() {
        return this.A;
    }

    public final long Z1() {
        return this.X;
    }

    public final long a2() {
        return this.W;
    }

    @NotNull
    public final nt5 b2() {
        return this.Z;
    }

    @NotNull
    public final qt5 c1() {
        return this.T;
    }

    public final synchronized boolean c2(long j2) {
        if (this.F) {
            return false;
        }
        if (this.O < this.N) {
            if (j2 >= this.R) {
                return false;
            }
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        P(ft5.NO_ERROR, ft5.CANCEL, null);
    }

    public final long d1() {
        return this.V;
    }

    @NotNull
    public final mt5 e2(@NotNull List<gt5> list, boolean z) throws IOException {
        c25.p(list, "requestHeaders");
        return d2(0, list, z);
    }

    public final synchronized int f2() {
        return this.B.size();
    }

    public final void flush() throws IOException {
        this.Z.flush();
    }

    public final void g2(int i2, @NotNull uv5 uv5Var, int i3, boolean z) throws IOException {
        c25.p(uv5Var, rs2.f.b);
        sv5 sv5Var = new sv5();
        long j2 = i3;
        uv5Var.P1(j2);
        uv5Var.read(sv5Var, j2);
        String str = this.C + f14.u + i2 + "] onData";
        this.I.n(new f(str, true, str, true, this, i2, sv5Var, i3, z), 0L);
    }

    public final void h2(int i2, @NotNull List<gt5> list, boolean z) {
        c25.p(list, "requestHeaders");
        String str = this.C + f14.u + i2 + "] onHeaders";
        this.I.n(new g(str, true, str, true, this, i2, list, z), 0L);
    }

    public final void i2(int i2, @NotNull List<gt5> list) {
        c25.p(list, "requestHeaders");
        synchronized (this) {
            if (this.v0.contains(Integer.valueOf(i2))) {
                E2(i2, ft5.PROTOCOL_ERROR);
                return;
            }
            this.v0.add(Integer.valueOf(i2));
            String str = this.C + f14.u + i2 + "] onRequest";
            this.I.n(new h(str, true, str, true, this, i2, list), 0L);
        }
    }

    public final void j2(int i2, @NotNull ft5 ft5Var) {
        c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
        String str = this.C + f14.u + i2 + "] onReset";
        this.I.n(new i(str, true, str, true, this, i2, ft5Var), 0L);
    }

    @NotNull
    public final mt5 k2(int i2, @NotNull List<gt5> list, boolean z) throws IOException {
        c25.p(list, "requestHeaders");
        if (!this.z) {
            return d2(i2, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean l2(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    @Nullable
    public final synchronized mt5 m2(int i2) {
        mt5 remove;
        remove = this.B.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public final void n2() {
        synchronized (this) {
            long j2 = this.O;
            long j3 = this.N;
            if (j2 < j3) {
                return;
            }
            this.N = j3 + 1;
            this.R = System.nanoTime() + 1000000000;
            yq4 yq4Var = yq4.a;
            es5 es5Var = this.H;
            String C = wo1.C(new StringBuilder(), this.C, " ping");
            es5Var.n(new j(C, true, C, true, this), 0L);
        }
    }

    public final void o2(int i2) {
        this.D = i2;
    }

    public final void p2(int i2) {
        this.E = i2;
    }

    public final void q2(@NotNull qt5 qt5Var) {
        c25.p(qt5Var, "<set-?>");
        this.T = qt5Var;
    }

    public final void r2(@NotNull qt5 qt5Var) throws IOException {
        c25.p(qt5Var, "settings");
        synchronized (this.Z) {
            synchronized (this) {
                if (!this.F) {
                    this.S.j(qt5Var);
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new et5();
                }
            }
            this.Z.s(qt5Var);
        }
    }

    public final void s2(@NotNull ft5 ft5Var) throws IOException {
        c25.p(ft5Var, "statusCode");
        synchronized (this.Z) {
            synchronized (this) {
                if (this.F) {
                    return;
                }
                this.F = true;
                int i2 = this.D;
                yq4 yq4Var = yq4.a;
                this.Z.j(i2, ft5Var, sr5.a);
            }
        }
    }

    @gz4
    public final void t2() throws IOException {
        w2(this, false, null, 3, null);
    }

    @gz4
    public final void u2(boolean z) throws IOException {
        w2(this, z, null, 2, null);
    }

    @gz4
    public final void v2(boolean z, @NotNull fs5 fs5Var) throws IOException {
        c25.p(fs5Var, "taskRunner");
        if (z) {
            this.Z.b();
            this.Z.s(this.S);
            int e2 = this.S.e();
            if (e2 != 65535) {
                this.Z.v(0, e2 - 65535);
            }
        }
        es5 j2 = fs5Var.j();
        String str = this.C;
        j2.n(new es5.b(this.u0, str, true, str, true), 0L);
    }

    public final int x0() {
        return this.E;
    }

    public final synchronized void x2(long j2) {
        long j3 = this.U + j2;
        this.U = j3;
        long j4 = j3 - this.V;
        if (j4 >= this.S.e() / 2) {
            F2(0, j4);
            this.V += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.Z.l());
        r6 = r3;
        r8.W += r6;
        r4 = com.p7700g.p99005.yq4.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y2(int i2, boolean z, @Nullable sv5 sv5Var, long j2) throws IOException {
        int min;
        long j3;
        if (j2 == 0) {
            this.Z.d(z, i2, sv5Var, 0);
            return;
        }
        loop0: while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        long j4 = this.W;
                        long j5 = this.X;
                        if (j4 < j5) {
                            break;
                        } else if (!this.B.containsKey(Integer.valueOf(i2))) {
                            break loop0;
                        } else {
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
            }
            j2 -= j3;
            this.Z.d(z && j2 == 0, i2, sv5Var, min);
        }
    }

    public final void z2(int i2, boolean z, @NotNull List<gt5> list) throws IOException {
        c25.p(list, "alternating");
        this.Z.k(z, i2, list);
    }
}