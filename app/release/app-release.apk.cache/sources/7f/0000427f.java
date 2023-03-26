package com.p7700g.p99005;

import android.app.Activity;
import com.onesignal.PermissionsActivity;
import com.p7700g.p99005.gn3;
import com.p7700g.p99005.hi3;
import com.p7700g.p99005.jm3;
import org.jetbrains.annotations.NotNull;

/* compiled from: LocationPermissionController.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/p7700g/p99005/fj3;", "Lcom/onesignal/PermissionsActivity$c;", "Lcom/p7700g/p99005/jm3$j1;", "result", "Lcom/p7700g/p99005/yq4;", "c", "(Lcom/p7700g/p99005/jm3$j1;)V", "e", "()V", "", "fallbackToSettings", "", "androidPermissionString", "d", "(ZLjava/lang/String;)V", "a", "b", "(Z)V", "Ljava/lang/String;", "PERMISSION_TYPE", "<init>", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class fj3 implements PermissionsActivity.c {
    private static final String a = "LOCATION";
    @NotNull
    public static final fj3 b;

    /* compiled from: LocationPermissionController.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/p7700g/p99005/fj3$a", "Lcom/p7700g/p99005/hi3$a;", "Lcom/p7700g/p99005/yq4;", "a", "()V", "b", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class a implements hi3.a {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // com.p7700g.p99005.hi3.a
        public void a() {
            gj3.a.a(this.a);
            ej3.n(true, jm3.j1.PERMISSION_DENIED);
        }

        @Override // com.p7700g.p99005.hi3.a
        public void b() {
            ej3.n(true, jm3.j1.PERMISSION_DENIED);
        }
    }

    static {
        fj3 fj3Var = new fj3();
        b = fj3Var;
        PermissionsActivity.e("LOCATION", fj3Var);
    }

    private fj3() {
    }

    private final void c(jm3.j1 j1Var) {
        ej3.n(true, j1Var);
    }

    private final void e() {
        Activity f0 = jm3.f0();
        if (f0 != null) {
            c25.o(f0, "OneSignal.getCurrentActivity() ?: return");
            hi3 hi3Var = hi3.a;
            String string = f0.getString(gn3.m.c0);
            c25.o(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = f0.getString(gn3.m.d0);
            c25.o(string2, "activity.getString(R.str…mission_settings_message)");
            hi3Var.a(f0, string, string2, new a(f0));
        }
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void a() {
        c(jm3.j1.PERMISSION_GRANTED);
        ej3.p();
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void b(boolean z) {
        c(jm3.j1.PERMISSION_DENIED);
        if (z) {
            e();
        }
        ej3.e();
    }

    public final void d(boolean z, @NotNull String str) {
        c25.p(str, "androidPermissionString");
        PermissionsActivity.i(z, "LOCATION", str, fj3.class);
    }
}