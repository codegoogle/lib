package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* loaded from: classes3.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {
    public View s;
    public ISBannerSize t;
    public String u;
    public Activity v;
    public boolean w;
    public boolean x;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ IronSourceError s;
        private /* synthetic */ String t;

        public a(IronSourceError ironSourceError, String str) {
            this.s = ironSourceError;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ISDemandOnlyBannerLayout.this.x) {
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onBannerAdLoadFailed error=" + this.s + ". instanceId: " + this.t);
            } else {
                try {
                    if (ISDemandOnlyBannerLayout.this.s != null) {
                        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
                        iSDemandOnlyBannerLayout.removeView(iSDemandOnlyBannerLayout.s);
                        ISDemandOnlyBannerLayout.this.s = null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            m.a().a(this.t, this.s);
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
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.s.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.s);
            }
            ISDemandOnlyBannerLayout.this.s = this.s;
            ISDemandOnlyBannerLayout.this.addView(this.s, 0, this.t);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.w = false;
        this.x = false;
        this.v = activity;
        this.t = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public Activity getActivity() {
        return this.v;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return m.a().b;
    }

    public View getBannerView() {
        return this.s;
    }

    public String getPlacementName() {
        return this.u;
    }

    public ISBannerSize getSize() {
        return this.t;
    }

    public boolean isDestroyed() {
        return this.w;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        m.a().b = null;
    }

    public final void sendBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
        com.ironsource.environment.e.c.a.b(new a(ironSourceError, str));
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info("");
        m.a().b = iSDemandOnlyBannerListener;
    }

    public void setPlacementName(String str) {
        this.u = str;
    }
}