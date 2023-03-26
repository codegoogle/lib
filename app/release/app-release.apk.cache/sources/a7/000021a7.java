package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcin implements zzayj {
    @z1
    private final zzayy zza;
    private final Context zzb;
    private final zzayj zzc;
    private final String zzd;
    private final int zze;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbcy zzj;
    private final zzciv zzr;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private boolean zzn = false;
    private long zzo = 0;
    private final AtomicLong zzq = new AtomicLong(-1);
    private zzfvl zzp = null;
    private final boolean zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();

    public zzcin(Context context, zzayj zzayjVar, String str, int i, zzayy zzayyVar, zzciv zzcivVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzayjVar;
        this.zza = zzayyVar;
        this.zzr = zzcivVar;
        this.zzd = str;
        this.zze = i;
    }

    private final void zzl(zzayl zzaylVar) {
        zzayy zzayyVar = this.zza;
        if (zzayyVar != null) {
            ((zzciz) zzayyVar).zzk(this, zzaylVar);
        }
    }

    private final boolean zzm() {
        if (this.zzf) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzds)).booleanValue() || this.zzm) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdt)).booleanValue() && !this.zzn;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza;
        zzayy zzayyVar;
        if (this.zzh) {
            InputStream inputStream = this.zzg;
            if (inputStream != null) {
                zza = inputStream.read(bArr, i, i2);
            } else {
                zza = this.zzc.zza(bArr, i, i2);
            }
            if ((!this.zzf || this.zzg != null) && (zzayyVar = this.zza) != null) {
                ((zzciz) zzayyVar).zzW(this, zza);
            }
            return zza;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzayj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzayl zzaylVar) throws IOException {
        zzbcv zzbcvVar;
        Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        zzbdk zzbdkVar;
        String str = "ms";
        if (!this.zzh) {
            boolean z3 = true;
            this.zzh = true;
            this.zzi = zzaylVar.zza;
            if (!this.zzf) {
                zzl(zzaylVar);
            }
            this.zzj = zzbcy.zza(zzaylVar.zza);
            ?? r4 = -1;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdp)).booleanValue()) {
                if (this.zzj != null) {
                    this.zzj.zzh = zzaylVar.zzc;
                    this.zzj.zzi = zzfpi.zzc(this.zzd);
                    this.zzj.zzj = this.zze;
                    zzbcvVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzj);
                } else {
                    zzbcvVar = null;
                }
                if (zzbcvVar != null && zzbcvVar.zze()) {
                    this.zzk = zzbcvVar.zzd();
                    this.zzm = zzbcvVar.zzg();
                    this.zzn = zzbcvVar.zzf();
                    this.zzo = zzbcvVar.zza();
                    this.zzl = true;
                    if (!zzm()) {
                        this.zzg = zzbcvVar.zzc();
                        if (this.zzf) {
                            zzl(zzaylVar);
                        }
                        return -1L;
                    }
                }
            } else if (this.zzj != null) {
                this.zzj.zzh = zzaylVar.zzc;
                this.zzj.zzi = zzfpi.zzc(this.zzd);
                this.zzj.zzj = this.zze;
                if (this.zzj.zzg) {
                    l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdr);
                } else {
                    l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdq);
                }
                long longValue = l.longValue();
                long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
                com.google.android.gms.ads.internal.zzt.zzd();
                Future zza = zzbdj.zza(this.zzb, this.zzj);
                try {
                    try {
                        zzbdkVar = (zzbdk) zza.get(longValue, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        z2 = false;
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        z3 = false;
                    }
                    try {
                        this.zzk = zzbdkVar.zzd();
                        this.zzm = zzbdkVar.zzf();
                        this.zzn = zzbdkVar.zze();
                        this.zzo = zzbdkVar.zza();
                    } catch (InterruptedException unused3) {
                        z2 = true;
                        zza.cancel(true);
                        Thread.currentThread().interrupt();
                        elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
                        this.zzr.zza.zzV(z2, elapsedRealtime);
                        this.zzl = z2;
                        r4 = new StringBuilder();
                        r4.append("Cache connection took ");
                        r4.append(elapsedRealtime);
                        r4.append("ms");
                        str = r4.toString();
                        com.google.android.gms.ads.internal.util.zze.zza(str);
                        this.zzl = false;
                        if (this.zzj != null) {
                        }
                        return this.zzc.zzb(zzaylVar);
                    } catch (ExecutionException | TimeoutException unused4) {
                        z = true;
                        zza.cancel(true);
                        elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
                        this.zzr.zza.zzV(z, elapsedRealtime);
                        this.zzl = z;
                        r4 = new StringBuilder();
                        r4.append("Cache connection took ");
                        r4.append(elapsedRealtime);
                        r4.append("ms");
                        str = r4.toString();
                        com.google.android.gms.ads.internal.util.zze.zza(str);
                        this.zzl = false;
                        if (this.zzj != null) {
                        }
                        return this.zzc.zzb(zzaylVar);
                    } catch (Throwable th2) {
                        th = th2;
                        long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
                        this.zzr.zza.zzV(z3, elapsedRealtime3);
                        this.zzl = z3;
                        com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime3 + str);
                        throw th;
                    }
                    if (!zzm()) {
                        this.zzg = zzbdkVar.zzc();
                        if (this.zzf) {
                            zzl(zzaylVar);
                        }
                        long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
                        this.zzr.zza.zzV(true, elapsedRealtime4);
                        this.zzl = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime4 + "ms");
                        return -1L;
                    }
                    long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
                    this.zzr.zza.zzV(true, elapsedRealtime5);
                    this.zzl = true;
                    str = "Cache connection took " + elapsedRealtime5 + "ms";
                    com.google.android.gms.ads.internal.util.zze.zza(str);
                } catch (Throwable th3) {
                    th = th3;
                    z3 = r4;
                }
            }
            this.zzl = false;
            if (this.zzj != null) {
                zzaylVar = new zzayl(Uri.parse(this.zzj.zza), null, zzaylVar.zzb, zzaylVar.zzc, zzaylVar.zzd, null, 0);
            }
            return this.zzc.zzb(zzaylVar);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
            return;
        }
        this.zzc.zzd();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        if (this.zzj == null) {
            return -1L;
        }
        if (this.zzq.get() != -1) {
            return this.zzq.get();
        }
        synchronized (this) {
            if (this.zzp == null) {
                this.zzp = zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcim
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzcin.this.zzg();
                    }
                });
            }
        }
        if (this.zzp.isDone()) {
            try {
                this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                return this.zzq.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long zzg() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(this.zzj));
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final boolean zzi() {
        return this.zzn;
    }

    public final boolean zzj() {
        return this.zzm;
    }

    public final boolean zzk() {
        return this.zzl;
    }
}