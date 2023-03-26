package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompatApi23;
import android.support.v4.media.session.MediaSessionCompatApi24;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.p7700g.p99005.ag;
import com.p7700g.p99005.c20;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.f20;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.m;
import com.p7700g.p99005.n;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x10;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {
    @i2({i2.a.LIBRARY})
    public static final String A = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @i2({i2.a.LIBRARY})
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @i2({i2.a.LIBRARY})
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @i2({i2.a.LIBRARY})
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @i2({i2.a.LIBRARY_GROUP})
    public static final String E = "android.support.v4.media.session.TOKEN";
    @i2({i2.a.LIBRARY})
    public static final String F = "android.support.v4.media.session.EXTRA_BINDER";
    @i2({i2.a.LIBRARY_GROUP})
    public static final String G = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";
    private static final int H = 320;
    private static final String I = "data_calling_pkg";
    private static final String J = "data_calling_pid";
    private static final String K = "data_calling_uid";
    private static final String L = "data_extras";
    public static int M = 0;
    public static final String a = "MediaSessionCompat";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final String e = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String f = "android.support.v4.media.session.action.SKIP_AD";
    public static final String g = "android.support.v4.media.session.action.FOLLOW";
    public static final String h = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String i = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String j = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    @i2({i2.a.LIBRARY})
    public static final String n = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @i2({i2.a.LIBRARY})
    public static final String o = "android.support.v4.media.session.action.PREPARE";
    @i2({i2.a.LIBRARY})
    public static final String p = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @i2({i2.a.LIBRARY})
    public static final String q = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @i2({i2.a.LIBRARY})
    public static final String r = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @i2({i2.a.LIBRARY})
    public static final String s = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @i2({i2.a.LIBRARY})
    public static final String t = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @i2({i2.a.LIBRARY})
    public static final String u = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    @i2({i2.a.LIBRARY})
    public static final String v = "android.support.v4.media.session.action.SET_RATING";
    @i2({i2.a.LIBRARY})
    public static final String w = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    @i2({i2.a.LIBRARY})
    public static final String x = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @i2({i2.a.LIBRARY})
    public static final String y = "android.support.v4.media.session.action.ARGUMENT_URI";
    @i2({i2.a.LIBRARY})
    public static final String z = "android.support.v4.media.session.action.ARGUMENT_RATING";
    private final d N;
    private final MediaControllerCompat O;
    private final ArrayList<OnActiveChangeListener> P;

    /* loaded from: classes.dex */
    public static abstract class Callback {
        public final Object a;
        public WeakReference<d> b;
        private a c = null;
        private boolean d;

        /* loaded from: classes.dex */
        public class a extends Handler {
            private static final int a = 1;

            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    Callback.this.a((x10.b) message.obj);
                }
            }
        }

        @e2(21)
        /* loaded from: classes.dex */
        public class b implements m.a {
            public b() {
            }

            @Override // com.p7700g.p99005.m.a
            public void a() {
                Callback.this.z();
            }

            @Override // com.p7700g.p99005.m.a
            public void b() {
                Callback.this.s();
            }

            @Override // com.p7700g.p99005.m.a
            public void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.b)) {
                        g gVar = (g) Callback.this.b.get();
                        if (gVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token a = gVar.a();
                            IMediaSession g = a.g();
                            if (g != null) {
                                asBinder = g.asBinder();
                            }
                            ag.b(bundle2, MediaSessionCompat.F, asBinder);
                            bundle2.putBundle(MediaSessionCompat.G, a.i());
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals(MediaControllerCompat.c)) {
                        Callback.this.b((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.g));
                    } else if (str.equals(MediaControllerCompat.d)) {
                        Callback.this.c((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.g), bundle.getInt(MediaControllerCompat.h));
                    } else if (str.equals(MediaControllerCompat.e)) {
                        Callback.this.q((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.g));
                    } else if (str.equals(MediaControllerCompat.f)) {
                        g gVar2 = (g) Callback.this.b.get();
                        if (gVar2 == null || gVar2.f == null) {
                            return;
                        }
                        int i = bundle.getInt(MediaControllerCompat.h, -1);
                        if (i >= 0 && i < gVar2.f.size()) {
                            queueItem = gVar2.f.get(i);
                        }
                        if (queueItem != null) {
                            Callback.this.q(queueItem.e());
                        }
                    } else {
                        Callback.this.d(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                }
            }

            @Override // com.p7700g.p99005.m.a
            public void d(long j) {
                Callback.this.B(j);
            }

            @Override // com.p7700g.p99005.m.a
            public void e(Object obj) {
                Callback.this.v(RatingCompat.c(obj));
            }

            @Override // com.p7700g.p99005.m.a
            public void f() {
                Callback.this.i();
            }

            @Override // com.p7700g.p99005.m.a
            public void h() {
                Callback.this.A();
            }

            @Override // com.p7700g.p99005.m.a
            public boolean i(Intent intent) {
                return Callback.this.g(intent);
            }

            @Override // com.p7700g.p99005.m.a
            public void l(Object obj, Bundle bundle) {
            }

            @Override // com.p7700g.p99005.m.a
            public void m(String str, Bundle bundle) {
                Callback.this.k(str, bundle);
            }

            @Override // com.p7700g.p99005.m.a
            public void n(String str, Bundle bundle) {
                Callback.this.j(str, bundle);
            }

            @Override // com.p7700g.p99005.m.a
            public void o() {
                Callback.this.f();
            }

            @Override // com.p7700g.p99005.m.a
            public void onPause() {
                Callback.this.h();
            }

            @Override // com.p7700g.p99005.m.a
            public void onStop() {
                Callback.this.C();
            }

            @Override // com.p7700g.p99005.m.a
            public void p(long j) {
                Callback.this.t(j);
            }

            @Override // com.p7700g.p99005.m.a
            public void q(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.A);
                MediaSessionCompat.b(bundle2);
                if (str.equals(MediaSessionCompat.n)) {
                    Callback.this.l((Uri) bundle.getParcelable(MediaSessionCompat.y), bundle2);
                } else if (str.equals(MediaSessionCompat.o)) {
                    Callback.this.m();
                } else if (str.equals(MediaSessionCompat.p)) {
                    Callback.this.n(bundle.getString(MediaSessionCompat.w), bundle2);
                } else if (str.equals(MediaSessionCompat.q)) {
                    Callback.this.o(bundle.getString(MediaSessionCompat.x), bundle2);
                } else if (str.equals(MediaSessionCompat.r)) {
                    Callback.this.p((Uri) bundle.getParcelable(MediaSessionCompat.y), bundle2);
                } else if (str.equals(MediaSessionCompat.s)) {
                    Callback.this.u(bundle.getBoolean(MediaSessionCompat.B));
                } else if (str.equals(MediaSessionCompat.t)) {
                    Callback.this.x(bundle.getInt(MediaSessionCompat.C));
                } else if (str.equals(MediaSessionCompat.u)) {
                    Callback.this.y(bundle.getInt(MediaSessionCompat.D));
                } else if (str.equals(MediaSessionCompat.v)) {
                    Callback.this.w((RatingCompat) bundle.getParcelable(MediaSessionCompat.z), bundle2);
                } else {
                    Callback.this.e(str, bundle);
                }
            }
        }

        @e2(23)
        /* loaded from: classes.dex */
        public class c extends b implements MediaSessionCompatApi23.Callback {
            public c() {
                super();
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi23.Callback
            public void s(Uri uri, Bundle bundle) {
                Callback.this.l(uri, bundle);
            }
        }

        @e2(24)
        /* loaded from: classes.dex */
        public class d extends c implements MediaSessionCompatApi24.Callback {
            public d() {
                super();
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            public void g(String str, Bundle bundle) {
                Callback.this.n(str, bundle);
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            public void j() {
                Callback.this.m();
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            public void k(Uri uri, Bundle bundle) {
                Callback.this.p(uri, bundle);
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            public void r(String str, Bundle bundle) {
                Callback.this.o(str, bundle);
            }
        }

        public Callback() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                this.a = MediaSessionCompatApi24.a(new d());
            } else if (i >= 23) {
                this.a = MediaSessionCompatApi23.a(new c());
            } else {
                this.a = m.a(new b());
            }
        }

        public void A() {
        }

        public void B(long j) {
        }

        public void C() {
        }

        public void D(d dVar, Handler handler) {
            this.b = new WeakReference<>(dVar);
            a aVar = this.c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.c = new a(handler.getLooper());
        }

        public void a(x10.b bVar) {
            if (this.d) {
                this.d = false;
                this.c.removeMessages(1);
                d dVar = this.b.get();
                if (dVar == null) {
                    return;
                }
                PlaybackStateCompat d2 = dVar.d();
                long d3 = d2 == null ? 0L : d2.d();
                boolean z = d2 != null && d2.r() == 3;
                boolean z2 = (516 & d3) != 0;
                boolean z3 = (d3 & 514) != 0;
                dVar.y(bVar);
                if (z && z3) {
                    h();
                } else if (!z && z2) {
                    i();
                }
                dVar.y(null);
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            d dVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (dVar = this.b.get()) == null || this.c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            x10.b C = dVar.C();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(C);
                return false;
            }
            if (keyEvent.getRepeatCount() > 0) {
                a(C);
            } else if (this.d) {
                this.c.removeMessages(1);
                this.d = false;
                PlaybackStateCompat d2 = dVar.d();
                if (((d2 == null ? 0L : d2.d()) & 32) != 0) {
                    z();
                }
            } else {
                this.d = true;
                a aVar = this.c;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, C), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void r(int i) {
        }

        public void s() {
        }

        public void t(long j) {
        }

        public void u(boolean z) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i) {
        }

        public void y(int i) {
        }

        public void z() {
        }
    }

    /* loaded from: classes.dex */
    public interface OnActiveChangeListener {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public static final int s = -1;
        private final MediaDescriptionCompat t;
        private final long u;
        private Object v;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static QueueItem c(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.c(m.c.b(obj)), m.c.c(obj));
            }
            return null;
        }

        public static List<QueueItem> d(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat e() {
            return this.t;
        }

        public long g() {
            return this.u;
        }

        public Object i() {
            Object obj = this.v;
            if (obj == null) {
                Object a2 = m.c.a(this.t.j(), this.u);
                this.v = a2;
                return a2;
            }
            return obj;
        }

        public String toString() {
            StringBuilder G = wo1.G("MediaSession.QueueItem {Description=");
            G.append(this.t);
            G.append(", Id=");
            G.append(this.u);
            G.append(" }");
            return G.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.t.writeToParcel(parcel, i);
            parcel.writeLong(this.u);
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j != -1) {
                this.t = mediaDescriptionCompat;
                this.u = j;
                this.v = obj;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        public QueueItem(Parcel parcel) {
            this.t = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.u = parcel.readLong();
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SessionFlags {
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        private final Object s;
        private IMediaSession t;
        private Bundle u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        @i2({i2.a.LIBRARY_GROUP})
        public static Token c(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            IMediaSession N1 = IMediaSession.Stub.N1(ag.a(bundle, MediaSessionCompat.F));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.G);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.E);
            if (token == null) {
                return null;
            }
            return new Token(token.s, N1, bundle2);
        }

        public static Token d(Object obj) {
            return e(obj, null);
        }

        @i2({i2.a.LIBRARY_GROUP})
        public static Token e(Object obj, IMediaSession iMediaSession) {
            if (obj != null) {
                return new Token(m.u(obj), iMediaSession);
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Token) {
                Token token = (Token) obj;
                Object obj2 = this.s;
                if (obj2 == null) {
                    return token.s == null;
                }
                Object obj3 = token.s;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            }
            return false;
        }

        @i2({i2.a.LIBRARY_GROUP})
        public IMediaSession g() {
            return this.t;
        }

        public int hashCode() {
            Object obj = this.s;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @i2({i2.a.LIBRARY_GROUP})
        public Bundle i() {
            return this.u;
        }

        public Object j() {
            return this.s;
        }

        @i2({i2.a.LIBRARY_GROUP})
        public void k(IMediaSession iMediaSession) {
            this.t = iMediaSession;
        }

        @i2({i2.a.LIBRARY_GROUP})
        public void l(Bundle bundle) {
            this.u = bundle;
        }

        @i2({i2.a.LIBRARY_GROUP})
        public Bundle m() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.E, this);
            IMediaSession iMediaSession = this.t;
            if (iMediaSession != null) {
                ag.b(bundle, MediaSessionCompat.F, iMediaSession.asBinder());
            }
            Bundle bundle2 = this.u;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.G, bundle2);
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.s, i);
        }

        public Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        public Token(Object obj, IMediaSession iMediaSession, Bundle bundle) {
            this.s = obj;
            this.t = iMediaSession;
            this.u = bundle;
        }
    }

    /* loaded from: classes.dex */
    public class a extends Callback {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b extends Callback {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c extends Callback {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        Object A();

        void B(c20 c20Var);

        x10.b C();

        Token a();

        PlaybackStateCompat d();

        boolean h();

        void i(int i);

        void j(String str, Bundle bundle);

        String k();

        void l(PendingIntent pendingIntent);

        void m(Callback callback, Handler handler);

        void n(int i);

        void o(CharSequence charSequence);

        void p(MediaMetadataCompat mediaMetadataCompat);

        void q(boolean z);

        void r(PendingIntent pendingIntent);

        void release();

        void s(int i);

        void setExtras(Bundle bundle);

        void t(List<QueueItem> list);

        void u(int i);

        Object v();

        void w(boolean z);

        void x(int i);

        void y(x10.b bVar);

        void z(PlaybackStateCompat playbackStateCompat);
    }

    @e2(18)
    /* loaded from: classes.dex */
    public static class e extends i {
        private static boolean I = true;

        /* loaded from: classes.dex */
        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j) {
                e.this.g(18, -1, -1, Long.valueOf(j), null);
            }
        }

        public e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            if (I) {
                try {
                    this.i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    I = false;
                }
            }
            if (I) {
                return;
            }
            super.D(pendingIntent, componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public void P(PlaybackStateCompat playbackStateCompat) {
            long q = playbackStateCompat.q();
            float o = playbackStateCompat.o();
            long n = playbackStateCompat.n();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.r() == 3) {
                long j = 0;
                if (q > 0) {
                    if (n > 0) {
                        j = elapsedRealtime - n;
                        if (o > 0.0f && o != 1.0f) {
                            j = ((float) j) * o;
                        }
                    }
                    q += j;
                }
            }
            this.j.setPlaybackState(e(playbackStateCompat.r()), q, o);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public void R(PendingIntent pendingIntent, ComponentName componentName) {
            if (I) {
                this.i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.R(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public int f(long j) {
            int f = super.f(j);
            return (j & 256) != 0 ? f | 256 : f;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i, android.support.v4.media.session.MediaSessionCompat.d
        public void m(Callback callback, Handler handler) {
            super.m(callback, handler);
            if (callback == null) {
                this.j.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.j.setPlaybackPositionUpdateListener(new a());
        }
    }

    @e2(19)
    /* loaded from: classes.dex */
    public static class f extends e {

        /* loaded from: classes.dex */
        public class a implements RemoteControlClient.OnMetadataUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    f.this.g(19, -1, -1, RatingCompat.c(obj), null);
                }
            }
        }

        public f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public RemoteControlClient.MetadataEditor c(Bundle bundle) {
            RemoteControlClient.MetadataEditor c = super.c(bundle);
            PlaybackStateCompat playbackStateCompat = this.v;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.d()) & 128) != 0) {
                c.addEditableKey(268435457);
            }
            if (bundle == null) {
                return c;
            }
            if (bundle.containsKey(MediaMetadataCompat.C)) {
                c.putLong(8, bundle.getLong(MediaMetadataCompat.C));
            }
            if (bundle.containsKey(MediaMetadataCompat.N)) {
                c.putObject(101, (Object) bundle.getParcelable(MediaMetadataCompat.N));
            }
            if (bundle.containsKey(MediaMetadataCompat.M)) {
                c.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.M));
            }
            return c;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.i
        public int f(long j) {
            int f = super.f(j);
            return (j & 128) != 0 ? f | 512 : f;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.i, android.support.v4.media.session.MediaSessionCompat.d
        public void m(Callback callback, Handler handler) {
            super.m(callback, handler);
            if (callback == null) {
                this.j.setMetadataUpdateListener(null);
                return;
            }
            this.j.setMetadataUpdateListener(new a());
        }
    }

    @e2(28)
    /* loaded from: classes.dex */
    public static class h extends g {
        public h(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.g, android.support.v4.media.session.MediaSessionCompat.d
        @x1
        public final x10.b C() {
            return new x10.b(((MediaSession) this.a).getCurrentControllerInfo());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.g, android.support.v4.media.session.MediaSessionCompat.d
        public void y(x10.b bVar) {
        }

        public h(Object obj) {
            super(obj);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements d {
        public static final int a = 0;
        public boolean A;
        public int B;
        public int C;
        public Bundle D;
        public int E;
        public int F;
        public c20 G;
        private final Context b;
        private final ComponentName c;
        private final PendingIntent d;
        private final c e;
        private final Token f;
        public final String g;
        public final String h;
        public final AudioManager i;
        public final RemoteControlClient j;
        private d m;
        public volatile Callback r;
        private x10.b s;
        public int t;
        public MediaMetadataCompat u;
        public PlaybackStateCompat v;
        public PendingIntent w;
        public List<QueueItem> x;
        public CharSequence y;
        public int z;
        public final Object k = new Object();
        public final RemoteCallbackList<IMediaControllerCallback> l = new RemoteCallbackList<>();
        public boolean n = false;
        public boolean o = false;
        private boolean p = false;
        private boolean q = false;
        private c20.b H = new a();

        /* loaded from: classes.dex */
        public class a extends c20.b {
            public a() {
            }

            @Override // com.p7700g.p99005.c20.b
            public void a(c20 c20Var) {
                if (i.this.G != c20Var) {
                    return;
                }
                i iVar = i.this;
                i.this.O(new ParcelableVolumeInfo(iVar.E, iVar.F, c20Var.c(), c20Var.b(), c20Var.a()));
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            public final String a;
            public final Bundle b;
            public final ResultReceiver c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.a = str;
                this.b = bundle;
                this.c = resultReceiver;
            }
        }

        /* loaded from: classes.dex */
        public class c extends IMediaSession.Stub {
            public c() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void A(IMediaControllerCallback iMediaControllerCallback) {
                if (i.this.n) {
                    try {
                        iMediaControllerCallback.p();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                i.this.l.register(iMediaControllerCallback, new x10.b(x10.b.a, Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean B() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void C(RatingCompat ratingCompat) throws RemoteException {
                Q1(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void D(int i, int i2, String str) {
                i.this.Q(i, i2);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void E(Uri uri, Bundle bundle) throws RemoteException {
                S1(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void E0(int i, int i2, String str) {
                i.this.b(i, i2);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void H0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                S1(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void J0(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                R1(26, mediaDescriptionCompat, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean K() {
                return (i.this.t & 2) != 0;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent O() {
                PendingIntent pendingIntent;
                synchronized (i.this.k) {
                    pendingIntent = i.this.w;
                }
                return pendingIntent;
            }

            public void O1(int i) {
                i.this.g(i, 0, 0, null, null);
            }

            public void P1(int i, int i2) {
                i.this.g(i, i2, 0, null, null);
            }

            public void Q1(int i, Object obj) {
                i.this.g(i, 0, 0, obj, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void R(String str, Bundle bundle) throws RemoteException {
                S1(5, str, bundle);
            }

            public void R1(int i, Object obj, int i2) {
                i.this.g(i, i2, 0, obj, null);
            }

            public void S1(int i, Object obj, Bundle bundle) {
                i.this.g(i, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void V() throws RemoteException {
                O1(3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void Z0(int i) {
                P1(28, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long c() {
                long j;
                synchronized (i.this.k) {
                    j = i.this.t;
                }
                return j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void c0(String str, Bundle bundle) throws RemoteException {
                S1(4, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat d() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (i.this.k) {
                    i iVar = i.this;
                    playbackStateCompat = iVar.v;
                    mediaMetadataCompat = iVar.u;
                }
                return MediaSessionCompat.j(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String e() {
                return i.this.g;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void f0(IMediaControllerCallback iMediaControllerCallback) {
                i.this.l.unregister(iMediaControllerCallback);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void g(MediaDescriptionCompat mediaDescriptionCompat) {
                Q1(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (i.this.k) {
                    bundle = i.this.D;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                return i.this.u;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                return i.this.h;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void h(MediaDescriptionCompat mediaDescriptionCompat) {
                Q1(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void h0(String str, Bundle bundle) throws RemoteException {
                S1(8, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void h1() throws RemoteException {
                O1(7);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int i() {
                return i.this.z;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void j0(String str, Bundle bundle) throws RemoteException {
                S1(9, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void j1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                Q1(1, new b(str, bundle, resultReceiverWrapper.s));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence l() {
                return i.this.y;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void m0() throws RemoteException {
                O1(16);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void m1() throws RemoteException {
                O1(17);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
                O1(14);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
                O1(12);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
                O1(15);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void q(boolean z) throws RemoteException {
                Q1(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void q0(Uri uri, Bundle bundle) throws RemoteException {
                S1(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int r() {
                return i.this.C;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean s() {
                return i.this.A;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
                O1(13);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> t() {
                List<QueueItem> list;
                synchronized (i.this.k) {
                    list = i.this.x;
                }
                return list;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void t0(long j) throws RemoteException {
                Q1(18, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void u(int i) throws RemoteException {
                P1(23, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void u1(long j) {
                Q1(11, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int v() {
                return i.this.B;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void v1(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo w1() {
                int i;
                int i2;
                int i3;
                int streamMaxVolume;
                int streamVolume;
                synchronized (i.this.k) {
                    i iVar = i.this;
                    i = iVar.E;
                    i2 = iVar.F;
                    c20 c20Var = iVar.G;
                    i3 = 2;
                    if (i == 2) {
                        int c = c20Var.c();
                        int b = c20Var.b();
                        streamVolume = c20Var.a();
                        streamMaxVolume = b;
                        i3 = c;
                    } else {
                        streamMaxVolume = iVar.i.getStreamMaxVolume(i2);
                        streamVolume = i.this.i.getStreamVolume(i2);
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, streamMaxVolume, streamVolume);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void x(int i) throws RemoteException {
                P1(30, i);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void y(String str, Bundle bundle) throws RemoteException {
                S1(20, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean z0(KeyEvent keyEvent) {
                boolean z = (i.this.t & 1) != 0;
                if (z) {
                    Q1(21, keyEvent);
                }
                return z;
            }
        }

        /* loaded from: classes.dex */
        public class d extends Handler {
            private static final int A = 27;
            private static final int B = 28;
            private static final int C = 29;
            private static final int D = 30;
            private static final int E = 127;
            private static final int F = 126;
            private static final int a = 1;
            private static final int b = 2;
            private static final int c = 3;
            private static final int d = 4;
            private static final int e = 5;
            private static final int f = 6;
            private static final int g = 7;
            private static final int h = 8;
            private static final int i = 9;
            private static final int j = 10;
            private static final int k = 11;
            private static final int l = 12;
            private static final int m = 13;
            private static final int n = 14;
            private static final int o = 15;
            private static final int p = 16;
            private static final int q = 17;
            private static final int r = 18;
            private static final int s = 19;
            private static final int t = 31;
            private static final int u = 20;
            private static final int v = 21;
            private static final int w = 22;
            private static final int x = 23;
            private static final int y = 25;
            private static final int z = 26;

            public d(Looper looper) {
                super(looper);
            }

            private void a(KeyEvent keyEvent, Callback callback) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = i.this.v;
                long d2 = playbackStateCompat == null ? 0L : playbackStateCompat.d();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 126) {
                    if ((d2 & 4) != 0) {
                        callback.i();
                    }
                } else if (keyCode == 127) {
                    if ((d2 & 2) != 0) {
                        callback.h();
                    }
                } else {
                    switch (keyCode) {
                        case 86:
                            if ((d2 & 1) != 0) {
                                callback.C();
                                return;
                            }
                            return;
                        case 87:
                            if ((d2 & 32) != 0) {
                                callback.z();
                                return;
                            }
                            return;
                        case 88:
                            if ((d2 & 16) != 0) {
                                callback.A();
                                return;
                            }
                            return;
                        case 89:
                            if ((d2 & 8) != 0) {
                                callback.s();
                                return;
                            }
                            return;
                        case 90:
                            if ((d2 & 64) != 0) {
                                callback.f();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Callback callback = i.this.r;
                if (callback == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                i.this.y(new x10.b(data.getString(MediaSessionCompat.I), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle(MediaSessionCompat.L);
                MediaSessionCompat.b(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            b bVar = (b) message.obj;
                            callback.d(bVar.a, bVar.b, bVar.c);
                            break;
                        case 2:
                            i.this.b(message.arg1, 0);
                            break;
                        case 3:
                            callback.m();
                            break;
                        case 4:
                            callback.n((String) message.obj, bundle);
                            break;
                        case 5:
                            callback.o((String) message.obj, bundle);
                            break;
                        case 6:
                            callback.p((Uri) message.obj, bundle);
                            break;
                        case 7:
                            callback.i();
                            break;
                        case 8:
                            callback.j((String) message.obj, bundle);
                            break;
                        case 9:
                            callback.k((String) message.obj, bundle);
                            break;
                        case 10:
                            callback.l((Uri) message.obj, bundle);
                            break;
                        case 11:
                            callback.B(((Long) message.obj).longValue());
                            break;
                        case 12:
                            callback.h();
                            break;
                        case 13:
                            callback.C();
                            break;
                        case 14:
                            callback.z();
                            break;
                        case 15:
                            callback.A();
                            break;
                        case 16:
                            callback.f();
                            break;
                        case 17:
                            callback.s();
                            break;
                        case 18:
                            callback.t(((Long) message.obj).longValue());
                            break;
                        case 19:
                            callback.v((RatingCompat) message.obj);
                            break;
                        case 20:
                            callback.e((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!callback.g(intent)) {
                                a(keyEvent, callback);
                                break;
                            }
                            break;
                        case 22:
                            i.this.Q(message.arg1, 0);
                            break;
                        case 23:
                            callback.x(message.arg1);
                            break;
                        case 25:
                            callback.b((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            callback.c((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            callback.q((MediaDescriptionCompat) message.obj);
                            break;
                        case 28:
                            List<QueueItem> list = i.this.x;
                            if (list != null) {
                                int i2 = message.arg1;
                                QueueItem queueItem = (i2 < 0 || i2 >= list.size()) ? null : i.this.x.get(message.arg1);
                                if (queueItem != null) {
                                    callback.q(queueItem.e());
                                    break;
                                }
                            }
                            break;
                        case 29:
                            callback.u(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            callback.y(message.arg1);
                            break;
                        case 31:
                            callback.w((RatingCompat) message.obj, bundle);
                            break;
                    }
                } finally {
                    i.this.y(null);
                }
            }
        }

        public i(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.b = context;
                this.g = context.getPackageName();
                this.i = (AudioManager) context.getSystemService("audio");
                this.h = str;
                this.c = componentName;
                this.d = pendingIntent;
                c cVar = new c();
                this.e = cVar;
                this.f = new Token(cVar);
                this.z = 0;
                this.E = 1;
                this.F = 3;
                this.j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        private void E(boolean z) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).u0(z);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void F(String str, Bundle bundle) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).G1(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void G(Bundle bundle) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).b(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void H(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).K0(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void I(List<QueueItem> list) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).j(list);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void J(CharSequence charSequence) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).n(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void K(int i) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).R0(i);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void L() {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).p();
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
            this.l.kill();
        }

        private void M(int i) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).f1(i);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        private void N(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).F1(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Object A() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void B(c20 c20Var) {
            if (c20Var != null) {
                c20 c20Var2 = this.G;
                if (c20Var2 != null) {
                    c20Var2.g(null);
                }
                this.E = 2;
                this.G = c20Var;
                O(new ParcelableVolumeInfo(this.E, this.F, this.G.c(), this.G.b(), this.G.a()));
                c20Var.g(this.H);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public x10.b C() {
            x10.b bVar;
            synchronized (this.k) {
                bVar = this.s;
            }
            return bVar;
        }

        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.registerMediaButtonEventReceiver(componentName);
        }

        public void O(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.l.getBroadcastItem(beginBroadcast).L1(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.l.finishBroadcast();
        }

        public void P(PlaybackStateCompat playbackStateCompat) {
            this.j.setPlaybackState(e(playbackStateCompat.r()));
        }

        public void Q(int i, int i2) {
            if (this.E == 2) {
                c20 c20Var = this.G;
                if (c20Var != null) {
                    c20Var.f(i);
                    return;
                }
                return;
            }
            this.i.setStreamVolume(this.F, i, i2);
        }

        public void R(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.unregisterMediaButtonEventReceiver(componentName);
        }

        public boolean S() {
            if (this.o) {
                boolean z = this.p;
                if (!z && (this.t & 1) != 0) {
                    D(this.d, this.c);
                    this.p = true;
                } else if (z && (this.t & 1) == 0) {
                    R(this.d, this.c);
                    this.p = false;
                }
                boolean z2 = this.q;
                if (!z2 && (this.t & 2) != 0) {
                    this.i.registerRemoteControlClient(this.j);
                    this.q = true;
                    return true;
                } else if (z2 && (this.t & 2) == 0) {
                    this.j.setPlaybackState(0);
                    this.i.unregisterRemoteControlClient(this.j);
                    this.q = false;
                }
            } else {
                if (this.p) {
                    R(this.d, this.c);
                    this.p = false;
                }
                if (this.q) {
                    this.j.setPlaybackState(0);
                    this.i.unregisterRemoteControlClient(this.j);
                    this.q = false;
                }
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Token a() {
            return this.f;
        }

        public void b(int i, int i2) {
            if (this.E == 2) {
                c20 c20Var = this.G;
                if (c20Var != null) {
                    c20Var.e(i);
                    return;
                }
                return;
            }
            this.i.adjustStreamVolume(this.F, i, i2);
        }

        public RemoteControlClient.MetadataEditor c(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.I)) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(MediaMetadataCompat.I);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey(MediaMetadataCompat.K)) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.K);
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey(MediaMetadataCompat.w)) {
                editMetadata.putString(1, bundle.getString(MediaMetadataCompat.w));
            }
            if (bundle.containsKey(MediaMetadataCompat.H)) {
                editMetadata.putString(13, bundle.getString(MediaMetadataCompat.H));
            }
            if (bundle.containsKey(MediaMetadataCompat.u)) {
                editMetadata.putString(2, bundle.getString(MediaMetadataCompat.u));
            }
            if (bundle.containsKey(MediaMetadataCompat.x)) {
                editMetadata.putString(3, bundle.getString(MediaMetadataCompat.x));
            }
            if (bundle.containsKey(MediaMetadataCompat.A)) {
                editMetadata.putString(15, bundle.getString(MediaMetadataCompat.A));
            }
            if (bundle.containsKey(MediaMetadataCompat.z)) {
                editMetadata.putString(4, bundle.getString(MediaMetadataCompat.z));
            }
            if (bundle.containsKey(MediaMetadataCompat.B)) {
                editMetadata.putString(5, bundle.getString(MediaMetadataCompat.B));
            }
            if (bundle.containsKey(MediaMetadataCompat.G)) {
                editMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.G));
            }
            if (bundle.containsKey(MediaMetadataCompat.v)) {
                editMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.v));
            }
            if (bundle.containsKey(MediaMetadataCompat.D)) {
                editMetadata.putString(6, bundle.getString(MediaMetadataCompat.D));
            }
            if (bundle.containsKey(MediaMetadataCompat.t)) {
                editMetadata.putString(7, bundle.getString(MediaMetadataCompat.t));
            }
            if (bundle.containsKey(MediaMetadataCompat.E)) {
                editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.E));
            }
            if (bundle.containsKey(MediaMetadataCompat.y)) {
                editMetadata.putString(11, bundle.getString(MediaMetadataCompat.y));
            }
            return editMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public PlaybackStateCompat d() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.k) {
                playbackStateCompat = this.v;
            }
            return playbackStateCompat;
        }

        public int e(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public int f(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        public void g(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.k) {
                d dVar = this.m;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MediaSessionCompat.I, x10.b.a);
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle(MediaSessionCompat.L, bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public boolean h() {
            return this.o;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void i(int i) {
            synchronized (this.k) {
                this.t = i;
            }
            S();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void j(String str, Bundle bundle) {
            F(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public String k() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void l(PendingIntent pendingIntent) {
            synchronized (this.k) {
                this.w = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void m(Callback callback, Handler handler) {
            this.r = callback;
            if (callback != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.k) {
                    d dVar = this.m;
                    if (dVar != null) {
                        dVar.removeCallbacksAndMessages(null);
                    }
                    this.m = new d(handler.getLooper());
                    this.r.D(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void n(int i) {
            c20 c20Var = this.G;
            if (c20Var != null) {
                c20Var.g(null);
            }
            this.F = i;
            this.E = 1;
            int i2 = this.E;
            int i3 = this.F;
            O(new ParcelableVolumeInfo(i2, i3, 2, this.i.getStreamMaxVolume(i3), this.i.getStreamVolume(this.F)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void o(CharSequence charSequence) {
            this.y = charSequence;
            J(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void p(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.Builder(mediaMetadataCompat, MediaSessionCompat.M).a();
            }
            synchronized (this.k) {
                this.u = mediaMetadataCompat;
            }
            H(mediaMetadataCompat);
            if (this.o) {
                c(mediaMetadataCompat == null ? null : mediaMetadataCompat.g()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void q(boolean z) {
            if (this.A != z) {
                this.A = z;
                E(z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void r(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void release() {
            this.o = false;
            this.n = true;
            S();
            L();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void s(int i) {
            this.z = i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void setExtras(Bundle bundle) {
            this.D = bundle;
            G(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void t(List<QueueItem> list) {
            this.x = list;
            I(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void u(int i) {
            if (this.B != i) {
                this.B = i;
                K(i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Object v() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void w(boolean z) {
            if (z == this.o) {
                return;
            }
            this.o = z;
            if (S()) {
                p(this.u);
                z(this.v);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void x(int i) {
            if (this.C != i) {
                this.C = i;
                M(i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void y(x10.b bVar) {
            synchronized (this.k) {
                this.s = bVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void z(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.k) {
                this.v = playbackStateCompat;
            }
            N(playbackStateCompat);
            if (this.o) {
                if (playbackStateCompat == null) {
                    this.j.setPlaybackState(0);
                    this.j.setTransportControlFlags(0);
                    return;
                }
                P(playbackStateCompat);
                this.j.setTransportControlFlags(f(playbackStateCompat.d()));
            }
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public static void b(@z1 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat c(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, new g(obj));
    }

    public static PlaybackStateCompat j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat != null) {
            long j2 = -1;
            if (playbackStateCompat.q() == -1) {
                return playbackStateCompat;
            }
            if (playbackStateCompat.r() == 3 || playbackStateCompat.r() == 4 || playbackStateCompat.r() == 5) {
                long n2 = playbackStateCompat.n();
                if (n2 > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long q2 = playbackStateCompat.q() + (playbackStateCompat.o() * ((float) (elapsedRealtime - n2)));
                    if (mediaMetadataCompat != null && mediaMetadataCompat.c(MediaMetadataCompat.v)) {
                        j2 = mediaMetadataCompat.j(MediaMetadataCompat.v);
                    }
                    return new PlaybackStateCompat.Builder(playbackStateCompat).k(playbackStateCompat.r(), (j2 < 0 || q2 <= j2) ? q2 < 0 ? 0L : q2 : j2, playbackStateCompat.o(), elapsedRealtime).c();
                }
                return playbackStateCompat;
            }
            return playbackStateCompat;
        }
        return playbackStateCompat;
    }

    public void A(CharSequence charSequence) {
        this.N.o(charSequence);
    }

    public void B(int i2) {
        this.N.s(i2);
    }

    public void C(int i2) {
        this.N.u(i2);
    }

    public void D(PendingIntent pendingIntent) {
        this.N.l(pendingIntent);
    }

    public void E(int i2) {
        this.N.x(i2);
    }

    public void a(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener != null) {
            this.P.add(onActiveChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    @i2({i2.a.LIBRARY_GROUP})
    public String d() {
        return this.N.k();
    }

    public MediaControllerCompat e() {
        return this.O;
    }

    @x1
    public final x10.b f() {
        return this.N.C();
    }

    public Object g() {
        return this.N.A();
    }

    public Object h() {
        return this.N.v();
    }

    public Token i() {
        return this.N.a();
    }

    public boolean k() {
        return this.N.h();
    }

    public void l() {
        this.N.release();
    }

    public void m(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener != null) {
            this.P.remove(onActiveChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void n(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.N.j(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public void o(boolean z2) {
        this.N.w(z2);
        Iterator<OnActiveChangeListener> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void p(Callback callback) {
        q(callback, null);
    }

    public void q(Callback callback, Handler handler) {
        if (callback == null) {
            this.N.m(null, null);
            return;
        }
        d dVar = this.N;
        if (handler == null) {
            handler = new Handler();
        }
        dVar.m(callback, handler);
    }

    public void r(boolean z2) {
        this.N.q(z2);
    }

    public void s(Bundle bundle) {
        this.N.setExtras(bundle);
    }

    public void t(int i2) {
        this.N.i(i2);
    }

    public void u(PendingIntent pendingIntent) {
        this.N.r(pendingIntent);
    }

    public void v(MediaMetadataCompat mediaMetadataCompat) {
        this.N.p(mediaMetadataCompat);
    }

    public void w(PlaybackStateCompat playbackStateCompat) {
        this.N.z(playbackStateCompat);
    }

    public void x(int i2) {
        this.N.n(i2);
    }

    public void y(c20 c20Var) {
        if (c20Var != null) {
            this.N.B(c20Var);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void z(List<QueueItem> list) {
        this.N.t(list);
    }

    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public ResultReceiver s;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.s = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.s.writeToParcel(parcel, i);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.s = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, null, null, bundle);
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.P = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                componentName = componentName == null ? f20.c(context) : componentName;
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    h hVar = new h(context, str, bundle);
                    this.N = hVar;
                    p(new a());
                    hVar.r(pendingIntent);
                } else {
                    g gVar = new g(context, str, bundle);
                    this.N = gVar;
                    p(new b());
                    gVar.r(pendingIntent);
                }
                this.O = new MediaControllerCompat(context, this);
                if (M == 0) {
                    M = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    @e2(21)
    /* loaded from: classes.dex */
    public static class g implements d {
        public final Object a;
        public final Token b;
        public boolean c = false;
        public final RemoteCallbackList<IMediaControllerCallback> d = new RemoteCallbackList<>();
        public PlaybackStateCompat e;
        public List<QueueItem> f;
        public MediaMetadataCompat g;
        public int h;
        public boolean i;
        public int j;
        public int k;

        /* loaded from: classes.dex */
        public class a extends IMediaSession.Stub {
            public a() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void A(IMediaControllerCallback iMediaControllerCallback) {
                g gVar = g.this;
                if (gVar.c) {
                    return;
                }
                String k = gVar.k();
                if (k == null) {
                    k = x10.b.a;
                }
                g.this.d.register(iMediaControllerCallback, new x10.b(k, Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean B() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void C(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void D(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void E(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void E0(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void H0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void J0(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean K() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent O() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void R(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void V() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void Z0(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long c() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void c0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat d() {
                g gVar = g.this;
                return MediaSessionCompat.j(gVar.e, gVar.g);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String e() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void f0(IMediaControllerCallback iMediaControllerCallback) {
                g.this.d.unregister(iMediaControllerCallback);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void g(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void h(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void h0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void h1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int i() {
                return g.this.h;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void j0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void j1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence l() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void m0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void m1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void q(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void q0(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int r() {
                return g.this.k;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean s() {
                return g.this.i;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> t() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void t0(long j) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void u(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void u1(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int v() {
                return g.this.j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void v1(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo w1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void x(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void y(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean z0(KeyEvent keyEvent) {
                throw new AssertionError();
            }
        }

        public g(Context context, String str, Bundle bundle) {
            Object b = m.b(context, str);
            this.a = b;
            this.b = new Token(m.c(b), new a(), bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Object A() {
            return this.a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void B(c20 c20Var) {
            m.p(this.a, c20Var.d());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public x10.b C() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Token a() {
            return this.b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public PlaybackStateCompat d() {
            return this.e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public boolean h() {
            return m.e(this.a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void i(int i) {
            m.k(this.a, i);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void j(String str, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 23) {
                for (int beginBroadcast = this.d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.d.getBroadcastItem(beginBroadcast).G1(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.d.finishBroadcast();
            }
            m.g(this.a, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public String k() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return MediaSessionCompatApi24.b(this.a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void l(PendingIntent pendingIntent) {
            m.s(this.a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void m(Callback callback, Handler handler) {
            m.i(this.a, callback == null ? null : callback.a, handler);
            if (callback != null) {
                callback.D(this, handler);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void n(int i) {
            m.o(this.a, i);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void o(CharSequence charSequence) {
            m.r(this.a, charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void p(MediaMetadataCompat mediaMetadataCompat) {
            this.g = mediaMetadataCompat;
            m.m(this.a, mediaMetadataCompat == null ? null : mediaMetadataCompat.k());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void q(boolean z) {
            if (this.i != z) {
                this.i = z;
                for (int beginBroadcast = this.d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.d.getBroadcastItem(beginBroadcast).u0(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void r(PendingIntent pendingIntent) {
            m.l(this.a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void release() {
            this.c = true;
            m.f(this.a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void s(int i) {
            if (Build.VERSION.SDK_INT < 22) {
                this.h = i;
            } else {
                n.a(this.a, i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void setExtras(Bundle bundle) {
            m.j(this.a, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void t(List<QueueItem> list) {
            ArrayList arrayList;
            this.f = list;
            if (list != null) {
                arrayList = new ArrayList();
                for (QueueItem queueItem : list) {
                    arrayList.add(queueItem.i());
                }
            } else {
                arrayList = null;
            }
            m.q(this.a, arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void u(int i) {
            if (this.j != i) {
                this.j = i;
                for (int beginBroadcast = this.d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.d.getBroadcastItem(beginBroadcast).R0(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Object v() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void w(boolean z) {
            m.h(this.a, z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void x(int i) {
            if (this.k != i) {
                this.k = i;
                for (int beginBroadcast = this.d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.d.getBroadcastItem(beginBroadcast).f1(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void y(x10.b bVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void z(PlaybackStateCompat playbackStateCompat) {
            this.e = playbackStateCompat;
            for (int beginBroadcast = this.d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.d.getBroadcastItem(beginBroadcast).F1(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.d.finishBroadcast();
            m.n(this.a, playbackStateCompat == null ? null : playbackStateCompat.p());
        }

        public g(Object obj) {
            Object t = m.t(obj);
            this.a = t;
            this.b = new Token(m.c(t), new a());
        }
    }

    private MediaSessionCompat(Context context, d dVar) {
        this.P = new ArrayList<>();
        this.N = dVar;
        if (!m.d(dVar.A())) {
            p(new c());
        }
        this.O = new MediaControllerCompat(context, this);
    }
}