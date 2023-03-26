package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.p7700g.p99005.u0;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzsj {
    public final int zza;
    @z1
    public final zzsa zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsj() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private zzsj(CopyOnWriteArrayList copyOnWriteArrayList, int i, @z1 zzsa zzsaVar, long j) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsaVar;
    }

    private static final long zzn(long j) {
        long zzz = zzeg.zzz(j);
        if (zzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzz;
    }

    @u0
    public final zzsj zza(int i, @z1 zzsa zzsaVar, long j) {
        return new zzsj(this.zzc, i, zzsaVar, 0L);
    }

    public final void zzb(Handler handler, zzsk zzskVar) {
        Objects.requireNonNull(zzskVar);
        this.zzc.add(new zzsi(handler, zzskVar));
    }

    public final void zzc(final zzrw zzrwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsd
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzaf(zzsjVar.zza, zzsjVar.zzb, zzrwVar);
                }
            });
        }
    }

    public final void zzd(int i, @z1 zzad zzadVar, int i2, @z1 Object obj, long j) {
        zzc(new zzrw(1, i, zzadVar, 0, null, zzn(j), -9223372036854775807L));
    }

    public final void zze(final zzrr zzrrVar, final zzrw zzrwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzse
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzag(zzsjVar.zza, zzsjVar.zzb, zzrrVar, zzrwVar);
                }
            });
        }
    }

    public final void zzf(zzrr zzrrVar, int i, int i2, @z1 zzad zzadVar, int i3, @z1 Object obj, long j, long j2) {
        zze(zzrrVar, new zzrw(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzg(final zzrr zzrrVar, final zzrw zzrwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsh
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzah(zzsjVar.zza, zzsjVar.zzb, zzrrVar, zzrwVar);
                }
            });
        }
    }

    public final void zzh(zzrr zzrrVar, int i, int i2, @z1 zzad zzadVar, int i3, @z1 Object obj, long j, long j2) {
        zzg(zzrrVar, new zzrw(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzi(final zzrr zzrrVar, final zzrw zzrwVar, final IOException iOException, final boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzai(zzsjVar.zza, zzsjVar.zzb, zzrrVar, zzrwVar, iOException, z);
                }
            });
        }
    }

    public final void zzj(zzrr zzrrVar, int i, int i2, @z1 zzad zzadVar, int i3, @z1 Object obj, long j, long j2, IOException iOException, boolean z) {
        zzi(zzrrVar, new zzrw(1, -1, null, 0, null, zzn(j), zzn(j2)), iOException, z);
    }

    public final void zzk(final zzrr zzrrVar, final zzrw zzrwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            final zzsk zzskVar = zzsiVar.zzb;
            zzeg.zzX(zzsiVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsg
                @Override // java.lang.Runnable
                public final void run() {
                    zzsj zzsjVar = zzsj.this;
                    zzskVar.zzaj(zzsjVar.zza, zzsjVar.zzb, zzrrVar, zzrwVar);
                }
            });
        }
    }

    public final void zzl(zzrr zzrrVar, int i, int i2, @z1 zzad zzadVar, int i3, @z1 Object obj, long j, long j2) {
        zzk(zzrrVar, new zzrw(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzm(zzsk zzskVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsiVar = (zzsi) it.next();
            if (zzsiVar.zzb == zzskVar) {
                this.zzc.remove(zzsiVar);
            }
        }
    }
}