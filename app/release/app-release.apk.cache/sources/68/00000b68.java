package com.anythink.nativead.api;

import android.content.Context;
import android.view.View;
import com.anythink.nativead.unitgroup.a;

@Deprecated
/* loaded from: classes2.dex */
public interface ATNativeAdRenderer<T extends a> {
    View createView(Context context, int i);

    void renderAdView(View view, T t);
}