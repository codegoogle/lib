package com.facebook.ads.redexgen.X;

import android.media.AudioManager;

/* loaded from: assets/audience_network.dex */
public class UA implements InterfaceC04416i {
    public final /* synthetic */ UE A00;

    public UA(UE ue) {
        this.A00 = ue;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        AudioManager audioManager;
        UE ue = this.A00;
        audioManager = ue.A00;
        return ue.A0G(audioManager.isSpeakerphoneOn());
    }
}