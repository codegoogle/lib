package com.p7700g.p99005;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.onesignal.OSUtils;

/* compiled from: GooglePlayServicesUpgradePrompt.java */
/* loaded from: classes3.dex */
public class yi3 {
    private static final int a = 9000;

    /* compiled from: GooglePlayServicesUpgradePrompt.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* compiled from: GooglePlayServicesUpgradePrompt.java */
        /* renamed from: com.p7700g.p99005.yi3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class DialogInterface$OnClickListenerC0271a implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0271a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                vm3.k(vm3.a, vm3.t, true);
            }
        }

        /* compiled from: GooglePlayServicesUpgradePrompt.java */
        /* loaded from: classes3.dex */
        public class b implements DialogInterface.OnClickListener {
            public final /* synthetic */ Activity s;

            public b(Activity activity) {
                this.s = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                yi3.a(this.s);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity f0 = jm3.f0();
            if (f0 == null) {
                return;
            }
            String l = OSUtils.l(f0, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String l2 = OSUtils.l(f0, "onesignal_gms_missing_alert_button_update", "Update");
            String l3 = OSUtils.l(f0, "onesignal_gms_missing_alert_button_skip", "Skip");
            new AlertDialog.Builder(f0).setMessage(l).setPositiveButton(l2, new b(f0)).setNegativeButton(l3, new DialogInterface$OnClickListenerC0271a()).setNeutralButton(OSUtils.l(f0, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Activity activity) {
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            PendingIntent errorResolutionPendingIntent = googleApiAvailability.getErrorResolutionPendingIntent(activity, googleApiAvailability.isGooglePlayServicesAvailable(jm3.g), a);
            if (errorResolutionPendingIntent != null) {
                errorResolutionPendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }
    }

    private static boolean c() {
        try {
            PackageManager packageManager = jm3.g.getPackageManager();
            return !((String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager)).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void d() {
        if (OSUtils.C() && c() && !jm3.o0() && !vm3.b(vm3.a, vm3.t, false)) {
            OSUtils.V(new a());
        }
    }
}