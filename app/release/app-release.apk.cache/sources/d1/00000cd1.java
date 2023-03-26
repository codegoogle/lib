package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import com.p7700g.p99005.q2;

@q2
@Keep
/* loaded from: classes2.dex */
public interface AdComponentViewParentApi extends AdComponentView {
    void bringChildToFront(View view);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int i, int i2);

    void onVisibilityChanged(View view, int i);

    void setMeasuredDimension(int i, int i2);
}