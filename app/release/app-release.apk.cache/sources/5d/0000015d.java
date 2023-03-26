package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.p7700g.p99005.g4;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.m2;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.q0;
import com.p7700g.p99005.v1;
import com.p7700g.p99005.v4;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z4;

/* loaded from: classes.dex */
public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private View.OnTouchListener mDragListener;
    private final p4 mMenu;
    public OnMenuItemClickListener mMenuItemClickListener;
    public OnDismissListener mOnDismissListener;
    public final v4 mPopup;

    /* loaded from: classes.dex */
    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(@x1 Context context, @x1 View view) {
        this(context, view, 0);
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }

    @x1
    public View.OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new ForwardingListener(this.mAnchor) { // from class: androidx.appcompat.widget.PopupMenu.3
                @Override // androidx.appcompat.widget.ForwardingListener
                public z4 getPopup() {
                    return PopupMenu.this.mPopup.getPopup();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    PopupMenu.this.show();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    PopupMenu.this.dismiss();
                    return true;
                }
            };
        }
        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.getGravity();
    }

    @x1
    public Menu getMenu() {
        return this.mMenu;
    }

    @x1
    public MenuInflater getMenuInflater() {
        return new g4(this.mContext);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public ListView getMenuListView() {
        if (this.mPopup.isShowing()) {
            return this.mPopup.getListView();
        }
        return null;
    }

    public void inflate(@v1 int i) {
        getMenuInflater().inflate(i, this.mMenu);
    }

    public void setForceShowIcon(boolean z) {
        this.mPopup.setForceShowIcon(z);
    }

    public void setGravity(int i) {
        this.mPopup.setGravity(i);
    }

    public void setOnDismissListener(@z1 OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnMenuItemClickListener(@z1 OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void show() {
        this.mPopup.show();
    }

    public PopupMenu(@x1 Context context, @x1 View view, int i) {
        this(context, view, i, x2.b.z2, 0);
    }

    public PopupMenu(@x1 Context context, @x1 View view, int i, @q0 int i2, @m2 int i3) {
        this.mContext = context;
        this.mAnchor = view;
        p4 p4Var = new p4(context);
        this.mMenu = p4Var;
        p4Var.X(new p4.a() { // from class: androidx.appcompat.widget.PopupMenu.1
            @Override // com.p7700g.p99005.p4.a
            public boolean onMenuItemSelected(@x1 p4 p4Var2, @x1 MenuItem menuItem) {
                OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.mMenuItemClickListener;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }

            @Override // com.p7700g.p99005.p4.a
            public void onMenuModeChange(@x1 p4 p4Var2) {
            }
        });
        v4 v4Var = new v4(context, p4Var, view, false, i2, i3);
        this.mPopup = v4Var;
        v4Var.setGravity(i);
        v4Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.PopupMenu.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                PopupMenu popupMenu = PopupMenu.this;
                OnDismissListener onDismissListener = popupMenu.mOnDismissListener;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(popupMenu);
                }
            }
        });
    }
}