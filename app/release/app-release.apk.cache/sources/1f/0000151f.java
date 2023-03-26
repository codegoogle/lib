package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class XP implements JC {
    public static byte[] A02;
    public static String[] A03;
    public static final String A04;
    public C1081Wi A00;
    public XO A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{86, 16, 25, 4, 86, 19, 0, 19, 24, 2, ax5.a, 18, 86, 115, 32, 38, 48, 48, 54, 32, 32, 53, 38, ax5.a, ax5.a, bx.W5, 125, 32, 34, 3, 10, 3, 18, 3, 2, 70, 3, 16, 3, 8, 18, 21, 70, 3, 30, 5, 3, 3, 2, 3, 2, 70, 20, 3, 18, 20, 31, 70, 10, 15, Flags.CD, 15, 18, 72, 70, 37, 9, 19, 8, 18, 92, 70, 65, 102, 110, 107, 98, 99, 39, 115, 104, 39, 119, 102, 117, 116, 98, 39, 102, 105, 39, 98, 113, 98, 105, 115, 39, 110, 105, 39, 98, 113, 98, 105, 115, 116, 39, 102, 117, 117, 102, 126, 39, 97, 104, 117, 39, 99, 110, 116, 119, 102, 115, 100, 111, 39, 97, 102, 110, 107, 114, 117, 98, 41, 112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 70, 87, 68, 69, 83, 22, 87, 88, 22, 83, 64, 83, 88, 66, 22, 95, 88, 22, 83, 64, 83, 88, 66, 69, 22, 90, 95, 69, 66, 22, 65, 94, 83, 88, 22, 70, 68, 83, 70, 87, 68, 95, 88, 81, 22, 82, 95, 69, 70, 87, 66, 85, 94, 22, 70, 87, 79, 90, 89, 87, 82, 24, 7, 49, 38, 34, 49, 38, 116, 36, 38, 59, 55, 49, 39, 39, 49, 48, 116, 49, 34, 49, 58, 32, 29, 48, 116, 17, 39, 48, 52, 39, 48, 98, 48, 39, 54, 55, 48, 44, 39, 38, 98, 44, 45, 44, 111, 48, 39, 54, 48, 59, 35, 32, 46, 39, 98, 39, 48, 48, 45, 48, 98, 33, 45, 38, 39, 98, 88, 110, 121, 125, 110, 121, 43, 121, 110, g15.c, 126, 121, 101, 110, 111, 43, 121, 110, g15.c, 121, 114, 106, 105, 103, 110, 43, 110, 121, 121, 100, 121, 43, 104, 100, 111, 110, 43, 68, g15.c, 112, 115, 125, 116, 49, 101, 126, 49, 97, 112, 99, 98, 116, 49, 98, 116, 99, 103, 116, 99, 49, 99, 116, 98, 97, 126, g15.c, 98, 116, 49, 112, 101, 49, 97, 126, 98, 120, 101, 120, 126, g15.c, 49, 117, 121, 114, 115, 13, 30, 13, 6, 28, 27, 56, 59, ax5.a, bx.W5, 43, 44, 59, 115, 61, 49, 48, 56, 55, 57, 115, 59, 40, 59, 48, bx.W5, 115, 51, ax5.a, 57, 55, 61, 95, 92, 88, 77, 76, 75, 92, 102, 90, 86, 87, 95, 80, 94, 116, 121, 117, 98, 100, 104, 117, 99, 88, 99, 102, 115, 102, 101, 102, 116, 98, 60, 39, 35, 45, 38, 58, 33, 37, 43, 32, 17, 39, bx.W5, 32, 59, ax5.a, 49, 58, 39};
    }

    public static void A02() {
        A03 = new String[]{"T62Ry0cHQcXSDxKL7NhTV4RGJa1EK", "DJGQMadZkB17LVbr", "iOkG4K13Hjl0NUqXuJlVUejicjlk1nzW", "33srKXABt3KwFUuhEJwkq3ZAZBzDwUgt", "PLu8UfSRSTd2rcgSm6FUEhoaf9WcktnC", "1tfjOobuNxYUsDgE6aIuCnswgchDbiIE", "3cN0JgpVgSdwOhRQcWnO1AlK5DQJr2L6", "ilEunU5aQdATmqkKFrVV7R1hAU4VbdID"};
    }

    static {
        A02();
        A01();
        A04 = XP.class.getSimpleName();
    }

    public XP(C1081Wi c1081Wi, XO xo) {
        this.A00 = c1081Wi;
        this.A01 = xo;
    }

    private void A03(Set<String> set, Set<String> set2) {
        int A0B = this.A01.A0B(J9.A0G(this.A00), set, set2);
        if (A0B > 0) {
            InterfaceC04838h A042 = this.A00.A04();
            int i = C04848i.A0o;
            A042.A82(A00(405, 15, 79), i, new C04858j(A00(28, 44, 46) + A0B));
        }
    }

    @Override // com.facebook.ads.redexgen.X.JC
    @Nullable
    public final JSONObject A4G() {
        int A0F = J9.A0F(this.A00);
        List<JSONObject> A0C = this.A01.A0C(A0F);
        JSONObject jSONObject = new JSONObject();
        Iterator<JSONObject> it = A0C.iterator();
        while (true) {
            if (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String optString = next.optString(A00(aa.c.r, 5, 0));
                    String uuid = UUID.randomUUID().toString();
                    jSONObject.put(uuid, optString);
                    next.put(A00(aa.c.w, 8, 6), uuid);
                } catch (JSONException e) {
                    boolean isDebug = BuildConfigApi.isDebug();
                    if (A03[2].charAt(22) != 'j') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[7] = "eMFgGe3BwzjIEwfr0eq56CqWHHfmSWyD";
                    strArr[7] = "eMFgGe3BwzjIEwfr0eq56CqWHHfmSWyD";
                    if (isDebug) {
                        Log.e(A04, A00(WKSRecord.Service.INGRES_NET, 72, 126), e);
                    }
                }
            } else {
                JSONArray jSONArray = new JSONArray((Collection) A0C);
                if (J9.A0Q(this.A00)) {
                    int debugEventLimit = J9.A08(this.A00);
                    JSONArray A042 = C04868k.A04(this.A00, debugEventLimit);
                    if (A03[7].charAt(31) == 'D') {
                        String[] strArr2 = A03;
                        strArr2[3] = "31pn7rS79XEbH8v4aDva0zyRbLn9ex8z";
                        strArr2[6] = "3BqVDGT4msLu1Rtl2iVh8DraLvTqVCKW";
                        if (A042 != null && A042.length() > 0) {
                            jSONArray = C1249bF.A02(A042, jSONArray, A0F + debugEventLimit);
                        }
                    }
                }
                JSONObject jSONObject2 = null;
                try {
                    if (jSONArray.length() > 0) {
                        jSONObject2 = new JSONObject();
                        if (jSONObject.length() > 0) {
                            jSONObject2.put(A00(433, 6, 28), jSONObject);
                        }
                        jSONObject2.put(A00(357, 6, 32), jSONArray);
                    }
                    return jSONObject2;
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JC
    public final boolean A7g() {
        return this.A01.A0A() > 0;
    }

    @Override // com.facebook.ads.redexgen.X.JC
    public final void A8q() {
        C04868k.A0G(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.JC
    public final void A9J(JSONArray jSONArray) {
        int i = jSONArray.length();
        HashSet hashSet = new HashSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String string = jSONArray.getJSONObject(i2).getString(A00(aa.c.d, 2, 85));
                if (C04868k.A0J(string)) {
                    C04868k.A0E(string);
                } else {
                    hashSet.add(string);
                }
            } catch (JSONException e) {
                if (BuildConfigApi.isDebug()) {
                    Log.e(A04, A00(72, 62, 79), e);
                }
            }
        }
        A03(hashSet, new HashSet());
    }

    @Override // com.facebook.ads.redexgen.X.JC
    public final boolean A9L(JSONArray jSONArray) {
        String A00 = A00(27, 1, 70);
        boolean z = true;
        boolean A0Q = J9.A0Q(this.A00);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(A00(aa.c.d, 2, 85));
                String eventId = A00(363, 26, 22);
                if (eventId.equals(string)) {
                    String eventId2 = A00(389, 14, 113);
                    J8.A0M(this.A00).A1m(jSONObject.getString(eventId2));
                    DynamicLoaderFactory.makeLoader(this.A00).getInitApi().maybeAttachCrashListener(this.A00);
                } else {
                    String eventId3 = A00(353, 4, 94);
                    int i2 = jSONObject.getInt(eventId3);
                    if (i2 == 1) {
                        if (BuildConfigApi.isDebug()) {
                            StringBuilder sb = new StringBuilder();
                            String eventId4 = A00(206, 25, 28);
                            sb.append(eventId4);
                            sb.append(string);
                            String eventId5 = A00(13, 14, 27);
                            sb.append(eventId5);
                            sb.toString();
                        }
                        if (A0Q) {
                            C04868k.A0D(string);
                        }
                        hashSet.add(string);
                    } else {
                        String A002 = A00(0, 13, 62);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (BuildConfigApi.isDebug()) {
                                String str = A04;
                                StringBuilder sb2 = new StringBuilder();
                                String eventId6 = A00(272, 37, 67);
                                sb2.append(eventId6);
                                sb2.append(i2);
                                sb2.append(A002);
                                sb2.append(string);
                                sb2.append(A00);
                                String eventId7 = sb2.toString();
                                Log.e(str, eventId7);
                            }
                            if (C04868k.A0J(string)) {
                                C04868k.A0E(string);
                            } else {
                                hashSet2.add(string);
                            }
                            z = false;
                        } else if (i2 >= 2000 && i2 < 3000) {
                            if (BuildConfigApi.isDebug()) {
                                String str2 = A04;
                                StringBuilder sb3 = new StringBuilder();
                                String eventId8 = A00(231, 41, 10);
                                sb3.append(eventId8);
                                sb3.append(i2);
                                sb3.append(A002);
                                sb3.append(string);
                                sb3.append(A00);
                                String eventId9 = sb3.toString();
                                Log.e(str2, eventId9);
                            }
                            hashSet.add(string);
                            if (A0Q) {
                                C04868k.A0D(string);
                            }
                        }
                    }
                    C8I A01 = this.A00.A01();
                    C1081Wi c1081Wi = this.A00;
                    String eventId10 = jSONObject.toString();
                    A01.A7x(c1081Wi, eventId10);
                }
            } catch (JSONException e) {
                if (BuildConfigApi.isDebug()) {
                    String str3 = A04;
                    StringBuilder sb4 = new StringBuilder();
                    String eventId11 = A00(309, 44, 89);
                    sb4.append(eventId11);
                    sb4.append(i);
                    sb4.append(A00);
                    String eventId12 = sb4.toString();
                    Log.e(str3, eventId12, e);
                }
                z = false;
            }
        }
        A03(hashSet2, hashSet);
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.JC
    public final void AAg() {
        this.A01.A40();
        C04868k.A08(this.A00);
    }
}