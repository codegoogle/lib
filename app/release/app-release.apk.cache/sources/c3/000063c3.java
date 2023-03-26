package com.p7700g.p99005;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.ga2;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes3.dex */
public class wi2 extends ri2 {
    private final TextWatcher e;
    private final TextInputLayout.h f;
    private final TextInputLayout.i g;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class a extends bf2 {
        public a() {
        }

        @Override // com.p7700g.p99005.bf2, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            wi2 wi2Var = wi2.this;
            wi2Var.c.setChecked(!wi2Var.g());
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class b implements TextInputLayout.h {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@x1 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            wi2 wi2Var = wi2.this;
            wi2Var.c.setChecked(!wi2Var.g());
            editText.removeTextChangedListener(wi2.this.e);
            editText.addTextChangedListener(wi2.this.e);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class c implements TextInputLayout.i {

        /* compiled from: PasswordToggleEndIconDelegate.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public final /* synthetic */ EditText s;

            public a(EditText editText) {
                this.s = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.removeTextChangedListener(wi2.this.e);
            }
        }

        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@x1 TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = wi2.this.a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (wi2.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            wi2.this.a.i0();
        }
    }

    public wi2(@x1 TextInputLayout textInputLayout, @f1 int i) {
        super(textInputLayout, i);
        this.e = new a();
        this.f = new b();
        this.g = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.p7700g.p99005.ri2
    public void a() {
        TextInputLayout textInputLayout = this.a;
        int i = this.d;
        if (i == 0) {
            i = ga2.g.J0;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(ga2.m.k1));
        this.a.setEndIconVisible(true);
        this.a.setEndIconCheckable(true);
        this.a.setEndIconOnClickListener(new d());
        this.a.g(this.f);
        this.a.h(this.g);
        EditText editText = this.a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}