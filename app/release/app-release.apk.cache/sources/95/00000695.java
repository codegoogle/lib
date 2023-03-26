package com.anythink.core.common.i;

import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.i;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.e;
import com.anythink.core.common.e.g;
import com.anythink.core.common.e.h;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.w;
import com.anythink.core.common.e.x;
import com.p7700g.p99005.wo1;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class c {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 0;
    public static final int g = 1;

    public static void b(e eVar, AdError adError) {
        h hVar = new h();
        hVar.a = "1004636";
        hVar.b = eVar.T();
        hVar.d = eVar.S();
        hVar.g = String.valueOf(eVar.H());
        hVar.k = String.valueOf(eVar.E());
        hVar.l = String.valueOf(eVar.Q());
        hVar.m = String.valueOf(eVar.G());
        hVar.n = eVar.w();
        hVar.o = String.valueOf(eVar.z());
        hVar.p = adError.getCode();
        hVar.q = adError.getPlatformCode();
        hVar.r = adError.getPlatformMSG();
        com.anythink.core.c.d a2 = com.anythink.core.c.e.a(m.a().e()).a(eVar.S());
        hVar.j = a2 != null ? a2.P() : "";
        hVar.A = eVar.U();
        a(hVar);
    }

    public static void a(e eVar, AdError adError) {
        try {
            h hVar = new h();
            hVar.a = "1004630";
            hVar.b = eVar.T();
            hVar.d = eVar.S();
            hVar.l = String.valueOf(eVar.Q());
            hVar.g = String.valueOf(eVar.H());
            hVar.k = String.valueOf(eVar.E());
            com.anythink.core.c.d a2 = com.anythink.core.c.e.a(m.a().e()).a(eVar.S());
            hVar.j = a2 != null ? a2.P() : "";
            if (adError != null) {
                hVar.m = adError.printStackTrace();
                hVar.n = adError.getCode();
            }
            hVar.A = eVar.U();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2, int i, int i2, int i3, String str3, String str4, int i4, int i5, AdError adError, int i6, double d2, long j, int i7, int i8, int i9) {
        h hVar = new h();
        hVar.a = "1004631";
        hVar.b = str;
        hVar.d = str2;
        hVar.g = String.valueOf(i);
        hVar.k = String.valueOf(i2);
        hVar.l = String.valueOf(i7);
        hVar.m = String.valueOf(i3);
        hVar.n = str3;
        hVar.o = String.valueOf(i4);
        hVar.p = String.valueOf(i5);
        hVar.q = adError != null ? adError.getPlatformCode() : "";
        hVar.r = adError != null ? adError.getPlatformMSG() : "";
        hVar.s = String.valueOf(i6);
        hVar.t = String.valueOf(d2);
        if (i5 == 0) {
            hVar.u = String.valueOf(j);
        }
        hVar.v = String.valueOf(i8);
        hVar.w = String.valueOf(i9);
        com.anythink.core.c.d a2 = com.anythink.core.c.e.a(m.a().e()).a(str2);
        hVar.j = a2 != null ? a2.P() : "";
        hVar.A = str4;
        a(hVar);
    }

    public static void b() {
        h hVar = new h();
        hVar.a = "1004666";
        a(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(h hVar, String str) {
        String str2;
        String str3 = hVar.a;
        str3.hashCode();
        char c2 = 65535;
        switch (str3.hashCode()) {
            case 1958138321:
                if (str3.equals("1004631")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1958138324:
                if (str3.equals("1004634")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1958138326:
                if (str3.equals("1004636")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1958138329:
                if (str3.equals("1004639")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1958138351:
                if (str3.equals("1004640")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1958138354:
                if (str3.equals("1004643")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1958138357:
                if (str3.equals("1004646")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                str2 = hVar.m;
                break;
            case 5:
                str2 = hVar.q;
                break;
            default:
                str2 = null;
                break;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (TextUtils.equals(str2, jSONArray.optString(i))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static void a(e eVar, int i, AdError adError) {
        try {
            a(eVar.T(), eVar.S(), eVar.H(), eVar.E(), eVar.G(), eVar.w(), eVar.U(), -1, i, adError, eVar.u(), eVar.v(), 0L, eVar.Q(), eVar.K(), eVar.q);
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, int i, AdError adError, long j) {
        try {
            a(eVar.T(), eVar.S(), eVar.H(), eVar.E(), eVar.G(), eVar.w(), eVar.U(), eVar.y(), i, adError, eVar.u(), eVar.v(), j, eVar.Q(), eVar.K(), eVar.q);
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, int i, String str, String str2) {
        try {
            h hVar = new h();
            hVar.a = "1004633";
            hVar.b = eVar.T();
            hVar.d = eVar.S();
            hVar.g = String.valueOf(eVar.H());
            hVar.k = String.valueOf(eVar.E());
            hVar.l = String.valueOf(eVar.Q());
            hVar.m = String.valueOf(i);
            hVar.n = str;
            hVar.q = str2;
            if (TextUtils.equals(str2, eVar.T())) {
                hVar.r = "0";
            } else {
                hVar.r = "1";
            }
            com.anythink.core.c.d a2 = com.anythink.core.c.e.a(m.a().e()).a(eVar.S());
            hVar.j = a2 != null ? a2.P() : "";
            hVar.A = eVar.U();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, boolean z) {
        if (m.a().G()) {
            i.a().a(9, eVar);
        }
        h hVar = new h();
        hVar.a = "1004634";
        hVar.b = eVar.T();
        hVar.d = eVar.S();
        hVar.g = String.valueOf(eVar.H());
        hVar.k = String.valueOf(eVar.E());
        hVar.l = String.valueOf(eVar.Q());
        hVar.m = String.valueOf(eVar.G());
        hVar.n = eVar.w();
        hVar.o = String.valueOf(eVar.z());
        hVar.p = z ? "1" : "0";
        hVar.q = String.valueOf(eVar.z);
        com.anythink.core.c.d a2 = com.anythink.core.c.e.a(m.a().e()).a(eVar.S());
        hVar.j = a2 != null ? a2.P() : "";
        hVar.A = eVar.U();
        a(hVar);
    }

    public static void a(final e eVar, final boolean z, final int i, final int i2, final String str, final int i3, final String str2, final String str3, final String str4, final boolean z2, final String str5) {
        try {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.i.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    h hVar = new h();
                    hVar.a = "1004632";
                    hVar.b = e.this.T();
                    hVar.d = e.this.S();
                    hVar.g = String.valueOf(e.this.H());
                    hVar.k = String.valueOf(e.this.E());
                    hVar.l = String.valueOf(e.this.Q());
                    hVar.m = z ? "1" : "0";
                    hVar.n = String.valueOf(i);
                    hVar.o = String.valueOf(i2);
                    hVar.p = str;
                    hVar.q = String.valueOf(i3);
                    hVar.r = str2;
                    hVar.s = str3;
                    String str6 = str4;
                    hVar.t = str6;
                    if (TextUtils.equals(str6, e.this.T())) {
                        hVar.u = "0";
                    } else {
                        hVar.u = "1";
                    }
                    if (z2) {
                        hVar.v = "1";
                    } else {
                        hVar.v = "0";
                    }
                    hVar.w = str5;
                    com.anythink.core.c.d a2 = com.anythink.core.c.e.a(m.a().e()).a(e.this.S());
                    hVar.j = a2 != null ? a2.P() : "";
                    hVar.A = e.this.U();
                    c.a(hVar);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        h hVar = new h();
        hVar.a = "1004616";
        hVar.d = str5;
        hVar.m = str;
        hVar.n = str2;
        hVar.o = str3;
        hVar.p = str4;
        hVar.q = str6;
        hVar.r = str7;
        hVar.d = str5;
        a(hVar);
    }

    public static void a(String str, String str2, long j, long j2, long j3) {
        h hVar = new h();
        hVar.a = "1004635";
        if (!TextUtils.isEmpty(str2)) {
            hVar.d = str2;
        }
        hVar.m = str;
        hVar.n = String.valueOf(j);
        hVar.o = String.valueOf(j2);
        hVar.p = String.valueOf(j3);
        a(hVar);
    }

    public static void a(String str, String str2, String str3, String str4) {
        h hVar = new h();
        hVar.a = "1004637";
        hVar.d = str;
        hVar.m = str2;
        hVar.n = str3;
        hVar.o = str4;
        a(hVar);
    }

    public static void a(String str, String str2, String str3, String str4, long j, String str5, long j2, long j3, int i, long j4) {
        h hVar = new h();
        hVar.a = "1004638";
        hVar.d = str;
        hVar.m = str2;
        hVar.n = str3;
        hVar.o = str4;
        hVar.p = String.valueOf(j);
        hVar.q = str5;
        hVar.r = String.valueOf(j2);
        hVar.s = String.valueOf(j3);
        hVar.t = "1".equals(str4) ? String.valueOf(j4) : null;
        hVar.u = String.valueOf(i);
        a(hVar);
    }

    public static void a(e eVar) {
        try {
            h hVar = new h();
            hVar.a = "1004640";
            hVar.b = eVar.T();
            hVar.g = String.valueOf(eVar.H());
            hVar.l = String.valueOf(eVar.Q());
            hVar.d = eVar.S();
            hVar.m = String.valueOf(eVar.G());
            hVar.n = eVar.w();
            hVar.o = String.valueOf(eVar.y());
            hVar.p = String.valueOf(eVar.I());
            hVar.q = String.valueOf(eVar.J());
            hVar.A = eVar.U();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, String str) {
        try {
            h hVar = new h();
            hVar.a = "1004639";
            hVar.b = eVar.T();
            hVar.d = eVar.S();
            hVar.l = String.valueOf(eVar.Q());
            hVar.g = String.valueOf(eVar.H());
            hVar.m = String.valueOf(eVar.G());
            hVar.n = eVar.w();
            hVar.o = String.valueOf(eVar.y());
            hVar.p = str;
            hVar.A = eVar.U();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(int i, int i2, int i3, int i4) {
        h hVar = new h();
        hVar.a = "1004641";
        hVar.m = String.valueOf(i);
        hVar.n = String.valueOf(i2);
        hVar.o = String.valueOf(i3);
        hVar.p = String.valueOf(i4);
        a(hVar);
    }

    public static void a(String str, String str2, String str3, int i, String str4, long j, long j2) {
        h hVar = new h();
        hVar.a = "1004642";
        hVar.b = str;
        hVar.m = str2;
        hVar.n = str3;
        hVar.o = String.valueOf(i);
        if (i == 3) {
            hVar.p = str4;
        } else if (i == 2) {
            hVar.q = String.valueOf(j);
            hVar.r = String.valueOf(((float) j2) / 1024.0f);
        }
        a(hVar);
    }

    public static void a(int i, long j, long j2, String str) {
        h hVar = new h();
        hVar.a = "1004644";
        hVar.e = str;
        hVar.m = String.valueOf(i);
        hVar.n = String.valueOf(j);
        hVar.o = String.valueOf(j2);
        hVar.p = String.valueOf(j2 - j);
        a(hVar);
    }

    private static void a(int i, long j, long j2, String str, String str2) {
        h hVar = new h();
        hVar.a = "1004651";
        hVar.e = str;
        hVar.m = String.valueOf(i);
        hVar.n = String.valueOf(j2 - j);
        hVar.o = str2;
        a(hVar);
    }

    public static void a(e eVar, boolean z, long j, long j2, long j3) {
        try {
            h hVar = new h();
            hVar.a = "1004643";
            hVar.b = eVar.T();
            hVar.d = eVar.S();
            hVar.g = String.valueOf(eVar.H());
            hVar.k = String.valueOf(eVar.E());
            hVar.l = String.valueOf(eVar.Q());
            hVar.m = eVar.U();
            hVar.n = String.valueOf(j);
            hVar.o = String.valueOf(j2);
            hVar.p = String.valueOf(j3);
            hVar.q = String.valueOf(eVar.G());
            hVar.r = eVar.w();
            hVar.s = String.valueOf(eVar.z());
            hVar.t = String.valueOf(eVar.z);
            hVar.u = z ? "1" : "0";
            com.anythink.core.c.d a2 = com.anythink.core.c.e.a(m.a().e()).a(eVar.S());
            hVar.j = a2 != null ? a2.P() : "";
            hVar.A = eVar.U();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, com.anythink.core.c.d dVar, String str, String str2) {
        try {
            h hVar = new h();
            hVar.a = "1004658";
            hVar.b = eVar.T();
            hVar.d = eVar.S();
            hVar.g = String.valueOf(eVar.H());
            hVar.k = String.valueOf(eVar.E());
            hVar.l = String.valueOf(eVar.Q());
            hVar.j = dVar != null ? dVar.P() : "";
            hVar.m = String.valueOf(eVar.G());
            hVar.n = eVar.w();
            hVar.o = eVar.k();
            hVar.p = eVar.d();
            hVar.q = eVar.C;
            hVar.r = str;
            hVar.s = str2;
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2, com.anythink.core.c.d dVar, String str3) {
        h hVar = new h();
        hVar.a = "1004646";
        hVar.b = str;
        hVar.d = str2;
        hVar.g = String.valueOf(dVar.Z());
        hVar.l = String.valueOf(dVar.J());
        hVar.j = dVar.P();
        hVar.t = String.valueOf(str3);
        a(hVar);
    }

    public static void a(String str, String str2, String str3) {
        h hVar = new h();
        hVar.a = "1004647";
        hVar.e = str3;
        hVar.m = str2;
        hVar.n = str;
        a(hVar);
    }

    public static void a(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        h hVar = new h();
        hVar.a = "1004648";
        hVar.d = str;
        hVar.m = str2;
        hVar.n = String.valueOf(i);
        hVar.o = str3;
        hVar.p = str4;
        hVar.q = str5;
        hVar.r = str6;
        a(hVar);
    }

    public static void a(String str, String str2, int i, String str3, String str4, int i2) {
        h hVar = new h();
        hVar.a = "1004650";
        hVar.d = str;
        hVar.m = str2;
        hVar.n = String.valueOf(i);
        hVar.o = str3;
        hVar.p = str4;
        hVar.q = String.valueOf(i2);
        a(hVar);
    }

    public static void a(com.anythink.core.common.e.i iVar, j jVar, String str, String str2) {
        h hVar = new h();
        hVar.a = "1004652";
        hVar.d = jVar.b;
        hVar.m = String.valueOf(jVar.f);
        hVar.n = jVar.c;
        if (iVar instanceof q) {
            hVar.o = "1";
        } else if (iVar instanceof g) {
            hVar.o = "2";
        } else if (iVar instanceof w) {
            hVar.o = "3";
        }
        hVar.p = str;
        if (TextUtils.equals("0", str)) {
            hVar.q = str2;
        }
        hVar.r = iVar.k();
        hVar.s = iVar.l();
        hVar.t = iVar.w();
        hVar.u = iVar.m();
        hVar.v = iVar.n();
        hVar.w = iVar.o();
        hVar.x = iVar.p();
        hVar.y = iVar.s();
        try {
            if (iVar instanceof x) {
                StringBuilder sb = new StringBuilder();
                String S = ((x) iVar).S();
                if (!TextUtils.isEmpty(S)) {
                    JSONArray jSONArray = new JSONArray(S);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        sb.append(jSONArray.optString(i));
                        sb.append(",");
                    }
                    if (sb.length() > 1) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    hVar.z = sb.toString();
                }
            }
        } catch (Throwable unused) {
        }
        a(hVar);
    }

    public static void a() {
        h hVar = new h();
        hVar.a = "1004657";
        a(hVar);
    }

    public static void a(e eVar, af afVar, double d2, String str) {
        h hVar = new h();
        hVar.a = "1004659";
        hVar.b = eVar.T();
        hVar.d = eVar.S();
        hVar.g = String.valueOf(eVar.H());
        hVar.l = String.valueOf(eVar.Q());
        hVar.j = eVar.R();
        hVar.m = String.valueOf(afVar.c());
        hVar.n = afVar.t();
        hVar.o = String.valueOf(d2);
        hVar.p = str;
        a(hVar);
    }

    public static void a(af afVar, com.anythink.core.common.e.a aVar, long j, boolean z, boolean z2) {
        h hVar = new h();
        hVar.a = "1004660";
        com.anythink.core.c.d dVar = aVar.n;
        hVar.b = aVar.c;
        hVar.d = aVar.d;
        hVar.g = String.valueOf(dVar != null ? Integer.valueOf(dVar.Z()) : "");
        hVar.l = String.valueOf(dVar != null ? Integer.valueOf(dVar.J()) : "");
        hVar.j = dVar != null ? dVar.P() : "";
        hVar.m = String.valueOf(afVar.c());
        hVar.n = afVar.t();
        hVar.o = z ? "1" : "2";
        hVar.p = String.valueOf(j);
        hVar.q = z2 ? "1" : "2";
        a(hVar);
    }

    public static void a(String str, af afVar, boolean z, long j) {
        h hVar = new h();
        hVar.a = "1004665";
        hVar.d = str;
        hVar.m = String.valueOf(afVar.c());
        hVar.n = afVar.t();
        hVar.o = String.valueOf(z ? 1 : 2);
        hVar.p = String.valueOf(j);
        a(hVar);
    }

    public static void a(int i, String str, String str2, String str3) {
        h hVar = new h();
        hVar.a = "1004667";
        hVar.m = String.valueOf(i);
        hVar.n = str;
        hVar.o = str2;
        hVar.p = str3;
        a(hVar);
    }

    public static void a(e eVar, int i, String str, double d2, String str2, String str3) {
        h hVar = new h();
        hVar.a = "1004668";
        hVar.d = eVar.S();
        hVar.m = String.valueOf(i);
        hVar.n = str;
        hVar.o = String.valueOf(d2);
        hVar.p = str2;
        hVar.q = str3;
        hVar.j = eVar.R();
        hVar.g = String.valueOf(eVar.H());
        hVar.l = String.valueOf(eVar.Q());
        a(hVar);
    }

    public static void a(e eVar, String str, String str2) {
        h hVar = new h();
        hVar.a = "1004669";
        hVar.b = eVar.T();
        hVar.d = eVar.S();
        hVar.m = String.valueOf(eVar.G());
        hVar.n = str;
        hVar.o = str2;
        hVar.j = eVar.R();
        hVar.g = String.valueOf(eVar.H());
        hVar.l = String.valueOf(eVar.Q());
        a(hVar);
    }

    public static void a(final h hVar) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.i.c.2
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
                if (r0.contains(r1.A) != false) goto L35;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z;
                if (TextUtils.isEmpty(h.this.e)) {
                    h.this.e = m.a().p();
                }
                if (!TextUtils.isEmpty(h.this.d)) {
                    h.this.f = m.a().e(h.this.d);
                }
                h.this.i = String.valueOf(System.currentTimeMillis());
                com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(m.a().e()));
                if (l0 != null) {
                    String af = l0.af();
                    if (!TextUtils.isEmpty(af) && c.b(h.this, af)) {
                        return;
                    }
                    Map<String, String> ad = l0.ad();
                    boolean z2 = true;
                    if (ad != null) {
                        if (TextUtils.isEmpty(h.this.A)) {
                            z = ad.containsKey(h.this.a);
                        } else {
                            if (ad.containsKey(h.this.a)) {
                                String str = ad.get(h.this.a);
                                if (!TextUtils.isEmpty(str) && str.contains(h.this.A)) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                    }
                    Map<String, String> ab = l0.ab();
                    if (ab != null) {
                        if (TextUtils.isEmpty(h.this.A)) {
                            z2 = ab.containsKey(h.this.a);
                        } else {
                            if (ab.containsKey(h.this.a)) {
                                String str2 = ab.get(h.this.a);
                                if (!TextUtils.isEmpty(str2)) {
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            d.a(m.a().e()).a((d) h.this);
                            return;
                        }
                    }
                }
                b.a().a(h.this);
            }
        });
    }
}