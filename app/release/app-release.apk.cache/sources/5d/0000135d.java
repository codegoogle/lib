package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class Q6 extends AsyncTask<String, Void, Q7> {
    public static byte[] A05;
    public static String[] A06;
    public static final String A07;
    public static final Set<String> A08;
    public C8H A00;
    public InterfaceC0905Pl A01;
    public Q5 A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, 22, 22, Flags.CD, 22, 68, Flags.CD, 20, 1, 10, 13, 10, 3, 68, 17, 22, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    public static void A05() {
        A06 = new String[]{"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    }

    static {
        A05();
        A04();
        A07 = Q6.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 73));
        A08.add(A01(29, 4, 24));
    }

    public Q6(C8H c8h) {
        this(c8h, null, null);
    }

    public Q6(C8H c8h, Map<String, String> map) {
        this(c8h, map, null);
    }

    public Q6(C8H c8h, Map<String, String> map, Map<String, String> map2) {
        this.A00 = c8h;
        Map<String, String> postData = map != null ? new HashMap<>(map) : null;
        this.A03 = postData;
        Map<String, String> extraData = map2 != null ? new HashMap<>(map2) : null;
        this.A04 = extraData;
    }

    private final Q7 A00(String... strArr) {
        if (KU.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        String url = entry.getValue();
                        A02 = A03(A02, entry.getKey(), url);
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A07(A02)) {
                        return new Q7(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (Throwable th) {
            if (A06[6].length() != 31) {
                String[] strArr2 = A06;
                strArr2[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
                strArr2[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
                KU.A00(th, this);
                return null;
            }
            throw new RuntimeException();
        }
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), LD.A01(this.A00.A02().A5N()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 92);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 124);
        }
        return str + A01 + str2 + A01(2, 1, 100) + URLEncoder.encode(str3);
    }

    private final void A06(Q7 q7) {
        if (KU.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.ABq(q7);
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A07(String str) {
        InterfaceC0905Pl ABc;
        InterfaceC0906Pm A00 = Q4.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                ABc = A00.ABc(str, new Q0());
            } else {
                Q0 q0 = new Q0();
                q0.A06(this.A04);
                ABc = A00.ABd(str, q0.A09());
            }
            this.A01 = ABc;
        } catch (Exception e) {
            String str2 = A07;
            Log.e(str2, A01(4, 19, 62) + str, e);
        }
        InterfaceC0905Pl interfaceC0905Pl = this.A01;
        return interfaceC0905Pl != null && interfaceC0905Pl.A74() == 200;
    }

    public final void A08(Q5 q5) {
        this.A02 = q5;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Q7 doInBackground(String[] strArr) {
        if (KU.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            KU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        Q5 q5 = this.A02;
        if (q5 != null) {
            q5.ABo();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Q7 q7) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A06(q7);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            strArr[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            KU.A00(th, this);
        }
    }
}