package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.p7700g.p99005.g15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Fu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0662Fu implements QB {
    public static byte[] A05;
    public static String[] A06;
    @Nullable
    public JSONObject A00;
    @Nullable
    public JSONObject A01;
    public final QC A03;
    public final List<QD> A04 = new ArrayList();
    public boolean A02 = false;

    static {
        A04();
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        if (A06[7].length() != 12) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "GbTE4j9vTw";
        strArr[3] = "GbTE4j9vTw";
        A05 = new byte[]{58, 13, 22, 28, 20, 29, 88, 93, Flags.CD, 88, 28, 25, 12, 25, 88, 13, 8, 28, 25, 12, 29, 66, 114, 82, 82, 88, 28, 25, 12, 25, 88, 82, 82, 114, 93, Flags.CD, 114, 82, 82, 88, 30, 17, 22, 31, 29, 10, 8, 10, 17, 22, 12, 88, 82, 82, 114, 93, Flags.CD, 89, 110, 117, g15.c, 119, 126, 59, 115, 122, 104, 59, 117, 116, 59, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 32, 23, 12, 6, 14, 7, 66, Flags.CD, 17, 66, 12, 13, 22, 66, 16, 7, 3, 6, 27, 43, 46, 59, 46, 111, 114, 114, 111, 33, 58, 35, 35, 107, 100, 99, 106, 104, g15.c, 125, g15.c, 100, 99, 121, 45, 44, 48, 45, 99, 120, 97, 97, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 59, 38, 38, 59, 117, 110, 119, 119, 77, 86, 79, 79};
    }

    public static void A04() {
        A06 = new String[]{"yJwczGSbba5UrkwzZOW60Je1LUoZxQIl", "oZp", "SLRT1bjVboXCxkvYGWPu27FVIHxKKecJ", "WHpvXVjPup", "", "gRWAa43vtpEz38T6Kt4HiTmitjJp6SmI", "", "QpBNbg2dQWhW"};
    }

    public C0662Fu(QC qc) {
        this.A03 = qc;
    }

    private boolean A05(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        boolean A02 = QA.A02(jSONObject, jSONObject2);
        String[] strArr = A06;
        if (strArr[0].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "";
        strArr2[6] = "";
        return true ^ A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r8.A03.A05() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
        throw new java.lang.IllegalArgumentException(A02(113, 19, 22));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean A06(JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject != null) {
            if (jSONObject2 == null && this.A03.A05()) {
                throw new IllegalArgumentException(A02(WKSRecord.Service.CISCO_SYS, 19, 0));
            }
            boolean A052 = A05(this.A00, jSONObject);
            if (A06[7].length() != 12) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "K9PRKVKMb7VtUCOMkzotPIPCn5fc0ecH";
            strArr[2] = "SxwA2mF5bGI3KXtpcTFDX9Gzp9XH67Wr";
            if (A052 || A05(this.A01, jSONObject2)) {
                this.A00 = jSONObject;
                this.A01 = jSONObject2;
                this.A02 = true;
                for (QD l : this.A04) {
                    l.A3u();
                }
                try {
                    Locale locale = Locale.US;
                    String A02 = A02(0, 57, 99);
                    Object[] objArr = new Object[3];
                    objArr[0] = this.A03;
                    objArr[1] = this.A00 == null ? A02(151, 4, 56) : this.A00.toString(2);
                    objArr[2] = this.A01 == null ? A02(151, 4, 56) : this.A01.toString(2);
                    String.format(locale, A02, objArr);
                } catch (JSONException unused) {
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException(A02(101, 12, 84));
    }

    @Override // com.facebook.ads.redexgen.X.QB
    public final synchronized void A3I(QD qd) {
        this.A04.add(qd);
    }

    @Override // com.facebook.ads.redexgen.X.QB
    public final synchronized JSONObject A5x() {
        if (this.A00 != null) {
        } else {
            throw new IllegalStateException(A02(82, 19, 121));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.QB
    public final synchronized JSONObject A6I() {
        if (this.A03.A05()) {
            if (this.A01 != null) {
            } else {
                throw new IllegalStateException(A02(82, 19, 121));
            }
        } else {
            throw new IllegalStateException(A02(57, 25, 0));
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.QB
    public final QC A6M() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QB
    public final synchronized boolean A7i() {
        return this.A02;
    }
}