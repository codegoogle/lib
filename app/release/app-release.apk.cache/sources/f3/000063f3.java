package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.play:review@@2.0.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public final class wm2 {
    private static final wl2 a = new wl2("ReviewService");
    @r2
    @z1
    public hm2 b;
    private final String c;

    public wm2(Context context) {
        this.c = context.getPackageName();
        if (km2.a(context)) {
            this.b = new hm2(context, a, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), sm2.a, null, null);
        }
    }

    public final Task a() {
        wl2 wl2Var = a;
        wl2Var.d("requestInAppReview (%s)", this.c);
        if (this.b == null) {
            wl2Var.b("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new kl2(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.b.p(new tm2(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}