package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* loaded from: assets/audience_network.dex */
public abstract class M1 extends LinearLayout {
    public static int A00 = (int) (C0795Le.A01 * 56.0f);

    public abstract void A05(C1H c1h, boolean z);

    public abstract boolean A07();

    public abstract int getToolbarHeight();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setPageDetails(C1Q c1q, String str, int i, C1X c1x);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i);

    public abstract void setToolbarListener(M0 m0);

    public M1(Context context) {
        super(context);
    }

    public void A06(MQ mq) {
    }
}