package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.g15;
import com.p7700g.p99005.zg2;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A03 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: assets/audience_network.dex */
public abstract class Q9 {
    public static byte[] A00;
    public static String[] A01;
    public static final /* synthetic */ Q9[] A02;
    public static final Q9 A03;
    public static final Q9 A04;
    public static final Q9 A05;
    public static final Q9 A06;
    public static final Q9 A07;
    public static final Q9 A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, g15.c, -92, -86, 101, 120, g15.b, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public static void A04() {
        A01 = new String[]{"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    }

    public abstract boolean A05(JSONArray jSONArray, int i);

    public abstract boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A07(JSONObject jSONObject, String str);

    public abstract boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A04();
        A03();
        final String A022 = A02(0, 5, 105);
        A03 = new Q9(A022, 0) { // from class: com.facebook.ads.redexgen.X.G0
            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optJSONArray(i) != null;
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return QA.A01(jSONArray.optJSONArray(i), jSONArray2.optJSONArray(i));
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return QA.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A04 = new Q9(A02(5, 7, 40), 1) { // from class: com.facebook.ads.redexgen.X.Fz
            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optBoolean(i, true) == jSONArray.optBoolean(i, false);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optBoolean(i) == jSONArray2.optBoolean(i);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A05 = new Q9(A02(12, 6, 81), 2) { // from class: com.facebook.ads.redexgen.X.Fy
            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optInt(i, 0) == jSONArray.optInt(i, 1) && jSONArray.optDouble(i, zg2.s) == jSONArray.optDouble(i, 1.0d) && ((double) jSONArray.optInt(i, 0)) != jSONArray.optDouble(i, zg2.s);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optDouble(i) == jSONArray2.optDouble(i);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, zg2.s) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, zg2.s);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A06 = new Q9(A02(18, 3, 50), 3) { // from class: com.facebook.ads.redexgen.X.Fx
            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optInt(i, 0) == jSONArray.optInt(i, 1) && jSONArray.optDouble(i, zg2.s) == jSONArray.optDouble(i, 1.0d) && ((double) jSONArray.optInt(i, 0)) == jSONArray.optDouble(i, zg2.s);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optInt(i) == jSONArray2.optInt(i);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, zg2.s) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, zg2.s);
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final String A023 = A02(21, 6, 18);
        A07 = new Q9(A023, 4) { // from class: com.facebook.ads.redexgen.X.Fw
            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optJSONObject(i) != null;
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return QA.A02(jSONArray.optJSONObject(i), jSONArray2.optJSONObject(i));
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return QA.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A08 = new Q9(A02(27, 6, 36), 5) { // from class: com.facebook.ads.redexgen.X.Fv
            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A05(JSONArray jSONArray, int i) {
                return jSONArray.optString(i) != null;
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optString(i).equals(jSONArray2.optString(i));
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.Q9
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = new Q9[]{A03, A04, A05, A06, A07, A08};
    }

    public Q9(String str, int i) {
    }

    public static Q9 A00(JSONArray jSONArray, int i) {
        Q9[] values;
        for (Q9 q9 : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            strArr[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (q9.A05(jSONArray, i)) {
                return q9;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static Q9 A01(JSONObject jSONObject, String str) {
        Q9[] values;
        for (Q9 q9 : values()) {
            boolean A072 = q9.A07(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "GmRRmI3tzaTgoS0GQtjO0";
            strArr[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A072) {
                return q9;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static Q9 valueOf(String str) {
        return (Q9) Enum.valueOf(Q9.class, str);
    }

    public static Q9[] values() {
        return (Q9[]) A02.clone();
    }
}