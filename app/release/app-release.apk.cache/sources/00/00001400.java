package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0981Sm extends C4K {
    public static String[] A02;
    public boolean A00 = false;
    public final /* synthetic */ AbstractC0982Sn A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"mAEXsU", "ynqBxBOImfiaim2rOjt4gNln3IJjMmAs", "wywpOwDcOClPwSqhh8hqnS4LzA6xmBGs", "SzqLf2", "g6", "3b", "2rYsw0AU9P5CKqqKD8yWz2y811Q4TNqs", "g7NtZwf9Cfcv4ky8xJWe0WMsxKKUH5F1"};
    }

    public C0981Sm(AbstractC0982Sn abstractC0982Sn) {
        this.A01 = abstractC0982Sn;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final void A0V(ES es, int i) {
        super.A0V(es, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0H();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final void A0W(ES es, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        String[] strArr = A02;
        if (strArr[5].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "WMOmT1QQvzwg3wEMb9eL1K1wBJkCMN2D";
        strArr2[1] = "WMOmT1QQvzwg3wEMb9eL1K1wBJkCMN2D";
        this.A00 = true;
    }
}