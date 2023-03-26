package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import com.p7700g.p99005.e2;
import java.util.ArrayList;
import java.util.List;

@e2(21)
/* loaded from: classes.dex */
public class MediaControllerCompatApi21 {

    /* loaded from: classes.dex */
    public interface Callback {
        void a(Object obj);

        void b(Bundle bundle);

        void c(int i, int i2, int i3, int i4, int i5);

        void d(Object obj);

        void e(String str, Bundle bundle);

        void j(List<?> list);

        void n(CharSequence charSequence);

        void p();
    }

    /* loaded from: classes.dex */
    public static class PlaybackInfo {
        private static final int a = 4;
        private static final int b = 6;
        private static final int c = 7;

        private PlaybackInfo() {
        }

        public static AudioAttributes a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int b(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getCurrentVolume();
        }

        public static int c(Object obj) {
            return g(a(obj));
        }

        public static int d(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getMaxVolume();
        }

        public static int e(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getPlaybackType();
        }

        public static int f(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getVolumeControl();
        }

        private static int g(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage != 13) {
                switch (usage) {
                    case 2:
                        return 0;
                    case 3:
                        return 8;
                    case 4:
                        return 4;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return 5;
                    case 6:
                        return 2;
                    default:
                        return 3;
                }
            }
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class TransportControls {
        private TransportControls() {
        }

        public static void a(Object obj) {
            ((MediaController.TransportControls) obj).fastForward();
        }

        public static void b(Object obj) {
            ((MediaController.TransportControls) obj).pause();
        }

        public static void c(Object obj) {
            ((MediaController.TransportControls) obj).play();
        }

        public static void d(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromMediaId(str, bundle);
        }

        public static void e(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromSearch(str, bundle);
        }

        public static void f(Object obj) {
            ((MediaController.TransportControls) obj).rewind();
        }

        public static void g(Object obj, long j) {
            ((MediaController.TransportControls) obj).seekTo(j);
        }

        public static void h(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
        }

        public static void i(Object obj, Object obj2) {
            ((MediaController.TransportControls) obj).setRating((Rating) obj2);
        }

        public static void j(Object obj) {
            ((MediaController.TransportControls) obj).skipToNext();
        }

        public static void k(Object obj) {
            ((MediaController.TransportControls) obj).skipToPrevious();
        }

        public static void l(Object obj, long j) {
            ((MediaController.TransportControls) obj).skipToQueueItem(j);
        }

        public static void m(Object obj) {
            ((MediaController.TransportControls) obj).stop();
        }
    }

    /* loaded from: classes.dex */
    public static class a<T extends Callback> extends MediaController.Callback {
        public final T a;

        public a(T t) {
            this.a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.a.c(playbackInfo.getPlaybackType(), PlaybackInfo.c(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.a.b(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.a.a(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.a.d(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.a.j(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.a.n(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.a.p();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.a.e(str, bundle);
        }
    }

    private MediaControllerCompatApi21() {
    }

    public static void a(Object obj, int i, int i2) {
        ((MediaController) obj).adjustVolume(i, i2);
    }

    public static Object b(Callback callback) {
        return new a(callback);
    }

    public static boolean c(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    public static Object d(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    public static Bundle e(Object obj) {
        return ((MediaController) obj).getExtras();
    }

    public static long f(Object obj) {
        return ((MediaController) obj).getFlags();
    }

    public static Object g(Activity activity) {
        return activity.getMediaController();
    }

    public static Object h(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    public static String i(Object obj) {
        return ((MediaController) obj).getPackageName();
    }

    public static Object j(Object obj) {
        return ((MediaController) obj).getPlaybackInfo();
    }

    public static Object k(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    public static List<Object> l(Object obj) {
        List<MediaSession.QueueItem> queue = ((MediaController) obj).getQueue();
        if (queue == null) {
            return null;
        }
        return new ArrayList(queue);
    }

    public static CharSequence m(Object obj) {
        return ((MediaController) obj).getQueueTitle();
    }

    public static int n(Object obj) {
        return ((MediaController) obj).getRatingType();
    }

    public static PendingIntent o(Object obj) {
        return ((MediaController) obj).getSessionActivity();
    }

    public static Object p(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    public static Object q(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    public static void r(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
    }

    public static void s(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    public static void t(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    public static void u(Object obj, int i, int i2) {
        ((MediaController) obj).setVolumeTo(i, i2);
    }

    public static void v(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
    }
}