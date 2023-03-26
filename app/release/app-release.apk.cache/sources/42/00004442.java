package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gb3 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private final Context b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public gb3(@NotNull Context context) {
        c25.p(context, "context");
        this.b = context;
    }

    @Nullable
    public final PackageInfo a() {
        PackageManager packageManager = this.b.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(this.b.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            xz2.c("PacWrpr", c25.C("Failed to find PackageInfo for current App : ", this.b.getPackageName()));
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }
}