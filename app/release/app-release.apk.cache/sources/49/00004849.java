package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.p7700g.p99005.i2;

/* compiled from: ContextUtils.java */
@i2({i2.a.t})
/* loaded from: classes3.dex */
public class ie2 {
    @z1
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}