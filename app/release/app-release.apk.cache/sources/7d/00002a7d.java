package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfoe extends zzfod {
    private final char zza;

    public zzfoe(char c) {
        this.zza = c;
    }

    public final String toString() {
        StringBuilder G = wo1.G("CharMatcher.is('");
        int i = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        G.append(String.copyValueOf(cArr));
        G.append("')");
        return G.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final boolean zzb(char c) {
        return c == this.zza;
    }
}