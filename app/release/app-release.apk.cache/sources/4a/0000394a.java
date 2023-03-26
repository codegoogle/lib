package com.p7700g.p99005;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: CharSequence.kt */
@vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0086\b¨\u0006\u0005"}, d2 = {"isDigitsOnly", "", "", "trimmedLength", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ao {
    public static final boolean a(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}