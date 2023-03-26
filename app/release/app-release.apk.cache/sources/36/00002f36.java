package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvs {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzvt zzvtVar) {
        zzc(zzvtVar);
        this.zza.add(new zzvr(handler, zzvtVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzvr zzvrVar = (zzvr) it.next();
            z = zzvrVar.zzc;
            if (!z) {
                handler = zzvrVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzvt zzvtVar;
                        zzvr zzvrVar2 = zzvr.this;
                        int i2 = i;
                        long j3 = j;
                        long j4 = j2;
                        zzvtVar = zzvrVar2.zzb;
                        zzvtVar.zzY(i2, j3, j4);
                    }
                });
            }
        }
    }

    public final void zzc(zzvt zzvtVar) {
        zzvt zzvtVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzvr zzvrVar = (zzvr) it.next();
            zzvtVar2 = zzvrVar.zzb;
            if (zzvtVar2 == zzvtVar) {
                zzvrVar.zzc();
                this.zza.remove(zzvrVar);
            }
        }
    }
}