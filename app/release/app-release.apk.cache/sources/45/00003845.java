package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.x2;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class a5 extends u4 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, w4, View.OnKeyListener {
    private static final int t = x2.j.t;
    private final int A;
    public final MenuPopupWindow B;
    private PopupWindow.OnDismissListener E;
    private View F;
    public View G;
    private w4.a H;
    public ViewTreeObserver I;
    private boolean J;
    private boolean K;
    private int L;
    private boolean N;
    private final Context u;
    private final p4 v;
    private final o4 w;
    private final boolean x;
    private final int y;
    private final int z;
    public final ViewTreeObserver.OnGlobalLayoutListener C = new a();
    private final View.OnAttachStateChangeListener D = new b();
    private int M = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!a5.this.isShowing() || a5.this.B.isModal()) {
                return;
            }
            View view = a5.this.G;
            if (view != null && view.isShown()) {
                a5.this.B.show();
            } else {
                a5.this.dismiss();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = a5.this.I;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    a5.this.I = view.getViewTreeObserver();
                }
                a5 a5Var = a5.this;
                a5Var.I.removeGlobalOnLayoutListener(a5Var.C);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public a5(Context context, p4 p4Var, View view, int i, int i2, boolean z) {
        this.u = context;
        this.v = p4Var;
        this.x = z;
        this.w = new o4(p4Var, LayoutInflater.from(context), z, t);
        this.z = i;
        this.A = i2;
        Resources resources = context.getResources();
        this.y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(x2.e.x));
        this.F = view;
        this.B = new MenuPopupWindow(context, null, i, i2);
        p4Var.c(this, context);
    }

    private boolean o() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.J || (view = this.F) == null) {
            return false;
        }
        this.G = view;
        this.B.setOnDismissListener(this);
        this.B.setOnItemClickListener(this);
        this.B.setModal(true);
        View view2 = this.G;
        boolean z = this.I == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.I = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.C);
        }
        view2.addOnAttachStateChangeListener(this.D);
        this.B.setAnchorView(view2);
        this.B.setDropDownGravity(this.M);
        if (!this.K) {
            this.L = u4.d(this.w, null, this.u, this.y);
            this.K = true;
        }
        this.B.setContentWidth(this.L);
        this.B.setInputMethodMode(2);
        this.B.setEpicenterBounds(c());
        this.B.show();
        ListView listView = this.B.getListView();
        listView.setOnKeyListener(this);
        if (this.N && this.v.A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.u).inflate(x2.j.s, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.v.A());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.B.setAdapter(this.w);
        this.B.show();
        return true;
    }

    @Override // com.p7700g.p99005.u4
    public void a(p4 p4Var) {
    }

    @Override // com.p7700g.p99005.z4
    public void dismiss() {
        if (isShowing()) {
            this.B.dismiss();
        }
    }

    @Override // com.p7700g.p99005.u4
    public void e(View view) {
        this.F = view;
    }

    @Override // com.p7700g.p99005.w4
    public boolean flagActionItems() {
        return false;
    }

    @Override // com.p7700g.p99005.u4
    public void g(boolean z) {
        this.w.e(z);
    }

    @Override // com.p7700g.p99005.z4
    public ListView getListView() {
        return this.B.getListView();
    }

    @Override // com.p7700g.p99005.u4
    public void h(int i) {
        this.M = i;
    }

    @Override // com.p7700g.p99005.u4
    public void i(int i) {
        this.B.setHorizontalOffset(i);
    }

    @Override // com.p7700g.p99005.z4
    public boolean isShowing() {
        return !this.J && this.B.isShowing();
    }

    @Override // com.p7700g.p99005.u4
    public void j(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // com.p7700g.p99005.u4
    public void k(boolean z) {
        this.N = z;
    }

    @Override // com.p7700g.p99005.u4
    public void l(int i) {
        this.B.setVerticalOffset(i);
    }

    @Override // com.p7700g.p99005.w4
    public void onCloseMenu(p4 p4Var, boolean z) {
        if (p4Var != this.v) {
            return;
        }
        dismiss();
        w4.a aVar = this.H;
        if (aVar != null) {
            aVar.onCloseMenu(p4Var, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.J = true;
        this.v.close();
        ViewTreeObserver viewTreeObserver = this.I;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.I = this.G.getViewTreeObserver();
            }
            this.I.removeGlobalOnLayoutListener(this.C);
            this.I = null;
        }
        this.G.removeOnAttachStateChangeListener(this.D);
        PopupWindow.OnDismissListener onDismissListener = this.E;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // com.p7700g.p99005.w4
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // com.p7700g.p99005.w4
    public boolean onSubMenuSelected(b5 b5Var) {
        if (b5Var.hasVisibleItems()) {
            v4 v4Var = new v4(this.u, b5Var, this.G, this.x, this.z, this.A);
            v4Var.setPresenterCallback(this.H);
            v4Var.setForceShowIcon(u4.m(b5Var));
            v4Var.setOnDismissListener(this.E);
            this.E = null;
            this.v.f(false);
            int horizontalOffset = this.B.getHorizontalOffset();
            int verticalOffset = this.B.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.M, sr.Y(this.F)) & 7) == 5) {
                horizontalOffset += this.F.getWidth();
            }
            if (v4Var.tryShow(horizontalOffset, verticalOffset)) {
                w4.a aVar = this.H;
                if (aVar != null) {
                    aVar.onOpenSubMenu(b5Var);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public void setCallback(w4.a aVar) {
        this.H = aVar;
    }

    @Override // com.p7700g.p99005.z4
    public void show() {
        if (!o()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // com.p7700g.p99005.w4
    public void updateMenuView(boolean z) {
        this.K = false;
        o4 o4Var = this.w;
        if (o4Var != null) {
            o4Var.notifyDataSetChanged();
        }
    }
}