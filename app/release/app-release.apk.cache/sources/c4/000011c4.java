package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.yg1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class JO {
    public static byte[] A00;
    public static final String A01;
    public static final AtomicBoolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{57, 43, 89, 112, -126, 43, -127, 108, 119, g15.b, 112, 69, 43, 96, 111, 92, -127, 118, -123, 120, g15.b, 120, -127, -121, 124, -127, 122, 51, 118, -126, -120, -127, -121, 120, -123, 77, 51, 125, -96, -108, -110, -99, 116, -96, -90, -97, -91, -106, -93, -92, -54, -21, -16, -100, -27, -22, -27, -16, -27, -35, -24, -27, -10, bx.j7, -32, -99, 116, 119, 119, 124, -121, 124, -126, -127, 116, g15.c, 114, 124, -127, 121, -126, -43, -24, -24, bx.l7, bx.j7, -28, -24, -111, -113, -93, -107, -106, -94, -115, -109, -90, -111, -109, -98, -94, -105, -99, -100, -46, -34, -36, -99, -43, -48, -46, -44, -47, -34, -34, -38, -99, -48, -45, -30, -99, -69, -66, -78, -80, -69, -50, -78, -66, -60, -67, -61, -76, -63, -62, -103, -106, -87, -106, -42, -25, -42, -33, -27, -28, -49, -46, -58, -60, -49, -62, -58, -46, -40, -47, -41, -56, -43, -42, -121, 120, -112, -125, -122, 120, 123, -95, -94, -113, -111, -103, -94, -96, -113, -111, -109, -124, -122, 115, -123, -118, -127, 118, -37, -35, -54, -36, bx.j7, -40, -51, -57, -53, -41, -52, -51};
    }

    static {
        A02();
        A01 = JO.class.getSimpleName();
        A02 = new AtomicBoolean();
    }

    public static void A03(C8H c8h) {
        if (A09(c8h) || A02.getAndSet(true)) {
            return;
        }
        ExecutorC0800Lj.A06.execute(new C1250bG(c8h));
    }

    public static void A04(C8H c8h, InterfaceC0906Pm interfaceC0906Pm, Map<String, ?> map) throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put(A01(81, 7, 109), A01(13, 1, 41));
        A07(c8h, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(A01(176, 7, 10), A01(145, 14, 92));
        hashMap2.put(A01(yg1.D, 12, 97), String.valueOf((int) IronSourceConstants.BN_AUCTION_FAILED));
        hashMap2.put(A01(88, 16, 39), A01(14, 1, 55));
        hashMap2.put(A01(166, 10, 39), A01(37, 13, 42));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        hashMap2.put(A01(66, 15, 12), jSONObject.toString());
        A07(c8h, hashMap2);
        AnonymousClass97 A05 = c8h.A05();
        JSONObject A052 = C04868k.A05(new C04888m(A05.A01(), A05.A02(), hashMap2));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(A052);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject eventsJSON = new JSONObject(hashMap);
        jSONObject2.put(A01(WKSRecord.Service.LOC_SRV, 4, 46), eventsJSON);
        jSONObject2.put(A01(WKSRecord.Service.NETBIOS_SSN, 6, 106), jSONArray);
        Q0 q0 = new Q0();
        q0.put(A01(159, 7, 16), jSONObject2.toString());
        interfaceC0906Pm.ABe(c8h.A03().A6H(), q0.A09(), new C1251bH());
    }

    public static void A06(C8H c8h, String str) {
        if (A09(c8h)) {
            return;
        }
        if (!A02.get()) {
            c8h.A04().A8G(A01(145, 14, 92), IronSourceConstants.BN_AUCTION_SUCCESS, new C04858j(A01(50, 16, 117)));
            return;
        }
        synchronized (JO.class) {
            SharedPreferences sharedPreferences = c8h.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(104, 31, 104), c8h), 0);
            int i = sharedPreferences.getInt(str, 0) + 1;
            sharedPreferences.edit().putInt(str, i).apply();
            if (BuildConfigApi.isDebug()) {
                String str2 = A01(15, 22, 12) + str + A01(0, 13, 4) + i;
            }
        }
    }

    public static void A07(C8H c8h, Map<String, String> map) {
        Map<String, String> dataMap = c8h.A02().A4S();
        map.putAll(dataMap);
    }

    @VisibleForTesting
    public static boolean A08(double d, int i) {
        return i <= 0 || d >= 1.0d / ((double) i);
    }

    public static boolean A09(C8H c8h) {
        if (BuildConfigApi.isDebug()) {
            return false;
        }
        if (!J9.A0U(c8h)) {
            return true;
        }
        return A08(c8h.A05().A00(), J9.A0C(c8h));
    }
}