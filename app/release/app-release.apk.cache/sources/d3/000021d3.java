package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.p7700g.p99005.wo1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzckd extends zzcju implements zzchh {
    public static final /* synthetic */ int zzd = 0;
    private zzchi zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcjm zzi;
    private long zzj;
    private long zzk;

    public zzckd(zzchr zzchrVar, zzchq zzchqVar) {
        super(zzchrVar);
        zzchi zzcizVar;
        Context context = zzchrVar.getContext();
        if (zzchqVar.zzm) {
            zzcizVar = new zzckv(context, zzchqVar, (zzchr) this.zzc.get());
        } else {
            zzcizVar = new zzciz(context, zzchqVar, (zzchr) this.zzc.get());
        }
        this.zze = zzcizVar;
        zzcizVar.zzI(this);
    }

    public static final String zzu(String str) {
        return "cache:".concat(String.valueOf(zzcfb.zze(str)));
    }

    private static String zzw(String str, Exception exc) {
        return wo1.w(str, "/", exc.getClass().getCanonicalName(), ":", exc.getMessage());
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckb
            @Override // java.lang.Runnable
            public final void run() {
                zzckd.this.zzt();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcju, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzchi zzchiVar = this.zze;
        if (zzchiVar != null) {
            zzchiVar.zzI(null);
            this.zze.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzC(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzc(this.zzf, zzu(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzi(final boolean z, final long j) {
        final zzchr zzchrVar = (zzchr) this.zzc.get();
        if (zzchrVar != null) {
            zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckc
                @Override // java.lang.Runnable
                public final void run() {
                    zzchr.this.zzx(z, j);
                }
            });
        }
    }

    public final zzchi zzj() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzI(null);
        zzchi zzchiVar = this.zze;
        this.zze = null;
        return zzchiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzk(String str, Exception exc) {
        zzcfi.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzs(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzl(String str, Exception exc) {
        zzcfi.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzs(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzn(int i) {
        this.zze.zzH(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzo(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzp(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String str) {
        return zzr(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcju] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzr(String str, String[] strArr) {
        String str2;
        String str3;
        zzckd zzckdVar;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str4;
        long j5;
        long j6;
        zzckd zzckdVar2 = this;
        String str5 = str;
        zzckdVar2.zzf = str5;
        String zzu = zzu(str);
        String str6 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzckdVar2.zze.zzC(uriArr, zzckdVar2.zzb);
            zzchr zzchrVar = (zzchr) zzckdVar2.zzc.get();
            if (zzchrVar != null) {
                zzchrVar.zzv(zzu, zzckdVar2);
            }
            Clock zzA = com.google.android.gms.ads.internal.zzt.zzA();
            long currentTimeMillis = zzA.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzw)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzv)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzu)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
            long j7 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzA.currentTimeMillis() - currentTimeMillis <= longValue2) {
                            if (!zzckdVar2.zzg) {
                                if (zzckdVar2.zzh) {
                                    break;
                                } else if (zzckdVar2.zze.zzR()) {
                                    long zzz = zzckdVar2.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = zzckdVar2.zze.zzv();
                                        if (zzv != j7) {
                                            try {
                                                j = intValue;
                                                long j8 = zzz;
                                                j2 = longValue2;
                                                j4 = longValue;
                                                str4 = zzu;
                                                try {
                                                    zzg(str, zzu, zzv, j8, zzv > 0, booleanValue ? zzckdVar2.zze.zzA() : -1L, booleanValue ? zzckdVar2.zze.zzx() : -1L, booleanValue ? zzckdVar2.zze.zzB() : -1L, zzchi.zzs(), zzchi.zzu());
                                                    j6 = zzv;
                                                    j5 = zzz;
                                                    str2 = j8;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    zzckdVar = this;
                                                    str2 = str;
                                                    str3 = str4;
                                                    try {
                                                        throw th;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        String str7 = str6;
                                                        zzcfi.zzj("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                                        com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "VideoStreamExoPlayerCache.preload");
                                                        release();
                                                        zzckdVar.zzc(str2, str3, str7, zzw(str7, e));
                                                        return false;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                zzckdVar = this;
                                                str2 = str;
                                                str3 = zzu;
                                            }
                                        } else {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str4 = zzu;
                                            j5 = zzz;
                                            j6 = j7;
                                            str2 = intValue;
                                        }
                                        zzckdVar = (zzv > j5 ? 1 : (zzv == j5 ? 0 : -1));
                                        if (zzckdVar >= 0) {
                                            zze(str, str4, j5);
                                        } else {
                                            try {
                                                zzckd zzckdVar3 = this;
                                                str2 = str;
                                                str3 = str4;
                                                if (zzckdVar3.zze.zzw() < j || zzv <= 0) {
                                                    j3 = j4;
                                                    r1 = j6;
                                                    zzckdVar = zzckdVar3;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        str2 = str5;
                                        str3 = zzu;
                                        zzckdVar = zzckdVar2;
                                        j3 = longValue;
                                        r1 = j7;
                                    }
                                    try {
                                        try {
                                            zzckdVar.wait(j3);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str6 = r1;
                                            throw th;
                                        }
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzu;
                        zzckdVar = zzckdVar2;
                    }
                }
                longValue = j3;
                zzckdVar2 = zzckdVar;
                str5 = str2;
                zzu = str3;
                intValue = j;
                longValue2 = j2;
                j7 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str5;
            str3 = zzu;
            zzckdVar = zzckdVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzs(String str, String[] strArr, zzcjm zzcjmVar) {
        this.zzf = str;
        this.zzi = zzcjmVar;
        String zzu = zzu(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzC(uriArr, this.zzb);
            zzchr zzchrVar = (zzchr) this.zzc.get();
            if (zzchrVar != null) {
                zzchrVar.zzv(zzu, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            zzcfi.zzj("Failed to preload url " + str + " Exception: " + message);
            com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzc(str, zzu, "error", zzw("error", e));
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzcju, com.google.android.gms.internal.ads.zzckd] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzckd] */
    /* JADX WARN: Type inference failed for: r2v31 */
    public final /* synthetic */ void zzt() {
        String str;
        zzckd zzckdVar;
        zzckd zzckdVar2;
        zzbhx zzc;
        long longValue;
        long intValue;
        zzckd zzckdVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzu = zzu(this.zzf);
        String str3 = "error";
        try {
            zzbhr zzbhrVar = zzbhz.zzv;
            zzc = com.google.android.gms.ads.internal.client.zzay.zzc();
            longValue = ((Long) zzc.zzb(zzbhrVar)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzu)).intValue();
            zzckdVar = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzu;
            zzckdVar = this;
        }
        synchronized (this) {
            try {
                int i = ((com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (i <= 0) {
                    try {
                        if (!this.zzg) {
                            if (!this.zzh) {
                                if (this.zze.zzR()) {
                                    long zzz = this.zze.zzz();
                                    if (zzz > 0) {
                                        long zzv = this.zze.zzv();
                                        if (zzv != this.zzk) {
                                            try {
                                                j2 = intValue;
                                                str2 = zzu;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                zzckdVar = this;
                                                str = zzu;
                                            }
                                            try {
                                                zzg(this.zzf, zzu, zzv, zzz, zzv > 0, zzckdVar != 0 ? this.zze.zzA() : -1L, zzckdVar != 0 ? this.zze.zzx() : -1L, zzckdVar != 0 ? this.zze.zzB() : -1L, zzchi.zzs(), zzchi.zzu());
                                                zzckdVar = this;
                                                j = zzv;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzckdVar = this;
                                                str = str2;
                                                throw th;
                                            }
                                            try {
                                                zzckdVar.zzk = j;
                                                j3 = zzz;
                                                zzckdVar = zzckdVar;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                str = str2;
                                                throw th;
                                            }
                                        } else {
                                            j = zzv;
                                            j2 = intValue;
                                            str2 = zzu;
                                            zzckdVar = this;
                                            j3 = zzz;
                                        }
                                        if (j >= j3) {
                                            zzckdVar.zze(zzckdVar.zzf, str2, j3);
                                            zzckdVar2 = zzckdVar;
                                        } else {
                                            int i2 = (zzckdVar.zze.zzw() > j2 ? 1 : (zzckdVar.zze.zzw() == j2 ? 0 : -1));
                                            zzckdVar3 = zzckdVar;
                                            if (i2 >= 0) {
                                                zzckdVar3 = zzckdVar;
                                                if (j > 0) {
                                                    zzckdVar2 = zzckdVar;
                                                }
                                            }
                                        }
                                    } else {
                                        zzckdVar3 = this;
                                    }
                                    zzckdVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzw)).longValue());
                                    return;
                                }
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            zzckdVar2 = this;
                            com.google.android.gms.ads.internal.zzt.zzy().zzc(zzckdVar2.zzi);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = i;
                    }
                } else {
                    str = zzu;
                    zzckdVar = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzu;
                zzckdVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                zzcfi.zzj("Failed to preload url " + zzckdVar.zzf + " Exception: " + e.getMessage());
                com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzckdVar.zzc(zzckdVar.zzf, str, str4, zzw(str4, e));
                zzckdVar2 = zzckdVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzc(zzckdVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzv() {
        zzcfi.zzj("Precache onRenderedFirstFrame");
    }
}