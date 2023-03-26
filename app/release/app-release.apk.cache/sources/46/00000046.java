package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaControllerCompatApi21;
import android.support.v4.media.session.MediaControllerCompatApi23;
import android.support.v4.media.session.MediaControllerCompatApi24;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.ag;
import com.p7700g.p99005.bg;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    public static final String a = "MediaControllerCompat";
    @i2({i2.a.LIBRARY})
    public static final String b = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @i2({i2.a.LIBRARY})
    public static final String c = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @i2({i2.a.LIBRARY})
    public static final String d = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @i2({i2.a.LIBRARY})
    public static final String e = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @i2({i2.a.LIBRARY})
    public static final String f = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    @i2({i2.a.LIBRARY})
    public static final String g = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @i2({i2.a.LIBRARY})
    public static final String h = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    private final b i;
    private final MediaSessionCompat.Token j;
    private final HashSet<Callback> k = new HashSet<>();

    /* loaded from: classes.dex */
    public static abstract class Callback implements IBinder.DeathRecipient {
        public final Object a = MediaControllerCompatApi21.b(new b(this));
        public a b;
        public IMediaControllerCallback c;

        /* loaded from: classes.dex */
        public class a extends Handler {
            private static final int a = 1;
            private static final int b = 2;
            private static final int c = 3;
            private static final int d = 4;
            private static final int e = 5;
            private static final int f = 6;
            private static final int g = 7;
            private static final int h = 8;
            private static final int i = 9;
            private static final int j = 11;
            private static final int k = 12;
            private static final int l = 13;
            public boolean m;

            public a(Looper looper) {
                super(looper);
                this.m = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.m) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.b(data);
                            Callback.this.k((String) message.obj, data);
                            return;
                        case 2:
                            Callback.this.f((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            Callback.this.e((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            Callback.this.b((PlaybackInfo) message.obj);
                            return;
                        case 5:
                            Callback.this.g((List) message.obj);
                            return;
                        case 6:
                            Callback.this.h((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.b(bundle);
                            Callback.this.d(bundle);
                            return;
                        case 8:
                            Callback.this.j();
                            return;
                        case 9:
                            Callback.this.i(((Integer) message.obj).intValue());
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            Callback.this.c(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            Callback.this.m(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            Callback.this.l();
                            return;
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class b implements MediaControllerCompatApi21.Callback {
            private final WeakReference<Callback> a;

            public b(Callback callback) {
                this.a = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void a(Object obj) {
                Callback callback = this.a.get();
                if (callback != null) {
                    callback.e(MediaMetadataCompat.d(obj));
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void b(Bundle bundle) {
                Callback callback = this.a.get();
                if (callback != null) {
                    callback.d(bundle);
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void c(int i, int i2, int i3, int i4, int i5) {
                Callback callback = this.a.get();
                if (callback != null) {
                    callback.b(new PlaybackInfo(i, i2, i3, i4, i5));
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void d(Object obj) {
                Callback callback = this.a.get();
                if (callback == null || callback.c != null) {
                    return;
                }
                callback.f(PlaybackStateCompat.c(obj));
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void e(String str, Bundle bundle) {
                Callback callback = this.a.get();
                if (callback != null) {
                    if (callback.c == null || Build.VERSION.SDK_INT >= 23) {
                        callback.k(str, bundle);
                    }
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void j(List<?> list) {
                Callback callback = this.a.get();
                if (callback != null) {
                    callback.g(MediaSessionCompat.QueueItem.d(list));
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void n(CharSequence charSequence) {
                Callback callback = this.a.get();
                if (callback != null) {
                    callback.h(charSequence);
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void p() {
                Callback callback = this.a.get();
                if (callback != null) {
                    callback.j();
                }
            }
        }

        /* loaded from: classes.dex */
        public static class c extends IMediaControllerCallback.Stub {
            private final WeakReference<Callback> G;

            public c(Callback callback) {
                this.G = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void A0(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void F1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void G1(String str, Bundle bundle) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void K0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void L1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(4, parcelableVolumeInfo != null ? new PlaybackInfo(parcelableVolumeInfo.s, parcelableVolumeInfo.t, parcelableVolumeInfo.u, parcelableVolumeInfo.v, parcelableVolumeInfo.w) : null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void R0(int i) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void W() throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void b(Bundle bundle) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void f1(int i) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void j(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void n(CharSequence charSequence) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void p() throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void u0(boolean z) throws RemoteException {
                Callback callback = this.G.get();
                if (callback != null) {
                    callback.n(11, Boolean.valueOf(z), null);
                }
            }
        }

        @i2({i2.a.LIBRARY})
        public IMediaControllerCallback a() {
            return this.c;
        }

        public void b(PlaybackInfo playbackInfo) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            n(8, null, null);
        }

        public void c(boolean z) {
        }

        public void d(Bundle bundle) {
        }

        public void e(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void f(PlaybackStateCompat playbackStateCompat) {
        }

        public void g(List<MediaSessionCompat.QueueItem> list) {
        }

        public void h(CharSequence charSequence) {
        }

        public void i(int i) {
        }

        public void j() {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l() {
        }

        public void m(int i) {
        }

        public void n(int i, Object obj, Bundle bundle) {
            a aVar = this.b;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void o(Handler handler) {
            if (handler == null) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.m = false;
                    aVar.removeCallbacksAndMessages(null);
                    this.b = null;
                    return;
                }
                return;
            }
            a aVar2 = new a(handler.getLooper());
            this.b = aVar2;
            aVar2.m = true;
        }
    }

    @e2(21)
    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 implements b {
        public final Object a;
        public final Object b = new Object();
        @k1("mLock")
        private final List<Callback> c = new ArrayList();
        private HashMap<Callback, a> d = new HashMap<>();
        public final MediaSessionCompat.Token e;

        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> s;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.s = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.s.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.b) {
                    mediaControllerImplApi21.e.k(IMediaSession.Stub.N1(ag.a(bundle, MediaSessionCompat.F)));
                    mediaControllerImplApi21.e.l(bundle.getBundle(MediaSessionCompat.G));
                    mediaControllerImplApi21.x();
                }
            }
        }

        /* loaded from: classes.dex */
        public static class a extends Callback.c {
            public a(Callback callback) {
                super(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.c, android.support.v4.media.session.IMediaControllerCallback
            public void K0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.c, android.support.v4.media.session.IMediaControllerCallback
            public void L1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.c, android.support.v4.media.session.IMediaControllerCallback
            public void b(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.c, android.support.v4.media.session.IMediaControllerCallback
            public void j(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.c, android.support.v4.media.session.IMediaControllerCallback
            public void n(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.c, android.support.v4.media.session.IMediaControllerCallback
            public void p() throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.e = token;
            Object d = MediaControllerCompatApi21.d(context, token.j());
            this.a = d;
            if (d != null) {
                if (token.g() == null) {
                    y();
                    return;
                }
                return;
            }
            throw new RemoteException();
        }

        private void y() {
            n(MediaControllerCompat.b, null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackInfo a() {
            Object j = MediaControllerCompatApi21.j(this.a);
            if (j != null) {
                return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.e(j), MediaControllerCompatApi21.PlaybackInfo.c(j), MediaControllerCompatApi21.PlaybackInfo.f(j), MediaControllerCompatApi21.PlaybackInfo.d(j), MediaControllerCompatApi21.PlaybackInfo.b(j));
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void b(int i, int i2) {
            MediaControllerCompatApi21.a(this.a, i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public long c() {
            return MediaControllerCompatApi21.f(this.a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat d() {
            if (this.e.g() != null) {
                try {
                    return this.e.g().d();
                } catch (RemoteException unused) {
                }
            }
            Object k = MediaControllerCompatApi21.k(this.a);
            if (k != null) {
                return PlaybackStateCompat.c(k);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public String e() {
            return MediaControllerCompatApi21.i(this.a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void f(Callback callback) {
            MediaControllerCompatApi21.v(this.a, callback.a);
            synchronized (this.b) {
                if (this.e.g() != null) {
                    try {
                        a remove = this.d.remove(callback);
                        if (remove != null) {
                            callback.c = null;
                            this.e.g().f0(remove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.c.remove(callback);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void g(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((c() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.g, mediaDescriptionCompat);
                n(MediaControllerCompat.e, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle getExtras() {
            return MediaControllerCompatApi21.e(this.a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat getMetadata() {
            Object h = MediaControllerCompatApi21.h(this.a);
            if (h != null) {
                return MediaMetadataCompat.d(h);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void h(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((c() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.g, mediaDescriptionCompat);
                n(MediaControllerCompat.c, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int i() {
            if (Build.VERSION.SDK_INT < 22 && this.e.g() != null) {
                try {
                    return this.e.g().i();
                } catch (RemoteException unused) {
                }
            }
            return MediaControllerCompatApi21.n(this.a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean j(KeyEvent keyEvent) {
            return MediaControllerCompatApi21.c(this.a, keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void k(int i, int i2) {
            MediaControllerCompatApi21.u(this.a, i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public CharSequence l() {
            return MediaControllerCompatApi21.m(this.a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void m(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((c() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.g, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.h, i);
                n(MediaControllerCompat.d, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void n(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaControllerCompatApi21.s(this.a, str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean o() {
            return this.e.g() != null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent p() {
            return MediaControllerCompatApi21.o(this.a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public TransportControls q() {
            Object q = MediaControllerCompatApi21.q(this.a);
            if (q != null) {
                return new f(q);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int r() {
            if (this.e.g() != null) {
                try {
                    return this.e.g().r();
                } catch (RemoteException unused) {
                    return -1;
                }
            }
            return -1;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean s() {
            if (this.e.g() != null) {
                try {
                    return this.e.g().s();
                } catch (RemoteException unused) {
                    return false;
                }
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public List<MediaSessionCompat.QueueItem> t() {
            List<Object> l = MediaControllerCompatApi21.l(this.a);
            if (l != null) {
                return MediaSessionCompat.QueueItem.d(l);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Object u() {
            return this.a;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int v() {
            if (this.e.g() != null) {
                try {
                    return this.e.g().v();
                } catch (RemoteException unused) {
                    return -1;
                }
            }
            return -1;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void w(Callback callback, Handler handler) {
            MediaControllerCompatApi21.r(this.a, callback.a, handler);
            synchronized (this.b) {
                if (this.e.g() != null) {
                    a aVar = new a(callback);
                    this.d.put(callback, aVar);
                    callback.c = aVar;
                    try {
                        this.e.g().A(aVar);
                        callback.n(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    callback.c = null;
                    this.c.add(callback);
                }
            }
        }

        @k1("mLock")
        public void x() {
            if (this.e.g() == null) {
                return;
            }
            for (Callback callback : this.c) {
                a aVar = new a(callback);
                this.d.put(callback, aVar);
                callback.c = aVar;
                try {
                    this.e.g().A(aVar);
                    callback.n(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            this.c.clear();
        }
    }

    /* loaded from: classes.dex */
    public static final class PlaybackInfo {
        public static final int a = 1;
        public static final int b = 2;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;

        public PlaybackInfo(int i, int i2, int i3, int i4, int i5) {
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
        }

        public int a() {
            return this.d;
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.f;
        }

        public int d() {
            return this.c;
        }

        public int e() {
            return this.e;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class TransportControls {
        public static final String a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String str, Bundle bundle);

        public abstract void e(String str, Bundle bundle);

        public abstract void f(Uri uri, Bundle bundle);

        public abstract void g();

        public abstract void h(String str, Bundle bundle);

        public abstract void i(String str, Bundle bundle);

        public abstract void j(Uri uri, Bundle bundle);

        public abstract void k();

        public abstract void l(long j);

        public abstract void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void n(String str, Bundle bundle);

        public abstract void o(boolean z);

        public abstract void p(RatingCompat ratingCompat);

        public abstract void q(RatingCompat ratingCompat, Bundle bundle);

        public abstract void r(int i);

        public abstract void s(int i);

        public abstract void t();

        public abstract void u();

        public abstract void v(long j);

        public abstract void w();
    }

    /* loaded from: classes.dex */
    public static class a extends bg.a {
        private final MediaControllerCompat a;

        public a(MediaControllerCompat mediaControllerCompat) {
            this.a = mediaControllerCompat;
        }

        public MediaControllerCompat a() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        PlaybackInfo a();

        void b(int i, int i2);

        long c();

        PlaybackStateCompat d();

        String e();

        void f(Callback callback);

        void g(MediaDescriptionCompat mediaDescriptionCompat);

        Bundle getExtras();

        MediaMetadataCompat getMetadata();

        void h(MediaDescriptionCompat mediaDescriptionCompat);

        int i();

        boolean j(KeyEvent keyEvent);

        void k(int i, int i2);

        CharSequence l();

        void m(MediaDescriptionCompat mediaDescriptionCompat, int i);

        void n(String str, Bundle bundle, ResultReceiver resultReceiver);

        boolean o();

        PendingIntent p();

        TransportControls q();

        int r();

        boolean s();

        List<MediaSessionCompat.QueueItem> t();

        Object u();

        int v();

        void w(Callback callback, Handler handler);
    }

    @e2(23)
    /* loaded from: classes.dex */
    public static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.b
        public TransportControls q() {
            Object q = MediaControllerCompatApi21.q(this.a);
            if (q != null) {
                return new g(q);
            }
            return null;
        }
    }

    @e2(24)
    /* loaded from: classes.dex */
    public static class d extends c {
        public d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.b
        public TransportControls q() {
            Object q = MediaControllerCompatApi21.q(this.a);
            if (q != null) {
                return new h(q);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements b {
        private IMediaSession a;
        private TransportControls b;

        public e(MediaSessionCompat.Token token) {
            this.a = IMediaSession.Stub.N1((IBinder) token.j());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackInfo a() {
            try {
                ParcelableVolumeInfo w1 = this.a.w1();
                return new PlaybackInfo(w1.s, w1.t, w1.u, w1.v, w1.w);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void b(int i, int i2) {
            try {
                this.a.E0(i, i2, null);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public long c() {
            try {
                return this.a.c();
            } catch (RemoteException unused) {
                return 0L;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat d() {
            try {
                return this.a.d();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public String e() {
            try {
                return this.a.e();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void f(Callback callback) {
            if (callback != null) {
                try {
                    this.a.f0((IMediaControllerCallback) callback.a);
                    this.a.asBinder().unlinkToDeath(callback, 0);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            throw new IllegalArgumentException("callback may not be null.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void g(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.a.c() & 4) != 0) {
                    this.a.g(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle getExtras() {
            try {
                return this.a.getExtras();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat getMetadata() {
            try {
                return this.a.getMetadata();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void h(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.a.c() & 4) != 0) {
                    this.a.h(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int i() {
            try {
                return this.a.i();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean j(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.a.z0(keyEvent);
                    return false;
                } catch (RemoteException unused) {
                    return false;
                }
            }
            throw new IllegalArgumentException("event may not be null.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void k(int i, int i2) {
            try {
                this.a.D(i, i2, null);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public CharSequence l() {
            try {
                return this.a.l();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void m(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.a.c() & 4) != 0) {
                    this.a.J0(mediaDescriptionCompat, i);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void n(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.a.j1(str, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean o() {
            return true;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent p() {
            try {
                return this.a.O();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public TransportControls q() {
            if (this.b == null) {
                this.b = new i(this.a);
            }
            return this.b;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int r() {
            try {
                return this.a.r();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean s() {
            try {
                return this.a.s();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public List<MediaSessionCompat.QueueItem> t() {
            try {
                return this.a.t();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Object u() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int v() {
            try {
                return this.a.v();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void w(Callback callback, Handler handler) {
            if (callback != null) {
                try {
                    this.a.asBinder().linkToDeath(callback, 0);
                    this.a.A((IMediaControllerCallback) callback.a);
                    callback.n(13, null, null);
                    return;
                } catch (RemoteException unused) {
                    callback.n(8, null, null);
                    return;
                }
            }
            throw new IllegalArgumentException("callback may not be null.");
        }
    }

    /* loaded from: classes.dex */
    public static class f extends TransportControls {
        public final Object b;

        public f(Object obj) {
            this.b = obj;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void a() {
            MediaControllerCompatApi21.TransportControls.a(this.b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void b() {
            MediaControllerCompatApi21.TransportControls.b(this.b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void c() {
            MediaControllerCompatApi21.TransportControls.c(this.b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void d(String str, Bundle bundle) {
            MediaControllerCompatApi21.TransportControls.d(this.b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void e(String str, Bundle bundle) {
            MediaControllerCompatApi21.TransportControls.e(this.b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void f(Uri uri, Bundle bundle) {
            if (uri != null && !Uri.EMPTY.equals(uri)) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(MediaSessionCompat.y, uri);
                bundle2.putBundle(MediaSessionCompat.A, bundle);
                n(MediaSessionCompat.n, bundle2);
                return;
            }
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void g() {
            n(MediaSessionCompat.o, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void h(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.w, str);
            bundle2.putBundle(MediaSessionCompat.A, bundle);
            n(MediaSessionCompat.p, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void i(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.x, str);
            bundle2.putBundle(MediaSessionCompat.A, bundle);
            n(MediaSessionCompat.q, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void j(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.y, uri);
            bundle2.putBundle(MediaSessionCompat.A, bundle);
            n(MediaSessionCompat.r, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void k() {
            MediaControllerCompatApi21.TransportControls.f(this.b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void l(long j) {
            MediaControllerCompatApi21.TransportControls.g(this.b, j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.F(customAction.d(), bundle);
            MediaControllerCompatApi21.TransportControls.h(this.b, customAction.d(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void n(String str, Bundle bundle) {
            MediaControllerCompat.F(str, bundle);
            MediaControllerCompatApi21.TransportControls.h(this.b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void o(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.B, z);
            n(MediaSessionCompat.s, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void p(RatingCompat ratingCompat) {
            MediaControllerCompatApi21.TransportControls.i(this.b, ratingCompat != null ? ratingCompat.e() : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void q(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.z, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.A, bundle);
            n(MediaSessionCompat.v, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void r(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.C, i);
            n(MediaSessionCompat.t, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void s(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.D, i);
            n(MediaSessionCompat.u, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void t() {
            MediaControllerCompatApi21.TransportControls.j(this.b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void u() {
            MediaControllerCompatApi21.TransportControls.k(this.b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void v(long j) {
            MediaControllerCompatApi21.TransportControls.l(this.b, j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void w() {
            MediaControllerCompatApi21.TransportControls.m(this.b);
        }
    }

    @e2(23)
    /* loaded from: classes.dex */
    public static class g extends f {
        public g(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void f(Uri uri, Bundle bundle) {
            MediaControllerCompatApi23.TransportControls.a(this.b, uri, bundle);
        }
    }

    @e2(24)
    /* loaded from: classes.dex */
    public static class h extends g {
        public h(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void g() {
            MediaControllerCompatApi24.TransportControls.a(this.b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void h(String str, Bundle bundle) {
            MediaControllerCompatApi24.TransportControls.b(this.b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void i(String str, Bundle bundle) {
            MediaControllerCompatApi24.TransportControls.c(this.b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void j(Uri uri, Bundle bundle) {
            MediaControllerCompatApi24.TransportControls.d(this.b, uri, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends TransportControls {
        private IMediaSession b;

        public i(IMediaSession iMediaSession) {
            this.b = iMediaSession;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void a() {
            try {
                this.b.m0();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void b() {
            try {
                this.b.pause();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void c() {
            try {
                this.b.h1();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void d(String str, Bundle bundle) {
            try {
                this.b.h0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void e(String str, Bundle bundle) {
            try {
                this.b.j0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void f(Uri uri, Bundle bundle) {
            try {
                this.b.q0(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void g() {
            try {
                this.b.V();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void h(String str, Bundle bundle) {
            try {
                this.b.c0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void i(String str, Bundle bundle) {
            try {
                this.b.R(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void j(Uri uri, Bundle bundle) {
            try {
                this.b.E(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void k() {
            try {
                this.b.m1();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void l(long j) {
            try {
                this.b.t0(j);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            n(customAction.d(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void n(String str, Bundle bundle) {
            MediaControllerCompat.F(str, bundle);
            try {
                this.b.y(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void o(boolean z) {
            try {
                this.b.q(z);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void p(RatingCompat ratingCompat) {
            try {
                this.b.C(ratingCompat);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void q(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.b.H0(ratingCompat, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void r(int i) {
            try {
                this.b.u(i);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void s(int i) {
            try {
                this.b.x(i);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void t() {
            try {
                this.b.next();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void u() {
            try {
                this.b.previous();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void v(long j) {
            try {
                this.b.u1(j);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void w() {
            try {
                this.b.stop();
            } catch (RemoteException unused) {
            }
        }
    }

    public MediaControllerCompat(Context context, @x1 MediaSessionCompat mediaSessionCompat) {
        b mediaControllerImplApi21;
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token i2 = mediaSessionCompat.i();
            this.j = i2;
            b bVar = null;
            try {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 24) {
                    mediaControllerImplApi21 = new d(context, i2);
                } else if (i3 >= 23) {
                    mediaControllerImplApi21 = new c(context, i2);
                } else {
                    mediaControllerImplApi21 = new MediaControllerImplApi21(context, i2);
                }
                bVar = mediaControllerImplApi21;
            } catch (RemoteException unused) {
            }
            this.i = bVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public static void C(@x1 Activity activity, MediaControllerCompat mediaControllerCompat) {
        if (activity instanceof bg) {
            ((bg) activity).y(new a(mediaControllerCompat));
        }
        MediaControllerCompatApi21.t(activity, mediaControllerCompat != null ? MediaControllerCompatApi21.d(activity, mediaControllerCompat.r().j()) : null);
    }

    public static void F(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals(MediaSessionCompat.g) || str.equals(MediaSessionCompat.h)) {
            if (bundle == null || !bundle.containsKey(MediaSessionCompat.i)) {
                throw new IllegalArgumentException(wo1.u("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, CryptoConstants.ALIAS_SEPARATOR));
            }
        }
    }

    public static MediaControllerCompat g(@x1 Activity activity) {
        if (activity instanceof bg) {
            a aVar = (a) ((bg) activity).x(a.class);
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        }
        Object g2 = MediaControllerCompatApi21.g(activity);
        if (g2 == null) {
            return null;
        }
        try {
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.d(MediaControllerCompatApi21.p(g2)));
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Deprecated
    public void A(int i2) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> m = m();
        if (m == null || i2 < 0 || i2 >= m.size() || (queueItem = m.get(i2)) == null) {
            return;
        }
        z(queueItem.e());
    }

    public void B(@x1 String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.i.n(str, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    public void D(int i2, int i3) {
        this.i.k(i2, i3);
    }

    public void E(@x1 Callback callback) {
        if (callback != null) {
            try {
                this.k.remove(callback);
                this.i.f(callback);
                return;
            } finally {
                callback.o(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void a(MediaDescriptionCompat mediaDescriptionCompat) {
        this.i.h(mediaDescriptionCompat);
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
        this.i.m(mediaDescriptionCompat, i2);
    }

    public void c(int i2, int i3) {
        this.i.b(i2, i3);
    }

    public boolean d(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.i.j(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle e() {
        return this.i.getExtras();
    }

    public long f() {
        return this.i.c();
    }

    public Object h() {
        return this.i.u();
    }

    public MediaMetadataCompat i() {
        return this.i.getMetadata();
    }

    public String j() {
        return this.i.e();
    }

    public PlaybackInfo k() {
        return this.i.a();
    }

    public PlaybackStateCompat l() {
        return this.i.d();
    }

    public List<MediaSessionCompat.QueueItem> m() {
        return this.i.t();
    }

    public CharSequence n() {
        return this.i.l();
    }

    public int o() {
        return this.i.i();
    }

    public int p() {
        return this.i.v();
    }

    public PendingIntent q() {
        return this.i.p();
    }

    public MediaSessionCompat.Token r() {
        return this.j;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @z1
    public Bundle s() {
        return this.j.i();
    }

    public int t() {
        return this.i.r();
    }

    public TransportControls u() {
        return this.i.q();
    }

    public boolean v() {
        return this.i.s();
    }

    public boolean w() {
        return this.i.o();
    }

    public void x(@x1 Callback callback) {
        y(callback, null);
    }

    public void y(@x1 Callback callback, Handler handler) {
        if (callback != null) {
            if (handler == null) {
                handler = new Handler();
            }
            callback.o(handler);
            this.i.w(callback, handler);
            this.k.add(callback);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void z(MediaDescriptionCompat mediaDescriptionCompat) {
        this.i.g(mediaDescriptionCompat);
    }

    public MediaControllerCompat(Context context, @x1 MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.j = token;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                this.i = new d(context, token);
                return;
            } else if (i2 >= 23) {
                this.i = new c(context, token);
                return;
            } else {
                this.i = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}