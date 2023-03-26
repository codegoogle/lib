package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class OD {
    public static byte[] A05;
    public final O7 A00;
    public final String A01;
    public final String A02;
    public final WeakReference<JE> A03;
    public final WeakReference<C0924Qe> A04;

    static {
        A08();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A05 = new byte[]{-52, -8, -2, -11, -19, -87, -9, -8, -3, -87, -7, -22, -5, -4, -18, -87, -4, -18, -5, -1, -18, -5, -87, -10, -18, -4, -4, -22, -16, -18, 14, 59, 59, 56, 59, -23, 57, bx.W5, 59, 60, 50, 55, 48, -23, 19, 28, 24, 23, -23, 50, 55, -23, 57, 56, 60, 61, 22, 46, 60, 60, bx.W5, 48, 46, -23, 7, 27, 26, 14, -15, Flags.CD, 31, 62, 74, 72, 72, 60, 73, ax5.a, -30, -11, -15, -17, -34, -36, bx.j7, -34, -15, -34, 12, 27, 20, 20, Flags.CD, 18, 5, 26, 31, 22, Flags.CD, -23, -18, -27, -38};
    }

    public OD(C0924Qe c0924Qe, JE je, O7 o7, String str, String str2) {
        this.A04 = new WeakReference<>(c0924Qe);
        this.A03 = new WeakReference<>(je);
        this.A00 = o7;
        this.A01 = str;
        this.A02 = str2;
    }

    public static Map<String, String> A01(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A02() {
        C0924Qe c0924Qe = this.A04.get();
        if (c0924Qe == null) {
            return;
        }
        c0924Qe.A0M();
    }

    private void A03() {
        C0924Qe c0924Qe = this.A04.get();
        if (c0924Qe == null) {
            return;
        }
        c0924Qe.A0N();
    }

    private void A04() {
        C0924Qe c0924Qe = this.A04.get();
        if (c0924Qe == null) {
            return;
        }
        c0924Qe.A0O();
    }

    private void A05() {
        C0924Qe c0924Qe = this.A04.get();
        if (c0924Qe == null) {
            return;
        }
        c0924Qe.A0Q();
    }

    private void A06() {
        C0924Qe c0924Qe = this.A04.get();
        if (c0924Qe == null) {
            return;
        }
        c0924Qe.A0R();
    }

    private void A07() {
        C0924Qe c0924Qe = this.A04.get();
        if (c0924Qe == null) {
            return;
        }
        c0924Qe.A0S();
    }

    private void A09(OC oc, String str) throws JSONException {
        switch (OB.A00[oc.ordinal()]) {
            case 1:
                A0A(new JSONObject(str));
                return;
            case 2:
                A06();
                return;
            case 3:
                A02();
                return;
            case 4:
                A04();
                return;
            case 5:
                A03();
                return;
            case 6:
                A07();
                return;
            case 7:
                A0B(new JSONObject(str));
                return;
            case 8:
                A0C(new JSONObject(str));
                return;
            case 9:
                if (BuildConfigApi.isDebug()) {
                }
                return;
            case 10:
                A05();
                return;
            default:
                return;
        }
    }

    private void A0A(JSONObject jSONObject) {
        C0924Qe c0924Qe = this.A04.get();
        if (c0924Qe == null) {
            return;
        }
        String optString = jSONObject.optString(A00(71, 7, 103));
        if (TextUtils.isEmpty(optString)) {
            c0924Qe.A0P();
        } else {
            c0924Qe.A0T(optString);
        }
    }

    private void A0B(JSONObject jSONObject) {
        C0924Qe c0924Qe = this.A04.get();
        if (c0924Qe == null) {
            return;
        }
        c0924Qe.A0U(A01(jSONObject));
    }

    private void A0C(JSONObject jSONObject) {
        JE je = this.A03.get();
        if (je == null) {
            return;
        }
        String optString = jSONObject.optString(A00(88, 11, 50));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new JL(this.A02, je).A04(optString, A01(jSONObject));
    }

    @JavascriptInterface
    public void postMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!this.A01.equals(jSONObject.optString(A00(64, 7, 50)))) {
                this.A00.A05(C04848i.A0p, A00(0, 30, 21));
            } else {
                A09(OC.A00(jSONObject.optString(A00(99, 4, 1))), jSONObject.optString(A00(78, 10, 9)));
            }
        } catch (JSONException e) {
            O7 o7 = this.A00;
            int i = C04848i.A0r;
            o7.A05(i, A00(30, 34, 85) + e.getMessage());
        }
    }
}