package com.google.ads.Activity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.p7700g.p99005.bh3;
import com.p7700g.p99005.d3;
import com.p7700g.p99005.ff3;
import com.p7700g.p99005.gf3;
import com.p7700g.p99005.hf3;
import com.p7700g.p99005.if3;
import com.p7700g.p99005.ih3;
import com.p7700g.p99005.jf3;
import com.p7700g.p99005.kf3;
import com.p7700g.p99005.wg3;
import com.p7700g.p99005.xg3;
import com.p7700g.p99005.yg3;
import com.p7700g.p99005.zg3;
import java.util.List;

/* loaded from: classes3.dex */
public class QurekaActivity extends d3 {
    public static wg3 T = null;
    public static String U = "FragmentQurekaAppOpen";
    public static String V = "FragmentQurekaInterstitial";
    public static String W = "type";
    public static Boolean X = Boolean.FALSE;
    public static boolean Y = false;
    public final int Z = 5894;

    private void u0(Fragment fragment) {
        L().r().f(zg3.e.B, fragment).q();
    }

    public static void v0(wg3 monAdsClickListner) {
        T = monAdsClickListner;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (Y) {
            super.onBackPressed();
        }
    }

    @Override // com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        if (d0() != null) {
            d0().w();
        }
        setContentView(zg3.g.c);
        String stringExtra = getIntent().getStringExtra(W);
        if (stringExtra.equals(U)) {
            u0(new ff3());
            ff3.d(T);
        } else if (stringExtra.equals(V)) {
            if (yg3.e(bh3.L).equals("")) {
                T.H1();
                return;
            }
            List<xg3> d = yg3.d();
            if (d != null && !d.isEmpty()) {
                String C = ih3.C();
                if (C.equals("1")) {
                    u0(new gf3());
                    gf3.k(T);
                    return;
                } else if (C.equals("2")) {
                    u0(new hf3());
                    hf3.m(T);
                    return;
                } else if (C.equals("3")) {
                    u0(new if3());
                    if3.m(T);
                    return;
                } else if (C.equals("4")) {
                    u0(new jf3());
                    jf3.f(T);
                    return;
                } else if (C.equals("5")) {
                    u0(new kf3());
                    kf3.f(T);
                    return;
                } else {
                    T.H1();
                    return;
                }
            }
            T.H1();
        }
    }
}