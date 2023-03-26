package com.greedygame.core.mediation;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.p7700g.p99005.c25;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class GGTextView extends AppCompatTextView {

    /* loaded from: classes3.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable editable) {
            c25.p(editable, "editable");
            GGTextView.this.f(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            c25.p(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            c25.p(charSequence, "charSequence");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGTextView(@NotNull Context context) {
        super(context);
        c25.p(context, "context");
        e();
    }

    private final void g() {
        setVisibility(TextUtils.isEmpty(getText()) ? 8 : 0);
    }

    public final void e() {
        g();
        addTextChangedListener(new a());
    }

    public final void f(@NotNull Editable editable) {
        c25.p(editable, "editable");
        setVisibility(TextUtils.isEmpty(editable.toString()) ? 8 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        c25.p(context, "context");
        c25.p(attributeSet, "attrs");
        e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGTextView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
        c25.p(attributeSet, "attrs");
        e();
    }
}