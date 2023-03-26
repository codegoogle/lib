package com.anythink.core.common.g;

import com.anythink.core.api.AdError;

/* loaded from: classes2.dex */
public interface h {
    void onLoadCanceled(int i);

    void onLoadError(int i, String str, AdError adError);

    void onLoadFinish(int i, Object obj);

    void onLoadStart(int i);
}