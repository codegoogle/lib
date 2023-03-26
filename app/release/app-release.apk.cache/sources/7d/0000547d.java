package com.p7700g.p99005;

import android.app.Activity;
import android.os.Build;
import com.onesignal.OSUtils;
import com.onesignal.PermissionsActivity;
import com.p7700g.p99005.gn3;
import com.p7700g.p99005.hi3;
import com.p7700g.p99005.jm3;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NotificationPermissionController.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/oj3;", "Lcom/onesignal/PermissionsActivity$c;", "", "k", "()Z", "accepted", "Lcom/p7700g/p99005/yq4;", "f", "(Z)V", "h", "fallbackToSettings", "Lcom/p7700g/p99005/jm3$k1;", "callback", "j", "(ZLcom/p7700g/p99005/jm3$k1;)V", "a", "()V", "b", "i", "", "Ljava/lang/String;", "PERMISSION_TYPE", "e", "Z", com.anythink.basead.d.g.i, "supportsNativePrompt", "", "c", "Ljava/util/Set;", "callbacks", "d", "awaitingForReturnFromSystemSettings", "ANDROID_PERMISSION_STRING", "<init>", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class oj3 implements PermissionsActivity.c {
    private static final String a = "NOTIFICATION";
    private static final String b = "android.permission.POST_NOTIFICATIONS";
    private static final Set<jm3.k1> c;
    private static boolean d;
    @v0(api = 33)
    private static final boolean e;
    @NotNull
    public static final oj3 f;

    /* compiled from: NotificationPermissionController.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/p7700g/p99005/oj3$a", "Lcom/p7700g/p99005/hi3$a;", "Lcom/p7700g/p99005/yq4;", "a", "()V", "b", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class a implements hi3.a {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // com.p7700g.p99005.hi3.a
        public void a() {
            hj3.a.a(this.a);
            oj3 oj3Var = oj3.f;
            oj3.d = true;
        }

        @Override // com.p7700g.p99005.hi3.a
        public void b() {
            oj3.f.f(false);
        }
    }

    static {
        oj3 oj3Var = new oj3();
        f = oj3Var;
        c = new HashSet();
        PermissionsActivity.e(a, oj3Var);
        e = Build.VERSION.SDK_INT > 32 && OSUtils.p(jm3.g) > 32;
    }

    private oj3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(boolean z) {
        for (jm3.k1 k1Var : c) {
            k1Var.a(z);
        }
        c.clear();
    }

    private final boolean h() {
        return OSUtils.a(jm3.g);
    }

    private final boolean k() {
        Activity f0 = jm3.f0();
        if (f0 != null) {
            c25.o(f0, "OneSignal.getCurrentActivity() ?: return false");
            hi3 hi3Var = hi3.a;
            String string = f0.getString(gn3.m.e0);
            c25.o(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = f0.getString(gn3.m.f0);
            c25.o(string2, "activity.getString(R.str…mission_settings_message)");
            hi3Var.a(f0, string, string2, new a(f0));
            return true;
        }
        return false;
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void a() {
        jm3.c2();
        f(true);
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void b(boolean z) {
        if (z ? k() : false) {
            return;
        }
        f(false);
    }

    public final boolean g() {
        return e;
    }

    public final void i() {
        if (d) {
            d = false;
            f(h());
        }
    }

    public final void j(boolean z, @Nullable jm3.k1 k1Var) {
        if (k1Var != null) {
            c.add(k1Var);
        }
        if (h()) {
            f(true);
        } else if (e) {
            PermissionsActivity.i(z, a, b, oj3.class);
        } else if (z) {
            k();
        } else {
            f(false);
        }
    }
}