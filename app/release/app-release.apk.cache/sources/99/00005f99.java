package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.expressad.foundation.c.d;
import com.p7700g.p99005.xu0;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: GeneralInfoCollector.java */
/* loaded from: classes2.dex */
public class u91 extends q91 {
    @x1
    public final a91 b;

    public u91(@x1 a91 a91Var) {
        this.b = a91Var;
    }

    private int d(@x1 Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            StringBuilder sb = new StringBuilder();
            for (Signature signature : packageInfo.signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                sb.append(Base64.encodeToString(messageDigest.digest(), 0));
            }
            return sb.toString().hashCode();
        } catch (Throwable th) {
            q91.a.f(th);
            return 0;
        }
    }

    private int e(@x1 Context context) {
        try {
            return context.getApplicationInfo().uid;
        } catch (Throwable th) {
            q91.a.f(th);
            return 0;
        }
    }

    @SuppressLint({"MissingPermission"})
    private void f(@x1 Context context, @x1 Bundle bundle) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                if (connectivityManager.getActiveNetworkInfo() == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return;
                }
                c(bundle, xu0.f.E, activeNetworkInfo.getTypeName());
            } catch (Throwable th) {
                q91.a.f(th);
            }
        }
    }

    private void g(@x1 Context context, @x1 Bundle bundle) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                b(bundle, "memory_remains", memoryInfo.availMem);
                b(bundle, "memory_total", memoryInfo.totalMem);
            }
        } catch (Throwable th) {
            q91.a.f(th);
        }
    }

    @x1
    private Pair<String, Integer> h(@x1 Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            int i = packageInfo.versionCode;
            String str = packageInfo.versionName;
            if (TextUtils.isEmpty(str)) {
                str = "1.0";
            }
            return Pair.create(str, Integer.valueOf(i));
        } catch (Throwable unused) {
            return Pair.create("", 0);
        }
    }

    @x1
    private String i(@x1 Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                return !TextUtils.isEmpty(networkOperatorName) ? networkOperatorName : "";
            }
            return "";
        } catch (Throwable th) {
            q91.a.f(th);
            return "";
        }
    }

    @x1
    private String j(@x1 Context context) {
        try {
            return context.getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            q91.a.f(th);
            return "";
        }
    }

    @x1
    private String k(@x1 Context context) {
        try {
            return context.getResources().getConfiguration().locale.getCountry();
        } catch (Throwable th) {
            q91.a.f(th);
            return "";
        }
    }

    @x1
    private String l() {
        try {
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
            if (calendar != null) {
                return new SimpleDateFormat("Z", Locale.US).format(calendar.getTime());
            }
            return "";
        } catch (Throwable th) {
            q91.a.f(th);
            return "";
        }
    }

    @Override // com.p7700g.p99005.q91
    public void a(@x1 Context context, @x1 Bundle bundle) {
        try {
            c(bundle, "af_platform", pt0.a);
            c(bundle, d.a.f, context.getPackageName());
            b(bundle, "app_build", d(context));
            b(bundle, "uid", e(context));
            Pair<String, Integer> h = h(context);
            c(bundle, "app_version", (String) h.first);
            c(bundle, "app_release", String.valueOf(h.second));
            c(bundle, "carrier", i(context));
            g(context, bundle);
            bundle.putBoolean("has_telephone", bundle.containsKey("carrier") && bundle.get("carrier") != null);
            c(bundle, "model", Build.MODEL);
            c(bundle, "device_manufacturer", Build.MANUFACTURER);
            c(bundle, "locale", k(context));
            c(bundle, "device_language", j(context));
            b(bundle, "android_sdk_int", Build.VERSION.SDK_INT);
            c(bundle, "android_version_name", Build.VERSION.RELEASE);
            f(context, bundle);
            c(bundle, "time_zone", l());
        } catch (Throwable th) {
            q91.a.f(th);
        }
    }
}