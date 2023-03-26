package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;

/* compiled from: SoSource.java */
/* loaded from: classes2.dex */
public abstract class x {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 4;
    public static final int h = 1;
    public static final int i = 2;

    public void a(Collection<String> collection) {
    }

    public String[] b() {
        return y.h();
    }

    public abstract int c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException;

    public void d(int i2) throws IOException {
    }

    @Nullable
    public abstract File e(String str) throws IOException;

    public String toString() {
        return getClass().getName();
    }
}