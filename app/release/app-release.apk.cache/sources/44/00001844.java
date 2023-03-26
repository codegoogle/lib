package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class NativeAdView extends FrameLayout {
    @NotOnlyInitialized
    private final FrameLayout zza;
    @NotOnlyInitialized
    @z1
    private final zzblf zzb;

    public NativeAdView(@x1 Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @z1
    @RequiresNonNull({"overlayFrame"})
    private final zzblf zze() {
        if (isInEditMode()) {
            return null;
        }
        return zzaw.zza().zzg(this.zza.getContext(), this, this.zza);
    }

    private final void zzf(String str, @z1 View view) {
        zzblf zzblfVar = this.zzb;
        if (zzblfVar != null) {
            try {
                zzblfVar.zzbw(str, ObjectWrapper.wrap(view));
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to call setAssetView on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@x1 View view, int i, @x1 ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@x1 View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzblf zzblfVar = this.zzb;
        if (zzblfVar != null) {
            try {
                zzblfVar.zzc();
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to destroy native ad view", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@x1 MotionEvent motionEvent) {
        zzblf zzblfVar;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzcD)).booleanValue() && (zzblfVar = this.zzb) != null) {
            try {
                zzblfVar.zzd(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @z1
    public AdChoicesView getAdChoicesView() {
        View zza = zza("3011");
        if (zza instanceof AdChoicesView) {
            return (AdChoicesView) zza;
        }
        return null;
    }

    @z1
    public final View getAdvertiserView() {
        return zza("3005");
    }

    @z1
    public final View getBodyView() {
        return zza("3004");
    }

    @z1
    public final View getCallToActionView() {
        return zza("3002");
    }

    @z1
    public final View getHeadlineView() {
        return zza("3001");
    }

    @z1
    public final View getIconView() {
        return zza("3003");
    }

    @z1
    public final View getImageView() {
        return zza("3008");
    }

    @z1
    public final MediaView getMediaView() {
        View zza = zza("3010");
        if (zza instanceof MediaView) {
            return (MediaView) zza;
        }
        if (zza != null) {
            zzcfi.zze("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    @z1
    public final View getPriceView() {
        return zza("3007");
    }

    @z1
    public final View getStarRatingView() {
        return zza("3009");
    }

    @z1
    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@x1 View view, int i) {
        super.onVisibilityChanged(view, i);
        zzblf zzblfVar = this.zzb;
        if (zzblfVar != null) {
            try {
                zzblfVar.zze(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@x1 View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@z1 AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(@z1 View view) {
        zzf("3005", view);
    }

    public final void setBodyView(@z1 View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(@z1 View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(@z1 View view) {
        zzblf zzblfVar = this.zzb;
        if (zzblfVar != null) {
            try {
                zzblfVar.zzbx(ObjectWrapper.wrap(view));
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(@z1 View view) {
        zzf("3001", view);
    }

    public final void setIconView(@z1 View view) {
        zzf("3003", view);
    }

    public final void setImageView(@z1 View view) {
        zzf("3008", view);
    }

    public final void setMediaView(@z1 MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(@x1 NativeAd nativeAd) {
        zzblf zzblfVar = this.zzb;
        if (zzblfVar != 0) {
            try {
                zzblfVar.zzbA(nativeAd.zza());
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(@z1 View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(@z1 View view) {
        zzf("3009", view);
    }

    public final void setStoreView(@z1 View view) {
        zzf("3006", view);
    }

    @z1
    public final View zza(@x1 String str) {
        zzblf zzblfVar = this.zzb;
        if (zzblfVar != null) {
            try {
                IObjectWrapper zzb = zzblfVar.zzb(str);
                if (zzb != null) {
                    return (View) ObjectWrapper.unwrap(zzb);
                }
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzblf zzblfVar = this.zzb;
        if (zzblfVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzej) {
                zzblfVar.zzby(((zzej) mediaContent).zza());
            } else if (mediaContent == null) {
                zzblfVar.zzby(null);
            } else {
                zzcfi.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzcfi.zzh("Unable to call setMediaContent on delegate", e);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzblf zzblfVar = this.zzb;
        if (zzblfVar == null || scaleType == null) {
            return;
        }
        try {
            zzblfVar.zzbz(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e) {
            zzcfi.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public NativeAdView(@x1 Context context, @x1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(@x1 Context context, @x1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    @TargetApi(21)
    public NativeAdView(@x1 Context context, @x1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zza = zzd(context);
        this.zzb = zze();
    }
}