package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.E9;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GeobFrame extends Id3Frame {
    public static byte[] A04;
    public static String[] A05;
    public static final Parcelable.Creator<GeobFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[3].charAt(14) == strArr[4].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[3] = "S35uTAl8blKCIA6RDoKwUWKuPnlgGmXm";
            strArr2[4] = "SsAAbyTQ3GSJA95JV1WqS3o9zGFFtLED";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{111, 99, 39, 38, 48, 32, 49, bx.W5, 51, 55, bx.W5, 44, 45, 126, 118, 122, 60, 51, 54, ax5.a, 52, 59, 55, ax5.a, 103, 41, 51, 126, 122, 126, 118, 71, 106, 99, 118, 46, 104, 106, 96, 109};
    }

    public static void A02() {
        A05 = new String[]{"p5UgAckTjmiGwIEIp83kIoPYrYx51Hw3", "97Kf", "57iypjQefLkAX1Pf2WMG90QuGpxdZgI9", "MH86n39kjy3It9ArXMcOY1qRtEydqyVj", "czNdDpNwjYz3LUV8hemm9Bag6a1DUht2", "5z2r5SqfWorFCf0GfnerHo5X3AOsS9gQ", "7Yq0Z", "aSTQxqZrOCwJPjy2PBAUJaSPZ7cz8UJW"};
    }

    static {
        A02();
        A01();
        CREATOR = new E9();
    }

    public GeobFrame(Parcel parcel) {
        super(A00(36, 4, 61));
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(A00(36, 4, 61));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A0h(r5.A02, r6.A02) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A0h(r5.A01, r6.A01) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A0h(r5.A00, r6.A00) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (java.util.Arrays.equals(r5.A03, r6.A03) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A0h(r5.A02, r6.A02) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A05;
        if (strArr[0].charAt(21) != strArr[5].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "qpy6";
        strArr2[1] = "qpy6";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        String[] strArr3 = A05;
        if (strArr3[2].charAt(2) != strArr3[7].charAt(2)) {
            String[] strArr4 = A05;
            strArr4[0] = "ZxNtpKl8Qog9k8N9AfFsAobqqZJconha";
            strArr4[5] = "CevArDyiRACDVeaxwdL6do5tdD551HHN";
        }
    }

    public final int hashCode() {
        int i = 17 * 31;
        String str = this.A02;
        int result = str != null ? str.hashCode() : 0;
        int i2 = (i + result) * 31;
        String str2 = this.A01;
        int result2 = str2 != null ? str2.hashCode() : 0;
        int i3 = i2 + result2;
        if (A05[1].length() != 4) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[3] = "5eDn8afHXDuGLumtwhVuBGsgGShhwGUa";
        strArr[4] = "hfSsrwL4qnCDd3h6Kdz3LdbJUMkhTjAD";
        int i4 = i3 * 31;
        String str3 = this.A00;
        int hashCode = str3 != null ? str3.hashCode() : 0;
        int result3 = Arrays.hashCode(this.A03);
        return ((i4 + hashCode) * 31) + result3;
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(25, 11, 1) + this.A02 + A00(14, 11, 72) + this.A01 + A00(0, 14, 81) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }
}