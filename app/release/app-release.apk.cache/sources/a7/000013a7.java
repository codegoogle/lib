package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class RI implements InterfaceC02890i {
    public static byte[] A07;
    public static String[] A08;
    public final EnumC02880h A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Collection<String> A05;
    public final Map<String, String> A06;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{9, Flags.CD, 28, 1, 30, 9, 28, 1, 7, 6, 55, Flags.CD, 7, 5, 5, 9, 6, 12, 4, 19, 59, 58, 43, 58, 60, 43, 54, 48, 49, 0, 44, 43, 45, 54, 49, 56, 44, 83, 84, 76, 91, 86, 83, 94, 91, 78, 83, 85, 84, 101, 88, 95, 82, 91, 76, 83, 85, 72, 49, 61, 46, 55, 41, 44, bx.W5, 34, 51, 38, 35, 38, 51, 38, 117, 98, 118, 114, 98, 116, 115, 88, 110, 99};
    }

    public static void A03() {
        A08 = new String[]{"a8CS69kVNecuN9Nm4E1lChlBM", "ag8ss2YsLKCBvL1N8ZsAQ7i2G", "9IBuBVemd2S2dbE3BWmY83r4APvNrK7d", "ZoqrROBX", "uf7sNUy4ZjnbrmNcJuZuOOSXLwo6bRiZ", "LuNKGusWtlIWkNNSsxJCgMD8UDEcDleP", "s1ncMgVhGbgxvH35X0QQBiYqSsxlrK3j", "2ghFrXKxVbUZFk6auJt6qCgV8pKBUCZ9"};
    }

    public RI(String str, String str2, EnumC02880h enumC02880h, Collection<String> mDetectionStrings, Map<String, String> mMetadata, String str3, String str4) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = enumC02880h;
        this.A05 = mDetectionStrings;
        this.A06 = mMetadata;
        this.A04 = str3;
        this.A02 = str4;
    }

    public static RI A00(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A01(58, 6, 57));
        String mMarkup = A01(0, 18, 13);
        String mRequestId = jSONObject.optString(mMarkup);
        String mActivationCommand = A01(72, 10, 98);
        String optString2 = jSONObject.optString(mActivationCommand);
        String mActivationCommand2 = A01(18, 2, 2);
        String A02 = LD.A02(jSONObject, mActivationCommand2);
        String mActivationCommand3 = A01(37, 21, 95);
        EnumC02880h A00 = EnumC02880h.A00(jSONObject.optString(mActivationCommand3));
        try {
            jSONArray = new JSONArray(jSONObject.optString(A01(20, 17, 58)));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        Collection<String> A01 = C02900j.A01(jSONArray);
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(64, 8, 34));
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (true) {
                boolean hasNext = keys.hasNext();
                if (A08[4].charAt(10) == 'n') {
                    String[] strArr = A08;
                    strArr[3] = "3Uh3uJOo";
                    strArr[1] = "LYOYANb7jIXToaEoAzTea1MWV";
                    if (!hasNext) {
                        break;
                    }
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.optString(next));
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return new RI(optString, mRequestId, A00, A01, hashMap, optString2, A02);
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02890i, com.facebook.ads.redexgen.X.InterfaceC02940n
    public final String A5j() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02890i
    public final Collection<String> A61() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02890i
    public final EnumC02880h A6Q() {
        return this.A00;
    }
}