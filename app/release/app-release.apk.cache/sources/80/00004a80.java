package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimePickerView;
import com.p7700g.p99005.ga2;
import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: TimePickerTextInputPresenter.java */
/* loaded from: classes3.dex */
public class jj2 implements TimePickerView.g, hj2 {
    private final EditText A;
    private MaterialButtonToggleGroup B;
    private final LinearLayout s;
    private final ej2 t;
    private final TextWatcher u = new a();
    private final TextWatcher v = new b();
    private final ChipTextInputComboView w;
    private final ChipTextInputComboView x;
    private final ij2 y;
    private final EditText z;

    /* compiled from: TimePickerTextInputPresenter.java */
    /* loaded from: classes3.dex */
    public class a extends bf2 {
        public a() {
        }

        @Override // com.p7700g.p99005.bf2, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    jj2.this.t.m(0);
                    return;
                }
                jj2.this.t.m(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    /* loaded from: classes3.dex */
    public class b extends bf2 {
        public b() {
        }

        @Override // com.p7700g.p99005.bf2, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    jj2.this.t.k(0);
                    return;
                }
                jj2.this.t.k(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jj2.this.e(((Integer) view.getTag(ga2.h.M4)).intValue());
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    /* loaded from: classes3.dex */
    public class d extends zi2 {
        public final /* synthetic */ ej2 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i, ej2 ej2Var) {
            super(context, i);
            this.e = ej2Var;
        }

        @Override // com.p7700g.p99005.zi2, com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.a1(view.getResources().getString(ga2.m.j0, String.valueOf(this.e.e())));
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    /* loaded from: classes3.dex */
    public class e extends zi2 {
        public final /* synthetic */ ej2 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i, ej2 ej2Var) {
            super(context, i);
            this.e = ej2Var;
        }

        @Override // com.p7700g.p99005.zi2, com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.a1(view.getResources().getString(ga2.m.l0, String.valueOf(this.e.y)));
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    /* loaded from: classes3.dex */
    public class f implements MaterialButtonToggleGroup.d {
        public f() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            jj2.this.t.n(i == ga2.h.F2 ? 1 : 0);
        }
    }

    public jj2(LinearLayout linearLayout, ej2 ej2Var) {
        this.s = linearLayout;
        this.t = ej2Var;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(ga2.h.K2);
        this.w = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(ga2.h.H2);
        this.x = chipTextInputComboView2;
        int i = ga2.h.J2;
        ((TextView) chipTextInputComboView.findViewById(i)).setText(resources.getString(ga2.m.w0));
        ((TextView) chipTextInputComboView2.findViewById(i)).setText(resources.getString(ga2.m.v0));
        int i2 = ga2.h.M4;
        chipTextInputComboView.setTag(i2, 12);
        chipTextInputComboView2.setTag(i2, 10);
        if (ej2Var.w == 0) {
            k();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(ej2Var.g());
        chipTextInputComboView.c(ej2Var.i());
        this.z = chipTextInputComboView2.e().getEditText();
        this.A = chipTextInputComboView.e().getEditText();
        this.y = new ij2(chipTextInputComboView2, chipTextInputComboView, ej2Var);
        chipTextInputComboView2.f(new d(linearLayout.getContext(), ga2.m.i0, ej2Var));
        chipTextInputComboView.f(new e(linearLayout.getContext(), ga2.m.k0, ej2Var));
        initialize();
    }

    private void c() {
        this.z.addTextChangedListener(this.v);
        this.A.addTextChangedListener(this.u);
    }

    private void g() {
        this.z.removeTextChangedListener(this.v);
        this.A.removeTextChangedListener(this.u);
    }

    private static void i(EditText editText, @w0 int i) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable b2 = r3.b(context, i2);
            b2.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{b2, b2});
        } catch (Throwable unused) {
        }
    }

    private void j(ej2 ej2Var) {
        g();
        Locale locale = this.s.getResources().getConfiguration().locale;
        String format = String.format(locale, ej2.s, Integer.valueOf(ej2Var.y));
        String format2 = String.format(locale, ej2.s, Integer.valueOf(ej2Var.e()));
        this.w.i(format);
        this.x.i(format2);
        c();
        l();
    }

    private void k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.s.findViewById(ga2.h.G2);
        this.B = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new f());
        this.B.setVisibility(0);
        l();
    }

    private void l() {
        int i;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.B;
        if (materialButtonToggleGroup == null) {
            return;
        }
        if (this.t.A == 0) {
            i = ga2.h.E2;
        } else {
            i = ga2.h.F2;
        }
        materialButtonToggleGroup.e(i);
    }

    @Override // com.p7700g.p99005.hj2
    public void a() {
        j(this.t);
    }

    public void d() {
        this.w.setChecked(false);
        this.x.setChecked(false);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void e(int i) {
        this.t.z = i;
        this.w.setChecked(i == 12);
        this.x.setChecked(i == 10);
        l();
    }

    @Override // com.p7700g.p99005.hj2
    public void f() {
        View focusedChild = this.s.getFocusedChild();
        if (focusedChild == null) {
            this.s.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) gh.o(this.s.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.s.setVisibility(8);
    }

    public void h() {
        this.w.setChecked(this.t.z == 12);
        this.x.setChecked(this.t.z == 10);
    }

    @Override // com.p7700g.p99005.hj2
    public void initialize() {
        c();
        j(this.t);
        this.y.a();
    }

    @Override // com.p7700g.p99005.hj2
    public void show() {
        this.s.setVisibility(0);
    }
}