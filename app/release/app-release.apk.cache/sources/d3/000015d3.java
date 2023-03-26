package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1196aN implements GG {
    public static byte[] A04;
    public final int A00;
    public final List<C1195aM> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{5};
    }

    public C1196aN(List<C1195aM> list) {
        this.A01 = list;
        this.A00 = list.size();
        this.A02 = new long[this.A00 * 2];
        for (int i = 0; i < this.A00; i++) {
            C1195aM c1195aM = list.get(i);
            int i2 = i * 2;
            this.A02[i2] = c1195aM.A01;
            this.A02[i2 + 1] = c1195aM.A00;
        }
        long[] jArr = this.A02;
        this.A03 = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final List<GF> A5p(long j) {
        ArrayList arrayList = null;
        C1195aM cue = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i = 0; i < this.A00; i++) {
            long[] jArr = this.A02;
            if (jArr[i * 2] <= j && j < jArr[(i * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C1195aM c1195aM = this.A01.get(i);
                if (c1195aM.A00()) {
                    if (cue == null) {
                        cue = c1195aM;
                    } else {
                        String A00 = A00(0, 1, 126);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(cue.A0C).append((CharSequence) A00).append(c1195aM.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(c1195aM.A0C);
                        }
                    }
                } else {
                    arrayList.add(c1195aM);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new C1195aM(normalCueTextBuilder));
        } else if (cue != null) {
            arrayList.add(cue);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final long A6E(int i) {
        boolean z = true;
        I1.A03(i >= 0);
        if (i >= this.A03.length) {
            z = false;
        }
        I1.A03(z);
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final int A6F() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final int A6Y(long j) {
        int A0A = C0726Ig.A0A(this.A03, j, false, false);
        if (A0A < this.A03.length) {
            return A0A;
        }
        return -1;
    }
}