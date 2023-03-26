package com.p7700g.p99005;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import com.p7700g.p99005.fv;
import com.p7700g.p99005.i2;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
@e2(19)
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class uw implements InputFilter {
    private final TextView a;
    private fv.f b;

    /* compiled from: EmojiInputFilter.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a extends fv.f {
        private final Reference<TextView> a;
        private final Reference<uw> b;

        public a(TextView textView, uw uwVar) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(uwVar);
        }

        private boolean a(@z1 TextView textView, @z1 InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p7700g.p99005.fv.f
        public void onInitialized() {
            CharSequence text;
            CharSequence u;
            super.onInitialized();
            TextView textView = this.a.get();
            if (a(textView, this.b.get()) && textView.isAttachedToWindow() && text != (u = fv.b().u((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(u);
                int selectionEnd = Selection.getSelectionEnd(u);
                textView.setText(u);
                if (u instanceof Spannable) {
                    uw.b((Spannable) u, selectionStart, selectionEnd);
                }
            }
        }
    }

    public uw(@x1 TextView textView) {
        this.a = textView;
    }

    private fv.f a() {
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        return this.b;
    }

    public static void b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int f = fv.b().f();
        if (f != 0) {
            boolean z = true;
            if (f == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return fv.b().v(charSequence, 0, charSequence.length());
            } else if (f != 3) {
                return charSequence;
            }
        }
        fv.b().y(a());
        return charSequence;
    }
}