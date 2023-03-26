package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* compiled from: Preconditions.java */
/* loaded from: classes2.dex */
public final class x02 {
    private x02() {
    }

    public static void a(boolean z, @x1 String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @x1
    public static String b(@z1 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    @x1
    public static <T extends Collection<Y>, Y> T c(@x1 T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }

    @x1
    public static <T> T d(@z1 T t) {
        return (T) e(t, "Argument must not be null");
    }

    @x1
    public static <T> T e(@z1 T t, @x1 String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}