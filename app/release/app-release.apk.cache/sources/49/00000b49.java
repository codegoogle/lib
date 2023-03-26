package com.anythink.interstitial.a;

import android.content.Context;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.m;
import com.anythink.core.common.h;
import com.anythink.core.common.t;
import com.anythink.interstitial.api.ATInterstitialAutoLoadListener;

/* loaded from: classes2.dex */
public final class f extends h {
    public f(Context context) {
        super(context);
    }

    @Override // com.anythink.core.common.h
    @Deprecated
    public final void a() {
    }

    @Override // com.anythink.core.common.h
    public final void a(ATBaseAdAdapter aTBaseAdAdapter) {
    }

    @Override // com.anythink.core.common.h
    public final void a(AdError adError) {
        super.a(adError);
        if (!t.a().f(this.g) || this.k == 0) {
            return;
        }
        ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener = b.a().b;
        a.a(m.a().E(), this.g).k();
        if (aTInterstitialAutoLoadListener != null) {
            aTInterstitialAutoLoadListener.onInterstitialAutoLoadFail(this.g, adError);
        }
    }

    @Override // com.anythink.core.common.h
    public final void h() {
        ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener;
        super.h();
        if (!t.a().f(this.g) || this.k == 0 || (aTInterstitialAutoLoadListener = b.a().b) == null) {
            return;
        }
        aTInterstitialAutoLoadListener.onInterstitialAutoLoaded(this.g);
    }
}