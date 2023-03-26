package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.x1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class NativeAdViewHolder {
    @x1
    public static WeakHashMap zza = new WeakHashMap();
    @NotOnlyInitialized
    private zzbll zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(@x1 View view, @x1 Map<String, View> map, @x1 Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzcfi.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zza.get(view) != null) {
            zzcfi.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zza.put(view, this);
            this.zzc = new WeakReference(view);
            this.zzb = zzaw.zza().zzh(view, zza(map), zza(map2));
        }
    }

    private static final HashMap zza(Map map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final void setClickConfirmingView(@x1 View view) {
        try {
            this.zzb.zzb(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzcfi.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(@x1 NativeAd nativeAd) {
        ?? zza2 = nativeAd.zza();
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzcfi.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zza.containsKey(view)) {
            zza.put(view, this);
        }
        zzbll zzbllVar = this.zzb;
        if (zzbllVar != 0) {
            try {
                zzbllVar.zzc(zza2);
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbll zzbllVar = this.zzb;
        if (zzbllVar != null) {
            try {
                zzbllVar.zzd();
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}