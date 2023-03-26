package com.p7700g.p99005;

import android.animation.TypeEvaluator;

/* compiled from: ArgbEvaluatorCompat.java */
/* loaded from: classes2.dex */
public class ja2 implements TypeEvaluator<Integer> {
    private static final ja2 a = new ja2();

    @x1
    public static ja2 b() {
        return a;
    }

    @Override // android.animation.TypeEvaluator
    @x1
    /* renamed from: a */
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float a2 = wo1.a(((intValue2 >> 24) & 255) / 255.0f, f2, f, f2);
        float a3 = wo1.a(pow4, pow, f, pow);
        float a4 = wo1.a((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f, pow2);
        float a5 = wo1.a((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow(a3, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(a5, 0.45454545454545453d)) * 255.0f) | round | (Math.round(a2 * 255.0f) << 24) | (Math.round(((float) Math.pow(a4, 0.45454545454545453d)) * 255.0f) << 8));
    }
}