package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Sn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0982Sn extends C4I {
    public static byte[] A03;
    public static String[] A04;
    public ES A00;
    public Scroller A01;
    public final C4K A02 = new C0981Sm(this);

    static {
        A0B();
        A0A();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        byte[] bArr = {-35, 10, -68, 5, 10, 15, 16, -3, 10, -1, 1, -68, Flags.CD, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 15, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public static void A0B() {
        A04 = new String[]{"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    }

    public abstract int A0E(C4F c4f, int i, int i2);

    @Nullable
    public abstract View A0F(C4F c4f);

    @Nullable
    public abstract int[] A0J(@NonNull C4F c4f, @NonNull View view);

    @Nullable
    private final C4S A06(C4F c4f) {
        return A0G(c4f);
    }

    private void A08() {
        this.A00.A1l(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A09() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1k(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A07(0, 43, 103));
    }

    private boolean A0C(@NonNull C4F c4f, int i, int i2) {
        C4S A06;
        if ((c4f instanceof C4R) && (A06 = A06(c4f)) != null) {
            int A0E = A0E(c4f, i, i2);
            String[] strArr = A04;
            if (strArr[0].charAt(25) != strArr[7].charAt(25)) {
                String[] strArr2 = A04;
                strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
                strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
                if (A0E == -1) {
                    return false;
                }
                A06.A0B(A0E);
                c4f.A1M(A06);
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4I
    public final boolean A0D(int i, int i2) {
        C4F layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        int minFlingVelocity2 = Math.abs(i2);
        if (minFlingVelocity2 <= minFlingVelocity) {
            int minFlingVelocity3 = Math.abs(i);
            if (minFlingVelocity3 <= minFlingVelocity) {
                return false;
            }
        }
        return A0C(layoutManager, i, i2);
    }

    @Nullable
    @Deprecated
    public SX A0G(C4F c4f) {
        if (!(c4f instanceof C4R)) {
            return null;
        }
        return new E3(this, this.A00.getContext());
    }

    public final void A0H() {
        C4F layoutManager;
        View snapView;
        ES es = this.A00;
        if (es == null || (layoutManager = es.getLayoutManager()) == null || (snapView = A0F(layoutManager)) == null) {
            return;
        }
        int[] A0J = A0J(layoutManager, snapView);
        if (A0J[0] != 0 || A0J[1] != 0) {
            this.A00.A1f(A0J[0], A0J[1]);
        }
    }

    public final void A0I(@Nullable ES es) throws IllegalStateException {
        ES es2 = this.A00;
        if (es2 == es) {
            return;
        }
        if (es2 != null) {
            A08();
        }
        this.A00 = es;
        if (this.A00 != null) {
            A09();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0H();
        }
    }
}