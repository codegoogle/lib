package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.ks;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes3.dex */
public class qi2 extends ri2 {
    private static final boolean e = true;
    private static final int f = 50;
    private static final int g = 67;
    private final TextWatcher h;
    private final View.OnFocusChangeListener i;
    private final TextInputLayout.e j;
    private final TextInputLayout.h k;
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.i l;
    private final View.OnAttachStateChangeListener m;
    private final ks.e n;
    private boolean o;
    private boolean p;
    private long q;
    private StateListDrawable r;
    private lh2 s;
    @z1
    private AccessibilityManager t;
    private ValueAnimator u;
    private ValueAnimator v;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class a extends bf2 {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.p7700g.p99005.qi2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0233a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView s;

            public RunnableC0233a(AutoCompleteTextView autoCompleteTextView) {
                this.s = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.s.isPopupShowing();
                qi2.this.J(isPopupShowing);
                qi2.this.o = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // com.p7700g.p99005.bf2, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView C = qi2.C(qi2.this.a.getEditText());
            if (qi2.this.t.isTouchExplorationEnabled() && qi2.H(C) && !qi2.this.c.hasFocus()) {
                C.dismissDropDown();
            }
            C.post(new RunnableC0233a(C));
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class b implements AutoCompleteTextView.OnDismissListener {
        public b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            qi2.this.N();
            qi2.this.J(false);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            qi2 qi2Var = qi2.this;
            qi2Var.c.setChecked(qi2Var.p);
            qi2.this.v.start();
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            qi2.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class e implements View.OnFocusChangeListener {
        public e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            qi2.this.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            qi2.this.J(false);
            qi2.this.o = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class f extends TextInputLayout.e {
        public f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            if (!qi2.H(qi2.this.a.getEditText())) {
                lsVar.W0(Spinner.class.getName());
            }
            if (lsVar.z0()) {
                lsVar.l1(null);
            }
        }

        @Override // com.p7700g.p99005.fq
        public void h(View view, @x1 AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView C = qi2.C(qi2.this.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && qi2.this.t.isEnabled() && !qi2.H(qi2.this.a.getEditText())) {
                qi2.this.M(C);
                qi2.this.N();
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class g implements TextInputLayout.h {
        public g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@x1 TextInputLayout textInputLayout) {
            AutoCompleteTextView C = qi2.C(textInputLayout.getEditText());
            qi2.this.K(C);
            qi2.this.y(C);
            qi2.this.L(C);
            C.setThreshold(0);
            C.removeTextChangedListener(qi2.this.h);
            C.addTextChangedListener(qi2.this.h);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!qi2.H(C) && qi2.this.t.isTouchExplorationEnabled()) {
                sr.Q1(qi2.this.c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(qi2.this.j);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class h implements TextInputLayout.i {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView s;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.s = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.removeTextChangedListener(qi2.this.h);
            }
        }

        public h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@x1 TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == qi2.this.i) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (qi2.e) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i == 3) {
                textInputLayout.removeOnAttachStateChangeListener(qi2.this.m);
                qi2.this.I();
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class i implements View.OnAttachStateChangeListener {
        public i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            qi2.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            qi2.this.I();
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class j implements ks.e {
        public j() {
        }

        @Override // com.p7700g.p99005.ks.e
        public void onTouchExplorationStateChanged(boolean z) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = qi2.this.a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || qi2.H(autoCompleteTextView)) {
                return;
            }
            sr.Q1(qi2.this.c, z ? 2 : 1);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qi2.this.M((AutoCompleteTextView) qi2.this.a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class l implements View.OnTouchListener {
        public final /* synthetic */ AutoCompleteTextView s;

        public l(AutoCompleteTextView autoCompleteTextView) {
            this.s = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@x1 View view, @x1 MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (qi2.this.G()) {
                    qi2.this.o = false;
                }
                qi2.this.M(this.s);
                qi2.this.N();
            }
            return false;
        }
    }

    public qi2(@x1 TextInputLayout textInputLayout, @f1 int i2) {
        super(textInputLayout, i2);
        this.h = new a();
        this.i = new e();
        this.j = new f(this.a);
        this.k = new g();
        this.l = new h();
        this.m = new i();
        this.n = new j();
        this.o = false;
        this.p = false;
        this.q = Long.MAX_VALUE;
    }

    private void A(@x1 AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, @x1 lh2 lh2Var) {
        LayerDrawable layerDrawable;
        int d2 = kc2.d(autoCompleteTextView, ga2.c.o3);
        lh2 lh2Var2 = new lh2(lh2Var.getShapeAppearanceModel());
        int m = kc2.m(i2, d2, 0.1f);
        lh2Var2.o0(new ColorStateList(iArr, new int[]{m, 0}));
        if (e) {
            lh2Var2.setTint(d2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m, d2});
            lh2 lh2Var3 = new lh2(lh2Var.getShapeAppearanceModel());
            lh2Var3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, lh2Var2, lh2Var3), lh2Var});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{lh2Var2, lh2Var});
        }
        sr.H1(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        TextInputLayout textInputLayout;
        if (this.t == null || (textInputLayout = this.a) == null || !sr.N0(textInputLayout)) {
            return;
        }
        ks.b(this.t, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x1
    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator D(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ha2.a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    private lh2 E(float f2, float f3, float f4, int i2) {
        qh2 m = qh2.a().K(f2).P(f2).x(f3).C(f3).m();
        lh2 n = lh2.n(this.b, f4);
        n.setShapeAppearanceModel(m);
        n.q0(0, i2, 0, i2);
        return n;
    }

    private void F() {
        this.v = D(67, 0.0f, 1.0f);
        ValueAnimator D = D(50, 1.0f, 0.0f);
        this.u = D;
        D.addListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.q;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(@x1 EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager != null) {
            ks.g(accessibilityManager, this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z) {
        if (this.p != z) {
            this.p = z;
            this.v.cancel();
            this.u.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(@x1 AutoCompleteTextView autoCompleteTextView) {
        if (e) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.s);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void L(@x1 AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.i);
        if (e) {
            autoCompleteTextView.setOnDismissListener(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(@z1 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.o = false;
        }
        if (!this.o) {
            if (e) {
                J(!this.p);
            } else {
                this.p = !this.p;
                this.c.toggle();
            }
            if (this.p) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.o = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        this.o = true;
        this.q = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(@x1 AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.a.getBoxBackgroundMode();
        lh2 boxBackground = this.a.getBoxBackground();
        int d2 = kc2.d(autoCompleteTextView, ga2.c.M2);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, d2, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            z(autoCompleteTextView, d2, iArr, boxBackground);
        }
    }

    private void z(@x1 AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, @x1 lh2 lh2Var) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {kc2.m(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (e) {
            sr.H1(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), lh2Var, lh2Var));
            return;
        }
        lh2 lh2Var2 = new lh2(lh2Var.getShapeAppearanceModel());
        lh2Var2.o0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{lh2Var, lh2Var2});
        int j0 = sr.j0(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int i0 = sr.i0(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        sr.H1(autoCompleteTextView, layerDrawable);
        sr.c2(autoCompleteTextView, j0, paddingTop, i0, paddingBottom);
    }

    public void O(@x1 AutoCompleteTextView autoCompleteTextView) {
        if (!H(autoCompleteTextView) && this.a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            y(autoCompleteTextView);
        }
    }

    @Override // com.p7700g.p99005.ri2
    public void a() {
        float dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(ga2.f.V8);
        float dimensionPixelOffset2 = this.b.getResources().getDimensionPixelOffset(ga2.f.G7);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(ga2.f.I7);
        lh2 E = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        lh2 E2 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.s = E;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.r = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, E);
        this.r.addState(new int[0], E2);
        int i2 = this.d;
        if (i2 == 0) {
            i2 = e ? ga2.g.n1 : ga2.g.o1;
        }
        this.a.setEndIconDrawable(i2);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(ga2.m.K));
        this.a.setEndIconOnClickListener(new k());
        this.a.g(this.k);
        this.a.h(this.l);
        F();
        this.t = (AccessibilityManager) this.b.getSystemService("accessibility");
        this.a.addOnAttachStateChangeListener(this.m);
        B();
    }

    @Override // com.p7700g.p99005.ri2
    public boolean b(int i2) {
        return i2 != 0;
    }

    @Override // com.p7700g.p99005.ri2
    public boolean d() {
        return true;
    }
}