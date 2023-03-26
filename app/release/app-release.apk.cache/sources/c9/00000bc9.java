package com.anythink.network.adx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.d.i;
import com.anythink.basead.e.a;
import com.anythink.basead.e.e;
import com.anythink.basead.ui.MediaAdView;
import com.anythink.basead.ui.OwnNativeAdView;
import com.anythink.core.common.d.b;
import com.anythink.core.common.d.c;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;

/* loaded from: classes2.dex */
public class AdxATNativeAd extends CustomNativeAd {
    public i a;
    public Context b;
    public boolean c;
    public boolean d;
    public View e;

    public AdxATNativeAd(final Context context, i iVar, boolean z, boolean z2) {
        this.b = context.getApplicationContext();
        this.a = iVar;
        iVar.a(new e(iVar.a()) { // from class: com.anythink.network.adx.AdxATNativeAd.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i) {
                com.anythink.core.common.e.e detail = AdxATNativeAd.this.getDetail();
                if (detail != null) {
                    detail.x(i);
                }
                AdxATNativeAd.this.notifyAdClicked();
                if (AdxATNativeAd.this.a.a().i() == 67) {
                    if (AdxATNativeAd.this.a.a(true, false)) {
                        c.a(context).a(AdxATNativeAd.this.a.a().k(), 1, 0);
                    }
                    if (AdxATNativeAd.this.a.a(false, false)) {
                        b.a(context).a(AdxATNativeAd.this.a.a().k(), 1, 0);
                    }
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                AdxATNativeAd.this.notifyAdDislikeClick();
            }

            @Override // com.anythink.basead.e.e, com.anythink.basead.e.a
            public final void onAdShow() {
                super.onAdShow();
                AdxATNativeAd.this.notifyAdImpression();
                if (AdxATNativeAd.this.a.a().i() == 67) {
                    if (AdxATNativeAd.this.a.a(true, true)) {
                        c.a(context).a(AdxATNativeAd.this.a.a().k(), 0, 1);
                    }
                    if (AdxATNativeAd.this.a.a(false, true)) {
                        b.a(context).a(AdxATNativeAd.this.a.a().k(), 0, 1);
                    }
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z3) {
                AdxATNativeAd.this.notifyDeeplinkCallback(z3);
            }
        });
        this.c = z;
        this.d = z2;
        if (z || this.a.h()) {
            return;
        }
        setNetworkInfoMap(com.anythink.basead.b.a(this.a.a()));
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
        if (this.e == null) {
            this.e = this.a.a(this.b, this.c, this.d, new MediaAdView.a() { // from class: com.anythink.network.adx.AdxATNativeAd.2
                @Override // com.anythink.basead.ui.MediaAdView.a
                public final void onClickCloseView() {
                    AdxATNativeAd.this.notifyAdDislikeClick();
                }
            });
        }
        return this.e;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.a == null || this.c) {
            return null;
        }
        return new OwnNativeAdView(this.b);
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public boolean isNativeExpress() {
        return this.c || this.a.h();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onPause() {
        i iVar = this.a;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onResume() {
        i iVar = this.a;
        if (iVar != null) {
            iVar.k();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        this.a.k();
        if (this.c || this.a == null) {
            return;
        }
        List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
        if (clickViewList != null && clickViewList.size() > 0) {
            this.a.a(view, clickViewList);
        } else {
            this.a.a(view);
        }
    }
}