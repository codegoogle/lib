package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0755Jm {
    public final AdErrorType A00;
    public final String A01;

    public C0755Jm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C0755Jm(AdErrorType adErrorType, @Nullable String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static AdError A00(C0755Jm c0755Jm) {
        if (c0755Jm.A04().isPublicError()) {
            return new AdError(c0755Jm.A04().getErrorCode(), c0755Jm.A05());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }

    public static C0755Jm A01(AdErrorType adErrorType) {
        return new C0755Jm(adErrorType, (String) null);
    }

    public static C0755Jm A02(AdErrorType adErrorType, @Nullable String str) {
        return new C0755Jm(adErrorType, str);
    }

    public static C0755Jm A03(C0756Jn c0756Jn) {
        return new C0755Jm(c0756Jn.A00(), c0756Jn.A01());
    }

    public final AdErrorType A04() {
        return this.A00;
    }

    public final String A05() {
        return this.A01;
    }
}