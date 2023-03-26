package com.greedygame.core;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.Keep;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.videocommon.e.b;
import com.greedygame.core.app_open_ads.core.GGAppOpenAdsImpl;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.c03;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.hc3;
import com.p7700g.p99005.iy2;
import com.p7700g.p99005.n33;
import com.p7700g.p99005.na3;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.sz2;
import com.p7700g.p99005.t23;
import com.p7700g.p99005.w13;
import com.p7700g.p99005.x03;
import com.p7700g.p99005.xz2;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AppConfig {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = c25.C(f.a, File.separator);
    @NotNull
    private static final String c = "AppConfig";
    @NotNull
    private final String d;
    @NotNull
    private final WeakReference<Context> e;
    @NotNull
    private final c03 f;
    @NotNull
    private final String g;
    @NotNull
    private final String h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private boolean m;
    private boolean n;
    @Nullable
    private final w13 o;
    @Nullable
    private final Typeface p;
    private final int q;
    public na3 r;
    public hc3 s;
    @NotNull
    private final t23 t;
    @NotNull
    private final Context u;
    @NotNull
    private final iy2 v;
    private long w;
    @NotNull
    private final x03 x;

    @Keep
    /* loaded from: classes3.dex */
    public static final class Builder {
        private int adRequestTimeoutInSeconds;
        @Nullable
        private Typeface customTypeFace;
        @NotNull
        private String mAppId;
        @NotNull
        private final Context mContext;
        private boolean mDNTLocation;
        private boolean mEnableAdmob;
        private boolean mEnableCcpa;
        private boolean mEnableCoppa;
        private boolean mEnableCrashReporting;
        private boolean mEnableFan;
        private boolean mEnableGdpr;
        private boolean mEnableInstallTracking;
        private boolean mEnableMopub;
        @NotNull
        private String mEngine;
        @NotNull
        private String mEngineVersion;
        private boolean mIsDebugBuild;
        @Nullable
        private w13 mThemeData;

        public Builder(@NotNull Context context) {
            c25.p(context, "mContext");
            this.mContext = context;
            this.mAppId = "";
            this.mEngine = "";
            this.mEngineVersion = "";
            this.mEnableAdmob = true;
            this.mEnableCrashReporting = true;
        }

        @NotNull
        public final AppConfig build() {
            return new AppConfig(this.mAppId, new WeakReference(this.mContext), new c03(this.mEnableCcpa, this.mEnableCoppa, this.mEnableGdpr, this.mDNTLocation), this.mEngine, this.mEngineVersion, this.mEnableAdmob, this.mEnableFan, this.mEnableMopub, this.mEnableCrashReporting, this.mIsDebugBuild, this.mEnableInstallTracking, this.mThemeData, this.customTypeFace, this.adRequestTimeoutInSeconds, null);
        }

        @NotNull
        public final Builder enableAdmobAds(boolean z) {
            this.mEnableAdmob = z;
            return this;
        }

        @NotNull
        public final Builder enableCcpa(boolean z) {
            this.mEnableCcpa = z;
            return this;
        }

        @NotNull
        public final Builder enableCoppa(boolean z) {
            this.mEnableCoppa = z;
            return this;
        }

        @NotNull
        public final Builder enableCrashReporting(boolean z) {
            this.mEnableCrashReporting = z;
            return this;
        }

        @NotNull
        public final Builder enableDNTLocation(boolean z) {
            this.mDNTLocation = z;
            return this;
        }

        @NotNull
        public final Builder enableDebug(boolean z) {
            this.mIsDebugBuild = z;
            return this;
        }

        @NotNull
        public final Builder enableFacebookAds(boolean z) {
            this.mEnableFan = z;
            return this;
        }

        @NotNull
        public final Builder enableGdpa(boolean z) {
            this.mEnableGdpr = z;
            return this;
        }

        @NotNull
        public final Builder enableInstallTracking(boolean z) {
            this.mEnableInstallTracking = z;
            return this;
        }

        @NotNull
        public final Builder engine(@NotNull String str) {
            c25.p(str, "engine");
            if (str.length() == 0) {
                str = "android_native";
            }
            this.mEngine = str;
            return this;
        }

        @NotNull
        public final Builder engineVersion(@NotNull String str) {
            c25.p(str, com.anythink.expressad.foundation.g.a.h);
            this.mEngineVersion = str;
            return this;
        }

        @NotNull
        public final Builder setAdRequestTimeoutInSeconds(@p1(from = 0) int i) {
            this.adRequestTimeoutInSeconds = i;
            return this;
        }

        @NotNull
        public final Builder setCustomTypeFace(@NotNull Typeface typeface) {
            c25.p(typeface, "typeface");
            this.customTypeFace = typeface;
            return this;
        }

        @NotNull
        public final Builder setTheme(@NotNull w13 w13Var) {
            c25.p(w13Var, "theme");
            this.mThemeData = w13Var;
            return this;
        }

        @NotNull
        public final Builder withAppId(@NotNull String str) {
            c25.p(str, b.u);
            this.mAppId = str;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return AppConfig.b;
        }
    }

    private AppConfig(String str, WeakReference<Context> weakReference, c03 c03Var, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, w13 w13Var, Typeface typeface, int i) {
        this.d = str;
        this.e = weakReference;
        this.f = c03Var;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = w13Var;
        this.p = typeface;
        this.q = i;
        this.t = t23.a.a();
        this.w = -1L;
        Context context = weakReference.get();
        c25.m(context);
        Context applicationContext = context.getApplicationContext();
        c25.o(applicationContext, "it!!.applicationContext");
        this.u = applicationContext;
        x03 b2 = x03.s.b(e());
        this.x = b2;
        ((Application) e()).registerActivityLifecycleCallbacks(b2);
        Context e = e();
        String string = e().getString(b03.l.g0);
        c25.o(string, "appContext.getString(R.string.gg_exposed_shared_pref_name)");
        this.v = new iy2(e, string);
        s().c(e(), r());
        xz2.a.h(e());
        if (this.m) {
            return;
        }
        this.m = (applicationContext.getApplicationInfo().flags & 2) != 0;
    }

    public /* synthetic */ AppConfig(String str, WeakReference weakReference, c03 c03Var, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, w13 w13Var, Typeface typeface, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, weakReference, c03Var, str2, str3, z, z2, z3, z4, z5, z6, w13Var, typeface, i);
    }

    public final void A(boolean z) {
        this.n = z;
    }

    public final void B(@NotNull hc3 hc3Var) {
        c25.p(hc3Var, "<set-?>");
        this.s = hc3Var;
    }

    public final void C(@NotNull na3 na3Var) {
        c25.p(na3Var, "<set-?>");
        this.r = na3Var;
    }

    public final void D(long j) {
        this.w = j;
    }

    public final void c() {
        ((Application) this.u).unregisterActivityLifecycleCallbacks(this.x);
    }

    public final int d() {
        return this.q;
    }

    @NotNull
    public final Context e() {
        return this.u;
    }

    @NotNull
    public final String f() {
        return this.d;
    }

    @NotNull
    public final Application g() {
        return (Application) this.u;
    }

    @Nullable
    public final Typeface h() {
        return this.p;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.l;
    }

    public final boolean k() {
        return this.j;
    }

    public final boolean l() {
        return this.n;
    }

    public final boolean m() {
        return this.k;
    }

    @NotNull
    public final String n() {
        return this.g;
    }

    @NotNull
    public final String o() {
        return this.h;
    }

    @NotNull
    public final hc3 p() {
        hc3 hc3Var = this.s;
        if (hc3Var != null) {
            return hc3Var;
        }
        c25.S("mAssetManager");
        throw null;
    }

    @NotNull
    public final na3 q() {
        na3 na3Var = this.r;
        if (na3Var != null) {
            return na3Var;
        }
        c25.S("mNetworkManager");
        throw null;
    }

    @NotNull
    public final iy2 r() {
        return this.v;
    }

    @NotNull
    public final t23 s() {
        return this.t;
    }

    @NotNull
    public final c03 t() {
        return this.f;
    }

    @Nullable
    public final w13 u() {
        return this.o;
    }

    public final long v() {
        return this.w;
    }

    public final boolean w() {
        return this.m;
    }

    public final boolean x() {
        boolean z = true;
        if (this.d.length() == 0) {
            xz2.d(c, "App Id is empty");
            z = false;
        }
        if (this.e.get() == null) {
            xz2.d(c, "Context Provided is null");
            return false;
        }
        return z;
    }

    public final void y() {
        if (this.p != null) {
            xz2.c(c, "Setting custom typeface.");
            n33.a.a().q(h());
        }
        GGAppOpenAdsImpl.s.a().o();
        C(na3.s.a());
        q().a();
        sz2.a.b(this.u);
        B(new hc3());
    }

    public final void z(boolean z) {
        this.m = z;
    }

    public /* synthetic */ AppConfig(String str, WeakReference weakReference, c03 c03Var, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, w13 w13Var, Typeface typeface, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, weakReference, c03Var, (i2 & 8) != 0 ? "android_native" : str2, str3, z, z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? true : z4, z5, z6, w13Var, typeface, i);
    }
}