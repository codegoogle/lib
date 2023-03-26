package com.p7700g.p99005;

import android.app.Activity;

/* compiled from: Sdk_AppOpen.java */
/* loaded from: classes3.dex */
public class eg3 {
    private static final String a = "Sdk_AppOpen";
    public static Boolean b = Boolean.FALSE;
    public static wg3 c = null;

    /* compiled from: Sdk_AppOpen.java */
    /* loaded from: classes3.dex */
    public class a implements d13 {
        public final /* synthetic */ Activity a;

        public a(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void a(r13 cause) {
            String str = "Sdk_AppOpen onAdLoadFailed -> " + cause;
            eg3.b = Boolean.FALSE;
        }

        @Override // com.p7700g.p99005.e03
        public void e() {
            eg3.b = Boolean.FALSE;
        }

        @Override // com.p7700g.p99005.e03
        public void onAdClosed() {
            eg3.b = Boolean.FALSE;
            e13.j(null);
            eg3.a(this.a);
            wg3 wg3Var = eg3.c;
            if (wg3Var != null) {
                wg3Var.H1();
            }
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            eg3.b = Boolean.TRUE;
        }

        @Override // com.p7700g.p99005.e03
        public void onAdOpened() {
        }
    }

    public static void a(Activity activity) {
        String G = ih3.G();
        e13.k(c13.PORTRAIT);
        e13.j(new a(activity));
        e13.i(G);
    }

    public static void b(wg3 monAdsClickListner) {
        c = monAdsClickListner;
    }

    public static void c(Activity activity) {
        if (!b.booleanValue()) {
            a(activity);
        } else {
            e13.m(activity);
        }
    }
}