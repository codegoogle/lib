package com.anythink.core.api;

import android.content.Context;
import android.location.Location;
import com.anythink.core.common.b.i;
import com.anythink.core.common.b.m;
import com.anythink.core.common.b.o;
import com.anythink.core.common.g.e;
import com.anythink.core.common.g.h;
import com.anythink.core.common.j.b.a;
import com.anythink.core.common.j.g;
import com.anythink.core.common.s;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ATSDK {
    private static boolean HAS_INIT = false;
    public static final int NONPERSONALIZED = 1;
    public static final int PERSONALIZED = 0;
    public static final int UNKNOWN = 2;

    private ATSDK() {
    }

    public static void checkIsEuTraffic(Context context, NetTrafficeCallback netTrafficeCallback) {
        o.a(context).a(netTrafficeCallback);
    }

    public static void deniedUploadDeviceInfo(String... strArr) {
        m.a().a(strArr);
    }

    public static void getArea(final ATAreaCallback aTAreaCallback) {
        if (aTAreaCallback == null) {
            return;
        }
        new e().a(0, new h() { // from class: com.anythink.core.api.ATSDK.2
            @Override // com.anythink.core.common.g.h
            public final void onLoadCanceled(int i) {
                ATAreaCallback.this.onErrorCallback("Request cancel");
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadError(int i, String str, AdError adError) {
                ATAreaCallback.this.onErrorCallback(adError.printStackTrace());
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadFinish(int i, Object obj) {
                try {
                    if (obj == null) {
                        ATAreaCallback.this.onErrorCallback("There is no result.");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject((String) obj);
                    if (!jSONObject.has("area")) {
                        ATAreaCallback.this.onErrorCallback("There is no result.");
                        return;
                    }
                    ATAreaCallback.this.onResultCallback(jSONObject.optString("area"));
                } catch (Throwable unused) {
                    ATAreaCallback.this.onErrorCallback("Internal error");
                }
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadStart(int i) {
            }
        });
    }

    public static int getGDPRDataLevel(Context context) {
        return o.a(context).a();
    }

    public static int getPersionalizedAdStatus() {
        return m.a().c();
    }

    public static String getSDKVersionName() {
        return g.a();
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, null);
    }

    public static void initCustomMap(Map<String, Object> map) {
        m.a().a(map);
    }

    public static void initPlacementCustomMap(String str, Map<String, Object> map) {
        m.a().a(str, map);
    }

    public static void integrationChecking(Context context) {
        m.a().b(context);
    }

    public static boolean isCnSDK() {
        return m.a().b() != null;
    }

    public static boolean isEUTraffic(Context context) {
        return o.a(context).d();
    }

    public static boolean isNetworkLogDebug() {
        return m.a().y();
    }

    public static void setATAdFilter(String[] strArr, IATAdFilter iATAdFilter) {
        m.a().a(strArr, iATAdFilter);
    }

    public static void setAdLogoVisible(boolean z) {
        m.a().c(z);
    }

    public static void setChannel(String str) {
        if (g.a(str)) {
            m.a().c(str);
        }
    }

    public static void setDebuggerConfig(Context context, String str, ATDebuggerConfig aTDebuggerConfig) {
        m.a().a(context, str, aTDebuggerConfig);
    }

    public static void setDetectionListener(ATDetectionResultCallback aTDetectionResultCallback) {
        i.a().a(aTDetectionResultCallback);
    }

    @Deprecated
    public static void setExcludeMyOfferPkgList(List<String> list) {
        m.a().a(list);
    }

    public static void setExcludePackageList(List<String> list) {
        m.a().a(list);
    }

    public static void setFilterAdSourceIdList(String str, List<String> list) {
        m.a().a(str, list);
    }

    public static void setFilterNetworkFirmIdList(String str, List<String> list) {
        m.a().b(str, list);
    }

    public static void setGDPRUploadDataLevel(Context context, int i) {
        if (context == null) {
            return;
        }
        if (i == 0 || i == 1) {
            o.a(context).a(i);
        }
    }

    public static void setInitType(int i) {
        m.a().b(i);
    }

    public static void setLocation(Location location) {
        m.a().a(location);
    }

    public static void setNetworkLogDebug(boolean z) {
        m.a().b(z);
    }

    public static void setPersonalizedAdStatus(int i) {
        m.a().a(i);
    }

    @Deprecated
    public static void setSDKArea(AreaCode areaCode) {
        m.a().a(areaCode);
    }

    public static void setSubChannel(String str) {
        if (g.b(str)) {
            m.a().d(str);
        }
    }

    public static void setSystemDevFragmentType(String str) {
        m.a().n(str);
    }

    public static void setUseHTTP(boolean z) {
        m.a().d(z);
    }

    public static void setWXStatus(boolean z) {
        m.a().a(z);
    }

    public static void showGdprAuth(Context context) {
        o.a(context).a(context, null);
    }

    public static void testModeDeviceInfo(Context context, DeviceInfoCallback deviceInfoCallback) {
        m.a().a(context, deviceInfoCallback);
    }

    public static void init(Context context, String str, String str2, ATNetworkConfig aTNetworkConfig) {
        init(context, str, str2, aTNetworkConfig, null);
    }

    public static void showGdprAuth(Context context, ATGDPRAuthCallback aTGDPRAuthCallback) {
        o.a(context).a(context, aTGDPRAuthCallback);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, ATNetworkConfig aTNetworkConfig, ATSDKInitListener aTSDKInitListener) {
        try {
            if (context == null) {
                if (aTSDKInitListener != null) {
                    aTSDKInitListener.onFail("init: Context is null!");
                    return;
                }
                return;
            }
            m.a().a(context, str, str2, aTNetworkConfig);
            if (aTSDKInitListener != null) {
                aTSDKInitListener.onSuccess();
            }
            a.a().a(new Runnable() { // from class: com.anythink.core.api.ATSDK.1
                @Override // java.lang.Runnable
                public final void run() {
                    s.a().b();
                }
            });
        } catch (Error | Exception unused) {
        }
    }
}