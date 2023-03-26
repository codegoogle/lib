package com.anythink.expressad.foundation.g.f;

import com.anythink.expressad.foundation.h.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public abstract class i<T> implements Comparable<i<T>> {
    private static final String c = i.class.getSimpleName();
    public ConcurrentHashMap<String, String> a;
    public e<T> b;
    private final int d;
    private final String e;
    private Integer f;
    private j g;
    private boolean h;
    private l i;
    private Object j;

    /* loaded from: classes2.dex */
    public interface a {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;
        public static final int h = 7;
    }

    /* loaded from: classes2.dex */
    public class b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;

        private b() {
        }
    }

    public i(int i, String str, e<T> eVar) {
        this.a = new ConcurrentHashMap<>();
        this.b = null;
        this.h = false;
        this.e = str;
        this.d = i;
        this.b = eVar;
        this.i = new com.anythink.expressad.foundation.g.f.b();
    }

    public static com.anythink.expressad.foundation.g.f.a.a a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return aVar;
    }

    private int p() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    private static void q() {
    }

    private static void r() {
    }

    private static void s() {
    }

    public final int a() {
        return this.d;
    }

    public abstract k<T> a(com.anythink.expressad.foundation.g.f.f.c cVar);

    public void a(OutputStream outputStream) {
    }

    public final Object b() {
        return this.j;
    }

    public final void c() {
        j jVar = this.g;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        i iVar = (i) obj;
        int j = j();
        int j2 = iVar.j();
        return j == j2 ? this.f.intValue() - iVar.f.intValue() : j2 - j;
    }

    public final String d() {
        return this.e;
    }

    public final void e() {
        this.h = true;
    }

    public final boolean f() {
        return this.h;
    }

    public final Map<String, String> g() {
        return this.a;
    }

    public byte[] h() {
        return null;
    }

    public void i() {
        a("Connection", com.anythink.expressad.foundation.d.c.cd);
        a("Charset", "UTF-8");
    }

    public int j() {
        return 2;
    }

    public final int k() {
        return this.i.b();
    }

    public final l l() {
        return this.i;
    }

    public final void m() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final void n() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.c();
        }
    }

    public final void o() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h ? "[X] " : "[ ] ");
        sb.append(this.e);
        sb.append(" ");
        sb.append(j());
        sb.append(" ");
        sb.append(this.f);
        return sb.toString();
    }

    public final void a(e<T> eVar) {
        this.b = eVar;
    }

    public final void b(com.anythink.expressad.foundation.g.f.a.a aVar) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.a(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i<?> a(Object obj) {
        this.j = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(l lVar) {
        this.i = lVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(j jVar) {
        this.g = jVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    private void a(String str) {
        this.a.remove(str);
    }

    public i(String str) {
        this.a = new ConcurrentHashMap<>();
        this.b = null;
        this.h = false;
        this.e = str;
        this.d = 0;
        this.i = new com.anythink.expressad.foundation.g.f.b();
    }

    public byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar, c cVar) {
        return bVar.c() != null ? a(bVar) : new byte[0];
    }

    private static byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream c2 = bVar.c();
            try {
                if (com.anythink.expressad.foundation.g.f.g.e.b(bVar.b()) && !(c2 instanceof GZIPInputStream)) {
                    c2 = new GZIPInputStream(c2);
                }
                if (c2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = c2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            c2.close();
                            byteArrayOutputStream2.close();
                        } catch (IOException e) {
                            n.d(c, e.getMessage());
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        inputStream = c2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e2) {
                                n.d(c, e2.getMessage());
                                throw th;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                }
                throw new com.anythink.expressad.foundation.g.f.a.a(7, null);
            } catch (Throwable th2) {
                th = th2;
                inputStream = c2;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public final void a(k<T> kVar) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.a(kVar);
        }
    }

    private int a(i<T> iVar) {
        int j = j();
        int j2 = iVar.j();
        return j == j2 ? this.f.intValue() - iVar.f.intValue() : j2 - j;
    }

    public final void a(String str, String str2) {
        this.a.remove(str);
        this.a.put(str, str2);
    }
}