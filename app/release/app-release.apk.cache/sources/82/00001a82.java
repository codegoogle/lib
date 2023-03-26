package com.google.android.gms.common.internal;

import com.p7700g.p99005.z1;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class zzc {
    @z1
    private Object zza;
    private boolean zzb = false;
    public final /* synthetic */ BaseGmsClient zzd;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.zzd = baseGmsClient;
        this.zza = obj;
    }

    public abstract void zza(Object obj);

    public abstract void zzc();

    public final void zze() {
        Object obj;
        synchronized (this) {
            obj = this.zza;
            if (this.zzb) {
                toString();
            }
        }
        if (obj != null) {
            try {
                zza(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.zzb = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }

    public final void zzg() {
        ArrayList arrayList;
        ArrayList arrayList2;
        zzf();
        arrayList = this.zzd.zzt;
        synchronized (arrayList) {
            arrayList2 = this.zzd.zzt;
            arrayList2.remove(this);
        }
    }
}