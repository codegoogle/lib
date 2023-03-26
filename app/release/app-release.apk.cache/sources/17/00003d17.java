package com.p7700g.p99005;

import android.text.Html;
import android.text.Spanned;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Html.kt */
@vo4(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\b\u001a\u0017\u0010\t\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0086\b¨\u0006\u000b"}, d2 = {"parseAsHtml", "Landroid/text/Spanned;", "", "flags", "", "imageGetter", "Landroid/text/Html$ImageGetter;", "tagHandler", "Landroid/text/Html$TagHandler;", "toHtml", "option", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class co {
    @NotNull
    public static final Spanned a(@NotNull String str, int i, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        c25.p(str, "<this>");
        Spanned b = bo.b(str, i, imageGetter, tagHandler);
        c25.o(b, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b;
    }

    public static /* synthetic */ Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        c25.p(str, "<this>");
        Spanned b = bo.b(str, i, imageGetter, tagHandler);
        c25.o(b, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b;
    }

    @NotNull
    public static final String c(@NotNull Spanned spanned, int i) {
        c25.p(spanned, "<this>");
        String c = bo.c(spanned, i);
        c25.o(c, "toHtml(this, option)");
        return c;
    }

    public static /* synthetic */ String d(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c25.p(spanned, "<this>");
        String c = bo.c(spanned, i);
        c25.o(c, "toHtml(this, option)");
        return c;
    }
}