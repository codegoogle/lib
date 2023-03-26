package com.anythink.basead.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.anythink.basead.handler.OfferClickHandler;
import com.anythink.core.api.IExHandler;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.ui.web.WebLandPageActivity;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.w;
import com.anythink.core.common.e.y;
import com.anythink.core.common.o;
import com.p7700g.p99005.sm4;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class c {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public com.anythink.core.common.e.i k;
    public boolean l;
    public boolean m;
    public Context n;
    public boolean o;
    public com.anythink.core.common.e.j p;
    public a q;
    public IOfferClickHandler r;
    private final String s = c.class.getSimpleName();
    private final int t = 0;
    private final int u = 1;
    private final int v = 2;
    private final int w = 10;

    /* renamed from: com.anythink.basead.a.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ com.anythink.basead.c.i a;

        public AnonymousClass1(com.anythink.basead.c.i iVar) {
            this.a = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c.a(c.this, this.a)) {
                return;
            }
            final int i = 0;
            if (c.this.p.m.j() != 2) {
                i = c.this.b(this.a, false) ? 1 : 2;
            }
            if (i == 1 && c.this.p.m.j() == 1) {
                return;
            }
            IExHandler b = m.a().b();
            if (c.this.k.y() == 4 && 1 == c.this.p.m.m() && b != null && i != 1) {
                c cVar = c.this;
                b.openApkConfirmDialog(cVar.n, cVar.k, cVar.p, new com.anythink.core.common.f.a() { // from class: com.anythink.basead.a.c.1.1
                    @Override // com.anythink.core.common.f.a
                    public final void a(boolean z) {
                        if (z) {
                            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.basead.a.c.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C00181 c00181 = C00181.this;
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    c.a(c.this, i, anonymousClass1.a);
                                }
                            });
                        } else {
                            c.this.l = false;
                        }
                    }
                });
                return;
            }
            c.a(c.this, i, this.a);
        }
    }

    /* renamed from: com.anythink.basead.a.c$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ boolean a;

        public AnonymousClass2(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = c.this.q;
            if (aVar != null) {
                if (!this.a) {
                    aVar.a();
                }
                c.this.q.b();
                c.this.q.a(true);
            }
        }
    }

    /* renamed from: com.anythink.basead.a.c$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = c.this.q;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(boolean z);

        void b();
    }

    public c(Context context, com.anythink.core.common.e.j jVar, com.anythink.core.common.e.i iVar) {
        boolean z = false;
        this.k = iVar;
        this.p = jVar;
        this.n = context.getApplicationContext();
        k kVar = jVar.m;
        if (!(iVar instanceof com.anythink.core.common.e.g) ? !(!(iVar instanceof q) || ((q) iVar).J() != 1) : !(!(kVar instanceof y) || ((y) kVar).N() != 1)) {
            z = true;
        }
        this.o = z;
        this.k.c(jVar.d);
        this.r = new OfferClickHandler();
    }

    private com.anythink.basead.c.d d() {
        return d.a().a(this.k.d(), this.k.k());
    }

    private boolean e() {
        if (this.k.i() != 42) {
            com.anythink.core.common.e.i iVar = this.k;
            return (iVar instanceof w) && ((w) iVar).a() == 42;
        }
        return true;
    }

    private void f() {
        this.m = true;
    }

    public final void a(a aVar) {
        this.q = aVar;
    }

    public final void c() {
        this.q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(com.anythink.basead.c.i iVar, final boolean z) {
        iVar.i = new com.anythink.basead.c.b();
        com.anythink.basead.c.d d2 = d();
        iVar.i.a = d2 != null ? d2.c : "";
        b.a(23, this.k, iVar);
        if (!TextUtils.isEmpty(this.k.u())) {
            String u = this.k.u();
            String str = this.p.d;
            String replaceAll = u.replaceAll("\\{req_id\\}", str != null ? str : "");
            o.a().a(this.k);
            if (com.anythink.core.basead.a.a.a(this.n, replaceAll, false)) {
                com.anythink.basead.c.a aVar = iVar.g;
                if (aVar != null) {
                    aVar.i = true;
                }
                b.a(9, this.k, iVar);
                com.anythink.core.common.i.c.a(this.p.b, this.k.k(), this.k.d(), replaceAll, "1", 0);
                this.l = false;
                m.a().a(new Runnable() { // from class: com.anythink.basead.a.c.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = c.this.q;
                        if (aVar2 != null) {
                            if (!z) {
                                aVar2.a();
                            }
                            c.this.q.b();
                            c.this.q.a(true);
                        }
                    }
                });
                b.a(24, this.k, iVar);
                return true;
            }
            o.a().b(this.k);
            if (b.a(this.n, this.k.w())) {
                b.a(28, this.k, iVar);
            } else {
                b.a(29, this.k, iVar);
            }
            com.anythink.core.common.i.c.a(this.p.b, this.k.k(), this.k.d(), replaceAll, "0", 0);
        }
        return false;
    }

    public final void a(com.anythink.basead.c.i iVar) {
        if (this.l) {
            return;
        }
        this.l = true;
        this.m = false;
        com.anythink.core.common.j.b.a.a().a(new AnonymousClass1(iVar));
    }

    private boolean a(com.anythink.basead.c.i iVar, boolean z) {
        iVar.i = new com.anythink.basead.c.b();
        com.anythink.basead.c.d d2 = d();
        iVar.i.a = d2 != null ? d2.c : "";
        if (!TextUtils.isEmpty(this.k.j())) {
            String j2 = this.k.j();
            String str = this.p.d;
            String replaceAll = j2.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (com.anythink.core.basead.a.a.a(this.n, replaceAll, false)) {
                com.anythink.basead.c.a aVar = iVar.g;
                if (aVar != null) {
                    aVar.i = true;
                }
                b.a(9, this.k, iVar);
                com.anythink.core.common.i.c.a(this.p.b, this.k.k(), this.k.d(), replaceAll, "1", 1);
                this.l = false;
                m.a().a(new AnonymousClass2(z));
                return true;
            }
            com.anythink.core.common.i.c.a(this.p.b, this.k.k(), this.k.d(), replaceAll, "0", 1);
        }
        return false;
    }

    private void a(int i2, com.anythink.basead.c.i iVar) {
        String str;
        com.anythink.basead.c.d dVar;
        com.anythink.basead.c.d a2;
        boolean z = true;
        if (i2 != 1) {
            m.a().a(new AnonymousClass4());
        }
        str = "";
        String v = this.k.v() != null ? this.k.v() : "";
        String str2 = this.p.d;
        if (str2 == null) {
            str2 = "";
        }
        String a3 = j.a(v.replaceAll("\\{req_id\\}", str2), iVar, System.currentTimeMillis());
        if (e() && this.k.y() == 4) {
            dVar = new com.anythink.basead.c.d("", "", "");
        } else {
            dVar = new com.anythink.basead.c.d(a3, "", "");
        }
        a(dVar);
        int y = this.k.y();
        if (y == 1) {
            if (!a3.startsWith("http")) {
                a(a3, i2, iVar);
                return;
            }
            if (this.o && !TextUtils.isEmpty(this.k.t())) {
                a(this.k.t(), i2, iVar);
                z = false;
            }
            String a4 = a(a3);
            if (z) {
                if (TextUtils.isEmpty(a4)) {
                    a4 = dVar.a;
                }
                a(a4, i2, iVar);
            }
        } else if (y == 2 || y == 3) {
            if (e() && !TextUtils.isEmpty(this.k.u())) {
                str = a(a3);
                String a5 = com.anythink.basead.d.b.a.a.a(str);
                dVar.b = str;
                dVar.c = a5;
                a(dVar);
            }
            if (TextUtils.isEmpty(str)) {
                str = dVar.a;
            }
            a(str, i2, iVar);
        } else if (y != 4) {
            a(TextUtils.isEmpty("") ? dVar.a : "", i2, iVar);
        } else {
            if (e() && TextUtils.isEmpty(dVar.a) && (a2 = com.anythink.basead.d.b.a.a.a(this.p, this.k, a3)) != null) {
                dVar.a = a2.a;
                dVar.c = a2.c;
            }
            String a6 = a(dVar.a);
            dVar.b = a6;
            a(dVar);
            if (TextUtils.isEmpty(a6)) {
                a6 = dVar.a;
            } else {
                iVar.j = true;
            }
            a(a6, i2, iVar);
        }
    }

    public final com.anythink.core.common.e.j b() {
        return this.p;
    }

    private String a(String str) {
        String str2;
        boolean z = false;
        String str3 = str;
        for (int i2 = 0; i2 < 10; i2++) {
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str3).openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("GET");
                        httpURLConnection2.setInstanceFollowRedirects(false);
                        k kVar = this.p.m;
                        if (kVar != null && b.a(9, kVar)) {
                            String i3 = com.anythink.core.common.j.d.i();
                            if (!TextUtils.isEmpty(i3)) {
                                httpURLConnection2.addRequestProperty(sm4.v, i3);
                            }
                        }
                        httpURLConnection2.setConnectTimeout(30000);
                        httpURLConnection2.connect();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                            str3 = httpURLConnection2.getHeaderField("Location");
                            if (!com.anythink.core.basead.a.a.a(str3) && !str3.contains(".apk") && str3.startsWith("http")) {
                                httpURLConnection2.disconnect();
                                httpURLConnection2.disconnect();
                            }
                            z = true;
                        }
                        if (z || responseCode == 200) {
                            httpURLConnection2.disconnect();
                            return str3;
                        }
                        com.anythink.core.common.i.c.a(this.p.b, this.k.k(), this.k.d(), str, str3, String.valueOf(responseCode), "");
                        httpURLConnection2.disconnect();
                        return "";
                    } catch (Exception e2) {
                        e = e2;
                        str2 = str3;
                        httpURLConnection = httpURLConnection2;
                        com.anythink.core.common.i.c.a(this.p.b, this.k.k(), this.k.d(), str, str2, "", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                str2 = str3;
            }
        }
        return "";
    }

    private void a(com.anythink.basead.c.d dVar) {
        d.a().a(this.k.d(), this.k.k(), dVar);
    }

    private void a(String str, int i2, com.anythink.basead.c.i iVar) {
        a aVar;
        a aVar2;
        boolean z = true;
        if (i2 == 1) {
            return;
        }
        if (this.m) {
            this.l = false;
            if ((!TextUtils.isEmpty(this.k.j()) || !TextUtils.isEmpty(this.k.u())) && (aVar2 = this.q) != null) {
                aVar2.a(false);
            }
            b.a(9, this.k, iVar);
            a aVar3 = this.q;
            if (aVar3 != null) {
                aVar3.b();
            }
        } else if (i2 == 0 && b(iVar, true)) {
        } else {
            if ((!TextUtils.isEmpty(this.k.j()) || !TextUtils.isEmpty(this.k.u())) && (aVar = this.q) != null) {
                aVar.a(false);
            }
            if (!TextUtils.isEmpty(this.k.w())) {
                boolean a2 = a(this.n, this.k.w());
                iVar.i = new com.anythink.basead.c.b();
                com.anythink.basead.c.d d2 = d();
                iVar.i.a = d2 != null ? d2.c : "";
                com.anythink.basead.c.a aVar4 = iVar.g;
                if (aVar4 != null) {
                    aVar4.j = a2 ? 5 : aVar4.j;
                }
                if (a2) {
                    b.a(9, this.k, iVar);
                    b.a(25, this.k, iVar);
                    this.l = false;
                    a aVar5 = this.q;
                    if (aVar5 != null) {
                        aVar5.b();
                        return;
                    }
                    return;
                }
                b.a(26, this.k, iVar);
            }
            if (iVar.g != null && this.k.y() == 4) {
                if (iVar.j) {
                    IExHandler b2 = m.a().b();
                    com.anythink.basead.c.a aVar6 = iVar.g;
                    aVar6.j = b2 != null ? b2.checkDownloadType(this.k, this.p) : aVar6.j;
                } else {
                    iVar.g.j = 3;
                }
            }
            b.a(9, this.k, iVar);
            if (TextUtils.isEmpty(str)) {
                str = this.k.t();
            }
            if (TextUtils.isEmpty(str)) {
                m.a().a(new Runnable() { // from class: com.anythink.basead.a.c.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (TextUtils.isEmpty(c.this.k.v())) {
                                Context context = c.this.n;
                                Toast.makeText(context, com.anythink.core.common.j.h.a(context, "basead_click_empty", "string"), 0).show();
                                return;
                            }
                            Context context2 = c.this.n;
                            Toast.makeText(context2, com.anythink.core.common.j.h.a(context2, "basead_click_fail", "string"), 0).show();
                        } catch (Throwable unused) {
                        }
                    }
                });
                this.l = false;
                a aVar7 = this.q;
                if (aVar7 != null) {
                    aVar7.b();
                    return;
                }
                return;
            }
            int y = this.k.y();
            if (y == 1) {
                z = (str == null || str.startsWith("http")) ? false : false;
                if (!com.anythink.core.basead.a.a.a(this.n, str, z) && !z) {
                    if (this.p.m.i() == 2) {
                        com.anythink.core.basead.b.a aVar8 = new com.anythink.core.basead.b.a();
                        aVar8.c = this.k;
                        aVar8.h = this.p;
                        aVar8.f = str;
                        aVar8.g = this.r;
                        WebLandPageActivity.a(this.n, aVar8);
                    } else {
                        com.anythink.core.common.j.k.a(this.n, str);
                    }
                }
            } else if (y == 2) {
                com.anythink.core.common.j.k.a(this.n, str);
            } else if (y == 3) {
                com.anythink.core.basead.b.a aVar9 = new com.anythink.core.basead.b.a();
                aVar9.c = this.k;
                aVar9.h = this.p;
                aVar9.f = str;
                aVar9.g = this.r;
                WebLandPageActivity.a(this.n, aVar9);
            } else if (y != 4) {
                if (this.p.m.i() == 2) {
                    com.anythink.core.basead.b.a aVar10 = new com.anythink.core.basead.b.a();
                    aVar10.c = this.k;
                    aVar10.h = this.p;
                    aVar10.f = str;
                    aVar10.g = this.r;
                    WebLandPageActivity.a(this.n, aVar10);
                } else {
                    com.anythink.core.common.j.k.a(this.n, str);
                }
            } else {
                a(str, iVar);
            }
            this.l = false;
            a aVar11 = this.q;
            if (aVar11 != null) {
                aVar11.b();
            }
        }
    }

    private void a(String str, com.anythink.basead.c.i iVar) {
        if (iVar.j) {
            if (!TextUtils.isEmpty(str)) {
                if (b.a(this.n, this.p, this.k, d(), str, new i())) {
                    return;
                }
            } else {
                com.anythink.core.common.j.k.a(this.n, str);
                return;
            }
        }
        com.anythink.core.common.j.k.a(this.n, str);
    }

    public static boolean a(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268435456);
                context.startActivity(launchIntentForPackage);
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final com.anythink.core.common.e.i a() {
        return this.k;
    }

    public static /* synthetic */ boolean a(c cVar, com.anythink.basead.c.i iVar) {
        iVar.i = new com.anythink.basead.c.b();
        com.anythink.basead.c.d d2 = cVar.d();
        iVar.i.a = d2 != null ? d2.c : "";
        if (!TextUtils.isEmpty(cVar.k.j())) {
            String j2 = cVar.k.j();
            String str = cVar.p.d;
            String replaceAll = j2.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (com.anythink.core.basead.a.a.a(cVar.n, replaceAll, false)) {
                com.anythink.basead.c.a aVar = iVar.g;
                if (aVar != null) {
                    aVar.i = true;
                }
                b.a(9, cVar.k, iVar);
                com.anythink.core.common.i.c.a(cVar.p.b, cVar.k.k(), cVar.k.d(), replaceAll, "1", 1);
                cVar.l = false;
                m.a().a(new AnonymousClass2(false));
                return true;
            }
            com.anythink.core.common.i.c.a(cVar.p.b, cVar.k.k(), cVar.k.d(), replaceAll, "0", 1);
        }
        return false;
    }

    public static /* synthetic */ void a(c cVar, int i2, com.anythink.basead.c.i iVar) {
        String str;
        com.anythink.basead.c.d dVar;
        com.anythink.basead.c.d a2;
        boolean z = true;
        if (i2 != 1) {
            m.a().a(new AnonymousClass4());
        }
        str = "";
        String v = cVar.k.v() != null ? cVar.k.v() : "";
        String str2 = cVar.p.d;
        if (str2 == null) {
            str2 = "";
        }
        String a3 = j.a(v.replaceAll("\\{req_id\\}", str2), iVar, System.currentTimeMillis());
        if (cVar.e() && cVar.k.y() == 4) {
            dVar = new com.anythink.basead.c.d("", "", "");
        } else {
            dVar = new com.anythink.basead.c.d(a3, "", "");
        }
        cVar.a(dVar);
        int y = cVar.k.y();
        if (y == 1) {
            if (!a3.startsWith("http")) {
                cVar.a(a3, i2, iVar);
                return;
            }
            if (cVar.o && !TextUtils.isEmpty(cVar.k.t())) {
                cVar.a(cVar.k.t(), i2, iVar);
                z = false;
            }
            String a4 = cVar.a(a3);
            if (z) {
                if (TextUtils.isEmpty(a4)) {
                    a4 = dVar.a;
                }
                cVar.a(a4, i2, iVar);
            }
        } else if (y == 2 || y == 3) {
            if (cVar.e() && !TextUtils.isEmpty(cVar.k.u())) {
                str = cVar.a(a3);
                String a5 = com.anythink.basead.d.b.a.a.a(str);
                dVar.b = str;
                dVar.c = a5;
                cVar.a(dVar);
            }
            if (TextUtils.isEmpty(str)) {
                str = dVar.a;
            }
            cVar.a(str, i2, iVar);
        } else if (y != 4) {
            cVar.a(TextUtils.isEmpty("") ? dVar.a : "", i2, iVar);
        } else {
            if (cVar.e() && TextUtils.isEmpty(dVar.a) && (a2 = com.anythink.basead.d.b.a.a.a(cVar.p, cVar.k, a3)) != null) {
                dVar.a = a2.a;
                dVar.c = a2.c;
            }
            String a6 = cVar.a(dVar.a);
            dVar.b = a6;
            cVar.a(dVar);
            if (TextUtils.isEmpty(a6)) {
                a6 = dVar.a;
            } else {
                iVar.j = true;
            }
            cVar.a(a6, i2, iVar);
        }
    }
}