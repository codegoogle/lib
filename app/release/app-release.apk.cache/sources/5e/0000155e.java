package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.xbill.DNS.TTL;

/* loaded from: assets/audience_network.dex */
public final class YQ implements InterfaceC0572Cc {
    public static byte[] A07;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0574Ce A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0571Cb> A05 = new ArrayDeque<>();
    public final C0579Cj A04 = new C0579Cj();

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{101, -118, -110, 125, -120, -123, g15.b, 60, -127, -120, -127, -119, -127, -118, -112, 60, -112, -107, -116, -127, 60, -73, -36, -28, -49, -38, -41, -46, -114, -44, -38, -35, -49, -30, -114, bx.j7, -41, -24, -45, -88, -114, -95, -58, -50, -71, -60, -63, -68, 120, -63, -58, -52, -67, -65, -67, -54, 120, -53, -63, -46, -67, -110, 120, -64, bx.j7, -33, -42, -37, -44, -115, -46, bx.l7, -46, -38, -46, -37, bx.j7, -115, -32, -42, -25, -46, -89, -115};
    }

    private double A00(CL cl, int i) throws IOException, InterruptedException {
        long A02 = A02(cl, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(CL cl) throws IOException, InterruptedException {
        cl.ACa();
        while (true) {
            cl.ABZ(this.A06, 0, 4);
            int A00 = C0579Cj.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) C0579Cj.A01(this.A06, A00, false);
                if (this.A03.A7e(A01)) {
                    cl.ADG(A00);
                    return A01;
                }
            }
            cl.ADG(1);
        }
    }

    private long A02(CL cl, int i) throws IOException, InterruptedException {
        cl.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.A06[i2] & 255);
        }
        return j;
    }

    private String A04(CL cl, int trimmedLength) throws IOException, InterruptedException {
        if (trimmedLength == 0) {
            return A03(0, 0, 34);
        }
        byte[] bArr = new byte[trimmedLength];
        cl.readFully(bArr, 0, trimmedLength);
        while (trimmedLength > 0 && bArr[trimmedLength - 1] == 0) {
            trimmedLength--;
        }
        return new String(bArr, 0, trimmedLength);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0572Cc
    public final void A7R(InterfaceC0574Ce interfaceC0574Ce) {
        this.A03 = interfaceC0574Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0572Cc
    public final boolean ABz(CL cl) throws IOException, InterruptedException {
        long j;
        int i;
        I1.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long A6m = cl.A6m();
                j = this.A05.peek().A01;
                if (A6m >= j) {
                    InterfaceC0574Ce interfaceC0574Ce = this.A03;
                    i = this.A05.pop().A00;
                    interfaceC0574Ce.A4v(i);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(cl, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(cl);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(cl, false, true, 8);
                this.A01 = 2;
            }
            int A66 = this.A03.A66(this.A00);
            if (A66 != 0) {
                if (A66 == 1) {
                    long A6m2 = cl.A6m();
                    this.A05.push(new C0571Cb(this.A00, A6m2 + this.A02));
                    this.A03.ADK(this.A00, A6m2, this.A02);
                    this.A01 = 0;
                    return true;
                } else if (A66 == 2) {
                    long j2 = this.A02;
                    if (j2 <= 8) {
                        this.A03.A7T(this.A00, A02(cl, (int) j2));
                        this.A01 = 0;
                        return true;
                    }
                    throw new AN(A03(41, 22, 60) + this.A02);
                } else if (A66 == 3) {
                    long j3 = this.A02;
                    if (j3 <= TTL.MAX_VALUE) {
                        this.A03.ADR(this.A00, A04(cl, (int) j3));
                        this.A01 = 0;
                        return true;
                    }
                    throw new AN(A03(63, 21, 81) + this.A02);
                } else if (A66 == 4) {
                    this.A03.A3r(this.A00, (int) this.A02, cl);
                    this.A01 = 0;
                    return true;
                } else if (A66 == 5) {
                    long j4 = this.A02;
                    if (j4 == 4 || j4 == 8) {
                        this.A03.A58(this.A00, A00(cl, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw new AN(A03(21, 20, 82) + this.A02);
                } else {
                    throw new AN(A03(0, 21, 0) + A66);
                }
            }
            cl.ADG((int) this.A02);
            this.A01 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0572Cc
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}