package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class NX extends LinearLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final C1080Wh A02;
    public final View$OnClickListenerC1087Wo A03;
    public final C0847Nf A04;
    public static final LinearLayout.LayoutParams A06 = new LinearLayout.LayoutParams(-2, -2);
    public static final int A05 = (int) (C0795Le.A01 * 8.0f);

    public abstract void A0D(int i);

    public abstract void A0E(boolean z);

    public NX(C1080Wh c1080Wh, int i, C1H c1h, String str, JE je, M6 m6, C0901Ph c0901Ph, LX lx) {
        super(c1080Wh);
        C0795Le.A0N(this);
        this.A02 = c1080Wh;
        this.A00 = i;
        this.A04 = new C0847Nf(c1080Wh);
        C0795Le.A0P(this.A04, 0);
        C0795Le.A0N(this.A04);
        this.A03 = new View$OnClickListenerC1087Wo(c1080Wh, str, c1h, je, m6, c0901Ph, lx);
        C0795Le.A0J(1001, this.A03);
        this.A01 = new RelativeLayout(c1080Wh);
        this.A01.setLayoutParams(A06);
        C0795Le.A0N(this.A01);
    }

    public int A09(int i) {
        return 0;
    }

    public RelativeLayout.LayoutParams A0B(View view) {
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    public RelativeLayout.LayoutParams A0C(View view) {
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    public final View$OnClickListenerC1087Wo getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C1G c1g, C1I c1i, String str, String str2, @Nullable InterfaceC0842Na interfaceC0842Na) {
        this.A03.setCta(c1i, str, new HashMap(), interfaceC0842Na);
        AsyncTaskC1091Ws asyncTaskC1091Ws = new AsyncTaskC1091Ws(this.A04, this.A02);
        int i = this.A00;
        asyncTaskC1091Ws.A06(i, i).A08(str2);
    }
}