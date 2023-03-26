package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.p7700g.p99005.ax5;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1202aT implements HM {
    public static byte[] A06;
    public static String[] A07;
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    public final InterfaceC0701Hh<? super C1202aT> A05;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{107, 98, 44, 35, 41, ax5.a, 34, 36, 41, 18, 44, 62, 62, 40, 57, 98};
    }

    public static void A02() {
        A07 = new String[]{"pM08nT1ncmNJ", "g85", "nscQf0o4Li7UcF904CUq0pnhLdimh0nx", "F8VXv1qVoFp68OVo6WPqVPomjNx", "ZQ8cSAnJS", "Qhc2B", "YeRFTalD9", "SLGuxMrf5R7JWBKvcRLC7wUDDVq2YQ4u"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hh != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.AssetDataSource> */
    public C1202aT(Context context, InterfaceC0701Hh<? super C1202aT> interfaceC0701Hh) {
        this.A04 = context.getAssets();
        this.A05 = interfaceC0701Hh;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final Uri A7C() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
        if (r3 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        if (r3 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
        r0 = r9.A02;
        r8.A00 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        r0 = r8.A02.available();
        r8.A00 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
        if (r8.A00 != org.xbill.DNS.TTL.MAX_VALUE) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
        r8.A00 = -1;
     */
    @Override // com.facebook.ads.redexgen.X.HM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long ABP(HQ hq) throws HF {
        try {
            this.A01 = hq.A04;
            String path = this.A01.getPath();
            if (path.startsWith(A00(1, 15, 123))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 114))) {
                path = path.substring(1);
            }
            this.A02 = this.A04.open(path, 1);
            long skip = this.A02.skip(hq.A03);
            long skipped = hq.A03;
            int i = (skip > skipped ? 1 : (skip == skipped ? 0 : -1));
            if (A07[0].length() != 12) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[7] = "V0B6GAr2PKDbDxhNZksh7AEMCKFKekNi";
            strArr[7] = "V0B6GAr2PKDbDxhNZksh7AEMCKFKekNi";
            if (i >= 0) {
                long skipped2 = hq.A02;
                int i2 = (skipped2 > (-1L) ? 1 : (skipped2 == (-1L) ? 0 : -1));
                if (A07[1].length() != 3) {
                    String[] strArr2 = A07;
                    strArr2[2] = "LLeOWo0qfJ5aEilGNMg5Y9nqgC8u5H4z";
                    strArr2[3] = "bhHcjvupHtwrsEsZMKxHQW2SejO";
                } else {
                    String[] strArr3 = A07;
                    strArr3[7] = "z68meBkT3TqiKmw4pf8g7Y6845REpoZL";
                    strArr3[7] = "z68meBkT3TqiKmw4pf8g7Y6845REpoZL";
                }
                this.A03 = true;
                InterfaceC0701Hh<? super C1202aT> interfaceC0701Hh = this.A05;
                if (interfaceC0701Hh != null) {
                    interfaceC0701Hh.ABA(this, hq);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new HF(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final void close() throws HF {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new HF(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0701Hh<? super C1202aT> interfaceC0701Hh = this.A05;
                if (interfaceC0701Hh != null) {
                    interfaceC0701Hh.AB9(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final int read(byte[] bArr, int i, int i2) throws HF {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new HF(e);
            }
        }
        int read = this.A02.read(bArr, i, i2);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new HF(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - read;
        }
        InterfaceC0701Hh<? super C1202aT> interfaceC0701Hh = this.A05;
        if (interfaceC0701Hh != null) {
            interfaceC0701Hh.A95(this, read);
        }
        return read;
    }
}