package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* loaded from: assets/audience_network.dex */
public class O9 extends WebChromeClient {
    public final /* synthetic */ C0924Qe A00;

    public O9(C0924Qe c0924Qe) {
        this.A00 = c0924Qe;
    }

    public /* synthetic */ O9(C0924Qe c0924Qe, C0929Qj c0929Qj) {
        this(c0924Qe);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        JL jl;
        O7 o7;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            jl = this.A00.A09;
            jl.A03(JK.A0N, null);
            o7 = this.A00.A0F;
            o7.A05(C04848i.A0q, consoleMessage.message());
        }
        return super.onConsoleMessage(consoleMessage);
    }
}