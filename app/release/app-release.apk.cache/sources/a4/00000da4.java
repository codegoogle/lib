package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.yg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.1c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03091c {
    public static byte[] A00;
    public static String[] A01;
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "D54QwelP5odSxG9euBwRTMcSh2Pd8wOj";
            strArr[2] = "D54QwelP5odSxG9euBwRTMcSh2Pd8wOj";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
            i4++;
        }
    }

    public static void A0A() {
        A00 = new byte[]{122, 75, 88, 89, 67, 68, 77, 10, 79, 88, 88, 69, 88, 4, 16, 18, 16, 27, 22, 44, 30, 18, 29, 23, 18, 7, 28, 1, 10, 44, 21, 26, 31, 22, 0, 50, 48, 50, 57, 52, 14, 60, 48, ax5.a, 53, 48, 37, 62, 35, 40, 14, 56, 60, 48, 54, 52, 34, 51, 49, 51, 56, 53, 15, 61, 49, 62, 52, 49, 36, ax5.a, 34, 41, 15, 38, 57, 52, 53, ax5.a, 35, 112, 114, 112, 123, 118, 76, 124, 99, 103, 122, 124, 125, 114, g15.c, 76, 117, 122, g15.c, 118, 96, 39, 37, 39, 44, 33, 27, 43, 52, 48, 45, 43, bx.W5, 37, 40, 27, 45, 41, 37, 35, 33, 55, 73, 75, 73, 66, 79, 117, 69, 90, 94, 67, 69, 68, 75, 70, 117, 92, 67, 78, 79, 69, 89, 30, 3, 15, 30, 21, 8, 18, 20, 21, 121, 116, 120, 118, 121, 101, 47, 40, 54, 59, 36, 41, 40, 34, 18, 61, ax5.a, 40, 33, 34, 44, 41, 18, 62, 36, 55, 40, 18, 47, 52, 57, 40, 62, 19, 13, 0, 16, 12};
    }

    public static void A0B() {
        A01 = new String[]{"bG5kl7ms2jfnGaubcapygHKl44y7F2pp", "Rfugxyqxov8lkQxdzAX2Cnba", "UYPyWhR5a1NgyKUppdulFuhBDqolXuli", "yVUW3irpFLZwTCrJAvbU3rIgys0qFO1P", "UNPhHDAhOEnfjuuNBPKCm76i9jlKW1r2", "sZGwH8l6kBVN3CTdl2", "yXveppwLCP5eqnK3ndR9MGNfrhvwghUf", "V2q4ZcPDX5bZ16EtvZSABaDK"};
    }

    static {
        A0B();
        A0A();
        A02 = C03091c.class.getName();
    }

    public static List<C1Z> A01(JSONArray jSONArray, boolean z) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C1Z(jSONObject.getString(A00(156, 3, 67)), jSONObject.optString(A00(WKSRecord.Service.EMFIS_CNTL, 9, 98))));
                } catch (JSONException e) {
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A02, A00(0, 14, 51), e);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C03071a> A02(JSONArray jSONArray, boolean z) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C03071a(jSONObject.getString(A00(156, 3, 67)), jSONObject.optInt(A00(yg1.D, 5, 125)), jSONObject.optInt(A00(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 6, 8))));
                } catch (JSONException e) {
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A02, A00(0, 14, 51), e);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C03081b> A03(JSONArray jSONArray, boolean z) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C03081b(jSONObject.getString(A00(156, 3, 67)), jSONObject.optLong(A00(159, 24, 84), -1L)));
                } catch (JSONException e) {
                    if (A01[0].charAt(22) == 'd') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "QLc7yT25OduSbDqqrX";
                    strArr[5] = "QLc7yT25OduSbDqqrX";
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A02, A00(0, 14, 51), e);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C1Z> A04(JSONObject jSONObject) throws IllegalStateException {
        return A01(jSONObject.optJSONArray(A00(14, 21, 106)), true);
    }

    public static List<C03071a> A05(JSONObject jSONObject) throws IllegalStateException {
        return A02(jSONObject.optJSONArray(A00(35, 22, 72)), true);
    }

    public static List<C03081b> A06(JSONObject jSONObject) throws IllegalStateException {
        return A03(jSONObject.optJSONArray(A00(57, 22, 73)), true);
    }

    public static List<C1Z> A07(JSONObject jSONObject) throws IllegalStateException {
        return A01(jSONObject.optJSONArray(A00(79, 20, 10)), false);
    }

    public static List<C03071a> A08(JSONObject jSONObject) throws IllegalStateException {
        return A02(jSONObject.optJSONArray(A00(99, 21, 93)), false);
    }

    public static List<C03081b> A09(JSONObject jSONObject) throws IllegalStateException {
        return A03(jSONObject.optJSONArray(A00(120, 21, 51)), false);
    }
}