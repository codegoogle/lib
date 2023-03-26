package com.anythink.expressad.video.module.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.r;
import com.anythink.expressad.foundation.h.v;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class k extends f {
    public static final int V = 2;
    public static final int a = 1;
    public boolean W;
    public com.anythink.expressad.foundation.d.c X;
    public boolean Y;
    public com.anythink.expressad.videocommon.b.a Z;
    public com.anythink.expressad.videocommon.c.c aa;
    public String ab;
    public String ac;
    public com.anythink.expressad.video.module.a.a ad;
    public int ae;
    private boolean af = false;
    private boolean ag = false;
    private boolean ah = false;

    public k(com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.b.a aVar, com.anythink.expressad.videocommon.c.c cVar2, String str, String str2, com.anythink.expressad.video.module.a.a aVar2, int i, boolean z) {
        this.Y = false;
        this.ad = new f();
        this.ae = 1;
        if (!z && cVar != null && v.b(str2) && aVar != null && aVar2 != null) {
            this.X = cVar;
            this.ac = str;
            this.ab = str2;
            this.Z = aVar;
            this.aa = cVar2;
            this.ad = aVar2;
            this.W = true;
            this.ae = i;
            this.Y = false;
        } else if (!z || cVar == null || !v.b(str2) || aVar2 == null) {
        } else {
            this.X = cVar;
            this.ac = str;
            this.ab = str2;
            this.Z = aVar;
            this.aa = cVar2;
            this.ad = aVar2;
            this.W = true;
            this.ae = i;
            this.Y = true;
        }
    }

    private static void h() {
    }

    private static void i() {
    }

    private static void j() {
        com.anythink.expressad.videocommon.b.c.a().a(false);
    }

    private static void k() {
    }

    private void l() {
        if (!this.W || com.anythink.expressad.foundation.g.a.f.k == null || TextUtils.isEmpty(this.X.aZ())) {
            return;
        }
        com.anythink.expressad.foundation.g.a.f.a(this.ab, this.X, "reward");
    }

    private static void m() {
    }

    private static void n() {
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        this.ad.a(i, obj);
    }

    public final void b(int i) {
        com.anythink.expressad.foundation.d.c cVar = this.X;
        if (cVar != null) {
            String aj = cVar.aj();
            if (TextUtils.isEmpty(aj)) {
                return;
            }
            if (i == 1 || i == 2) {
                if (!aj.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(aj);
                    if (aj.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i);
                    }
                    aj = sb.toString();
                } else if (i == 2) {
                    if (aj.contains("endscreen_type=1")) {
                        aj = aj.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (aj.contains("endscreen_type=2")) {
                    aj = aj.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.X.o(aj);
            }
        }
    }

    public final void c() {
        Map<String, Long> map;
        String str;
        try {
            com.anythink.expressad.foundation.d.c cVar = this.X;
            if (cVar != null && cVar.j() && this.Y && !this.X.k()) {
                this.ag = true;
            } else if (!this.W || TextUtils.isEmpty(this.X.ak()) || (map = com.anythink.expressad.foundation.g.a.f.h) == null || map.containsKey(this.X.ak()) || this.ag) {
            } else {
                com.anythink.expressad.foundation.g.a.f.h.put(this.X.ak(), Long.valueOf(System.currentTimeMillis()));
                String ak = this.X.ak();
                if (this.X.m() == 1) {
                    str = ak + "&to=1&cbt=" + this.X.aB() + "&tmorl=" + this.ae;
                } else {
                    str = ak + "&to=0&cbt=" + this.X.aB() + "&tmorl=" + this.ae;
                }
                String str2 = str;
                if (!this.Y) {
                    if (this.X.k()) {
                        com.anythink.expressad.a.a.a(com.anythink.core.common.b.m.a().e(), this.X, this.ab, str2, false, true, com.anythink.expressad.a.a.a.j);
                    }
                } else {
                    com.anythink.expressad.a.a.a(com.anythink.core.common.b.m.a().e(), this.X, this.ab, str2, true);
                }
                this.ag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void d() {
        String str;
        try {
            if (!this.W || this.af || TextUtils.isEmpty(this.X.ai())) {
                return;
            }
            this.af = true;
            String ai = this.X.ai();
            if (this.X.m() == 1) {
                str = ai + "&to=1&cbt=" + this.X.aB() + "&tmorl=" + this.ae;
            } else {
                str = ai + "&to=0&cbt=" + this.X.aB() + "&tmorl=" + this.ae;
            }
            com.anythink.expressad.a.a.a(com.anythink.core.common.b.m.a().e(), this.X, this.ab, str, false, true, com.anythink.expressad.a.a.a.i);
            com.anythink.expressad.video.module.b.a.a(com.anythink.core.common.b.m.a().e(), this.X);
            if (!this.W || com.anythink.expressad.foundation.g.a.f.k == null || TextUtils.isEmpty(this.X.aZ())) {
                return;
            }
            com.anythink.expressad.foundation.g.a.f.a(this.ab, this.X, "reward");
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(f.U, th.getMessage(), th);
        }
    }

    public final void e() {
        com.anythink.expressad.foundation.d.c cVar;
        List<String> e;
        try {
            if (!this.W || this.ah || (cVar = this.X) == null) {
                return;
            }
            this.ah = true;
            if ((cVar.j() && this.Y && !this.X.k()) || this.Y || (e = this.X.e()) == null || e.size() <= 0) {
                return;
            }
            for (String str : e) {
                com.anythink.expressad.a.a.a(com.anythink.core.common.b.m.a().e(), this.X, this.ab, str, true);
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.d(f.U, th.getMessage());
        }
    }

    public final void f() {
        com.anythink.expressad.foundation.d.c cVar = this.X;
        if (cVar == null || TextUtils.isEmpty(cVar.I()) || this.X.J() == null || this.X.J().n() == null) {
            return;
        }
        Context e = com.anythink.core.common.b.m.a().e();
        com.anythink.expressad.foundation.d.c cVar2 = this.X;
        com.anythink.expressad.a.a.a(e, cVar2, cVar2.I(), this.X.J().n(), false);
    }

    public final void g() {
        com.anythink.expressad.videocommon.b.a aVar;
        try {
            if (!this.W || (aVar = this.Z) == null) {
                return;
            }
            if (aVar.k() != null && !TextUtils.isEmpty(this.Z.k().R())) {
                com.anythink.expressad.foundation.c.d.a(com.anythink.expressad.foundation.c.c.a(com.anythink.core.common.b.m.a().e())).c(this.Z.k().R());
            }
            if (TextUtils.isEmpty(this.Z.d())) {
                return;
            }
            File file = new File(this.Z.d());
            if (file.exists() && file.isFile() && file.delete()) {
                com.anythink.expressad.foundation.h.n.a(f.U, "DEL File :" + file.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(int i) {
        if (this.X != null) {
            if (i == 1 || i == 2) {
                com.anythink.expressad.video.module.b.a.a(com.anythink.core.common.b.m.a().e(), this.X, i, this.ae);
            }
        }
    }

    public final void a() {
        if (!this.W || this.X == null) {
            return;
        }
        com.anythink.core.common.b.m.a();
        new r(r.q, this.X.aZ(), this.X.aa(), this.X.ab(), this.ab, com.anythink.expressad.foundation.h.j.a()).a(this.X.F() ? r.aQ : r.aR);
    }

    public final void a(int i, String str) {
        if (this.X != null) {
            com.anythink.core.common.b.m.a();
            new r(r.r, this.X.aZ(), this.X.aa(), this.X.ab(), this.ab, com.anythink.expressad.foundation.h.j.a(), i, str);
        }
    }

    public final void b() {
        com.anythink.expressad.videocommon.b.a aVar = this.Z;
        if (aVar != null) {
            aVar.b(true);
        }
    }
}