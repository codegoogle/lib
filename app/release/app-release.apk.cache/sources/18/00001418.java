package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TA implements InterfaceC03191m {
    public static byte[] A03;
    public C5H A00;
    public C1080Wh A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, g15.c, 122, g15.c, 126, 102, g15.c};
    }

    public TA(C5H c5h, C1080Wh c1080Wh, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5h;
        this.A01 = c1080Wh;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03191m
    public final void A9X(C0755Jm c0755Jm) {
        KT.A00(new T7(this, c0755Jm));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03191m
    public final void AAI(List<RG> list) {
        C7H c7h = new C7H(this.A01);
        String A02 = A02(6, 7, 70);
        for (RG rg : list) {
            if (A02(6, 7, 70).equals(A02)) {
                A02 = rg.A0R();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (rg.A0K() != null) {
                    c7h.A0R(new C7E(rg.A0K().getUrl(), rg.A0K().getHeight(), rg.A0K().getWidth(), rg.A0R(), A02(0, 6, 2)));
                }
                if (rg.A0J() != null) {
                    c7h.A0R(new C7E(rg.A0J().getUrl(), rg.A0J().getHeight(), rg.A0J().getWidth(), rg.A0R(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(rg.A0T())) {
                    c7h.A0W(new C7G(rg.A0T(), rg.A0R(), A02(0, 6, 2), rg.A0N().longValue()));
                }
            }
        }
        c7h.A0Q(new T9(this, list), new C7A(A02, A02(0, 6, 2)));
    }
}