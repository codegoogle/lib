package com.anythink.network.admob;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class GoogleAdATNativeAd extends CustomNativeAd implements NativeAd.OnNativeAdLoadedListener {
    public Context a;
    public LoadCallbackListener b;
    public String c;
    public MediaView d;
    public NativeAd e;
    public int f;
    public NativeAdView g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    /* loaded from: classes2.dex */
    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public GoogleAdATNativeAd(Context context, String str, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.f = 0;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.a = context.getApplicationContext();
        this.b = loadCallbackListener;
        this.c = str;
    }

    private NativeAdView a() {
        NativeAdView nativeAdView = new NativeAdView(this.a);
        nativeAdView.setNativeAd(this.e);
        return nativeAdView;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void clear(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.g;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.g = null;
        }
        this.d = null;
        this.b = null;
        this.a = null;
        NativeAd nativeAd = this.e;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.e = null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        VideoController videoController;
        if (this.g == null) {
            this.g = a();
        }
        MediaView mediaView = new MediaView(this.a);
        this.d = mediaView;
        if (this.g != null) {
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.e;
            if (nativeAd != null) {
                MediaContent mediaContent = nativeAd.getMediaContent();
                this.d.setMediaContent(mediaContent);
                if (mediaContent != null && (videoController = mediaContent.getVideoController()) != null) {
                    videoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: com.anythink.network.admob.GoogleAdATNativeAd.2
                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoEnd() {
                            super.onVideoEnd();
                            GoogleAdATNativeAd.this.notifyAdVideoEnd();
                        }

                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoMute(boolean z) {
                            super.onVideoMute(z);
                        }

                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoPause() {
                            super.onVideoPause();
                        }

                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoPlay() {
                            super.onVideoPlay();
                        }

                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoStart() {
                            super.onVideoStart();
                            GoogleAdATNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
                this.g.setMediaView(this.d);
                this.g.setNativeAd(this.e);
            }
        }
        return this.d;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView a = a();
        this.g = a;
        return a;
    }

    public void loadAd(Context context) {
        new AdLoader.Builder(context, this.c).forNativeAd(this).withAdListener(new AdListener() { // from class: com.anythink.network.admob.GoogleAdATNativeAd.1
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClicked() {
                GoogleAdATNativeAd.this.notifyAdClicked();
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
                LoadCallbackListener loadCallbackListener = GoogleAdATNativeAd.this.b;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                }
                GoogleAdATNativeAd.this.b = null;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                GoogleAdATNativeAd.this.notifyAdImpression();
            }
        }).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).setMediaAspectRatio(this.f).build()).build().loadAd(new AdManagerAdRequest.Builder().build());
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        this.e = nativeAd;
        setTitle(nativeAd.getHeadline());
        setDescriptionText(this.e.getBody());
        NativeAd nativeAd2 = this.e;
        if (nativeAd2 != null && nativeAd2.getIcon() != null && this.e.getIcon().getUri() != null) {
            setIconImageUrl(this.e.getIcon().getUri().toString());
        }
        NativeAd nativeAd3 = this.e;
        if (nativeAd3 != null && nativeAd3.getImages() != null && this.e.getImages().size() > 0 && this.e.getImages().get(0).getUri() != null) {
            NativeAd.Image image = this.e.getImages().get(0);
            if (image.getDrawable() != null) {
                setMainImageUrl(image.getUri().toString());
                setMainImageWidth(image.getDrawable().getIntrinsicWidth());
                setMainImageHeight(image.getDrawable().getIntrinsicHeight());
            } else {
                setMainImageUrl(image.getUri().toString());
            }
        }
        setCallToActionText(this.e.getCallToAction());
        setStarRating(Double.valueOf(this.e.getStarRating() == null ? 5.0d : this.e.getStarRating().doubleValue()));
        setAdFrom(this.e.getStore());
        MediaContent mediaContent = this.e.getMediaContent();
        if (mediaContent != null && mediaContent.hasVideoContent()) {
            this.mAdSourceType = "1";
        } else {
            this.mAdSourceType = "2";
        }
        LoadCallbackListener loadCallbackListener = this.b;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.b = null;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        try {
            View titleView = aTNativePrepareInfo.getTitleView();
            View descView = aTNativePrepareInfo.getDescView();
            View ctaView = aTNativePrepareInfo.getCtaView();
            View mainImageView = aTNativePrepareInfo.getMainImageView();
            View iconView = aTNativePrepareInfo.getIconView();
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                for (View view2 : clickViewList) {
                    if (titleView != null && view2 == titleView) {
                        this.g.setHeadlineView(view2);
                    } else if (descView != null && view2 == descView) {
                        this.g.setBodyView(view2);
                    } else if (ctaView != null && view2 == ctaView) {
                        this.g.setCallToActionView(view2);
                    } else if (iconView != null && view2 == iconView) {
                        this.g.setIconView(view2);
                    } else if (mainImageView != null && view2 == mainImageView && (view2 instanceof ImageView)) {
                        this.g.setImageView(view2);
                    }
                }
                return;
            }
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            if (titleView != null) {
                this.h = true;
                this.g.setHeadlineView(titleView);
            }
            if (descView != null) {
                this.i = true;
                this.g.setBodyView(descView);
            }
            if (ctaView != null) {
                this.j = true;
                this.g.setCallToActionView(ctaView);
            }
            if (iconView != null) {
                this.l = true;
                this.g.setIconView(iconView);
            }
            if (mainImageView != null && (mainImageView instanceof ImageView)) {
                this.k = true;
                this.g.setImageView(mainImageView);
            }
            if (this.h && this.i && this.j && this.l && this.k) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.g);
            for (int i = 0; i < arrayList.size(); i++) {
                View view3 = (View) arrayList.get(i);
                if (!this.l) {
                    this.l = true;
                    this.g.setIconView(view3);
                } else if (this.k) {
                    return;
                } else {
                    this.k = true;
                    this.g.setImageView(view3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z) {
        this.m = z;
    }

    private void a(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.d) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(list, viewGroup.getChildAt(i));
            }
        } else if (view instanceof ImageView) {
            if (this.l && this.k) {
                return;
            }
            list.add(view);
        } else if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.e;
            if (nativeAd == null || this.g == null) {
                return;
            }
            if (!this.h && charSequence.equals(nativeAd.getHeadline())) {
                this.h = true;
                this.g.setHeadlineView(view);
            }
            if (!this.i && charSequence.equals(this.e.getBody())) {
                this.i = true;
                this.g.setBodyView(view);
            }
            if (this.j || !charSequence.equals(this.e.getCallToAction())) {
                return;
            }
            this.j = true;
            this.g.setCallToActionView(view);
        }
    }

    public GoogleAdATNativeAd(Context context, String str, String str2, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this(context, str2, loadCallbackListener, map);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f = 1;
                return;
            case 1:
                this.f = 2;
                return;
            case 2:
                this.f = 3;
                return;
            case 3:
                this.f = 4;
                return;
            default:
                this.f = 0;
                return;
        }
    }
}