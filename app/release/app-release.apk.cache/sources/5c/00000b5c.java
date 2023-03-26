package com.anythink.interstitial.unitgroup.api;

import android.app.Activity;
import com.anythink.core.api.ATBaseAdAdapter;

/* loaded from: classes2.dex */
public abstract class CustomInterstitialAdapter extends ATBaseAdAdapter {
    public CustomInterstitialEventListener mImpressListener;

    public void clearImpressionListener() {
        this.mImpressListener = null;
    }

    public final void internalShow(Activity activity, CustomInterstitialEventListener customInterstitialEventListener) {
        this.mImpressListener = customInterstitialEventListener;
        try {
            show(activity);
        } catch (Throwable th) {
            th.printStackTrace();
            if (this.mImpressListener != null) {
                CustomInterstitialEventListener customInterstitialEventListener2 = this.mImpressListener;
                customInterstitialEventListener2.onInterstitialAdVideoError("", "exception, show failed: " + th.getMessage());
            }
        }
    }

    public abstract void show(Activity activity);
}