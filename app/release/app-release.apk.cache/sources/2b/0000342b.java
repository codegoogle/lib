package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: classes3.dex */
public class IronSourceBannerLayout extends FrameLayout {
    private View s;
    private ISBannerSize t;
    private String u;
    private Activity v;
    private boolean w;
    private boolean x;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ IronSourceError s;
        private /* synthetic */ boolean t;

        public a(IronSourceError ironSourceError, boolean z) {
            this.s = ironSourceError;
            this.t = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1280n a;
            IronSourceError ironSourceError;
            boolean z;
            if (IronSourceBannerLayout.this.x) {
                a = C1280n.a();
                ironSourceError = this.s;
                z = true;
            } else {
                try {
                    if (IronSourceBannerLayout.this.s != null) {
                        IronSourceBannerLayout ironSourceBannerLayout = IronSourceBannerLayout.this;
                        ironSourceBannerLayout.removeView(ironSourceBannerLayout.s);
                        IronSourceBannerLayout.this.s = null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                a = C1280n.a();
                ironSourceError = this.s;
                z = this.t;
            }
            a.a(ironSourceError, z);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ View s;
        private /* synthetic */ FrameLayout.LayoutParams t;

        public b(View view, FrameLayout.LayoutParams layoutParams) {
            this.s = view;
            this.t = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IronSourceBannerLayout.this.removeAllViews();
            ViewParent parent = this.s.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.s);
            }
            IronSourceBannerLayout.this.s = this.s;
            IronSourceBannerLayout.this.addView(this.s, 0, this.t);
        }
    }

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.w = false;
        this.x = false;
        this.v = activity;
        this.t = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public final IronSourceBannerLayout b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.v, this.t);
        ironSourceBannerLayout.setBannerListener(C1280n.a().e);
        ironSourceBannerLayout.setLevelPlayBannerListener(C1280n.a().f);
        ironSourceBannerLayout.setPlacementName(this.u);
        return ironSourceBannerLayout;
    }

    public final void c(View view, FrameLayout.LayoutParams layoutParams) {
        com.ironsource.environment.e.c.a.b(new b(view, layoutParams));
    }

    public final void d(AdInfo adInfo, boolean z) {
        C1280n.a().a(adInfo, z);
        this.x = true;
    }

    public final void e(IronSourceError ironSourceError, boolean z) {
        com.ironsource.environment.e.c.a.b(new a(ironSourceError, z));
    }

    public Activity getActivity() {
        return this.v;
    }

    public BannerListener getBannerListener() {
        return C1280n.a().e;
    }

    public View getBannerView() {
        return this.s;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return C1280n.a().f;
    }

    public String getPlacementName() {
        return this.u;
    }

    public ISBannerSize getSize() {
        return this.t;
    }

    public final void h() {
        this.w = true;
        this.v = null;
        this.t = null;
        this.u = null;
        this.s = null;
        removeBannerListener();
    }

    public boolean isDestroyed() {
        return this.w;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C1280n.a().e = null;
        C1280n.a().f = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        C1280n.a().e = bannerListener;
    }

    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info("");
        C1280n.a().f = levelPlayBannerListener;
    }

    public void setPlacementName(String str) {
        this.u = str;
    }
}