package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.anythink.expressad.foundation.d.c;
import com.google.android.gms.common.util.CollectionUtils;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcme extends com.google.android.gms.ads.internal.client.zzdj {
    private final zzchr zza;
    private final boolean zzc;
    private final boolean zzd;
    @GuardedBy("lock")
    private int zze;
    @GuardedBy("lock")
    @z1
    private com.google.android.gms.ads.internal.client.zzdn zzf;
    @GuardedBy("lock")
    private boolean zzg;
    @GuardedBy("lock")
    private float zzi;
    @GuardedBy("lock")
    private float zzj;
    @GuardedBy("lock")
    private float zzk;
    @GuardedBy("lock")
    private boolean zzl;
    @GuardedBy("lock")
    private boolean zzm;
    @GuardedBy("lock")
    private zzbmj zzn;
    private final Object zzb = new Object();
    @GuardedBy("lock")
    private boolean zzh = true;

    public zzcme(zzchr zzchrVar, float f, boolean z, boolean z2) {
        this.zza = zzchrVar;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(final int i, final int i2, final boolean z, final boolean z2) {
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // java.lang.Runnable
            public final void run() {
                zzcme.this.zzd(i, i2, z, z2);
            }
        });
    }

    private final void zzx(String str, @z1 Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // java.lang.Runnable
            public final void run() {
                zzcme.this.zzr(hashMap);
            }
        });
    }

    public final void zzc(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f2 == this.zzi && f3 == this.zzk) {
                z2 = false;
            }
            this.zzi = f2;
            this.zzj = f;
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f4 = this.zzk;
            this.zzk = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.zza.zzH().invalidate();
            }
        }
        if (z2) {
            try {
                zzbmj zzbmjVar = this.zzn;
                if (zzbmjVar != null) {
                    zzbmjVar.zze();
                }
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
        zzw(i2, i, z3, z);
    }

    public final /* synthetic */ void zzd(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar2;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar3;
        synchronized (this.zzb) {
            boolean z5 = this.zzg;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            boolean z7 = i != i2 && i3 == 2;
            boolean z8 = i != i2 && i3 == 3;
            this.zzg = (z5 || z3) ? true : true;
            if (z3) {
                try {
                    com.google.android.gms.ads.internal.client.zzdn zzdnVar4 = this.zzf;
                    if (zzdnVar4 != null) {
                        zzdnVar4.zzi();
                    }
                } catch (RemoteException e) {
                    zzcfi.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (zzdnVar3 = this.zzf) != null) {
                zzdnVar3.zzh();
            }
            if (z7 && (zzdnVar2 = this.zzf) != null) {
                zzdnVar2.zzg();
            }
            if (z8) {
                com.google.android.gms.ads.internal.client.zzdn zzdnVar5 = this.zzf;
                if (zzdnVar5 != null) {
                    zzdnVar5.zze();
                }
                this.zza.zzy();
            }
            if (z != z2 && (zzdnVar = this.zzf) != null) {
                zzdnVar.zzf(z2);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    @z1
    public final com.google.android.gms.ads.internal.client.zzdn zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        synchronized (this.zzb) {
            zzdnVar = this.zzf;
        }
        return zzdnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) {
        zzx(true != z ? c.bX : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        zzx(c.bZ, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(@z1 com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        synchronized (this.zzb) {
            this.zzf = zzdnVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        boolean z;
        boolean zzp = zzp();
        synchronized (this.zzb) {
            z = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        boolean z = zzffVar.zza;
        boolean z2 = zzffVar.zzb;
        boolean z3 = zzffVar.zzc;
        synchronized (this.zzb) {
            this.zzl = z2;
            this.zzm = z3;
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    public final void zzt(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzw(i, 3, z, z);
    }

    public final void zzv(zzbmj zzbmjVar) {
        synchronized (this.zzb) {
            this.zzn = zzbmjVar;
        }
    }
}