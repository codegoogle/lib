package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzco {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfrj zzh;
    private final zzfrj zzi;
    private final int zzj;
    private final int zzk;
    private final zzfrj zzl;
    private zzfrj zzm;
    private int zzn;
    private final HashMap zzo;
    private final HashSet zzp;

    @Deprecated
    public zzco() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfrj.zzo();
        this.zzi = zzfrj.zzo();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfrj.zzo();
        this.zzm = zzfrj.zzo();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public static /* bridge */ /* synthetic */ int zza(zzco zzcoVar) {
        return zzcoVar.zzn;
    }

    public static /* bridge */ /* synthetic */ int zzb(zzco zzcoVar) {
        return zzcoVar.zzf;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzco zzcoVar) {
        return zzcoVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzfrj zzf(zzco zzcoVar) {
        return zzcoVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzfrj zzg(zzco zzcoVar) {
        return zzcoVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzfrj zzh(zzco zzcoVar) {
        return zzcoVar.zzm;
    }

    public static /* bridge */ /* synthetic */ zzfrj zzi(zzco zzcoVar) {
        return zzcoVar.zzh;
    }

    public static /* bridge */ /* synthetic */ HashMap zzj(zzco zzcoVar) {
        return zzcoVar.zzo;
    }

    public static /* bridge */ /* synthetic */ HashSet zzk(zzco zzcoVar) {
        return zzcoVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzl(zzco zzcoVar) {
        return zzcoVar.zzg;
    }

    public final zzco zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzeg.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfrj.zzp(zzeg.zzM(locale));
            }
        }
        return this;
    }

    public zzco zze(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    public zzco(zzcp zzcpVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzcpVar.zzl;
        this.zzf = zzcpVar.zzm;
        this.zzg = zzcpVar.zzn;
        this.zzh = zzcpVar.zzo;
        this.zzi = zzcpVar.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzcpVar.zzu;
        this.zzm = zzcpVar.zzv;
        this.zzn = zzcpVar.zzw;
        this.zzp = new HashSet(zzcpVar.zzC);
        this.zzo = new HashMap(zzcpVar.zzB);
    }
}