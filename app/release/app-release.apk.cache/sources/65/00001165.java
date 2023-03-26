package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.Hp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0709Hp implements Comparable<C0709Hp> {
    public final long A00;
    public final long A01;
    public final long A02;
    @Nullable
    public final File A03;
    public final String A04;
    public final boolean A05;

    public C0709Hp(String str, long j, long j2, long j3, @Nullable File file) {
        this.A04 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull C0709Hp c0709Hp) {
        if (!this.A04.equals(c0709Hp.A04)) {
            return this.A04.compareTo(c0709Hp.A04);
        }
        long j = this.A02 - c0709Hp.A02;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final boolean A01() {
        return !this.A05;
    }

    public final boolean A02() {
        return this.A01 == -1;
    }
}