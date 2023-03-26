package com.facebook.ads.redexgen.X;

import android.widget.MediaController;

/* loaded from: assets/audience_network.dex */
public class PW implements MediaController.MediaPlayerControl {
    public static String[] A01;
    public final /* synthetic */ GC A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    }

    public PW(GC gc) {
        this.A00 = gc;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        PR pr;
        PR pr2;
        pr = this.A00.A0C;
        if (pr != null) {
            pr2 = this.A00.A0C;
            return pr2.A05();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        PR pr;
        PR pr2;
        pr = this.A00.A0C;
        if (pr != null) {
            pr2 = this.A00.A0C;
            return pr2.A06();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        PR pr;
        PR pr2;
        pr = this.A00.A0C;
        if (pr != null) {
            pr2 = this.A00.A0C;
            if (pr2.A0K()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC0899Pf interfaceC0899Pf;
        InterfaceC0899Pf interfaceC0899Pf2;
        interfaceC0899Pf = this.A00.A0F;
        if (interfaceC0899Pf != null) {
            interfaceC0899Pf2 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            strArr2[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            interfaceC0899Pf2.AA7();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC0899Pf interfaceC0899Pf;
        InterfaceC0899Pf interfaceC0899Pf2;
        interfaceC0899Pf = this.A00.A0F;
        if (interfaceC0899Pf != null) {
            interfaceC0899Pf2 = this.A00.A0F;
            interfaceC0899Pf2.AA8();
        }
    }
}