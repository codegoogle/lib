package com.iab.omid.library.ironsrc.adsession.media;

import com.anythink.expressad.foundation.d.c;

/* loaded from: classes3.dex */
public enum InteractionType {
    CLICK(c.bY),
    INVITATION_ACCEPTED("invitationAccept");
    
    public String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.interactionType;
    }
}