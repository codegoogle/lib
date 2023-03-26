package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.util.List;

/* compiled from: MediaBrowserCompatApi21.java */
@e2(21)
/* loaded from: classes.dex */
public class g {
    public static final String a = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    /* compiled from: MediaBrowserCompatApi21.java */
    /* loaded from: classes.dex */
    public interface a {
        void b();

        void d();

        void e();
    }

    /* compiled from: MediaBrowserCompatApi21.java */
    /* loaded from: classes.dex */
    public static class b<T extends a> extends MediaBrowser.ConnectionCallback {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.a.d();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.a.e();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.a.b();
        }
    }

    /* compiled from: MediaBrowserCompatApi21.java */
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        public static Object a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }

        public static int b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }
    }

    /* compiled from: MediaBrowserCompatApi21.java */
    /* loaded from: classes.dex */
    public interface d {
        void c(@x1 String str, List<?> list);

        void onError(@x1 String str);
    }

    /* compiled from: MediaBrowserCompatApi21.java */
    /* loaded from: classes.dex */
    public static class e<T extends d> extends MediaBrowser.SubscriptionCallback {
        public final T a;

        public e(T t) {
            this.a = t;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(@x1 String str, List<MediaBrowser.MediaItem> list) {
            this.a.c(str, list);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(@x1 String str) {
            this.a.onError(str);
        }
    }

    private g() {
    }

    public static void a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static Object b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static Object c(a aVar) {
        return new b(aVar);
    }

    public static Object d(d dVar) {
        return new e(dVar);
    }

    public static void e(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static Bundle f(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static String g(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    public static ComponentName h(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    public static Object i(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static boolean j(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    public static void k(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void l(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}