package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class XE implements C0T {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ C8H A00;
    public final /* synthetic */ XG A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[1].length() == 17) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "QX0n3XV94OfUIkrY3aQ1mnz4DOZRMjum";
            strArr[3] = "ub6cBxCWynk8j8mrWTDov9XVsshwREvV";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{104, -81, -64, -90, -105, -58, -65, -65, -74, -67, 115, -94, -101, -101, -110, -103, 103, 77, -85, -70, -77, -77, -86, -79};
    }

    public static void A02() {
        A03 = new String[]{"FR0EinKvOwZW2VlEpgnoVwKXeBc9ct8J", "K05aYFgFk0t0", "VOug37Y7l3ssOOXSbUnGxFzsx4hRn8wv", "z2uzga85Ski18P7nLebJhENF02V63SxL", "vQZIRiGCHJjFTe4gMXvJZpLaPtvEk1p8", "auy2W0sk", "5Z", "2337kXImyPAg9HB"};
    }

    public XE(XG xg, C8H c8h) {
        this.A01 = xg;
        this.A00 = c8h;
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void A5B(C0U c0u, JSONObject jSONObject) {
        C04858j c04858j = new C04858j(A00(4, 6, 71));
        c04858j.A05(jSONObject);
        c04858j.A03(1);
        this.A00.A04().A82(A00(18, 6, 59), c0u.A02() + 4000, c04858j);
        if (BuildConfigApi.isDebug()) {
            String str = A00(10, 8, 35) + c0u + A00(0, 1, 54) + c0u.A02() + A00(1, 3, 124) + jSONObject.toString();
        }
    }
}