package com.p7700g.p99005;

import android.net.Uri;
import com.anythink.expressad.foundation.c.d;

/* compiled from: MediaStoreUtil.java */
/* loaded from: classes2.dex */
public final class dr1 {
    private static final int a = 512;
    private static final int b = 384;

    private dr1() {
    }

    public static boolean a(Uri uri) {
        return b(uri) && !e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b(uri) && e(uri);
    }

    public static boolean d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= b;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains(d.a.a);
    }
}