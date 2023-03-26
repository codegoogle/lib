package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WS extends AbstractC04566x<C04536u> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "j0mxEJ7PXI6EdILEdAOyominFOl70E0d";
            strArr2[1] = "j0mxEJ7PXI6EdILEdAOyominFOl70E0d";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 111);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{103};
    }

    public static void A02() {
        A01 = new String[]{"eVrT2", "NU6zFG4u0rUdQg4rmHCYhyhimIYEqcVW", "w8lzJt7", "2MtxRlAdf", "ofvbevjNzGuCdnDr", "yiSP4Q9AL7pZMBsKWJvcqboDvH4W4ekH", "Y5GBNp4gGulMUvRVJRIen52bKNtw4QSM", "rwvebAAeAhhSfHBQ"};
    }

    public WS(long j, @Nullable C04546v c04546v, C04536u c04536u) {
        super(j, c04546v, c04536u, EnumC04556w.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final int A07() {
        return A08().A04();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 126), A08().A09());
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r5.A08().equals(r4.A08()) != false) goto L26;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6x != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalErrorValueTypeDef> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04566x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0B(AbstractC04566x<C04536u> abstractC04566x) {
        C04536u A08 = A08();
        C04536u A082 = abstractC04566x.A08();
        boolean z = true;
        boolean z2 = A08.A05().equals(abstractC04566x.A08().A05()) && A08.A03() == A082.A03();
        if (z2 && A08.A05().equals(EnumC04526t.A08)) {
            if (A08.A07() != null && A08.A07().equals(A082.A07()) && A08.A06() != null && A08.A06().equals(A082.A06())) {
                String A083 = A08.A08();
                String[] strArr = A01;
                if (strArr[7].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[3] = "qacHDjQO5";
                strArr2[2] = "DaFJoXz";
                if (A083 != null) {
                }
            }
            z = false;
            return z2 & z;
        }
        return z2;
    }
}