package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.0k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02910k {
    public static byte[] A06;
    public static String[] A07;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List<String> A05;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{67, 82, 82, 81, 75, 86, 71, 97, 112, 112, 115, 105, 116, 101, 95, 117, 114, 108, 38, 33, 44, 44, 34, 33, 35, 43, 31, 53, 50, 44, 5, Flags.CD, 23, 49, 6, 15, 29, 6, Flags.CD, 29, 122, 118, 101, 124, 114, 99, 72, 98, 101, 126, 26, Flags.CD, 9, 1, Flags.CD, 13, 15};
    }

    public static void A03() {
        A07 = new String[]{"DvSn6PhmC3i7LdpG0vBUuRZmjagS5as7", "VQCZ7hz", "zA4klKNJM0QxWDxEFTSTi5yKhMV68", "2vimyyNbMv6AohadWhJSDQSQPpWOARjH", "MVolmMMkLKfWmTv", "tHNO368kkNAVpLeIneqpL6ODf8V7me71", "x8Jgc8MGjZsmc", "KvaBSJwcdZeuQnxX6yqoEJJZ8c4KCJ2u"};
    }

    public C02910k(String str, String str2, String str3, List<String> mKeyHashes, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A05 = mKeyHashes;
        this.A03 = str4;
        this.A02 = str5;
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0044 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C02910k A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A01(50, 7, 38));
        String optString2 = jSONObject.optString(A01(0, 7, 110));
        String optString3 = jSONObject.optString(A01(7, 11, 76));
        String appsiteUri = A01(30, 10, 34);
        JSONArray optJSONArray = jSONObject.optJSONArray(appsiteUri);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < i; i++) {
                arrayList.add(optJSONArray.optString(i));
                String appsite = A07[5];
                if (appsite.charAt(9) != 'N') {
                    throw new RuntimeException();
                }
                String[] strArr = A07;
                strArr[2] = "wfKFQtpS7p7Zsd7MRi5uYuHrlLf6T";
                strArr[2] = "wfKFQtpS7p7Zsd7MRi5uYuHrlLf6T";
            }
        }
        String optString4 = jSONObject.optString(A01(40, 10, 91));
        String mPackageName = jSONObject.optString(A01(18, 12, 12));
        return new C02910k(optString, optString2, optString3, arrayList, optString4, mPackageName);
    }

    public final String A04() {
        return this.A00;
    }

    public final String A05() {
        return this.A01;
    }

    public final String A06() {
        return this.A04;
    }
}