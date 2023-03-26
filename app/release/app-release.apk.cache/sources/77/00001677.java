package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Preconditions;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class AdView extends BaseAdView {
    public AdView(@x1 Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @x1
    public final VideoController zza() {
        return this.zza.zzf();
    }

    public AdView(@x1 Context context, @x1 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(@x1 Context context, @x1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}