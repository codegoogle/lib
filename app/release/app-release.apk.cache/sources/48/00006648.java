package com.p7700g.p99005;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.p7700g.p99005.fv;
import com.p7700g.p99005.i2;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
@e2(19)
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class xw implements TextWatcher {
    private final EditText s;
    private final boolean t;
    private fv.f u;
    private int v = Integer.MAX_VALUE;
    private int w = 0;
    private boolean x = true;

    /* compiled from: EmojiTextWatcher.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a extends fv.f {
        private final Reference<EditText> a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // com.p7700g.p99005.fv.f
        public void onInitialized() {
            super.onInitialized();
            xw.e(this.a.get(), 1);
        }
    }

    public xw(EditText editText, boolean z) {
        this.s = editText;
        this.t = z;
    }

    private fv.f b() {
        if (this.u == null) {
            this.u = new a(this.s);
        }
        return this.u;
    }

    public static void e(@z1 EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            fv.b().u(editableText);
            uw.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean i() {
        return (this.x && (this.t || fv.n())) ? false : true;
    }

    public int a() {
        return this.w;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public int c() {
        return this.v;
    }

    public boolean d() {
        return this.x;
    }

    public void f(int i) {
        this.w = i;
    }

    public void g(boolean z) {
        if (this.x != z) {
            if (this.u != null) {
                fv.b().C(this.u);
            }
            this.x = z;
            if (z) {
                e(this.s, fv.b().f());
            }
        }
    }

    public void h(int i) {
        this.v = i;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.s.isInEditMode() || i() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int f = fv.b().f();
        if (f != 0) {
            if (f == 1) {
                fv.b().x((Spannable) charSequence, i, i + i3, this.v, this.w);
                return;
            } else if (f != 3) {
                return;
            }
        }
        fv.b().y(b());
    }
}