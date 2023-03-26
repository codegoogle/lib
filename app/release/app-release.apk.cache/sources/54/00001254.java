package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Ln  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0804Ln {
    public static Bitmap A00(EnumC0803Lm enumC0803Lm) {
        byte[] decode = Base64.decode(enumC0803Lm.A01(C0795Le.A01), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static Drawable A01(C1080Wh c1080Wh, EnumC0803Lm enumC0803Lm) {
        return new BitmapDrawable(c1080Wh.getResources(), A00(enumC0803Lm));
    }
}