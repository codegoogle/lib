package com.p7700g.p99005;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;

/* compiled from: MenuPresenter.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface w4 {

    /* compiled from: MenuPresenter.java */
    /* loaded from: classes.dex */
    public interface a {
        void onCloseMenu(@x1 p4 p4Var, boolean z);

        boolean onOpenSubMenu(@x1 p4 p4Var);
    }

    boolean collapseItemActionView(p4 p4Var, s4 s4Var);

    boolean expandItemActionView(p4 p4Var, s4 s4Var);

    boolean flagActionItems();

    int getId();

    x4 getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, p4 p4Var);

    void onCloseMenu(p4 p4Var, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(b5 b5Var);

    void setCallback(a aVar);

    void updateMenuView(boolean z);
}