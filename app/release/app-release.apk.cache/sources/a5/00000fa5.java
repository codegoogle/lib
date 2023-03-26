package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AB implements Comparable<AB> {
    public int A00;
    public long A01;
    @Nullable
    public Object A02;
    public final C0528Aa A03;

    public AB(C0528Aa c0528Aa) {
        this.A03 = c0528Aa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull AB ab) {
        if ((this.A02 == null) != (ab.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        } else if (this.A02 == null) {
            return 0;
        } else {
            int i = this.A00 - ab.A00;
            if (i != 0) {
                return i;
            }
            return C0726Ig.A07(this.A01, ab.A01);
        }
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}