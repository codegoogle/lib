package com.iab.omid.library.ironsrc.adsession;

import com.anythink.expressad.foundation.g.a.f;

/* loaded from: classes3.dex */
public enum Owner {
    NATIVE(f.a),
    JAVASCRIPT("javascript"),
    NONE("none");
    
    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.owner;
    }
}