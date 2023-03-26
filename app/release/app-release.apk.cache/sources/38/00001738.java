package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbb;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.z1;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdu {
    @VisibleForTesting
    public final zzax zza;
    private final zzbtx zzb;
    private final zzp zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    @z1
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    @z1
    private AppEventListener zzi;
    @z1
    private zzbs zzj;
    private VideoOptions zzk;
    private String zzl;
    @NotOnlyInitialized
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    @z1
    private OnPaidEventListener zzp;

    public zzdu(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzp.zza, null, 0);
    }

    private static zzq zzC(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = zzD(i);
        return zzqVar;
    }

    private static boolean zzD(int i) {
        return i == 1;
    }

    public final boolean zzA() {
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                return zzbsVar.zzY();
            }
            return false;
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] zzB() {
        return this.zzh;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    @z1
    public final AdSize zzb() {
        zzq zzg;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null && (zzg = zzbsVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    @z1
    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    @z1
    public final ResponseInfo zzd() {
        zzdh zzdhVar = null;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzdhVar = zzbsVar.zzk();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzdhVar);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    @z1
    public final AppEventListener zzh() {
        return this.zzi;
    }

    @z1
    public final zzdk zzi() {
        zzbs zzbsVar = this.zzj;
        if (zzbsVar != null) {
            try {
                return zzbsVar.zzl();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbs zzbsVar;
        if (this.zzl == null && (zzbsVar = this.zzj) != null) {
            try {
                this.zzl = zzbsVar.zzr();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzx();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final /* synthetic */ void zzl(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzm(zzdr zzdrVar) {
        zzbs zzbsVar;
        try {
            if (this.zzj == null) {
                if (this.zzh != null && this.zzl != null) {
                    Context context = this.zzm.getContext();
                    zzq zzC = zzC(context, this.zzh, this.zzn);
                    if ("search_v2".equals(zzC.zza)) {
                        zzbsVar = (zzbs) new zzaj(zzaw.zza(), context, zzC, this.zzl).zzd(context, false);
                    } else {
                        zzbsVar = (zzbs) new zzah(zzaw.zza(), context, zzC, this.zzl, this.zzb).zzd(context, false);
                    }
                    this.zzj = zzbsVar;
                    zzbsVar.zzD(new zzg(this.zza));
                    zza zzaVar = this.zzf;
                    if (zzaVar != null) {
                        this.zzj.zzC(new zzb(zzaVar));
                    }
                    AppEventListener appEventListener = this.zzi;
                    if (appEventListener != null) {
                        this.zzj.zzG(new zzbbb(appEventListener));
                    }
                    if (this.zzk != null) {
                        this.zzj.zzU(new zzff(this.zzk));
                    }
                    this.zzj.zzP(new zzey(this.zzp));
                    this.zzj.zzN(this.zzo);
                    zzbs zzbsVar2 = this.zzj;
                    if (zzbsVar2 != null) {
                        try {
                            final IObjectWrapper zzn = zzbsVar2.zzn();
                            if (zzn != null) {
                                if (((Boolean) zzbjn.zze.zze()).booleanValue()) {
                                    if (((Boolean) zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                                        zzcfb.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzds
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzdu.this.zzl(zzn);
                                            }
                                        });
                                    }
                                }
                                this.zzm.addView((View) ObjectWrapper.unwrap(zzn));
                            }
                        } catch (RemoteException e) {
                            zzcfi.zzl("#007 Could not call remote method.", e);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            zzbs zzbsVar3 = this.zzj;
            Objects.requireNonNull(zzbsVar3);
            zzbsVar3.zzaa(this.zzc.zza(this.zzm.getContext(), zzdrVar));
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzn() {
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzz();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzA();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzB();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(@z1 zza zzaVar) {
        try {
            this.zzf = zzaVar;
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.zzh == null) {
            zzt(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zzt(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzF(zzC(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String str) {
        if (this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzv(@z1 AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzG(appEventListener != null ? new zzbbb(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z) {
        this.zzo = z;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzN(z);
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(@z1 OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzP(new zzey(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzU(videoOptions == null ? null : new zzff(videoOptions));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzz(zzbs zzbsVar) {
        try {
            IObjectWrapper zzn = zzbsVar.zzn();
            if (zzn != null && ((View) ObjectWrapper.unwrap(zzn)).getParent() == null) {
                this.zzm.addView((View) ObjectWrapper.unwrap(zzn));
                this.zzj = zzbsVar;
                return true;
            }
            return false;
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzdu(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzp.zza, null, i);
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzp.zza, null, 0);
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzp.zza, null, i);
    }

    @VisibleForTesting
    public zzdu(ViewGroup viewGroup, @z1 AttributeSet attributeSet, boolean z, zzp zzpVar, @z1 zzbs zzbsVar, int i) {
        zzq zzqVar;
        this.zzb = new zzbtx();
        this.zze = new VideoController();
        this.zza = new zzdt(this);
        this.zzm = viewGroup;
        this.zzc = zzpVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.zzh = zzyVar.zzb(z);
                this.zzl = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    zzcfb zzb = zzaw.zzb();
                    AdSize adSize = this.zzh[0];
                    int i2 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVar = zzq.zze();
                    } else {
                        zzq zzqVar2 = new zzq(context, adSize);
                        zzqVar2.zzj = zzD(i2);
                        zzqVar = zzqVar2;
                    }
                    zzb.zzl(viewGroup, zzqVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzaw.zzb().zzk(viewGroup, new zzq(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}