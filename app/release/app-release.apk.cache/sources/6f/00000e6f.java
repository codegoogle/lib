package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Locale;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.4w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04044w implements AdViewApi {
    public static byte[] A0D;
    public static String[] A0E;
    public long A00;
    @Nullable
    public View A01;
    @Nullable
    public AdListener A02;
    @Nullable
    public C0638Eu A03;
    public NS A04;
    @Nullable
    public String A05;
    @Nullable
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final C0591Cv A0A;
    public final EnumC0759Jr A0B;
    public final String A0C;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-75, -29, -25, -72, -29, -76, -71, -74, 122, 121, 122, 125, 120, -90, -90, 123, -11, 33, -11, -16, 33, -14, 32, -9, -28, -28, -32, 15, 16, 16, 16, -32, -14, 17, 30, 30, 21, 34, -48, 17, 20, -48, 20, 21, 35, 36, 34, 31, 41, 21, 20, -119, -88, -75, -75, -84, -71, 103, -88, -85, 103, -77, -74, -88, -85, 103, -71, -84, -72, -68, -84, -70, -69, -84, -85, -107, -77, -64, -64, -63, -58, 114, -72, -69, -64, -74, 114, -77, 114, -58, -73, -65, -62, -66, -77, -58, -73, 114, -58, -70, -77, -58, 114, -66, -63, -77, -74, 114, -76, -69, -74, 114, 121, 119, -59, 121, -23, -20, -37, -15, 2, -19, -48, -47, -33, -32, -34, -37, -27, -57, -54, -68, -65, -100, -65, 32, 35, 21, 24, -11, 24, -6, 38, 35, 33, -10, 29, 24};
        if (A0E[2].charAt(11) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[7] = "i0zr3oWhaZ1ZQYjulO9yltnfKtDweGPM";
        strArr[6] = "f16HnFk6V4WfoRTY4RGQrwGHYb77b2mz";
        A0D = bArr;
    }

    public static void A03() {
        A0E = new String[]{"of0bzA7MwNGTia9F31tAkieNA09H6OOQ", "TyTQj7xFBxvma6AaZ1TUwVS6lItsexiQ", "kN9yyhhGlFuDqh5wulKzoOOSsFZblOVu", "DXKKP4SSVuW5x9unPZpKCS00jdGSX4q", "ceBkREnsnDPWKQGMERGG6oDocc2kf8dJ", "ULZujO58Hn4sCnlurEwExiI5FfKtYml", "oBzM86F4GMvLYp6iWCqbmyfPVfF4ncm8", "8s2Qgj6JQYkd4IbFNTxV1lfTN5yJUxqm"};
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public C04044w(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = EnumC0759Jr.A02(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = AnonymousClass57.A06(context);
            this.A0A.A0A().A2j(AdPlacementType.BANNER.toString());
            C03171k c03171k = new C03171k(str, C0762Ju.A02(this.A0B), AdPlacementType.BANNER, EnumC0759Jr.A02(adSize), 1);
            c03171k.A05(this.A05);
            c03171k.A06(this.A06);
            this.A03 = new C0638Eu(this.A0A, c03171k);
            this.A03.A0R(new C0991Sw(this));
            return;
        }
        throw new IllegalArgumentException(A01(116, 6, 72));
    }

    @SuppressLint({"ConstructorMayLeakThis"})
    public C04044w(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws C0756Jn {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0A().A3d();
    }

    public static AdSize A00(String str) throws C0756Jn {
        EnumC0760Js A00 = C0765Jx.A00(str);
        if (A00 != null) {
            C0765Jx.A04(A00);
            return C0762Ju.A00(A00);
        }
        throw new C0756Jn(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(75, 41, 18), str));
    }

    private void A04(@Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0A().A2g();
        } else {
            this.A0A.A0A().A2f();
        }
        C0638Eu c0638Eu = this.A03;
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "8EJDtH9EjlwutgZO3WtzB3nx702AY4O";
        strArr2[5] = "dTiKD7UwUCw1SvcKYJrEphBgoR9CLtC";
        if (c0638Eu != null) {
            c0638Eu.A0T(str);
        }
        this.A0A.A0A().A2e();
    }

    public final long A05() {
        return this.A00;
    }

    public final DisplayMetrics A06() {
        return this.A07;
    }

    @Nullable
    public final AdListener A07() {
        return this.A02;
    }

    public final AdView A08() {
        return this.A08;
    }

    @Nullable
    public final C0638Eu A09() {
        return this.A03;
    }

    public final C0591Cv A0A() {
        return this.A0A;
    }

    public final EnumC0759Jr A0B() {
        return this.A0B;
    }

    public final void A0C(RelativeLayout relativeLayout, View view) {
        OV A01;
        this.A0A.A0A().A3q(this.A06 != null);
        String str = this.A06;
        if (str != null && (A01 = OU.A01(this.A0A, str)) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(A01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0D(NS ns) {
        this.A04 = ns;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new JP(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        K0.A05(A01(122, 7, 44), A01(32, 19, 112), A01(16, 8, 127));
        this.A0A.A0A().A2k();
        C0638Eu c0638Eu = this.A03;
        if (c0638Eu != null) {
            c0638Eu.A0W(true);
            this.A03 = null;
        }
        if (Build.VERSION.SDK_INT >= 18 && this.A04 != null && J8.A0q(this.A08.getContext())) {
            NS ns = this.A04;
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[7] = "fmi4ltQko56R0Ot1hIU3uMuoiOam3SD1";
            strArr2[6] = "7H1g3sSDF1cZj7eOXlokIXc1uirRZwhG";
            ns.A08();
            View view = this.A01;
            if (view != null) {
                view.getOverlay().remove(this.A04);
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        C0638Eu c0638Eu = this.A03;
        boolean z = c0638Eu == null || c0638Eu.A0X();
        this.A0A.A0A().A4X(z);
        return z;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        K0.A05(A01(129, 6, 27), A01(51, 24, 7), A01(24, 8, 109));
        A04(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        K0.A05(A01(129, 6, 27), A01(51, 24, 7), A01(8, 8, 5));
        A04(((JP) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public final void loadAdFromBid(String str) {
        K0.A05(A01(WKSRecord.Service.LOC_SRV, 13, 116), A01(51, 24, 7), A01(0, 8, 65));
        A04(str);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        View view = this.A01;
        if (view != null) {
            C0762Ju.A04(this.A07, view, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void setAdListener(@Nullable AdListener adListener) {
        this.A0A.A0A().A2c(adListener != null);
        this.A02 = adListener;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
    }
}