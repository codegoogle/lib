package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.g15;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class G1 implements Q2 {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{18, 74, 16, 16, 16, 13, 101, 121, 121, 125, 13, g15.c, 72, 92, 88, 72, 94, 89, 13, 16, 16, 16, 124, 124, 124, 97, 9, 21, 21, 17, 97, 19, 36, 50, 49, 46, 47, 50, 36, 97, 124, 124, 124, 28, 48, 49, 43, 58, 49, 43, 101, 85, 87, 123, 122, 96, 113, 122, 96, 46, 52, 103, 80, 86, 80, 92, 67, 80, 21, 64, 71, 89, 15, 21, 36, 3, 22, 3, 2, 4, 77, 87};
    }

    public static void A02() {
        A01 = new String[]{"pV4qaXw6VxHe7sBZO1Jm7", "tYmmDZR", "QxtgKachTN194eYcwGU9LkTJFmNVHEQq", "xizWbh8OYfs2b3YS4RQSAfdZXrf", "ZGXkvbP8ihMVuHVBPcyrpbYPgwlZhzIP", "8ikrsMyeeixNpMm9GyoBY2XQC58AAuyp", "5oOpXt9UGuRFEd", "RP1a17xo5hy9tsnm95xYo1Dg0S3kboh6"};
    }

    private void A03(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                List<String> headers = map.get(str);
                for (String str2 : headers) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    String header = A00(1, 1, 79);
                    sb.append(header);
                    sb.append(str2);
                    String header2 = sb.toString();
                    A7u(header2);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q2
    public final boolean A7f() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.Q2
    public final void A7u(String str) {
        System.out.println(str);
    }

    @Override // com.facebook.ads.redexgen.X.Q2
    public final void A8E(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        A7u(A00(2, 20, 18));
        A7u(httpURLConnection.getRequestMethod() + A00(0, 1, 13) + httpURLConnection.getURL().toString());
        if (obj instanceof String) {
            A7u(A00(52, 9, 43) + ((String) obj));
        }
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        String[] strArr = A01;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "GaHF5freueg6l7URhKCrm47FqBCtqYBi";
        strArr2[5] = "OrzNjk0gyiryng1un1TYaQe8BXJyjneo";
        A03(requestProperties);
    }

    @Override // com.facebook.ads.redexgen.X.Q2
    public final void A8F(InterfaceC0905Pl interfaceC0905Pl) {
        if (interfaceC0905Pl != null) {
            A7u(A00(22, 21, 126));
            A7u(A00(61, 13, 10) + interfaceC0905Pl.getUrl());
            A7u(A00(74, 8, 72) + interfaceC0905Pl.A74());
            A03(interfaceC0905Pl.A6L());
            A7u(A00(43, 9, 96) + interfaceC0905Pl.A5U());
        }
    }
}