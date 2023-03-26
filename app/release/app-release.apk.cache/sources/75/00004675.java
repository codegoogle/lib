package com.p7700g.p99005;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.p7700g.p99005.xu0;
import java.text.DecimalFormat;
import org.json.JSONObject;

/* compiled from: EventConnection.java */
/* loaded from: classes2.dex */
public class hg1 extends gg1 {
    public static final String b = "VpnException:";
    @x1
    private static final DecimalFormat c = new DecimalFormat("0.00");
    @x1
    private final gj1 d;
    @x1
    private String e;
    private long f;
    private int g;
    private int h;
    @x1
    private String i;
    @x1
    private String j;
    @z1
    private String k;
    @x1
    private String l;
    @x1
    private String m;
    @x1
    private String n;
    @x1
    private String o;
    @x1
    private sc1 p;
    @x1
    private String q;
    @xu0.d
    @z1
    private String r;
    @x1
    private Bundle s;
    @x1
    private String t;
    @z1
    private String u;
    private boolean v;
    private int w;

    /* compiled from: EventConnection.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            sc1.values();
            int[] iArr = new int[21];
            a = iArr;
            try {
                iArr[sc1.WiFi.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[sc1.xRTT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[sc1.CDMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[sc1.EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[sc1.EVDO_0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[sc1.EVDO_A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[sc1.GPRS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[sc1.GSM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[sc1.HSDPA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[sc1.HSPA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[sc1.HSUPA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[sc1.UMTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[sc1.EHRPD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[sc1.EVDO_B.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[sc1.HSPAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[sc1.IDEN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[sc1.IWLAN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[sc1.LTE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[sc1.TD_SCDMA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[sc1.NO_CONNECTION.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public hg1(@x1 String str) {
        super(str);
        this.d = new gj1((String) r81.f(a()));
        this.e = "";
        this.h = -1;
        this.i = "";
        this.j = "";
        this.k = null;
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = sc1.UNKNOWN;
        this.q = "";
        this.s = new Bundle();
        this.t = "";
        this.u = null;
        this.v = false;
        this.w = 0;
    }

    @x1
    private String O(@x1 Throwable th) {
        return Log.getStackTraceString(th);
    }

    @x1
    private String d() {
        try {
            return l().put(xu0.f.s, q()).put(xu0.f.t, this.k).toString();
        } catch (Throwable unused) {
            return this.l;
        }
    }

    @x1
    private static String g(@x1 sc1 sc1Var) {
        switch (sc1Var.ordinal()) {
            case 0:
                return xu0.a.a;
            case 1:
                return xu0.a.b;
            case 2:
                return xu0.a.c;
            case 3:
                return xu0.a.d;
            case 4:
                return xu0.a.e;
            case 5:
                return xu0.a.f;
            case 6:
                return xu0.a.g;
            case 7:
                return xu0.a.h;
            case 8:
                return xu0.a.i;
            case 9:
                return xu0.a.j;
            case 10:
                return xu0.a.k;
            case 11:
                return xu0.a.l;
            case 12:
                return xu0.a.m;
            case 13:
                return xu0.a.n;
            case 14:
                return xu0.a.o;
            case 15:
                return xu0.a.p;
            case 16:
                return xu0.a.q;
            case 17:
                return xu0.a.r;
            case 18:
                return xu0.a.s;
            case 19:
            default:
                return "unknown";
            case 20:
                return xu0.a.t;
        }
    }

    @x1
    private JSONObject l() {
        try {
            return new JSONObject(this.l);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    @z1
    private JSONObject q() {
        try {
            if (this.u != null) {
                return new JSONObject(this.u);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @x1
    public hg1 A(@x1 String str) {
        this.j = str;
        this.g = 7;
        return this;
    }

    @x1
    public hg1 B(@x1 Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.remove(xu0.f.s);
        bundle2.remove(xu0.f.r);
        this.s = bundle2;
        return this;
    }

    @x1
    public hg1 C(boolean z) {
        this.v = z;
        return this;
    }

    @x1
    public hg1 D(@x1 String str) {
        this.q = str;
        return this;
    }

    @x1
    public hg1 E(@x1 sc1 sc1Var) {
        this.p = sc1Var;
        return this;
    }

    @x1
    public hg1 F(@x1 String str) {
        this.l = str;
        return this;
    }

    @x1
    public hg1 G(@x1 String str) {
        this.e = str;
        return this;
    }

    @x1
    public hg1 H(@x1 @xu0.d String str) {
        this.r = str;
        return this;
    }

    @x1
    public hg1 I(int i) {
        this.w = i;
        return this;
    }

    @x1
    public hg1 J(@z1 String str) {
        this.u = str;
        return this;
    }

    @x1
    public hg1 K(@x1 String str) {
        this.m = str;
        return this;
    }

    @x1
    public hg1 L(int i) {
        this.h = i;
        return this;
    }

    @x1
    public hg1 M(@x1 String str) {
        this.n = str;
        return this;
    }

    @x1
    public hg1 N(@x1 String str) {
        this.o = str;
        return this;
    }

    @Override // com.p7700g.p99005.gg1
    @x1
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putAll(this.s);
        bundle.putLong(xu0.f.d, this.f);
        bundle.putInt(xu0.f.h, this.g);
        bundle.putInt(xu0.f.i, this.v ? 1 : 0);
        bundle.putInt(xu0.f.r, this.w);
        int i = this.h;
        if (i >= 0) {
            bundle.putInt(xu0.f.w, i);
        }
        w(bundle, xu0.f.c, this.i);
        w(bundle, "error", this.j);
        w(bundle, xu0.f.e, this.t);
        w(bundle, xu0.f.l, d());
        w(bundle, xu0.f.m, this.e);
        w(bundle, xu0.f.v, this.m);
        v(bundle, "reason", this.r);
        w(bundle, "session_id", this.n);
        w(bundle, xu0.f.j, this.o);
        w(bundle, xu0.f.E, g(this.p));
        w(bundle, xu0.f.F, this.q);
        return bundle;
    }

    @x1
    public hg1 c(@z1 Throwable th) {
        this.j = "";
        this.k = null;
        if (th instanceof fc1) {
            th = th.getCause();
        }
        if (th == null) {
            this.g = 0;
        } else {
            this.k = O(th);
            if (th instanceof kc1) {
                int code = ((kc1) th).getCode();
                if (kc1.g(code)) {
                    StringBuilder H = wo1.H(b, code, ":");
                    H.append(th.getMessage());
                    this.j = H.toString();
                    this.g = 2;
                } else {
                    StringBuilder G = wo1.G(b);
                    G.append(th.getMessage());
                    this.j = G.toString();
                    this.g = 1;
                    this.d.a(th);
                }
            } else if (!(th instanceof ac1) && !(th instanceof xb1)) {
                if (th instanceof rb1) {
                    StringBuilder G2 = wo1.G(b);
                    G2.append(th.getMessage());
                    this.j = G2.toString();
                    this.g = 6;
                } else if (th instanceof eo1) {
                    this.j = ((gc1) th).toTrackerName();
                    this.g = 4;
                    this.d.a(th);
                } else if (th instanceof gc1) {
                    this.j = ((gc1) th).toTrackerName();
                    this.g = 1;
                    this.d.a(th);
                } else {
                    this.j = th.getClass().getSimpleName();
                    this.g = 1;
                    this.d.a(th);
                }
            } else {
                StringBuilder G3 = wo1.G(b);
                G3.append(th.getMessage());
                this.j = G3.toString();
                this.g = 4;
            }
            if (TextUtils.isEmpty(this.j) || this.j.length() < 5) {
                this.j = "UnknownError: check details";
            }
        }
        return this;
    }

    @x1
    public String e() {
        return this.i;
    }

    public long f() {
        return this.f;
    }

    @x1
    public Bundle h() {
        return this.s;
    }

    @x1
    public String i() {
        return this.j;
    }

    public int j() {
        return this.g;
    }

    @x1
    public String k() {
        return this.l;
    }

    @x1
    public String m() {
        return this.e;
    }

    @xu0.d
    @z1
    public String n() {
        return this.r;
    }

    public int o() {
        return this.w;
    }

    @z1
    public String p() {
        return this.u;
    }

    @x1
    public String r() {
        return this.m;
    }

    public int s() {
        return this.h;
    }

    @x1
    public String t() {
        return this.n;
    }

    @x1
    public String u() {
        return this.o;
    }

    public void v(@x1 Bundle bundle, @x1 String str, @z1 String str2) {
        if (str2 != null && str2.length() != 0) {
            bundle.putString(str, str2);
            return;
        }
        throw new IllegalArgumentException(wo1.u("Value with key ", str, " must be non empty"));
    }

    public void w(@x1 Bundle bundle, @x1 String str, @z1 String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    @x1
    public hg1 x(@x1 String str) {
        this.i = str;
        return this;
    }

    @x1
    public hg1 y(@x1 ti1 ti1Var) {
        this.i = ti1Var.d();
        this.f = ti1Var.e();
        return this;
    }

    @x1
    public hg1 z(long j) {
        this.f = j;
        return this;
    }
}