package com.anythink.core.common.b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.res.b;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n implements ATCustomLoadListener {
    public ATCustomLoadListener a;
    public Map<String, Object> b;

    public n(ATCustomLoadListener aTCustomLoadListener, Map<String, Object> map) {
        this.a = aTCustomLoadListener;
        this.b = map;
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdCacheLoaded(BaseAd... baseAdArr) {
        if (baseAdArr.length > 0) {
            final BaseAd baseAd = baseAdArr[0];
            if (TextUtils.isEmpty(baseAd.getMainImageUrl())) {
                this.a.onAdCacheLoaded(new com.anythink.core.common.e.a.e(baseAd, this.b));
                return;
            } else {
                com.anythink.core.common.res.b.a(m.a().e()).a(new com.anythink.core.common.res.e(2, baseAd.getMainImageUrl()), 0, 0, new b.a() { // from class: com.anythink.core.common.b.n.1
                    @Override // com.anythink.core.common.res.b.a
                    public final void onFail(String str, String str2) {
                        ATCustomLoadListener aTCustomLoadListener = n.this.a;
                        if (aTCustomLoadListener != null) {
                            aTCustomLoadListener.onAdLoadError("10011", "load image fail:".concat(String.valueOf(str2)));
                        }
                    }

                    @Override // com.anythink.core.common.res.b.a
                    public final void onSuccess(String str, Bitmap bitmap) {
                        n nVar;
                        ATCustomLoadListener aTCustomLoadListener;
                        if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || (aTCustomLoadListener = (nVar = n.this).a) == null) {
                            return;
                        }
                        aTCustomLoadListener.onAdCacheLoaded(new com.anythink.core.common.e.a.e(baseAd, nVar.b));
                    }
                });
                return;
            }
        }
        ATCustomLoadListener aTCustomLoadListener = this.a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("10011", "load fail with no adObject");
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdDataLoaded() {
        ATCustomLoadListener aTCustomLoadListener = this.a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdLoadError(String str, String str2) {
        ATCustomLoadListener aTCustomLoadListener = this.a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}