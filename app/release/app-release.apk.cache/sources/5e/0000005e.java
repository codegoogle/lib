package android.support.v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.e2;

@e2(23)
/* loaded from: classes.dex */
public class MediaControllerCompatApi23 {

    /* loaded from: classes.dex */
    public static class TransportControls {
        private TransportControls() {
        }

        public static void a(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromUri(uri, bundle);
        }
    }

    private MediaControllerCompatApi23() {
    }
}