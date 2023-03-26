package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.s4;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.x4;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements x4.a, AbsListView.SelectionBoundsAdjuster {
    private static final String s = "ListMenuItemView";
    private ImageView A;
    private LinearLayout B;
    private Drawable C;
    private int D;
    private Context E;
    private boolean F;
    private Drawable G;
    private boolean H;
    private LayoutInflater I;
    private boolean J;
    private s4 t;
    private ImageView u;
    private RadioButton v;
    private TextView w;
    private CheckBox x;
    private TextView y;
    private ImageView z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x2.b.Y1);
    }

    private void e(View view) {
        f(view, -1);
    }

    private void f(View view, int i) {
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    private void g() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(x2.j.o, (ViewGroup) this, false);
        this.x = checkBox;
        e(checkBox);
    }

    private LayoutInflater getInflater() {
        if (this.I == null) {
            this.I = LayoutInflater.from(getContext());
        }
        return this.I;
    }

    private void h() {
        ImageView imageView = (ImageView) getInflater().inflate(x2.j.p, (ViewGroup) this, false);
        this.u = imageView;
        f(imageView, 0);
    }

    private void i() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(x2.j.r, (ViewGroup) this, false);
        this.v = radioButton;
        e(radioButton);
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.z;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void a(boolean z, char c) {
        int i = (z && this.t.D()) ? 0 : 8;
        if (i == 0) {
            this.y.setText(this.t.k());
        }
        if (this.y.getVisibility() != i) {
            this.y.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A.getLayoutParams();
        rect.top = this.A.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // com.p7700g.p99005.x4.a
    public boolean b() {
        return false;
    }

    @Override // com.p7700g.p99005.x4.a
    public boolean c() {
        return this.J;
    }

    @Override // com.p7700g.p99005.x4.a
    public void d(s4 s4Var, int i) {
        this.t = s4Var;
        setVisibility(s4Var.isVisible() ? 0 : 8);
        setTitle(s4Var.l(this));
        setCheckable(s4Var.isCheckable());
        a(s4Var.D(), s4Var.j());
        setIcon(s4Var.getIcon());
        setEnabled(s4Var.isEnabled());
        setSubMenuArrowVisible(s4Var.hasSubMenu());
        setContentDescription(s4Var.getContentDescription());
    }

    @Override // com.p7700g.p99005.x4.a
    public s4 getItemData() {
        return this.t;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        sr.H1(this, this.C);
        TextView textView = (TextView) findViewById(x2.g.s0);
        this.w = textView;
        int i = this.D;
        if (i != -1) {
            textView.setTextAppearance(this.E, i);
        }
        this.y = (TextView) findViewById(x2.g.h0);
        ImageView imageView = (ImageView) findViewById(x2.g.n0);
        this.z = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.G);
        }
        this.A = (ImageView) findViewById(x2.g.C);
        this.B = (LinearLayout) findViewById(x2.g.t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.u != null && this.F) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.u.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // com.p7700g.p99005.x4.a
    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.v == null && this.x == null) {
            return;
        }
        if (this.t.p()) {
            if (this.v == null) {
                i();
            }
            compoundButton = this.v;
            compoundButton2 = this.x;
        } else {
            if (this.x == null) {
                g();
            }
            compoundButton = this.x;
            compoundButton2 = this.v;
        }
        if (z) {
            compoundButton.setChecked(this.t.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.x;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.v;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.t.p()) {
            if (this.v == null) {
                i();
            }
            compoundButton = this.v;
        } else {
            if (this.x == null) {
                g();
            }
            compoundButton = this.x;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.J = z;
        this.F = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setVisibility((this.H || !z) ? 8 : 0);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void setIcon(Drawable drawable) {
        boolean z = this.t.C() || this.J;
        if (z || this.F) {
            ImageView imageView = this.u;
            if (imageView == null && drawable == null && !this.F) {
                return;
            }
            if (imageView == null) {
                h();
            }
            if (drawable == null && !this.F) {
                this.u.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.u;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.u.getVisibility() != 0) {
                this.u.setVisibility(0);
            }
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.w.setText(charSequence);
            if (this.w.getVisibility() != 0) {
                this.w.setVisibility(0);
            }
        } else if (this.w.getVisibility() != 8) {
            this.w.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, x2.m.I4, i, 0);
        this.C = obtainStyledAttributes.getDrawable(x2.m.O4);
        this.D = obtainStyledAttributes.getResourceId(x2.m.K4, -1);
        this.F = obtainStyledAttributes.getBoolean(x2.m.Q4, false);
        this.E = context;
        this.G = obtainStyledAttributes.getDrawable(x2.m.R4);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, x2.b.p1, 0);
        this.H = obtainStyledAttributes2.hasValue(0);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }
}