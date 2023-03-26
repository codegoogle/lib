package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.p7700g.p99005.z1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeco extends zzbzm {
    private final Context zza;
    private final Executor zzb;
    private final zzfvm zzc;
    private final zzcag zzd;
    private final zzcsm zze;
    @GuardedBy("this")
    private final ArrayDeque zzf;
    private final zzfhu zzg;
    private final zzcah zzh;
    private final zzect zzi;

    public zzeco(Context context, Executor executor, zzfvm zzfvmVar, zzcah zzcahVar, zzcsm zzcsmVar, zzcag zzcagVar, ArrayDeque arrayDeque, zzect zzectVar, zzfhu zzfhuVar, byte[] bArr) {
        zzbhz.zzc(context);
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfvmVar;
        this.zzh = zzcahVar;
        this.zzd = zzcagVar;
        this.zze = zzcsmVar;
        this.zzf = arrayDeque;
        this.zzi = zzectVar;
        this.zzg = zzfhuVar;
    }

    public static /* synthetic */ void zzk(zzeco zzecoVar) {
        zzcfy.zza(zzecoVar.zzd.zza(), "persistFlags");
    }

    @z1
    private final synchronized zzecl zzl(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzecl zzeclVar = (zzecl) it.next();
            if (zzeclVar.zzd.equals(str)) {
                it.remove();
                return zzeclVar;
            }
        }
        return null;
    }

    @z1
    private final synchronized zzecl zzm(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzecl zzeclVar = (zzecl) it.next();
            if (zzeclVar.zzc.equals(str)) {
                it.remove();
                return zzeclVar;
            }
        }
        return null;
    }

    private static zzfvl zzn(zzfvl zzfvlVar, zzfgf zzfgfVar, zzbta zzbtaVar, zzfhs zzfhsVar, zzfhh zzfhhVar) {
        zzbsq zza = zzbtaVar.zza("AFMA_getAdDictionary", zzbsx.zza, zzecf.zza);
        zzfhr.zzd(zzfvlVar, zzfhhVar);
        zzffk zza2 = zzfgfVar.zzb(zzffz.BUILD_URL, zzfvlVar).zzf(zza).zza();
        zzfhr.zzc(zza2, zzfhsVar, zzfhhVar);
        return zza2;
    }

    private static zzfvl zzo(zzbzv zzbzvVar, zzfgf zzfgfVar, final zzety zzetyVar) {
        zzfuj zzfujVar = new zzfuj() { // from class: com.google.android.gms.internal.ads.zzebz
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzety.this.zzb().zza(com.google.android.gms.ads.internal.client.zzaw.zzb().zzh((Bundle) obj));
            }
        };
        return zzfgfVar.zzb(zzffz.GMS_SIGNALS, zzfvc.zzi(zzbzvVar.zza)).zzf(zzfujVar).zze(zzeca.zza).zza();
    }

    private final synchronized void zzp(zzecl zzeclVar) {
        zzq();
        this.zzf.addLast(zzeclVar);
    }

    private final synchronized void zzq() {
        int intValue = ((Long) zzbjv.zzc.zze()).intValue();
        while (this.zzf.size() >= intValue) {
            this.zzf.removeFirst();
        }
    }

    private final void zzr(zzfvl zzfvlVar, zzbzr zzbzrVar) {
        zzfvc.zzr(zzfvc.zzn(zzfvlVar, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdb
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                            try {
                                IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                                autoCloseOutputStream.close();
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    autoCloseOutputStream.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return zzfvc.zzi(parcelFileDescriptor);
            }
        }, zzcfv.zza), new zzeck(this, zzbzrVar), zzcfv.zzf);
    }

    public final zzfvl zzb(final zzbzv zzbzvVar, int i) {
        if (!((Boolean) zzbjv.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Split request is disabled."));
        }
        zzfdv zzfdvVar = zzbzvVar.zzi;
        if (zzfdvVar == null) {
            return zzfvc.zzh(new Exception("Pool configuration missing from request."));
        }
        if (zzfdvVar.zzc != 0 && zzfdvVar.zzd != 0) {
            zzbta zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
            zzety zzp = this.zze.zzp(zzbzvVar, i);
            zzfgf zzc = zzp.zzc();
            final zzfvl zzo = zzo(zzbzvVar, zzc, zzp);
            zzfhs zzd = zzp.zzd();
            final zzfhh zza = zzfhg.zza(this.zza, 9);
            final zzfvl zzn = zzn(zzo, zzc, zzb, zzd, zza);
            return zzc.zza(zzffz.GET_URL_AND_CACHE_KEY, zzo, zzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzece
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeco.this.zzj(zzn, zzo, zzbzvVar, zza);
                }
            }).zza();
        }
        return zzfvc.zzh(new Exception("Caching is disabled."));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfvl zzc(zzbzv zzbzvVar, int i) {
        zzecl zzl;
        zzfhh zzfhhVar;
        zzffk zza;
        zzbta zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
        zzety zzp = this.zze.zzp(zzbzvVar, i);
        zzbsq zza2 = zzb.zza("google.afma.response.normalize", zzecn.zza, zzbsx.zzb);
        zzecl zzeclVar = null;
        if (!((Boolean) zzbjv.zza.zze()).booleanValue()) {
            String str = zzbzvVar.zzj;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            if (((Boolean) zzbjv.zzd.zze()).booleanValue()) {
                zzl = zzm(zzbzvVar.zzh);
            } else {
                if (!TextUtils.isEmpty(zzbzvVar.zzj)) {
                    zzl = zzl(zzbzvVar.zzj);
                }
                if (zzeclVar == null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
                }
            }
            zzeclVar = zzl;
            if (zzeclVar == null) {
            }
        }
        zzecl zzeclVar2 = zzeclVar;
        if (zzeclVar2 == null) {
            zzfhhVar = zzfhg.zza(this.zza, 9);
        } else {
            zzfhhVar = zzeclVar2.zze;
        }
        zzfhh zzfhhVar2 = zzfhhVar;
        zzfhs zzd = zzp.zzd();
        zzd.zzd(zzbzvVar.zza.getStringArrayList("ad_types"));
        zzecv zzecvVar = new zzecv(zzbzvVar.zzg, zzd, zzfhhVar2);
        zzecs zzecsVar = new zzecs(this.zza, zzbzvVar.zzb.zza, this.zzh, i, null);
        zzfgf zzc = zzp.zzc();
        zzfhh zza3 = zzfhg.zza(this.zza, 11);
        if (zzeclVar2 == null) {
            final zzfvl zzo = zzo(zzbzvVar, zzc, zzp);
            final zzfvl zzn = zzn(zzo, zzc, zzb, zzd, zzfhhVar2);
            zzfhh zza4 = zzfhg.zza(this.zza, 10);
            final zzffk zza5 = zzc.zza(zzffz.HTTP, zzn, zzo).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzecu((JSONObject) zzfvl.this.get(), (zzbzy) zzn.get());
                }
            }).zze(zzecvVar).zze(new zzfhn(zza4)).zze(zzecsVar).zza();
            zzfhr.zza(zza5, zzd, zza4);
            zzfhr.zzd(zza5, zza3);
            zza = zzc.zza(zzffz.PRE_PROCESS, zzo, zzn, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzecn((zzecr) zzfvl.this.get(), (JSONObject) zzo.get(), (zzbzy) zzn.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzecu zzecuVar = new zzecu(zzeclVar2.zzb, zzeclVar2.zza);
            zzfhh zza6 = zzfhg.zza(this.zza, 10);
            final zzffk zza7 = zzc.zzb(zzffz.HTTP, zzfvc.zzi(zzecuVar)).zze(zzecvVar).zze(new zzfhn(zza6)).zze(zzecsVar).zza();
            zzfhr.zza(zza7, zzd, zza6);
            final zzfvl zzi = zzfvc.zzi(zzeclVar2);
            zzfhr.zzd(zza7, zza3);
            zza = zzc.zza(zzffz.PRE_PROCESS, zza7, zzi).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzech
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfvl zzfvlVar = zzfvl.this;
                    zzfvl zzfvlVar2 = zzi;
                    return new zzecn((zzecr) zzfvlVar.get(), ((zzecl) zzfvlVar2.get()).zzb, ((zzecl) zzfvlVar2.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfhr.zza(zza, zzd, zza3);
        return zza;
    }

    public final zzfvl zzd(zzbzv zzbzvVar, int i) {
        zzbta zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcfo.zza(), this.zzg);
        if (!((Boolean) zzbka.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Signal collection disabled."));
        }
        zzety zzp = this.zze.zzp(zzbzvVar, i);
        final zzetj zza = zzp.zza();
        zzbsq zza2 = zzb.zza("google.afma.request.getSignals", zzbsx.zza, zzbsx.zzb);
        zzfhh zza3 = zzfhg.zza(this.zza, 22);
        zzffk zza4 = zzp.zzc().zzb(zzffz.GET_SIGNALS, zzfvc.zzi(zzbzvVar.zza)).zze(new zzfhn(zza3)).zzf(new zzfuj() { // from class: com.google.android.gms.internal.ads.zzecg
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzetj.this.zza(com.google.android.gms.ads.internal.client.zzaw.zzb().zzh((Bundle) obj));
            }
        }).zzb(zzffz.JS_SIGNALS).zzf(zza2).zza();
        zzfhs zzd = zzp.zzd();
        zzd.zzd(zzbzvVar.zza.getStringArrayList("ad_types"));
        zzfhr.zzb(zza4, zzd, zza3);
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final void zze(zzbzv zzbzvVar, zzbzr zzbzrVar) {
        zzr(zzb(zzbzvVar, Binder.getCallingUid()), zzbzrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final void zzf(zzbzv zzbzvVar, zzbzr zzbzrVar) {
        zzr(zzd(zzbzvVar, Binder.getCallingUid()), zzbzrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final void zzg(zzbzv zzbzvVar, zzbzr zzbzrVar) {
        zzfvl zzc = zzc(zzbzvVar, Binder.getCallingUid());
        zzr(zzc, zzbzrVar);
        if (((Boolean) zzbjn.zzg.zze()).booleanValue()) {
            zzc.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecb
                @Override // java.lang.Runnable
                public final void run() {
                    zzeco.zzk(zzeco.this);
                }
            }, this.zzc);
        } else {
            zzc.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecb
                @Override // java.lang.Runnable
                public final void run() {
                    zzeco.zzk(zzeco.this);
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzn
    public final void zzh(String str, zzbzr zzbzrVar) {
        zzr(zzi(str), zzbzrVar);
    }

    public final zzfvl zzi(String str) {
        zzecl zzl;
        if (!((Boolean) zzbjv.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Split request is disabled."));
        }
        zzecj zzecjVar = new zzecj(this);
        if (((Boolean) zzbjv.zzd.zze()).booleanValue()) {
            zzl = zzm(str);
        } else {
            zzl = zzl(str);
        }
        if (zzl == null) {
            return zzfvc.zzh(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfvc.zzi(zzecjVar);
    }

    public final /* synthetic */ InputStream zzj(zzfvl zzfvlVar, zzfvl zzfvlVar2, zzbzv zzbzvVar, zzfhh zzfhhVar) throws Exception {
        String zzc = ((zzbzy) zzfvlVar.get()).zzc();
        String str = zzbzvVar.zzh;
        zzp(new zzecl((zzbzy) zzfvlVar.get(), (JSONObject) zzfvlVar2.get(), str, zzc, zzfhhVar));
        return new ByteArrayInputStream(zzc.getBytes(zzfoi.zzc));
    }
}