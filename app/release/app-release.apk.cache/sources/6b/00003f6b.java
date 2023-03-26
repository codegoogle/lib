package com.p7700g.p99005;

import android.util.Log;
import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.qm3;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidLog.kt */
@rr5
@vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/p7700g/p99005/du5;", "", "", "loggerName", "d", "(Ljava/lang/String;)Ljava/lang/String;", "logger", "tag", "Lcom/p7700g/p99005/yq4;", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "logLevel", qm3.b.j, "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "()V", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", AFHydra.STATUS_IDLE, "MAX_LOG_LENGTH", "", "Ljava/util/Map;", "knownLoggers", "<init>", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class du5 {
    private static final int a = 4000;
    private static final Map<String, String> c;
    public static final du5 d = new du5();
    private static final CopyOnWriteArraySet<Logger> b = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = fr5.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = fr5.class.getName();
        c25.o(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = it5.class.getName();
        c25.o(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = fs5.class.getName();
        c25.o(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c = nt4.D0(linkedHashMap);
    }

    private du5() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (b.add(logger)) {
            c25.o(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(eu5.a);
        }
    }

    private final String d(String str) {
        String str2 = c.get(str);
        return str2 != null ? str2 : e95.X8(str, 23);
    }

    public final void a(@NotNull String str, int i, @NotNull String str2, @Nullable Throwable th) {
        int min;
        c25.p(str, "loggerName");
        c25.p(str2, qm3.b.j);
        String d2 = d(str);
        if (Log.isLoggable(d2, i)) {
            if (th != null) {
                StringBuilder L = wo1.L(str2, "\n");
                L.append(Log.getStackTraceString(th));
                str2 = L.toString();
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int q3 = c95.q3(str2, '\n', i2, false, 4, null);
                if (q3 == -1) {
                    q3 = length;
                }
                while (true) {
                    min = Math.min(q3, i2 + a);
                    String substring = str2.substring(i2, min);
                    c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, d2, substring);
                    if (min >= q3) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : c.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}