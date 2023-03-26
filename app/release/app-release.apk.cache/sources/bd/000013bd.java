package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.xbill.DNS.WKSRecord;

@SuppressLint({"HardcodedIPAddressUse"})
/* renamed from: com.facebook.ads.redexgen.X.Re  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0950Re implements KE {
    public static byte[] A0E;
    public static String[] A0F;
    public static final Handler A0G;
    public static final C02990s A0H = null;
    @SuppressLint({"StaticFieldLeak"})
    public static final KF A0I = null;
    public static final String A0J;
    public View A00;
    @Nullable
    public InterfaceC02940n A01;
    public InterfaceC02940n A02;
    public AnonymousClass90 A05;
    public KC A06;
    public AbstractC02950o A07;
    public final C03171k A08;
    public final JE A09;
    public final C02990s A0A;
    public final KF A0B;
    public final C1080Wh A0C;
    public volatile boolean A0D;
    public long A04 = -1;
    @Nullable
    public String A03 = null;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{75, 110, 107, 122, 126, 111, 120, bx.W5, 110, 101, 111, 121, bx.W5, 100, 101, 126, bx.W5, 111, 114, 99, 121, 126, 78, 107, 110, g15.c, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 62, 25, 17, 20, 29, 28, 88, 12, 23, 88, 17, 22, 17, 12, 17, 25, 20, 17, 2, 29, 88, 59, 23, 23, 19, 17, 29, 53, 25, 22, 25, 31, 29, 10, 86, 34, 3, 76, 1, 3, 30, 9, 76, 13, 8, 76, 15, 13, 2, 8, 5, 8, 13, 24, 9, 31, 66, 88, 125, 96, 97, 104, 47, 110, 107, 110, g15.c, 123, 106, 125, 47, 123, 118, g15.c, 106, 33, bx.W5, 47, 107, bx.W5, 39, 57, 46, bx.W5, 47, 50, 107, 56, ax5.a, bx.W5, 57, ax5.a, 46, 47, 76, 93, 68, 44, 59, 91, 94, 75, 94, 49, 52, 33, 52, 10, 56, 58, 49, 48, 57, 10, 33, 44, 37, 48, 29, 28, 31, 16, 23, 16, 13, 16, 22, 23, 74, 65, 76, 93, 86, 95, 91, 74, 75, 112, 70, 75, 75, 64, 88, 71, 92, 65, 64, 67, 75, 64, 90, 14, 71, 93, 14, 75, 67, 94, 90, 87, 37, 49, 38, 50, 54, 38, 45, 32, 58, 28, 32, 34, 51, 51, bx.W5, 45, 36, 115, 112, 126, 123, 64, 107, 118, 114, 122, 64, 114, 108, 48, 44, 33, 35, 37, 45, 37, 46, 52, 9, 36, 7, 16, 4, 0, 16, 6, 1, 33, 28, 24, 16, 20, 3, 23, 19, 3, 21, 18, 57, 15, 2};
    }

    public static void A0B() {
        A0F = new String[]{"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    }

    public abstract void A0N();

    public abstract void A0Q(InterfaceC02940n interfaceC02940n, AnonymousClass90 anonymousClass90, C05008y c05008y, Map<String, Object> map);

    static {
        A0B();
        A0A();
        C0797Lg.A02();
        A0J = AbstractC0950Re.class.getSimpleName();
        A0G = new Handler(Looper.getMainLooper());
    }

    public AbstractC0950Re(C1080Wh c1080Wh, C03171k c03171k) {
        this.A0C = c1080Wh;
        this.A08 = c03171k;
        KF kf = A0I;
        if (kf != null) {
            this.A0B = kf;
        } else {
            this.A0B = new KF(this.A0C);
        }
        this.A0B.A0R(this);
        C02990s c02990s = A0H;
        if (c02990s != null) {
            this.A0A = c02990s;
        } else {
            this.A0A = new C02990s();
        }
        try {
            CookieManager.getInstance();
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(this.A0C);
            }
        } catch (Exception e) {
            Log.w(A0J, A08(48, 35, 112), e);
        }
        DynamicLoaderFactory.makeLoader(this.A0C).getInitApi().onAdLoadInvoked(this.A0C);
        this.A09 = c1080Wh.A06();
        this.A0C.A0A().A4W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        this.A01 = null;
        AnonymousClass90 anonymousClass90 = this.A05;
        C05008y A04 = anonymousClass90.A04();
        String A08 = A08(0, 0, 73);
        if (A04 == null) {
            C0755Jm error = C0755Jm.A02(AdErrorType.NO_FILL, A08);
            this.A0C.A0A().A4Y(error.A04().getErrorCode(), A08(83, 22, 100));
            this.A07.A0F(error);
            return;
        }
        String A03 = A04.A03();
        InterfaceC02940n A00 = this.A0A.A00(anonymousClass90.A05().A0D());
        if (A00 == null) {
            this.A0C.A04().A82(A08(WKSRecord.Service.BL_IDM, 3, 37), C04848i.A0P, new C04858j(A08(0, 22, 2), A03));
            A0O();
            return;
        }
        AdPlacementType adapterType = this.A08.A00();
        if (adapterType != A00.A6i()) {
            C0755Jm error2 = C0755Jm.A02(AdErrorType.INTERNAL_ERROR, A08);
            this.A0C.A0A().A4Y(error2.A04().getErrorCode(), A08(105, 19, 7));
            this.A07.A0F(error2);
            return;
        }
        this.A01 = A00;
        AnonymousClass91 A05 = anonymousClass90.A05();
        JSONObject A06 = A04.A06();
        if (A06 != null) {
            String[] strArr = A0F;
            if (strArr[0].charAt(1) == strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[4] = "xCRhnlDAhS4MFpckcT";
            strArr2[1] = "gHgyVSON2W8zeI";
            String optString = A06.optString(A08(259, 10, 110));
            this.A0C.A0A().AD5(optString);
            this.A0C.A08(optString);
            C1081Wi sdkContext = C8G.A00();
            if (sdkContext != null) {
                sdkContext.A08(optString);
            }
            if (A0F[2].charAt(5) != 'Z') {
                String[] strArr3 = A0F;
                strArr3[6] = "8Wq26Ceqv565ijof1GdoYggHtr98JF3l";
                strArr3[6] = "8Wq26Ceqv565ijof1GdoYggHtr98JF3l";
                A0E(A06.optJSONObject(A08(208, 17, 28)));
            } else {
                String[] strArr4 = A0F;
                strArr4[4] = "ECm89W61U2RjXtlAFB";
                strArr4[1] = "vfVrRI5o8HJ5sJ";
                String errorMessage = A08(208, 17, 75);
                A0E(A06.optJSONObject(errorMessage));
            }
        }
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put(A08(147, 4, 55), A06);
        hashMap.put(A08(166, 10, 113), A05);
        hashMap.put(A08(237, 11, 72), this.A08.A08);
        hashMap.put(A08(248, 11, 125), Long.valueOf(A05.A0C()));
        hashMap.put(A08(151, 15, 93), A04.A04());
        if (this.A06 == null) {
            String A082 = A08(188, 20, 38);
            C0755Jm A02 = C0755Jm.A02(AdErrorType.UNKNOWN_ERROR, A082);
            this.A0C.A0A().A4Y(A02.A04().getErrorCode(), A082);
            this.A07.A0F(A02);
            return;
        }
        A0Q(A00, anonymousClass90, A04, hashMap);
    }

    private final void A0D(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        this.A0C.A0A().A4Z(str != null);
        this.A04 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            A9X(new C0755Jm(AdErrorType.API_NOT_SUPPORTED, A08(0, 0, 73)));
            return;
        }
        try {
            this.A06 = this.A08.A01(this.A0C, new C0765Jx(this.A0C, str, this.A08.A08, this.A08.A07), adExperienceType);
            if (A0F[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0B.A0Q(this.A06);
        } catch (C0756Jn e) {
            A9X(C0755Jm.A03(e));
        }
    }

    private void A0E(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A03 = jSONObject.optString(A08(176, 12, 39));
            C03010u.A0H(jSONObject);
        }
    }

    public final long A0F() {
        AnonymousClass90 anonymousClass90 = this.A05;
        if (anonymousClass90 != null) {
            return anonymousClass90.A03();
        }
        return -1L;
    }

    public final Handler A0G() {
        return A0G;
    }

    public final AnonymousClass91 A0H() {
        AnonymousClass90 anonymousClass90 = this.A05;
        if (anonymousClass90 == null) {
            return null;
        }
        return anonymousClass90.A05();
    }

    @Nullable
    public final String A0I() {
        InterfaceC02940n interfaceC02940n = this.A02;
        if (interfaceC02940n == null) {
            return null;
        }
        return interfaceC02940n.A5j();
    }

    public final void A0J() {
        this.A0C.A0A().A2h(LW.A01(this.A04));
        if (this.A02 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(225, 12, 23), LW.A04(this.A04));
        new JL(this.A02.A5j(), this.A09).A03(JK.A08, hashMap);
    }

    public final void A0K() {
        InterfaceC02940n interfaceC02940n = this.A02;
        String A08 = A08(WKSRecord.Service.BL_IDM, 3, 37);
        if (interfaceC02940n == null) {
            String A082 = A08(22, 26, 7);
            this.A0C.A04().A82(A08, C04848i.A0F, new C04858j(A082));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0C.A0A().A4Y(adErrorType.getErrorCode(), A082);
            this.A07.A0F(C0755Jm.A02(adErrorType, adErrorType.getDefaultErrorMessage()));
            this.A0C.A0A().A4b();
        } else if (this.A0D) {
            String A083 = A08(124, 18, 67);
            this.A0C.A04().A82(A08, C04848i.A0C, new C04858j(A083));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0C.A0A().A4Y(adErrorType2.getErrorCode(), A083);
            this.A07.A0F(C0755Jm.A02(adErrorType2, adErrorType2.getDefaultErrorMessage()));
            this.A0C.A0A().A4a();
        } else {
            if (!TextUtils.isEmpty(this.A02.A5j())) {
                this.A09.A8H(this.A02.A5j());
            }
            this.A0C.A0A().A4c();
            this.A0D = true;
            A0N();
        }
    }

    public final void A0L() {
        A0W(false);
    }

    public final void A0M() {
        String str = this.A03;
        if (str != null) {
            C03010u.A0E(str);
        }
    }

    public final synchronized void A0O() {
        A0G.post(new C0948Rc(this));
    }

    public final void A0P(InterfaceC02940n interfaceC02940n) {
        if (interfaceC02940n != null) {
            interfaceC02940n.onDestroy();
        }
    }

    public final void A0R(AbstractC02950o abstractC02950o) {
        this.A07 = abstractC02950o;
    }

    public void A0S(@Nullable String str) {
        A0D(str, null);
    }

    public final void A0T(@Nullable String str) {
        A0S(str);
    }

    public final void A0U(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        A0D(str, adExperienceType);
    }

    public final void A0V(Map<String, Object> map) {
        this.A0C.A0A().A4V();
        Object obj = map.get(A08(147, 4, 55));
        if (obj instanceof JSONObject) {
            String optString = ((JSONObject) obj).optString(A08(145, 2, 71));
            if (!TextUtils.isEmpty(optString)) {
                new JL(optString, this.A09).A03(JK.A04, null);
            }
        }
    }

    public final void A0W(boolean z) {
        if (!z && !this.A0D) {
            return;
        }
        this.A0C.A0A().A4d();
        A0P(this.A02);
        this.A00 = null;
        this.A0D = false;
    }

    public final boolean A0X() {
        AnonymousClass90 anonymousClass90 = this.A05;
        return anonymousClass90 == null || anonymousClass90.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.KE
    public final synchronized void A9X(C0755Jm c0755Jm) {
        A0G().post(new C0949Rd(this, c0755Jm));
    }

    @Override // com.facebook.ads.redexgen.X.KE
    public final synchronized void AB3(C1204aV c1204aV) {
        A0G().post(new C0947Rb(this, c1204aV));
    }
}