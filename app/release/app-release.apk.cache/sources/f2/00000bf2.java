package com.anythink.network.onlineapi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.b;
import com.anythink.basead.d.i;
import com.anythink.basead.e.a;
import com.anythink.basead.ui.OwnNativeAdView;
import com.anythink.core.common.e.e;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;

/* loaded from: classes2.dex */
public class OnlineApiATNativeAd extends CustomNativeAd {
    public i a;
    public Context b;
    public View c;

    public OnlineApiATNativeAd(Context context, i iVar) {
        this.b = context.getApplicationContext();
        this.a = iVar;
        iVar.a(new a() { // from class: com.anythink.network.onlineapi.OnlineApiATNativeAd.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i) {
                e detail = OnlineApiATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.x(i);
                }
                OnlineApiATNativeAd.this.notifyAdClicked();
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                OnlineApiATNativeAd.this.notifyAdImpression();
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z) {
                OnlineApiATNativeAd.this.notifyDeeplinkCallback(z);
            }
        });
        setNetworkInfoMap(b.a(this.a.a()));
        setAdChoiceIconUrl(this.a.g());
        setTitle(this.a.b());
        setDescriptionText(this.a.c());
        setIconImageUrl(this.a.e());
        setMainImageUrl(this.a.f());
        setCallToActionText(this.a.d());
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void clear(View view) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.i();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        i iVar = this.a;
        if (iVar != null) {
            iVar.a((a) null);
            this.a.j();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.c == null) {
            this.c = this.a.a(this.b, false, false, null);
        }
        return this.c;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.a != null) {
            return new OwnNativeAdView(this.b);
        }
        return null;
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