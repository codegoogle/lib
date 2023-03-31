package com.p7700g.p99005;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebView;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.UnifiedSDKConfig;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.google.gson.Gson;
import com.google.ads.Utils.AppObserve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApp.java */
/* loaded from: classes3.dex */
public class yg3 {
    private static SharedPreferences a = null;
    private static SharedPreferences.Editor b = null;
    private static yg3 c = null;
    private static String d = "MyApp";
    private static Application e;

    /* compiled from: MyApp.java */
    /* loaded from: classes3.dex */
    public class a implements ua1<b51> {
        public final /* synthetic */ c b;

        public a(final c val$vpnInit) {
            this.b = val$vpnInit;
        }

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 gc1 e) {
            this.b.a();
        }

        @Override // com.p7700g.p99005.ua1
        /* renamed from: c */
        public void b(@x1 b51 sdkInfo) {
            this.b.a();
        }
    }

    /* compiled from: MyApp.java */
    /* loaded from: classes3.dex */
    public class b extends lx2<List<xg3>> {
    }

    /* compiled from: MyApp.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a();
    }

    public static Application b() {
        return e;
    }

    public static yg3 c() {
        return c;
    }

    public static List<xg3> d() {
        return (List) new Gson().o(a.getString("QurekaIntList", ""), new b().g());
    }

    public static String e(String key) {
        return a.getString(key, "");
    }

    public static void h(List<xg3> QurekaIntList) {
        b.putString("QurekaIntList", new Gson().z(QurekaIntList));
        b.commit();
    }

    public static void i(String key, String value) {
        b.putString(key, value.trim());
        b.commit();
    }

    public void a() {
        c = this;
    }

    public void f(Application application) {
        c = this;
        e = application;
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            if (!application.getPackageName().equals(processName)) {
                WebView.setDataDirectorySuffix(processName);
            }
        }
        MobileAds.initialize(application);
        AudienceNetworkAds.initialize(application);
        f3.L(1);
        SharedPreferences sharedPreferences = application.getSharedPreferences("MyAds", 0);
        a = sharedPreferences;
        b = sharedPreferences.edit();
        new AppObserve(application);
    }

    public void g(c vpnInit) {
        String e2 = e(bh3.x0);
        ClientInfo f = ClientInfo.newBuilder().e(e2).g(ih3.O()).f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(q31.a());
        arrayList.add(uh3.a());
        arrayList.add(uh3.b());
        k51.A(arrayList, va1.a);
        k51.i(f, UnifiedSDKConfig.newBuilder().b(false).a());
        try {
            k51.g().b(new a(vpnInit));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}