package com.anythink.core.api;

import android.content.Context;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.b.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ATInitMediation {
    public static final String KEY_LOCAL = "anythink_local";

    public final void checkToSaveInitData(String str, Map<String, Object> map, String... strArr) {
        m.a().a(str, map, strArr);
    }

    public List getActivityStatus() {
        return null;
    }

    public List getMetaValutStatus() {
        return null;
    }

    public String getNetworkName() {
        return "";
    }

    public String getNetworkSDKClass() {
        return "";
    }

    public String getNetworkVersion() {
        return "";
    }

    public List getPermissionStatus() {
        return null;
    }

    public Map<String, Boolean> getPluginClassStatus() {
        return null;
    }

    public List getProviderStatus() {
        return null;
    }

    public List getServiceStatus() {
        return null;
    }

    public abstract void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback);

    public final void runOnMainThread(Runnable runnable) {
        m.a().a(runnable);
    }

    public final void runOnThreadPool(Runnable runnable) {
        m.a();
        a.a().a(runnable);
    }

    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return false;
    }
}