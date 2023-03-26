package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.x2;

/* compiled from: MenuPopupHelper.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class v4 implements r4 {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private View mAnchorView;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final PopupWindow.OnDismissListener mInternalOnDismissListener;
    private final p4 mMenu;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private u4 mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private w4.a mPresenterCallback;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            v4.this.onDismiss();
        }
    }

    /* compiled from: MenuPopupHelper.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public v4(@x1 Context context, @x1 p4 p4Var) {
        this(context, p4Var, null, false, x2.b.z2, 0);
    }

    @x1
    private u4 createPopup() {
        u4 a5Var;
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.mContext.getResources().getDimensionPixelSize(x2.e.w)) {
            a5Var = new m4(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        } else {
            a5Var = new a5(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        }
        a5Var.a(this.mMenu);
        a5Var.j(this.mInternalOnDismissListener);
        a5Var.e(this.mAnchorView);
        a5Var.setCallback(this.mPresenterCallback);
        a5Var.g(this.mForceShowIcon);
        a5Var.h(this.mDropDownGravity);
        return a5Var;
    }

    private void showPopup(int i, int i2, boolean z, boolean z2) {
        u4 popup = getPopup();
        popup.k(z2);
        if (z) {
            if ((nq.d(this.mDropDownGravity, sr.Y(this.mAnchorView)) & 7) == 5) {
                i -= this.mAnchorView.getWidth();
            }
            popup.i(i);
            popup.l(i2);
            int i3 = (int) ((this.mContext.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.f(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        popup.show();
    }

    @Override // com.p7700g.p99005.r4
    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public int getGravity() {
        return this.mDropDownGravity;
    }

    public ListView getListView() {
        return getPopup().getListView();
    }

    @i2({i2.a.LIBRARY})
    @x1
    public u4 getPopup() {
        if (this.mPopup == null) {
            this.mPopup = createPopup();
        }
        return this.mPopup;
    }

    public boolean isShowing() {
        u4 u4Var = this.mPopup;
        return u4Var != null && u4Var.isShowing();
    }

    public void onDismiss() {
        this.mPopup = null;
        PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void setAnchorView(@x1 View view) {
        this.mAnchorView = view;
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        u4 u4Var = this.mPopup;
        if (u4Var != null) {
            u4Var.g(z);
        }
    }

    public void setGravity(int i) {
        this.mDropDownGravity = i;
    }

    public void setOnDismissListener(@z1 PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    @Override // com.p7700g.p99005.r4
    public void setPresenterCallback(@z1 w4.a aVar) {
        this.mPresenterCallback = aVar;
        u4 u4Var = this.mPopup;
        if (u4Var != null) {
            u4Var.setCallback(aVar);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(0, 0, false, false);
        return true;
    }

    public v4(@x1 Context context, @x1 p4 p4Var, @x1 View view) {
        this(context, p4Var, view, false, x2.b.z2, 0);
    }

    public v4(@x1 Context context, @x1 p4 p4Var, @x1 View view, boolean z, @q0 int i) {
        this(context, p4Var, view, z, i, 0);
    }

    public void show(int i, int i2) {
        if (!tryShow(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public v4(@x1 Context context, @x1 p4 p4Var, @x1 View view, boolean z, @q0 int i, @m2 int i2) {
        this.mDropDownGravity = nq.b;
        this.mInternalOnDismissListener = new a();
        this.mContext = context;
        this.mMenu = p4Var;
        this.mAnchorView = view;
        this.mOverflowOnly = z;
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
    }

    public boolean tryShow(int i, int i2) {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(i, i2, true, true);
        return true;
    }
}