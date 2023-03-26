package com.anythink.expressad.atsignalcommon.communication;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.l;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.e31;

/* loaded from: classes2.dex */
public class BannerSignalPlugin extends l {
    private final String a = "BannerSignalPlugin";
    private b b;

    public void click(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", c.bY);
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", c.bY, th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "getFileInfo");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "getFileInfo", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "getNetstat");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "getNetstat", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "handlerH5Exception");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "handlerH5Exception", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "increaseOfferFrequence");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "increaseOfferFrequence", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", e31.b);
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", e31.b, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.b = (b) context;
            } else if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof b)) {
            } else {
                this.b = (b) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "initialize", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "install");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "install", th);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "onSignalCommunication");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "onSignalCommunication", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "openURL");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "openURL", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "readyStatus");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "readyStatus", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "reportUrls");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "resetCountdown");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "resetCountdown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "sendImpressions");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "toggleCloseBtn");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            n.d("BannerSignalPlugin", "triggerCloseBtn");
        } catch (Throwable th) {
            n.b("BannerSignalPlugin", "triggerCloseBtn", th);
        }
    }
}