package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.vv5;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpHeaders.kt */
@fz4(name = "HttpHeaders")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#\"\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#¨\u0006&"}, d2 = {"Lcom/p7700g/p99005/yq5;", "", "headerName", "", "Lcom/p7700g/p99005/kq5;", "b", "(Lcom/p7700g/p99005/yq5;Ljava/lang/String;)Ljava/util/List;", "Lcom/p7700g/p99005/sv5;", "", "result", "Lcom/p7700g/p99005/yq4;", "d", "(Lcom/p7700g/p99005/sv5;Ljava/util/List;)V", "", "h", "(Lcom/p7700g/p99005/sv5;)Z", "", "prefix", "i", "(Lcom/p7700g/p99005/sv5;B)Z", "e", "(Lcom/p7700g/p99005/sv5;)Ljava/lang/String;", "f", "Lcom/p7700g/p99005/rq5;", "Lcom/p7700g/p99005/zq5;", "url", "headers", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/rq5;Lcom/p7700g/p99005/zq5;Lcom/p7700g/p99005/yq5;)V", "Lcom/p7700g/p99005/jr5;", "c", "(Lcom/p7700g/p99005/jr5;)Z", "response", "a", "Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/vv5;", "TOKEN_DELIMITERS", "QUOTED_STRING_DELIMITERS", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class vs5 {
    private static final vv5 a;
    private static final vv5 b;

    static {
        vv5.a aVar = vv5.u;
        a = aVar.l("\"\\");
        b = aVar.l("\t ,=");
    }

    @xn4(level = zn4.ERROR, message = "No longer supported", replaceWith = @op4(expression = "response.promisesBody()", imports = {}))
    public static final boolean a(@NotNull jr5 jr5Var) {
        c25.p(jr5Var, "response");
        return c(jr5Var);
    }

    @NotNull
    public static final List<kq5> b(@NotNull yq5 yq5Var, @NotNull String str) {
        c25.p(yq5Var, "$this$parseChallenges");
        c25.p(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = yq5Var.size();
        for (int i = 0; i < size; i++) {
            if (b95.K1(str, yq5Var.h(i), true)) {
                try {
                    d(new sv5().K0(yq5Var.t(i)), arrayList);
                } catch (EOFException e) {
                    au5.e.g().m("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean c(@NotNull jr5 jr5Var) {
        c25.p(jr5Var, "$this$promisesBody");
        if (c25.g(jr5Var.T1().m(), "HEAD")) {
            return false;
        }
        int E = jr5Var.E();
        return (((E >= 100 && E < 200) || E == 204 || E == 304) && sr5.x(jr5Var) == -1 && !b95.K1("chunked", jr5.W(jr5Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0082, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0082, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void d(sv5 sv5Var, List<kq5> list) throws EOFException {
        String f;
        int S;
        LinkedHashMap linkedHashMap;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    h(sv5Var);
                    str = f(sv5Var);
                    if (str == null) {
                        return;
                    }
                }
                boolean h = h(sv5Var);
                f = f(sv5Var);
                if (f == null) {
                    if (sv5Var.f0()) {
                        list.add(new kq5(str, nt4.z()));
                        return;
                    }
                    return;
                }
                byte b2 = (byte) 61;
                S = sr5.S(sv5Var, b2);
                boolean h2 = h(sv5Var);
                if (h || (!h2 && !sv5Var.f0())) {
                    linkedHashMap = new LinkedHashMap();
                    int S2 = sr5.S(sv5Var, b2) + S;
                    while (true) {
                        if (f == null) {
                            f = f(sv5Var);
                            if (h(sv5Var)) {
                                break;
                            }
                            S2 = sr5.S(sv5Var, b2);
                        }
                        if (S2 == 0) {
                            break;
                        } else if (S2 > 1 || h(sv5Var)) {
                            return;
                        } else {
                            String e = i(sv5Var, (byte) 34) ? e(sv5Var) : f(sv5Var);
                            if (e == null || ((String) linkedHashMap.put(f, e)) != null) {
                                return;
                            }
                            if (!h(sv5Var) && !sv5Var.f0()) {
                                return;
                            }
                            f = null;
                        }
                    }
                }
                list.add(new kq5(str, linkedHashMap));
                str = f;
            }
            StringBuilder G = wo1.G(f);
            G.append(b95.g2(AppCenter.KEY_VALUE_DELIMITER, S));
            Map singletonMap = Collections.singletonMap(null, G.toString());
            c25.o(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new kq5(str, singletonMap));
        }
    }

    private static final String e(sv5 sv5Var) throws EOFException {
        byte b2 = (byte) 34;
        if (sv5Var.readByte() == b2) {
            sv5 sv5Var2 = new sv5();
            while (true) {
                long n0 = sv5Var.n0(a);
                if (n0 == -1) {
                    return null;
                }
                if (sv5Var.d2(n0) == b2) {
                    sv5Var2.write(sv5Var, n0);
                    sv5Var.readByte();
                    return sv5Var2.u1();
                } else if (sv5Var.z2() == n0 + 1) {
                    return null;
                } else {
                    sv5Var2.write(sv5Var, n0);
                    sv5Var.readByte();
                    sv5Var2.write(sv5Var, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String f(sv5 sv5Var) {
        long n0 = sv5Var.n0(b);
        if (n0 == -1) {
            n0 = sv5Var.z2();
        }
        if (n0 != 0) {
            return sv5Var.g(n0);
        }
        return null;
    }

    public static final void g(@NotNull rq5 rq5Var, @NotNull zq5 zq5Var, @NotNull yq5 yq5Var) {
        c25.p(rq5Var, "$this$receiveHeaders");
        c25.p(zq5Var, "url");
        c25.p(yq5Var, "headers");
        if (rq5Var == rq5.a) {
            return;
        }
        List<pq5> g = pq5.e.g(zq5Var, yq5Var);
        if (g.isEmpty()) {
            return;
        }
        rq5Var.a(zq5Var, g);
    }

    private static final boolean h(sv5 sv5Var) {
        boolean z = false;
        while (!sv5Var.f0()) {
            byte d2 = sv5Var.d2(0L);
            if (d2 == 9 || d2 == 32) {
                sv5Var.readByte();
            } else if (d2 != 44) {
                break;
            } else {
                sv5Var.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean i(sv5 sv5Var, byte b2) {
        return !sv5Var.f0() && sv5Var.d2(0L) == b2;
    }
}