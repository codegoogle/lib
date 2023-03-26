package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ae  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1213ae implements HM {
    public static byte[] A05;
    public static String[] A06;
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final InterfaceC0701Hh<? super C1213ae> A04;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{37};
    }

    public static void A02() {
        A06 = new String[]{"l2rBvT9KAEY6yl2SIp", "0cRN39km0cT", "q9WvQr", "pX7zul93kCJ6F7tIXqRnEpKrjeNmhaPh", "ddKujtHDPllkfb3cyYepVcXFvJyDikdo", "gNoa3Z", "AdKzyhJyCrP", "aoyUT4m5l2MLf3LhSWprSpj54sdxW1uC"};
    }

    public C1213ae() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hh != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C1213ae(InterfaceC0701Hh<? super C1213ae> interfaceC0701Hh) {
        this.A04 = interfaceC0701Hh;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final Uri A7C() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final long ABP(HQ hq) throws HT {
        long j;
        try {
            this.A01 = hq.A04;
            this.A02 = new RandomAccessFile(hq.A04.getPath(), A00(0, 1, 72));
            this.A02.seek(hq.A03);
            if (hq.A02 == -1) {
                j = this.A02.length() - hq.A03;
            } else {
                j = hq.A02;
            }
            this.A00 = j;
            if (this.A00 >= 0) {
                this.A03 = true;
                InterfaceC0701Hh<? super C1213ae> interfaceC0701Hh = this.A04;
                if (interfaceC0701Hh != null) {
                    interfaceC0701Hh.ABA(this, hq);
                }
                long j2 = this.A00;
                if (A06[0].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[7] = "qz0up6ppIELboyns2CZBgMvSr8RDOOhA";
                strArr[3] = "iQKzkqELqDYakLKWZdfSUnFo9DHl6nVv";
                return j2;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new HT(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final void close() throws HT {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new HT(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0701Hh<? super C1213ae> interfaceC0701Hh = this.A04;
                if (interfaceC0701Hh != null) {
                    interfaceC0701Hh.AB9(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final int read(byte[] bArr, int i, int i2) throws HT {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.A00 -= read;
                InterfaceC0701Hh<? super C1213ae> interfaceC0701Hh = this.A04;
                if (interfaceC0701Hh != null) {
                    interfaceC0701Hh.A95(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new HT(e);
        }
    }
}