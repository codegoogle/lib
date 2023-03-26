package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.anythink.expressad.d.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzanv implements zzany {
    @z1
    private static zzanv zzb;
    private final Context zzc;
    private final zzfmj zzd;
    private final zzfmq zze;
    private final zzfms zzf;
    private final zzaow zzg;
    private final zzfku zzh;
    private final Executor zzi;
    private final zzfmp zzj;
    private final zzapl zzl;
    private volatile boolean zzn;
    private final int zzp;
    @r2
    public volatile long zza = 0;
    private final Object zzm = new Object();
    private volatile boolean zzo = false;
    private final CountDownLatch zzk = new CountDownLatch(1);

    @r2
    public zzanv(@x1 Context context, @x1 zzfku zzfkuVar, @x1 zzfmj zzfmjVar, @x1 zzfmq zzfmqVar, @x1 zzfms zzfmsVar, @x1 zzaow zzaowVar, @x1 Executor executor, @x1 zzfkp zzfkpVar, int i, @z1 zzapl zzaplVar) {
        this.zzc = context;
        this.zzh = zzfkuVar;
        this.zzd = zzfmjVar;
        this.zze = zzfmqVar;
        this.zzf = zzfmsVar;
        this.zzg = zzaowVar;
        this.zzi = executor;
        this.zzp = i;
        this.zzl = zzaplVar;
        this.zzj = new zzant(this, zzfkpVar);
    }

    public static synchronized zzanv zza(@x1 String str, @x1 Context context, boolean z, boolean z2) {
        zzanv zzb2;
        synchronized (zzanv.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzanv zzb(@x1 String str, @x1 Context context, @x1 Executor executor, boolean z, boolean z2) {
        zzanv zzanvVar;
        synchronized (zzanv.class) {
            if (zzb == null) {
                zzfkv zza = zzfkw.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfkw zzd = zza.zzd();
                zzfku zza2 = zzfku.zza(context, executor, z2);
                zzaog zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcz)).booleanValue() ? zzaog.zzc(context) : null;
                zzapl zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcA)).booleanValue() ? zzapl.zzd(context, executor) : null;
                zzfln zze = zzfln.zze(context, executor, zza2, zzd);
                zzaov zzaovVar = new zzaov(context);
                zzaow zzaowVar = new zzaow(zzd, zze, new zzapj(context, zzaovVar), zzaovVar, zzc, zzd2);
                int zzb2 = zzflw.zzb(context, zza2);
                zzfkp zzfkpVar = new zzfkp();
                zzanv zzanvVar2 = new zzanv(context, zza2, new zzfmj(context, zzb2), new zzfmq(context, zzb2, new zzans(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbQ)).booleanValue()), new zzfms(context, zzaowVar, zza2, zzfkpVar), zzaowVar, executor, zzfkpVar, zzb2, zzd2);
                zzb = zzanvVar2;
                zzanvVar2.zzm();
                zzb.zzo();
            }
            zzanvVar = zzb;
        }
        return zzanvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* bridge */ /* synthetic */ void zzj(zzanv zzanvVar) {
        String str;
        String str2;
        CountDownLatch countDownLatch;
        boolean zzb2;
        long currentTimeMillis = System.currentTimeMillis();
        zzfmi zzs = zzanvVar.zzs(1);
        if (zzs != null) {
            String zzk = zzs.zza().zzk();
            str2 = zzs.zza().zzj();
            str = zzk;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                zzfmn zza = zzfle.zza(zzanvVar.zzc, 1, zzanvVar.zzp, str, str2, "1", zzanvVar.zzh);
                byte[] bArr = zza.zzb;
                if (bArr != null && bArr.length != 0) {
                    try {
                        zzaqs zzc = zzaqs.zzc(zzgji.zzv(bArr), zzgkc.zza());
                        if (!zzc.zzd().zzk().isEmpty() && !zzc.zzd().zzj().isEmpty() && zzc.zze().zzE().length != 0) {
                            zzfmi zzs2 = zzanvVar.zzs(1);
                            if (zzs2 != null) {
                                zzaqv zza2 = zzs2.zza();
                                if (zzc.zzd().zzk().equals(zza2.zzk())) {
                                }
                            }
                            zzfmp zzfmpVar = zzanvVar.zzj;
                            int i = zza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbO)).booleanValue()) {
                                zzb2 = zzanvVar.zzd.zzb(zzc, zzfmpVar);
                            } else if (i == 3) {
                                zzb2 = zzanvVar.zze.zza(zzc);
                            } else {
                                if (i == 4) {
                                    zzb2 = zzanvVar.zze.zzb(zzc, zzfmpVar);
                                }
                                zzanvVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                                countDownLatch = zzanvVar.zzk;
                            }
                            if (zzb2) {
                                zzfmi zzs3 = zzanvVar.zzs(1);
                                if (zzs3 != null) {
                                    if (zzanvVar.zzf.zzc(zzs3)) {
                                        zzanvVar.zzo = true;
                                    }
                                    zzanvVar.zza = System.currentTimeMillis() / 1000;
                                }
                                countDownLatch = zzanvVar.zzk;
                            }
                            zzanvVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                            countDownLatch = zzanvVar.zzk;
                        }
                        zzanvVar.zzh.zzd(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - currentTimeMillis);
                        countDownLatch = zzanvVar.zzk;
                    } catch (NullPointerException unused) {
                        zzanvVar.zzh.zzd(2030, System.currentTimeMillis() - currentTimeMillis);
                        countDownLatch = zzanvVar.zzk;
                    }
                } else {
                    zzanvVar.zzh.zzd(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - currentTimeMillis);
                    countDownLatch = zzanvVar.zzk;
                }
            } catch (zzglc e) {
                zzanvVar.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e);
                countDownLatch = zzanvVar.zzk;
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            zzanvVar.zzk.countDown();
            throw th;
        }
    }

    private final void zzr() {
        zzapl zzaplVar = this.zzl;
        if (zzaplVar != null) {
            zzaplVar.zzh();
        }
    }

    private final zzfmi zzs(int i) {
        if (zzflw.zza(this.zzp)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbO)).booleanValue()) {
                return this.zze.zzc(1);
            }
            return this.zzd.zzd(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzr();
        zzo();
        zzfkx zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(un3.f.v, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context) {
        zzr();
        zzo();
        zzfkx zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context, View view, Activity activity) {
        zzr();
        zzo();
        zzfkx zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzk(MotionEvent motionEvent) {
        zzfkx zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfmr e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzl(int i, int i2, int i3) {
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfmi zzs = zzs(1);
        if (zzs != null) {
            if (this.zzf.zzc(zzs)) {
                this.zzo = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    public final void zzo() {
        if (this.zzn) {
            return;
        }
        synchronized (this.zzm) {
            if (!this.zzn) {
                if ((System.currentTimeMillis() / 1000) - this.zza < b.P) {
                    return;
                }
                zzfmi zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(b.P)) && zzflw.zza(this.zzp)) {
                    this.zzi.execute(new zzanu(this));
                }
            }
        }
    }

    public final synchronized boolean zzq() {
        return this.zzo;
    }
}