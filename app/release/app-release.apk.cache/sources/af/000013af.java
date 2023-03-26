package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class RQ extends AnonymousClass16 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{66, 64, 83, 78, 84, 82, 68, 77, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88, 90, 75, 88, 89, 67, 68, 77, 66, 93, 80, 81, 91, 107, 65, 70, 88};
    }

    public RQ(List<AnonymousClass19> list) {
        super(list);
    }

    public static RQ A01(JSONObject jSONObject, C1080Wh c1080Wh) {
        JSONArray optJSONArray = jSONObject.optJSONArray(A02(0, 8, 67));
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject adJSON = optJSONArray.getJSONObject(i);
                    if (i == 0) {
                        A04(c1080Wh, adJSON, jSONObject);
                    }
                    AnonymousClass19 adInfo = AnonymousClass19.A00(adJSON);
                    adInfo.A0I(adJSON);
                    arrayList.add(adInfo);
                } catch (JSONException e) {
                    c1080Wh.A04().A82(A02(20, 7, 72), C04848i.A1q, new C04858j(e));
                }
            }
        } else {
            AnonymousClass19 adInfo2 = AnonymousClass19.A00(jSONObject);
            adInfo2.A0I(jSONObject);
            arrayList.add(adInfo2);
        }
        RQ rq = new RQ(arrayList);
        rq.A0e(jSONObject);
        rq.A0c(A02(8, 12, 86));
        return rq;
    }

    public static void A04(C1080Wh c1080Wh, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> it = jSONObject2.keys();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(A02(27, 9, 86)) && !next.equals(A02(0, 8, 67)) && !jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass16
    public final int A0I() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass16
    public final int A0J() {
        return 0;
    }
}