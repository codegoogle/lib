package com.anythink.network.myoffer;

import android.content.Context;
import android.view.View;
import com.anythink.basead.b;
import com.anythink.basead.e.a;
import com.anythink.basead.f.e;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;

/* loaded from: classes2.dex */
public class MyOfferATNativeAd extends CustomNativeAd {
    public e a;
    public Context b;
    public View c;

    public MyOfferATNativeAd(Context context, e eVar) {
        this.b = context.getApplicationContext();
        this.a = eVar;
        eVar.a(new a() { // from class: com.anythink.network.myoffer.MyOfferATNativeAd.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i) {
                com.anythink.core.common.e.e detail = MyOfferATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.x(i);
                }
                MyOfferATNativeAd.this.notifyAdClicked();
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                MyOfferATNativeAd.this.notifyAdImpression();
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z) {
            }
        });
        setNetworkInfoMap(b.a(this.a.e()));
        setAdChoiceIconUrl(this.a.j());
        setTitle(this.a.b());
        setDescriptionText(this.a.f());
        setIconImageUrl(this.a.h());
        setMainImageUrl(this.a.i());
        setCallToActionText(this.a.g());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void clear(View view) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.k();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        e eVar = this.a;
        if (eVar != null) {
            eVar.a((a) null);
            this.a.l();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.c == null) {
            this.c = null;
        }
        return this.c;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.a != null) {
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                this.a.a(view, clickViewList);
            } else {
                this.a.a(view);
            }
        }
    }
}