package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* compiled from: AndroidSupportV4Compat.java */
/* loaded from: classes3.dex */
public class ii3 {

    /* compiled from: AndroidSupportV4Compat.java */
    /* loaded from: classes3.dex */
    public static class a {
        public static void a(@x1 Activity activity, @x1 String[] strArr, int i) {
            b.a(activity, strArr, i);
        }

        public static boolean b(Activity activity, String str) {
            return b.b(activity, str);
        }
    }

    /* compiled from: AndroidSupportV4Compat.java */
    @TargetApi(23)
    /* loaded from: classes3.dex */
    public static class b {
        public static void a(Activity activity, String[] strArr, int i) {
            if (activity instanceof d) {
                ((d) activity).a(i);
            }
            activity.requestPermissions(strArr, i);
        }

        public static boolean b(Activity activity, String str) {
            return sf.L(activity, str);
        }
    }

    /* compiled from: AndroidSupportV4Compat.java */
    /* loaded from: classes3.dex */
    public static class c {
        public static int a(@x1 Context context, @x1 String str) {
            try {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            } catch (Throwable unused) {
                return -1;
            }
        }

        public static int b(Context context, int i) {
            if (Build.VERSION.SDK_INT > 22) {
                return context.getColor(i);
            }
            return context.getResources().getColor(i);
        }
    }

    /* compiled from: AndroidSupportV4Compat.java */
    /* loaded from: classes3.dex */
    public interface d {
        void a(int i);
    }
}