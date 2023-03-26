package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfug extends zzfue {
    private zzfug() {
        super(null);
    }

    public /* synthetic */ zzfug(zzfud zzfudVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfue
    public final int zza(zzfuh zzfuhVar) {
        int zzA;
        synchronized (zzfuhVar) {
            zzA = zzfuh.zzA(zzfuhVar);
        }
        return zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzfue
    public final void zzb(zzfuh zzfuhVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzfuhVar) {
            set3 = zzfuhVar.seenExceptions;
            if (set3 == null) {
                zzfuhVar.seenExceptions = set2;
            }
        }
    }
}