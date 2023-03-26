package com.anythink.rewardvideo.a;

import android.content.Context;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.m;
import com.anythink.core.common.h;
import com.anythink.core.common.t;
import com.anythink.rewardvideo.api.ATRewardVideoAutoLoadListener;

/* loaded from: classes2.dex */
public final class b extends h {
    public b(Context context) {
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
        ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener = d.a().b;
        a.a(m.a().E(), this.g).k();
        if (aTRewardVideoAutoLoadListener != null) {
            aTRewardVideoAutoLoadListener.onRewardVideoAutoLoadFail(this.g, adError);
        }
    }

    @Override // com.anythink.core.common.h
    public final void h() {
        ATRewardVideoAutoLoadListener aTRewardVideoAutoLoadListener;
        super.h();
        if (!t.a().f(this.g) || this.k == 0 || (aTRewardVideoAutoLoadListener = d.a().b) == null) {
            return;
        }
        aTRewardVideoAutoLoadListener.onRewardVideoAutoLoaded(this.g);
    }
}