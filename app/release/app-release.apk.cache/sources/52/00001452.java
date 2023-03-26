package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class U6 implements InterfaceC04486p<Integer> {
    public static byte[] A02;
    public final String A00;
    public final String A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-38, -80, -73, -78, -69, -77, 113, 12, -53};
    }

    public U6(Signature signature) throws CertificateException, NoSuchAlgorithmException {
        this.A00 = A01(signature, AnonymousClass75.A05);
        this.A01 = A01(signature, AnonymousClass75.A06);
    }

    public static String A01(Signature signature, AnonymousClass75 anonymousClass75) throws NoSuchAlgorithmException, CertificateException {
        return AnonymousClass76.A08(((X509Certificate) CertificateFactory.getInstance(A00(0, 5, 93)).generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getEncoded(), anonymousClass75);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04486p
    /* renamed from: A02 */
    public final JSONObject ADW(Integer num, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A00(5, 2, 27), this.A00);
        jSONObject2.put(A00(7, 2, 116), this.A01);
        jSONObject.put(Integer.toString(num.intValue()), jSONObject2);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04486p
    public final boolean A7a(Object obj) {
        String str;
        U6 u6 = (U6) obj;
        String str2 = this.A00;
        return str2 != null && str2.equals(u6.A00) && (str = this.A01) != null && str.equals(u6.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04486p
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int ADC() {
        String str = this.A01;
        int length = str != null ? str.length() : 0;
        String str2 = this.A00;
        return length + (str2 != null ? str2.length() : 0);
    }
}