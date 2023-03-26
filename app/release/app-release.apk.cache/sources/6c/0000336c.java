package com.iab.omid.library.ironsrc.adsession;

import com.anythink.expressad.foundation.g.a.f;
import com.p7700g.p99005.ck3;

/* loaded from: classes3.dex */
public enum AdSessionContextType {
    HTML(ck3.a),
    NATIVE(f.a),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.typeString;
    }
}