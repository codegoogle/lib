package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03844c {
    public C4Z A00 = new C4Z();
    public final InterfaceC03824a A01;

    public C03844c(InterfaceC03824a interfaceC03824a) {
        this.A01 = interfaceC03824a;
    }

    public final View A00(int end, int next, int i, int i2) {
        int childStart = this.A01.A6f();
        int A6e = this.A01.A6e();
        int i3 = next > end ? 1 : -1;
        View view = null;
        while (end != next) {
            View A5d = this.A01.A5d(end);
            this.A00.A04(childStart, A6e, this.A01.A5g(A5d), this.A01.A5f(A5d));
            if (i != 0) {
                this.A00.A02();
                this.A00.A03(i);
                if (this.A00.A05()) {
                    return A5d;
                }
            }
            if (i2 != 0) {
                this.A00.A02();
                this.A00.A03(i2);
                if (this.A00.A05()) {
                    view = A5d;
                }
            }
            end += i3;
        }
        return view;
    }
}