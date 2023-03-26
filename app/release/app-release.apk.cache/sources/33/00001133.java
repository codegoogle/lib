package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;

/* renamed from: com.facebook.ads.redexgen.X.Gz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0693Gz implements Comparable<C0693Gz> {
    public static String[] A07;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    static {
        A00();
    }

    public static void A00() {
        A07 = new String[]{"UOhnAWHUvWrKh39blc2", "rJoZ4rjs3", "mwxErCj8CFXQtRdeT7I", "OMBsSVN1m", "xKR0iM7hb", "rY23JmNnbt4", "7JhRM9", "FTdecT"};
    }

    public C0693Gz(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = AR.A0I(i, false) ? 1 : 0;
        this.A03 = AR.A0L(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A01 */
    public final int compareTo(C0693Gz c0693Gz) {
        int A01;
        int A012;
        int A013;
        int A014;
        int A015;
        int A016;
        int A017;
        int i = this.A05;
        int i2 = c0693Gz.A05;
        if (i != i2) {
            A017 = AR.A01(i, i2);
            return A017;
        }
        int i3 = this.A03;
        int i4 = c0693Gz.A03;
        if (i3 != i4) {
            A016 = AR.A01(i3, i4);
            return A016;
        }
        int i5 = this.A02;
        int i6 = c0693Gz.A02;
        if (i5 != i6) {
            A015 = AR.A01(i5, i6);
            return A015;
        } else if (this.A06.A0D) {
            A014 = AR.A01(c0693Gz.A00, this.A00);
            return A014;
        } else {
            int i7 = this.A05 != 1 ? -1 : 1;
            int i8 = this.A01;
            int i9 = c0693Gz.A01;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "q1nzmC2W0";
            strArr2[3] = "q1nzmC2W0";
            if (i8 != i9) {
                A013 = AR.A01(i8, i9);
                return A013 * i7;
            }
            int i10 = this.A04;
            int i11 = c0693Gz.A04;
            if (i10 != i11) {
                A012 = AR.A01(i10, i11);
                return A012 * i7;
            }
            A01 = AR.A01(this.A00, c0693Gz.A00);
            return A01 * i7;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0693Gz c0693Gz = (C0693Gz) obj;
        if (this.A05 == c0693Gz.A05 && this.A03 == c0693Gz.A03 && this.A02 == c0693Gz.A02 && this.A01 == c0693Gz.A01 && this.A04 == c0693Gz.A04) {
            int i = this.A00;
            if (A07[5].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "5gFFNpUtyAKNtlVcilC";
            strArr[2] = "oFDw9vE2Y7jHYxyqfLD";
            if (i == c0693Gz.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = this.A04;
        return (((((((((this.A05 * 31) + this.A03) * 31) + result) * 31) + this.A01) * 31) + result2) * 31) + this.A00;
    }
}