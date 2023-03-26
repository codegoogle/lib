package com.facebook.ads.redexgen.X;

import java.io.IOException;
import org.xbill.DNS.TTL;

/* renamed from: com.facebook.ads.redexgen.X.Ci  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0578Ci {
    public static String[] A02;
    public int A00;
    public final IQ A01 = new IQ(8);

    static {
        A01();
    }

    public static void A01() {
        A02 = new String[]{"6bTYjI7xiahg1uqAV8eewLZrNfj9ZPj", "ngeXPKLRRDCcDwFHaGe0eDwdNk9MsKP0", "GKtDxJ6", "TMKYymqQa", "6hy2FBj", "omQP2HfChml3facH7odpRvVYds2Y", "0Yg", "2mziQBXjxxZN6M5afK2REUi5LMQCqiEi"};
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A00(CL cl) throws IOException, InterruptedException {
        cl.ABZ(this.A01.A00, 0, 1);
        int i = this.A01.A00[0] & 255;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while (length == 0) {
            i2 >>= 1;
            if (A02[6].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "eov1UmgRTS2J9JWiL8HKDN2YxzkNqP4T";
            strArr[1] = "eov1UmgRTS2J9JWiL8HKDN2YxzkNqP4T";
            i3++;
        }
        int length = i2 ^ (-1);
        int i4 = i & length;
        cl.ABZ(this.A01.A00, 1, i3);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 << 8;
            if (A02[7].charAt(16) == 'G') {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "09Vxb0YRh5GFDnmrENphsjvB8xYQhkFk";
            strArr2[1] = "09Vxb0YRh5GFDnmrENphsjvB8xYQhkFk";
            int i7 = i5 + 1;
            i4 = i6 + (this.A01.A00[i7] & 255);
        }
        this.A00 += i3 + 1;
        return i4;
    }

    public final boolean A02(CL cl) throws IOException, InterruptedException {
        long A6T = cl.A6T();
        long j = 1024;
        if (A6T != -1 && A6T <= 1024) {
            j = A6T;
        }
        int i = (int) j;
        boolean z = false;
        cl.ABZ(this.A01.A00, 0, 4);
        long A0N = this.A01.A0N();
        this.A00 = 4;
        while (A0N != 440786851) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 == i) {
                return false;
            }
            cl.ABZ(this.A01.A00, 0, 1);
            long tag = this.A01.A00[0] & 255;
            A0N = ((A0N << 8) & (-256)) | tag;
        }
        long A00 = A00(cl);
        long j2 = this.A00;
        if (A00 == Long.MIN_VALUE) {
            return false;
        }
        if (A6T != -1 && j2 + A00 >= A6T) {
            return false;
        }
        while (true) {
            int i3 = this.A00;
            if (i3 >= j2 + A00) {
                return ((long) i3) == j2 + A00;
            } else if (A00(cl) == Long.MIN_VALUE) {
                return z;
            } else {
                long A002 = A00(cl);
                if (A002 < 0 || A002 > TTL.MAX_VALUE) {
                    return false;
                }
                if (A002 != 0) {
                    int i4 = (int) A002;
                    cl.A3M(i4);
                    this.A00 += i4;
                }
                z = false;
            }
        }
    }
}