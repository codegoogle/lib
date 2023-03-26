package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.h2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class SearchAdView extends ViewGroup {
    @NotOnlyInitialized
    private final zzdu zza;

    public SearchAdView(@x1 Context context) {
        super(context);
        this.zza = new zzdu(this);
    }

    public void destroy() {
        this.zza.zzk();
    }

    @x1
    public AdListener getAdListener() {
        return this.zza.zza();
    }

    @z1
    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    @x1
    public String getAdUnitId() {
        return this.zza.zzj();
    }

    @h2("android.permission.INTERNET")
    public void loadAd(@x1 DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.zza.zzm(dynamicHeightSearchAdRequest.zza());
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AdSize adSize;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        } else {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzcfi.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        this.zza.zzn();
    }

    public void resume() {
        this.zza.zzp();
    }

    public void setAdListener(@x1 AdListener adListener) {
        this.zza.zzr(adListener);
    }

    public void setAdSize(@x1 AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(@x1 String str) {
        this.zza.zzu(str);
    }

    public SearchAdView(@x1 Context context, @x1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new zzdu(this, attributeSet, false);
    }

    public SearchAdView(@x1 Context context, @x1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = new zzdu(this, attributeSet, false);
    }

    @h2("android.permission.INTERNET")
    public void loadAd(@x1 SearchAdRequest searchAdRequest) {
        this.zza.zzm(searchAdRequest.zza());
    }
}