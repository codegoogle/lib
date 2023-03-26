package com.p7700g.p99005;

import android.media.browse.MediaBrowser;
import android.os.Parcel;

/* compiled from: MediaBrowserCompatApi23.java */
@e2(23)
/* loaded from: classes.dex */
public class h {

    /* compiled from: MediaBrowserCompatApi23.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Parcel parcel);

        void onError(@x1 String str);
    }

    /* compiled from: MediaBrowserCompatApi23.java */
    /* loaded from: classes.dex */
    public static class b<T extends a> extends MediaBrowser.ItemCallback {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(@x1 String str) {
            this.a.onError(str);
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.a.a(null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.a.a(obtain);
        }
    }

    private h() {
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static void b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}