package com.p7700g.p99005;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import androidx.appcompat.widget.ActivityChooserModel;
import java.util.List;

/* compiled from: ProcessUtils.java */
/* loaded from: classes2.dex */
public class wm1 {
    @x1
    public static String a(@x1 Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return "";
    }

    public static boolean b(@x1 Context context) {
        return context.getPackageName().equals(a(context));
    }

    public static boolean c(@x1 Context context, int i) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null) {
            String packageName = context.getPackageName();
            for (String str : packagesForUid) {
                if (str.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(@x1 Context context) {
        String a = a(context);
        String string = context.getResources().getString(context.getResources().getIdentifier("vpn_process_name", "string", context.getPackageName()));
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(string);
        return sb.toString().equals(a) || string.equals(a);
    }
}