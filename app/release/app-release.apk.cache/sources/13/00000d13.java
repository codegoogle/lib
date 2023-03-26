package com.facebook.ads.internal.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.facebook.ads.redexgen.X.AF;
import com.facebook.ads.redexgen.X.C0726Ig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Format implements Parcelable {
    public static byte[] A0R;
    public static String[] A0S;
    public static final Parcelable.Creator<Format> CREATOR;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    @Nullable
    public final DrmInitData A0H;
    @Nullable
    public final Metadata A0I;
    @Nullable
    public final ColorInfo A0J;
    @Nullable
    public final String A0K;
    @Nullable
    public final String A0L;
    @Nullable
    public final String A0M;
    @Nullable
    public final String A0N;
    @Nullable
    public final String A0O;
    public final List<byte[]> A0P;
    @Nullable
    public final byte[] A0Q;

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0R = new byte[]{60, 48, 35, 47, 84, 4, 45, 48, 47, 35, 54, 106, 8, 64, 52};
    }

    public static void A0E() {
        A0S = new String[]{"vGX1GGEkwYRY6RU49bxQYa9cKSE0JnL1", "jouimqjzRvJJn6CQLj0bvIgvYOaQJ8n7", "okaeuhFd1McrDnHL3LojszCI5VhJZfc6", "B0", "VmcpJpCYh4AjNq0ywjVO25ycqwipB041", "iCSfxmGD7XOmopp", "9Pj1GuzMtk7lxtvUuCnLA1hQ1ukhmjuF", "ElSuOUcfqRTRm52JPbd0IEktycUaIpsD"};
    }

    static {
        A0E();
        A0D();
        CREATOR = new AF();
    }

    public Format(Parcel parcel) {
        this.A0M = parcel.readString();
        this.A0L = parcel.readString();
        this.A0O = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        this.A0Q = C0726Ig.A0g(parcel) ? parcel.createByteArray() : null;
        this.A0E = parcel.readInt();
        this.A0J = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0N = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int readInt = parcel.readInt();
        this.A0P = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A0P.add(parcel.createByteArray());
        }
        this.A0H = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.A0I = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public Format(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, @Nullable byte[] bArr, int i6, @Nullable ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, @Nullable String str5, int i13, long j, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        int i14 = i5;
        float f3 = f2;
        int i15 = i11;
        int i16 = i10;
        List<byte[]> list2 = list;
        this.A0M = str;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A04 = i;
        this.A09 = i2;
        this.A0F = i3;
        this.A08 = i4;
        this.A01 = f;
        this.A0B = i14 == -1 ? 0 : i14;
        this.A02 = f3 == -1.0f ? 1.0f : f3;
        this.A0Q = bArr;
        this.A0E = i6;
        this.A0J = colorInfo;
        this.A05 = i7;
        this.A0C = i8;
        this.A0A = i9;
        this.A06 = i16 == -1 ? 0 : i16;
        this.A07 = i15 == -1 ? 0 : i15;
        this.A0D = i12;
        this.A0N = str5;
        this.A03 = i13;
        this.A0G = j;
        this.A0P = list2 == null ? Collections.emptyList() : list2;
        this.A0H = drmInitData;
        this.A0I = metadata;
    }

    public static Format A00(@Nullable String str, String str2, int i, @Nullable String str3) {
        return A01(str, str2, i, str3, null);
    }

    public static Format A01(@Nullable String str, String str2, int i, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A02(@Nullable String str, @Nullable String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static Format A03(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> initializationData, int i5, float f2, @Nullable DrmInitData drmInitData) {
        return A04(str, str2, str3, i, i2, i3, i4, f, initializationData, i5, f2, null, -1, null, drmInitData);
    }

    public static Format A04(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A05(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, @Nullable DrmInitData drmInitData, int i8, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format A06(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int i6, @Nullable String str4) {
        return A05(str, str2, str3, i, i2, i3, i4, i5, -1, -1, initializationData, drmInitData, i6, str4, null);
    }

    public static Format A07(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int i5, @Nullable String str4) {
        return A06(str, str2, str3, i, i2, i3, i4, -1, initializationData, drmInitData, i5, str4);
    }

    public static Format A08(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A09(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    public static Format A0A(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A0B(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public final int A0F() {
        int i;
        int i2 = this.A0F;
        if (i2 == -1 || (i = this.A08) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final Format A0G(int i) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, i, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0H(int i, int i2) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i, i2, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0I(long j) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, j, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0J(@Nullable DrmInitData drmInitData) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, drmInitData, this.A0I);
    }

    public final Format A0K(@Nullable Metadata metadata) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, metadata);
    }

    public final boolean A0L(Format format) {
        if (this.A0P.size() != format.A0P.size()) {
            return false;
        }
        for (int i = 0; i < this.A0P.size(); i++) {
            if (!Arrays.equals(this.A0P.get(i), format.A0P.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e1, code lost:
        if (r3 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00eb, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A0h(r6.A0I, r7.A0I) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f5, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A0h(r6.A0J, r7.A0J) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ff, code lost:
        if (java.util.Arrays.equals(r6.A0Q, r7.A0Q) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0105, code lost:
        if (A0L(r7) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0114, code lost:
        if (r3 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        if (this.A04 == format.A04 && this.A09 == format.A09 && this.A0F == format.A0F && this.A08 == format.A08 && this.A01 == format.A01 && this.A0B == format.A0B && this.A02 == format.A02 && this.A0E == format.A0E && this.A05 == format.A05 && this.A0C == format.A0C && this.A0A == format.A0A && this.A06 == format.A06 && this.A07 == format.A07 && this.A0G == format.A0G && this.A0D == format.A0D && C0726Ig.A0h(this.A0M, format.A0M)) {
            String str = this.A0N;
            if (A0S[1].charAt(16) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0S;
            strArr[6] = "OxllPOzEVfYZ4qffVVucen9spyCFBXaZ";
            strArr[6] = "OxllPOzEVfYZ4qffVVucen9spyCFBXaZ";
            if (C0726Ig.A0h(str, format.A0N) && this.A03 == format.A03 && C0726Ig.A0h(this.A0L, format.A0L) && C0726Ig.A0h(this.A0O, format.A0O) && C0726Ig.A0h(this.A0K, format.A0K)) {
                boolean A0h = C0726Ig.A0h(this.A0H, format.A0H);
                if (A0S[3].length() == 2) {
                    String[] strArr2 = A0S;
                    strArr2[1] = "3AW52F1sopS3WF7CLvtUPS7egIIfmwo6";
                    strArr2[1] = "3AW52F1sopS3WF7CLvtUPS7egIIfmwo6";
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 17 * 31;
            String str = this.A0M;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.A0L;
            int result = str2 == null ? 0 : str2.hashCode();
            int i2 = (hashCode + result) * 31;
            String str3 = this.A0O;
            int hashCode2 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.A0K;
            int result2 = str4 == null ? 0 : str4.hashCode();
            int result3 = this.A0F;
            int result4 = this.A05;
            int i3 = (((((((((((hashCode2 + result2) * 31) + this.A04) * 31) + result3) * 31) + this.A08) * 31) + result4) * 31) + this.A0C) * 31;
            String str5 = this.A0N;
            int result5 = str5 == null ? 0 : str5.hashCode();
            int i4 = (i3 + result5) * 31;
            if (A0S[6].charAt(6) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0S;
            strArr[0] = "Pa31ThsuQdloj8lWLbuVRj0Nef3PQXlW";
            strArr[7] = "gnG3aj7z3XBCxLsDLbWk4AuKXzueFLox";
            int i5 = (i4 + this.A03) * 31;
            DrmInitData drmInitData = this.A0H;
            int result6 = drmInitData == null ? 0 : drmInitData.hashCode();
            int i6 = (i5 + result6) * 31;
            Metadata metadata = this.A0I;
            this.A00 = i6 + (metadata != null ? metadata.hashCode() : 0);
        }
        int result7 = this.A00;
        return result7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0C(5, 7, 4));
        sb.append(this.A0M);
        String A0C = A0C(0, 2, 86);
        sb.append(A0C);
        sb.append(this.A0L);
        sb.append(A0C);
        sb.append(this.A0O);
        sb.append(A0C);
        sb.append(this.A04);
        sb.append(A0C);
        sb.append(this.A0N);
        String A0C2 = A0C(2, 3, 73);
        sb.append(A0C2);
        sb.append(this.A0F);
        sb.append(A0C);
        sb.append(this.A08);
        sb.append(A0C);
        sb.append(this.A01);
        sb.append(A0C(12, 1, 19));
        sb.append(A0C2);
        sb.append(this.A05);
        sb.append(A0C);
        sb.append(this.A0C);
        sb.append(A0C(13, 2, 91));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A02);
        C0726Ig.A0W(parcel, this.A0Q != null);
        byte[] bArr = this.A0Q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0J, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A0G);
        int size = this.A0P.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.A0P.get(i2));
            if (A0S[2].charAt(16) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0S;
            strArr[4] = "uEseBvDXMUnwGsdyFGyQsGvPhE4Avh4c";
            strArr[4] = "uEseBvDXMUnwGsdyFGyQsGvPhE4Avh4c";
        }
        parcel.writeParcelable(this.A0H, 0);
        parcel.writeParcelable(this.A0I, 0);
    }
}