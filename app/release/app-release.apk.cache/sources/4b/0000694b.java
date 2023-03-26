package com.p7700g.p99005;

import java.util.Locale;

/* compiled from: BasicLabelFormatter.java */
/* loaded from: classes3.dex */
public final class zh2 implements ai2 {
    private static final long e = 1000000000000L;
    private static final int f = 1000000000;
    private static final int g = 1000000;
    private static final int h = 1000;

    @Override // com.p7700g.p99005.ai2
    @x1
    public String a(float f2) {
        return f2 >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f2 / 1.0E12f)) : f2 >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f2 / 1.0E9f)) : f2 >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f2 / 1000000.0f)) : f2 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f2 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f2));
    }
}