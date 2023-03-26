package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Dq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0612Dq {
    public final String A00;
    public final boolean A01;

    public C0612Dq(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C0612Dq.class) {
            return false;
        }
        C0612Dq c0612Dq = (C0612Dq) obj;
        return TextUtils.equals(this.A00, c0612Dq.A00) && this.A01 == c0612Dq.A01;
    }

    public final int hashCode() {
        int i = 1 * 31;
        String str = this.A00;
        int result = str == null ? 0 : str.hashCode();
        int result2 = (i + result) * 31;
        int result3 = this.A01 ? 1231 : 1237;
        return result2 + result3;
    }
}