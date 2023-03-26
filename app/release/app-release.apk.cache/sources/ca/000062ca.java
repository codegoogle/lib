package com.p7700g.p99005;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import com.p7700g.p99005.v10;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi26.java */
@e2(26)
/* loaded from: classes.dex */
public class w10 {
    private static final String a = "MBSCompatApi26";
    public static Field b;

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    /* loaded from: classes.dex */
    public static class a extends v10.a {
        public a(Context context, c cVar) {
            super(context, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((c) this.s).h(str, new b(result), bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    /* loaded from: classes.dex */
    public static class b {
        public MediaBrowserService.Result a;

        public b(MediaBrowserService.Result result) {
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

        public void c(List<Parcel> list, int i) {
            try {
                w10.b.setInt(this.a, i);
            } catch (IllegalAccessException unused) {
            }
            this.a.sendResult(b(list));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi26.java */
    /* loaded from: classes.dex */
    public interface c extends v10.b {
        void h(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private w10() {
    }

    public static Object a(Context context, c cVar) {
        return new a(context, cVar);
    }

    public static Bundle b(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    public static void c(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}