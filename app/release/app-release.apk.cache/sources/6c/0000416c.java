package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.p7700g.p99005.i2;
import java.util.List;

/* compiled from: MediaButtonReceiver.java */
/* loaded from: classes.dex */
public class f20 extends BroadcastReceiver {
    private static final String a = "MediaButtonReceiver";

    /* compiled from: MediaButtonReceiver.java */
    /* loaded from: classes.dex */
    public static class a extends MediaBrowserCompat.ConnectionCallback {
        private final Context c;
        private final Intent d;
        private final BroadcastReceiver.PendingResult e;
        private MediaBrowserCompat f;

        public a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.c = context;
            this.d = intent;
            this.e = pendingResult;
        }

        private void e() {
            this.f.b();
            this.e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void a() {
            try {
                new MediaControllerCompat(this.c, this.f.h()).d((KeyEvent) this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void b() {
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void c() {
            e();
        }

        public void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f = mediaBrowserCompat;
        }
    }

    public static PendingIntent a(Context context, long j) {
        ComponentName c = c(context);
        if (c == null) {
            return null;
        }
        return b(context, c, j);
    }

    public static PendingIntent b(Context context, ComponentName componentName, long j) {
        int s;
        if (componentName == null || (s = PlaybackStateCompat.s(j)) == 0) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, s));
        return PendingIntent.getBroadcast(context, s, intent, 0);
    }

    @i2({i2.a.LIBRARY})
    public static ComponentName c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder M = wo1.M("Expected 1 service that handles ", str, ", found ");
            M.append(queryIntentServices.size());
            throw new IllegalStateException(M.toString());
        }
    }

    public static KeyEvent e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.e().d(keyEvent);
        return keyEvent;
    }

    private static void f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName d = d(context, "android.intent.action.MEDIA_BUTTON");
            if (d != null) {
                intent.setComponent(d);
                f(context, intent);
                return;
            }
            ComponentName d2 = d(context, t10.v);
            if (d2 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                a aVar = new a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d2, aVar, null);
                aVar.f(mediaBrowserCompat);
                mediaBrowserCompat.a();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        String str = "Ignore unsupported intent: " + intent;
    }
}