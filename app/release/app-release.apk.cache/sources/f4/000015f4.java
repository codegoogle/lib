package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.au  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1229au implements HK {
    public static String[] A0B;
    public long A00;
    public long A01;
    public HQ A02;
    public IX A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final InterfaceC0705Hl A09;
    public final boolean A0A;

    static {
        A02();
    }

    public static void A02() {
        A0B = new String[]{"w20bAWjYMNQBWlbon1lxwLvvC2Wc6aDw", "lwUY3oAzCyDGvzazHVXOHQ3zY7kbNweW", "UaweMkDBVxVyODuJAIk0oAizBiXulMgw", "HCwWhWYnSwS9lU8hovQ66gM", "BSrpyguVpFJpaQafc1NdT7mO3uIgLmFW", "PMiNqiQ4kgs0VWuHsJy6tm47yNuoSJAG", "LFxM2Smyc2PeWHZihlec1nFmzNKIeMAJ", "CwFpegEhQfdxfTMnj3Ot7m2"};
    }

    public C1229au(InterfaceC0705Hl interfaceC0705Hl, long j) {
        this(interfaceC0705Hl, j, 20480, true);
    }

    public C1229au(InterfaceC0705Hl interfaceC0705Hl, long j, int i, boolean z) {
        this.A09 = (InterfaceC0705Hl) I1.A01(interfaceC0705Hl);
        this.A08 = j;
        this.A07 = i;
        this.A0A = z;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            boolean success = this.A0A;
            if (success) {
                this.A05.getFD().sync();
            }
            C0726Ig.A0Y(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A44(file);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            C0726Ig.A0Y(this.A06);
            this.A06 = null;
            File file2 = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A44(file2);
            } else {
                file2.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long min;
        if (this.A02.A02 == -1) {
            min = this.A08;
        } else {
            long j = this.A02.A02;
            long maxLength = this.A00;
            long j2 = j - maxLength;
            long maxLength2 = this.A08;
            min = Math.min(j2, maxLength2);
        }
        InterfaceC0705Hl interfaceC0705Hl = this.A09;
        String str = this.A02.A05;
        long maxLength3 = this.A02.A01;
        this.A04 = interfaceC0705Hl.ADJ(str, this.A00 + maxLength3, min);
        this.A05 = new FileOutputStream(this.A04);
        int i = this.A07;
        if (i > 0) {
            IX ix = this.A03;
            if (ix == null) {
                this.A03 = new IX(this.A05, i);
            } else {
                ix.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.HK
    public final void ABR(HQ hq) throws C1228at {
        if (hq.A02 == -1 && !hq.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = hq;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e) {
            throw new C1228at(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.HK
    public final void close() throws C1228at {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e) {
            throw new C1228at(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.HK
    public final void write(byte[] bArr, int bytesToWrite, int i) throws C1228at {
        if (this.A02 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = (this.A01 > this.A08 ? 1 : (this.A01 == this.A08 ? 0 : -1));
                if (A0B[0].charAt(30) != 'D') {
                    throw new RuntimeException();
                }
                String[] strArr = A0B;
                strArr[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                strArr[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                if (i3 == 0) {
                    A00();
                    A01();
                }
                int min = (int) Math.min(i - i2, this.A08 - this.A01);
                this.A06.write(bArr, bytesToWrite + i2, min);
                i2 += min;
                this.A01 += min;
                this.A00 += min;
            } catch (IOException e) {
                throw new C1228at(e);
            }
        }
    }
}