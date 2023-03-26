package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.bf2;
import com.p7700g.p99005.ej2;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    private final Chip s;
    private final TextInputLayout t;
    private final EditText u;
    private TextWatcher v;
    private TextView w;

    /* loaded from: classes3.dex */
    public class b extends bf2 {
        private static final String s = "00";

        private b() {
        }

        @Override // com.p7700g.p99005.bf2, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.s.setText(ChipTextInputComboView.this.d(s));
            } else {
                ChipTextInputComboView.this.s.setText(ChipTextInputComboView.this.d(editable));
            }
        }
    }

    public ChipTextInputComboView(@x1 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(CharSequence charSequence) {
        return ej2.c(getResources(), charSequence);
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.u.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.u.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.u.setFilters(inputFilterArr);
    }

    public TextInputLayout e() {
        return this.t;
    }

    public void f(fq fqVar) {
        sr.A1(this.s, fqVar);
    }

    public void g(boolean z) {
        this.u.setCursorVisible(z);
    }

    public void h(CharSequence charSequence) {
        this.w.setText(charSequence);
    }

    public void i(CharSequence charSequence) {
        this.s.setText(d(charSequence));
        if (TextUtils.isEmpty(this.u.getText())) {
            return;
        }
        this.u.removeTextChangedListener(this.v);
        this.u.setText((CharSequence) null);
        this.u.addTextChangedListener(this.v);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.s.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.s.setChecked(z);
        this.u.setVisibility(z ? 0 : 4);
        this.s.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            kf2.p(this.u);
            if (TextUtils.isEmpty(this.u.getText())) {
                return;
            }
            EditText editText = this.u;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@z1 View.OnClickListener onClickListener) {
        this.s.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.s.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.s.toggle();
    }

    public ChipTextInputComboView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(ga2.k.f0, (ViewGroup) this, false);
        this.s = chip;
        chip.setAccessibilityClassName(TimePickerView.x0);
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(ga2.k.g0, (ViewGroup) this, false);
        this.t = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.u = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.v = bVar;
        editText.addTextChangedListener(bVar);
        j();
        addView(chip);
        addView(textInputLayout);
        this.w = (TextView) findViewById(ga2.h.J2);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}