package com.anythink.nativead.unitgroup.api;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.a;
import com.p7700g.p99005.zg2;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class CustomNativeAd extends a {
    public static String IS_AUTO_PLAY_KEY = "is_auto_play";
    public static final double MAX_STAR_RATING = 5.0d;
    public static final double MIN_STAR_RATING = 0.0d;
    private ATAdAppInfo adAppInfo;
    private View adLogoView;
    @Deprecated
    private ExtraInfo extraInfo;
    private String mAdChoiceIconUrl;
    private String mAdFrom;
    private String mAdvertiserName;
    private int mAppCommentNum;
    private View mAppDownloadButton;
    private double mAppPrice;
    private String mCallToAction;
    private String mClickDestinationUrl;
    private View.OnClickListener mCloseViewListener;
    private String mIconImageUrl;
    private List<String> mImageUrlList;
    private int mMainImageHeight;
    private String mMainImageUrl;
    private int mMainImageWidth;
    private int mNativeExpressHeight;
    private int mNativeExpressWidth;
    private Map<String, Object> mNetworkInfoMap;
    private String mText;
    private String mTitle;
    private int mVideoHeight;
    private String mVideoUrl;
    private int mVideoWidth;
    private String showId;
    private double videoDuration;
    private Double mStarRating = Double.valueOf((double) zg2.s);
    private int nInteractionType = 0;

    @Deprecated
    /* loaded from: classes2.dex */
    public static class ExtraInfo {
        public int adLogoViewId;
        public int calltoActionViewId;
        public View closeView;
        public List<View> creativeViews;
        public List<View> customViews;
        public int descriptionViewId;
        public int iconViewId;
        public int mainImageViewId;
        public int parentViewId;
        public int sourceViewId;
        public int titleViewId;

        /* loaded from: classes2.dex */
        public static class Builder {
            public int adLogoViewId;
            public int calltoActionViewId;
            public View closeView;
            public List<View> creativeViews;
            public List<View> customViews;
            public int descriptionViewId;
            public int iconViewId;
            public int mainImageViewId;
            public int parentViewId;
            public int sourceViewId;
            public int titleViewId;

            public ExtraInfo build() {
                ExtraInfo extraInfo = new ExtraInfo();
                extraInfo.setParentViewId(this.parentViewId);
                extraInfo.setCloseView(this.closeView);
                extraInfo.setAdLogoViewId(this.adLogoViewId);
                extraInfo.setCalltoActionViewId(this.calltoActionViewId);
                extraInfo.setCreativeViews(this.creativeViews);
                extraInfo.setDescriptionViewId(this.descriptionViewId);
                extraInfo.setIconViewId(this.iconViewId);
                extraInfo.setTitleViewId(this.titleViewId);
                extraInfo.setMainImageViewId(this.mainImageViewId);
                extraInfo.setSourceViewId(this.sourceViewId);
                extraInfo.setCustomViews(this.customViews);
                return extraInfo;
            }

            public Builder setAdLogoViewId(int i) {
                this.adLogoViewId = i;
                return this;
            }

            public Builder setCalltoActionViewId(int i) {
                this.calltoActionViewId = i;
                return this;
            }

            public Builder setCloseView(View view) {
                this.closeView = view;
                return this;
            }

            public Builder setCreativeViewList(List<View> list) {
                this.creativeViews = list;
                return this;
            }

            public Builder setCustomViewList(List<View> list) {
                this.customViews = list;
                return this;
            }

            public Builder setDescriptionViewId(int i) {
                this.descriptionViewId = i;
                return this;
            }

            public Builder setIconViewId(int i) {
                this.iconViewId = i;
                return this;
            }

            public Builder setMainImageViewId(int i) {
                this.mainImageViewId = i;
                return this;
            }

            public Builder setParentId(int i) {
                this.parentViewId = i;
                return this;
            }

            public Builder setSourceViewId(int i) {
                this.sourceViewId = i;
                return this;
            }

            public Builder setTitleViewId(int i) {
                this.titleViewId = i;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdLogoViewId(int i) {
            this.adLogoViewId = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalltoActionViewId(int i) {
            this.calltoActionViewId = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloseView(View view) {
            this.closeView = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeViews(List<View> list) {
            this.creativeViews = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomViews(List<View> list) {
            this.customViews = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionViewId(int i) {
            this.descriptionViewId = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconViewId(int i) {
            this.iconViewId = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMainImageViewId(int i) {
            this.mainImageViewId = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParentViewId(int i) {
            this.parentViewId = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceViewId(int i) {
            this.sourceViewId = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleViewId(int i) {
            this.titleViewId = i;
        }

        public int getAdLogoViewId() {
            return this.adLogoViewId;
        }

        public int getCalltoActionViewId() {
            return this.calltoActionViewId;
        }

        public View getCloseView() {
            return this.closeView;
        }

        public List<View> getCreativeViews() {
            return this.creativeViews;
        }

        public List<View> getCustomViews() {
            return this.customViews;
        }

        public int getDescriptionViewId() {
            return this.descriptionViewId;
        }

        public int getIconViewId() {
            return this.iconViewId;
        }

        public int getMainImageViewId() {
            return this.mainImageViewId;
        }

        public int getParentViewId() {
            return this.parentViewId;
        }

        public int getSourceViewId() {
            return this.sourceViewId;
        }

        public int getTitleViewId() {
            return this.titleViewId;
        }
    }

    /* loaded from: classes2.dex */
    public class NativeAdConst {
        public static final String IMAGE_TYPE = "2";
        public static final String UNKNOWN_TYPE = "0";
        public static final String VIDEO_TYPE = "1";

        public NativeAdConst() {
        }
    }

    /* loaded from: classes2.dex */
    public class NativeType {
        public static final int FEED = 1;
        public static final int PATCH = 2;

        public NativeType() {
        }
    }

    @Override // com.anythink.nativead.unitgroup.a
    public final void bindDislikeListener(View.OnClickListener onClickListener) {
        View closeView;
        View closeView2;
        this.mCloseViewListener = onClickListener;
        ExtraInfo extraInfo = getExtraInfo();
        if (extraInfo != null && (closeView2 = extraInfo.getCloseView()) != null) {
            closeView2.setOnClickListener(this.mCloseViewListener);
        }
        ATNativePrepareInfo nativePrepareInfo = getNativePrepareInfo();
        if (nativePrepareInfo == null || (closeView = nativePrepareInfo.getCloseView()) == null) {
            return;
        }
        closeView.setOnClickListener(this.mCloseViewListener);
    }

    public final boolean checkHasCloseViewListener() {
        return this.mCloseViewListener != null;
    }

    @Override // com.anythink.nativead.unitgroup.a
    public void clear(View view) {
    }

    @Override // com.anythink.core.api.BaseAd
    public void destroy() {
        this.mCloseViewListener = null;
        this.extraInfo = null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public ATAdAppInfo getAdAppInfo() {
        return this.adAppInfo;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        return this.mAdChoiceIconUrl;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public String getAdFrom() {
        return this.mAdFrom;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdIconView() {
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public Bitmap getAdLogo() {
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdLogoView() {
        return this.adLogoView;
    }

    @Override // com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public String getAdvertiserName() {
        return this.mAdvertiserName;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getAppCommentNum() {
        return this.mAppCommentNum;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public View getAppDownloadButton() {
        return this.mAppDownloadButton;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public double getAppPrice() {
        return this.mAppPrice;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public String getCallToActionText() {
        return this.mCallToAction;
    }

    @Override // com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public String getDescriptionText() {
        return this.mText;
    }

    @Deprecated
    public ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public String getIconImageUrl() {
        return this.mIconImageUrl;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final List<String> getImageUrlList() {
        return this.mImageUrlList;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getMainImageHeight() {
        int i = this.mMainImageHeight;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public String getMainImageUrl() {
        return this.mMainImageUrl;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getMainImageWidth() {
        int i = this.mMainImageWidth;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getNativeAdInteractionType() {
        return this.nInteractionType;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public ATCustomVideo getNativeCustomVideo() {
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getNativeExpressHeight() {
        int i = this.mNativeExpressHeight;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getNativeExpressWidth() {
        int i = this.mNativeExpressWidth;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getNativeType() {
        return 1;
    }

    @Override // com.anythink.core.api.BaseAd, com.anythink.core.api.IATThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        return this.mNetworkInfoMap;
    }

    public final String getShowId() {
        return this.showId;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Double getStarRating() {
        return this.mStarRating;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public String getTitle() {
        return this.mTitle;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public double getVideoDuration() {
        return this.videoDuration;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getVideoHeight() {
        int i = this.mVideoHeight;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public double getVideoProgress() {
        return zg2.s;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getVideoUrl() {
        return this.mVideoUrl;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public int getVideoWidth() {
        int i = this.mVideoWidth;
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public void impressionTrack(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.a
    public boolean isNativeExpress() {
        return false;
    }

    @Override // com.anythink.nativead.unitgroup.a
    public void onPause() {
    }

    @Override // com.anythink.nativead.unitgroup.a
    public void onResume() {
    }

    @Override // com.anythink.nativead.unitgroup.a
    public void pauseVideo() {
    }

    @Override // com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
    }

    public void registerDownloadConfirmListener() {
    }

    @Override // com.anythink.core.api.BaseAd
    public void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams) {
        ATNativePrepareInfo aTNativePrepareInfo = new ATNativePrepareInfo();
        aTNativePrepareInfo.setClickViewList(list);
        aTNativePrepareInfo.setChoiceViewLayoutParams(layoutParams);
        prepare(view, aTNativePrepareInfo);
    }

    @Override // com.anythink.nativead.unitgroup.a
    public void resumeVideo() {
    }

    public final void setAdAppInfo(ATAdAppInfo aTAdAppInfo) {
        this.adAppInfo = aTAdAppInfo;
    }

    public final void setAdChoiceIconUrl(String str) {
        this.mAdChoiceIconUrl = str;
    }

    public final void setAdFrom(String str) {
        this.mAdFrom = str;
    }

    public final void setAdLogoView(View view) {
        this.adLogoView = view;
    }

    public void setAdvertiserName(String str) {
        this.mAdvertiserName = str;
    }

    public void setAppCommentNum(int i) {
        this.mAppCommentNum = i;
    }

    public void setAppDownloadButton(View view) {
        this.mAppDownloadButton = view;
    }

    public void setAppPrice(double d) {
        this.mAppPrice = d;
    }

    public final void setCallToActionText(String str) {
        this.mCallToAction = str;
    }

    public final void setDescriptionText(String str) {
        this.mText = str;
    }

    @Deprecated
    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public final void setIconImageUrl(String str) {
        this.mIconImageUrl = str;
    }

    public final void setImageUrlList(List<String> list) {
        this.mImageUrlList = list;
    }

    public void setMainImageHeight(int i) {
        this.mMainImageHeight = i;
    }

    public final void setMainImageUrl(String str) {
        this.mMainImageUrl = str;
    }

    public void setMainImageWidth(int i) {
        this.mMainImageWidth = i;
    }

    public void setNativeExpressHeight(int i) {
        this.mNativeExpressHeight = i;
    }

    public void setNativeExpressWidth(int i) {
        this.mNativeExpressWidth = i;
    }

    public final void setNativeInteractionType(int i) {
        this.nInteractionType = i;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNetworkInfoMap(Map<String, Object> map) {
        this.mNetworkInfoMap = map;
    }

    public final void setShowId(String str) {
        this.showId = str;
    }

    public final void setStarRating(Double d) {
        if (d == null) {
            this.mStarRating = null;
        } else if (d.doubleValue() < zg2.s || d.doubleValue() > 5.0d) {
        } else {
            this.mStarRating = d;
        }
    }

    public final void setTitle(String str) {
        this.mTitle = str;
    }

    public final void setVideoDuration(double d) {
        this.videoDuration = d;
    }

    public void setVideoHeight(int i) {
        this.mVideoHeight = i;
    }

    @Override // com.anythink.nativead.unitgroup.a
    public void setVideoMute(boolean z) {
    }

    public final void setVideoUrl(String str) {
        this.mVideoUrl = str;
    }

    public void setVideoWidth(int i) {
        this.mVideoWidth = i;
    }

    public void unregeisterDownloadConfirmListener() {
    }
}