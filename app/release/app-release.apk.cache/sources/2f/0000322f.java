package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.internal.CheckableImageButton;
import com.p7700g.p99005.a1;
import com.p7700g.p99005.au;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.gh;
import com.p7700g.p99005.ha2;
import com.p7700g.p99005.he2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.je2;
import com.p7700g.p99005.kc2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.l2;
import com.p7700g.p99005.lh2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.m2;
import com.p7700g.p99005.ni2;
import com.p7700g.p99005.nq;
import com.p7700g.p99005.nt;
import com.p7700g.p99005.oi2;
import com.p7700g.p99005.pi2;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.qi2;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.r3;
import com.p7700g.p99005.ri2;
import com.p7700g.p99005.sg2;
import com.p7700g.p99005.si2;
import com.p7700g.p99005.sq;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.ti2;
import com.p7700g.p99005.v80;
import com.p7700g.p99005.vi2;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.wi2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x70;
import com.p7700g.p99005.xi2;
import com.p7700g.p99005.y0;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zn;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = -1;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    private static final int s = ga2.n.ke;
    private static final int t = 167;
    private static final long u = 87;
    private static final long v = 67;
    private static final int w = -1;
    private static final int x = -1;
    private static final String y = "TextInputLayout";
    public static final int z = 0;
    @z1
    private x70 A0;
    @w0
    private int A1;
    @z1
    private x70 B0;
    @w0
    private int B1;
    @z1
    private ColorStateList C0;
    private boolean C1;
    @z1
    private ColorStateList D0;
    public final he2 D1;
    @z1
    private CharSequence E0;
    private boolean E1;
    @x1
    private final TextView F0;
    private boolean F1;
    private boolean G0;
    private ValueAnimator G1;
    @x1
    private final FrameLayout H;
    private CharSequence H0;
    private boolean H1;
    @x1
    private final xi2 I;
    private boolean I0;
    private boolean I1;
    @x1
    private final LinearLayout J;
    @z1
    private lh2 J0;
    @x1
    private final FrameLayout K;
    @z1
    private lh2 K0;
    public EditText L;
    @z1
    private lh2 L0;
    private CharSequence M;
    @x1
    private qh2 M0;
    private int N;
    private boolean N0;
    private int O;
    private final int O0;
    private int P;
    private int P0;
    private int Q;
    private int Q0;
    private final ti2 R;
    private int R0;
    public boolean S;
    private int S0;
    private int T;
    private int T0;
    private boolean U;
    @w0
    private int U0;
    @z1
    private TextView V;
    @w0
    private int V0;
    private int W;
    private final Rect W0;
    private final Rect X0;
    private final RectF Y0;
    private Typeface Z0;
    @z1
    private Drawable a1;
    private int b1;
    private final LinkedHashSet<h> c1;
    private int d1;
    private final SparseArray<ri2> e1;
    @x1
    private final CheckableImageButton f1;
    private final LinkedHashSet<i> g1;
    private ColorStateList h1;
    private PorterDuff.Mode i1;
    @z1
    private Drawable j1;
    private int k1;
    private Drawable l1;
    private View.OnLongClickListener m1;
    private View.OnLongClickListener n1;
    @x1
    private final CheckableImageButton o1;
    private ColorStateList p1;
    private PorterDuff.Mode q1;
    private ColorStateList r1;
    private ColorStateList s1;
    @w0
    private int t1;
    private int u0;
    @w0
    private int u1;
    private CharSequence v0;
    @w0
    private int v1;
    private boolean w0;
    private ColorStateList w1;
    private TextView x0;
    @w0
    private int x1;
    @z1
    private ColorStateList y0;
    @w0
    private int y1;
    private int z0;
    @w0
    private int z1;

    /* loaded from: classes3.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@x1 Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.N0(!textInputLayout.I1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.S) {
                textInputLayout2.D0(editable.length());
            }
            if (TextInputLayout.this.w0) {
                TextInputLayout.this.R0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f1.performClick();
            TextInputLayout.this.f1.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.L.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            TextInputLayout.this.D1.z0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends fq {
        private final TextInputLayout d;

        public e(@x1 TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // com.p7700g.p99005.fq
        public void g(@x1 View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.d.X();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            this.d.I.w(lsVar);
            if (z) {
                lsVar.L1(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                lsVar.L1(charSequence);
                if (z3 && placeholderText != null) {
                    lsVar.L1(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                lsVar.L1(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    lsVar.l1(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    lsVar.L1(charSequence);
                }
                lsVar.H1(!z);
            }
            lsVar.u1((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                lsVar.h1(error);
            }
            View t = this.d.R.t();
            if (t != null) {
                lsVar.o1(t);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface f {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface g {
    }

    /* loaded from: classes3.dex */
    public interface h {
        void a(@x1 TextInputLayout textInputLayout);
    }

    /* loaded from: classes3.dex */
    public interface i {
        void a(@x1 TextInputLayout textInputLayout, int i);
    }

    /* loaded from: classes3.dex */
    public static class j extends au {
        public static final Parcelable.Creator<j> CREATOR = new a();
        @z1
        public CharSequence s;
        public boolean t;
        @z1
        public CharSequence u;
        @z1
        public CharSequence v;
        @z1
        public CharSequence w;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            @z1
            /* renamed from: a */
            public j createFromParcel(@x1 Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @x1
            /* renamed from: b */
            public j createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: c */
            public j[] newArray(int i) {
                return new j[i];
            }
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        @x1
        public String toString() {
            StringBuilder G = wo1.G("TextInputLayout.SavedState{");
            G.append(Integer.toHexString(System.identityHashCode(this)));
            G.append(" error=");
            G.append((Object) this.s);
            G.append(" hint=");
            G.append((Object) this.u);
            G.append(" helperText=");
            G.append((Object) this.v);
            G.append(" placeholderText=");
            G.append((Object) this.w);
            G.append("}");
            return G.toString();
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.s, parcel, i);
            parcel.writeInt(this.t ? 1 : 0);
            TextUtils.writeToParcel(this.u, parcel, i);
            TextUtils.writeToParcel(this.v, parcel, i);
            TextUtils.writeToParcel(this.w, parcel, i);
        }

        public j(@x1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.t = parcel.readInt() == 1;
            this.u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(@x1 Context context) {
        this(context, null);
    }

    private void A(boolean z2) {
        ValueAnimator valueAnimator = this.G1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.G1.cancel();
        }
        if (z2 && this.F1) {
            k(1.0f);
        } else {
            this.D1.z0(1.0f);
        }
        this.C1 = false;
        if (C()) {
            e0();
        }
        Q0();
        this.I.j(false);
        U0();
    }

    private void A0() {
        if (this.P0 == 1) {
            if (sg2.j(getContext())) {
                this.Q0 = getResources().getDimensionPixelSize(ga2.f.C5);
            } else if (sg2.i(getContext())) {
                this.Q0 = getResources().getDimensionPixelSize(ga2.f.B5);
            }
        }
    }

    private x70 B() {
        x70 x70Var = new x70();
        x70Var.G0(u);
        x70Var.I0(ha2.a);
        return x70Var;
    }

    private void B0(@x1 Rect rect) {
        lh2 lh2Var = this.K0;
        if (lh2Var != null) {
            int i2 = rect.bottom;
            lh2Var.setBounds(rect.left, i2 - this.S0, rect.right, i2);
        }
        lh2 lh2Var2 = this.L0;
        if (lh2Var2 != null) {
            int i3 = rect.bottom;
            lh2Var2.setBounds(rect.left, i3 - this.T0, rect.right, i3);
        }
    }

    private boolean C() {
        return this.G0 && !TextUtils.isEmpty(this.H0) && (this.J0 instanceof pi2);
    }

    private void C0() {
        if (this.V != null) {
            EditText editText = this.L;
            D0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void E() {
        Iterator<h> it = this.c1.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private static void E0(@x1 Context context, @x1 TextView textView, int i2, int i3, boolean z2) {
        int i4;
        if (z2) {
            i4 = ga2.m.F;
        } else {
            i4 = ga2.m.E;
        }
        textView.setContentDescription(context.getString(i4, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private void F(int i2) {
        Iterator<i> it = this.g1.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
    }

    private void F0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.V;
        if (textView != null) {
            u0(textView, this.U ? this.W : this.u0);
            if (!this.U && (colorStateList2 = this.C0) != null) {
                this.V.setTextColor(colorStateList2);
            }
            if (!this.U || (colorStateList = this.D0) == null) {
                return;
            }
            this.V.setTextColor(colorStateList);
        }
    }

    private void G(Canvas canvas) {
        lh2 lh2Var;
        if (this.L0 == null || (lh2Var = this.K0) == null) {
            return;
        }
        lh2Var.draw(canvas);
        if (this.L.isFocused()) {
            Rect bounds = this.L0.getBounds();
            Rect bounds2 = this.K0.getBounds();
            float G2 = this.D1.G();
            int centerX = bounds2.centerX();
            bounds.left = ha2.c(centerX, bounds2.left, G2);
            bounds.right = ha2.c(centerX, bounds2.right, G2);
            this.L0.draw(canvas);
        }
    }

    private void G0() {
        if (this.d1 == 3 && this.P0 == 2) {
            ((qi2) this.e1.get(3)).O((AutoCompleteTextView) this.L);
        }
    }

    private void H(@x1 Canvas canvas) {
        if (this.G0) {
            this.D1.l(canvas);
        }
    }

    private void I(boolean z2) {
        ValueAnimator valueAnimator = this.G1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.G1.cancel();
        }
        if (z2 && this.F1) {
            k(0.0f);
        } else {
            this.D1.z0(0.0f);
        }
        if (C() && ((pi2) this.J0).P0()) {
            z();
        }
        this.C1 = true;
        M();
        this.I.j(true);
        U0();
    }

    private int J(int i2, boolean z2) {
        int compoundPaddingLeft = this.L.getCompoundPaddingLeft() + i2;
        return (getPrefixText() == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private boolean J0() {
        int max;
        if (this.L != null && this.L.getMeasuredHeight() < (max = Math.max(this.J.getMeasuredHeight(), this.I.getMeasuredHeight()))) {
            this.L.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private int K(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.L.getCompoundPaddingRight();
        return (getPrefixText() == null || !z2) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private void K0() {
        this.K.setVisibility((this.f1.getVisibility() != 0 || R()) ? 8 : 0);
        this.J.setVisibility(P() || R() || ((this.E0 == null || X()) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    private boolean L() {
        return this.d1 != 0;
    }

    private void L0() {
        this.o1.setVisibility(getErrorIconDrawable() != null && this.R.E() && this.R.m() ? 0 : 8);
        K0();
        T0();
        if (L()) {
            return;
        }
        H0();
    }

    private void M() {
        TextView textView = this.x0;
        if (textView == null || !this.w0) {
            return;
        }
        textView.setText((CharSequence) null);
        v80.b(this.H, this.B0);
        this.x0.setVisibility(4);
    }

    private void M0() {
        if (this.P0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.H.getLayoutParams();
            int u2 = u();
            if (u2 != layoutParams.topMargin) {
                layoutParams.topMargin = u2;
                this.H.requestLayout();
            }
        }
    }

    private void O0(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        TextView textView;
        int i2;
        boolean isEnabled = isEnabled();
        EditText editText = this.L;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.L;
        boolean z5 = editText2 != null && editText2.hasFocus();
        boolean m = this.R.m();
        ColorStateList colorStateList2 = this.r1;
        if (colorStateList2 != null) {
            this.D1.j0(colorStateList2);
            this.D1.u0(this.r1);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.r1;
            if (colorStateList3 != null) {
                i2 = colorStateList3.getColorForState(new int[]{-16842910}, this.B1);
            } else {
                i2 = this.B1;
            }
            this.D1.j0(ColorStateList.valueOf(i2));
            this.D1.u0(ColorStateList.valueOf(i2));
        } else if (m) {
            this.D1.j0(this.R.r());
        } else if (this.U && (textView = this.V) != null) {
            this.D1.j0(textView.getTextColors());
        } else if (z5 && (colorStateList = this.s1) != null) {
            this.D1.j0(colorStateList);
        }
        if (!z4 && this.E1 && (!isEnabled() || !z5)) {
            if (z3 || !this.C1) {
                I(z2);
            }
        } else if (z3 || this.C1) {
            A(z2);
        }
    }

    private void P0() {
        EditText editText;
        if (this.x0 == null || (editText = this.L) == null) {
            return;
        }
        this.x0.setGravity(editText.getGravity());
        this.x0.setPadding(this.L.getCompoundPaddingLeft(), this.L.getCompoundPaddingTop(), this.L.getCompoundPaddingRight(), this.L.getCompoundPaddingBottom());
    }

    private void Q0() {
        EditText editText = this.L;
        R0(editText == null ? 0 : editText.getText().length());
    }

    private boolean R() {
        return this.o1.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(int i2) {
        if (i2 == 0 && !this.C1) {
            y0();
        } else {
            M();
        }
    }

    private void S0(boolean z2, boolean z3) {
        int defaultColor = this.w1.getDefaultColor();
        int colorForState = this.w1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.w1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.U0 = colorForState2;
        } else if (z3) {
            this.U0 = colorForState;
        } else {
            this.U0 = defaultColor;
        }
    }

    private void T0() {
        if (this.L == null) {
            return;
        }
        sr.c2(this.F0, getContext().getResources().getDimensionPixelSize(ga2.f.G5), this.L.getPaddingTop(), (P() || R()) ? 0 : sr.i0(this.L), this.L.getPaddingBottom());
    }

    private void U0() {
        int visibility = this.F0.getVisibility();
        int i2 = (this.E0 == null || X()) ? 8 : 0;
        if (visibility != i2) {
            getEndIconDelegate().c(i2 == 0);
        }
        K0();
        this.F0.setVisibility(i2);
        H0();
    }

    private boolean a0() {
        return this.P0 == 1 && this.L.getMinLines() <= 1;
    }

    private void d0() {
        o();
        q0();
        V0();
        A0();
        j();
        if (this.P0 != 0) {
            M0();
        }
    }

    private void e0() {
        if (C()) {
            RectF rectF = this.Y0;
            this.D1.o(rectF, this.L.getWidth(), this.L.getGravity());
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.R0);
            ((pi2) this.J0).S0(rectF);
        }
    }

    private void g0() {
        if (!C() || this.C1) {
            return;
        }
        z();
        e0();
    }

    private ri2 getEndIconDelegate() {
        ri2 ri2Var = this.e1.get(this.d1);
        return ri2Var != null ? ri2Var : this.e1.get(0);
    }

    @z1
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.o1.getVisibility() == 0) {
            return this.o1;
        }
        if (L() && P()) {
            return this.f1;
        }
        return null;
    }

    private static void h0(@x1 ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                h0((ViewGroup) childAt, z2);
            }
        }
    }

    private void i() {
        TextView textView = this.x0;
        if (textView != null) {
            this.H.addView(textView);
            this.x0.setVisibility(0);
        }
    }

    private void j() {
        if (this.L == null || this.P0 != 1) {
            return;
        }
        if (sg2.j(getContext())) {
            EditText editText = this.L;
            sr.c2(editText, sr.j0(editText), getResources().getDimensionPixelSize(ga2.f.A5), sr.i0(this.L), getResources().getDimensionPixelSize(ga2.f.z5));
        } else if (sg2.i(getContext())) {
            EditText editText2 = this.L;
            sr.c2(editText2, sr.j0(editText2), getResources().getDimensionPixelSize(ga2.f.y5), sr.i0(this.L), getResources().getDimensionPixelSize(ga2.f.x5));
        }
    }

    private void l() {
        lh2 lh2Var = this.J0;
        if (lh2Var == null) {
            return;
        }
        qh2 shapeAppearanceModel = lh2Var.getShapeAppearanceModel();
        qh2 qh2Var = this.M0;
        if (shapeAppearanceModel != qh2Var) {
            this.J0.setShapeAppearanceModel(qh2Var);
            G0();
        }
        if (v()) {
            this.J0.D0(this.R0, this.U0);
        }
        int p = p();
        this.V0 = p;
        this.J0.o0(ColorStateList.valueOf(p));
        if (this.d1 == 3) {
            this.L.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    private void m() {
        ColorStateList valueOf;
        if (this.K0 == null || this.L0 == null) {
            return;
        }
        if (w()) {
            lh2 lh2Var = this.K0;
            if (this.L.isFocused()) {
                valueOf = ColorStateList.valueOf(this.t1);
            } else {
                valueOf = ColorStateList.valueOf(this.U0);
            }
            lh2Var.o0(valueOf);
            this.L0.o0(ColorStateList.valueOf(this.U0));
        }
        invalidate();
    }

    private void n(@x1 RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.O0;
        rectF.left = f2 - i2;
        rectF.right += i2;
    }

    private void n0() {
        TextView textView = this.x0;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void o() {
        int i2 = this.P0;
        if (i2 == 0) {
            this.J0 = null;
            this.K0 = null;
            this.L0 = null;
        } else if (i2 == 1) {
            this.J0 = new lh2(this.M0);
            this.K0 = new lh2();
            this.L0 = new lh2();
        } else if (i2 == 2) {
            if (this.G0 && !(this.J0 instanceof pi2)) {
                this.J0 = new pi2(this.M0);
            } else {
                this.J0 = new lh2(this.M0);
            }
            this.K0 = null;
            this.L0 = null;
        } else {
            throw new IllegalArgumentException(wo1.z(new StringBuilder(), this.P0, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
    }

    private int p() {
        return this.P0 == 1 ? kc2.l(kc2.e(this, ga2.c.o3, 0), this.V0) : this.V0;
    }

    @x1
    private Rect q(@x1 Rect rect) {
        if (this.L != null) {
            Rect rect2 = this.X0;
            boolean k = kf2.k(this);
            rect2.bottom = rect.bottom;
            int i2 = this.P0;
            if (i2 == 1) {
                rect2.left = J(rect.left, k);
                rect2.top = rect.top + this.Q0;
                rect2.right = K(rect.right, k);
                return rect2;
            } else if (i2 != 2) {
                rect2.left = J(rect.left, k);
                rect2.top = getPaddingTop();
                rect2.right = K(rect.right, k);
                return rect2;
            } else {
                rect2.left = this.L.getPaddingLeft() + rect.left;
                rect2.top = rect.top - u();
                rect2.right = rect.right - this.L.getPaddingRight();
                return rect2;
            }
        }
        throw new IllegalStateException();
    }

    private void q0() {
        if (x0()) {
            sr.H1(this.L, this.J0);
        }
    }

    private int r(@x1 Rect rect, @x1 Rect rect2, float f2) {
        if (a0()) {
            return (int) (rect2.top + f2);
        }
        return rect.bottom - this.L.getCompoundPaddingBottom();
    }

    private static void r0(@x1 CheckableImageButton checkableImageButton, @z1 View.OnLongClickListener onLongClickListener) {
        boolean J0 = sr.J0(checkableImageButton);
        boolean z2 = false;
        boolean z3 = onLongClickListener != null;
        z2 = (J0 || z3) ? true : true;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(J0);
        checkableImageButton.setPressable(J0);
        checkableImageButton.setLongClickable(z3);
        sr.Q1(checkableImageButton, z2 ? 1 : 2);
    }

    private int s(@x1 Rect rect, float f2) {
        if (a0()) {
            return (int) (rect.centerY() - (f2 / 2.0f));
        }
        return this.L.getCompoundPaddingTop() + rect.top;
    }

    private static void s0(@x1 CheckableImageButton checkableImageButton, @z1 View.OnClickListener onClickListener, @z1 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        r0(checkableImageButton, onLongClickListener);
    }

    private void setEditText(EditText editText) {
        if (this.L == null) {
            if (this.d1 != 3) {
                boolean z2 = editText instanceof TextInputEditText;
            }
            this.L = editText;
            int i2 = this.N;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.P);
            }
            int i3 = this.O;
            if (i3 != -1) {
                setMaxEms(i3);
            } else {
                setMaxWidth(this.Q);
            }
            d0();
            setTextInputAccessibilityDelegate(new e(this));
            this.D1.M0(this.L.getTypeface());
            this.D1.w0(this.L.getTextSize());
            this.D1.r0(this.L.getLetterSpacing());
            int gravity = this.L.getGravity();
            this.D1.k0((gravity & (-113)) | 48);
            this.D1.v0(gravity);
            this.L.addTextChangedListener(new a());
            if (this.r1 == null) {
                this.r1 = this.L.getHintTextColors();
            }
            if (this.G0) {
                if (TextUtils.isEmpty(this.H0)) {
                    CharSequence hint = this.L.getHint();
                    this.M = hint;
                    setHint(hint);
                    this.L.setHint((CharSequence) null);
                }
                this.I0 = true;
            }
            if (this.V != null) {
                D0(this.L.getText().length());
            }
            I0();
            this.R.f();
            this.I.bringToFront();
            this.J.bringToFront();
            this.K.bringToFront();
            this.o1.bringToFront();
            E();
            T0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            O0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.H0)) {
            return;
        }
        this.H0 = charSequence;
        this.D1.K0(charSequence);
        if (this.C1) {
            return;
        }
        e0();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.w0 == z2) {
            return;
        }
        if (z2) {
            i();
        } else {
            n0();
            this.x0 = null;
        }
        this.w0 = z2;
    }

    @x1
    private Rect t(@x1 Rect rect) {
        if (this.L != null) {
            Rect rect2 = this.X0;
            float D2 = this.D1.D();
            rect2.left = this.L.getCompoundPaddingLeft() + rect.left;
            rect2.top = s(rect, D2);
            rect2.right = rect.right - this.L.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, D2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private static void t0(@x1 CheckableImageButton checkableImageButton, @z1 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r0(checkableImageButton, onLongClickListener);
    }

    private int u() {
        float r;
        if (this.G0) {
            int i2 = this.P0;
            if (i2 == 0) {
                r = this.D1.r();
            } else if (i2 != 2) {
                return 0;
            } else {
                r = this.D1.r() / 2.0f;
            }
            return (int) r;
        }
        return 0;
    }

    private boolean v() {
        return this.P0 == 2 && w();
    }

    private boolean v0() {
        return (this.o1.getVisibility() == 0 || ((L() && P()) || this.E0 != null)) && this.J.getMeasuredWidth() > 0;
    }

    private boolean w() {
        return this.R0 > -1 && this.U0 != 0;
    }

    private boolean w0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.I.getMeasuredWidth() > 0;
    }

    private boolean x0() {
        EditText editText = this.L;
        return (editText == null || this.J0 == null || editText.getBackground() != null || this.P0 == 0) ? false : true;
    }

    private void y0() {
        if (this.x0 == null || !this.w0 || TextUtils.isEmpty(this.v0)) {
            return;
        }
        this.x0.setText(this.v0);
        v80.b(this.H, this.A0);
        this.x0.setVisibility(0);
        this.x0.bringToFront();
        announceForAccessibility(this.v0);
    }

    private void z() {
        if (C()) {
            ((pi2) this.J0).Q0();
        }
    }

    private void z0(boolean z2) {
        if (z2 && getEndIconDrawable() != null) {
            Drawable mutate = fk.r(getEndIconDrawable()).mutate();
            fk.n(mutate, this.R.q());
            this.f1.setImageDrawable(mutate);
            return;
        }
        si2.a(this, this.f1, this.h1, this.i1);
    }

    @r2
    public boolean D() {
        return C() && ((pi2) this.J0).P0();
    }

    public void D0(int i2) {
        boolean z2 = this.U;
        int i3 = this.T;
        if (i3 == -1) {
            this.V.setText(String.valueOf(i2));
            this.V.setContentDescription(null);
            this.U = false;
        } else {
            this.U = i2 > i3;
            E0(getContext(), this.V, i2, this.T, this.U);
            if (z2 != this.U) {
                F0();
            }
            this.V.setText(zn.c().q(getContext().getString(ga2.m.G, Integer.valueOf(i2), Integer.valueOf(this.T))));
        }
        if (this.L == null || z2 == this.U) {
            return;
        }
        N0(false);
        V0();
        I0();
    }

    public boolean H0() {
        boolean z2;
        if (this.L == null) {
            return false;
        }
        boolean z3 = true;
        if (w0()) {
            int measuredWidth = this.I.getMeasuredWidth() - this.L.getPaddingLeft();
            if (this.a1 == null || this.b1 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.a1 = colorDrawable;
                this.b1 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] h2 = nt.h(this.L);
            Drawable drawable = h2[0];
            Drawable drawable2 = this.a1;
            if (drawable != drawable2) {
                nt.w(this.L, drawable2, h2[1], h2[2], h2[3]);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.a1 != null) {
                Drawable[] h3 = nt.h(this.L);
                nt.w(this.L, null, h3[1], h3[2], h3[3]);
                this.a1 = null;
                z2 = true;
            }
            z2 = false;
        }
        if (v0()) {
            int measuredWidth2 = this.F0.getMeasuredWidth() - this.L.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = sq.c((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] h4 = nt.h(this.L);
            Drawable drawable3 = this.j1;
            if (drawable3 != null && this.k1 != measuredWidth2) {
                this.k1 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                nt.w(this.L, h4[0], h4[1], this.j1, h4[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.j1 = colorDrawable2;
                    this.k1 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = h4[2];
                Drawable drawable5 = this.j1;
                if (drawable4 != drawable5) {
                    this.l1 = h4[2];
                    nt.w(this.L, h4[0], h4[1], drawable5, h4[3]);
                } else {
                    z3 = z2;
                }
            }
        } else if (this.j1 == null) {
            return z2;
        } else {
            Drawable[] h5 = nt.h(this.L);
            if (h5[2] == this.j1) {
                nt.w(this.L, h5[0], h5[1], this.l1, h5[3]);
            } else {
                z3 = z2;
            }
            this.j1 = null;
        }
        return z3;
    }

    public void I0() {
        Drawable background;
        TextView textView;
        EditText editText = this.L;
        if (editText == null || this.P0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (this.R.m()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.R.q(), PorterDuff.Mode.SRC_IN));
        } else if (this.U && (textView = this.V) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            fk.c(background);
            this.L.refreshDrawableState();
        }
    }

    public boolean N() {
        return this.S;
    }

    public void N0(boolean z2) {
        O0(z2, false);
    }

    public boolean O() {
        return this.f1.a();
    }

    public boolean P() {
        return this.K.getVisibility() == 0 && this.f1.getVisibility() == 0;
    }

    public boolean Q() {
        return this.R.E();
    }

    public boolean S() {
        return this.E1;
    }

    @r2
    public final boolean T() {
        return this.R.x();
    }

    public boolean U() {
        return this.R.F();
    }

    public boolean V() {
        return this.F1;
    }

    public void V0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.J0 == null || this.P0 == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.L) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.L) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.U0 = this.B1;
        } else if (this.R.m()) {
            if (this.w1 != null) {
                S0(z3, z2);
            } else {
                this.U0 = this.R.q();
            }
        } else if (!this.U || (textView = this.V) == null) {
            if (z3) {
                this.U0 = this.v1;
            } else if (z2) {
                this.U0 = this.u1;
            } else {
                this.U0 = this.t1;
            }
        } else if (this.w1 != null) {
            S0(z3, z2);
        } else {
            this.U0 = textView.getCurrentTextColor();
        }
        L0();
        j0();
        k0();
        i0();
        if (getEndIconDelegate().d()) {
            z0(this.R.m());
        }
        if (this.P0 == 2) {
            int i2 = this.R0;
            if (z3 && isEnabled()) {
                this.R0 = this.T0;
            } else {
                this.R0 = this.S0;
            }
            if (this.R0 != i2) {
                g0();
            }
        }
        if (this.P0 == 1) {
            if (!isEnabled()) {
                this.V0 = this.y1;
            } else if (z2 && !z3) {
                this.V0 = this.A1;
            } else if (z3) {
                this.V0 = this.z1;
            } else {
                this.V0 = this.x1;
            }
        }
        l();
    }

    public boolean W() {
        return this.G0;
    }

    public final boolean X() {
        return this.C1;
    }

    @Deprecated
    public boolean Y() {
        return this.d1 == 1;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean Z() {
        return this.I0;
    }

    @Override // android.view.ViewGroup
    public void addView(@x1 View view, int i2, @x1 ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.H.addView(view, layoutParams2);
            this.H.setLayoutParams(layoutParams);
            M0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public boolean b0() {
        return this.I.h();
    }

    public boolean c0() {
        return this.I.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@x1 ViewStructure viewStructure, int i2) {
        EditText editText = this.L;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.M != null) {
            boolean z2 = this.I0;
            this.I0 = false;
            CharSequence hint = editText.getHint();
            this.L.setHint(this.M);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.L.setHint(hint);
                this.I0 = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.H.getChildCount());
        for (int i3 = 0; i3 < this.H.getChildCount(); i3++) {
            View childAt = this.H.getChildAt(i3);
            ViewStructure newChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(newChild, i2);
            if (childAt == this.L) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@x1 SparseArray<Parcelable> sparseArray) {
        this.I1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.I1 = false;
    }

    @Override // android.view.View
    public void draw(@x1 Canvas canvas) {
        super.draw(canvas);
        H(canvas);
        G(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.H1) {
            return;
        }
        boolean z2 = true;
        this.H1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        he2 he2Var = this.D1;
        boolean J0 = he2Var != null ? he2Var.J0(drawableState) | false : false;
        if (this.L != null) {
            N0((sr.T0(this) && isEnabled()) ? false : false);
        }
        I0();
        V0();
        if (J0) {
            invalidate();
        }
        this.H1 = false;
    }

    @Deprecated
    public void f0(boolean z2) {
        if (this.d1 == 1) {
            this.f1.performClick();
            if (z2) {
                this.f1.jumpDrawablesToCurrentState();
            }
        }
    }

    public void g(@x1 h hVar) {
        this.c1.add(hVar);
        if (this.L != null) {
            hVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.L;
        if (editText != null) {
            return getPaddingTop() + editText.getBaseline() + u();
        }
        return super.getBaseline();
    }

    @x1
    public lh2 getBoxBackground() {
        int i2 = this.P0;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException();
        }
        return this.J0;
    }

    public int getBoxBackgroundColor() {
        return this.V0;
    }

    public int getBoxBackgroundMode() {
        return this.P0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (kf2.k(this)) {
            return this.M0.j().a(this.Y0);
        }
        return this.M0.l().a(this.Y0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (kf2.k(this)) {
            return this.M0.l().a(this.Y0);
        }
        return this.M0.j().a(this.Y0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (kf2.k(this)) {
            return this.M0.r().a(this.Y0);
        }
        return this.M0.t().a(this.Y0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (kf2.k(this)) {
            return this.M0.t().a(this.Y0);
        }
        return this.M0.r().a(this.Y0);
    }

    public int getBoxStrokeColor() {
        return this.v1;
    }

    @z1
    public ColorStateList getBoxStrokeErrorColor() {
        return this.w1;
    }

    public int getBoxStrokeWidth() {
        return this.S0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T0;
    }

    public int getCounterMaxLength() {
        return this.T;
    }

    @z1
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.S && this.U && (textView = this.V) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @z1
    public ColorStateList getCounterOverflowTextColor() {
        return this.C0;
    }

    @z1
    public ColorStateList getCounterTextColor() {
        return this.C0;
    }

    @z1
    public ColorStateList getDefaultHintTextColor() {
        return this.r1;
    }

    @z1
    public EditText getEditText() {
        return this.L;
    }

    @z1
    public CharSequence getEndIconContentDescription() {
        return this.f1.getContentDescription();
    }

    @z1
    public Drawable getEndIconDrawable() {
        return this.f1.getDrawable();
    }

    public int getEndIconMode() {
        return this.d1;
    }

    @x1
    public CheckableImageButton getEndIconView() {
        return this.f1;
    }

    @z1
    public CharSequence getError() {
        if (this.R.E()) {
            return this.R.p();
        }
        return null;
    }

    @z1
    public CharSequence getErrorContentDescription() {
        return this.R.o();
    }

    @w0
    public int getErrorCurrentTextColors() {
        return this.R.q();
    }

    @z1
    public Drawable getErrorIconDrawable() {
        return this.o1.getDrawable();
    }

    @r2
    public final int getErrorTextCurrentColor() {
        return this.R.q();
    }

    @z1
    public CharSequence getHelperText() {
        if (this.R.F()) {
            return this.R.s();
        }
        return null;
    }

    @w0
    public int getHelperTextCurrentTextColor() {
        return this.R.v();
    }

    @z1
    public CharSequence getHint() {
        if (this.G0) {
            return this.H0;
        }
        return null;
    }

    @r2
    public final float getHintCollapsedTextHeight() {
        return this.D1.r();
    }

    @r2
    public final int getHintCurrentCollapsedTextColor() {
        return this.D1.w();
    }

    @z1
    public ColorStateList getHintTextColor() {
        return this.s1;
    }

    public int getMaxEms() {
        return this.O;
    }

    @c2
    public int getMaxWidth() {
        return this.Q;
    }

    public int getMinEms() {
        return this.N;
    }

    @c2
    public int getMinWidth() {
        return this.P;
    }

    @z1
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1.getContentDescription();
    }

    @z1
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1.getDrawable();
    }

    @z1
    public CharSequence getPlaceholderText() {
        if (this.w0) {
            return this.v0;
        }
        return null;
    }

    @m2
    public int getPlaceholderTextAppearance() {
        return this.z0;
    }

    @z1
    public ColorStateList getPlaceholderTextColor() {
        return this.y0;
    }

    @z1
    public CharSequence getPrefixText() {
        return this.I.a();
    }

    @z1
    public ColorStateList getPrefixTextColor() {
        return this.I.b();
    }

    @x1
    public TextView getPrefixTextView() {
        return this.I.c();
    }

    @z1
    public CharSequence getStartIconContentDescription() {
        return this.I.d();
    }

    @z1
    public Drawable getStartIconDrawable() {
        return this.I.e();
    }

    @z1
    public CharSequence getSuffixText() {
        return this.E0;
    }

    @z1
    public ColorStateList getSuffixTextColor() {
        return this.F0.getTextColors();
    }

    @x1
    public TextView getSuffixTextView() {
        return this.F0;
    }

    @z1
    public Typeface getTypeface() {
        return this.Z0;
    }

    public void h(@x1 i iVar) {
        this.g1.add(iVar);
    }

    public void i0() {
        si2.c(this, this.f1, this.h1);
    }

    public void j0() {
        si2.c(this, this.o1, this.p1);
    }

    @r2
    public void k(float f2) {
        if (this.D1.G() == f2) {
            return;
        }
        if (this.G1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.G1 = valueAnimator;
            valueAnimator.setInterpolator(ha2.b);
            this.G1.setDuration(167L);
            this.G1.addUpdateListener(new d());
        }
        this.G1.setFloatValues(this.D1.G(), f2);
        this.G1.start();
    }

    public void k0() {
        this.I.k();
    }

    public void l0(@x1 h hVar) {
        this.c1.remove(hVar);
    }

    public void m0(@x1 i iVar) {
        this.g1.remove(iVar);
    }

    public void o0(float f2, float f3, float f4, float f5) {
        boolean k = kf2.k(this);
        this.N0 = k;
        float f6 = k ? f3 : f2;
        if (!k) {
            f2 = f3;
        }
        float f7 = k ? f5 : f4;
        if (!k) {
            f4 = f5;
        }
        lh2 lh2Var = this.J0;
        if (lh2Var != null && lh2Var.S() == f6 && this.J0.T() == f2 && this.J0.t() == f7 && this.J0.u() == f4) {
            return;
        }
        this.M0 = this.M0.v().K(f6).P(f2).x(f7).C(f4).m();
        l();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@x1 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.D1.Z(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.L;
        if (editText != null) {
            Rect rect = this.W0;
            je2.a(this, editText, rect);
            B0(rect);
            if (this.G0) {
                this.D1.w0(this.L.getTextSize());
                int gravity = this.L.getGravity();
                this.D1.k0((gravity & (-113)) | 48);
                this.D1.v0(gravity);
                this.D1.g0(q(rect));
                this.D1.q0(t(rect));
                this.D1.c0();
                if (!C() || this.C1) {
                    return;
                }
                e0();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean J0 = J0();
        boolean H0 = H0();
        if (J0 || H0) {
            this.L.post(new c());
        }
        P0();
        T0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@z1 Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        setError(jVar.s);
        if (jVar.t) {
            this.f1.post(new b());
        }
        setHint(jVar.u);
        setHelperText(jVar.v);
        setPlaceholderText(jVar.w);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = false;
        boolean z3 = i2 == 1;
        boolean z4 = this.N0;
        if (z3 != z4) {
            if (z3 && !z4) {
                z2 = true;
            }
            float a2 = this.M0.r().a(this.Y0);
            float a3 = this.M0.t().a(this.Y0);
            float a4 = this.M0.j().a(this.Y0);
            float a5 = this.M0.l().a(this.Y0);
            float f2 = z2 ? a2 : a3;
            if (z2) {
                a2 = a3;
            }
            float f3 = z2 ? a4 : a5;
            if (z2) {
                a4 = a5;
            }
            o0(f2, a2, f3, a4);
        }
    }

    @Override // android.view.View
    @z1
    public Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        if (this.R.m()) {
            jVar.s = getError();
        }
        jVar.t = L() && this.f1.isChecked();
        jVar.u = getHint();
        jVar.v = getHelperText();
        jVar.w = getPlaceholderText();
        return jVar;
    }

    public void p0(@a1 int i2, @a1 int i3, @a1 int i4, @a1 int i5) {
        o0(getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i3), getContext().getResources().getDimension(i5), getContext().getResources().getDimension(i4));
    }

    public void setBoxBackgroundColor(@w0 int i2) {
        if (this.V0 != i2) {
            this.V0 = i2;
            this.x1 = i2;
            this.z1 = i2;
            this.A1 = i2;
            l();
        }
    }

    public void setBoxBackgroundColorResource(@y0 int i2) {
        setBoxBackgroundColor(gh.f(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(@x1 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.x1 = defaultColor;
        this.V0 = defaultColor;
        this.y1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.z1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.A1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.P0) {
            return;
        }
        this.P0 = i2;
        if (this.L != null) {
            d0();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.Q0 = i2;
    }

    public void setBoxStrokeColor(@w0 int i2) {
        if (this.v1 != i2) {
            this.v1 = i2;
            V0();
        }
    }

    public void setBoxStrokeColorStateList(@x1 ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.t1 = colorStateList.getDefaultColor();
            this.B1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.u1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.v1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.v1 != colorStateList.getDefaultColor()) {
            this.v1 = colorStateList.getDefaultColor();
        }
        V0();
    }

    public void setBoxStrokeErrorColor(@z1 ColorStateList colorStateList) {
        if (this.w1 != colorStateList) {
            this.w1 = colorStateList;
            V0();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.S0 = i2;
        V0();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.T0 = i2;
        V0();
    }

    public void setBoxStrokeWidthFocusedResource(@a1 int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(@a1 int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.S != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.V = appCompatTextView;
                appCompatTextView.setId(ga2.h.L5);
                Typeface typeface = this.Z0;
                if (typeface != null) {
                    this.V.setTypeface(typeface);
                }
                this.V.setMaxLines(1);
                this.R.e(this.V, 2);
                sq.h((ViewGroup.MarginLayoutParams) this.V.getLayoutParams(), getResources().getDimensionPixelOffset(ga2.f.s9));
                F0();
                C0();
            } else {
                this.R.G(this.V, 2);
                this.V = null;
            }
            this.S = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.T != i2) {
            if (i2 > 0) {
                this.T = i2;
            } else {
                this.T = -1;
            }
            if (this.S) {
                C0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.W != i2) {
            this.W = i2;
            F0();
        }
    }

    public void setCounterOverflowTextColor(@z1 ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            F0();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.u0 != i2) {
            this.u0 = i2;
            F0();
        }
    }

    public void setCounterTextColor(@z1 ColorStateList colorStateList) {
        if (this.C0 != colorStateList) {
            this.C0 = colorStateList;
            F0();
        }
    }

    public void setDefaultHintTextColor(@z1 ColorStateList colorStateList) {
        this.r1 = colorStateList;
        this.s1 = colorStateList;
        if (this.L != null) {
            N0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        h0(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f1.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1.setCheckable(z2);
    }

    public void setEndIconContentDescription(@l2 int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(@f1 int i2) {
        setEndIconDrawable(i2 != 0 ? r3.b(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.d1;
        if (i3 == i2) {
            return;
        }
        this.d1 = i2;
        F(i3);
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.P0)) {
            getEndIconDelegate().a();
            si2.a(this, this.f1, this.h1, this.i1);
            return;
        }
        StringBuilder G2 = wo1.G("The current box background mode ");
        G2.append(this.P0);
        G2.append(" is not supported by the end icon mode ");
        G2.append(i2);
        throw new IllegalStateException(G2.toString());
    }

    public void setEndIconOnClickListener(@z1 View.OnClickListener onClickListener) {
        s0(this.f1, onClickListener, this.m1);
    }

    public void setEndIconOnLongClickListener(@z1 View.OnLongClickListener onLongClickListener) {
        this.m1 = onLongClickListener;
        t0(this.f1, onLongClickListener);
    }

    public void setEndIconTintList(@z1 ColorStateList colorStateList) {
        if (this.h1 != colorStateList) {
            this.h1 = colorStateList;
            si2.a(this, this.f1, colorStateList, this.i1);
        }
    }

    public void setEndIconTintMode(@z1 PorterDuff.Mode mode) {
        if (this.i1 != mode) {
            this.i1 = mode;
            si2.a(this, this.f1, this.h1, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (P() != z2) {
            this.f1.setVisibility(z2 ? 0 : 8);
            K0();
            T0();
            H0();
        }
    }

    public void setError(@z1 CharSequence charSequence) {
        if (!this.R.E()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.R.T(charSequence);
        } else {
            this.R.z();
        }
    }

    public void setErrorContentDescription(@z1 CharSequence charSequence) {
        this.R.I(charSequence);
    }

    public void setErrorEnabled(boolean z2) {
        this.R.J(z2);
    }

    public void setErrorIconDrawable(@f1 int i2) {
        setErrorIconDrawable(i2 != 0 ? r3.b(getContext(), i2) : null);
        j0();
    }

    public void setErrorIconOnClickListener(@z1 View.OnClickListener onClickListener) {
        s0(this.o1, onClickListener, this.n1);
    }

    public void setErrorIconOnLongClickListener(@z1 View.OnLongClickListener onLongClickListener) {
        this.n1 = onLongClickListener;
        t0(this.o1, onLongClickListener);
    }

    public void setErrorIconTintList(@z1 ColorStateList colorStateList) {
        if (this.p1 != colorStateList) {
            this.p1 = colorStateList;
            si2.a(this, this.o1, colorStateList, this.q1);
        }
    }

    public void setErrorIconTintMode(@z1 PorterDuff.Mode mode) {
        if (this.q1 != mode) {
            this.q1 = mode;
            si2.a(this, this.o1, this.p1, mode);
        }
    }

    public void setErrorTextAppearance(@m2 int i2) {
        this.R.K(i2);
    }

    public void setErrorTextColor(@z1 ColorStateList colorStateList) {
        this.R.L(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.E1 != z2) {
            this.E1 = z2;
            N0(false);
        }
    }

    public void setHelperText(@z1 CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (U()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!U()) {
            setHelperTextEnabled(true);
        }
        this.R.U(charSequence);
    }

    public void setHelperTextColor(@z1 ColorStateList colorStateList) {
        this.R.O(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.R.N(z2);
    }

    public void setHelperTextTextAppearance(@m2 int i2) {
        this.R.M(i2);
    }

    public void setHint(@z1 CharSequence charSequence) {
        if (this.G0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.F1 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.G0) {
            this.G0 = z2;
            if (!z2) {
                this.I0 = false;
                if (!TextUtils.isEmpty(this.H0) && TextUtils.isEmpty(this.L.getHint())) {
                    this.L.setHint(this.H0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.L.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.H0)) {
                        setHint(hint);
                    }
                    this.L.setHint((CharSequence) null);
                }
                this.I0 = true;
            }
            if (this.L != null) {
                M0();
            }
        }
    }

    public void setHintTextAppearance(@m2 int i2) {
        this.D1.h0(i2);
        this.s1 = this.D1.p();
        if (this.L != null) {
            N0(false);
            M0();
        }
    }

    public void setHintTextColor(@z1 ColorStateList colorStateList) {
        if (this.s1 != colorStateList) {
            if (this.r1 == null) {
                this.D1.j0(colorStateList);
            }
            this.s1 = colorStateList;
            if (this.L != null) {
                N0(false);
            }
        }
    }

    public void setMaxEms(int i2) {
        this.O = i2;
        EditText editText = this.L;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(@c2 int i2) {
        this.Q = i2;
        EditText editText = this.L;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(@a1 int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.N = i2;
        EditText editText = this.L;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(@c2 int i2) {
        this.P = i2;
        EditText editText = this.L;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(@a1 int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@l2 int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@f1 int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? r3.b(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.d1 != 1) {
            setEndIconMode(1);
        } else if (z2) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@z1 ColorStateList colorStateList) {
        this.h1 = colorStateList;
        si2.a(this, this.f1, colorStateList, this.i1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@z1 PorterDuff.Mode mode) {
        this.i1 = mode;
        si2.a(this, this.f1, this.h1, mode);
    }

    public void setPlaceholderText(@z1 CharSequence charSequence) {
        if (this.x0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.x0 = appCompatTextView;
            appCompatTextView.setId(ga2.h.O5);
            sr.Q1(this.x0, 2);
            x70 B2 = B();
            this.A0 = B2;
            B2.N0(v);
            this.B0 = B();
            setPlaceholderTextAppearance(this.z0);
            setPlaceholderTextColor(this.y0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.w0) {
                setPlaceholderTextEnabled(true);
            }
            this.v0 = charSequence;
        }
        Q0();
    }

    public void setPlaceholderTextAppearance(@m2 int i2) {
        this.z0 = i2;
        TextView textView = this.x0;
        if (textView != null) {
            nt.E(textView, i2);
        }
    }

    public void setPlaceholderTextColor(@z1 ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            TextView textView = this.x0;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@z1 CharSequence charSequence) {
        this.I.l(charSequence);
    }

    public void setPrefixTextAppearance(@m2 int i2) {
        this.I.m(i2);
    }

    public void setPrefixTextColor(@x1 ColorStateList colorStateList) {
        this.I.n(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.I.o(z2);
    }

    public void setStartIconContentDescription(@l2 int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(@f1 int i2) {
        setStartIconDrawable(i2 != 0 ? r3.b(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(@z1 View.OnClickListener onClickListener) {
        this.I.r(onClickListener);
    }

    public void setStartIconOnLongClickListener(@z1 View.OnLongClickListener onLongClickListener) {
        this.I.s(onLongClickListener);
    }

    public void setStartIconTintList(@z1 ColorStateList colorStateList) {
        this.I.t(colorStateList);
    }

    public void setStartIconTintMode(@z1 PorterDuff.Mode mode) {
        this.I.u(mode);
    }

    public void setStartIconVisible(boolean z2) {
        this.I.v(z2);
    }

    public void setSuffixText(@z1 CharSequence charSequence) {
        this.E0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.F0.setText(charSequence);
        U0();
    }

    public void setSuffixTextAppearance(@m2 int i2) {
        nt.E(this.F0, i2);
    }

    public void setSuffixTextColor(@x1 ColorStateList colorStateList) {
        this.F0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@z1 e eVar) {
        EditText editText = this.L;
        if (editText != null) {
            sr.A1(editText, eVar);
        }
    }

    public void setTypeface(@z1 Typeface typeface) {
        if (typeface != this.Z0) {
            this.Z0 = typeface;
            this.D1.M0(typeface);
            this.R.Q(typeface);
            TextView textView = this.V;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u0(@x1 TextView textView, @m2 int i2) {
        boolean z2 = true;
        try {
            nt.E(textView, i2);
            if (Build.VERSION.SDK_INT >= 23) {
            }
            z2 = false;
        } catch (Exception unused) {
        }
        if (z2) {
            nt.E(textView, ga2.n.y6);
            textView.setTextColor(gh.f(getContext(), ga2.e.w0));
        }
    }

    public void x() {
        this.c1.clear();
    }

    public void y() {
        this.g1.clear();
    }

    public TextInputLayout(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.Fg);
    }

    public void setEndIconContentDescription(@z1 CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f1.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@z1 Drawable drawable) {
        this.f1.setImageDrawable(drawable);
        if (drawable != null) {
            si2.a(this, this.f1, this.h1, this.i1);
            i0();
        }
    }

    public void setStartIconContentDescription(@z1 CharSequence charSequence) {
        this.I.p(charSequence);
    }

    public void setStartIconDrawable(@z1 Drawable drawable) {
        this.I.q(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(@x1 Context context, @z1 AttributeSet attributeSet, int i2) {
        super(yi2.c(context, attributeSet, i2, r9), attributeSet, i2);
        int i3;
        ?? r2;
        boolean z2;
        int i4;
        int i5 = s;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = new ti2(this);
        this.W0 = new Rect();
        this.X0 = new Rect();
        this.Y0 = new RectF();
        this.c1 = new LinkedHashSet<>();
        this.d1 = 0;
        this.e1 = new SparseArray<>();
        this.g1 = new LinkedHashSet<>();
        he2 he2Var = new he2(this);
        this.D1 = he2Var;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.H = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.K = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.J = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.F0 = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        int i6 = ga2.k.Q;
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(i6, (ViewGroup) linearLayout, false);
        this.o1 = checkableImageButton;
        this.f1 = (CheckableImageButton) from.inflate(i6, (ViewGroup) frameLayout2, false);
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, nq.c));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = ha2.a;
        he2Var.L0(timeInterpolator);
        he2Var.H0(timeInterpolator);
        he2Var.k0(8388659);
        int[] iArr = ga2.o.Ot;
        int i7 = ga2.o.lu;
        int i8 = ga2.o.ju;
        int i9 = ga2.o.yu;
        int i10 = ga2.o.Du;
        int i11 = ga2.o.Hu;
        TintTypedArray k = cf2.k(context2, attributeSet, iArr, i2, i5, i7, i8, i9, i10, i11);
        this.I = new xi2(this, k);
        this.G0 = k.getBoolean(ga2.o.Gu, true);
        setHint(k.getText(ga2.o.Tt));
        this.F1 = k.getBoolean(ga2.o.Fu, true);
        this.E1 = k.getBoolean(ga2.o.Au, true);
        int i12 = ga2.o.Vt;
        if (k.hasValue(i12)) {
            setMinEms(k.getInt(i12, -1));
        } else {
            int i13 = ga2.o.St;
            if (k.hasValue(i13)) {
                setMinWidth(k.getDimensionPixelSize(i13, -1));
            }
        }
        int i14 = ga2.o.Ut;
        if (k.hasValue(i14)) {
            setMaxEms(k.getInt(i14, -1));
        } else {
            int i15 = ga2.o.Rt;
            if (k.hasValue(i15)) {
                setMaxWidth(k.getDimensionPixelSize(i15, -1));
            }
        }
        this.M0 = qh2.e(context2, attributeSet, i2, i5).m();
        this.O0 = context2.getResources().getDimensionPixelOffset(ga2.f.p9);
        this.Q0 = k.getDimensionPixelOffset(ga2.o.Yt, 0);
        this.S0 = k.getDimensionPixelSize(ga2.o.fu, context2.getResources().getDimensionPixelSize(ga2.f.q9));
        this.T0 = k.getDimensionPixelSize(ga2.o.gu, context2.getResources().getDimensionPixelSize(ga2.f.r9));
        this.R0 = this.S0;
        float dimension = k.getDimension(ga2.o.cu, -1.0f);
        float dimension2 = k.getDimension(ga2.o.bu, -1.0f);
        float dimension3 = k.getDimension(ga2.o.Zt, -1.0f);
        float dimension4 = k.getDimension(ga2.o.au, -1.0f);
        qh2.b v2 = this.M0.v();
        if (dimension >= 0.0f) {
            v2.K(dimension);
        }
        if (dimension2 >= 0.0f) {
            v2.P(dimension2);
        }
        if (dimension3 >= 0.0f) {
            v2.C(dimension3);
        }
        if (dimension4 >= 0.0f) {
            v2.x(dimension4);
        }
        this.M0 = v2.m();
        ColorStateList b2 = sg2.b(context2, k, ga2.o.Wt);
        if (b2 != null) {
            int defaultColor = b2.getDefaultColor();
            this.x1 = defaultColor;
            this.V0 = defaultColor;
            if (b2.isStateful()) {
                this.y1 = b2.getColorForState(new int[]{-16842910}, -1);
                i3 = 2;
                this.z1 = b2.getColorForState(new int[]{16842908, 16842910}, -1);
                this.A1 = b2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                i3 = 2;
                this.z1 = this.x1;
                ColorStateList a2 = r3.a(context2, ga2.e.t9);
                this.y1 = a2.getColorForState(new int[]{-16842910}, -1);
                this.A1 = a2.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            i3 = 2;
            this.V0 = 0;
            this.x1 = 0;
            this.y1 = 0;
            this.z1 = 0;
            this.A1 = 0;
        }
        int i16 = ga2.o.Qt;
        if (k.hasValue(i16)) {
            ColorStateList colorStateList = k.getColorStateList(i16);
            this.s1 = colorStateList;
            this.r1 = colorStateList;
        }
        int i17 = ga2.o.du;
        ColorStateList b3 = sg2.b(context2, k, i17);
        this.v1 = k.getColor(i17, 0);
        this.t1 = gh.f(context2, ga2.e.Q9);
        this.B1 = gh.f(context2, ga2.e.R9);
        this.u1 = gh.f(context2, ga2.e.U9);
        if (b3 != null) {
            setBoxStrokeColorStateList(b3);
        }
        int i18 = ga2.o.eu;
        if (k.hasValue(i18)) {
            setBoxStrokeErrorColor(sg2.b(context2, k, i18));
        }
        if (k.getResourceId(i11, -1) != -1) {
            r2 = 0;
            setHintTextAppearance(k.getResourceId(i11, 0));
        } else {
            r2 = 0;
        }
        int resourceId = k.getResourceId(i9, r2);
        CharSequence text = k.getText(ga2.o.tu);
        boolean z3 = k.getBoolean(ga2.o.uu, r2);
        checkableImageButton.setId(ga2.h.J5);
        if (sg2.i(context2)) {
            sq.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r2);
        }
        int i19 = ga2.o.wu;
        if (k.hasValue(i19)) {
            this.p1 = sg2.b(context2, k, i19);
        }
        int i20 = ga2.o.xu;
        if (k.hasValue(i20)) {
            this.q1 = kf2.l(k.getInt(i20, -1), null);
        }
        int i21 = ga2.o.vu;
        if (k.hasValue(i21)) {
            setErrorIconDrawable(k.getDrawable(i21));
        }
        checkableImageButton.setContentDescription(getResources().getText(ga2.m.J));
        sr.Q1(checkableImageButton, i3);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int resourceId2 = k.getResourceId(i10, 0);
        boolean z4 = k.getBoolean(ga2.o.Cu, false);
        CharSequence text2 = k.getText(ga2.o.Bu);
        int resourceId3 = k.getResourceId(ga2.o.Pu, 0);
        CharSequence text3 = k.getText(ga2.o.Ou);
        int resourceId4 = k.getResourceId(ga2.o.cv, 0);
        CharSequence text4 = k.getText(ga2.o.bv);
        boolean z5 = k.getBoolean(ga2.o.hu, false);
        setCounterMaxLength(k.getInt(ga2.o.iu, -1));
        this.u0 = k.getResourceId(i7, 0);
        this.W = k.getResourceId(i8, 0);
        setBoxBackgroundMode(k.getInt(ga2.o.Xt, 0));
        if (sg2.i(context2)) {
            sq.h((ViewGroup.MarginLayoutParams) this.f1.getLayoutParams(), 0);
        }
        int resourceId5 = k.getResourceId(ga2.o.pu, 0);
        this.e1.append(-1, new oi2(this, resourceId5));
        this.e1.append(0, new vi2(this));
        SparseArray<ri2> sparseArray = this.e1;
        if (resourceId5 == 0) {
            z2 = z5;
            i4 = k.getResourceId(ga2.o.Ku, 0);
        } else {
            z2 = z5;
            i4 = resourceId5;
        }
        sparseArray.append(1, new wi2(this, i4));
        this.e1.append(2, new ni2(this, resourceId5));
        this.e1.append(3, new qi2(this, resourceId5));
        int i22 = ga2.o.Lu;
        if (!k.hasValue(i22)) {
            int i23 = ga2.o.ru;
            if (k.hasValue(i23)) {
                this.h1 = sg2.b(context2, k, i23);
            }
            int i24 = ga2.o.su;
            if (k.hasValue(i24)) {
                this.i1 = kf2.l(k.getInt(i24, -1), null);
            }
        }
        int i25 = ga2.o.qu;
        if (k.hasValue(i25)) {
            setEndIconMode(k.getInt(i25, 0));
            int i26 = ga2.o.ou;
            if (k.hasValue(i26)) {
                setEndIconContentDescription(k.getText(i26));
            }
            setEndIconCheckable(k.getBoolean(ga2.o.nu, true));
        } else if (k.hasValue(i22)) {
            int i27 = ga2.o.Mu;
            if (k.hasValue(i27)) {
                this.h1 = sg2.b(context2, k, i27);
            }
            int i28 = ga2.o.Nu;
            if (k.hasValue(i28)) {
                this.i1 = kf2.l(k.getInt(i28, -1), null);
            }
            setEndIconMode(k.getBoolean(i22, false) ? 1 : 0);
            setEndIconContentDescription(k.getText(ga2.o.Ju));
        }
        this.F0.setId(ga2.h.Q5);
        this.F0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        sr.C1(this.F0, 1);
        setErrorContentDescription(text);
        setCounterOverflowTextAppearance(this.W);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.u0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        setSuffixTextAppearance(resourceId4);
        int i29 = ga2.o.zu;
        if (k.hasValue(i29)) {
            setErrorTextColor(k.getColorStateList(i29));
        }
        int i30 = ga2.o.Eu;
        if (k.hasValue(i30)) {
            setHelperTextColor(k.getColorStateList(i30));
        }
        int i31 = ga2.o.Iu;
        if (k.hasValue(i31)) {
            setHintTextColor(k.getColorStateList(i31));
        }
        int i32 = ga2.o.mu;
        if (k.hasValue(i32)) {
            setCounterTextColor(k.getColorStateList(i32));
        }
        int i33 = ga2.o.ku;
        if (k.hasValue(i33)) {
            setCounterOverflowTextColor(k.getColorStateList(i33));
        }
        int i34 = ga2.o.Qu;
        if (k.hasValue(i34)) {
            setPlaceholderTextColor(k.getColorStateList(i34));
        }
        int i35 = ga2.o.dv;
        if (k.hasValue(i35)) {
            setSuffixTextColor(k.getColorStateList(i35));
        }
        setEnabled(k.getBoolean(ga2.o.Pt, true));
        k.recycle();
        sr.Q1(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            sr.R1(this, 1);
        }
        this.K.addView(this.f1);
        this.J.addView(this.F0);
        this.J.addView(this.o1);
        this.J.addView(this.K);
        this.H.addView(this.I);
        this.H.addView(this.J);
        addView(this.H);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z2);
        setHelperText(text2);
        setSuffixText(text4);
    }

    public void setErrorIconDrawable(@z1 Drawable drawable) {
        this.o1.setImageDrawable(drawable);
        L0();
        si2.a(this, this.o1, this.p1, this.q1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@z1 CharSequence charSequence) {
        this.f1.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@z1 Drawable drawable) {
        this.f1.setImageDrawable(drawable);
    }

    public void setHint(@l2 int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }
}