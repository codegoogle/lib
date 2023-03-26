package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1248bE implements JE {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static JE A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1081Wi A00;
    public final C9O A01;
    public final JD A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121};
    }

    static {
        A03();
        A05 = C1248bE.class.getSimpleName();
        A06 = false;
    }

    public C1248bE(C1081Wi c1081Wi) {
        JC A00;
        this.A00 = c1081Wi;
        if (J9.A0T(c1081Wi)) {
            this.A01 = C9M.A00(c1081Wi);
            A00 = JI.A01(c1081Wi, this.A01);
        } else {
            C0575Cf A01 = C9M.A01(c1081Wi);
            A00 = JI.A00(c1081Wi, A01);
            this.A01 = A01;
        }
        this.A02 = new C1245bB(c1081Wi, A00);
        ExecutorC0800Lj.A08.execute(new C1246bC(this));
        A04(c1081Wi);
    }

    public static synchronized JE A01(C1081Wi c1081Wi) {
        JE je;
        synchronized (C1248bE.class) {
            if (A03 == null) {
                A03 = new C1248bE(c1081Wi);
            }
            je = A03;
        }
        return je;
    }

    public static synchronized void A04(C1081Wi c1081Wi) {
        synchronized (C1248bE.class) {
            if (A06) {
                return;
            }
            DynamicLoaderFactory.makeLoader(c1081Wi).getInitApi().onAdEventManagerCreated(c1081Wi);
            A06 = true;
        }
    }

    private void A05(JB jb) {
        if (!jb.A0B()) {
            String str = A05;
            Log.e(str, A02(7, 29, 24) + jb.A07() + A02(0, 7, 55));
            return;
        }
        this.A01.ADv(jb, new C1247bD(this, jb));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A7v(String str, Map<String, String> map) {
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A7y(String str, Map<String, String> map) {
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A7z(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A07).A06(JN.A0A(str, JK.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A80(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A08).A06(JN.A0A(str, JK.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A81(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A84(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A86(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A05).A02(JG.A0D).A06(JN.A0A(str, JK.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A87(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A05).A02(JG.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A88(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A05).A02(JG.A0H).A06(JN.A0A(str, JK.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8A(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A0G).A06(JN.A0A(str, JK.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8C(String str, Map<String, String> map, String str2, JF jf) {
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(jf).A02(JG.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8D(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A0I).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8H(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A01(JF.A04).A02(JG.A0K).A06(JN.A0A(str, JK.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8J(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A0F).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8K(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A05).A02(JG.A0L).A06(JN.A0A(str, JK.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8L(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A0P).A06(JN.A0A(str, JK.A0e)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8M(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A04).A02(JG.A0O).A06(JN.A0A(str, JK.A0f)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8N(String str, Map<String, String> map) {
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A05).A02(JG.A0Q).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void A8P(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new JA().A04(str).A00(this.A00.A05().A01()).A03(this.A00.A05().A02()).A05(map).A01(JF.A05).A02(JG.A0R).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.JE
    public final void ABf(String str) {
        new Q6(this.A00).execute(str);
    }
}