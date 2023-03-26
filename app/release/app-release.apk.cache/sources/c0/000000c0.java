package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.s4;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.x4;
import com.p7700g.p99005.z4;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements x4.a, View.OnClickListener, ActionMenuView.ActionMenuChildView {
    private static final String s = "ActionMenuItemView";
    private static final int t = 32;
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    public s4 u;
    private CharSequence v;
    private Drawable w;
    public p4.b x;
    private ForwardingListener y;
    public b z;

    /* loaded from: classes.dex */
    public class a extends ForwardingListener {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public z4 getPopup() {
            b bVar = ActionMenuItemView.this.z;
            if (bVar != null) {
                return bVar.getPopup();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStarted() {
            z4 popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            p4.b bVar = actionMenuItemView.x;
            return bVar != null && bVar.invokeItem(actionMenuItemView.u) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract z4 getPopup();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.v);
        if (this.w != null && (!this.u.E() || (!this.A && !this.B))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.v : null);
        CharSequence contentDescription = this.u.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.u.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.u.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.setTooltipText(this, z3 ? null : this.u.getTitle());
        } else {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void a(boolean z, char c) {
    }

    @Override // com.p7700g.p99005.x4.a
    public boolean b() {
        return true;
    }

    @Override // com.p7700g.p99005.x4.a
    public boolean c() {
        return true;
    }

    @Override // com.p7700g.p99005.x4.a
    public void d(s4 s4Var, int i) {
        this.u = s4Var;
        setIcon(s4Var.getIcon());
        setTitle(s4Var.l(this));
        setId(s4Var.getItemId());
        setVisibility(s4Var.isVisible() ? 0 : 8);
        setEnabled(s4Var.isEnabled());
        if (s4Var.hasSubMenu() && this.y == null) {
            this.y = new a();
        }
    }

    public boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // com.p7700g.p99005.x4.a
    public s4 getItemData() {
        return this.u;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return e();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return e() && this.u.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        p4.b bVar = this.x;
        if (bVar != null) {
            bVar.invokeItem(this.u);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A = f();
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean e = e();
        if (e && (i4 = this.D) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.C);
        } else {
            i3 = this.C;
        }
        if (mode != 1073741824 && this.C > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (e || this.w == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.w.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.u.hasSubMenu() && (forwardingListener = this.y) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p7700g.p99005.x4.a
    public void setCheckable(boolean z) {
    }

    @Override // com.p7700g.p99005.x4.a
    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.B != z) {
            this.B = z;
            s4 s4Var = this.u;
            if (s4Var != null) {
                s4Var.e();
            }
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void setIcon(Drawable drawable) {
        this.w = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.E;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(p4.b bVar) {
        this.x = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.D = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.z = bVar;
    }

    @Override // com.p7700g.p99005.x4.a
    public void setTitle(CharSequence charSequence) {
        this.v = charSequence;
        g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.A = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.m.G, i, 0);
        this.C = obtainStyledAttributes.getDimensionPixelSize(x2.m.H, 0);
        obtainStyledAttributes.recycle();
        this.E = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.D = -1;
        setSaveEnabled(false);
    }
}