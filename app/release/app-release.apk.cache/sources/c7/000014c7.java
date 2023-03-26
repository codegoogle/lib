package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Vz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1072Vz implements InterfaceC04486p<String> {
    public static byte[] A02;
    public static String[] A03;
    public static final String A04;
    public final String A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        String[] strArr = A03;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "kBylwnmSfcelW07O9B";
        strArr2[6] = "kBylwnmSfcelW07O9B";
        A02 = new byte[]{86, 97, 97, 124, 97, 51, 117, 118, 103, 112, 123, 122, 125, 116, 51, 64, 106, 96, 103, 118, 126, 51, 67, 97, 124, 99, 118, 97, 103, 106, 112, 113, 106, 97, 120, 113, 107, 112, 122};
    }

    public static void A04() {
        A03 = new String[]{"2Ak12k3KxlDre9BMfcQZJm1fVAEd6Tgf", "y4tPrpxAohrbTAcrGFRil83jmLq5oYH4", "e1svbR4LjnL9Uq0", "fjsFD3QQ6IDqIywrJIHqXmb1Bv2DWOX8", "ZSEXe", "1cuzbVcJHyn9kOUsdImxi6RVnab7", "gZujDznUETD0P37Bbl", "6v0D04DrfcPbr3xPrMqOit1DxHvgs0fP"};
    }

    static {
        A04();
        A03();
        A04 = C1072Vz.class.getSimpleName();
    }

    public C1072Vz(String str) {
        this.A00 = str;
        this.A01 = A01(str);
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static String A01(String ret) {
        Method method;
        Method method2;
        String A00 = A00(30, 9, 121);
        try {
            Object[] params = {ret};
            if (W0.A01 == null) {
                return A00;
            }
            method = W0.A02;
            if (method == null) {
                return A00;
            }
            method2 = W0.A02;
            A00 = (String) method2.invoke(W0.A01, params);
            return A00;
        } catch (Exception e) {
            String str = A04;
            if (A03[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "oXiwA6B1oi6grML0rznkDv7zegE0";
            strArr[3] = "MpkqXegYf54bz8gSrJrjZ1BXYdnwAcLG";
            Log.e(str, A00(0, 30, 84), e);
            return A00;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04486p
    /* renamed from: A02 */
    public final JSONObject ADW(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04486p
    public final boolean A7a(Object obj) {
        C1072Vz c1072Vz = (C1072Vz) obj;
        return this.A00.equals(c1072Vz.A00) && this.A01.equals(c1072Vz.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04486p
    public final int ADC() {
        return this.A00.getBytes().length + this.A01.getBytes().length;
    }
}