package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.util.Half;
import org.jetbrains.annotations.NotNull;

/* compiled from: Half.kt */
@vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toHalf", "Landroid/util/Half;", "", "", "", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class ap {
    @e2(26)
    @NotNull
    public static final Half a(double d) {
        Half valueOf = Half.valueOf((float) d);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @e2(26)
    @NotNull
    public static final Half b(float f) {
        Half valueOf = Half.valueOf(f);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @e2(26)
    @NotNull
    public static final Half c(@NotNull String str) {
        c25.p(str, "<this>");
        Half valueOf = Half.valueOf(str);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @e2(26)
    @NotNull
    public static final Half d(short s) {
        Half valueOf = Half.valueOf(s);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}