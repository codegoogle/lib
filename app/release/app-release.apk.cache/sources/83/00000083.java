package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompatApi23;
import com.p7700g.p99005.e2;
import java.lang.reflect.InvocationTargetException;

@e2(24)
/* loaded from: classes.dex */
public class MediaSessionCompatApi24 {
    private static final String a = "MediaSessionCompatApi24";

    /* loaded from: classes.dex */
    public interface Callback extends MediaSessionCompatApi23.Callback {
        void g(String str, Bundle bundle);

        void j();

        void k(Uri uri, Bundle bundle);

        void r(String str, Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static class a<T extends Callback> extends MediaSessionCompatApi23.a<T> {
        public a(T t) {
            super(t);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepare() {
            ((Callback) this.a).j();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((Callback) this.a).g(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((Callback) this.a).r(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((Callback) this.a).k(uri, bundle);
        }
    }

    private MediaSessionCompatApi24() {
    }

    public static Object a(Callback callback) {
        return new a(callback);
    }

    public static String b(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}