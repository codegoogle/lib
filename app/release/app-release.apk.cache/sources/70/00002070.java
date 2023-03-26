package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxa extends NativeAd {
    private final zzbmy zza;
    @z1
    private final zzbwz zzc;
    @z1
    private final NativeAd.AdChoicesInfo zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(3:2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6)))|19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23))|(2:36|37)|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: RemoteException -> 0x00a4, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00a4, blocks: (B:39:0x008f, B:41:0x0097), top: B:51:0x008f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbxa(zzbmy zzbmyVar) {
        zzbwz zzbwzVar;
        zzblb zzk;
        this.zza = zzbmyVar;
        zzbwx zzbwxVar = null;
        try {
            List zzu = zzbmyVar.zzu();
            if (zzu != null) {
                for (Object obj : zzu) {
                    zzblb zzg = obj instanceof IBinder ? zzbla.zzg((IBinder) obj) : null;
                    if (zzg != null) {
                        this.zzb.add(new zzbwz(zzg));
                    }
                }
            }
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
        try {
            List zzv = this.zza.zzv();
            if (zzv != null) {
                for (Object obj2 : zzv) {
                    com.google.android.gms.ads.internal.client.zzcu zzb = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzct.zzb((IBinder) obj2) : null;
                    if (zzb != null) {
                        this.zze.add(new com.google.android.gms.ads.internal.client.zzcv(zzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
        try {
            zzk = this.zza.zzk();
        } catch (RemoteException e3) {
            zzcfi.zzh("", e3);
        }
        if (zzk != null) {
            zzbwzVar = new zzbwz(zzk);
            this.zzc = zzbwzVar;
            if (this.zza.zzi() != null) {
                zzbwxVar = new zzbwx(this.zza.zzi());
            }
            this.zzd = zzbwxVar;
        }
        zzbwzVar = null;
        this.zzc = zzbwzVar;
        if (this.zza.zzi() != null) {
        }
        this.zzd = zzbwxVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (RemoteException e) {
            zzcfi.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzC();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final String getBody() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.zza.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final NativeAd.Image getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final MediaContent getMediaContent() {
        try {
            if (this.zza.zzj() != null) {
                return new com.google.android.gms.ads.internal.client.zzej(this.zza.zzj());
            }
            return null;
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final String getPrice() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVar;
        try {
            zzdhVar = this.zza.zzg();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            zzdhVar = null;
        }
        return ResponseInfo.zza(zzdhVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final Double getStarRating() {
        try {
            double zze = this.zza.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final String getStore() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.zza.zzH()) {
                    if (muteThisAdReason == null) {
                        this.zza.zzy(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzcv) {
                        this.zza.zzy(((com.google.android.gms.ads.internal.client.zzcv) muteThisAdReason).zza());
                        return;
                    } else {
                        zzcfi.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                zzcfi.zzh("", e);
            }
            zzcfi.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzI(bundle);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzD(new com.google.android.gms.ads.internal.client.zzcr(muteThisAdListener));
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(@z1 OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzE(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
        } catch (RemoteException e) {
            zzcfi.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzF(new zzbxi(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzcfi.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    @z1
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            return null;
        }
    }
}