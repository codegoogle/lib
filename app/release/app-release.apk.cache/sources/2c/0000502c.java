package com.p7700g.p99005;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.greedygame.mystique2.models.FacebookAdViewTypes;
import com.p7700g.p99005.s33;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m93 implements k93 {
    @NotNull
    private final n13<?> b;
    @NotNull
    private final o33 c;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ NativeAd t;
        public final /* synthetic */ NativeAdLayout u;
        public final /* synthetic */ MediaView v;
        public final /* synthetic */ List w;

        public a(Object obj, NativeAd nativeAd, NativeAdLayout nativeAdLayout, MediaView mediaView, List list) {
            this.s = obj;
            this.t = nativeAd;
            this.u = nativeAdLayout;
            this.v = mediaView;
            this.w = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m93 m93Var = (m93) this.s;
            this.t.registerViewForInteraction(this.u, this.v, this.w);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ NativeAd t;
        public final /* synthetic */ NativeAdLayout u;
        public final /* synthetic */ MediaView v;
        public final /* synthetic */ List w;

        public b(Object obj, NativeAd nativeAd, NativeAdLayout nativeAdLayout, MediaView mediaView, List list) {
            this.s = obj;
            this.t = nativeAd;
            this.u = nativeAdLayout;
            this.v = mediaView;
            this.w = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m93 m93Var = (m93) this.s;
            this.t.registerViewForInteraction(this.u, this.v, this.w);
        }
    }

    public m93(@NotNull n13<?> n13Var, @NotNull o33 o33Var) {
        c25.p(n13Var, "adView");
        c25.p(o33Var, "mystiqueView");
        this.b = n13Var;
        this.c = o33Var;
    }

    private final void b(s33.a aVar, NativeAd nativeAd, NativeAdLayout nativeAdLayout) {
        AdOptionsView adOptionsView = new AdOptionsView(aVar.getContext(), nativeAd, nativeAdLayout);
        aVar.removeAllViews();
        aVar.addView(adOptionsView);
    }

    @Override // com.p7700g.p99005.k93
    public void a() {
        int i = 0;
        View childAt = this.c.getChildAt(0);
        NativeAdLayout nativeAdLayout = childAt instanceof NativeAdLayout ? (NativeAdLayout) childAt : null;
        if (nativeAdLayout == null) {
            return;
        }
        Object a2 = this.b.a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.facebook.ads.NativeAd");
        NativeAd nativeAd = (NativeAd) a2;
        List<View> arrayList = new ArrayList<>();
        ViewGroup nativeAdView = this.c.getNativeAdView();
        View d = nativeAdView != null ? vr.d(nativeAdView, 0) : null;
        Objects.requireNonNull(d, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) d;
        MediaView mediaView = (MediaView) nativeAdLayout.findViewWithTag(FacebookAdViewTypes.MEDIA_VIEW.getString());
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            while (true) {
                int i2 = i + 1;
                View childAt2 = viewGroup.getChildAt(i);
                c25.o(childAt2, com.anythink.expressad.a.B);
                arrayList.add(childAt2);
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        Context context = this.c.getContext();
        c25.o(context, "mystiqueView.context");
        s33.a aVar = new s33.a(context, null, 0, 6, null);
        b(aVar, nativeAd, nativeAdLayout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        nativeAdLayout.addView(aVar, layoutParams);
        if (!this.c.E()) {
            MediaView mediaView2 = new MediaView(this.c.getContext());
            nativeAdLayout.addView(mediaView2, new FrameLayout.LayoutParams(4, 4));
            if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                nativeAd.registerViewForInteraction(nativeAdLayout, mediaView2, arrayList);
            } else {
                new Handler(Looper.getMainLooper()).post(new a(this, nativeAd, nativeAdLayout, mediaView2, arrayList));
            }
        } else if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, arrayList);
        } else {
            new Handler(Looper.getMainLooper()).post(new b(this, nativeAd, nativeAdLayout, mediaView, arrayList));
        }
    }
}