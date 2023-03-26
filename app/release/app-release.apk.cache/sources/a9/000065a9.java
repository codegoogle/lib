package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.ga2;

/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class xi2 extends LinearLayout {
    private final TextInputLayout s;
    private final TextView t;
    @z1
    private CharSequence u;
    private final CheckableImageButton v;
    private ColorStateList w;
    private PorterDuff.Mode x;
    private View.OnLongClickListener y;
    private boolean z;

    public xi2(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.s = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, nq.b));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(ga2.k.R, (ViewGroup) this, false);
        this.v = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.t = appCompatTextView;
        g(tintTypedArray);
        f(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void f(TintTypedArray tintTypedArray) {
        this.t.setVisibility(8);
        this.t.setId(ga2.h.P5);
        this.t.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        sr.C1(this.t, 1);
        m(tintTypedArray.getResourceId(ga2.o.Su, 0));
        int i = ga2.o.Tu;
        if (tintTypedArray.hasValue(i)) {
            n(tintTypedArray.getColorStateList(i));
        }
        l(tintTypedArray.getText(ga2.o.Ru));
    }

    private void g(TintTypedArray tintTypedArray) {
        if (sg2.i(getContext())) {
            sq.g((ViewGroup.MarginLayoutParams) this.v.getLayoutParams(), 0);
        }
        r(null);
        s(null);
        int i = ga2.o.Zu;
        if (tintTypedArray.hasValue(i)) {
            this.w = sg2.b(getContext(), tintTypedArray, i);
        }
        int i2 = ga2.o.av;
        if (tintTypedArray.hasValue(i2)) {
            this.x = kf2.l(tintTypedArray.getInt(i2, -1), null);
        }
        int i3 = ga2.o.Yu;
        if (tintTypedArray.hasValue(i3)) {
            q(tintTypedArray.getDrawable(i3));
            int i4 = ga2.o.Xu;
            if (tintTypedArray.hasValue(i4)) {
                p(tintTypedArray.getText(i4));
            }
            o(tintTypedArray.getBoolean(ga2.o.Wu, true));
        }
    }

    private void y() {
        int i = (this.u == null || this.z) ? 8 : 0;
        setVisibility(this.v.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.t.setVisibility(i);
        this.s.H0();
    }

    @z1
    public CharSequence a() {
        return this.u;
    }

    @z1
    public ColorStateList b() {
        return this.t.getTextColors();
    }

    @x1
    public TextView c() {
        return this.t;
    }

    @z1
    public CharSequence d() {
        return this.v.getContentDescription();
    }

    @z1
    public Drawable e() {
        return this.v.getDrawable();
    }

    public boolean h() {
        return this.v.a();
    }

    public boolean i() {
        return this.v.getVisibility() == 0;
    }

    public void j(boolean z) {
        this.z = z;
        y();
    }

    public void k() {
        si2.c(this.s, this.v, this.w);
    }

    public void l(@z1 CharSequence charSequence) {
        this.u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.t.setText(charSequence);
        y();
    }

    public void m(@m2 int i) {
        nt.E(this.t, i);
    }

    public void n(@x1 ColorStateList colorStateList) {
        this.t.setTextColor(colorStateList);
    }

    public void o(boolean z) {
        this.v.setCheckable(z);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        x();
    }

    public void p(@z1 CharSequence charSequence) {
        if (d() != charSequence) {
            this.v.setContentDescription(charSequence);
        }
    }

    public void q(@z1 Drawable drawable) {
        this.v.setImageDrawable(drawable);
        if (drawable != null) {
            si2.a(this.s, this.v, this.w, this.x);
            v(true);
            k();
            return;
        }
        v(false);
        r(null);
        s(null);
        p(null);
    }

    public void r(@z1 View.OnClickListener onClickListener) {
        si2.e(this.v, onClickListener, this.y);
    }

    public void s(@z1 View.OnLongClickListener onLongClickListener) {
        this.y = onLongClickListener;
        si2.f(this.v, onLongClickListener);
    }

    public void t(@z1 ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            si2.a(this.s, this.v, colorStateList, this.x);
        }
    }

    public void u(@z1 PorterDuff.Mode mode) {
        if (this.x != mode) {
            this.x = mode;
            si2.a(this.s, this.v, this.w, mode);
        }
    }

    public void v(boolean z) {
        if (i() != z) {
            this.v.setVisibility(z ? 0 : 8);
            x();
            y();
        }
    }

    public void w(@x1 ls lsVar) {
        if (this.t.getVisibility() == 0) {
            lsVar.o1(this.t);
            lsVar.Q1(this.t);
            return;
        }
        lsVar.Q1(this.v);
    }

    public void x() {
        EditText editText = this.s.L;
        if (editText == null) {
            return;
        }
        sr.c2(this.t, i() ? 0 : sr.j0(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(ga2.f.G5), editText.getCompoundPaddingBottom());
    }
}