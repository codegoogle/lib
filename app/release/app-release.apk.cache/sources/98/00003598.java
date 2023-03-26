package com.ironsource.sdk.a;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.wo1;

/* loaded from: classes3.dex */
public final class f {
    public static a a = new a(2001, a("initsdk"));
    public static a b = new a(2002, a("createcontrollerweb"));
    public static a c = new a(2003, a("createcontrollernative"));
    public static a d = new a(2004, a("controllerstageready"));
    public static a e = new a(IronSourceConstants.IS_INSTANCE_OPENED, a("loadad"));
    public static a f = new a(2006, a("loadadfailed"));
    public static a g = new a(2007, a("initproduct"));
    public static a h = new a(AdError.REMOTE_ADS_SERVICE_ERROR, a("initproductfailed"));
    public static a i = new a(AdError.INTERSTITIAL_AD_TIMEOUT, a("loadproduct"));
    public static a j = new a(2010, a("parseadmfailed"));
    public static a k = new a(2011, a("loadadsuccess"));
    public static a l = new a(2013, a("controllerfailed"));
    public static a m;
    public static a n;
    public static a o;
    public static a p;
    public static a q;
    public static a r;
    public static a s;
    public static a t;
    public static a u;

    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public int b;

        public a(int i, String str) {
            this.b = i;
            this.a = str;
        }
    }

    static {
        new a(2014, a("extractinstalledpackagesfailed"));
        m = new a(2015, a("appendnativefeaturesdatafailed"));
        n = new a(2016, a("adunitcouldnotloadtowebview"));
        o = new a(2017, a("webviewcleanupfailed"));
        p = new a(2018, a("removewebviewfailed"));
        new a(2019, a("adunitcouldnotloadtowebviewbanners"));
        new a(2020, a("banneralreadydestroyed"));
        q = new a(2021, a("fialedregactlifecycle"));
        r = new a(2022, a("loadcontrollerhtml"));
        s = new a(2023, a("controllerhtmlsuccess"));
        t = new a(2024, a("controllerhtmlfailed"));
        u = new a(2025, a("webviewcrashrpg"));
    }

    private static String a(String str) {
        return wo1.s("n_", str);
    }
}