package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class RB extends AbstractRunnableC0770Kc {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ String A00;

    static {
        A03();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {29, 41, 28, 40, 44, 28, 37, 26, 48, 22, 26, 24, 39, 39, 32, 37, 30};
        String[] strArr = A02;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "QkfkB";
        strArr2[5] = "QkfkB";
        A01 = bArr;
    }

    public static void A03() {
        A02 = new String[]{"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    }

    public RB(String str) {
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        boolean A0J;
        String A00 = A00(0, 17, 116);
        try {
            C03010u.A04.await();
            A0J = C03010u.A0J(this.A00);
            if (A0J) {
                ((C1K) C03010u.A00.A04().get(this.A00)).A04((int) (System.currentTimeMillis() / 1000));
                C03010u.A00.A07(this.A00);
                C03010u.A00.A05();
                C03010u.A0A();
            }
        } catch (InterruptedException e) {
            C03010u.A01.A04().A82(A00, C04848i.A0w, new C04858j(e));
        } catch (JSONException e2) {
            C03010u.A08();
            C03010u.A01.A04().A82(A00, C04848i.A0v, new C04858j(e2));
        }
    }
}