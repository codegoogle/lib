package com.iab.omid.library.ironsrc.adsession;

import com.anythink.expressad.foundation.c.d;

/* loaded from: classes3.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO(d.a.a);
    
    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.errorType;
    }
}