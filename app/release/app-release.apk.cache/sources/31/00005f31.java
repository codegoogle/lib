package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi21.java */
@e2(21)
/* loaded from: classes.dex */
public class u10 {

    /* compiled from: MediaBrowserServiceCompatApi21.java */
    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final Bundle b;

        public a(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi21.java */
    /* loaded from: classes.dex */
    public static class b extends MediaBrowserService {
        public final d s;

        public b(Context context, d dVar) {
            attachBaseContext(context);
            this.s = dVar;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            a i2 = this.s.i(str, i, bundle == null ? null : new Bundle(bundle));
            if (i2 == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(i2.a, i2.b);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.s.e(str, new c<>(result));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi21.java */
    /* loaded from: classes.dex */
    public static class c<T> {
        public MediaBrowserService.Result a;

        public c(MediaBrowserService.Result result) {
            this.a = result;
        }

        public void a() {
            this.a.detach();
        }

        public List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T t) {
            if (t instanceof List) {
                this.a.sendResult(b((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.a.sendResult(null);
            }
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi21.java */
    /* loaded from: classes.dex */
    public interface d {
        void e(String str, c<List<Parcel>> cVar);

        a i(String str, int i, Bundle bundle);
    }

    private u10() {
    }

    public static Object a(Context context, d dVar) {
        return new b(context, dVar);
    }

    public static void b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    public static IBinder c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static void e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}