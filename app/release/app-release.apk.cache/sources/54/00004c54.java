package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.greedygame.mystique2.models.NativeAdViewTypes;
import com.greedygame.mystique2.models.Template;
import com.greedygame.mystique2.models.ViewLayer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kd3 implements ld3, nd3 {
    @Nullable
    private final Template c;

    public kd3() {
        this(null, 1, null);
    }

    public kd3(@Nullable Template template) {
        this.c = template;
    }

    @Override // com.p7700g.p99005.ld3
    @Nullable
    public ViewGroup a(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, com.anythink.expressad.a.B);
        NativeAdView nativeAdView = new NativeAdView(viewGroup.getContext());
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                Object tag = childAt.getTag();
                if (c25.g(tag, NativeAdViewTypes.CTA.getValue())) {
                    nativeAdView.setCallToActionView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.DESCRIPTION.getValue())) {
                    nativeAdView.setBodyView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.TITLE.getValue())) {
                    nativeAdView.setHeadlineView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.ICON.getValue())) {
                    nativeAdView.setIconView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.IMAGE.getValue())) {
                    nativeAdView.setImageView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.ADVERTISER.getValue())) {
                    nativeAdView.setAdvertiserView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.PRICE.getValue())) {
                    nativeAdView.setPriceView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.RATING.getValue())) {
                    nativeAdView.setStarRatingView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.STORE.getValue())) {
                    nativeAdView.setStoreView(childAt);
                } else if (c25.g(tag, NativeAdViewTypes.MEDIA_VIEW.getValue())) {
                    MediaView mediaView = new MediaView(viewGroup.getContext());
                    ImageView imageView = new ImageView(viewGroup.getContext());
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    viewGroup2.addView(imageView, layoutParams);
                    viewGroup2.addView(mediaView, layoutParams);
                    nativeAdView.setMediaView(mediaView);
                }
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        return nativeAdView;
    }

    @Override // com.p7700g.p99005.nd3
    @NotNull
    public ViewGroup b(@NotNull ViewGroup viewGroup) {
        c25.p(viewGroup, com.anythink.expressad.a.B);
        NativeAdView nativeAdView = new NativeAdView(viewGroup.getContext());
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                Template template = this.c;
                List<ViewLayer> views = template == null ? null : template.getViews();
                c25.m(views);
                ViewLayer viewLayer = views.get(i);
                String nativeAdView2 = viewLayer.getNativeAdView();
                if (!(nativeAdView2 == null || nativeAdView2.length() == 0)) {
                    String nativeAdView3 = viewLayer.getNativeAdView();
                    if (c25.g(nativeAdView3, NativeAdViewTypes.CTA.getValue())) {
                        nativeAdView.setCallToActionView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.DESCRIPTION.getValue())) {
                        nativeAdView.setBodyView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.TITLE.getValue())) {
                        nativeAdView.setHeadlineView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.ICON.getValue())) {
                        nativeAdView.setIconView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.IMAGE.getValue())) {
                        nativeAdView.setImageView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.ADVERTISER.getValue())) {
                        nativeAdView.setAdvertiserView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.PRICE.getValue())) {
                        nativeAdView.setPriceView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.RATING.getValue())) {
                        nativeAdView.setStarRatingView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.STORE.getValue())) {
                        nativeAdView.setStoreView(childAt);
                    } else if (c25.g(nativeAdView3, NativeAdViewTypes.MEDIA_VIEW.getValue())) {
                        nativeAdView.setMediaView((MediaView) childAt);
                    }
                }
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        return nativeAdView;
    }

    public /* synthetic */ kd3(Template template, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : template);
    }
}