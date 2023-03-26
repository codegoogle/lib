package com.p7700g.p99005;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import com.p7700g.p99005.u10;

/* compiled from: MediaBrowserServiceCompatApi23.java */
@e2(23)
/* loaded from: classes.dex */
public class v10 {

    /* compiled from: MediaBrowserServiceCompatApi23.java */
    /* loaded from: classes.dex */
    public static class a extends u10.b {
        public a(Context context, b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((b) this.s).b(str, new u10.c<>(result));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi23.java */
    /* loaded from: classes.dex */
    public interface b extends u10.d {
        void b(String str, u10.c<Parcel> cVar);
    }

    private v10() {
    }

    public static Object a(Context context, b bVar) {
        return new a(context, bVar);
    }
}