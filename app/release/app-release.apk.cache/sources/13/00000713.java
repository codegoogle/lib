package com.anythink.expressad.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.g.a;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.ck3;
import com.p7700g.p99005.sm4;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class c extends d {
    private static final boolean i = true;
    private int l;
    private com.anythink.expressad.foundation.g.g.c o;
    private h p;
    private int j = 0;
    private String k = null;
    public b a = null;
    private e m = null;
    private boolean n = true;
    private Handler q = new Handler(Looper.getMainLooper());

    /* renamed from: com.anythink.expressad.a.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements a.b {
        private AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.g.a.b
        public final void a(int i) {
            if (i == a.EnumC0065a.e && c.this.n) {
                c.this.q.post(new Runnable() { // from class: com.anythink.expressad.a.c.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public class a extends com.anythink.expressad.foundation.g.g.a {
        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x011b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00a5 A[EDGE_INSN: B:107:0x00a5->B:31:0x00a5 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00df A[Catch: Exception -> 0x01fa, TryCatch #3 {Exception -> 0x01fa, blocks: (B:3:0x0003, B:7:0x0017, B:10:0x0020, B:16:0x008c, B:38:0x00c3, B:46:0x00df, B:48:0x00e5, B:50:0x00ed, B:53:0x00f6, B:55:0x0105, B:54:0x00fe, B:56:0x010d, B:57:0x0115, B:59:0x011b, B:60:0x0123, B:62:0x012f, B:63:0x013c, B:66:0x0152, B:33:0x00b9, B:36:0x00bf, B:70:0x015a, B:71:0x015d, B:72:0x015e, B:74:0x0170, B:77:0x0183, B:79:0x0193, B:87:0x01eb, B:80:0x01ad, B:82:0x01b5, B:85:0x01c6, B:84:0x01bf, B:86:0x01d2), top: B:96:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x010d A[Catch: Exception -> 0x01fa, TryCatch #3 {Exception -> 0x01fa, blocks: (B:3:0x0003, B:7:0x0017, B:10:0x0020, B:16:0x008c, B:38:0x00c3, B:46:0x00df, B:48:0x00e5, B:50:0x00ed, B:53:0x00f6, B:55:0x0105, B:54:0x00fe, B:56:0x010d, B:57:0x0115, B:59:0x011b, B:60:0x0123, B:62:0x012f, B:63:0x013c, B:66:0x0152, B:33:0x00b9, B:36:0x00bf, B:70:0x015a, B:71:0x015d, B:72:0x015e, B:74:0x0170, B:77:0x0183, B:79:0x0193, B:87:0x01eb, B:80:0x01ad, B:82:0x01b5, B:85:0x01c6, B:84:0x01bf, B:86:0x01d2), top: B:96:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0123 A[Catch: Exception -> 0x01fa, TryCatch #3 {Exception -> 0x01fa, blocks: (B:3:0x0003, B:7:0x0017, B:10:0x0020, B:16:0x008c, B:38:0x00c3, B:46:0x00df, B:48:0x00e5, B:50:0x00ed, B:53:0x00f6, B:55:0x0105, B:54:0x00fe, B:56:0x010d, B:57:0x0115, B:59:0x011b, B:60:0x0123, B:62:0x012f, B:63:0x013c, B:66:0x0152, B:33:0x00b9, B:36:0x00bf, B:70:0x015a, B:71:0x015d, B:72:0x015e, B:74:0x0170, B:77:0x0183, B:79:0x0193, B:87:0x01eb, B:80:0x01ad, B:82:0x01b5, B:85:0x01c6, B:84:0x01bf, B:86:0x01d2), top: B:96:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x015a A[Catch: Exception -> 0x01fa, TryCatch #3 {Exception -> 0x01fa, blocks: (B:3:0x0003, B:7:0x0017, B:10:0x0020, B:16:0x008c, B:38:0x00c3, B:46:0x00df, B:48:0x00e5, B:50:0x00ed, B:53:0x00f6, B:55:0x0105, B:54:0x00fe, B:56:0x010d, B:57:0x0115, B:59:0x011b, B:60:0x0123, B:62:0x012f, B:63:0x013c, B:66:0x0152, B:33:0x00b9, B:36:0x00bf, B:70:0x015a, B:71:0x015d, B:72:0x015e, B:74:0x0170, B:77:0x0183, B:79:0x0193, B:87:0x01eb, B:80:0x01ad, B:82:0x01b5, B:85:0x01c6, B:84:0x01bf, B:86:0x01d2), top: B:96:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0170 A[Catch: Exception -> 0x01fa, TryCatch #3 {Exception -> 0x01fa, blocks: (B:3:0x0003, B:7:0x0017, B:10:0x0020, B:16:0x008c, B:38:0x00c3, B:46:0x00df, B:48:0x00e5, B:50:0x00ed, B:53:0x00f6, B:55:0x0105, B:54:0x00fe, B:56:0x010d, B:57:0x0115, B:59:0x011b, B:60:0x0123, B:62:0x012f, B:63:0x013c, B:66:0x0152, B:33:0x00b9, B:36:0x00bf, B:70:0x015a, B:71:0x015d, B:72:0x015e, B:74:0x0170, B:77:0x0183, B:79:0x0193, B:87:0x01eb, B:80:0x01ad, B:82:0x01b5, B:85:0x01c6, B:84:0x01bf, B:86:0x01d2), top: B:96:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0193 A[Catch: Exception -> 0x01fa, TryCatch #3 {Exception -> 0x01fa, blocks: (B:3:0x0003, B:7:0x0017, B:10:0x0020, B:16:0x008c, B:38:0x00c3, B:46:0x00df, B:48:0x00e5, B:50:0x00ed, B:53:0x00f6, B:55:0x0105, B:54:0x00fe, B:56:0x010d, B:57:0x0115, B:59:0x011b, B:60:0x0123, B:62:0x012f, B:63:0x013c, B:66:0x0152, B:33:0x00b9, B:36:0x00bf, B:70:0x015a, B:71:0x015d, B:72:0x015e, B:74:0x0170, B:77:0x0183, B:79:0x0193, B:87:0x01eb, B:80:0x01ad, B:82:0x01b5, B:85:0x01c6, B:84:0x01bf, B:86:0x01d2), top: B:96:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01ad A[Catch: Exception -> 0x01fa, TryCatch #3 {Exception -> 0x01fa, blocks: (B:3:0x0003, B:7:0x0017, B:10:0x0020, B:16:0x008c, B:38:0x00c3, B:46:0x00df, B:48:0x00e5, B:50:0x00ed, B:53:0x00f6, B:55:0x0105, B:54:0x00fe, B:56:0x010d, B:57:0x0115, B:59:0x011b, B:60:0x0123, B:62:0x012f, B:63:0x013c, B:66:0x0152, B:33:0x00b9, B:36:0x00bf, B:70:0x015a, B:71:0x015d, B:72:0x015e, B:74:0x0170, B:77:0x0183, B:79:0x0193, B:87:0x01eb, B:80:0x01ad, B:82:0x01b5, B:85:0x01c6, B:84:0x01bf, B:86:0x01d2), top: B:96:0x0003 }] */
        @Override // com.anythink.expressad.foundation.g.g.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            HttpURLConnection httpURLConnection;
            String str;
            int i;
            String str2;
            try {
                c.this.a = new b();
                int i2 = 0;
                while (true) {
                    HttpURLConnection httpURLConnection2 = null;
                    if (i2 >= 10) {
                        break;
                    } else if (!c.this.n) {
                        return;
                    } else {
                        c.c(c.this);
                        try {
                            c cVar = c.this;
                            cVar.k = cVar.k.replace(" ", "%20");
                            n.c("", "mTargetURL = " + c.this.k);
                            httpURLConnection = (HttpURLConnection) new URL(c.this.k).openConnection();
                        } catch (Exception e) {
                            e = e;
                            httpURLConnection = null;
                            str = null;
                        } catch (Throwable th) {
                            th = th;
                            if (httpURLConnection2 != null) {
                            }
                            throw th;
                        }
                        try {
                            try {
                                httpURLConnection.setRequestMethod("GET");
                                httpURLConnection.setRequestProperty(sm4.v, com.anythink.core.common.j.d.i());
                                httpURLConnection.setConnectTimeout(15000);
                                httpURLConnection.setReadTimeout(15000);
                                httpURLConnection.setInstanceFollowRedirects(false);
                                httpURLConnection.connect();
                                i = httpURLConnection.getResponseCode();
                                try {
                                    str = httpURLConnection.getHeaderField("Location");
                                } catch (Exception e2) {
                                    e = e2;
                                    str = null;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str = null;
                                i = 200;
                                e.printStackTrace();
                                if (i2 != 0) {
                                }
                            }
                            try {
                                str2 = httpURLConnection.getHeaderField("Content-type");
                                httpURLConnection.disconnect();
                            } catch (Exception e4) {
                                e = e4;
                                e.printStackTrace();
                                if (i2 != 0) {
                                    c.this.a.a(false);
                                    c.this.a.d(e.getLocalizedMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                        return;
                                    }
                                    return;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                str2 = null;
                                n.c("", "mTargetURL code= ".concat(String.valueOf(i)));
                                if (i != 301) {
                                    if (i != 200) {
                                    }
                                    if (!c.this.k.toLowerCase().startsWith("market:/")) {
                                        if (c.this.k.toLowerCase().endsWith(".apk")) {
                                        }
                                        c.this.a.d(null);
                                        c.this.a.a(true);
                                    }
                                    c.this.a.c(1);
                                    c cVar2 = c.this;
                                    cVar2.a.e(cVar2.k);
                                    c.this.a.b(true);
                                    c.this.a.d(null);
                                    c.this.a.a(true);
                                }
                                if (!TextUtils.isEmpty(str)) {
                                }
                                if (!c.this.k.toLowerCase().startsWith("market:/")) {
                                }
                                c.this.a.c(1);
                                c cVar22 = c.this;
                                cVar22.a.e(cVar22.k);
                                c.this.a.b(true);
                                c.this.a.d(null);
                                c.this.a.a(true);
                            }
                            n.c("", "mTargetURL code= ".concat(String.valueOf(i)));
                            if (i != 301 && i != 302 && i != 307) {
                                if (i != 200) {
                                    if (!TextUtils.isEmpty(str2) && str2.indexOf(ck3.a) < 0 && str2.indexOf("text") < 0) {
                                        c.this.a.c(3);
                                        c.this.a.b(true);
                                    }
                                    c.this.a.c(2);
                                    c.this.a.b(true);
                                } else {
                                    c.this.a.b(false);
                                }
                            }
                            if (!TextUtils.isEmpty(str)) {
                                c.this.a.b(true);
                                break;
                            } else if (!str.toLowerCase().startsWith("http")) {
                                c.this.k = str;
                                c.this.a.b(true);
                                break;
                            } else {
                                c.this.k = str;
                                if (c.this.k.toLowerCase().endsWith(".apk")) {
                                    break;
                                }
                                i2++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            httpURLConnection2 = httpURLConnection;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            throw th;
                        }
                    }
                }
                if (!c.this.k.toLowerCase().startsWith("market:/") && c.this.k.toLowerCase().indexOf("play.google.com") <= 0) {
                    if (c.this.k.toLowerCase().endsWith(".apk")) {
                        if (c.this.j >= 10 || !c.this.a.j()) {
                            c.this.a.c(2);
                        }
                        c cVar3 = c.this;
                        cVar3.a.e(cVar3.k);
                    } else {
                        c.this.a.c(3);
                        c cVar4 = c.this;
                        cVar4.a.e(cVar4.k);
                        c.this.a.b(true);
                    }
                    c.this.a.d(null);
                    c.this.a.a(true);
                }
                c.this.a.c(1);
                c cVar222 = c.this;
                cVar222.a.e(cVar222.k);
                c.this.a.b(true);
                c.this.a.d(null);
                c.this.a.a(true);
            } catch (Exception e5) {
                c cVar5 = c.this;
                cVar5.a.e(cVar5.k);
                c.this.a.a(false);
                c.this.a.d(e5.getLocalizedMessage());
                e5.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.g.g.a
        public final void c() {
        }

        private /* synthetic */ a(c cVar, byte b) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements com.anythink.expressad.e.b, Serializable {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final long e = 1;
        private boolean f;
        private String g;
        private int h;
        private String i;
        private String j;
        private boolean k;
        private String l;
        private String m;
        private String n;
        private int o;
        private boolean p;
        private int q;

        private boolean k() {
            return this.p;
        }

        private String l() {
            return this.j;
        }

        private String m() {
            return this.g;
        }

        public final int a() {
            return this.q;
        }

        public final void b() {
            this.p = true;
        }

        public final int c() {
            return this.o;
        }

        public final String d() {
            return this.n;
        }

        public final String e() {
            return this.m;
        }

        public final String f() {
            return this.l;
        }

        public final boolean g() {
            return this.f;
        }

        public final int h() {
            return this.h;
        }

        public final String i() {
            return this.i;
        }

        public final boolean j() {
            return this.k;
        }

        private void f(String str) {
            this.j = str;
        }

        public final void a(int i) {
            this.q = i;
        }

        public final void b(int i) {
            this.o = i;
        }

        public final void c(String str) {
            this.l = str;
        }

        public final void d(String str) {
            this.g = str;
        }

        public final void e(String str) {
            this.i = str;
        }

        public final void a(String str) {
            this.n = str;
        }

        public final void b(String str) {
            this.m = str;
        }

        public final void c(int i) {
            this.h = i;
        }

        public final void a(boolean z) {
            this.f = z;
        }

        public final void b(boolean z) {
            this.k = z;
        }
    }

    public c(Context context) {
        this.o = new com.anythink.expressad.foundation.g.g.c(context, 2);
        this.p = new h(context);
    }

    public static /* synthetic */ int c(c cVar) {
        int i2 = cVar.j;
        cVar.j = i2 + 1;
        return i2;
    }

    private void b(String str, String str2, com.anythink.expressad.foundation.d.c cVar, e eVar) {
        this.k = new String(cVar.af());
        this.m = eVar;
        this.a = null;
        this.p.a(cVar.af(), eVar, "5".equals(cVar.ac()) || "6".equals(cVar.ac()), str, cVar.aZ(), str2, cVar, true, false, com.anythink.expressad.a.a.a.l);
    }

    public final boolean a() {
        return this.n;
    }

    public final void a(String str, String str2, com.anythink.expressad.foundation.d.c cVar, String str3, boolean z, boolean z2, int i2) {
        String str4;
        boolean z3;
        this.k = str3;
        this.m = null;
        this.a = null;
        this.l = i2;
        boolean z4 = false;
        if (cVar != null) {
            z3 = ("5".equals(cVar.ac()) || "6".equals(cVar.ac())) ? true : true;
            str4 = cVar.aZ();
        } else {
            str4 = "";
            z3 = false;
        }
        this.p.a(str3, null, z3, str, str4, str2, cVar, z, z2, i2);
    }

    @Override // com.anythink.expressad.a.d
    public final void b() {
        this.n = false;
    }

    private void a(String str, String str2, com.anythink.expressad.foundation.d.c cVar, e eVar) {
        this.k = new String(cVar.af());
        this.m = eVar;
        this.a = null;
        this.p.a(cVar.af(), eVar, "5".equals(cVar.ac()) || "6".equals(cVar.ac()), str, cVar.aZ(), str2, cVar, true, false, com.anythink.expressad.a.a.a.l);
    }
}