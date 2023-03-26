package com.p7700g.p99005;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.sf;
import com.p7700g.p99005.yg;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public class sf extends gh {
    private static j e;

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String[] s;
        public final /* synthetic */ Activity t;
        public final /* synthetic */ int u;

        public a(String[] strArr, Activity activity, int i) {
            this.s = strArr;
            this.t = activity;
            this.u = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.s.length];
            PackageManager packageManager = this.t.getPackageManager();
            String packageName = this.t.getPackageName();
            int length = this.s.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.s[i], packageName);
            }
            ((i) this.t).onRequestPermissionsResult(this.u, this.s, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        @e1
        public static void b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        @e1
        public static void c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        @e1
        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @e1
        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @e1
        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @e1
        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat.java */
    @e2(22)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* compiled from: ActivityCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @e1
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @e1
        public static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @e1
        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class f {
        private f() {
        }

        @e1
        public static <T> T a(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    /* compiled from: ActivityCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class g {
        private g() {
        }

        @e1
        public static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @e1
        public static void b(@x1 Activity activity, @z1 kh khVar, @z1 Bundle bundle) {
            activity.setLocusContext(khVar == null ? null : khVar.c(), bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    @e2(31)
    /* loaded from: classes.dex */
    public static class h {
        private h() {
        }

        @e1
        public static boolean a(@x1 Activity activity) {
            return activity.isLaunchedFromBubble();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface i {
        void onRequestPermissionsResult(int i, @x1 String[] strArr, @x1 int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface j {
        boolean a(@x1 Activity activity, @p1(from = 0) int i, int i2, @z1 Intent intent);

        boolean b(@x1 Activity activity, @x1 String[] strArr, @p1(from = 0) int i);
    }

    /* compiled from: ActivityCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface k {
        void a(int i);
    }

    /* compiled from: ActivityCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class l extends SharedElementCallback {
        private final yg a;

        public l(yg ygVar) {
            this.a = ygVar;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @e2(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.a.h(list, list2, new yg.a() { // from class: com.p7700g.p99005.qf
                @Override // com.p7700g.p99005.yg.a
                public final void a() {
                    sf.e.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    public static boolean A(@x1 Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return h.a(activity);
        }
        return i2 == 30 ? (g.a(activity) == null || g.a(activity).getDisplayId() == 0) ? false : true : (i2 != 29 || activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
    }

    public static /* synthetic */ void B(Activity activity) {
        if (activity.isFinishing() || vf.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void C(@x1 Activity activity) {
        c.b(activity);
    }

    public static void D(@x1 final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.p7700g.p99005.rf
                @Override // java.lang.Runnable
                public final void run() {
                    sf.B(activity);
                }
            });
        }
    }

    @z1
    public static kq E(@x1 Activity activity, @x1 DragEvent dragEvent) {
        return kq.b(activity, dragEvent);
    }

    public static void F(@x1 Activity activity, @x1 String[] strArr, @p1(from = 0) int i2) {
        j jVar = e;
        if (jVar == null || !jVar.b(activity, strArr, i2)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(wo1.C(wo1.G("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof k) {
                    ((k) activity).a(i2);
                }
                e.b(activity, strArr, i2);
            } else if (activity instanceof i) {
                new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i2));
            }
        }
    }

    @x1
    public static <T extends View> T G(@x1 Activity activity, @m1 int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) f.a(activity, i2);
        }
        T t = (T) activity.findViewById(i2);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void H(@x1 Activity activity, @z1 yg ygVar) {
        c.c(activity, ygVar != null ? new l(ygVar) : null);
    }

    public static void I(@x1 Activity activity, @z1 yg ygVar) {
        c.d(activity, ygVar != null ? new l(ygVar) : null);
    }

    public static void J(@x1 Activity activity, @z1 kh khVar, @z1 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            g.b(activity, khVar, bundle);
        }
    }

    public static void K(@z1 j jVar) {
        e = jVar;
    }

    public static boolean L(@x1 Activity activity, @x1 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e.c(activity, str);
        }
        return false;
    }

    public static void M(@x1 Activity activity, @x1 Intent intent, int i2, @z1 Bundle bundle) {
        b.b(activity, intent, i2, bundle);
    }

    public static void N(@x1 Activity activity, @x1 IntentSender intentSender, int i2, @z1 Intent intent, int i3, int i4, int i5, @z1 Bundle bundle) throws IntentSender.SendIntentException {
        b.c(activity, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public static void O(@x1 Activity activity) {
        c.e(activity);
    }

    public static void v(@x1 Activity activity) {
        b.a(activity);
    }

    public static void w(@x1 Activity activity) {
        c.a(activity);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public static j x() {
        return e;
    }

    @z1
    public static Uri y(@x1 Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return d.a(activity);
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    @Deprecated
    public static boolean z(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }
}