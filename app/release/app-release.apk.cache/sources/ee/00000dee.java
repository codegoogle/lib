package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.2p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03482p extends C0543Aq implements Comparable<C03482p> {
    public long A00;

    public C03482p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull C03482p c03482p) {
        if (A04() != c03482p.A04()) {
            return A04() ? 1 : -1;
        }
        long j = ((C1121Xw) this).A00 - ((C1121Xw) c03482p).A00;
        if (j == 0) {
            j = this.A00 - c03482p.A00;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}