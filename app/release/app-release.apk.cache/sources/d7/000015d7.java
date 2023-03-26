package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.aR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1200aR extends HB {
    public static String[] A01;
    @Nullable
    public H6 A00;

    static {
        A0S();
    }

    public static void A0S() {
        A01 = new String[]{"26JblF4b6dorFS8jU2vwriUxZ0G71mwq", "Xnpi2o2sUEOze", "R71e3dTOAhzB09tZHggtqRTS0V3by", "x11tshWAsx1g8", "baPvwG8wSWpB2aFi4", "NgcUJ4cAOsbj9", "II", "FdNrM275eXYBmZtzCUl1db95x7ONP"};
    }

    public abstract Pair<C0531Ad[], H8[]> A0X(H6 h6, int[][][] iArr, int[] iArr2) throws A4;

    public static int A0R(InterfaceC0530Ac[] interfaceC0530AcArr, TrackGroup trackGroup) throws A4 {
        int rendererIndex = interfaceC0530AcArr.length;
        int i = 0;
        for (int trackIndex = 0; trackIndex < interfaceC0530AcArr.length; trackIndex++) {
            InterfaceC0530Ac interfaceC0530Ac = interfaceC0530AcArr[trackIndex];
            for (int i2 = 0; i2 < trackGroup.A01; i2++) {
                int formatSupportLevel = interfaceC0530Ac.ADS(trackGroup.A02(i2)) & 7;
                if (formatSupportLevel > i) {
                    rendererIndex = trackIndex;
                    i = formatSupportLevel;
                    if (i == 4) {
                        return rendererIndex;
                    }
                }
            }
        }
        return rendererIndex;
    }

    public static int[] A0T(InterfaceC0530Ac interfaceC0530Ac, TrackGroup trackGroup) throws A4 {
        int[] iArr = new int[trackGroup.A01];
        for (int i = 0; i < trackGroup.A01; i++) {
            iArr[i] = interfaceC0530Ac.ADS(trackGroup.A02(i));
        }
        return iArr;
    }

    public static int[] A0U(InterfaceC0530Ac[] interfaceC0530AcArr) throws A4 {
        int[] iArr = new int[interfaceC0530AcArr.length];
        int i = 0;
        while (true) {
            int length = iArr.length;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int length2 = str.length();
            int i2 = str2.length();
            if (length2 == i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "xB4ZDOqJN2K9OUw5kZCJNg4ll7dteaQM";
            strArr2[0] = "xB4ZDOqJN2K9OUw5kZCJNg4ll7dteaQM";
            if (i < length) {
                int i3 = interfaceC0530AcArr[i].ADU();
                iArr[i] = i3;
                i++;
            } else {
                return iArr;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:16:0x005c */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0029 */
    @Override // com.facebook.ads.redexgen.X.HB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HC A0V(InterfaceC0530Ac[] interfaceC0530AcArr, TrackGroupArray trackGroupArray) throws A4 {
        int[] iArr = new int[interfaceC0530AcArr.length + 1];
        TrackGroup[][] trackGroupArr = new TrackGroup[interfaceC0530AcArr.length + 1];
        int[][][] iArr2 = new int[interfaceC0530AcArr.length + 1][];
        for (int i = 0; i < i; i++) {
            int i2 = trackGroupArray.A01;
            trackGroupArr[i] = new TrackGroup[i2];
            int i3 = trackGroupArray.A01;
            iArr2[i] = new int[i3];
        }
        int[] A0U = A0U(interfaceC0530AcArr);
        for (int i4 = 0; i4 < groupIndex; i4++) {
            TrackGroup A02 = trackGroupArray.A02(i4);
            int A0R = A0R(interfaceC0530AcArr, A02);
            int[] A0T = A0R == interfaceC0530AcArr.length ? new int[A02.A01] : A0T(interfaceC0530AcArr[A0R], A02);
            int i5 = iArr[A0R];
            trackGroupArr[A0R][i5] = A02;
            iArr2[A0R][i5] = A0T;
            int rendererTrackGroupCount = iArr[A0R];
            iArr[A0R] = rendererTrackGroupCount + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[interfaceC0530AcArr.length];
        int[] iArr3 = new int[interfaceC0530AcArr.length];
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = iArr[i6];
            trackGroupArrayArr[i6] = new TrackGroupArray((TrackGroup[]) C0726Ig.A0l(trackGroupArr[i6], i7));
            iArr2[i6] = (int[][]) C0726Ig.A0l(iArr2[i6], i7);
            int rendererTrackGroupCount2 = interfaceC0530AcArr[i6].A7A();
            iArr3[i6] = rendererTrackGroupCount2;
        }
        int unmappedTrackGroupCount = iArr[interfaceC0530AcArr.length];
        H6 h6 = new H6(iArr3, trackGroupArrayArr, A0U, iArr2, new TrackGroupArray((TrackGroup[]) C0726Ig.A0l(trackGroupArr[interfaceC0530AcArr.length], unmappedTrackGroupCount)));
        Pair<C0531Ad[], H8[]> A0X = A0X(h6, iArr2, A0U);
        return new HC((C0531Ad[]) A0X.first, (H8[]) A0X.second, h6);
    }

    @Override // com.facebook.ads.redexgen.X.HB
    public final void A0W(Object obj) {
        this.A00 = (H6) obj;
    }
}