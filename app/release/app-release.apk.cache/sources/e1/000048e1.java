package com.p7700g.p99005;

import android.text.Spanned;
import android.text.SpannedString;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpannedString.kt */
@vo4(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\u001a:\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0004*\u00020\nH\u0086\b¨\u0006\u000b"}, d2 = {"getSpans", "", "T", "", "Landroid/text/Spanned;", com.anythink.expressad.foundation.d.c.bR, "", "end", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "toSpanned", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class io {
    public static final /* synthetic */ <T> T[] a(Spanned spanned, int i, int i2) {
        c25.p(spanned, "<this>");
        c25.y(4, "T");
        T[] tArr = (T[]) spanned.getSpans(i, i2, Object.class);
        c25.o(tArr, "getSpans(start, end, T::class.java)");
        return tArr;
    }

    public static /* synthetic */ Object[] b(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        c25.p(spanned, "<this>");
        c25.y(4, "T");
        Object[] spans = spanned.getSpans(i, i2, Object.class);
        c25.o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @NotNull
    public static final Spanned c(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}