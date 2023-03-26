package com.iab.omid.library.ironsrc.adsession;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;

/* loaded from: classes3.dex */
public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(CallMraidJS.c),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String impressionType;

    ImpressionType(String str) {
        this.impressionType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.impressionType;
    }
}