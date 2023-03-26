package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpannableString.kt */
@vo4(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a%\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0002*\u00020\fH\u0086\b¨\u0006\r"}, d2 = {"clearSpans", "", "Landroid/text/Spannable;", la1.a, com.anythink.expressad.foundation.d.c.bR, "", "end", "span", "", "range", "Lkotlin/ranges/IntRange;", "toSpannable", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ho {
    @SuppressLint({"SyntheticAccessor"})
    public static final void a(@NotNull Spannable spannable) {
        c25.p(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        c25.o(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void b(@NotNull Spannable spannable, int i, int i2, @NotNull Object obj) {
        c25.p(spannable, "<this>");
        c25.p(obj, "span");
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final void c(@NotNull Spannable spannable, @NotNull c55 c55Var, @NotNull Object obj) {
        c25.p(spannable, "<this>");
        c25.p(c55Var, "range");
        c25.p(obj, "span");
        spannable.setSpan(obj, c55Var.c().intValue(), c55Var.d().intValue(), 17);
    }

    @NotNull
    public static final Spannable d(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}