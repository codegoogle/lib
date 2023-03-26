package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class P9 implements View.OnClickListener {
    public final /* synthetic */ C7B A00;

    public P9(C7B c7b) {
        this.A00 = c7b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View v;
        JL jl;
        C1080Wh c1080Wh;
        C0792Lb videoView;
        C0792Lb videoView2;
        C0792Lb videoView3;
        JL jl2;
        if (KU.A02(this)) {
            return;
        }
        try {
            v = this.A00.getVideoView();
            if (v != null) {
                jl = this.A00.A02;
                if (jl != null) {
                    jl2 = this.A00.A02;
                    jl2.A03(JK.A0l, null);
                }
                c1080Wh = this.A00.A01;
                c1080Wh.A0A().A2x();
                int[] iArr = PA.A00;
                videoView = this.A00.getVideoView();
                int i = iArr[videoView.getState().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    videoView2 = this.A00.getVideoView();
                    videoView2.A0Y(EnumC0886Os.A05, 12);
                } else if (i == 5) {
                    videoView3 = this.A00.getVideoView();
                    videoView3.A0b(true, 8);
                }
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}