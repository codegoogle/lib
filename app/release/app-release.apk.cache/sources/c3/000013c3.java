package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Rk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0956Rk implements KE {
    public static byte[] A0E;
    public static String[] A0F;
    public InterfaceC03191m A00;
    public AnonymousClass90 A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    @Nullable
    public final AdSize A06;
    public final C02990s A07;
    public final C1080Wh A08;
    public final JE A09;
    public final EnumC0760Js A0A;
    public final KF A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[1] = "uoxYJqIRleds8fPMMv";
            strArr[1] = "uoxYJqIRleds8fPMMv";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
            i4++;
        }
    }

    public static void A05() {
        byte[] bArr = {54, 51, 70, 51, -20, -19, -18, -15, -10, -15, -4, -15, -9, -10, 8, 9, -70, 10, 6, -5, -3, -1, 7, -1, 8, 14, -70, 3, 8, -70, 12, -1, 13, 10, 9, 8, 13, -1};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[1] = "dKV76OJFyRmVPWeRzZ";
        strArr[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    public static void A06() {
        A0F = new String[]{"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    }

    static {
        A06();
        A05();
        C0797Lg.A02();
    }

    public C0956Rk(C1080Wh c1080Wh, String str, EnumC0760Js enumC0760Js, @Nullable AdSize adSize, int i) {
        this.A08 = c1080Wh;
        this.A0D = str;
        this.A0A = enumC0760Js;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new KF(this.A08);
        this.A0B.A0R(this);
        this.A07 = new C02990s();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new C0635Er(this);
        this.A09 = c1080Wh.A06();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<RG> A04() {
        AnonymousClass90 anonymousClass90 = this.A01;
        ArrayList arrayList = new ArrayList(anonymousClass90.A02());
        for (C05008y A04 = anonymousClass90.A04(); A04 != null; A04 = anonymousClass90.A04()) {
            InterfaceC02940n A00 = this.A07.A00(AdPlacementType.NATIVE);
            if (A00 != null && A00.A6i() == AdPlacementType.NATIVE) {
                HashMap hashMap = new HashMap();
                hashMap.put(A03(0, 4, 123), A04.A06());
                hashMap.put(A03(4, 10, 49), anonymousClass90.A05());
                RG rg = (RG) A00;
                rg.A0Y(this.A08, new C0955Rj(this, arrayList, rg), this.A09, hashMap, C1267bZ.A0I());
            }
        }
        return arrayList;
    }

    public final void A07() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A08() {
        try {
            C0765Jx c0765Jx = new C0765Jx(this.A08, null, null, null);
            C1080Wh c1080Wh = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0Q(new KC(c1080Wh, str, adSize != null ? new LH(adSize.getHeight(), this.A06.getWidth()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isChildDirected() || AdSettings.isMixedAudience(), c0765Jx, LN.A01(J8.A0H(this.A08)), this.A02, null));
        } catch (C0756Jn e) {
            A9X(C0755Jm.A03(e));
        }
    }

    public final void A09(InterfaceC03191m interfaceC03191m) {
        this.A00 = interfaceC03191m;
    }

    public final void A0A(String str) {
        this.A02 = str;
    }

    public final boolean A0B() {
        AnonymousClass90 anonymousClass90 = this.A01;
        return anonymousClass90 == null || anonymousClass90.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.KE
    public final void A9X(C0755Jm c0755Jm) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        InterfaceC03191m interfaceC03191m = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "yGn7NPCZVX";
        strArr[2] = "yGn7NPCZVX";
        if (interfaceC03191m != null) {
            interfaceC03191m.A9X(c0755Jm);
        }
    }

    @Override // com.facebook.ads.redexgen.X.KE
    public final void AB3(C1204aV c1204aV) {
        AnonymousClass90 A00 = c1204aV.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<RG> A04 = A04();
            if (this.A00 != null) {
                if (A04.isEmpty()) {
                    this.A00.A9X(C0755Jm.A02(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.AAI(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(14, 24, 67));
    }
}