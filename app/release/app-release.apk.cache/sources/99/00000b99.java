package com.anythink.network.admob;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.api.ATAdConst;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdmobATNativeAd extends CustomNativeAd implements NativeAd.OnNativeAdLoadedListener {
    public Context a;
    public LoadCallbackListener b;
    public String c;
    public MediaView d;
    public NativeAd e;
    public int f;
    public int g;
    public NativeAdView h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    private final String o;

    /* loaded from: classes2.dex */
    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public AdmobATNativeAd(Context context, String str, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.o = AdmobATNativeAd.class.getSimpleName();
        this.f = 0;
        this.g = -1;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
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
        NativeAdView nativeAdView = this.h;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.h = null;
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
        if (this.h == null) {
            this.h = a();
        }
        if (this.d == null) {
            MediaView mediaView = new MediaView(this.a);
            this.d = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.e;
            if (nativeAd != null) {
                MediaContent mediaContent = nativeAd.getMediaContent();
                this.d.setMediaContent(mediaContent);
                if (mediaContent != null && (videoController = mediaContent.getVideoController()) != null) {
                    videoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: com.anythink.network.admob.AdmobATNativeAd.2
                        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                        public final void onVideoEnd() {
                            super.onVideoEnd();
                            AdmobATNativeAd.this.notifyAdVideoEnd();
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
                            AdmobATNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
                this.h.setMediaView(this.d);
                this.h.setNativeAd(this.e);
            }
        }
        return this.d;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView a = a();
        this.h = a;
        return a;
    }

    public void loadAd(Context context, Bundle bundle) {
        NativeAdOptions.Builder mediaAspectRatio = new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).setMediaAspectRatio(this.f);
        int i = this.g;
        if (i != -1) {
            mediaAspectRatio.setAdChoicesPlacement(i);
        }
        new AdLoader.Builder(context, this.c).forNativeAd(this).withAdListener(new AdListener() { // from class: com.anythink.network.admob.AdmobATNativeAd.1
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClicked() {
                AdmobATNativeAd.this.notifyAdClicked();
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                LoadCallbackListener loadCallbackListener = AdmobATNativeAd.this.b;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                }
                AdmobATNativeAd.this.b = null;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                AdmobATNativeAd.this.notifyAdImpression();
            }
        }).withNativeAdOptions(mediaAspectRatio.build()).build().loadAd(new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build());
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        NativeAd.Image image;
        this.e = nativeAd;
        setTitle(nativeAd.getHeadline());
        setDescriptionText(this.e.getBody());
        NativeAd nativeAd2 = this.e;
        if (nativeAd2 != null && nativeAd2.getIcon() != null && this.e.getIcon().getUri() != null) {
            setIconImageUrl(this.e.getIcon().getUri().toString());
        }
        List<NativeAd.Image> images = this.e.getImages();
        if (images != null && images.size() > 0 && (image = images.get(0)) != null) {
            setMainImageUrl(image.getUri().toString());
            Drawable drawable = image.getDrawable();
            if (drawable != null) {
                setMainImageWidth(drawable.getIntrinsicWidth());
                setMainImageHeight(drawable.getIntrinsicHeight());
            }
        }
        setCallToActionText(this.e.getCallToAction());
        setStarRating(Double.valueOf(this.e.getStarRating() == null ? 5.0d : this.e.getStarRating().doubleValue()));
        setAdFrom(this.e.getStore());
        try {
            setAppPrice(Double.valueOf(this.e.getPrice()).doubleValue());
        } catch (Exception unused) {
        }
        setAdvertiserName(this.e.getAdvertiser());
        MediaContent mediaContent = this.e.getMediaContent();
        if (mediaContent != null && mediaContent.hasVideoContent()) {
            setVideoDuration(mediaContent.getDuration());
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
                        this.h.setHeadlineView(view2);
                    } else if (descView != null && view2 == descView) {
                        this.h.setBodyView(view2);
                    } else if (ctaView != null && view2 == ctaView) {
                        this.h.setCallToActionView(view2);
                    } else if (iconView != null && view2 == iconView) {
                        this.h.setIconView(view2);
                    } else if (mainImageView != null && view2 == mainImageView && (view2 instanceof ImageView)) {
                        this.h.setImageView(view2);
                    }
                }
                return;
            }
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = false;
            if (titleView != null) {
                this.i = true;
                this.h.setHeadlineView(titleView);
            }
            if (descView != null) {
                this.j = true;
                this.h.setBodyView(descView);
            }
            if (ctaView != null) {
                this.k = true;
                this.h.setCallToActionView(ctaView);
            }
            if (iconView != null) {
                this.m = true;
                this.h.setIconView(iconView);
            }
            if (mainImageView != null && (mainImageView instanceof ImageView)) {
                this.l = true;
                this.h.setImageView(mainImageView);
            }
            if (this.i && this.j && this.k && this.m && this.l) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.h);
            for (int i = 0; i < arrayList.size(); i++) {
                View view3 = (View) arrayList.get(i);
                if (!this.m) {
                    this.m = true;
                    this.h.setIconView(view3);
                } else if (this.l) {
                    return;
                } else {
                    this.l = true;
                    this.h.setImageView(view3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z) {
        this.n = z;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void setVideoMute(boolean z) {
        super.setVideoMute(z);
        NativeAd nativeAd = this.e;
        if (nativeAd == null || nativeAd.getMediaContent() == null || this.e.getMediaContent().getVideoController() == null) {
            return;
        }
        this.e.getMediaContent().getVideoController().mute(z);
    }

    private void a(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.d) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(list, viewGroup.getChildAt(i));
            }
        } else if (view instanceof ImageView) {
            if (this.m && this.l) {
                return;
            }
            list.add(view);
        } else if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.e;
            if (nativeAd == null || this.h == null) {
                return;
            }
            if (!this.i && charSequence.equals(nativeAd.getHeadline())) {
                this.i = true;
                this.h.setHeadlineView(view);
            }
            if (!this.j && charSequence.equals(this.e.getBody())) {
                this.j = true;
                this.h.setBodyView(view);
            }
            if (this.k || !charSequence.equals(this.e.getCallToAction())) {
                return;
            }
            this.k = true;
            this.h.setCallToActionView(view);
        }
    }

    public AdmobATNativeAd(Context context, String str, String str2, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this(context, str2, loadCallbackListener, map);
        if (!TextUtils.isEmpty(str)) {
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
                    break;
                case 1:
                    this.f = 2;
                    break;
                case 2:
                    this.f = 3;
                    break;
                case 3:
                    this.f = 4;
                    break;
                default:
                    this.f = 0;
                    break;
            }
        }
        if (map != null) {
            try {
                if (map.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    int parseInt = Integer.parseInt(map.get(ATAdConst.KEY.AD_CHOICES_PLACEMENT).toString());
                    if (parseInt == 0) {
                        this.g = 0;
                    } else if (parseInt == 1) {
                        this.g = 1;
                    } else if (parseInt == 2) {
                        this.g = 2;
                    } else if (parseInt != 3) {
                    } else {
                        this.g = 3;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}