package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.g.a.f;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public enum zzfiv {
    NATIVE(f.a),
    JAVASCRIPT("javascript"),
    NONE("none");
    
    private final String zze;

    zzfiv(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}