package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bb3 implements db3 {
    private final boolean a;

    public bb3(boolean z) {
        this.a = z;
    }

    @Override // com.p7700g.p99005.db3
    @NotNull
    public Object a() {
        return Boolean.valueOf(this.a);
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.a);
    }
}