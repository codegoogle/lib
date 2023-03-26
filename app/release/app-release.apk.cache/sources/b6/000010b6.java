package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ew  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0640Ew extends RP {
    public static byte[] A02;
    public final C1080Wh A00;
    public final C0745Jb A01;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-33, -35, -24, -24, -37, -16, -21, -37, -35, -33, -16, -27, -21, -22, 3, 0, -4, -1, 7, 4, 9, 0, -61, -64, -59, -62, -74, -69, -68, -54, -70, -55, -64, -57, -53, -64, -58, -59};
    }

    public C0640Ew(C1080Wh c1080Wh, C1U c1u, List<C1267bZ> list, @Nullable C0745Jb c0745Jb) {
        super(c1u, list, c1080Wh);
        this.A00 = c1080Wh;
        this.A01 = c0745Jb == null ? new C0745Jb() : c0745Jb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A01 */
    public final C1155Zf A07(ViewGroup viewGroup, int i) {
        return new C1155Zf(new M8(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.RP, com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A0I */
    public final void A0F(C1155Zf c1155Zf, int i) {
        super.A0F(c1155Zf, i);
        M8 m8 = (M8) c1155Zf.A0m();
        A0G(m8.getImageCardView(), i);
        m8.setTitle(((RP) this).A01.get(i).A1B(A02(14, 8, 98)));
        m8.setSubtitle(((RP) this).A01.get(i).A1B(A02(22, 16, 30)));
        m8.setButtonText(((RP) this).A01.get(i).A1B(A02(0, 14, 67)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8);
        ((RP) this).A01.get(i).A1I(m8, m8, arrayList);
    }
}