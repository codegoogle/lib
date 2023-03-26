package com.p7700g.p99005;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.gms.tasks.Task;
import com.p7700g.p99005.zg3;

/* compiled from: AppUtil.java */
/* loaded from: classes3.dex */
public class ug3 {
    public static ll2 a;
    public static Dialog b;

    /* compiled from: AppUtil.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ xd3 s;
        public final /* synthetic */ Activity t;

        public a(final xd3 val$textView3, final Activity val$activity) {
            this.s = val$textView3;
            this.t = val$activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.setTextColor(this.t.getResources().getColor(zg3.b.h));
            this.s.a("Please Wait...");
        }
    }

    /* compiled from: AppUtil.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ xd3 s;
        public final /* synthetic */ Activity t;

        public b(final xd3 val$textView3, final Activity val$activity) {
            this.s = val$textView3;
            this.t = val$activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.setTextColor(this.t.getResources().getColor(zg3.b.h));
            this.s.a("Data Loading...");
        }
    }

    /* compiled from: AppUtil.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public final /* synthetic */ xd3 s;
        public final /* synthetic */ Activity t;

        public c(final xd3 val$textView3, final Activity val$activity) {
            this.s = val$textView3;
            this.t = val$activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.setTextColor(this.t.getResources().getColor(zg3.b.h));
            this.s.a("Please Wait...");
        }
    }

    /* compiled from: AppUtil.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public final /* synthetic */ xd3 s;
        public final /* synthetic */ Activity t;

        public d(final xd3 val$textView3, final Activity val$activity) {
            this.s = val$textView3;
            this.t = val$activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.setTextColor(this.t.getResources().getColor(zg3.b.h));
            this.s.a("Data Loading...");
        }
    }

    public static boolean a() {
        return yg3.e(bh3.B0).equals("1");
    }

    public static String b() {
        try {
            return yg3.e(bh3.M0);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c() {
        return yg3.e(bh3.A0).equals("") ? "" : yg3.e(bh3.A0);
    }

    public static Integer d() {
        if (yg3.e(bh3.D0).equals("")) {
            return 0;
        }
        return Integer.valueOf(yg3.e(bh3.D0));
    }

    public static void e(Activity activity) {
        ml2 a2 = nl2.a(activity);
        if (a == null || !yg3.e(bh3.K0).equals("true")) {
            return;
        }
        if (yg3.e(bh3.c1).equals("")) {
            a2.a(activity, a).addOnCompleteListener(df3.a);
        } else if (yg3.e(bh3.c1).equals("1")) {
            a2.a(activity, a).addOnCompleteListener(cf3.a);
        }
    }

    public static void f(Activity activity) {
        nl2.a(activity).b().addOnCompleteListener(ef3.a);
    }

    public static void g(Activity activity) {
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + activity.getPackageName())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void h(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "My application name");
            intent.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=" + activity.getPackageName() + "\n\n");
            activity.startActivity(Intent.createChooser(intent, "choose one"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void i(Context context, View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, zg3.a.a);
        loadAnimation.setInterpolator(new ch3(0.05d, 0.2d));
        view.startAnimation(loadAnimation);
    }

    public static void j() {
        Dialog dialog = b;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        b.dismiss();
        b.cancel();
    }

    public static boolean k(Activity activity) {
        ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService("connectivity");
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    public static /* synthetic */ void n(Task task) {
        if (task.isSuccessful()) {
            a = (ll2) task.getResult();
        }
    }

    public static void o(Activity activity) {
        if (b == null) {
            Dialog dialog = new Dialog(activity);
            b = dialog;
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            b.setContentView(zg3.g.P);
            b.setCancelable(false);
        }
        xd3 xd3Var = (xd3) b.findViewById(zg3.e.w0);
        if (!b.isShowing()) {
            b.show();
        }
        try {
            new Handler().postDelayed(new a(xd3Var, activity), 500L);
            new Handler().postDelayed(new b(xd3Var, activity), 1500L);
            new Handler().postDelayed(new c(xd3Var, activity), 2500L);
            new Handler().postDelayed(new d(xd3Var, activity), 4500L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}