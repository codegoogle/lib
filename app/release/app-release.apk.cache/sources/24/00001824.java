package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.p7700g.p99005.x1;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class UnifiedNativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private NativeAd.Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private VideoController zzj;
    private boolean zzk;
    private View zzl;
    private View zzm;
    private Object zzn;
    private Bundle zzo = new Bundle();
    private boolean zzp;
    private boolean zzq;
    private float zzr;

    @x1
    public View getAdChoicesContent() {
        return this.zzl;
    }

    @x1
    public final String getAdvertiser() {
        return this.zzf;
    }

    @x1
    public final String getBody() {
        return this.zzc;
    }

    @x1
    public final String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    @x1
    public final Bundle getExtras() {
        return this.zzo;
    }

    @x1
    public final String getHeadline() {
        return this.zza;
    }

    @x1
    public final NativeAd.Image getIcon() {
        return this.zzd;
    }

    @x1
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzr;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzq;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzp;
    }

    @x1
    public final String getPrice() {
        return this.zzi;
    }

    @x1
    public final Double getStarRating() {
        return this.zzg;
    }

    @x1
    public final String getStore() {
        return this.zzh;
    }

    public void handleClick(@x1 View view) {
    }

    public boolean hasVideoContent() {
        return this.zzk;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(@x1 View view) {
        this.zzl = view;
    }

    public final void setAdvertiser(@x1 String str) {
        this.zzf = str;
    }

    public final void setBody(@x1 String str) {
        this.zzc = str;
    }

    public final void setCallToAction(@x1 String str) {
        this.zze = str;
    }

    public final void setExtras(@x1 Bundle bundle) {
        this.zzo = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.zzk = z;
    }

    public final void setHeadline(@x1 String str) {
        this.zza = str;
    }

    public final void setIcon(@x1 NativeAd.Image image) {
        this.zzd = image;
    }

    public final void setImages(@x1 List<NativeAd.Image> list) {
        this.zzb = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.zzr = f;
    }

    public void setMediaView(@x1 View view) {
        this.zzm = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzq = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzp = z;
    }

    public final void setPrice(@x1 String str) {
        this.zzi = str;
    }

    public final void setStarRating(@x1 Double d) {
        this.zzg = d;
    }

    public final void setStore(@x1 String str) {
        this.zzh = str;
    }

    public void trackViews(@x1 View view, @x1 Map<String, View> map, @x1 Map<String, View> map2) {
    }

    public void untrackView(@x1 View view) {
    }

    @x1
    public final View zza() {
        return this.zzm;
    }

    @x1
    public final VideoController zzb() {
        return this.zzj;
    }

    @x1
    public final Object zzc() {
        return this.zzn;
    }

    public final void zzd(@x1 Object obj) {
        this.zzn = obj;
    }

    public final void zze(@x1 VideoController videoController) {
        this.zzj = videoController;
    }
}