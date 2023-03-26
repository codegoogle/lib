package com.p7700g.p99005;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.x4;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class k4 implements w4 {
    private w4.a mCallback;
    public Context mContext;
    private int mId;
    public LayoutInflater mInflater;
    private int mItemLayoutRes;
    public p4 mMenu;
    private int mMenuLayoutRes;
    public x4 mMenuView;
    public Context mSystemContext;
    public LayoutInflater mSystemInflater;

    public k4(Context context, int i, int i2) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = i;
        this.mItemLayoutRes = i2;
    }

    public void addItemView(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.mMenuView).addView(view, i);
    }

    public abstract void bindItemView(s4 s4Var, x4.a aVar);

    @Override // com.p7700g.p99005.w4
    public boolean collapseItemActionView(p4 p4Var, s4 s4Var) {
        return false;
    }

    public x4.a createItemView(ViewGroup viewGroup) {
        return (x4.a) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
    }

    @Override // com.p7700g.p99005.w4
    public boolean expandItemActionView(p4 p4Var, s4 s4Var) {
        return false;
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // com.p7700g.p99005.w4
    public boolean flagActionItems() {
        return false;
    }

    public w4.a getCallback() {
        return this.mCallback;
    }

    @Override // com.p7700g.p99005.w4
    public int getId() {
        return this.mId;
    }

    public View getItemView(s4 s4Var, View view, ViewGroup viewGroup) {
        x4.a createItemView;
        if (view instanceof x4.a) {
            createItemView = (x4.a) view;
        } else {
            createItemView = createItemView(viewGroup);
        }
        bindItemView(s4Var, createItemView);
        return (View) createItemView;
    }

    @Override // com.p7700g.p99005.w4
    public x4 getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            x4 x4Var = (x4) this.mSystemInflater.inflate(this.mMenuLayoutRes, viewGroup, false);
            this.mMenuView = x4Var;
            x4Var.initialize(this.mMenu);
            updateMenuView(true);
        }
        return this.mMenuView;
    }

    @Override // com.p7700g.p99005.w4
    public void initForMenu(Context context, p4 p4Var) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mMenu = p4Var;
    }

    @Override // com.p7700g.p99005.w4
    public void onCloseMenu(p4 p4Var, boolean z) {
        w4.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onCloseMenu(p4Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.p7700g.p99005.p4] */
    @Override // com.p7700g.p99005.w4
    public boolean onSubMenuSelected(b5 b5Var) {
        w4.a aVar = this.mCallback;
        b5 b5Var2 = b5Var;
        if (aVar != null) {
            if (b5Var == null) {
                b5Var2 = this.mMenu;
            }
            return aVar.onOpenSubMenu(b5Var2);
        }
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public void setCallback(w4.a aVar) {
        this.mCallback = aVar;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public boolean shouldIncludeItem(int i, s4 s4Var) {
        return true;
    }

    @Override // com.p7700g.p99005.w4
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return;
        }
        p4 p4Var = this.mMenu;
        int i = 0;
        if (p4Var != null) {
            p4Var.u();
            ArrayList<s4> H = this.mMenu.H();
            int size = H.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                s4 s4Var = H.get(i3);
                if (shouldIncludeItem(i2, s4Var)) {
                    View childAt = viewGroup.getChildAt(i2);
                    s4 itemData = childAt instanceof x4.a ? ((x4.a) childAt).getItemData() : null;
                    View itemView = getItemView(s4Var, childAt, viewGroup);
                    if (s4Var != itemData) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != childAt) {
                        addItemView(itemView, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!filterLeftoverView(viewGroup, i)) {
                i++;
            }
        }
    }
}