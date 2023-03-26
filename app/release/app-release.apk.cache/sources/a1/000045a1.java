package com.p7700g.p99005;

import java.io.IOException;

/* compiled from: ScalarRequestBodyConverter.java */
/* loaded from: classes4.dex */
public final class h06<T> implements lz5<T, ir5> {
    public static final h06<Object> a = new h06<>();
    private static final br5 b = br5.h("text/plain; charset=UTF-8");

    private h06() {
    }

    @Override // com.p7700g.p99005.lz5
    /* renamed from: b */
    public ir5 a(T t) throws IOException {
        return ir5.f(b, String.valueOf(t));
    }
}