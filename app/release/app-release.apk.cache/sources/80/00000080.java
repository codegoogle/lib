package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.m;

@e2(23)
/* loaded from: classes.dex */
public class MediaSessionCompatApi23 {

    /* loaded from: classes.dex */
    public interface Callback extends m.a {
        void s(Uri uri, Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static class a<T extends Callback> extends m.b<T> {
        public a(T t) {
            super(t);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((Callback) this.a).s(uri, bundle);
        }
    }

    private MediaSessionCompatApi23() {
    }

    public static Object a(Callback callback) {
        return new a(callback);
    }
}