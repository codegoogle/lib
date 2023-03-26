package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class R0 implements C0S {
    public static byte[] A06;
    public static String[] A07;
    public final R2 A00;
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<String> A03 = new AtomicReference<>();
    public final AtomicReference<EnumC02840d> A05 = new AtomicReference<>();
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A02 = new AtomicInteger(1);

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{5, 22, 13, 13, 6, 15, 60, 16, 6, 18};
        String[] strArr = A07;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
        strArr2[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
    }

    public static void A03() {
        A07 = new String[]{"nHMpSWMsnsV7ze4k7TMdpo8w7eAhh5yl", "NZIGXtqvLJqJvnsqDFZQPtZx", "Ad1TvQCscaWcF7stMWLl9lRlqQAvL", "Ujq4dS9mEeqxvShJwD8UISSMYbM", "6D9", "oL3lqgBhSNj2gXyheQdgS3kbnnn96fNg", "3X2AVVUyUAfxSvaFg1Rh03BQkiDduKF9", "x5OfLFoNyht1tsSSgvPC5bYcCNR"};
    }

    public R0(R2 r2) {
        this.A00 = r2;
    }

    public final void A04(C0U c0u, C0X... c0xArr) {
        if (KU.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0X c0x : c0xArr) {
                c0x.A02(jSONObject);
            }
            try {
                jSONObject.put(A01(0, 10, 60), this.A02.getAndIncrement());
            } catch (JSONException unused) {
            }
            C0Y.A0E.A06(this.A01).A02(jSONObject);
            String str = this.A04.get();
            if (!TextUtils.isEmpty(str)) {
                C0Y.A0P.A06(str).A02(jSONObject);
            }
            String str2 = this.A03.get();
            if (!TextUtils.isEmpty(str2)) {
                C0Y.A0O.A06(str2).A02(jSONObject);
            }
            EnumC02840d enumC02840d = this.A05.get();
            if (enumC02840d != null) {
                C0Y.A0D.A06(enumC02840d).A02(jSONObject);
            }
            this.A00.A00(c0u, jSONObject);
        } catch (Throwable th) {
            KU.A00(th, this);
            String[] strArr = A07;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "Ggy2RwA8vUf08bZktoWyq4zTcOxlTfhb";
            strArr2[0] = "Ggy2RwA8vUf08bZktoWyq4zTcOxlTfhb";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2R(String str, int i) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0R, C0Y.A0G.A06(Integer.valueOf(i)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2S(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0S, C0Y.A0K.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2T(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0T, C0Y.A0K.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2U(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0U, C0Y.A0K.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2V(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0V, C0Y.A0K.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2W(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0W, C0Y.A0K.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2X(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0X, C0Y.A0K.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Y() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0i, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Z() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0Y, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2a() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0v, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2b() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0w, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2c(boolean z) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0Z, C0Y.A02.A06(Boolean.valueOf(z)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2d(long j, int i, String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0x, C0Y.A0F.A06(Integer.valueOf(i)), C0Y.A0L.A06(str), C0Y.A0J.A06(Long.valueOf(j)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2e() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0z, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2f() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0y, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2g() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A10, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2h(long j) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A11, C0Y.A0J.A06(Long.valueOf(j)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2i(C0R c0r) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1c, C0Y.A01.A06(c0r));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2j(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A03.set(str);
            A04(C0U.A0a, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2k() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0b, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2l() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0c, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2m(long j, int i, String str, boolean z) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0d, C0Y.A0J.A06(Long.valueOf(j)), C0Y.A0F.A06(Integer.valueOf(i)), C0Y.A0L.A06(str), C0Y.A09.A06(Boolean.valueOf(z)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2n(long j) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0e, C0Y.A0J.A06(Long.valueOf(j)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2o(boolean z) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A18, C0Y.A0C.A06(Boolean.valueOf(z)));
        } catch (Throwable th) {
            String[] strArr = A07;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            strArr2[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2p() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A19, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2q() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1C, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2r(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1D, C0Y.A0L.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2s() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1E, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2t() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1F, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2u() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1G, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2v(int i) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1H, C0Y.A0G.A06(Integer.valueOf(i)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2w() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1I, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2x() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1L, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2y() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1J, new C0X[0]);
        } catch (Throwable th) {
            if (A07[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            strArr[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2z(int i) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1K, C0Y.A0G.A06(Integer.valueOf(i)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A30() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1M, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A31(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1N, C0Y.A0M.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A32() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1O, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A33() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1P, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A34() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1Q, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A35() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1R, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A36(int i) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1S, C0Y.A0G.A06(Integer.valueOf(i)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A37() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1T, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A38(int i) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1U, C0Y.A0G.A06(Integer.valueOf(i)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A39() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1e, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
            if (A07[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
            strArr[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3A() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1f, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3B(C0R c0r) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1b, C0Y.A01.A06(c0r));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3C(int i) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1d, C0Y.A0H.A06(Integer.valueOf(i)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3D() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1g, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3v(long j) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0g, C0Y.A0J.A06(Long.valueOf(j)));
        } catch (Throwable th) {
            KU.A00(th, this);
            if (A07[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
            strArr[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3w(long j) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0h, C0Y.A0J.A06(Long.valueOf(j)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A41() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0j, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4V() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0k, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4W() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0o, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4X(boolean z) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0f, C0Y.A08.A06(Boolean.valueOf(z)));
        } catch (Throwable th) {
            if (A07[1].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            strArr[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4Y(int i, String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0p, C0Y.A0F.A06(Integer.valueOf(i)), C0Y.A0L.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4Z(boolean z) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0n, C0Y.A04.A06(Boolean.valueOf(z)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4a() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0r, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4b() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0s, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4c() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0t, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4d() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0u, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8Y(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A12, C0Y.A0L.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8Z(int i) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A13, C0Y.A0H.A06(Integer.valueOf(i)));
        } catch (Throwable th) {
            KU.A00(th, this);
            if (A07[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
            strArr[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8b() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A14, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
            if (A07[5].charAt(28) == 'u') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
            strArr[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ACB(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A16, C0Y.A0L.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ACC() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A17, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AD5(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A04.set(str);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AD7(EnumC02840d enumC02840d) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A05.set(enumC02840d);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADg() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1B, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADh() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1h, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADi() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1i, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADj() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1j, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADk() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1k, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADl(boolean z) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1l, C0Y.A03.A06(Boolean.valueOf(z)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADm() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1m, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADn() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1n, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADo(int i, @Nullable String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1o, C0Y.A0F.A06(Integer.valueOf(i)), C0Y.A0L.A06(str));
        } catch (Throwable th) {
            if (A07[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            strArr[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADp(boolean z) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1p, C0Y.A07.A06(Boolean.valueOf(z)));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADq() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1q, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADr(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1r, C0Y.A0L.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADs() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1s, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADt(int i) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1t, C0Y.A0I.A06(Integer.valueOf(i)));
        } catch (Throwable th) {
            String[] strArr = A07;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            strArr2[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADy(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1V, C0Y.A0L.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADz(String str) {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1W, C0Y.A0L.A06(str));
        } catch (Throwable th) {
            KU.A00(th, this);
            if (A07[1].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
            strArr[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final String getId() {
        if (KU.A02(this)) {
            return null;
        }
        try {
            return this.A01.toString();
        } catch (Throwable th) {
            KU.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void unregisterView() {
        if (KU.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1A, new C0X[0]);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}