package com.anythink.banner.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.banner.a.d;
import com.anythink.banner.a.e;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.a;
import com.anythink.core.common.b.b;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.a.c;
import com.anythink.core.common.j.a.f;
import com.anythink.core.common.j.g;
import com.anythink.core.common.j.p;
import com.anythink.core.common.t;
import com.anythink.core.common.u;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ATBannerView extends FrameLayout implements d {
    private final String TAG;
    public a adLoadListener;
    private boolean canRenderBanner;
    public boolean hasTouchWindow;
    public c impressionTracker;
    private com.anythink.banner.a.a mAdLoadManager;
    public b mAdSourceEventListener;
    private com.anythink.banner.b.a mBannerRefreshTimer;
    public CustomBannerAdapter mCustomBannerAd;
    public ATAdSourceStatusListener mDeveloperStatusListener;
    public ATEventInterface mDownloadListener;
    private e mInnerBannerListener;
    public boolean mIsRefresh;
    private ATBannerListener mListener;
    private String mPlacementId;
    private String mScenario;
    public f.b visibilityChecker;

    public ATBannerView(Context context) {
        super(context);
        this.TAG = ATBannerView.class.getSimpleName();
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new e() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.a.e
            public final void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(j.a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(j.a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.a.e
            public final void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z) {
                                ATBannerView.this.mListener.onBannerShow(j.a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(j.a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, j.a(customBannerAdapter), z);
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, j.a(customBannerAdapter), aTNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.b.a
            public final void onAdLoadFail(final AdError adError) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !ATBannerView.this.canRenderBanner) {
                            return;
                        }
                        ATBannerView aTBannerView = ATBannerView.this;
                        if (aTBannerView.mIsRefresh) {
                            aTBannerView.mListener.onBannerAutoRefreshFail(adError);
                        } else {
                            aTBannerView.mListener.onBannerFailed(adError);
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager == null || !ATBannerView.this.isInView() || ATBannerView.this.mBannerRefreshTimer.a()) {
                    return;
                }
                com.anythink.core.common.j.e.b(ATBannerView.this.TAG, "in window load fail to countDown refresh!");
                ATBannerView.this.mBannerRefreshTimer.b();
            }

            @Override // com.anythink.core.common.b.a
            public final void onAdLoaded() {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.anythink.banner.b.a(this);
    }

    private boolean checkVisibilityPercent() {
        if (this.visibilityChecker == null) {
            this.visibilityChecker = new f.b();
        }
        if (getParent() != null) {
            return this.visibilityChecker.a((View) getParent(), this, 80, 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.anythink.core.common.e.b getBannerCache() {
        return com.anythink.core.common.a.a().a(getContext(), this.mPlacementId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInView() {
        if (this.hasTouchWindow && isShown()) {
            return this.mCustomBannerAd == null || checkVisibilityPercent();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRefreshOpen() {
        com.anythink.core.c.d a = com.anythink.core.c.e.a(getContext().getApplicationContext()).a(this.mPlacementId);
        return a != null && a.Q() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerImpression(final Context context, final ATBaseAdAdapter aTBaseAdAdapter, final boolean z) {
        final com.anythink.core.common.e.e trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.6
            @Override // java.lang.Runnable
            public final void run() {
                g.a(trackingInfo, g.i.c, g.i.f, "");
                com.anythink.core.common.i.a.a(context).a(4, trackingInfo, aTBaseAdAdapter.getUnitGroupInfo());
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            if (aTBaseAdAdapter == null || !z) {
                                ATBannerView.this.mListener.onBannerShow(j.a(aTBaseAdAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(j.a(aTBaseAdAdapter));
                            }
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerShow(final Context context, final com.anythink.core.common.e.b bVar, final boolean z) {
        final ATBaseAdAdapter e = bVar.e();
        final com.anythink.core.common.e.e trackingInfo = e.getTrackingInfo();
        trackingInfo.v = u.a().b(trackingInfo.S());
        final long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(trackingInfo.k())) {
            trackingInfo.h(com.anythink.core.common.j.g.a(trackingInfo.T(), trackingInfo.w(), currentTimeMillis));
        }
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (trackingInfo != null) {
                    p.a(ATBannerView.this.getContext(), trackingInfo);
                    com.anythink.core.common.a.a().a(context.getApplicationContext(), bVar);
                    com.anythink.core.common.i.a.a(context).a(13, trackingInfo, e.getUnitGroupInfo(), currentTimeMillis);
                    if (e.supportImpressionCallback()) {
                        return;
                    }
                    ATBannerView.this.notifyBannerImpression(context, e, z);
                }
            }
        });
    }

    private void registerDelayShow(final Context context, final com.anythink.core.common.e.b bVar, CustomBannerAdapter customBannerAdapter, final boolean z) {
        View bannerView = customBannerAdapter.getBannerView();
        if (bannerView == null) {
            bannerView = this;
        }
        c cVar = this.impressionTracker;
        if (cVar != null) {
            cVar.a(bannerView, new com.anythink.core.common.j.a.a() { // from class: com.anythink.banner.api.ATBannerView.3
                @Override // com.anythink.core.common.j.a.a, com.anythink.core.common.j.a.b
                public final int getImpressionMinPercentageViewed() {
                    return 80;
                }

                @Override // com.anythink.core.common.j.a.a, com.anythink.core.common.j.a.b
                public final int getImpressionMinTimeViewed() {
                    return 0;
                }

                @Override // com.anythink.core.common.j.a.a, com.anythink.core.common.j.a.b
                public final void recordImpression(View view) {
                    ATBannerView.this.notifyBannerShow(context, bVar, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderBannerView(com.anythink.core.common.e.b bVar, boolean z) {
        CustomBannerAdapter customBannerAdapter = (bVar == null || !(bVar.e() instanceof CustomBannerAdapter)) ? null : (CustomBannerAdapter) bVar.e();
        if (customBannerAdapter != null) {
            CustomBannerAdapter customBannerAdapter2 = this.mCustomBannerAd;
            if (customBannerAdapter2 != null) {
                customBannerAdapter2.destory();
            }
            View bannerView = customBannerAdapter.getBannerView();
            if (bannerView != null && bannerView.getParent() != null && bannerView.getParent() != this) {
                ((ViewGroup) bannerView.getParent()).removeView(bannerView);
            }
            this.mCustomBannerAd = customBannerAdapter;
            if (bannerView != null) {
                customBannerAdapter.getTrackingInfo().C = this.mScenario;
                customBannerAdapter.setAdEventListener(new com.anythink.banner.a.b(this.mInnerBannerListener, customBannerAdapter, z));
                if (!isInView()) {
                    registerDelayShow(getContext().getApplicationContext(), bVar, customBannerAdapter, z);
                } else {
                    notifyBannerShow(getContext().getApplicationContext(), bVar, z);
                }
                IExHandler b = m.a().b();
                if (b != null) {
                    customBannerAdapter.setAdDownloadListener(b.createDownloadListener(customBannerAdapter, null, this.mDownloadListener));
                }
                removeAllViews();
                int i = bannerView.getLayoutParams() != null ? bannerView.getLayoutParams().width : 0;
                if (i == 0) {
                    i = -2;
                }
                int i2 = bannerView.getLayoutParams() != null ? bannerView.getLayoutParams().height : 0;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2 > 0 ? i2 : -2);
                layoutParams.gravity = 17;
                bannerView.setLayoutParams(layoutParams);
                if (bannerView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) bannerView.getParent()).removeView(bannerView);
                }
                addView(bannerView, layoutParams);
            }
            this.mAdLoadManager.a(bVar);
            this.mBannerRefreshTimer.b();
            if (isRefreshOpen()) {
                loadAd(1);
            }
        }
    }

    public ATAdStatusInfo checkAdStatus() {
        if (m.a().e() != null && !TextUtils.isEmpty(m.a().n()) && !TextUtils.isEmpty(m.a().o())) {
            com.anythink.banner.a.a aVar = this.mAdLoadManager;
            if (aVar == null) {
                return new ATAdStatusInfo(false, false, null);
            }
            ATAdStatusInfo a = aVar.a(getContext());
            com.anythink.core.common.j.m.a(this.mPlacementId, g.i.i, g.i.t, a.toString(), "");
            return a;
        }
        return new ATAdStatusInfo(false, false, null);
    }

    public List<ATAdInfo> checkValidAdCaches() {
        com.anythink.banner.a.a aVar = this.mAdLoadManager;
        if (aVar != null) {
            return aVar.b(getContext());
        }
        return null;
    }

    public void controlShow() {
        if (this.mAdLoadManager == null) {
            return;
        }
        final boolean z = this.mIsRefresh;
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ATBannerView.this.mAdLoadManager) {
                    if (ATBannerView.this.canRenderBanner) {
                        final com.anythink.core.common.e.b bannerCache = ATBannerView.this.getBannerCache();
                        boolean z2 = false;
                        if (bannerCache != null) {
                            if (ATBannerView.this.isInView()) {
                                bannerCache.a(bannerCache.d() + 1);
                                ATBannerView.this.canRenderBanner = false;
                                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.4.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                        ATBannerView.this.renderBannerView(bannerCache, z);
                                    }
                                });
                            } else {
                                ATBannerView aTBannerView = ATBannerView.this;
                                if (aTBannerView.hasTouchWindow && aTBannerView.isShown()) {
                                    z2 = true;
                                    com.anythink.core.common.j.e.b(ATBannerView.this.TAG, "no in window to render banner!");
                                }
                                ATBannerView.this.mBannerRefreshTimer.d();
                                com.anythink.core.common.j.e.b(ATBannerView.this.TAG, "no in window to render banner!");
                            }
                        } else if (ATBannerView.this.isRefreshOpen() && ATBannerView.this.mAdLoadManager != null && !ATBannerView.this.mAdLoadManager.d()) {
                            ATBannerView.this.loadAd(1);
                            ATBannerView aTBannerView2 = ATBannerView.this;
                            if (aTBannerView2.hasTouchWindow && aTBannerView2.isShown()) {
                                z2 = true;
                            }
                        }
                        if (z2 && ATBannerView.this.mBannerRefreshTimer != null && ATBannerView.this.mBannerRefreshTimer.c()) {
                            ATBannerView.this.mBannerRefreshTimer.b();
                        }
                        return;
                    }
                    com.anythink.core.common.j.e.b(ATBannerView.this.TAG, "not yet time to render banner!");
                }
            }
        });
    }

    public void destroy() {
        removeAllViews();
        CustomBannerAdapter customBannerAdapter = this.mCustomBannerAd;
        if (customBannerAdapter != null) {
            customBannerAdapter.destory();
        }
        com.anythink.banner.b.a aVar = this.mBannerRefreshTimer;
        if (aVar != null) {
            aVar.d();
        }
        c cVar = this.impressionTracker;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void loadAd() {
        loadAd(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.hasTouchWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hasTouchWindow = false;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            controlShow();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            controlShow();
        }
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        IExHandler b;
        this.mDownloadListener = aTEventInterface;
        if (this.mCustomBannerAd == null || (b = m.a().b()) == null) {
            return;
        }
        CustomBannerAdapter customBannerAdapter = this.mCustomBannerAd;
        customBannerAdapter.setAdDownloadListener(b.createDownloadListener(customBannerAdapter, null, this.mDownloadListener));
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new b();
        }
        this.mDeveloperStatusListener = aTAdSourceStatusListener;
        this.mAdSourceEventListener.a(aTAdSourceStatusListener);
    }

    public void setBannerAdListener(ATBannerListener aTBannerListener) {
        this.mListener = aTBannerListener;
    }

    public void setLocalExtra(Map<String, Object> map) {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            return;
        }
        t.a().a(this.mPlacementId, map);
    }

    public void setPlacementId(String str) {
        this.mAdLoadManager = com.anythink.banner.a.a.a(getContext(), str);
        this.mPlacementId = str;
        this.mBannerRefreshTimer.a(str);
        if (this.impressionTracker == null) {
            getContext();
            this.impressionTracker = new c(50);
        }
    }

    public void setScenario(String str) {
        if (com.anythink.core.common.j.g.c(str)) {
            this.mScenario = str;
        }
    }

    @Override // com.anythink.banner.a.d
    public void timeUpRefreshView() {
        this.canRenderBanner = true;
        controlShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd(int i) {
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.i, g.i.p, g.i.h, "");
        this.mIsRefresh = i == 1;
        if (i == 0) {
            this.canRenderBanner = true;
        }
        com.anythink.banner.a.a aVar = this.mAdLoadManager;
        if (aVar != null) {
            aVar.a(getContext(), i, this.adLoadListener, this.mAdSourceEventListener);
        } else {
            this.adLoadListener.onAdLoadFail(ErrorCode.getErrorCode("3001", "", ""));
        }
    }

    public ATBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = ATBannerView.class.getSimpleName();
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new e() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.a.e
            public final void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(j.a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(j.a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.a.e
            public final void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z) {
                                ATBannerView.this.mListener.onBannerShow(j.a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(j.a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, j.a(customBannerAdapter), z);
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, j.a(customBannerAdapter), aTNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.b.a
            public final void onAdLoadFail(final AdError adError) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !ATBannerView.this.canRenderBanner) {
                            return;
                        }
                        ATBannerView aTBannerView = ATBannerView.this;
                        if (aTBannerView.mIsRefresh) {
                            aTBannerView.mListener.onBannerAutoRefreshFail(adError);
                        } else {
                            aTBannerView.mListener.onBannerFailed(adError);
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager == null || !ATBannerView.this.isInView() || ATBannerView.this.mBannerRefreshTimer.a()) {
                    return;
                }
                com.anythink.core.common.j.e.b(ATBannerView.this.TAG, "in window load fail to countDown refresh!");
                ATBannerView.this.mBannerRefreshTimer.b();
            }

            @Override // com.anythink.core.common.b.a
            public final void onAdLoaded() {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.anythink.banner.b.a(this);
    }

    public ATBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = ATBannerView.class.getSimpleName();
        this.mScenario = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new e() { // from class: com.anythink.banner.api.ATBannerView.1
            @Override // com.anythink.banner.a.e
            public final void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClicked(j.a(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView.this.mListener.onBannerClose(j.a(customBannerAdapter));
                        }
                    }
                });
                ATBannerView.this.canRenderBanner = true;
                ATBannerView.this.loadAd(1);
            }

            @Override // com.anythink.banner.a.e
            public final void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z) {
                                ATBannerView.this.mListener.onBannerShow(j.a(customBannerAdapter));
                            } else {
                                ATBannerView.this.mListener.onBannerAutoRefreshed(j.a(customBannerAdapter));
                            }
                        }
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDeeplinkCallback(ATBannerView.this.mIsRefresh, j.a(customBannerAdapter), z);
                    }
                });
            }

            @Override // com.anythink.banner.a.e
            public final void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !(ATBannerView.this.mListener instanceof ATBannerExListener)) {
                            return;
                        }
                        ((ATBannerExListener) ATBannerView.this.mListener).onDownloadConfirm(context2, j.a(customBannerAdapter), aTNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new a() { // from class: com.anythink.banner.api.ATBannerView.2
            @Override // com.anythink.core.common.b.a
            public final void onAdLoadFail(final AdError adError) {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener == null || !ATBannerView.this.canRenderBanner) {
                            return;
                        }
                        ATBannerView aTBannerView = ATBannerView.this;
                        if (aTBannerView.mIsRefresh) {
                            aTBannerView.mListener.onBannerAutoRefreshFail(adError);
                        } else {
                            aTBannerView.mListener.onBannerFailed(adError);
                        }
                    }
                });
                if (ATBannerView.this.mAdLoadManager == null || !ATBannerView.this.isInView() || ATBannerView.this.mBannerRefreshTimer.a()) {
                    return;
                }
                com.anythink.core.common.j.e.b(ATBannerView.this.TAG, "in window load fail to countDown refresh!");
                ATBannerView.this.mBannerRefreshTimer.b();
            }

            @Override // com.anythink.core.common.b.a
            public final void onAdLoaded() {
                m.a().a(new Runnable() { // from class: com.anythink.banner.api.ATBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ATBannerView.this.mListener != null) {
                            ATBannerView aTBannerView = ATBannerView.this;
                            if (!aTBannerView.mIsRefresh) {
                                aTBannerView.mListener.onBannerLoaded();
                            }
                        }
                        ATBannerView.this.controlShow();
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.anythink.banner.b.a(this);
    }
}