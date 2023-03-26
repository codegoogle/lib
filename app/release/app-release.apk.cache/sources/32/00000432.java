package com.anythink.basead.a;

import android.text.TextUtils;
import com.anythink.core.common.e.x;
import com.anythink.core.common.e.z;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(int i, x xVar, @x1 com.anythink.basead.c.i iVar) {
        String str;
        String[] strArr;
        z Q = xVar.Q();
        if (Q == null) {
            return;
        }
        Map<String, Object> c = com.anythink.core.common.j.h.c(Q.c());
        try {
            switch (i) {
                case 1:
                    strArr = Q.g();
                    break;
                case 2:
                    strArr = Q.h();
                    break;
                case 3:
                    strArr = Q.i();
                    break;
                case 4:
                    strArr = Q.j();
                    break;
                case 5:
                    strArr = Q.k();
                    break;
                case 6:
                    strArr = Q.p();
                    break;
                case 7:
                    strArr = Q.q();
                    break;
                case 8:
                    strArr = Q.e();
                    break;
                case 9:
                    strArr = Q.f();
                    break;
                case 10:
                    strArr = Q.d();
                    break;
                case 11:
                    strArr = Q.l();
                    break;
                case 12:
                    strArr = Q.n();
                    break;
                case 13:
                    strArr = Q.o();
                    break;
                case 14:
                    strArr = Q.m();
                    break;
                case 15:
                    strArr = Q.Q();
                    break;
                case 16:
                    strArr = Q.R();
                    break;
                case 17:
                    strArr = Q.S();
                    break;
                case 18:
                    strArr = Q.r();
                    break;
                case 19:
                    strArr = Q.s();
                    break;
                case 20:
                    strArr = Q.T();
                    break;
                case 21:
                    strArr = Q.t();
                    break;
                case 22:
                default:
                    strArr = null;
                    break;
                case 23:
                    strArr = Q.U();
                    break;
                case 24:
                    strArr = Q.V();
                    break;
                case 25:
                    strArr = Q.W();
                    break;
                case 26:
                    strArr = Q.X();
                    break;
                case 27:
                    strArr = Q.Y();
                    break;
                case 28:
                    strArr = Q.v();
                    break;
                case 29:
                    strArr = Q.u();
                    break;
                case 30:
                    strArr = Q.w();
                    break;
                case 31:
                    strArr = Q.x();
                    break;
                case 32:
                    com.anythink.basead.c.j jVar = iVar.h;
                    Map<Integer, String[]> y = Q.y();
                    if (jVar != null && y != null) {
                        strArr = y.get(Integer.valueOf(jVar.i));
                        break;
                    }
                    strArr = null;
                    break;
                case 33:
                    strArr = Q.a();
                    break;
                case 34:
                    strArr = Q.b();
                    break;
            }
            if (strArr != null) {
                long currentTimeMillis = System.currentTimeMillis();
                for (String str2 : strArr) {
                    new com.anythink.basead.g.e(i, a(str2, iVar, currentTimeMillis), xVar, c).a(0, (com.anythink.core.common.g.h) null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        switch (i) {
            case 1:
                str = Q.C();
                break;
            case 2:
                str = Q.D();
                break;
            case 3:
                str = Q.E();
                break;
            case 4:
                str = Q.F();
                break;
            case 5:
                str = Q.G();
                break;
            case 6:
                str = Q.L();
                break;
            case 7:
                str = Q.M();
                break;
            case 8:
                str = Q.A();
                break;
            case 9:
                str = Q.B();
                break;
            case 10:
                str = Q.z();
                break;
            case 11:
                str = Q.H();
                break;
            case 12:
                str = Q.J();
                break;
            case 13:
                str = Q.K();
                break;
            case 14:
                str = Q.I();
                break;
            case 15:
                str = Q.Z();
                break;
            case 16:
                str = Q.aa();
                break;
            case 17:
                str = Q.ab();
                break;
            case 18:
                str = Q.N();
                break;
            case 19:
                str = Q.O();
                break;
            case 20:
                str = Q.ac();
                break;
            case 21:
                str = Q.P();
                break;
            case 22:
            case 32:
            default:
                str = "";
                break;
            case 23:
                str = Q.ad();
                break;
            case 24:
                str = Q.ae();
                break;
            case 25:
                str = Q.af();
                break;
            case 26:
                str = Q.ag();
                break;
            case 27:
                str = Q.ah();
                break;
            case 28:
                str = Q.aj();
                break;
            case 29:
                str = Q.ai();
                break;
            case 30:
                str = Q.ak();
                break;
            case 31:
                str = Q.al();
                break;
            case 33:
                str = Q.am();
                break;
            case 34:
                str = Q.an();
                break;
        }
        if (a(str)) {
            return;
        }
        com.anythink.basead.g.f fVar = new com.anythink.basead.g.f(i, xVar, str, c);
        fVar.b(iVar.b);
        fVar.a(0, (com.anythink.core.common.g.h) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void a(int i, x xVar, z zVar, Map<String, Object> map, @x1 com.anythink.basead.c.i iVar) {
        String[] strArr;
        try {
            switch (i) {
                case 1:
                    strArr = zVar.g();
                    break;
                case 2:
                    strArr = zVar.h();
                    break;
                case 3:
                    strArr = zVar.i();
                    break;
                case 4:
                    strArr = zVar.j();
                    break;
                case 5:
                    strArr = zVar.k();
                    break;
                case 6:
                    strArr = zVar.p();
                    break;
                case 7:
                    strArr = zVar.q();
                    break;
                case 8:
                    strArr = zVar.e();
                    break;
                case 9:
                    strArr = zVar.f();
                    break;
                case 10:
                    strArr = zVar.d();
                    break;
                case 11:
                    strArr = zVar.l();
                    break;
                case 12:
                    strArr = zVar.n();
                    break;
                case 13:
                    strArr = zVar.o();
                    break;
                case 14:
                    strArr = zVar.m();
                    break;
                case 15:
                    strArr = zVar.Q();
                    break;
                case 16:
                    strArr = zVar.R();
                    break;
                case 17:
                    strArr = zVar.S();
                    break;
                case 18:
                    strArr = zVar.r();
                    break;
                case 19:
                    strArr = zVar.s();
                    break;
                case 20:
                    strArr = zVar.T();
                    break;
                case 21:
                    strArr = zVar.t();
                    break;
                case 22:
                default:
                    strArr = null;
                    break;
                case 23:
                    strArr = zVar.U();
                    break;
                case 24:
                    strArr = zVar.V();
                    break;
                case 25:
                    strArr = zVar.W();
                    break;
                case 26:
                    strArr = zVar.X();
                    break;
                case 27:
                    strArr = zVar.Y();
                    break;
                case 28:
                    strArr = zVar.v();
                    break;
                case 29:
                    strArr = zVar.u();
                    break;
                case 30:
                    strArr = zVar.w();
                    break;
                case 31:
                    strArr = zVar.x();
                    break;
                case 32:
                    com.anythink.basead.c.j jVar = iVar.h;
                    Map<Integer, String[]> y = zVar.y();
                    if (jVar != null && y != null) {
                        strArr = y.get(Integer.valueOf(jVar.i));
                        break;
                    }
                    strArr = null;
                    break;
                case 33:
                    strArr = zVar.a();
                    break;
                case 34:
                    strArr = zVar.b();
                    break;
            }
            if (strArr != null) {
                long currentTimeMillis = System.currentTimeMillis();
                for (String str : strArr) {
                    new com.anythink.basead.g.e(i, a(str, iVar, currentTimeMillis), xVar, map).a(0, (com.anythink.core.common.g.h) null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(int i, @x1 com.anythink.basead.c.i iVar, x xVar, z zVar, Map<String, Object> map) {
        String str;
        switch (i) {
            case 1:
                str = zVar.C();
                break;
            case 2:
                str = zVar.D();
                break;
            case 3:
                str = zVar.E();
                break;
            case 4:
                str = zVar.F();
                break;
            case 5:
                str = zVar.G();
                break;
            case 6:
                str = zVar.L();
                break;
            case 7:
                str = zVar.M();
                break;
            case 8:
                str = zVar.A();
                break;
            case 9:
                str = zVar.B();
                break;
            case 10:
                str = zVar.z();
                break;
            case 11:
                str = zVar.H();
                break;
            case 12:
                str = zVar.J();
                break;
            case 13:
                str = zVar.K();
                break;
            case 14:
                str = zVar.I();
                break;
            case 15:
                str = zVar.Z();
                break;
            case 16:
                str = zVar.aa();
                break;
            case 17:
                str = zVar.ab();
                break;
            case 18:
                str = zVar.N();
                break;
            case 19:
                str = zVar.O();
                break;
            case 20:
                str = zVar.ac();
                break;
            case 21:
                str = zVar.P();
                break;
            case 22:
            case 32:
            default:
                str = "";
                break;
            case 23:
                str = zVar.ad();
                break;
            case 24:
                str = zVar.ae();
                break;
            case 25:
                str = zVar.af();
                break;
            case 26:
                str = zVar.ag();
                break;
            case 27:
                str = zVar.ah();
                break;
            case 28:
                str = zVar.aj();
                break;
            case 29:
                str = zVar.ai();
                break;
            case 30:
                str = zVar.ak();
                break;
            case 31:
                str = zVar.al();
                break;
            case 33:
                str = zVar.am();
                break;
            case 34:
                str = zVar.an();
                break;
        }
        if (a(str)) {
            return;
        }
        com.anythink.basead.g.f fVar = new com.anythink.basead.g.f(i, xVar, str, map);
        fVar.b(iVar.b);
        fVar.a(0, (com.anythink.core.common.g.h) null);
    }

    public static String a(String str, com.anythink.basead.c.i iVar, long j) {
        String sb;
        String sb2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (iVar.g != null) {
            str = a(str, iVar);
        }
        com.anythink.basead.c.j jVar = iVar.h;
        if (jVar != null) {
            str = a(str, jVar);
        }
        com.anythink.basead.c.b bVar = iVar.i;
        if (bVar != null) {
            str = a(str, bVar);
        }
        long j2 = j / 1000;
        if (iVar.c == 0) {
            sb = "__REQ_WIDTH__";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(iVar.c);
            sb = sb3.toString();
        }
        String replaceAll = str.replaceAll("\\{__REQ_WIDTH__\\}", sb);
        if (iVar.d == 0) {
            sb2 = "__REQ_HEIGHT__";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(iVar.d);
            sb2 = sb4.toString();
        }
        return wo1.A(new StringBuilder(), iVar.f, wo1.A(new StringBuilder(), iVar.e, replaceAll.replaceAll("\\{__REQ_HEIGHT__\\}", sb2), "\\{__WIDTH__\\}"), "\\{__HEIGHT__\\}").replaceAll("\\{__TS__\\}", String.valueOf(j2)).replaceAll("\\{__TS_MSEC__\\}", String.valueOf(j)).replaceAll("\\{__END_TS__\\}", String.valueOf(j2)).replaceAll("\\{__END_TS_MSEC__\\}", String.valueOf(j)).replaceAll("\\{__PLAY_SEC__\\}", "0").replaceAll("\\{", "").replaceAll("\\}", "");
    }

    private static String a(String str, com.anythink.basead.c.j jVar) {
        String A = wo1.A(new StringBuilder(), jVar.h, wo1.A(new StringBuilder(), jVar.u, wo1.A(new StringBuilder(), jVar.r, wo1.A(new StringBuilder(), jVar.o, wo1.A(new StringBuilder(), jVar.l, wo1.A(new StringBuilder(), jVar.e, wo1.A(new StringBuilder(), jVar.d, wo1.A(new StringBuilder(), jVar.c, wo1.A(new StringBuilder(), jVar.b, wo1.A(new StringBuilder(), jVar.a, str, "\\{__VIDEO_TIME__\\}"), "\\{__BEGIN_TIME__\\}"), "\\{__END_TIME__\\}"), "\\{__PLAY_FIRST_FRAME__\\}"), "\\{__PLAY_LAST_FRAME__\\}"), "\\{__SCENE__\\}"), "\\{__TYPE__\\}"), "\\{__BEHAVIOR__\\}"), "\\{__STATUS__\\}"), "\\{__PLAY_SEC__\\}");
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f / 1000);
        String replaceAll = A.replaceAll("\\{__TS__\\}", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.f);
        String replaceAll2 = replaceAll.replaceAll("\\{__TS_MSEC__\\}", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(jVar.g / 1000);
        String replaceAll3 = replaceAll2.replaceAll("\\{__END_TS__\\}", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(jVar.g);
        String replaceAll4 = replaceAll3.replaceAll("\\{__END_TS_MSEC__\\}", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(jVar.h / 1000);
        return wo1.A(new StringBuilder(), jVar.h, replaceAll4.replaceAll("\\{__PLAY_SEC__\\}", sb5.toString()), "\\{__PLAY_MSEC__\\}");
    }

    private static String a(String str, com.anythink.basead.c.b bVar) {
        String str2 = bVar.a;
        if (str2 == null) {
            str2 = "";
        }
        return str.replaceAll("\\{__CLICK_ID__\\}", str2);
    }

    private static String a(String str, com.anythink.basead.c.i iVar) {
        String str2;
        String replaceAll;
        String str3 = "{}";
        com.anythink.basead.c.a aVar = iVar.g;
        int i = iVar.e;
        int i2 = iVar.f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", aVar.e);
            jSONObject.put("down_y", aVar.f);
            jSONObject.put("up_x", aVar.g);
            jSONObject.put("up_y", aVar.h);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            float f = i;
            jSONObject2.put("down_x", (int) ((aVar.e / f) * 1000.0f));
            float f2 = i2;
            jSONObject2.put("down_y", (int) ((aVar.e / f2) * 1000.0f));
            jSONObject2.put("up_x", (int) ((aVar.g / f) * 1000.0f));
            jSONObject2.put("up_y", (int) ((aVar.h / f2) * 1000.0f));
        } catch (JSONException unused2) {
        }
        try {
            str2 = URLEncoder.encode(jSONObject.toString(), "utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            str2 = "{}";
        }
        try {
            str3 = URLEncoder.encode(jSONObject2.toString(), "utf-8");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        String replaceAll2 = wo1.A(new StringBuilder(), aVar.h, wo1.A(new StringBuilder(), aVar.g, wo1.A(new StringBuilder(), aVar.f, wo1.A(new StringBuilder(), aVar.e, wo1.A(new StringBuilder(), aVar.d, wo1.A(new StringBuilder(), aVar.c, wo1.A(new StringBuilder(), aVar.b, wo1.A(new StringBuilder(), aVar.a, str, "\\{__DOWN_X__\\}"), "\\{__DOWN_Y__\\}"), "\\{__UP_X__\\}"), "\\{__UP_Y__\\}"), "\\{__RE_DOWN_X__\\}"), "\\{__RE_DOWN_Y__\\}"), "\\{__RE_UP_X__\\}"), "\\{__RE_UP_Y__\\}").replaceAll("\\{ABSOLUTE_COORD\\}", str2).replaceAll("\\{RELATIVE_COORD\\}", str3).replaceAll("\\{__DPLINK_TYPE__\\}", String.valueOf(aVar.i ? 1 : 2));
        if (aVar.i) {
            replaceAll2 = replaceAll2.replaceAll("&apk_ptype=\\{apk_ptype\\}", "");
        }
        int i3 = aVar.j;
        if (i3 == -1) {
            replaceAll = replaceAll2.replaceAll("&apk_ptype=\\{apk_ptype\\}", "");
        } else {
            replaceAll = replaceAll2.replaceAll("\\{apk_ptype\\}", String.valueOf(i3));
        }
        return replaceAll.replaceAll("\\{opdptype\\}", aVar.i ? "1" : "0");
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return new JSONObject(str).length() <= 0;
    }
}