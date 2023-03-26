package com.ironsource.mediationsdk.integration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class IntegrationHelper {

    /* loaded from: classes3.dex */
    public static class a extends Thread {
        private /* synthetic */ Activity s;

        public a(Activity activity) {
            this.s = activity;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.s.getPackageManager().getApplicationInfo(this.s.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    L.a();
                    TextUtils.isEmpty(L.a(this.s));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(Activity activity, String str) {
        Locale locale;
        try {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            int hashCode = lowerCase.hashCode();
            boolean z = true;
            if (hashCode != -1875652737) {
                if (hashCode != 92668925) {
                    if (hashCode == 497130182 && lowerCase.equals("facebook")) {
                    }
                } else if (lowerCase.equals("admob")) {
                }
            } else if (lowerCase.equals("supersonicads")) {
            }
            String str2 = "com.ironsource.adapters." + str.toLowerCase(locale) + CryptoConstants.ALIAS_SEPARATOR + str + "Adapter";
            IntegrationData e = e(activity, str2);
            if (e == null) {
                return false;
            }
            if (!str.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                if (!e.version.startsWith("4.1") && !e.version.startsWith("4.3")) {
                    IronSourceUtils.getSDKVersion();
                    z = false;
                }
            }
            try {
                String str3 = (String) Class.forName(str2).getMethod("getAdapterSDKVersion", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
            boolean f = f(activity, e.activities);
            if (!d(e.externalLibs)) {
                f = false;
            }
            if (!b(activity, e.services)) {
                f = false;
            }
            if (!c(activity, e.providers)) {
                f = false;
            }
            boolean z2 = e.validateWriteExternalStorage;
            return f;
        } catch (Exception unused2) {
            return false;
        }
    }

    private static boolean b(Activity activity, String[] strArr) {
        int i;
        boolean z = true;
        if (strArr == null) {
            return true;
        }
        PackageManager packageManager = activity.getPackageManager();
        int length = strArr.length;
        while (i < length) {
            i = packageManager.queryIntentServices(new Intent(activity, Class.forName(strArr[i])), 65536).size() > 0 ? i + 1 : 0;
            z = false;
        }
        return z;
    }

    private static boolean c(Context context, String[] strArr) {
        List<PackageInfo> installedPackages;
        ArrayList arrayList = new ArrayList();
        if (context != null && (installedPackages = context.getPackageManager().getInstalledPackages(8)) != null) {
            for (PackageInfo packageInfo : installedPackages) {
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        arrayList.add(providerInfo.name);
                    }
                }
            }
        }
        boolean z = true;
        if (strArr != null) {
            for (String str : strArr) {
                if (!arrayList.contains(str)) {
                    z = false;
                }
            }
        }
        return z;
    }

    private static boolean d(ArrayList<Pair<String, String>> arrayList) {
        boolean z = true;
        if (arrayList == null) {
            return true;
        }
        Iterator<Pair<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                Class.forName((String) next.first);
                String str = (String) next.second;
            } catch (ClassNotFoundException unused) {
                z = false;
                String str2 = (String) next.second;
            }
        }
        return z;
    }

    private static IntegrationData e(Activity activity, String str) {
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Activity.class).invoke(null, activity);
            String str2 = integrationData.version;
            return integrationData;
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    private static boolean f(Activity activity, String[] strArr) {
        int i;
        boolean z = true;
        if (strArr == null) {
            return true;
        }
        int length = strArr.length;
        while (i < length) {
            i = activity.getPackageManager().queryIntentActivities(new Intent(activity, Class.forName(strArr[i])), 65536).size() > 0 ? i + 1 : 0;
            z = false;
        }
        return z;
    }

    public static void validateIntegration(Activity activity) {
        PackageManager packageManager = activity.getPackageManager();
        packageManager.checkPermission("android.permission.INTERNET", activity.getPackageName());
        packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", activity.getPackageName());
        String[] strArr = {"AdColony", "AppLovin", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "Liftoff", "Maio", "Facebook", "MyTarget", "Pangle", "Smaato", "SuperAwesome", "Tapjoy", "UnityAds", "Vungle", "Yahoo"};
        for (int i = 0; i < 19; i++) {
            String str = strArr[i];
            a(activity, str);
            str.toLowerCase(Locale.ENGLISH).hashCode();
        }
        new a(activity).start();
    }
}