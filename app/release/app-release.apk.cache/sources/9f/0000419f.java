package com.p7700g.p99005;

import android.os.SystemClock;
import com.p7700g.p99005.g43;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: BasicNetwork.java */
/* loaded from: classes3.dex */
public class f53 implements m43 {
    public static final boolean a = c53.b;
    private static final int b = 3000;
    private static final int c = 4096;
    @Deprecated
    public final m53 d;
    private final e53 e;
    public final g53 f;

    @Deprecated
    public f53(m53 httpStack) {
        this(httpStack, new g53(4096));
    }

    private static void b(String logPrefix, t43<?> request, b53 exception) throws b53 {
        x43 x = request.x();
        int A = request.A();
        try {
            x.a(exception);
            request.b(String.format("%s-retry [timeout=%s]", logPrefix, Integer.valueOf(A)));
        } catch (b53 e) {
            request.b(String.format("%s-timeout-giveup [timeout=%s]", logPrefix, Integer.valueOf(A)));
            throw e;
        }
    }

    private static List<l43> c(List<l43> responseHeaders, g43.a entry) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!responseHeaders.isEmpty()) {
            for (l43 l43Var : responseHeaders) {
                treeSet.add(l43Var.a());
            }
        }
        ArrayList arrayList = new ArrayList(responseHeaders);
        List<l43> list = entry.h;
        if (list != null) {
            if (!list.isEmpty()) {
                for (l43 l43Var2 : entry.h) {
                    if (!treeSet.contains(l43Var2.a())) {
                        arrayList.add(l43Var2);
                    }
                }
            }
        } else if (!entry.g.isEmpty()) {
            for (Map.Entry<String, String> entry2 : entry.g.entrySet()) {
                if (!treeSet.contains(entry2.getKey())) {
                    arrayList.add(new l43(entry2.getKey(), entry2.getValue()));
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public static Map<String, String> d(l43[] headers) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headers.length; i++) {
            treeMap.put(headers[i].a(), headers[i].b());
        }
        return treeMap;
    }

    private Map<String, String> e(g43.a entry) {
        if (entry == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = entry.b;
        if (str != null) {
            hashMap.put(sm4.r, str);
        }
        long j = entry.d;
        if (j > 0) {
            hashMap.put(sm4.q, k53.a(j));
        }
        return hashMap;
    }

    private byte[] f(InputStream in, int contentLength) throws IOException, y43 {
        o53 o53Var = new o53(this.f, contentLength);
        try {
            if (in != null) {
                byte[] a2 = this.f.a(1024);
                while (true) {
                    int read = in.read(a2);
                    if (read == -1) {
                        break;
                    }
                    o53Var.write(a2, 0, read);
                }
                byte[] byteArray = o53Var.toByteArray();
                try {
                    in.close();
                } catch (IOException unused) {
                    c53.f("Error occurred when closing InputStream", new Object[0]);
                }
                this.f.b(a2);
                o53Var.close();
                return byteArray;
            }
            throw new y43();
        } catch (Throwable th) {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException unused2) {
                    c53.f("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f.b(null);
            o53Var.close();
            throw th;
        }
    }

    private void h(long requestLifetime, t43<?> request, byte[] responseContents, int statusCode) {
        if (a || requestLifetime > com.anythink.expressad.video.module.a.a.m.af) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(requestLifetime);
            objArr[2] = responseContents != null ? Integer.valueOf(responseContents.length) : pg1.d;
            objArr[3] = Integer.valueOf(statusCode);
            objArr[4] = Integer.valueOf(request.x().getCurrentRetryCount());
            c53.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        throw new java.io.IOException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v5 */
    @Override // com.p7700g.p99005.m43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p43 a(t43<?> request) throws b53 {
        List list;
        byte[] bArr;
        byte[] f;
        byte[] bArr2;
        f53 f53Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List emptyList = Collections.emptyList();
            l53 l53Var = null;
            try {
                try {
                    l53 b2 = this.e.b(request, e(request.l()));
                    try {
                        int d = b2.d();
                        List<l43> c2 = b2.c();
                        if (d == 304) {
                            g43.a l = request.l();
                            if (l == null) {
                                return new p43(304, (byte[]) null, true, SystemClock.elapsedRealtime() - elapsedRealtime, c2);
                            }
                            return new p43(304, l.a, true, SystemClock.elapsedRealtime() - elapsedRealtime, c(c2, l));
                        }
                        try {
                            InputStream a2 = b2.a();
                            if (a2 != null) {
                                try {
                                    f = f(a2, b2.b());
                                } catch (IOException e) {
                                    e = e;
                                    bArr = null;
                                    l53Var = b2;
                                    list = c2;
                                    if (l53Var != null) {
                                    }
                                }
                            } else {
                                f = new byte[0];
                            }
                            bArr2 = f;
                            try {
                                f53Var = this;
                                f53Var.h(SystemClock.elapsedRealtime() - elapsedRealtime, request, bArr2, d);
                            } catch (IOException e2) {
                                e = e2;
                                f53Var = c2;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            emptyList = c2;
                            list = emptyList;
                            bArr = null;
                            l53Var = b2;
                            if (l53Var != null) {
                            }
                        }
                        try {
                            if (d < 200 || d > 299) {
                                break;
                            }
                            return new p43(d, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, c2);
                        } catch (IOException e4) {
                            e = e4;
                            list = f53Var;
                            l53Var = b2;
                            bArr = bArr2;
                            if (l53Var != null) {
                                int d2 = l53Var.d();
                                c53.c("Unexpected response code %d for %s", Integer.valueOf(d2), request.D());
                                if (bArr != null) {
                                    p43 p43Var = new p43(d2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, (List<l43>) list);
                                    if (d2 == 401 || d2 == 403) {
                                        b("auth", request, new e43(p43Var));
                                    } else if (d2 >= 400 && d2 <= 499) {
                                        throw new i43(p43Var);
                                    } else {
                                        if (d2 >= 500 && d2 <= 599) {
                                            if (request.U()) {
                                                b("server", request, new y43(p43Var));
                                            } else {
                                                throw new y43(p43Var);
                                            }
                                        } else {
                                            throw new y43(p43Var);
                                        }
                                    }
                                } else {
                                    b("network", request, new o43());
                                }
                            } else {
                                throw new q43(e);
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (MalformedURLException e6) {
                    StringBuilder G = wo1.G("Bad URL ");
                    G.append(request.D());
                    throw new RuntimeException(G.toString(), e6);
                } catch (SocketTimeoutException unused) {
                    b("socket", request, new a53());
                }
            } catch (IOException e7) {
                e = e7;
                list = emptyList;
                bArr = null;
            }
        }
    }

    public void g(String what, String url, long start) {
        c53.f("HTTP ERROR(%s) %d ms to fetch %s", what, Long.valueOf(SystemClock.elapsedRealtime() - start), url);
    }

    @Deprecated
    public f53(m53 httpStack, g53 pool) {
        this.d = httpStack;
        this.e = new d53(httpStack);
        this.f = pool;
    }

    public f53(e53 httpStack) {
        this(httpStack, new g53(4096));
    }

    public f53(e53 httpStack, g53 pool) {
        this.e = httpStack;
        this.d = httpStack;
        this.f = pool;
    }
}