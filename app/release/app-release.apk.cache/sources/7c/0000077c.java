package com.anythink.expressad.atsignalcommon.bridge;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.e31;

/* loaded from: classes2.dex */
public class BannerJSPlugin extends AbsFeedBackForH5 {
    private final String h = "BannerJSBridge";
    private IBannerJSBridge i;

    public void cai(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "cai");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.cai(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "cai", th);
        }
    }

    public void click(Object obj, String str) {
        try {
            n.d("BannerJSBridge", c.bY);
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.click(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", c.bY, th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "getFileInfo");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.getFileInfo(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "getFileInfo", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "getNetstat");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.getNetstat(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "getNetstat", th);
        }
    }

    public void gial(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "gial");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.gial(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "gial", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "handlerH5Exception");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.handlerH5Exception(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "handlerH5Exception", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "increaseOfferFrequence");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.increaseOfferFrequence(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "increaseOfferFrequence", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            n.d("BannerJSBridge", e31.b);
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.init(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", e31.b, th);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof IBannerJSBridge) {
                this.i = (IBannerJSBridge) context;
            } else if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof IBannerJSBridge)) {
            } else {
                this.i = (IBannerJSBridge) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "initialize", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "install");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.install(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "install", th);
        }
    }

    public void onJSBridgeConnect(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "onJSBridgeConnect");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.onJSBridgeConnect(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "onJSBridgeConnect", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "openURL");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.openURL(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "openURL", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "readyStatus");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.readyStatus(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "readyStatus", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "reportUrls");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.reportUrls(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "resetCountdown");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.resetCountdown(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "resetCountdown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "sendImpressions");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.sendImpressions(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "toggleCloseBtn");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            n.d("BannerJSBridge", "triggerCloseBtn");
            IBannerJSBridge iBannerJSBridge = this.i;
            if (iBannerJSBridge != null) {
                iBannerJSBridge.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            n.b("BannerJSBridge", "triggerCloseBtn", th);
        }
    }
}