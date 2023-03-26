package com.facebook.ads.redexgen.X;

import android.media.MediaPlayer;
import android.widget.MediaController;

/* loaded from: assets/audience_network.dex */
public class PZ implements MediaController.MediaPlayerControl {
    public static String[] A01;
    public final /* synthetic */ GB A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"hSLXxwS3ED2PXa4HWxT5O8AkoZWeLCaL", "Gmogcdio2x0gXeHeLgUduGgoR45wUaaW", "srtP07DjK9aYu1B8NyoR8EE0J7RhN7X5", "MH7", "NBYiw3cvWUp2yNoHdye4I6uBFIshebL3", "osH0FOpWNHuyeeWL1EivPIw0cJCzEheb", "y4KJdcSo65PTSQflVKQ3KiIVJaTfePYu", "FLJEaU0xa"};
    }

    public PZ(GB gb) {
        this.A00 = gb;
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
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            mediaPlayer2 = this.A00.A06;
            return mediaPlayer2.getAudioSessionId();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
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
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            GB gb = this.A00;
            if (A01[3].length() == 27) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "lkPRs4KbLtabABAzVL2ijXaoS745wM0q";
            strArr[1] = "lkPRs4KbLtabABAzVL2ijXaoS745wM0q";
            mediaPlayer2 = gb.A06;
            if (mediaPlayer2.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC0899Pf interfaceC0899Pf;
        InterfaceC0899Pf interfaceC0899Pf2;
        interfaceC0899Pf = this.A00.A0E;
        if (interfaceC0899Pf != null) {
            interfaceC0899Pf2 = this.A00.A0E;
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
        interfaceC0899Pf = this.A00.A0E;
        if (interfaceC0899Pf != null) {
            interfaceC0899Pf2 = this.A00.A0E;
            interfaceC0899Pf2.AA8();
        }
    }
}