package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;

/* compiled from: AppCompatResources.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class r3 {
    private r3() {
    }

    public static ColorStateList a(@x1 Context context, @y0 int i) {
        return gh.g(context, i);
    }

    @z1
    public static Drawable b(@x1 Context context, @f1 int i) {
        return ResourceManagerInternal.get().getDrawable(context, i);
    }
}