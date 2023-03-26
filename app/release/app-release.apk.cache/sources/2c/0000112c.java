package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.Gs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0686Gs implements Comparable<C0686Gs> {
    public final int A00;
    public final C0682Go A01;

    public C0686Gs(int i, C0682Go c0682Go) {
        this.A00 = i;
        this.A01 = c0682Go;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull C0686Gs c0686Gs) {
        return this.A00 - c0686Gs.A00;
    }
}