package com.p7700g.p99005;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ChipTextInputComboView;

/* compiled from: TimePickerTextInputKeyController.java */
/* loaded from: classes3.dex */
public class ij2 implements TextView.OnEditorActionListener, View.OnKeyListener {
    private final ChipTextInputComboView s;
    private final ChipTextInputComboView t;
    private final ej2 u;
    private boolean v = false;

    public ij2(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, ej2 ej2Var) {
        this.s = chipTextInputComboView;
        this.t = chipTextInputComboView2;
        this.u = ej2Var;
    }

    private void b(int i) {
        this.t.setChecked(i == 12);
        this.s.setChecked(i == 10);
        this.u.z = i;
    }

    private boolean c(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            b(12);
            return true;
        }
        return false;
    }

    private boolean d(int i, KeyEvent keyEvent, EditText editText) {
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            b(10);
            return true;
        }
        return false;
    }

    public void a() {
        TextInputLayout e = this.s.e();
        TextInputLayout e2 = this.t.e();
        EditText editText = e.getEditText();
        EditText editText2 = e2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            b(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean c;
        if (this.v) {
            return false;
        }
        this.v = true;
        EditText editText = (EditText) view;
        if (this.u.z == 12) {
            c = d(i, keyEvent, editText);
        } else {
            c = c(i, keyEvent, editText);
        }
        this.v = false;
        return c;
    }
}