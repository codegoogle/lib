package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private ImageView.ScaleType zzb;

    public MediaView(@x1 Context context) {
        super(context);
    }

    public void setImageScaleType(@x1 ImageView.ScaleType scaleType) {
        this.zzb = scaleType;
    }

    public void setMediaContent(@x1 MediaContent mediaContent) {
        this.zza = mediaContent;
    }

    public MediaView(@x1 Context context, @x1 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@x1 Context context, @x1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(@x1 Context context, @x1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}