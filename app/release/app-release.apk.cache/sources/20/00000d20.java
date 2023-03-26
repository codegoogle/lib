package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0726Ig;
import com.facebook.ads.redexgen.X.EC;
import com.facebook.ads.redexgen.X.I1;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class InternalFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04;
    public static final Parcelable.Creator<InternalFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{17, 29, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, 0, 108, 108, 108, 108, 88, 66, 6, 13, 15, 3, Flags.CD, 12, 95};
    }

    public static void A02() {
        A04 = new String[]{"lilP4D7d9BEQwLM9jHUfqGkSnEdU58pn", "afpTaQV4nZSZ2pXKiaVB57IApZ4xj5qk", "YRNhV7avC", "1hSLaROLE5s9UJkRnEYVy3hKzt6jPrhV", "10wPMgxL8A4TQ9Hf5dRzrJ387LzBipD1", "PqYfNOJ9aEgtaoP64w7W5IvflQAuK", "TGXFUdlvkhflYTg3tHRPVMdbYrS98xM0", "clX4aM2L2vONCyf4cEJJ0L4DMPtHH1Oh"};
    }

    static {
        A02();
        A01();
        CREATOR = new EC();
    }

    public InternalFrame(Parcel parcel) {
        super(A00(14, 4, 110));
        this.A01 = (String) I1.A01(parcel.readString());
        this.A00 = (String) I1.A01(parcel.readString());
        this.A02 = (String) I1.A01(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super(A00(14, 4, 110));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r3 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A0h(r6.A01, r7.A01) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (com.facebook.ads.redexgen.X.C0726Ig.A0h(r6.A02, r7.A02) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r3 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            String[] strArr = A04;
            if (strArr[6].charAt(30) == strArr[0].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "Mhqd5WFFO6xiPHzIeOEf7QV6aYGfc4Kn";
            strArr2[0] = "xf6wfRaYxe4Afm1t5dth2gMnwuEgfe9t";
            if (cls == obj.getClass()) {
                InternalFrame internalFrame = (InternalFrame) obj;
                boolean A0h = C0726Ig.A0h(this.A00, internalFrame.A00);
                String[] strArr3 = A04;
                if (strArr3[4].charAt(0) != strArr3[3].charAt(0)) {
                    String[] strArr4 = A04;
                    strArr4[1] = "Gmb2a1mvjn118PMUNtRrWMI0JTYZbWWI";
                    strArr4[7] = "BRSYa66X5aU9tnHulh6jJE43QYKNdFpy";
                } else {
                    String[] strArr5 = A04;
                    strArr5[1] = "cswqaHsYDWadkoDisf9vwGuJ2Xq3cIyW";
                    strArr5[7] = "hAvMaAOGLAswzMgAwZEXQ4Q5TQk5ggAk";
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17 * 31;
        String str = this.A01;
        int result = str != null ? str.hashCode() : 0;
        int i2 = (i + result) * 31;
        String str2 = this.A00;
        int result2 = str2 != null ? str2.hashCode() : 0;
        int i3 = (i2 + result2) * 31;
        String str3 = this.A02;
        return i3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(18, 9, 77) + this.A01 + A00(0, 14, 18) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}