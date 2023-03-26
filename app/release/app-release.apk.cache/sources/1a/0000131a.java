package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class P1 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C04667k A00;

    public P1(C04667k c04667k) {
        this.A00 = c04667k;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C0699Hf(this, i));
    }
}