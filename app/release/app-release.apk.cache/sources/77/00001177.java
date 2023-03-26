package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class I7 {
    public static String[] A01;
    public boolean A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"ai2EfOriaTIhqtzLWYXlPleIkpLxWtX3", "8POqEzQt", "C9XS0tRq", "", "AAxD7MG0VtZMRL4EoelO07EezWtzxWUG", "", "6PKYsgscuQ75gJwNEilmQ2c4nRmBzCem", "CYsAdFFV2DQ1VCBuBS7UZ1OMxmR8"};
    }

    public final synchronized void A01() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized boolean A02() {
        boolean z;
        z = this.A00;
        this.A00 = false;
        return z;
    }

    public final synchronized boolean A03() {
        if (!this.A00) {
            this.A00 = true;
            notifyAll();
            return true;
        }
        String[] strArr = A01;
        if (strArr[2].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "6xVrNnWg";
        strArr2[1] = "bGYw6WXz";
        return false;
    }
}