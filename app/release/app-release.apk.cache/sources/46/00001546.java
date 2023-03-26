package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.C5;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
/* loaded from: assets/audience_network.dex */
public final class Y2<T extends C5> implements C4<T>, Bl<T> {
    public static byte[] A0D;
    public static String[] A0E;
    public int A00;
    public Looper A01;
    public byte[] A02;
    public final int A03;
    public final C0566Br A04;
    public final CB<T> A05;
    public final CF A06;
    public final HashMap<String, String> A07;
    public final List<C1124Xz<T>> A08;
    public final List<C1124Xz<T>> A09;
    public final UUID A0A;
    public final boolean A0B;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/Y2<TT;>.MediaDrmHandler; */
    public volatile HandlerC0568Bu A0C;

    static {
        A04();
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{74, 107, 104, 111, 123, 98, 122, 74, 124, 99, 93, 107, 125, 125, 103, 97, 96, 67, 105, 124, 9, ax5.a, 32, 4, 35, 36, 57, 9, 44, 57, 44, 109, 34, 35, 33, 52, 109, 46, 34, 35, 57, 44, 36, 35, 62, 109, 46, 34, 32, 32, 34, 35, 109, 29, 30, 30, 5, 109, 30, 46, 37, 40, 32, 40, 9, 44, 57, 44, 99, 109, 12, 62, 62, 56, 32, 36, 35, bx.W5, 109, 62, 56, 61, 61, 34, ax5.a, 57, 109, 43, 34, ax5.a, 119, 109, 109, 108, 109, ax5.a, 120, 121, 120, 104, 10, 12, 7, 10, 49, 55, 60, 33};
    }

    public static void A04() {
        A0E = new String[]{"0jHq0iWGhsIySlQoDiDGup3biHh1u6", "i2l5O7Dt7qLUzCpPXTMvAA2Zo4KmgWR2", "WWWB5", "5af5rLtbMnzIwH5Nva3tIodv6", "N1ag4SyeR1bkHrLLU69ntDAZG70pDTMe", "aZncB9cokv9961OmHq", "gIBDsbvLQEgXIogWiAeZHaFgFZc1jweS", "Prja9buVBy0glhaqAx1SHba3MELDXzlR"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DrmInitData.SchemeData A00(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.A01);
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i < drmInitData.A01) {
                DrmInitData.SchemeData A02 = drmInitData.A02(i);
                boolean A03 = A02.A03(uuid);
                if (A0E[0].length() != 30) {
                    break;
                }
                String[] strArr = A0E;
                strArr[2] = "V0Q9eaLMfBF3CEdW";
                strArr[2] = "V0Q9eaLMfBF3CEdW";
                if (A03 || (C05269y.A01.equals(uuid) && A02.A03(C05269y.A02))) {
                    z2 = true;
                }
                if (z2 && (A02.A04 != null || z)) {
                    arrayList.add(A02);
                }
                i++;
            } else if (arrayList.isEmpty()) {
                return null;
            } else {
                if (C05269y.A05.equals(uuid)) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i2);
                        int version = schemeData.A02() ? D3.A00(schemeData.A04) : -1;
                        if (C0726Ig.A02 < 23 && version == 0) {
                            return schemeData;
                        }
                        if (C0726Ig.A02 >= 23 && version == 1) {
                            return schemeData;
                        }
                    }
                }
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(0);
                if (A0E[6].charAt(29) == 'w') {
                    String[] strArr2 = A0E;
                    strArr2[7] = "QMUEyZuv57oImxraVf5zIpun0ErJkPMX";
                    strArr2[7] = "QMUEyZuv57oImxraVf5zIpun0ErJkPMX";
                    return schemeData2;
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C5> */
    public final void A05(Handler handler, Bs bs) {
        this.A04.A03(handler, bs);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C5> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C5> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.C4
    public final C3<T> A2Q(Looper looper, DrmInitData drmInitData) {
        C1124Xz<T> c1124Xz;
        Looper looper2 = this.A01;
        I1.A04(looper2 == null || looper2 == looper);
        if (this.A09.isEmpty()) {
            this.A01 = looper;
            if (this.A0C == null) {
                this.A0C = new HandlerC0568Bu(this, looper);
            }
        }
        DrmInitData.SchemeData schemeData = null;
        C1124Xz<T> c1124Xz2 = (C1124Xz<T>) false;
        if (this.A02 == null && (schemeData = A00(drmInitData, this.A0A, false)) == null) {
            Bv bv = new Bv(this.A0A);
            this.A04.A04(bv);
            return new Y3(new C1(bv));
        }
        if (!this.A0B) {
            c1124Xz = c1124Xz2;
            if (!this.A09.isEmpty()) {
                C1124Xz<T> c1124Xz3 = this.A09.get(0);
                if (A0E[0].length() != 30) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[5] = "NYlDF58TVUPxDFfWvHrOlngI";
                strArr[5] = "NYlDF58TVUPxDFfWvHrOlngI";
                c1124Xz = c1124Xz3;
            }
        } else if (A0E[6].charAt(29) == 'w') {
            String[] strArr2 = A0E;
            strArr2[7] = "2tfSkouS8gaRHNrU7OMeTyiBrWH6VnUA";
            strArr2[7] = "2tfSkouS8gaRHNrU7OMeTyiBrWH6VnUA";
            byte[] bArr = c1124Xz2;
            if (schemeData != null) {
                bArr = (C1124Xz<T>) schemeData.A04;
            }
            Iterator<C1124Xz<T>> it = this.A09.iterator();
            while (true) {
                if (it.hasNext()) {
                    C1124Xz<T> next = it.next();
                    if (next.A0N(bArr)) {
                        c1124Xz = next;
                        break;
                    }
                } else {
                    c1124Xz = null;
                    break;
                }
            }
        } else {
            throw new RuntimeException();
        }
        if (c1124Xz == null) {
            c1124Xz = new C1124Xz<>(this.A0A, this.A05, this, schemeData, this.A00, this.A02, this.A07, this.A06, looper, this.A04, this.A03);
            this.A09.add(c1124Xz);
        }
        c1124Xz.A0H();
        return c1124Xz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C5> */
    @Override // com.facebook.ads.redexgen.X.C4
    public final boolean A3x(@NonNull DrmInitData drmInitData) {
        if (this.A02 != null) {
            return true;
        }
        DrmInitData.SchemeData A00 = A00(drmInitData, this.A0A, true);
        if (A0E[2].length() != 25) {
            String[] strArr = A0E;
            strArr[2] = "f9Fo7yPZ7tYjgWekbXY";
            strArr[2] = "f9Fo7yPZ7tYjgWekbXY";
            if (A00 == null) {
                if (drmInitData.A01 != 1 || !drmInitData.A02(0).A03(C05269y.A02)) {
                    return false;
                }
                Log.w(A01(0, 20, 43), A01(20, 72, 104) + this.A0A);
            }
            String str = drmInitData.A02;
            if (str == null || A01(100, 4, 76).equals(str)) {
                return true;
            }
            return !(A01(92, 4, 43).equals(str) || A01(96, 4, 62).equals(str) || A01(104, 4, 119).equals(str)) || C0726Ig.A02 >= 25;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C5> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C5> */
    @Override // com.facebook.ads.redexgen.X.Bl
    public final void AAe() {
        for (C1124Xz<T> c1124Xz : this.A08) {
            c1124Xz.A0I();
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C5> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C5> */
    @Override // com.facebook.ads.redexgen.X.Bl
    public final void AAf(Exception exc) {
        for (C1124Xz<T> c1124Xz : this.A08) {
            c1124Xz.A0L(exc);
        }
        List<C1124Xz<T>> list = this.A08;
        String[] strArr = A0E;
        if (strArr[4].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "LfmgySfdwng";
        strArr2[3] = "LfmgySfdwng";
        list.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C5> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C5> */
    @Override // com.facebook.ads.redexgen.X.Bl
    public final void ABs(C1124Xz<T> c1124Xz) {
        this.A08.add(c1124Xz);
        if (this.A08.size() == 1) {
            c1124Xz.A0J();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C3 != com.facebook.ads.internal.exoplayer2.drm.DrmSession<T extends com.facebook.ads.redexgen.X.C5> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C5> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C5> */
    @Override // com.facebook.ads.redexgen.X.C4
    public final void ACJ(C3<T> c3) {
        if (c3 instanceof Y3) {
            return;
        }
        C1124Xz<T> c1124Xz = (C1124Xz) c3;
        if (c1124Xz.A0M()) {
            this.A09.remove(c1124Xz);
            if (this.A08.size() > 1 && this.A08.get(0) == c1124Xz) {
                this.A08.get(1).A0J();
            }
            this.A08.remove(c1124Xz);
        }
    }
}