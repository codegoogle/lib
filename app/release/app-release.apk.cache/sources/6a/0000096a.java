package com.anythink.expressad.splash.js;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.foundation.h.n;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SplashJs extends AbsFeedBackForH5 {
    private static String h = "SplashJs";
    private SplashJSBridgeImpl i;

    public void cai(Object obj, String str) {
        n.d(h, "cai".concat(String.valueOf(str)));
        SplashJSBridgeImpl splashJSBridgeImpl = this.i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.cai(obj, str);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            SplashJsUtils.getFileInfo(obj, new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void gial(Object obj, String str) {
        n.d(h, "gial".concat(String.valueOf(str)));
        SplashJSBridgeImpl splashJSBridgeImpl = this.i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.gial(obj, str);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        if (obj != null) {
            try {
                WindVaneWebView windVaneWebView = ((a) obj).a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().onReceivedError(windVaneWebView, 0, str.toString(), windVaneWebView.getUrl());
            } catch (Throwable th) {
                n.b(h, "handlerH5Exception", th);
            }
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            SplashJsUtils.increaseOfferFrequence(obj, new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void init(Object obj, String str) {
        n.d(h, "initialize".concat(String.valueOf(str)));
        SplashJSBridgeImpl splashJSBridgeImpl = this.i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.init(obj, str);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof SplashJSBridgeImpl)) {
                return;
            }
            this.i = (SplashJSBridgeImpl) windVaneWebView.getObject();
        } catch (Throwable th) {
            n.b(h, "initialize", th);
        }
    }

    public void install(Object obj, String str) {
        SplashJSBridgeImpl splashJSBridgeImpl = this.i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.install(obj, str);
        }
    }

    public void onJSBridgeConnect(Object obj, String str) {
        try {
            n.d(h, "onJSBridgeConnect");
            SplashJSBridgeImpl splashJSBridgeImpl = this.i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.onJSBridgeConnect(obj, str);
            }
        } catch (Throwable th) {
            n.b(h, "onJSBridgeConnect", th);
        }
    }

    public void openURL(Object obj, String str) {
        n.d(h, "openURL".concat(String.valueOf(str)));
        SplashJSBridgeImpl splashJSBridgeImpl = this.i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.openURL(obj, str);
        }
    }

    public void pauseCountDown(Object obj, String str) {
        try {
            n.d(h, "pauseCountDown");
            SplashJSBridgeImpl splashJSBridgeImpl = this.i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.pauseCountDown(obj, str);
            }
        } catch (Throwable th) {
            n.b(h, "pauseCountDown", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                WindVaneWebView windVaneWebView = ((a) obj).a;
                if (windVaneWebView == null || windVaneWebView.getWebViewListener() == null) {
                    return;
                }
                windVaneWebView.getWebViewListener().readyState(windVaneWebView, optInt);
            } catch (Throwable th) {
                n.b(h, "readyStatus", th);
            }
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            n.d(h, "reportUrls");
            SplashJSBridgeImpl splashJSBridgeImpl = this.i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.reportUrls(obj, str);
            }
        } catch (Throwable th) {
            n.b(h, "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        n.d(h, "resetCountdown".concat(String.valueOf(str)));
        SplashJSBridgeImpl splashJSBridgeImpl = this.i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.resetCountdown(obj, str);
        }
    }

    public void resumeCountDown(Object obj, String str) {
        try {
            n.d(h, "resumeCountDown");
            SplashJSBridgeImpl splashJSBridgeImpl = this.i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.resumeCountDown(obj, str);
            }
        } catch (Throwable th) {
            n.b(h, "resumeCountDown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            n.d(h, "sendImpressions");
            SplashJSBridgeImpl splashJSBridgeImpl = this.i;
            if (splashJSBridgeImpl != null) {
                splashJSBridgeImpl.sendImpressions(obj, str);
            }
        } catch (Throwable th) {
            n.b(h, "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        n.d(h, "toggleCloseBtn".concat(String.valueOf(str)));
        SplashJSBridgeImpl splashJSBridgeImpl = this.i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.toggleCloseBtn(obj, str);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        n.d(h, "triggerCloseBtn".concat(String.valueOf(str)));
        SplashJSBridgeImpl splashJSBridgeImpl = this.i;
        if (splashJSBridgeImpl != null) {
            splashJSBridgeImpl.triggerCloseBtn(obj, str);
        }
    }
}