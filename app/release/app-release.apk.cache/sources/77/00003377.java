package com.iab.omid.library.ironsrc.adsession.media;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;

/* loaded from: classes3.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED(CallMraidJS.g),
    FULLSCREEN("fullscreen");
    
    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.playerState;
    }
}