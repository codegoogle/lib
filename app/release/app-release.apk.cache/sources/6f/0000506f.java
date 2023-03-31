package com.p7700g.p99005;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.api.ATSDK;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.google.ads.vServices;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.crashes.utils.ErrorLogHelper;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.zg3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Ads.java */
/* loaded from: classes3.dex */
public class mf3 {
    private static Activity a = null;
    public static final String b = "Ads";
    public static String c = "";
    public static n d = null;
    public static boolean e = true;
    public static ro1 f;
    private static final boolean g = true;

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ Dialog s;

        /* compiled from: Ads.java */
        /* renamed from: com.p7700g.p99005.mf3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0216a implements Runnable {
            public RunnableC0216a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                mf3.g();
            }
        }

        public a(final Dialog val$dialog) {
            this.s = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.s.dismiss();
            this.s.cancel();
            new Handler().postDelayed(new RunnableC0216a(), 2000L);
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Dialog s;

        public b(final Dialog val$dialog) {
            this.s = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.s.dismiss();
            this.s.cancel();
            mf3.g();
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Dialog s;
        public final /* synthetic */ Activity t;
        public final /* synthetic */ n u;

        /* compiled from: Ads.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                mf3.j(cVar.t, cVar.u);
            }
        }

        public c(final Dialog val$dialog, final Activity val$activity, final n val$madsInitListner) {
            this.s = val$dialog;
            this.t = val$activity;
            this.u = val$madsInitListner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.s.dismiss();
            this.s.cancel();
            new Handler().postDelayed(new a(), 2000L);
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ Activity s;
        public final /* synthetic */ Dialog t;
        public final /* synthetic */ n u;

        /* compiled from: Ads.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                mf3.j(dVar.s, dVar.u);
            }
        }

        public d(final Activity val$activity, final Dialog val$dialog, final n val$madsInitListner) {
            this.s = val$activity;
            this.t = val$dialog;
            this.u = val$madsInitListner;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                this.s.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
            } catch (Exception e) {
                this.t.dismiss();
                this.t.cancel();
                new Handler().postDelayed(new a(), 2000L);
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class e implements to1 {
        @Override // com.p7700g.p99005.to1
        public void a(int responseCode) {
            if (responseCode != 0) {
                if (responseCode == 1) {
                    yg3.i(bh3.t0, "");
                    return;
                } else if (responseCode != 2) {
                    return;
                } else {
                    yg3.i(bh3.t0, "");
                    return;
                }
            }
            try {
                String d = mf3.f.b().d();
                if (!d.contains("google-play") && !d.contains("(not%20set)")) {
                    yg3.i(bh3.t0, "false");
                }
                yg3.i(bh3.t0, "true");
            } catch (RemoteException e) {
                yg3.i(bh3.t0, "");
                e.printStackTrace();
            }
        }

        @Override // com.p7700g.p99005.to1
        public void b() {
            yg3.i(bh3.t0, "");
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class f implements jz5<kr5> {
        @Override // com.p7700g.p99005.jz5
        public void a(hz5<kr5> call, Throwable t) {
            n nVar = mf3.d;
            StringBuilder G = wo1.G("apiCallForGetData onResponse -> ");
            G.append(t.getMessage());
            nVar.a(G.toString());
            ih3.S();
            t.printStackTrace();
        }

        @Override // com.p7700g.p99005.jz5
        public void b(hz5<kr5> call, xz5<kr5> response) {
            if (response.b() == 200) {
                if (response.a() != null) {
                    try {
                        String E = response.a().E();
                        if (E != null) {
                            mf3.i(new JSONArray(E));
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        ih3.S();
                        String str = "apiCallForGetData Exception -> " + response.b() + "" + response.e();
                        n nVar = mf3.d;
                        StringBuilder G = wo1.G("apiCallForGetData Exception -> ");
                        G.append(response.b());
                        G.append("");
                        G.append(response.e());
                        nVar.a(G.toString());
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            }
            ih3.S();
            String str2 = "apiCallForGetData Exception -> " + response.b() + "" + response.e();
            n nVar2 = mf3.d;
            StringBuilder G2 = wo1.G("apiCallForGetData Exception -> ");
            G2.append(response.b());
            G2.append("");
            G2.append(response.e());
            nVar2.a(G2.toString());
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class g implements g13 {
        @Override // com.p7700g.p99005.g13
        public void a(@x1 s13 initErrors) {
            String str = "Sdk onInitFailed :--> " + initErrors;
        }

        @Override // com.p7700g.p99005.g13
        public void onInitSuccess() {
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class h implements vServices.f {
        @Override // com.lib.adssdk.vServices.f
        public void a(boolean isconnect) {
            mf3.f();
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class i implements Runnable {

        /* compiled from: Ads.java */
        /* loaded from: classes3.dex */
        public class a implements wg3 {
            public a() {
            }

            @Override // com.p7700g.p99005.wg3
            public void H1() {
                mf3.d.c();
            }
        }

        /* compiled from: Ads.java */
        /* loaded from: classes3.dex */
        public class b implements wg3 {
            public b() {
            }

            @Override // com.p7700g.p99005.wg3
            public void H1() {
                mf3.d.c();
            }
        }

        /* compiled from: Ads.java */
        /* loaded from: classes3.dex */
        public class c implements wg3 {
            public c() {
            }

            @Override // com.p7700g.p99005.wg3
            public void H1() {
                mf3.d.c();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (yg3.e(bh3.b).equals("2")) {
                ng3.b(mf3.a, new a());
            } else if (yg3.e(bh3.b).equals("3")) {
                ng3.a(mf3.a, new b());
            } else if (yg3.e(bh3.b).equals("4")) {
                ng3.c(mf3.a, new c());
            } else {
                mf3.d.c();
            }
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            mf3.a.finishAffinity();
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class k implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                mf3.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(yg3.e(bh3.L0))));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class l implements View.OnClickListener {
        public final /* synthetic */ Dialog s;

        /* compiled from: Ads.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                mf3.g();
            }
        }

        public l(final Dialog val$dialog) {
            this.s = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.s.dismiss();
            this.s.cancel();
            new Handler().postDelayed(new a(), 2000L);
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public class m implements ua1<en1> {

        /* compiled from: Ads.java */
        /* loaded from: classes3.dex */
        public class a implements va1 {
            public a() {
            }

            @Override // com.p7700g.p99005.va1
            public void a(@x1 gc1 e) {
                e.getMessage();
            }

            @Override // com.p7700g.p99005.va1
            public void complete() {
            }
        }

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 gc1 e) {
        }

        @Override // com.p7700g.p99005.ua1
        /* renamed from: c */
        public void b(@x1 en1 vpnState) {
            String str = "disconnectVpn connectted -> " + vpnState;
            if (vpnState == en1.CONNECTED) {
                k51.g().e().f(xu0.e.a, new a());
            }
        }
    }

    /* compiled from: Ads.java */
    /* loaded from: classes3.dex */
    public interface n {
        void a(String error);

        void b();

        void c();
    }

    public static void e() {
        ((lh3) kh3.a().g(lh3.class)).a(a.getPackageName() + ErrorLogHelper.ERROR_LOG_FILE_EXTENSION).m(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        int i2 = 0;
        try {
            i2 = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        String valueOf = String.valueOf(i2);
        if (!yg3.e(bh3.J0).equals("")) {
            if (!yg3.e(bh3.J0).equals(valueOf)) {
                r();
                return;
            } else {
                n();
                return;
            }
        }
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g() {
        if (k()) {
            if (!m()) {
                if (yg3.e(bh3.t0).equals("")) {
                    ro1 a2 = ro1.d(a).a();
                    f = a2;
                    a2.e(new e());
                }
                e();
                ug3.f(a);
                return;
            }
            o();
            return;
        }
        p();
    }

    private static void h() {
        k51.n(new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(JSONArray jsonObject2) {
        try {
            d.b();
            for (int i2 = 0; i2 < jsonObject2.length(); i2++) {
                JSONObject jSONObject = jsonObject2.getJSONObject(i2);
                String str = bh3.B0;
                yg3.i(str, jSONObject.getString(str));
                try {
                    String str2 = bh3.A0;
                    yg3.i(str2, jSONObject.getString(str2));
                    String str3 = bh3.J0;
                    yg3.i(str3, jSONObject.getString(str3));
                    String str4 = bh3.K0;
                    yg3.i(str4, jSONObject.getString(str4));
                    String str5 = bh3.L0;
                    yg3.i(str5, jSONObject.getString(str5));
                    String str6 = bh3.D0;
                    yg3.i(str6, jSONObject.getString(str6));
                    String str7 = bh3.E0;
                    yg3.i(str7, jSONObject.getString(str7));
                    String str8 = bh3.F0;
                    yg3.i(str8, jSONObject.getString(str8));
                    String str9 = bh3.G0;
                    yg3.i(str9, jSONObject.getString(str9));
                    String str10 = bh3.H0;
                    yg3.i(str10, jSONObject.getString(str10));
                    String str11 = bh3.I0;
                    yg3.i(str11, jSONObject.getString(str11));
                    String str12 = bh3.C0;
                    yg3.i(str12, jSONObject.getString(str12));
                    String str13 = bh3.M0;
                    yg3.i(str13, jSONObject.getString(str13));
                    String str14 = bh3.N0;
                    yg3.i(str14, jSONObject.getString(str14));
                    String str15 = bh3.O0;
                    yg3.i(str15, jSONObject.getString(str15));
                    String str16 = bh3.a;
                    yg3.i(str16, jSONObject.getString(str16));
                    String str17 = bh3.b;
                    yg3.i(str17, jSONObject.getString(str17));
                    String str18 = bh3.c;
                    yg3.i(str18, jSONObject.getString(str18));
                    String str19 = bh3.d;
                    yg3.i(str19, jSONObject.getString(str19));
                    String str20 = bh3.e;
                    yg3.i(str20, jSONObject.getString(str20));
                    String str21 = bh3.f;
                    yg3.i(str21, jSONObject.getString(str21));
                    String str22 = bh3.g;
                    yg3.i(str22, jSONObject.getString(str22));
                    String str23 = bh3.h;
                    yg3.i(str23, jSONObject.getString(str23));
                    String str24 = bh3.k;
                    yg3.i(str24, jSONObject.getString(str24));
                    String str25 = bh3.l;
                    yg3.i(str25, jSONObject.getString(str25));
                    String str26 = bh3.m;
                    yg3.i(str26, jSONObject.getString(str26));
                    String str27 = bh3.i;
                    yg3.i(str27, jSONObject.getString(str27));
                    String str28 = bh3.j;
                    yg3.i(str28, jSONObject.getString(str28));
                    String str29 = bh3.n;
                    yg3.i(str29, jSONObject.getString(str29));
                    String str30 = bh3.o;
                    yg3.i(str30, jSONObject.getString(str30));
                    String str31 = bh3.p;
                    yg3.i(str31, jSONObject.getString(str31));
                    String str32 = bh3.q;
                    yg3.i(str32, jSONObject.getString(str32));
                    String str33 = bh3.r;
                    yg3.i(str33, jSONObject.getString(str33));
                    String str34 = bh3.s;
                    yg3.i(str34, jSONObject.getString(str34));
                    String str35 = bh3.t;
                    yg3.i(str35, jSONObject.getString(str35));
                    String str36 = bh3.u;
                    yg3.i(str36, jSONObject.getString(str36));
                    String str37 = bh3.w;
                    yg3.i(str37, jSONObject.getString(str37));
                    String str38 = bh3.v;
                    yg3.i(str38, jSONObject.getString(str38));
                    String str39 = bh3.x;
                    yg3.i(str39, jSONObject.getString(str39));
                    String str40 = bh3.y;
                    yg3.i(str40, jSONObject.getString(str40));
                    String str41 = bh3.z;
                    yg3.i(str41, jSONObject.getString(str41));
                    String str42 = bh3.A;
                    yg3.i(str42, jSONObject.getString(str42));
                    String str43 = bh3.B;
                    yg3.i(str43, jSONObject.getString(str43));
                    String str44 = bh3.C;
                    yg3.i(str44, jSONObject.getString(str44));
                    String str45 = bh3.D;
                    yg3.i(str45, jSONObject.getString(str45));
                    String str46 = bh3.E;
                    yg3.i(str46, jSONObject.getString(str46));
                    String str47 = bh3.F;
                    yg3.i(str47, jSONObject.getString(str47));
                    String str48 = bh3.G;
                    yg3.i(str48, jSONObject.getString(str48));
                    String str49 = bh3.z0;
                    yg3.i(str49, jSONObject.getString(str49));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("qureka_ads");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(bh3.H);
                    String str50 = bh3.H;
                    yg3.i(str50, jSONObject3.getString(str50));
                    String str51 = bh3.I;
                    yg3.i(str51, jSONObject3.getString(str51));
                    String str52 = bh3.J;
                    yg3.i(str52, jSONObject3.getString(str52));
                    String str53 = bh3.K;
                    yg3.i(str53, jSONObject3.getString(str53));
                    JSONObject jSONObject4 = jSONObject2.getJSONObject("qureka_interstitial");
                    String str54 = bh3.L;
                    yg3.i(str54, jSONObject4.getString(str54));
                    String str55 = bh3.M;
                    yg3.i(str55, jSONObject4.getString(str55));
                    JSONArray jSONArray = jSONObject4.getJSONArray("qureka_int_ads");
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i3);
                        xg3 xg3Var = new xg3();
                        xg3Var.f(jSONObject5.getString("qureka_int"));
                        xg3Var.j(jSONObject5.getString("qureka_open_image_url"));
                        xg3Var.g(jSONObject5.getString("qureka_int_image_show"));
                        xg3Var.i(jSONObject5.getString("qureka_int_image_top"));
                        xg3Var.h(jSONObject5.getString("qureka_int_image_ss"));
                        arrayList.add(xg3Var);
                    }
                    yg3.h(arrayList);
                    JSONObject jSONObject6 = jSONObject2.getJSONObject("qureka_native");
                    String str56 = bh3.N;
                    yg3.i(str56, jSONObject6.getString(str56));
                    String str57 = bh3.O;
                    yg3.i(str57, jSONObject6.getString(str57));
                    String str58 = bh3.P;
                    yg3.i(str58, jSONObject6.getString(str58));
                    String str59 = bh3.Q;
                    yg3.i(str59, jSONObject6.getString(str59));
                    String str60 = bh3.z0;
                    yg3.i(str60, jSONObject.getString(str60));
                    yg3.i(bh3.R, jSONObject.getString("ads_btn_color_start"));
                    yg3.i(bh3.S, jSONObject.getString("ads_btn_color_end"));
                    yg3.i(bh3.T, jSONObject.getString("ads_btn_color_border_start"));
                    yg3.i(bh3.U, jSONObject.getString("ads_btn_color_border_end"));
                    yg3.i(bh3.V, jSONObject.getString("ads_btn_color_gradiant_angle"));
                    yg3.i(bh3.W, jSONObject.getString("ads_btn_color_gradiant_border_angle"));
                    yg3.i(bh3.X, jSONObject.getString("ads_btn_color_text"));
                    yg3.i(bh3.Y, jSONObject.getString("ads_btn_text"));
                    yg3.i(bh3.Z, jSONObject.getString("ads_btn_height"));
                    yg3.i(bh3.a0, jSONObject.getString("ads_btn_border_height"));
                    yg3.i(bh3.b0, jSONObject.getString("ads_btn_radius"));
                    yg3.i(bh3.c0, jSONObject.getString("ad_text_primary"));
                    String str61 = bh3.d0;
                    yg3.i(str61, jSONObject.getString(str61));
                    String str62 = bh3.e0;
                    yg3.i(str62, jSONObject.getString(str62));
                    String str63 = bh3.f0;
                    yg3.i(str63, jSONObject.getString(str63));
                    String str64 = bh3.g0;
                    yg3.i(str64, jSONObject.getString(str64));
                    String str65 = bh3.h0;
                    yg3.i(str65, jSONObject.getString(str65));
                    String str66 = bh3.k0;
                    yg3.i(str66, jSONObject.getString(str66));
                    String str67 = bh3.i0;
                    yg3.i(str67, jSONObject.getString(str67));
                    String str68 = bh3.j0;
                    yg3.i(str68, jSONObject.getString(str68));
                    String str69 = bh3.l0;
                    yg3.i(str69, jSONObject.getString(str69));
                    String str70 = bh3.m0;
                    yg3.i(str70, jSONObject.getString(str70));
                    String str71 = bh3.p0;
                    yg3.i(str71, jSONObject.getString(str71));
                    try {
                        GreedyGameAds.w(new AppConfig.Builder(yg3.b()).withAppId(yg3.e(bh3.p0)).enableFacebookAds(true).enableAdmobAds(true).enableCrashReporting(true).setAdRequestTimeoutInSeconds(0).enableDebug(false).enableCcpa(true).enableCoppa(true).enableDNTLocation(true).enableInstallTracking(true).build(), new g());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        e2.getMessage();
                    }
                    String str72 = bh3.o0;
                    yg3.i(str72, jSONObject.getString(str72));
                    AppCenter.start(yg3.b(), yg3.e(bh3.o0), Analytics.class, Crashes.class);
                    String str73 = bh3.n0;
                    yg3.i(str73, jSONObject.getString(str73));
                    IronSource.init(a, yg3.e(bh3.n0));
                    ATSDK.init(yg3.b(), yg3.e(bh3.z), yg3.e(bh3.A));
                    String str74 = bh3.r0;
                    yg3.i(str74, jSONObject.getString(str74));
                    String str75 = bh3.s0;
                    yg3.i(str75, jSONObject.getString(str75));
                    String str76 = bh3.u0;
                    yg3.i(str76, jSONObject.getString(str76));
                    String str77 = bh3.v0;
                    yg3.i(str77, jSONObject.getString(str77));
                    String str78 = bh3.w0;
                    yg3.i(str78, jSONObject.getString(str78));
                    String str79 = bh3.x0;
                    yg3.i(str79, jSONObject.getString(str79));
                    String str80 = bh3.y0;
                    yg3.i(str80, jSONObject.getString(str80));
                } catch (Exception e3) {
                    e3.getMessage();
                    e3.printStackTrace();
                }
                if (yg3.e(bh3.B0).equals("1")) {
                    f();
                } else if (yg3.e(bh3.s0).equals("1")) {
                    f();
                } else {
                    if (!yg3.e(bh3.u0).equals("1") && !yg3.e(bh3.u0).equals("2")) {
                        f();
                    }
                    if (yg3.e(bh3.u0).equals("1")) {
                        Intent intent = new Intent(a, vServices.class);
                        intent.setAction(vServices.v);
                        a.startService(intent);
                        vServices.g(a, new h());
                    } else {
                        f();
                    }
                }
                String str81 = bh3.q0;
                yg3.i(str81, jSONObject.getString(str81));
                jm3.q1(a);
                jm3.L2(yg3.e(bh3.q0));
            }
        } catch (Exception e4) {
            n nVar = d;
            StringBuilder G = wo1.G("getallkey Exception -> ");
            G.append(e4.getMessage());
            nVar.a(G.toString());
            e4.getMessage();
            ih3.S();
            e4.printStackTrace();
        }
    }

    public static void j(Activity activity, n madsInitListner) {
        a = activity;
        try {
            if (e) {
                d = madsInitListner;
                g();
            } else if (Settings.Secure.getInt(activity.getContentResolver(), "adb_enabled", 0) == 1) {
                s(activity, madsInitListner);
            } else {
                d = madsInitListner;
                g();
            }
        } catch (Exception e2) {
            d = madsInitListner;
            g();
            e2.printStackTrace();
        }
    }

    private static boolean k() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a.getSystemService("connectivity");
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    private static boolean l() {
        String host;
        int port;
        try {
            if (g) {
                host = System.getProperty("http.proxyHost");
                String property = System.getProperty("http.proxyPort");
                if (property == null) {
                    property = "-1";
                }
                port = Integer.parseInt(property);
            } else {
                host = Proxy.getHost(a);
                port = Proxy.getPort(a);
            }
            return (host == null && port == -1) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean m() {
        NetworkInfo networkInfo = ((ConnectivityManager) a.getSystemService("connectivity")).getNetworkInfo(17);
        if (networkInfo == null) {
            return false;
        }
        return networkInfo.isConnected();
    }

    private static void n() {
        if (!yg3.e(bh3.d0).equals("")) {
            String[] split = yg3.e(bh3.d0).split("\\|");
            if (split.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : split) {
                    arrayList.add(str);
                }
                if (arrayList.contains(bh3.Q0)) {
                    of3.a(a);
                }
                if (arrayList.contains(bh3.R0)) {
                    sf3.a(a);
                }
                if (arrayList.contains(bh3.U0)) {
                    wf3.a(a);
                }
                if (arrayList.contains(bh3.V0)) {
                    jg3.a(a);
                }
                if (arrayList.contains(bh3.S0)) {
                    fg3.a(a);
                }
            }
        }
        if (!yg3.e(bh3.e0).equals("")) {
            String[] split2 = yg3.e(bh3.e0).split("\\|");
            if (split2.length != 0) {
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : split2) {
                    arrayList2.add(str2);
                }
                if (arrayList2.contains(bh3.Q0)) {
                    nf3.a(a);
                }
                if (arrayList2.contains(bh3.S0)) {
                    eg3.a(a);
                }
            }
        }
        if (!yg3.e(bh3.f0).equals("")) {
            String[] split3 = yg3.e(bh3.f0).split("\\|");
            if (split3.length != 0) {
                ArrayList arrayList3 = new ArrayList();
                for (String str3 : split3) {
                    arrayList3.add(str3);
                }
                if (arrayList3.contains(bh3.Q0)) {
                    rf3.a(a);
                }
                if (arrayList3.contains(bh3.R0)) {
                    vf3.a(a);
                }
                if (arrayList3.contains(bh3.U0)) {
                    zf3.a(a);
                }
                if (arrayList3.contains(bh3.V0)) {
                    mg3.a(a);
                }
                if (arrayList3.contains(bh3.S0)) {
                    ig3.a(a);
                }
            }
        }
        if (!yg3.e(bh3.g0).equals("") && yg3.e(bh3.i0).equals("1")) {
            String[] split4 = yg3.e(bh3.g0).split("\\|");
            if (split4.length != 0) {
                ArrayList arrayList4 = new ArrayList();
                for (String str4 : split4) {
                    arrayList4.add(str4);
                }
                if (arrayList4.contains(bh3.Q0)) {
                    pf3.g(a);
                    if (yg3.e(bh3.e).equals("1")) {
                        pf3.b(a);
                    }
                }
                if (arrayList4.contains(bh3.R0)) {
                    tf3.g(a);
                    if (yg3.e(bh3.e).equals("1")) {
                        tf3.b(a);
                    }
                }
                if (arrayList4.contains(bh3.U0)) {
                    xf3.g(a);
                    if (yg3.e(bh3.e).equals("1")) {
                        xf3.b(a);
                    }
                }
                if (arrayList4.contains(bh3.V0)) {
                    kg3.m(a);
                    if (yg3.e(bh3.e).equals("1")) {
                        kg3.h(a);
                    }
                }
                if (arrayList4.contains(bh3.S0)) {
                    gg3.e(a);
                }
            }
        }
        if (!yg3.e(bh3.h0).equals("") && yg3.e(bh3.j0).equals("1")) {
            String[] split5 = yg3.e(bh3.h0).split("\\|");
            if (split5.length != 0) {
                ArrayList arrayList5 = new ArrayList();
                for (String str5 : split5) {
                    arrayList5.add(str5);
                }
                if (arrayList5.contains(bh3.Q0)) {
                    pf3.c(a);
                    if (yg3.e(bh3.f).equals("1")) {
                        pf3.a(a);
                    }
                }
                if (arrayList5.contains(bh3.R0)) {
                    tf3.c(a);
                    if (yg3.e(bh3.f).equals("1")) {
                        tf3.a(a);
                    }
                }
                if (arrayList5.contains(bh3.U0)) {
                    xf3.c(a);
                    if (yg3.e(bh3.f).equals("1")) {
                        xf3.a(a);
                    }
                }
                if (arrayList5.contains(bh3.V0)) {
                    kg3.i(a);
                    if (yg3.e(bh3.f).equals("1")) {
                        kg3.g(a);
                    }
                }
                if (arrayList5.contains(bh3.S0)) {
                    gg3.c(a);
                }
            }
        }
        if (!yg3.e(bh3.k0).equals("")) {
            String[] split6 = yg3.e(bh3.k0).split("\\|");
            if (split6.length != 0) {
                ArrayList arrayList6 = new ArrayList();
                for (String str6 : split6) {
                    arrayList6.add(str6);
                }
                if (arrayList6.contains(bh3.Q0)) {
                    pf3.e(a);
                }
                if (arrayList6.contains(bh3.R0)) {
                    tf3.e(a);
                }
                if (arrayList6.contains(bh3.U0)) {
                    xf3.e(a);
                }
                if (arrayList6.contains(bh3.V0)) {
                    kg3.k(a);
                }
                if (arrayList6.contains(bh3.S0)) {
                    gg3.d(a);
                }
            }
        }
        if (yg3.e(bh3.c).equals("0")) {
            return;
        }
        int i2 = IronSourceConstants.BN_AUCTION_REQUEST;
        if (!yg3.e(bh3.c).equals("")) {
            i2 = Integer.parseInt(yg3.e(bh3.c));
        }
        new Handler().postDelayed(new i(), i2);
    }

    private static void o() {
        Dialog dialog = new Dialog(a);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 80;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(gh.f(a, zg3.b.r)));
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(zg3.g.E);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
        h();
        ((LinearLayout) dialog.findViewById(zg3.e.P)).setOnClickListener(new l(dialog));
    }

    private static void p() {
        Dialog dialog = new Dialog(a);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 80;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(gh.f(a, zg3.b.r)));
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(zg3.g.F);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
        ((LinearLayout) dialog.findViewById(zg3.e.P)).setOnClickListener(new a(dialog));
    }

    private static void q() {
        Dialog dialog = new Dialog(a);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(gh.f(a, zg3.b.r)));
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(zg3.g.G);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
        ((LinearLayout) dialog.findViewById(zg3.e.P)).setOnClickListener(new b(dialog));
    }

    private static void r() {
        Dialog dialog = new Dialog(a);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(gh.f(a, zg3.b.r)));
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(zg3.g.H);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
        ((LinearLayout) dialog.findViewById(zg3.e.F)).setOnClickListener(new j());
        ((LinearLayout) dialog.findViewById(zg3.e.P)).setOnClickListener(new k());
    }

    private static void s(Activity activity, n madsInitListner) {
        Dialog dialog = new Dialog(a);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 80;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(gh.f(a, zg3.b.r)));
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(zg3.g.I);
        dialog.show();
        dialog.getWindow().setAttributes(layoutParams);
        ((TextView) dialog.findViewById(zg3.e.P)).setOnClickListener(new c(dialog, activity, madsInitListner));
        ((TextView) dialog.findViewById(zg3.e.O)).setOnClickListener(new d(activity, dialog, madsInitListner));
    }
}