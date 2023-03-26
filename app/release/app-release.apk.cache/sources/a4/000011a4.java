package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;

@TargetApi(17)
/* renamed from: com.facebook.ads.redexgen.X.Is  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0736Is implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C0738Iu A01;

    public C0736Is(C0738Iu c0738Iu, DisplayManager displayManager) {
        this.A01 = c0738Iu;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}