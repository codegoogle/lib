package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import androidx.annotation.Nullable;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: assets/audience_network.dex */
public final class G2 implements InterfaceC0906Pm {
    public static byte[] A07;
    public static String[] A08;
    public static final String A09;
    public InterfaceC04838h A00;
    public Executor A01;
    public boolean A02;
    public C0911Pr A03;
    public final Q1 A06;
    public final InterfaceC0916Pw A05 = new G9();
    public Q2 A04 = new G1();

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, 30, 106, 119, 106, 28, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, ax5.a, 46, 45, 59, 58, 94, bx.W5, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 61, 60, 46, 69, 80, 22, 7, 7, 27, 30, 20, 22, 3, 30, 24, 25, 88, 15, 90, 0, 0, 0, 90, 17, 24, 5, 26, 90, 2, 5, 27, 18, 25, 20, 24, 19, 18, 19, 76, 20, 31, 22, 5, 4, 18, 3, 74, 34, 35, 49, 90, 79, 120, 110, 105, 119, 59, 54, 112, 59, 54, 114, 34, 41, 56, 59, 35, 62, 39};
    }

    public static void A0A() {
        A08 = new String[]{"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    }

    static {
        A0A();
        A09();
        A09 = InterfaceC0906Pm.class.getSimpleName();
    }

    public G2(C0911Pr c0911Pr, InterfaceC04838h interfaceC04838h, Executor executor) {
        A0B();
        this.A03 = c0911Pr;
        this.A06 = new G8() { // from class: com.facebook.ads.redexgen.X.4E
        };
        this.A01 = executor;
        this.A00 = interfaceC04838h;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A06.ABU(httpURLConnection);
            if (outputStream != null) {
                this.A06.ADx(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC0905Pl A01(AbstractC0918Py abstractC0918Py) throws C0919Pz {
        InterfaceC0905Pl g3;
        String A072 = A07(179, 7, 17);
        HttpURLConnection httpURLConnection = null;
        InterfaceC0905Pl interfaceC0905Pl = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC0918Py.A05());
                A0H(A082, abstractC0918Py);
                A0G(A082, abstractC0918Py);
                if (this.A04.A7f()) {
                    this.A04.A8E(A082, abstractC0918Py.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean pinKeys = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (pinKeys || z)) {
                    try {
                        Q3.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.A8G(A072, C04848i.A1e, new C04858j(e));
                    } catch (Exception e2) {
                        this.A00.A8G(A072, C04848i.A1d, new C04858j(e2));
                    }
                }
                if (A082.getDoOutput() && abstractC0918Py.A06() != null) {
                    A00(A082, abstractC0918Py.A06());
                }
                if (A082.getDoInput()) {
                    g3 = A06(A082);
                } else {
                    g3 = new G3(A082, null);
                }
                if (this.A04.A7f()) {
                    this.A04.A8F(g3);
                }
                A082.disconnect();
                return g3;
            } catch (Exception ee) {
                try {
                    interfaceC0905Pl = A05(null);
                    if (interfaceC0905Pl == null || interfaceC0905Pl.A74() <= 0) {
                        Exception e3 = new C0919Pz(ee, interfaceC0905Pl);
                        throw e3;
                    }
                    return interfaceC0905Pl;
                } catch (Exception unused) {
                    ee.printStackTrace();
                    if (interfaceC0905Pl != null && interfaceC0905Pl.A74() > 0) {
                        if (this.A04.A7f()) {
                            Q2 q2 = this.A04;
                            String[] strArr = A08;
                            if (strArr[0].charAt(28) == strArr[2].charAt(28)) {
                                Exception e4 = new RuntimeException();
                                throw e4;
                            }
                            String[] strArr2 = A08;
                            strArr2[1] = "yaq9HQ3M3BI";
                            strArr2[7] = "lkFDbfWlXmK";
                            q2.A8F(interfaceC0905Pl);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return interfaceC0905Pl;
                    }
                    Exception e5 = new C0919Pz(ee, interfaceC0905Pl);
                    throw e5;
                }
            }
        } finally {
            if (this.A04.A7f()) {
                this.A04.A8F(interfaceC0905Pl);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
        }
    }

    @Nullable
    private final InterfaceC0905Pl A02(AbstractC0918Py abstractC0918Py) {
        if (this.A03.A04()) {
            A0C(abstractC0918Py);
        }
        InterfaceC0905Pl interfaceC0905Pl = null;
        try {
            interfaceC0905Pl = A01(abstractC0918Py);
            return interfaceC0905Pl;
        } catch (C0919Pz e) {
            this.A06.A9Z(e);
            return interfaceC0905Pl;
        } catch (Exception e2) {
            this.A06.A9Z(new C0919Pz(e2, interfaceC0905Pl));
            return interfaceC0905Pl;
        }
    }

    @Nullable
    private final InterfaceC0905Pl A03(String str, Q0 q0, C0914Pu c0914Pu) {
        return A02(new G6(str, q0, c0914Pu));
    }

    @Nullable
    private final InterfaceC0905Pl A04(String str, String str2, byte[] bArr, C0914Pu c0914Pu) {
        return A02(new G5(str, null, str2, bArr, c0914Pu));
    }

    private final InterfaceC0905Pl A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                bArr = this.A06.AC4(inputStream);
            }
            G3 g3 = new G3(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return g3;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC0905Pl A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            inputStream = this.A06.ABT(httpURLConnection);
            if (inputStream != null) {
                bArr = this.A06.AC4(inputStream);
            }
            G3 g3 = new G3(httpURLConnection, bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return g3;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A06.ABS(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e);
        }
    }

    public static synchronized void A0B() {
        synchronized (G2.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC0918Py abstractC0918Py) {
        StringBuilder sb = new StringBuilder(A07(169, 10, 70));
        boolean equals = abstractC0918Py.A03().equals(EnumC0917Px.A06);
        String A072 = A07(41, 1, 33);
        if (equals && abstractC0918Py.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(abstractC0918Py.A06(), Charset.forName(A07(117, 5, 53))));
            sb.append(A072);
        }
        Map<String, String> A06 = abstractC0918Py.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 109));
        sb.append(abstractC0918Py.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(AbstractC0918Py abstractC0918Py, InterfaceC0907Pn interfaceC0907Pn) {
        this.A05.A5P(this, interfaceC0907Pn, this.A01).A4z(abstractC0918Py);
        if (this.A03.A04()) {
            A0C(abstractC0918Py);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 114) + i + A07(65, 1, 35) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC0907Pn interfaceC0907Pn, C0914Pu c0914Pu) {
        A0D(new G5(str, null, str2, bArr, c0914Pu), interfaceC0907Pn);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC0918Py abstractC0918Py) {
        Map<String, String> A06 = abstractC0918Py.A02().A06();
        InterfaceC0904Pk A05 = abstractC0918Py.A02().A05();
        for (String str : A06.keySet()) {
            String name = A06.get(str);
            httpURLConnection.setRequestProperty(str, name);
        }
        if (A05 != null) {
            Map<String, String> A5C = A05.A5C(this.A03.A03());
            for (String str2 : A5C.keySet()) {
                String value = A5C.get(str2);
                httpURLConnection.setRequestProperty(str2, value);
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC0918Py abstractC0918Py) throws IOException {
        C0914Pu A02 = abstractC0918Py.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A06.ABk(httpURLConnection, abstractC0918Py.A03(), abstractC0918Py.A04());
    }

    private final boolean A0I(Throwable th, long j, AbstractC0918Py abstractC0918Py) {
        C0914Pu A02 = abstractC0918Py.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.A04.A7f()) {
            this.A04.A7u(A07(67, 15, 35) + currentTimeMillis + A07(42, 7, 23) + A02.A00() + A07(49, 7, 109) + A02.A02());
        }
        if (this.A02) {
            return currentTimeMillis >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return currentTimeMillis >= A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0905Pl A0J(AbstractC0918Py abstractC0918Py) throws C0919Pz {
        long j;
        long j2;
        long endTimeMillis;
        InterfaceC0905Pl A01;
        long length;
        long startTime = System.currentTimeMillis();
        int A012 = abstractC0918Py.A02().A01();
        long A03 = abstractC0918Py.A02().A03();
        long currentTimeMillis = System.currentTimeMillis() + abstractC0918Py.A02().A04();
        for (int i = 0; i < A012; i++) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "w7CndVwumsN";
            strArr[7] = "Wx3tR5uVNB4";
            if (currentTimeMillis <= currentTimeMillis2) {
                break;
            }
            try {
                if (this.A04.A7f()) {
                    this.A04.A7u((i + 1) + A07(37, 4, 115) + A012 + A07(56, 9, 70) + abstractC0918Py.A05());
                }
                startTime = System.currentTimeMillis();
            } catch (C0919Pz e) {
                e = e;
                String[] strArr2 = A08;
                if (strArr2[1].length() == strArr2[7].length()) {
                    String[] strArr3 = A08;
                    strArr3[5] = "zjCcSqcqQCV1DKlppK5B8d9XgS0n";
                    strArr3[5] = "zjCcSqcqQCV1DKlppK5B8d9XgS0n";
                }
            }
            try {
                A01 = A01(abstractC0918Py);
            } catch (C0919Pz e2) {
                e = e2;
                if (A0I(e, startTime, abstractC0918Py)) {
                    int i2 = A012 - 1;
                    String[] strArr4 = A08;
                    if (strArr4[3].length() != strArr4[6].length()) {
                        String[] strArr5 = A08;
                        strArr5[5] = "5zGihRv0GXktBIsysHbk9bX5FynZ";
                        strArr5[5] = "5zGihRv0GXktBIsysHbk9bX5FynZ";
                        if (i < i2) {
                            continue;
                        }
                    } else {
                        String[] strArr6 = A08;
                        strArr6[5] = "fqIjKwbeYbDMXnQaOc49X5RkZCGi";
                        strArr6[5] = "fqIjKwbeYbDMXnQaOc49X5RkZCGi";
                        if (i < i2) {
                            continue;
                        }
                    }
                }
                boolean isRecoverable = this.A06.A9Z(e);
                if (isRecoverable) {
                    int i3 = A012 - 1;
                    if (A08[5].length() != 28) {
                        throw new RuntimeException();
                    }
                    String[] strArr7 = A08;
                    strArr7[1] = "l1qtzOEwA58";
                    strArr7[7] = "YwbiT1tGtPK";
                    if (i < i3) {
                        long j3 = 0;
                        if (A03 > 0) {
                            try {
                                Thread.sleep(A03);
                            } catch (InterruptedException e3) {
                                InterfaceC04838h interfaceC04838h = this.A00;
                                long currentTimeMillis3 = System.currentTimeMillis() - startTime;
                                if (abstractC0918Py.A04 != null) {
                                    int numTries = abstractC0918Py.A04.length;
                                    j3 = numTries;
                                }
                                interfaceC04838h.A89(startTime, currentTimeMillis3, 0L, j3, 0, e3);
                                throw e;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                InterfaceC0905Pl A00 = e.A00();
                InterfaceC04838h interfaceC04838h2 = this.A00;
                long currentTimeMillis4 = System.currentTimeMillis() - startTime;
                if (A00 != null) {
                    byte[] A5T = A00.A5T();
                    if (A08[4].length() == 10) {
                        throw new RuntimeException();
                    }
                    String[] strArr8 = A08;
                    strArr8[4] = "TEyoiCytVC1tTBwzPYE";
                    strArr8[4] = "TEyoiCytVC1tTBwzPYE";
                    if (A5T != null) {
                        j2 = A00.A5T().length;
                        if (abstractC0918Py.A04 != null) {
                            endTimeMillis = 0;
                        } else {
                            int numTries2 = abstractC0918Py.A04.length;
                            endTimeMillis = numTries2;
                        }
                        interfaceC04838h2.A89(startTime, currentTimeMillis4, j2, endTimeMillis, A00 != null ? 0 : A00.A74(), e);
                        throw e;
                    }
                }
                j2 = 0;
                if (abstractC0918Py.A04 != null) {
                }
                interfaceC04838h2.A89(startTime, currentTimeMillis4, j2, endTimeMillis, A00 != null ? 0 : A00.A74(), e);
                throw e;
            }
            if (A01 != null) {
                InterfaceC04838h interfaceC04838h3 = this.A00;
                long currentTimeMillis5 = System.currentTimeMillis() - startTime;
                long length2 = A01.A5T().length;
                if (abstractC0918Py.A04 == null) {
                    length = 0;
                } else {
                    length = abstractC0918Py.A04.length;
                    if (A08[5].length() == 28) {
                        String[] strArr9 = A08;
                        strArr9[5] = "MaIX15CFtbyRTCgSwX4E1qAS9DeU";
                        strArr9[5] = "MaIX15CFtbyRTCgSwX4E1qAS9DeU";
                    }
                }
                interfaceC04838h3.A89(startTime, currentTimeMillis5, length2, length, A01.A74(), null);
                return A01;
            }
            continue;
        }
        InterfaceC04838h interfaceC04838h4 = this.A00;
        long currentTimeMillis6 = System.currentTimeMillis() - startTime;
        if (abstractC0918Py.A04 == null) {
            j = 0;
        } else {
            int numTries3 = abstractC0918Py.A04.length;
            j = numTries3;
        }
        interfaceC04838h4.A89(startTime, currentTimeMillis6, 0L, j, 0, new TimeoutException(A07(82, 35, 27)));
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0906Pm
    @Nullable
    @Deprecated
    public final InterfaceC0905Pl ABc(String str, Map<String, String> map) {
        return A03(str, new Q0(map), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0906Pm
    @Nullable
    @Deprecated
    public final InterfaceC0905Pl ABd(String str, byte[] bArr) {
        return A04(str, A07(122, 47, 42), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0906Pm
    public final void ABe(String str, byte[] bArr, InterfaceC0907Pn interfaceC0907Pn) {
        A0F(str, A07(122, 47, 42), bArr, interfaceC0907Pn, this.A03.A00());
    }
}