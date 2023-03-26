package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.mirror.NativeViewabilityLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0750Jg implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C8H A00;
    public final /* synthetic */ C0753Jj A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, 27, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, 27, 45, 32};
    }

    public RunnableC0750Jg(C0753Jj c0753Jj, String str, C8H c8h) {
        this.A01 = c0753Jj;
        this.A02 = str;
        this.A00 = c8h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ArrayList<NativeViewabilityLogger.ViewabilityRecord> clone;
        List list2;
        List list3;
        int i;
        int i2;
        int i3;
        if (KU.A02(this)) {
            return;
        }
        try {
            C04858j c04858j = new C04858j(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                clone = new ArrayList<>(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator<NativeViewabilityLogger.ViewabilityRecord> it = clone.iterator();
            while (it.hasNext()) {
                C0752Ji c0752Ji = (C0752Ji) it.next();
                StringBuilder sb = new StringBuilder();
                sb.append(A00(0, 0, 60));
                i = c0752Ji.A00;
                sb.append(i);
                sb.append(';');
                i2 = c0752Ji.A02;
                sb.append(i2);
                sb.append(';');
                i3 = c0752Ji.A01;
                sb.append(i3);
                jSONArray.put(sb.toString());
            }
            c04858j.A05(jSONObject);
            c04858j.A03(1);
            this.A00.A04().A83(A00(10, 9, 82), C04848i.A23, c04858j);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}