package com.iab.omid.library.ironsrc.adsession.media;

/* loaded from: classes3.dex */
public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");
    
    private final String position;

    Position(String str) {
        this.position = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.position;
    }
}