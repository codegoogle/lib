package com.anythink.nativead.api;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.l;
import com.anythink.core.common.e.b;
import com.anythink.core.common.e.e;
import com.anythink.core.common.f;
import com.anythink.core.common.j.m;
import com.anythink.core.common.j.p;
import com.anythink.core.common.t;
import com.anythink.core.common.u;
import com.anythink.nativead.unitgroup.a;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.p7700g.p99005.zg2;
import java.util.List;

/* loaded from: classes2.dex */
public class NativeAd {
    private boolean hasSetShowTkDetail;
    private b mAdCacheInfo;
    private ATNativeAdRenderer mAdRender;
    public a mBaseNativeAd;
    public DownloadConfirmListener mConfirmListener;
    private Context mContext;
    private ATNativeDislikeListener mDislikeListener;
    public ATEventInterface mEventInterface;
    private boolean mIsDestroyed;
    private ATNativeEventListener mNativeEventListener;
    public ATNativeAdView mNativeView;
    private String mPlacementId;
    private boolean mRecordedImpression;
    private boolean mRecordedShow;
    public ATNativeMaterial nativeMaterial;
    private final String TAG = getClass().getSimpleName();
    public View.OnClickListener mDefaultCloseViewListener = new View.OnClickListener() { // from class: com.anythink.nativead.api.NativeAd.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = NativeAd.this.mBaseNativeAd;
            if (aVar != null) {
                aVar.notifyAdDislikeClick();
            }
        }
    };
    public boolean isManualImpressionTrack = false;

    /* loaded from: classes2.dex */
    public interface DownloadConfirmListener {
        void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo);
    }

    /* loaded from: classes2.dex */
    public interface ImpressionEventListener {
        void onImpression();
    }

    public NativeAd(Context context, String str, b bVar) {
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mAdCacheInfo = bVar;
        a aVar = (a) bVar.f();
        this.mBaseNativeAd = aVar;
        aVar.setNativeEventListener(new l() { // from class: com.anythink.nativead.api.NativeAd.1
            @Override // com.anythink.core.common.b.l
            public final void onAdClicked(View view) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleClick(nativeAd.mNativeView, view);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdDislikeButtonClick() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleAdDislikeButtonClick(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdImpressed() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleImpression(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoEnd() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoEnd(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoProgress(int i) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoProgress(nativeAd.mNativeView, i);
            }

            @Override // com.anythink.core.common.b.l
            public final void onAdVideoStart() {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleVideoStart(nativeAd.mNativeView);
            }

            @Override // com.anythink.core.common.b.l
            public final void onDeeplinkCallback(boolean z) {
                NativeAd nativeAd = NativeAd.this;
                nativeAd.handleDeeplinkCallback(nativeAd.mNativeView, z);
            }

            @Override // com.anythink.core.common.b.l
            public final void onDownloadConfirmCallback(Context context2, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                NativeAd.this.handleDownloadConfirm(context2, view, aTNetworkConfirmInfo);
            }
        });
        a aVar2 = this.mBaseNativeAd;
        if (aVar2 instanceof CustomNativeAd) {
            this.nativeMaterial = new com.anythink.nativead.a.b((CustomNativeAd) aVar2);
        }
    }

    private void bindListener() {
        View closeView;
        View closeView2;
        a aVar = this.mBaseNativeAd;
        if (aVar instanceof CustomNativeAd) {
            CustomNativeAd customNativeAd = (CustomNativeAd) aVar;
            if (customNativeAd.checkHasCloseViewListener()) {
                return;
            }
            CustomNativeAd.ExtraInfo extraInfo = customNativeAd.getExtraInfo();
            if (extraInfo != null && (closeView2 = extraInfo.getCloseView()) != null) {
                closeView2.setOnClickListener(this.mDefaultCloseViewListener);
            }
            ATNativePrepareInfo nativePrepareInfo = customNativeAd.getNativePrepareInfo();
            if (nativePrepareInfo == null || (closeView = nativePrepareInfo.getCloseView()) == null) {
                return;
            }
            closeView.setOnClickListener(this.mDefaultCloseViewListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fillShowTrackingInfo(e eVar) {
        if (!this.hasSetShowTkDetail) {
            String b = u.a().b(this.mPlacementId);
            this.hasSetShowTkDetail = true;
            if (eVar != null) {
                eVar.v = b;
                p.a(this.mContext, eVar);
            }
        }
    }

    private void renderViewToWindow(View view) {
        m.a(this.mPlacementId, g.i.l, g.i.r, g.i.h, "");
        ViewGroup customAdContainer = this.mBaseNativeAd.getCustomAdContainer();
        int hashCode = hashCode();
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (customAdContainer != null) {
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            customAdContainer.addView(view);
        }
        if (customAdContainer != null) {
            view = customAdContainer;
        }
        this.mNativeView.renderView(hashCode, view, new ImpressionEventListener() { // from class: com.anythink.nativead.api.NativeAd.3
            @Override // com.anythink.nativead.api.NativeAd.ImpressionEventListener
            public final void onImpression() {
                long currentTimeMillis = System.currentTimeMillis();
                a aVar = NativeAd.this.mBaseNativeAd;
                e detail = aVar != null ? aVar.getDetail() : null;
                if (detail != null && TextUtils.isEmpty(detail.k())) {
                    detail.h(com.anythink.core.common.j.g.a(detail.T(), detail.w(), currentTimeMillis));
                }
                a aVar2 = NativeAd.this.mBaseNativeAd;
                if (aVar2 instanceof CustomNativeAd) {
                    ((CustomNativeAd) aVar2).setShowId(detail.k());
                }
                NativeAd nativeAd = NativeAd.this;
                nativeAd.recordShow(nativeAd.mNativeView);
            }
        });
    }

    public synchronized void clear(ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        try {
            a aVar = this.mBaseNativeAd;
            if (aVar != null) {
                aVar.clear(this.mNativeView);
            }
        } catch (Throwable unused) {
        }
        ATNativeAdView aTNativeAdView2 = this.mNativeView;
        if (aTNativeAdView2 != null) {
            aTNativeAdView2.clearImpressionListener(hashCode());
            this.mNativeView = null;
        }
    }

    public synchronized void destory() {
        if (this.mIsDestroyed) {
            return;
        }
        clear(this.mNativeView);
        this.mIsDestroyed = true;
        this.mNativeEventListener = null;
        this.mDislikeListener = null;
        this.mDefaultCloseViewListener = null;
        this.mNativeView = null;
        a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    public ATAdInfo getAdInfo() {
        return j.a(this.mBaseNativeAd);
    }

    public int getAdInteractionType() {
        a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return 0;
        }
        return ((CustomNativeAd) aVar).getNativeAdInteractionType();
    }

    public ATNativeMaterial getAdMaterial() {
        return this.nativeMaterial;
    }

    @Deprecated
    public ATCustomVideo getCustomVideo() {
        a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return null;
        }
        return ((CustomNativeAd) aVar).getNativeCustomVideo();
    }

    public int getNativeType() {
        a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return 0;
        }
        return ((CustomNativeAd) aVar).getNativeType();
    }

    public double getVideoDuration() {
        a aVar = this.mBaseNativeAd;
        return (aVar == null || !(aVar instanceof CustomNativeAd)) ? zg2.s : ((CustomNativeAd) aVar).getVideoDuration();
    }

    public double getVideoProgress() {
        a aVar = this.mBaseNativeAd;
        return (aVar == null || !(aVar instanceof CustomNativeAd)) ? zg2.s : ((CustomNativeAd) aVar).getVideoProgress();
    }

    public synchronized void handleAdDislikeButtonClick(final ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.9
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mDislikeListener != null) {
                    NativeAd.this.mDislikeListener.onAdCloseButtonClick(aTNativeAdView, j.a(NativeAd.this.mBaseNativeAd));
                }
            }
        });
    }

    public synchronized void handleClick(final ATNativeAdView aTNativeAdView, View view) {
        if (this.mIsDestroyed) {
            return;
        }
        a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            e detail = aVar.getDetail();
            com.anythink.core.common.j.g.a(detail, g.i.d, g.i.f, "");
            com.anythink.core.common.i.a.a(this.mContext.getApplicationContext()).a(6, detail);
        }
        com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.7
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdClicked(aTNativeAdView, j.a(NativeAd.this.mBaseNativeAd));
                }
            }
        });
    }

    public synchronized void handleDeeplinkCallback(ATNativeAdView aTNativeAdView, boolean z) {
        if (this.mIsDestroyed) {
            return;
        }
        ATNativeEventListener aTNativeEventListener = this.mNativeEventListener;
        if (aTNativeEventListener != null && (aTNativeEventListener instanceof ATNativeEventExListener)) {
            ((ATNativeEventExListener) aTNativeEventListener).onDeeplinkCallback(aTNativeAdView, j.a(this.mBaseNativeAd), z);
        }
    }

    public synchronized void handleDownloadConfirm(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        a aVar;
        if (this.mIsDestroyed) {
            return;
        }
        DownloadConfirmListener downloadConfirmListener = this.mConfirmListener;
        if (downloadConfirmListener != null && (aVar = this.mBaseNativeAd) != null) {
            if (context == null) {
                context = this.mContext;
            }
            downloadConfirmListener.onDownloadConfirm(context, j.a(aVar), view, aTNetworkConfirmInfo);
        }
    }

    public synchronized void handleImpression(final ATNativeAdView aTNativeAdView) {
        if (!this.mRecordedImpression && !this.mIsDestroyed) {
            this.mRecordedImpression = true;
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (NativeAd.this.mIsDestroyed) {
                        return;
                    }
                    try {
                        a aVar = NativeAd.this.mBaseNativeAd;
                        if (aVar != null) {
                            e detail = aVar.getDetail();
                            com.anythink.core.common.j.g.a(detail, g.i.c, g.i.f, "");
                            NativeAd.this.fillShowTrackingInfo(detail);
                            com.anythink.core.common.i.a.a(NativeAd.this.mContext.getApplicationContext()).a(4, detail, NativeAd.this.mAdCacheInfo.e().getUnitGroupInfo());
                            com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.6.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (NativeAd.this.mNativeEventListener != null) {
                                        ATNativeEventListener aTNativeEventListener = NativeAd.this.mNativeEventListener;
                                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                        aTNativeEventListener.onAdImpressed(aTNativeAdView, j.a(NativeAd.this.mBaseNativeAd));
                                    }
                                }
                            });
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public synchronized void handleVideoEnd(final ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            e detail = aVar.getDetail();
            detail.t = 100;
            com.anythink.core.common.i.a.a(this.mContext.getApplicationContext()).a(9, detail);
        }
        com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.10
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoEnd(aTNativeAdView);
                }
            }
        });
    }

    public synchronized void handleVideoProgress(final ATNativeAdView aTNativeAdView, final int i) {
        if (this.mIsDestroyed) {
            return;
        }
        com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.2
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoProgress(aTNativeAdView, i);
                }
            }
        });
    }

    public synchronized void handleVideoStart(final ATNativeAdView aTNativeAdView) {
        if (this.mIsDestroyed) {
            return;
        }
        a aVar = this.mBaseNativeAd;
        if (aVar != null) {
            e detail = aVar.getDetail();
            detail.t = 0;
            com.anythink.core.common.i.a.a(this.mContext.getApplicationContext()).a(8, detail);
        }
        com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.8
            @Override // java.lang.Runnable
            public final void run() {
                if (NativeAd.this.mNativeEventListener != null) {
                    NativeAd.this.mNativeEventListener.onAdVideoStart(aTNativeAdView);
                }
            }
        });
    }

    public boolean isNativeExpress() {
        a aVar = this.mBaseNativeAd;
        if (aVar == null || !(aVar instanceof CustomNativeAd)) {
            return false;
        }
        return ((CustomNativeAd) aVar).isNativeExpress();
    }

    public void manualImpressionTrack() {
        if (this.mIsDestroyed) {
            return;
        }
        if (!this.isManualImpressionTrack) {
            com.anythink.core.common.b.m.a().y();
            return;
        }
        ATNativeAdView aTNativeAdView = this.mNativeView;
        b bVar = this.mAdCacheInfo;
        ATBaseAdAdapter e = bVar != null ? bVar.e() : null;
        if (e != null && e.supportImpressionCallback()) {
            com.anythink.core.common.b.m.a().y();
        } else if (aTNativeAdView == null) {
            com.anythink.core.common.b.m.a().y();
        } else if (!aTNativeAdView.isShown()) {
            com.anythink.core.common.b.m.a().y();
        } else if (!aTNativeAdView.isAttachedToWindow()) {
            com.anythink.core.common.b.m.a().y();
        } else {
            com.anythink.core.common.b.m.a().y();
            a aVar = this.mBaseNativeAd;
            if (aVar instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar).impressionTrack(aTNativeAdView);
            }
        }
    }

    public void onPause() {
        a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.onPause();
    }

    public void onResume() {
        a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.onResume();
    }

    public void pauseVideo() {
        a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.pauseVideo();
    }

    public synchronized void prepare(ATNativeAdView aTNativeAdView) {
        prepare(aTNativeAdView, new ATNativePrepareInfo());
    }

    public synchronized void recordShow(ATNativeAdView aTNativeAdView) {
        if (!this.mRecordedShow) {
            final e detail = this.mBaseNativeAd.getDetail();
            this.mRecordedShow = true;
            b bVar = this.mAdCacheInfo;
            if (bVar != null) {
                bVar.a(bVar.d() + 1);
                f b = t.a().b(this.mPlacementId);
                if (b != null) {
                    b.a(this.mAdCacheInfo);
                    b.e();
                }
            }
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.nativead.api.NativeAd.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (NativeAd.this.mIsDestroyed || NativeAd.this.mAdCacheInfo == null) {
                        return;
                    }
                    NativeAd.this.fillShowTrackingInfo(detail);
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        String[] split = detail.k().split("_");
                        currentTimeMillis = Long.parseLong(split[split.length - 1]);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    long j = currentTimeMillis;
                    a aVar = NativeAd.this.mBaseNativeAd;
                    if (aVar != null && (aVar instanceof CustomNativeAd)) {
                        ((CustomNativeAd) aVar).setShowId(detail.k());
                    }
                    com.anythink.core.common.a.a().a(NativeAd.this.mContext.getApplicationContext(), NativeAd.this.mAdCacheInfo);
                    com.anythink.core.common.i.a.a(NativeAd.this.mContext).a(13, detail, NativeAd.this.mAdCacheInfo.e().getUnitGroupInfo(), j);
                }
            });
            ATBaseAdAdapter e = this.mAdCacheInfo.e();
            if (e != null && !e.supportImpressionCallback()) {
                a aVar = this.mBaseNativeAd;
                if ((aVar instanceof CustomNativeAd) && !this.isManualImpressionTrack) {
                    ((CustomNativeAd) aVar).impressionTrack(aTNativeAdView);
                }
            }
        }
    }

    public synchronized void renderAdContainer(ATNativeAdView aTNativeAdView, View view) {
        if (this.mIsDestroyed) {
            return;
        }
        if (aTNativeAdView != null) {
            aTNativeAdView.clear();
        }
        if (isNativeExpress()) {
            a aVar = this.mBaseNativeAd;
            if (aVar == null) {
                view = null;
            } else if (aTNativeAdView == null) {
                return;
            } else {
                view = aVar.getAdMediaView(aTNativeAdView, Integer.valueOf(aTNativeAdView.getWidth()));
                if (view == null) {
                    return;
                }
            }
        } else if (view == null) {
            return;
        }
        this.mNativeView = aTNativeAdView;
        aTNativeAdView.attachNativeAd(this);
        renderViewToWindow(view);
    }

    @Deprecated
    public synchronized void renderAdView(ATNativeAdView aTNativeAdView, ATNativeAdRenderer aTNativeAdRenderer) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mAdRender = aTNativeAdRenderer;
        if (aTNativeAdRenderer != null) {
            try {
                a aVar = this.mBaseNativeAd;
                if (aVar != null) {
                    aVar.clear(this.mNativeView);
                }
            } catch (Throwable unused) {
            }
            this.mNativeView = aTNativeAdView;
            e detail = this.mBaseNativeAd.getDetail();
            View createView = this.mAdRender.createView(this.mNativeView.getContext(), detail != null ? detail.G() : 0);
            if (createView != null) {
                renderViewToWindow(createView);
                ATNativeAdRenderer aTNativeAdRenderer2 = this.mAdRender;
                if (aTNativeAdRenderer2 != null) {
                    aTNativeAdRenderer2.renderAdView(createView, this.mBaseNativeAd);
                }
                return;
            }
            throw new Exception("not set render view!");
        }
        throw new Exception("Render cannot be null!");
    }

    public void resumeVideo() {
        a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.resumeVideo();
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mEventInterface = aTEventInterface;
        IExHandler b = com.anythink.core.common.b.m.a().b();
        if (b == null) {
            this.mBaseNativeAd.setDownloadListener(null);
        } else if (aTEventInterface != null) {
            this.mBaseNativeAd.setDownloadListener(b.createDownloadListener(this.mAdCacheInfo.e(), this.mBaseNativeAd, aTEventInterface));
        } else {
            this.mBaseNativeAd.setDownloadListener(null);
        }
    }

    public void setDislikeCallbackListener(ATNativeDislikeListener aTNativeDislikeListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mDislikeListener = aTNativeDislikeListener;
    }

    public void setDownloadConfirmListener(DownloadConfirmListener downloadConfirmListener) {
        if (downloadConfirmListener != null) {
            a aVar = this.mBaseNativeAd;
            if (aVar instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar).registerDownloadConfirmListener();
            }
        } else {
            a aVar2 = this.mBaseNativeAd;
            if (aVar2 instanceof CustomNativeAd) {
                ((CustomNativeAd) aVar2).unregeisterDownloadConfirmListener();
            }
        }
        this.mConfirmListener = downloadConfirmListener;
    }

    public void setManualImpressionTrack(boolean z) {
        this.isManualImpressionTrack = z;
    }

    public void setNativeEventListener(ATNativeEventListener aTNativeEventListener) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mNativeEventListener = aTNativeEventListener;
    }

    public void setVideoMute(boolean z) {
        a aVar;
        if (this.mIsDestroyed || (aVar = this.mBaseNativeAd) == null) {
            return;
        }
        aVar.setVideoMute(z);
    }

    @Deprecated
    public synchronized void prepare(ATNativeAdView aTNativeAdView, FrameLayout.LayoutParams layoutParams) {
        if (this.mIsDestroyed) {
            return;
        }
        if (aTNativeAdView != null) {
            prepare(aTNativeAdView, null, layoutParams);
        }
    }

    @Deprecated
    public synchronized void prepare(ATNativeAdView aTNativeAdView, List<View> list, FrameLayout.LayoutParams layoutParams) {
        if (this.mIsDestroyed) {
            return;
        }
        if (aTNativeAdView != null) {
            ATNativePrepareInfo aTNativePrepareInfo = new ATNativePrepareInfo();
            aTNativePrepareInfo.setClickViewList(list);
            aTNativePrepareInfo.setChoiceViewLayoutParams(layoutParams);
            prepare(aTNativeAdView, aTNativePrepareInfo);
        }
    }

    public synchronized void prepare(ATNativeAdView aTNativeAdView, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.mIsDestroyed) {
            return;
        }
        if (aTNativeAdView != null) {
            if (aTNativePrepareInfo == null) {
                aTNativePrepareInfo = new ATNativePrepareInfo();
            }
            this.mBaseNativeAd.setNativePrepareInfo(aTNativePrepareInfo);
            this.mBaseNativeAd.prepare(aTNativeAdView, aTNativePrepareInfo);
            bindListener();
        }
    }
}