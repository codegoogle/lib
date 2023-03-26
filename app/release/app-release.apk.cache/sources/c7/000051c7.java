package com.p7700g.p99005;

import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: TreeOps.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class n54 {
    public static Spliterator a(o54 _this, boolean z) {
        return Spliterators.spliteratorUnknownSize(_this.v(z), 0);
    }

    public static Spliterator b(o54 _this) {
        return Spliterators.spliteratorUnknownSize(_this.descendingIterator(), 0);
    }

    public static Spliterator c(o54 _this, boolean z) {
        return Spliterators.spliteratorUnknownSize(_this.q(z), 0);
    }

    public static Spliterator d(o54 _this) {
        return Spliterators.spliteratorUnknownSize(_this.iterator(), 0);
    }
}