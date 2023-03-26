package com.google.android.gms.appset;

import android.content.Context;
import com.google.android.gms.internal.appset.zzr;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes2.dex */
public final class AppSet {
    private AppSet() {
    }

    @x1
    public static AppSetIdClient getClient(@x1 Context context) {
        return new zzr(context);
    }
}