package com.p7700g.p99005;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.p7700g.p99005.i2;

/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class gq {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private a mSubUiVisibilityListener;
    private b mVisibilityListener;

    /* compiled from: ActionProvider.java */
    @i2({i2.a.u})
    /* loaded from: classes.dex */
    public interface a {
        void onSubUiVisibilityChanged(boolean z);
    }

    /* compiled from: ActionProvider.java */
    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public gq(@x1 Context context) {
        this.mContext = context;
    }

    @x1
    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    @x1
    public abstract View onCreateActionView();

    @x1
    public View onCreateActionView(@x1 MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(@x1 SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener == null || !overridesItemVisibility()) {
            return;
        }
        this.mVisibilityListener.onActionProviderVisibilityChanged(isVisible());
    }

    @i2({i2.a.u})
    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    @i2({i2.a.u})
    public void setSubUiVisibilityListener(@z1 a aVar) {
        this.mSubUiVisibilityListener = aVar;
    }

    public void setVisibilityListener(@z1 b bVar) {
        if (this.mVisibilityListener != null && bVar != null) {
            getClass().getSimpleName();
        }
        this.mVisibilityListener = bVar;
    }

    @i2({i2.a.u})
    public void subUiVisibilityChanged(boolean z) {
        a aVar = this.mSubUiVisibilityListener;
        if (aVar != null) {
            aVar.onSubUiVisibilityChanged(z);
        }
    }
}