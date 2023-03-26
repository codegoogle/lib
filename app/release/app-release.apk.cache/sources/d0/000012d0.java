package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.p7700g.p99005.zg2;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.No  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0856No extends RelativeLayout {
    public static byte[] A08;
    public static final int A09;
    public static final int A0A;
    public C1H A00;
    public boolean A01;
    public boolean A02;
    public final C1080Wh A03;
    public final JE A04;
    public final View$OnClickListenerC1087Wo A05;
    public final C0853Nl A06;
    public final C0860Ns A07;

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A08 = new byte[]{81, 93, 95, 28, 84, 83, 81, 87, 80, 93, 93, 89, 28, 83, 86, 65, 28, 91, 92, 70, 87, 64, 65, 70, 91, 70, 91, 83, 94, 28, 81, 94, 91, 81, 89, 87, 86};
    }

    public abstract boolean A0c();

    static {
        A0J();
        A09 = (int) (C0795Le.A01 * 16.0f);
        A0A = (int) (C0795Le.A01 * 28.0f);
    }

    public AbstractC0856No(C0860Ns c0860Ns, boolean z) {
        super(c0860Ns.A05());
        C1H A00;
        this.A01 = false;
        this.A07 = c0860Ns;
        this.A03 = c0860Ns.A05();
        this.A04 = c0860Ns.A06();
        if (c0860Ns.A00() == 1) {
            A00 = c0860Ns.A04().A0L().A01();
        } else {
            A00 = c0860Ns.A04().A0L().A00();
        }
        this.A00 = A00;
        this.A02 = z;
        this.A05 = new View$OnClickListenerC1087Wo(c0860Ns.A05(), A0I(0, 37, 59), this.A00, c0860Ns.A06(), c0860Ns.A09(), c0860Ns.A0B(), c0860Ns.A07());
        this.A05.setRoundedCornersEnabled(A0N());
        this.A05.setViewShowsOverMedia(A0M());
        C0795Le.A0J(1001, this.A05);
        this.A06 = new C0853Nl(this.A03, this.A00, this.A02, A0O(), A0P());
        C0795Le.A0N(this.A06);
        if (J8.A1L(this.A03)) {
            this.A06.setDescriptionVisibility(8);
        }
    }

    public void A0K(C7v c7v) {
        this.A01 = true;
    }

    public void A0L(C04737s c04737s) {
    }

    public boolean A0M() {
        return true;
    }

    public boolean A0N() {
        return true;
    }

    public boolean A0O() {
        return true;
    }

    public boolean A0P() {
        return true;
    }

    public void A0W() {
    }

    public void A0X() {
    }

    public void A0Y() {
    }

    public void A0Z() {
    }

    public void A0a() {
    }

    public void A0b(AnonymousClass19 anonymousClass19, String str, double d, @Nullable Bundle bundle) {
        this.A06.A02(anonymousClass19.A0F().A05(), anonymousClass19.A0F().A01(), null, false, !A0c() && d > zg2.s && d < 1.0d);
        this.A05.setCta(anonymousClass19.A0G(), str, new HashMap());
    }

    public boolean A0d(boolean z) {
        return false;
    }

    public C1080Wh getAdContextWrapper() {
        return this.A03;
    }

    public JE getAdEventManager() {
        return this.A04;
    }

    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    public C1H getColors() {
        return this.A00;
    }

    public View$OnClickListenerC1087Wo getCtaButton() {
        return this.A05;
    }

    public C0853Nl getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1H A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A07.A04().A0L().A01();
        } else {
            A00 = this.A07.A04().A0L().A00();
        }
        this.A00 = A00;
        this.A05.setViewShowsOverMedia(A0M());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A01(this.A00, this.A02);
    }
}