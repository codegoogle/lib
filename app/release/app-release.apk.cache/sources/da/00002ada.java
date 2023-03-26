package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfrq extends zzfpm {
    public final /* synthetic */ Iterator zza;
    public final /* synthetic */ zzfov zzb;

    public zzfrq(Iterator it, zzfov zzfovVar) {
        this.zza = it;
        this.zzb = zzfovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    @CheckForNull
    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}