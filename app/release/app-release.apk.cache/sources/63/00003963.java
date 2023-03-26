package com.p7700g.p99005;

import com.google.auto.value.AutoValue;

/* compiled from: SdkHeartBeatResult.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class ar2 implements Comparable<ar2> {
    public static ar2 b(String str, long j) {
        return new tq2(str, j);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ar2 ar2Var) {
        return c() < ar2Var.c() ? -1 : 1;
    }

    public abstract long c();

    public abstract String d();
}