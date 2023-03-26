package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import com.p7700g.p99005.i2;

/* compiled from: MenuView.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface x4 {

    /* compiled from: MenuView.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z, char c);

        boolean b();

        boolean c();

        void d(s4 s4Var, int i);

        s4 getItemData();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    int getWindowAnimations();

    void initialize(p4 p4Var);
}