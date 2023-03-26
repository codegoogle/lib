package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import com.p7700g.p99005.i2;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProcessUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class kf0 {
    private static final String a = tb0.f("ProcessUtils");

    private kf0() {
    }

    @z1
    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static String a(@x1 Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, kf0.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            tb0.c().a(a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static boolean b(@x1 Context context, @x1 hb0 configuration) {
        String a2 = a(context);
        if (!TextUtils.isEmpty(configuration.c())) {
            return TextUtils.equals(a2, configuration.c());
        }
        return TextUtils.equals(a2, context.getApplicationInfo().processName);
    }
}