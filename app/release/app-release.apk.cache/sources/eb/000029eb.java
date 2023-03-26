package com.google.android.gms.internal.ads;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public enum zzfiu {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(CallMraidJS.c),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String zzj;

    zzfiu(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}