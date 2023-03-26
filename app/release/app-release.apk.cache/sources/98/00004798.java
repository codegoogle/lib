package com.p7700g.p99005;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.p7700g.p99005.g;
import java.util.List;

/* compiled from: MediaBrowserCompatApi26.java */
@e2(26)
/* loaded from: classes.dex */
public class i {

    /* compiled from: MediaBrowserCompatApi26.java */
    /* loaded from: classes.dex */
    public interface a extends g.d {
        void a(@x1 String str, @x1 Bundle bundle);

        void b(@x1 String str, List<?> list, @x1 Bundle bundle);
    }

    /* compiled from: MediaBrowserCompatApi26.java */
    /* loaded from: classes.dex */
    public static class b<T extends a> extends g.e<T> {
        public b(T t) {
            super(t);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(@x1 String str, List<MediaBrowser.MediaItem> list, @x1 Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.a).b(str, list, bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(@x1 String str, @x1 Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.a).a(str, bundle);
        }
    }

    private i() {
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static void b(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void c(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }
}