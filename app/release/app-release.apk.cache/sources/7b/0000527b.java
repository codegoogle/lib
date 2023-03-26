package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.ga2;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes3.dex */
public class ni2 extends ri2 {
    private static final int e = 100;
    private static final int f = 150;
    private static final float g = 0.8f;
    private final TextWatcher h;
    private final View.OnFocusChangeListener i;
    private final TextInputLayout.h j;
    private final TextInputLayout.i k;
    private AnimatorSet l;
    private ValueAnimator m;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@x1 Editable editable) {
            if (ni2.this.a.getSuffixText() != null) {
                return;
            }
            ni2 ni2Var = ni2.this;
            ni2Var.i(ni2Var.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            ni2 ni2Var = ni2.this;
            ni2Var.i(ni2Var.m());
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class c implements TextInputLayout.h {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@x1 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(ni2.this.m());
            editText.setOnFocusChangeListener(ni2.this.i);
            ni2 ni2Var = ni2.this;
            ni2Var.c.setOnFocusChangeListener(ni2Var.i);
            editText.removeTextChangedListener(ni2.this.h);
            editText.addTextChangedListener(ni2.this.h);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class d implements TextInputLayout.i {

        /* compiled from: ClearTextEndIconDelegate.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public final /* synthetic */ EditText s;

            public a(EditText editText) {
                this.s = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.removeTextChangedListener(ni2.this.h);
                ni2.this.i(true);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@x1 TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new a(editText));
            if (editText.getOnFocusChangeListener() == ni2.this.i) {
                editText.setOnFocusChangeListener(null);
            }
            if (ni2.this.c.getOnFocusChangeListener() == ni2.this.i) {
                ni2.this.c.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = ni2.this.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            ni2.this.a.i0();
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ni2.this.a.setEndIconVisible(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ni2.this.a.setEndIconVisible(false);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            ni2.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ni2.this.c.setScaleX(floatValue);
            ni2.this.c.setScaleY(floatValue);
        }
    }

    public ni2(@x1 TextInputLayout textInputLayout, @f1 int i2) {
        super(textInputLayout, i2);
        this.h = new a();
        this.i = new b();
        this.j = new c();
        this.k = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z) {
        boolean z2 = this.a.P() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
            }
        } else if (z) {
        } else {
            this.l.cancel();
            this.m.start();
            if (z2) {
                this.m.end();
            }
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(ha2.a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g, 1.0f);
        ofFloat.setInterpolator(ha2.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private void l() {
        ValueAnimator k = k();
        ValueAnimator j = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(k, j);
        this.l.addListener(new f());
        ValueAnimator j2 = j(1.0f, 0.0f);
        this.m = j2;
        j2.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.hasFocus() || this.c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // com.p7700g.p99005.ri2
    public void a() {
        TextInputLayout textInputLayout = this.a;
        int i2 = this.d;
        if (i2 == 0) {
            i2 = ga2.g.q1;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(ga2.m.I));
        this.a.setEndIconCheckable(false);
        this.a.setEndIconOnClickListener(new e());
        this.a.g(this.j);
        this.a.h(this.k);
        l();
    }

    @Override // com.p7700g.p99005.ri2
    public void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        i(z);
    }
}