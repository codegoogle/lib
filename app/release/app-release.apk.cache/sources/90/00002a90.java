package com.google.android.gms.internal.ads;

import com.p7700g.p99005.e14;
import com.p7700g.p99005.wo1;
import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfox implements Serializable, zzfov {
    private final List zza;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfox) {
            return this.zza.equals(((zzfox) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder K = wo1.K("Predicates.", "and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                K.append(e14.f0);
            }
            K.append(obj);
            z = false;
        }
        K.append(')');
        return K.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfov
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfov) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}