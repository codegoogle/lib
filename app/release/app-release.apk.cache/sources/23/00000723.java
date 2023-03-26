package com.anythink.expressad.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.anythink.expressad.a.c;
import com.anythink.expressad.a.f;
import com.anythink.expressad.a.g;
import com.anythink.expressad.foundation.g.g.a;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.r;
import com.p7700g.p99005.wo1;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class h extends d implements a.b {
    public static final int a = 1;
    public static final int i = 2;
    private static final String j = "302";
    private e m;
    private c.b n;
    private boolean p;
    private Context q;
    private com.anythink.expressad.foundation.g.g.c r;
    private f.a s;
    private boolean k = false;
    private long l = 0;
    private boolean o = true;
    private Handler t = new Handler(Looper.getMainLooper());
    private boolean u = true;

    /* loaded from: classes2.dex */
    public class a extends com.anythink.expressad.foundation.g.g.a {
        private static final int h = 10;
        private final Context f;
        private String g;
        private String i;
        private String j;
        private String k;
        private com.anythink.expressad.foundation.d.c m;
        private boolean n;
        private boolean o;
        private int p;
        private final Semaphore e = new Semaphore(0);
        private g.a q = new g.a() { // from class: com.anythink.expressad.a.h.a.1
            @Override // com.anythink.expressad.a.g.a
            public final boolean a(String str) {
                boolean a = a.this.a(str);
                a.a(a.this, false, true);
                if (a) {
                    b();
                }
                return a;
            }

            @Override // com.anythink.expressad.a.g.a
            public final boolean b(String str) {
                boolean a = a.this.a(str);
                a.a(a.this, false, true);
                if (a) {
                    a.a(a.this, true, true);
                    b();
                }
                return a;
            }

            @Override // com.anythink.expressad.a.g.a
            public final boolean a() {
                a.a(a.this, false, false);
                return false;
            }

            private void b() {
                synchronized (h.this) {
                    h.this.n.a(true);
                    a.a(a.this);
                }
            }

            @Override // com.anythink.expressad.a.g.a
            public final void a(String str, String str2) {
                a.this.a(str);
                h.this.n.c(str2);
                a.a(a.this, true, false);
                b();
            }

            @Override // com.anythink.expressad.a.g.a
            public final void a(String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    h.this.n.b(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    h.this.n.c(str3);
                }
                a.this.a(str);
                a.a(a.this, true, false);
                b();
            }
        };
        private com.anythink.expressad.c.b l = null;

        public a(Context context, String str, String str2, String str3, String str4, com.anythink.expressad.foundation.d.c cVar, boolean z, boolean z2, int i) {
            this.f = context;
            this.g = str;
            this.i = str2;
            this.j = str3;
            this.k = str4;
            this.m = cVar;
            this.n = z;
            this.o = z2;
            this.p = i;
        }

        private static boolean a(int i) {
            return i == 200;
        }

        private static boolean b(int i) {
            return i == 301 || i == 302 || i == 307;
        }

        private static boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        private static boolean c(String str) {
            return str.startsWith("/");
        }

        private void d() {
            this.e.acquireUninterruptibly();
        }

        private static boolean e(String str) {
            return !TextUtils.isEmpty(str) && str.toLowerCase().contains("apk");
        }

        private void h() {
            this.e.release();
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x01e3 A[EDGE_INSN: B:103:0x01e3->B:94:0x01e3 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private c.b a(String str, boolean z, boolean z2, com.anythink.expressad.foundation.d.c cVar, int i) {
            String str2;
            String str3;
            int i2;
            String str4;
            String str5;
            String str6 = str;
            String str7 = "";
            n.d(h.j, "startJavaHTTPSpider");
            if (h.this.p) {
                String a = com.anythink.expressad.d.a.a(this.f, str6);
                if (!TextUtils.isEmpty(a)) {
                    str6 = wo1.t(str6, a);
                }
            }
            com.anythink.expressad.foundation.d.c cVar2 = this.m;
            if (cVar2 != null) {
                str6 = cVar2.r(str6);
            }
            c.b bVar = new c.b();
            f fVar = new f();
            try {
            } catch (Exception unused) {
                str2 = "";
            }
            if (b(str6)) {
                str3 = "";
                i2 = 0;
                str4 = str6;
                while (true) {
                    if (i2 < 10) {
                    }
                    str4 = str5;
                    i2++;
                }
                return bVar;
            }
            URI create = URI.create(str6);
            str2 = create.getScheme();
            try {
                str7 = create.getHost();
            } catch (Exception unused2) {
            }
            str3 = str7;
            str7 = str2;
            i2 = 0;
            str4 = str6;
            while (true) {
                if (i2 < 10) {
                    break;
                }
                if (!h.this.o) {
                    return null;
                }
                System.currentTimeMillis();
                h.this.s = fVar.a(str4, z, z2, cVar);
                System.currentTimeMillis();
                if (h.this.s != null) {
                    if (!TextUtils.isEmpty(h.this.s.h)) {
                        bVar.e(str4);
                        bVar.b(h.this.s.h);
                        bVar.b(1);
                        bVar.a(h.this.s.a());
                        bVar.a(false);
                        if (i2 == 0) {
                            com.anythink.expressad.a.a.a.a().a(str4, h.this.s.h, cVar, this.k, z, z2, i);
                        }
                        if (this.l != null) {
                            int i3 = com.anythink.expressad.c.a.a;
                        }
                    } else {
                        bVar.a(true);
                        if (this.l != null) {
                            int i4 = com.anythink.expressad.c.a.a;
                        }
                        int i5 = h.this.s.f;
                        if (!(i5 == 301 || i5 == 302 || i5 == 307)) {
                            if (h.this.s.f == 200) {
                                bVar.b(true);
                                bVar.e(str4);
                                bVar.c(h.this.s.g != null ? h.this.s.g : null);
                            } else {
                                bVar.b(false);
                                bVar.e(str4);
                                if (i2 == 0) {
                                    com.anythink.expressad.a.a.a.a().a(str4, h.this.s.h, cVar, this.k, z, z2, i);
                                }
                            }
                        } else {
                            bVar.b();
                            if (!TextUtils.isEmpty(h.this.s.a)) {
                                str5 = h.this.s.a;
                                if (b(str5)) {
                                    if (!str5.startsWith("/") || TextUtils.isEmpty(str7) || TextUtils.isEmpty(str3)) {
                                        break;
                                    }
                                    str5 = wo1.v(str7, "://", str3, str5);
                                    str7 = null;
                                    str3 = null;
                                } else if (!b(str5)) {
                                    try {
                                        URI create2 = URI.create(str5);
                                        str7 = create2.getScheme();
                                        str3 = create2.getHost();
                                    } catch (Exception unused3) {
                                    }
                                }
                                if (!r.a.a(str5)) {
                                    if (h.this.p) {
                                        String a2 = com.anythink.expressad.d.a.a(this.f, str5);
                                        if (!TextUtils.isEmpty(a2)) {
                                            str5 = wo1.t(str5, a2);
                                        }
                                    }
                                    com.anythink.expressad.foundation.d.c cVar3 = this.m;
                                    if (cVar3 != null) {
                                        str5 = cVar3.r(str5);
                                    }
                                    str4 = str5;
                                    i2++;
                                } else {
                                    bVar.b(true);
                                    bVar.e(str5);
                                    break;
                                }
                            } else {
                                bVar.b(true);
                                bVar.e(str4);
                                break;
                            }
                        }
                    }
                } else {
                    bVar.e(str4);
                    bVar.a(false);
                    if (this.l != null) {
                        int i6 = com.anythink.expressad.c.a.a;
                    }
                }
            }
            return bVar;
        }

        private static boolean d(String str) {
            return r.a.a(str);
        }

        private void a(boolean z, boolean z2) {
            if (h.this.l == 0) {
                h.this.l = System.currentTimeMillis();
            } else {
                h.this.l = System.currentTimeMillis();
            }
            if (!z) {
                if (this.l != null) {
                    int i = com.anythink.expressad.c.a.b;
                }
            } else if (z2) {
                if (this.l == null || h.this.k) {
                    return;
                }
                h.this.k = true;
                int i2 = com.anythink.expressad.c.a.b;
            } else if (this.l == null || h.this.k) {
            } else {
                h.this.k = true;
                int i3 = com.anythink.expressad.c.a.b;
            }
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void a() {
            h.this.n = new c.b();
            h.this.n.e(this.g);
            h.this.n = a(this.g, this.n, this.o, this.m, this.p);
            if (!TextUtils.isEmpty(h.this.n.e())) {
                h.this.n.a(true);
            }
            if (h.this.o && h.this.n.g()) {
                if (h.this.s != null) {
                    h.this.n.a(h.this.s.f);
                }
                if (!e(h.this.n.i()) && !r.a.a(h.this.n.i()) && 200 == h.this.s.f && !TextUtils.isEmpty(h.this.n.f()) && !h.this.n.f().contains(com.anythink.expressad.foundation.g.a.bU)) {
                    h.this.n.b(2);
                    if (!TextUtils.isEmpty(h.this.n.f())) {
                        new g(h.this.u).a(this.i, this.j, this.k, this.f, h.this.n.i(), h.this.n.f(), this.q);
                        n.d(h.j, "startWebViewHtmlParser");
                    } else {
                        n.a(h.j, "startWebViewSpider");
                        try {
                            new g(h.this.u).a(this.i, this.j, this.k, this.f, h.this.n.i(), this.q);
                        } catch (Exception unused) {
                            n.d("TAG", "webview spider start error");
                        }
                    }
                    this.e.acquireUninterruptibly();
                    return;
                }
                if (this.l != null) {
                    int i = com.anythink.expressad.c.a.a;
                }
                if (h.this.s != null) {
                    h.this.n.b(1);
                    h.this.n.b(h.this.s.h);
                    h.this.n.a(h.this.s.f);
                    h.this.n.a(h.this.s.a());
                    h.this.n.c(h.this.s.g);
                }
                a(h.this.n.i());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(String str) {
            if (r.a.a(str)) {
                h.this.n.c(1);
                h.this.n.e(str);
                h.this.n.b(true);
                return true;
            } else if (e(str)) {
                h.this.n.c(3);
                h.this.n.e(str);
                h.this.n.b(true);
                return true;
            } else {
                h.this.n.c(2);
                h.this.n.e(str);
                return false;
            }
        }

        public static /* synthetic */ void a(a aVar, boolean z, boolean z2) {
            if (h.this.l == 0) {
                h.this.l = System.currentTimeMillis();
            } else {
                h.this.l = System.currentTimeMillis();
            }
            if (!z) {
                if (aVar.l != null) {
                    int i = com.anythink.expressad.c.a.b;
                }
            } else if (z2) {
                if (aVar.l == null || h.this.k) {
                    return;
                }
                h.this.k = true;
                int i2 = com.anythink.expressad.c.a.b;
            } else if (aVar.l == null || h.this.k) {
            } else {
                h.this.k = true;
                int i3 = com.anythink.expressad.c.a.b;
            }
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.e.release();
        }
    }

    public h(Context context) {
        this.q = context;
        this.r = new com.anythink.expressad.foundation.g.g.c(context, 2);
    }

    @Override // com.anythink.expressad.a.d
    public final void b() {
        this.o = false;
    }

    private boolean a() {
        return this.o;
    }

    public final void a(String str, e eVar, boolean z, String str2, String str3, String str4, com.anythink.expressad.foundation.d.c cVar, boolean z2, boolean z3, int i2) {
        this.m = eVar;
        this.p = z;
        this.r.a(new a(this.q, str, str2, str3, str4, cVar, z2, z3, i2), this);
    }

    @Override // com.anythink.expressad.foundation.g.g.a.b
    public final void a(int i2) {
        if (i2 == a.EnumC0065a.e && this.o) {
            this.t.post(new Runnable() { // from class: com.anythink.expressad.a.h.1
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}