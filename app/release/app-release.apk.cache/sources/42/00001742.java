package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfpi;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzed {
    @GuardedBy("InternalMobileAds.class")
    private static zzed zza;
    @GuardedBy("settingManagerLock")
    private zzcm zzg;
    private final Object zzb = new Object();
    @GuardedBy("stateLock")
    private boolean zzd = false;
    @GuardedBy("stateLock")
    private boolean zze = false;
    private final Object zzf = new Object();
    @Nullable
    private OnAdInspectorClosedListener zzh = null;
    @x1
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    @GuardedBy("stateLock")
    private final ArrayList zzc = new ArrayList();

    private zzed() {
    }

    public static zzed zzf() {
        zzed zzedVar;
        synchronized (zzed.class) {
            if (zza == null) {
                zza = new zzed();
            }
            zzedVar = zza;
        }
        return zzedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzw(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbqg zzbqgVar = (zzbqg) it.next();
            hashMap.put(zzbqgVar.zza, new zzbqo(zzbqgVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbqgVar.zzd, zzbqgVar.zzc));
        }
        return new zzbqp(hashMap);
    }

    @GuardedBy("settingManagerLock")
    private final void zzx(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        try {
            zzbtt.zza().zzb(context, null);
            this.zzg.zzj();
            this.zzg.zzk(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzcfi.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    @GuardedBy("settingManagerLock")
    private final void zzy(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzcm) new zzao(zzaw.zza(), context).zzd(context, false);
        }
    }

    @GuardedBy("settingManagerLock")
    private final void zzz(@x1 RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzs(new zzez(requestConfiguration));
        } catch (RemoteException e) {
            zzcfi.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzcm zzcmVar = this.zzg;
            float f = 1.0f;
            if (zzcmVar == null) {
                return 1.0f;
            }
            try {
                f = zzcmVar.zze();
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to get app volume.", e);
            }
            return f;
        }
    }

    @x1
    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        InitializationStatus zzw;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzw = zzw(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzdv
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        zzed zzedVar = zzed.this;
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzdy(zzedVar));
                        return hashMap;
                    }
                };
            }
        }
        return zzw;
    }

    @Deprecated
    public final String zzh() {
        String zzc;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzfpi.zzc(this.zzg.zzf());
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to get version string.", e);
                return "";
            }
        }
        return zzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzy(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zzd) {
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
            } else if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
            } else {
                this.zzd = true;
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                if (context != null) {
                    synchronized (this.zzf) {
                        try {
                            zzy(context);
                            this.zzg.zzr(new zzec(this, null));
                            this.zzg.zzn(new zzbtx());
                            if (this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                                zzz(this.zzi);
                            }
                        } catch (RemoteException e) {
                            zzcfi.zzk("MobileAdsSettingManager initialization failed", e);
                        }
                        zzbhz.zzc(context);
                        if (((Boolean) zzbjn.zza.zze()).booleanValue()) {
                            if (((Boolean) zzay.zzc().zzb(zzbhz.zziu)).booleanValue()) {
                                zzcfi.zze("Initializing on bg thread");
                                zzcex.zza.execute(new Runnable(context, null, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdw
                                    public final /* synthetic */ Context zzb;
                                    public final /* synthetic */ OnInitializationCompleteListener zzc;

                                    {
                                        this.zzc = onInitializationCompleteListener;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzed.this.zzn(this.zzb, null, this.zzc);
                                    }
                                });
                            }
                        }
                        if (((Boolean) zzbjn.zzb.zze()).booleanValue()) {
                            if (((Boolean) zzay.zzc().zzb(zzbhz.zziu)).booleanValue()) {
                                zzcex.zzb.execute(new Runnable(context, null, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdx
                                    public final /* synthetic */ Context zzb;
                                    public final /* synthetic */ OnInitializationCompleteListener zzc;

                                    {
                                        this.zzc = onInitializationCompleteListener;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzed.this.zzo(this.zzb, null, this.zzc);
                                    }
                                });
                            }
                        }
                        zzcfi.zze("Initializing on calling thread");
                        zzx(context, null, onInitializationCompleteListener);
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    public final /* synthetic */ void zzn(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            zzx(context, null, onInitializationCompleteListener);
        }
    }

    public final /* synthetic */ void zzo(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            zzx(context, null, onInitializationCompleteListener);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzy(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzl(new zzea(null));
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzm(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzs(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzo(z);
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzt(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzp(f);
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzu(@x1 RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzz(requestConfiguration);
            }
        }
    }

    public final boolean zzv() {
        synchronized (this.zzf) {
            zzcm zzcmVar = this.zzg;
            boolean z = false;
            if (zzcmVar == null) {
                return false;
            }
            try {
                z = zzcmVar.zzt();
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to get app mute state.", e);
            }
            return z;
        }
    }
}