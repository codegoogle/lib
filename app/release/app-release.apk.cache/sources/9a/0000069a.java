package com.anythink.core.common;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.api.ATMediationRequestInfo;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class j {
    public String a;
    public ATMediationRequestInfo b;
    public String c;
    public int d;
    public com.anythink.core.common.b.b e;
    public com.anythink.core.common.b.a f;
    private Context g;
    private WeakReference<Activity> h;

    private int b() {
        return this.d;
    }

    public final void a(Context context) {
        this.g = com.anythink.core.common.b.m.a().e();
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        this.h = new WeakReference<>((Activity) context);
    }

    public final Context a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.h;
        return (weakReference == null || (activity = weakReference.get()) == null) ? this.g : activity;
    }
}