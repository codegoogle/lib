package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.EnumSet;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Rv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0967Rv implements InterfaceC03241r {
    public static byte[] A07;
    public static final String A08;
    public long A00 = -1;
    public C0637Et A01;
    public boolean A02;
    public boolean A03;
    public final C1080Wh A04;
    public final InterstitialAdExtendedListener A05;
    public final C03251s A06;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 110);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{-59, -14, -92, -27, -24, -92, -16, -13, -27, -24, -92, -19, -9, -92, -27, -16, -10, -23, -27, -24, -3, -92, -19, -14, -92, -12, -10, -13, -21, -10, -23, -9, -9, -78, -92, -35, -13, -7, -92, -9, -20, -13, -7, -16, -24, -92, -5, -27, -19, -8, -92, -22, -13, -10, -92, -27, -24, -48, -13, -27, -24, -23, -24, -84, -83, -92, -8, -13, -92, -26, -23, -92, -25, -27, -16, -16, -23, -24, -4, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -45, 31, 34, 20, 23, -45, 22, 20, 31, 31, 24, 23, -45, bx.W5, 27, 28, 31, 24, -45, 38, 27, 34, bx.W5, 28, 33, 26, -45, 28, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, bx.j7, 13, 28, 21};
    }

    static {
        A06();
        A08 = C0967Rv.class.getSimpleName();
    }

    public C0967Rv(C03251s c03251s, InterfaceC03321z interfaceC03321z, String str) {
        this.A06 = c03251s;
        this.A04 = c03251s.A05();
        this.A05 = new S4(str, interfaceC03321z, this);
    }

    public final long A09() {
        C0637Et c0637Et = this.A01;
        if (c0637Et != null) {
            return c0637Et.A0F();
        }
        return -1L;
    }

    public final void A0A() {
        C0637Et c0637Et = this.A01;
        if (c0637Et != null) {
            c0637Et.A0R(new C0966Ru(this));
            this.A01.A0W(true);
            this.A01 = null;
            this.A03 = false;
            this.A02 = false;
        }
    }

    public final void A0B(@Nullable EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A00 = System.currentTimeMillis();
        if (!this.A03 && this.A01 != null) {
            Log.w(A08, A05(0, 78, 22));
        }
        this.A03 = false;
        if (this.A02 && !J8.A0d(this.A04)) {
            this.A04.A04().A82(A05(WKSRecord.Service.CISCO_FNA, 3, 62), C04848i.A0B, new C04858j(A05(78, 52, 69)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A04.A0A().A2d(LW.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A05.onError(this.A06.A01(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        C0637Et c0637Et = this.A01;
        if (c0637Et != null) {
            c0637Et.A0R(new C0963Rr(this));
            this.A01.A0L();
            this.A01 = null;
        }
        C03171k c03171k = new C03171k(this.A06.A09(), C0762Ju.A01(this.A04.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, EnumC0759Jr.A08, 1, enumSet);
        c03171k.A05(this.A06.A07());
        c03171k.A06(this.A06.A08());
        c03171k.A03(this.A06.A03());
        this.A01 = new C0637Et(this.A04, c03171k);
        this.A01.A0R(new C0965Rt(this));
        this.A01.A0T(str);
    }

    public final boolean A0C() {
        C0637Et c0637Et = this.A01;
        return c0637Et == null || c0637Et.A0X();
    }

    public final boolean A0D() {
        return this.A03;
    }

    public final boolean A0E() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A03) {
            this.A04.A0A().A2d(LW.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A05.onError(this.A06.A01(), adError);
            return false;
        }
        C0637Et c0637Et = this.A01;
        if (c0637Et == null) {
            this.A04.A04().A82(A05(WKSRecord.Service.CISCO_FNA, 3, 62), C04848i.A0H, new C04858j(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A04.A0A().A2d(LW.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A05.onError(this.A06.A01(), adError);
            return false;
        }
        c0637Et.A0K();
        this.A02 = true;
        this.A03 = false;
        return true;
    }
}