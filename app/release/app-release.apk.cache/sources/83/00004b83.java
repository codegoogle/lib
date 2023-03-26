package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentContainer.java */
/* loaded from: classes.dex */
public abstract class jx {
    @x1
    @Deprecated
    public Fragment b(@x1 Context context, @x1 String str, @z1 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @z1
    public abstract View d(@m1 int i);

    public abstract boolean e();
}