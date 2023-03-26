package com.p7700g.p99005;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p7700g.p99005.c53;
import com.p7700g.p99005.g43;
import com.p7700g.p99005.v43;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Request.java */
/* loaded from: classes3.dex */
public abstract class t43<T> implements Comparable<t43<T>> {
    private static final String s = "UTF-8";
    private u43 A;
    private boolean B;
    @k1("mLock")
    private boolean C;
    @k1("mLock")
    private boolean D;
    private boolean E;
    private x43 F;
    private g43.a G;
    private Object H;
    @k1("mLock")
    private c I;
    private final c53.a t;
    private final int u;
    private final String v;
    private final int w;
    private final Object x;
    @z1
    @k1("mLock")
    private v43.a y;
    private Integer z;

    /* compiled from: Request.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ long t;

        public a(final String val$tag, final long val$threadId) {
            this.s = val$tag;
            this.t = val$threadId;
        }

        @Override // java.lang.Runnable
        public void run() {
            t43.this.t.a(this.s, this.t);
            t43.this.t.b(t43.this.toString());
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes3.dex */
    public interface b {
        public static final int a = -1;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;
        public static final int h = 6;
        public static final int i = 7;
    }

    /* compiled from: Request.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(t43<?> request, v43<?> response);

        void b(t43<?> request);
    }

    /* compiled from: Request.java */
    /* loaded from: classes3.dex */
    public enum d {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public t43(String url, v43.a listener) {
        this(-1, url, listener);
    }

    private byte[] g(Map<String, String> params, String paramsEncoding) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), paramsEncoding));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue(), paramsEncoding));
                    sb.append(h95.d);
                } else {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
            }
            return sb.toString().getBytes(paramsEncoding);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(wo1.t("Encoding not supported: ", paramsEncoding), e);
        }
    }

    private static int h(String url) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(url) || (parse = Uri.parse(url)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final int A() {
        return x().getCurrentTimeout();
    }

    public int B() {
        return this.w;
    }

    public String D() {
        return this.v;
    }

    public boolean E() {
        boolean z;
        synchronized (this.x) {
            z = this.D;
        }
        return z;
    }

    public boolean F() {
        boolean z;
        synchronized (this.x) {
            z = this.C;
        }
        return z;
    }

    public void G() {
        synchronized (this.x) {
            this.D = true;
        }
    }

    public void H() {
        c cVar;
        synchronized (this.x) {
            cVar = this.I;
        }
        if (cVar != null) {
            cVar.b(this);
        }
    }

    public void I(v43<?> response) {
        c cVar;
        synchronized (this.x) {
            cVar = this.I;
        }
        if (cVar != null) {
            cVar.a(this, response);
        }
    }

    public b53 J(b53 volleyError) {
        return volleyError;
    }

    public abstract v43<T> K(p43 response);

    /* JADX WARN: Multi-variable type inference failed */
    public t43<?> L(g43.a entry) {
        this.G = entry;
        return this;
    }

    public void M(c requestCompleteListener) {
        synchronized (this.x) {
            this.I = requestCompleteListener;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t43<?> N(u43 requestQueue) {
        this.A = requestQueue;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t43<?> O(x43 retryPolicy) {
        this.F = retryPolicy;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t43<?> P(int sequence) {
        this.z = Integer.valueOf(sequence);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t43<?> Q(boolean shouldCache) {
        this.B = shouldCache;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t43<?> R(boolean shouldRetryServerErrors) {
        this.E = shouldRetryServerErrors;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t43<?> S(Object tag) {
        this.H = tag;
        return this;
    }

    public final boolean T() {
        return this.B;
    }

    public final boolean U() {
        return this.E;
    }

    public void b(String tag) {
        if (c53.a.a) {
            this.t.a(tag, Thread.currentThread().getId());
        }
    }

    @t0
    public void c() {
        synchronized (this.x) {
            this.C = true;
            this.y = null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(t43<T> other) {
        d w = w();
        d w2 = other.w();
        return w == w2 ? this.z.intValue() - other.z.intValue() : w2.ordinal() - w.ordinal();
    }

    public void e(b53 error) {
        v43.a aVar;
        synchronized (this.x) {
            aVar = this.y;
        }
        if (aVar != null) {
            aVar.b(error);
        }
    }

    public abstract void f(T response);

    public void i(final String tag) {
        u43 u43Var = this.A;
        if (u43Var != null) {
            u43Var.e(this);
        }
        if (c53.a.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(tag, id));
                return;
            }
            this.t.a(tag, id);
            this.t.b(toString());
        }
    }

    public byte[] j() throws e43 {
        Map<String, String> q = q();
        if (q == null || q.size() <= 0) {
            return null;
        }
        return g(q, r());
    }

    public String k() {
        StringBuilder G = wo1.G("application/x-www-form-urlencoded; charset=");
        G.append(r());
        return G.toString();
    }

    public g43.a l() {
        return this.G;
    }

    public String m() {
        String D = D();
        int p = p();
        if (p == 0 || p == -1) {
            return D;
        }
        return Integer.toString(p) + '-' + D;
    }

    @z1
    public v43.a n() {
        v43.a aVar;
        synchronized (this.x) {
            aVar = this.y;
        }
        return aVar;
    }

    public Map<String, String> o() throws e43 {
        return new HashMap();
    }

    public int p() {
        return this.u;
    }

    public Map<String, String> q() throws e43 {
        return null;
    }

    public String r() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] s() throws e43 {
        Map<String, String> u = u();
        if (u == null || u.size() <= 0) {
            return null;
        }
        return g(u, v());
    }

    @Deprecated
    public String t() {
        return k();
    }

    public String toString() {
        StringBuilder G = wo1.G(n04.t);
        G.append(Integer.toHexString(B()));
        String sb = G.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(F() ? "[X] " : "[ ] ");
        sb2.append(D());
        sb2.append(" ");
        sb2.append(sb);
        sb2.append(" ");
        sb2.append(w());
        sb2.append(" ");
        sb2.append(this.z);
        return sb2.toString();
    }

    @Deprecated
    public Map<String, String> u() throws e43 {
        return q();
    }

    @Deprecated
    public String v() {
        return r();
    }

    public d w() {
        return d.NORMAL;
    }

    public x43 x() {
        return this.F;
    }

    public final int y() {
        Integer num = this.z;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object z() {
        return this.H;
    }

    public t43(int method, String url, @z1 v43.a listener) {
        this.t = c53.a.a ? new c53.a() : null;
        this.x = new Object();
        this.B = true;
        this.C = false;
        this.D = false;
        this.E = false;
        this.G = null;
        this.u = method;
        this.v = url;
        this.y = listener;
        O(new j43());
        this.w = h(url);
    }
}