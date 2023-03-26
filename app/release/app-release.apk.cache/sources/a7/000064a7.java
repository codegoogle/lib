package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x03 implements Application.ActivityLifecycleCallbacks {
    @NotNull
    public static final a s = new a(null);
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static volatile x03 t;
    @NotNull
    private final Context u;
    @Nullable
    private Activity v;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Activity a() {
            x03 x03Var = x03.t;
            if (x03Var == null) {
                return null;
            }
            return x03Var.a();
        }

        @NotNull
        public final x03 b(@NotNull Context context) {
            c25.p(context, "applicationContext");
            x03 x03Var = x03.t;
            if (x03Var == null) {
                synchronized (this) {
                    x03Var = x03.t;
                    if (x03Var == null) {
                        x03Var = new x03(context, null);
                        a aVar = x03.s;
                        x03.t = x03Var;
                    }
                }
            }
            return x03Var;
        }
    }

    private x03(Context context) {
        this.u = context;
    }

    public /* synthetic */ x03(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final boolean c(Activity activity) {
        ComponentName componentName;
        Activity activity2 = this.v;
        return (activity2 == null || (componentName = activity2.getComponentName()) == null || !componentName.equals(activity.getComponentName())) ? false : true;
    }

    @Nullable
    public final Activity a() {
        return this.v;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        xz2.c(cz2.c(this), c25.C("App Activity Created ", activity.getComponentName()));
        this.v = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        xz2.c(cz2.c(this), c25.C("App Activity Destroyed ", activity.getComponentName()));
        if (c(activity)) {
            this.v = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        xz2.c(cz2.c(this), c25.C("App Activity Resumed ", activity.getComponentName()));
        this.v = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        c25.p(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        xz2.c(cz2.c(this), c25.C("App Activity Started ", activity.getComponentName()));
        this.v = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        c(activity);
    }
}