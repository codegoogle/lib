package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.p7700g.p99005.ag;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.g;
import com.p7700g.p99005.h;
import com.p7700g.p99005.i;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.q7;
import com.p7700g.p99005.r10;
import com.p7700g.p99005.s10;
import com.p7700g.p99005.t10;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final String a = "MediaBrowserCompat";
    public static final boolean b = Log.isLoggable(a, 3);
    public static final String c = "android.media.browse.extra.PAGE";
    public static final String d = "android.media.browse.extra.PAGE_SIZE";
    public static final String e = "android.media.browse.extra.MEDIA_ID";
    public static final String f = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String g = "android.support.v4.media.action.DOWNLOAD";
    public static final String h = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    private final b i;

    /* loaded from: classes.dex */
    public static class ConnectionCallback {
        public final Object a = com.p7700g.p99005.g.c(new b());
        public a b;

        /* loaded from: classes.dex */
        public interface a {
            void b();

            void d();

            void e();
        }

        /* loaded from: classes.dex */
        public class b implements g.a {
            public b() {
            }

            @Override // com.p7700g.p99005.g.a
            public void b() {
                a aVar = ConnectionCallback.this.b;
                if (aVar != null) {
                    aVar.b();
                }
                ConnectionCallback.this.c();
            }

            @Override // com.p7700g.p99005.g.a
            public void d() {
                a aVar = ConnectionCallback.this.b;
                if (aVar != null) {
                    aVar.d();
                }
                ConnectionCallback.this.a();
            }

            @Override // com.p7700g.p99005.g.a
            public void e() {
                a aVar = ConnectionCallback.this.b;
                if (aVar != null) {
                    aVar.e();
                }
                ConnectionCallback.this.b();
            }
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(a aVar) {
            this.b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class CustomActionCallback {
        public void a(String str, Bundle bundle, Bundle bundle2) {
        }

        public void b(String str, Bundle bundle, Bundle bundle2) {
        }

        public void c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends ResultReceiver {
        private final String v;
        private final Bundle w;
        private final CustomActionCallback x;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.v = str;
            this.w = bundle;
            this.x = customActionCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void c(int i, Bundle bundle) {
            if (this.x == null) {
                return;
            }
            MediaSessionCompat.b(bundle);
            if (i == -1) {
                this.x.a(this.v, this.w, bundle);
            } else if (i == 0) {
                this.x.c(this.v, this.w, bundle);
            } else if (i != 1) {
                StringBuilder H = wo1.H("Unknown result code: ", i, " (extras=");
                H.append(this.w);
                H.append(", resultData=");
                H.append(bundle);
                H.append(")");
                H.toString();
            } else {
                this.x.b(this.v, this.w, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ItemCallback {
        public final Object a;

        /* loaded from: classes.dex */
        public class a implements h.a {
            public a() {
            }

            @Override // com.p7700g.p99005.h.a
            public void a(Parcel parcel) {
                if (parcel == null) {
                    ItemCallback.this.b(null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                ItemCallback.this.b(MediaItem.CREATOR.createFromParcel(parcel));
            }

            @Override // com.p7700g.p99005.h.a
            public void onError(@x1 String str) {
                ItemCallback.this.a(str);
            }
        }

        public ItemCallback() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.a = com.p7700g.p99005.h.a(new a());
            } else {
                this.a = null;
            }
        }

        public void a(@x1 String str) {
        }

        public void b(MediaItem mediaItem) {
        }
    }

    /* loaded from: classes.dex */
    public static class ItemReceiver extends ResultReceiver {
        private final String v;
        private final ItemCallback w;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.v = str;
            this.w = itemCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void c(int i, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i == 0 && bundle != null && bundle.containsKey(t10.w)) {
                Parcelable parcelable = bundle.getParcelable(t10.w);
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    this.w.a(this.v);
                    return;
                } else {
                    this.w.b((MediaItem) parcelable);
                    return;
                }
            }
            this.w.a(this.v);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class SearchCallback {
        public void a(@x1 String str, Bundle bundle) {
        }

        public void b(@x1 String str, Bundle bundle, @x1 List<MediaItem> list) {
        }
    }

    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends ResultReceiver {
        private final String v;
        private final Bundle w;
        private final SearchCallback x;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.v = str;
            this.w = bundle;
            this.x = searchCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void c(int i, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i == 0 && bundle != null && bundle.containsKey(t10.x)) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(t10.x);
                ArrayList arrayList = null;
                if (parcelableArray != null) {
                    arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                }
                this.x.b(this.v, this.w, arrayList);
                return;
            }
            this.x.a(this.v, this.w);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class SubscriptionCallback {
        public final Object a;
        public final IBinder b = new Binder();
        public WeakReference<i> c;

        /* loaded from: classes.dex */
        public class a implements g.d {
            public a() {
            }

            @Override // com.p7700g.p99005.g.d
            public void c(@x1 String str, List<?> list) {
                WeakReference<i> weakReference = SubscriptionCallback.this.c;
                i iVar = weakReference == null ? null : weakReference.get();
                if (iVar == null) {
                    SubscriptionCallback.this.a(str, MediaItem.d(list));
                    return;
                }
                List<MediaItem> d = MediaItem.d(list);
                List<SubscriptionCallback> b = iVar.b();
                List<Bundle> c = iVar.c();
                for (int i = 0; i < b.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.a(str, d);
                    } else {
                        SubscriptionCallback.this.b(str, d(d, bundle), bundle);
                    }
                }
            }

            public List<MediaItem> d(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt(MediaBrowserCompat.c, -1);
                int i2 = bundle.getInt(MediaBrowserCompat.d, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i >= 0 && i2 >= 1 && i3 < list.size()) {
                    if (i4 > list.size()) {
                        i4 = list.size();
                    }
                    return list.subList(i3, i4);
                }
                return Collections.emptyList();
            }

            @Override // com.p7700g.p99005.g.d
            public void onError(@x1 String str) {
                SubscriptionCallback.this.c(str);
            }
        }

        /* loaded from: classes.dex */
        public class b extends a implements i.a {
            public b() {
                super();
            }

            @Override // com.p7700g.p99005.i.a
            public void a(@x1 String str, @x1 Bundle bundle) {
                SubscriptionCallback.this.d(str, bundle);
            }

            @Override // com.p7700g.p99005.i.a
            public void b(@x1 String str, List<?> list, @x1 Bundle bundle) {
                SubscriptionCallback.this.b(str, MediaItem.d(list), bundle);
            }
        }

        public SubscriptionCallback() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a = com.p7700g.p99005.i.a(new b());
            } else {
                this.a = com.p7700g.p99005.g.d(new a());
            }
        }

        public void a(@x1 String str, @x1 List<MediaItem> list) {
        }

        public void b(@x1 String str, @x1 List<MediaItem> list, @x1 Bundle bundle) {
        }

        public void c(@x1 String str) {
        }

        public void d(@x1 String str, @x1 Bundle bundle) {
        }

        public void e(i iVar) {
            this.c = new WeakReference<>(iVar);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends Handler {
        private final WeakReference<g> a;
        private WeakReference<Messenger> b;

        public a(g gVar) {
            this.a = new WeakReference<>(gVar);
        }

        public void a(Messenger messenger) {
            this.b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null || this.a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.b(data);
            g gVar = this.a.get();
            Messenger messenger = this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle(s10.k);
                    MediaSessionCompat.b(bundle);
                    gVar.g(messenger, data.getString(s10.d), (MediaSessionCompat.Token) data.getParcelable(s10.f), bundle);
                } else if (i == 2) {
                    gVar.m(messenger);
                } else if (i != 3) {
                    String str = "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1;
                } else {
                    Bundle bundle2 = data.getBundle(s10.g);
                    MediaSessionCompat.b(bundle2);
                    Bundle bundle3 = data.getBundle(s10.h);
                    MediaSessionCompat.b(bundle3);
                    gVar.i(messenger, data.getString(s10.d), data.getParcelableArrayList(s10.e), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                if (message.what == 1) {
                    gVar.m(messenger);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @x1
        MediaSessionCompat.Token a();

        @x1
        String c();

        void disconnect();

        void f(@x1 String str, Bundle bundle, @z1 CustomActionCallback customActionCallback);

        @z1
        Bundle getExtras();

        ComponentName h();

        boolean isConnected();

        void j(@x1 String str, @x1 ItemCallback itemCallback);

        void k();

        void l(@x1 String str, @z1 Bundle bundle, @x1 SubscriptionCallback subscriptionCallback);

        void n(@x1 String str, SubscriptionCallback subscriptionCallback);

        void o(@x1 String str, Bundle bundle, @x1 SearchCallback searchCallback);

        @z1
        Bundle p();
    }

    @e2(21)
    /* loaded from: classes.dex */
    public static class c implements b, g, ConnectionCallback.a {
        public final Context a;
        public final Object b;
        public final Bundle c;
        public final a d = new a(this);
        private final q7<String, i> e = new q7<>();
        public int f;
        public h g;
        public Messenger h;
        private MediaSessionCompat.Token i;
        private Bundle j;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ ItemCallback s;
            public final /* synthetic */ String t;

            public a(ItemCallback itemCallback, String str) {
                this.s = itemCallback;
                this.t = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ ItemCallback s;
            public final /* synthetic */ String t;

            public b(ItemCallback itemCallback, String str) {
                this.s = itemCallback;
                this.t = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0000c implements Runnable {
            public final /* synthetic */ ItemCallback s;
            public final /* synthetic */ String t;

            public RunnableC0000c(ItemCallback itemCallback, String str) {
                this.s = itemCallback;
                this.t = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ SearchCallback s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;

            public d(SearchCallback searchCallback, String str, Bundle bundle) {
                this.s = searchCallback;
                this.t = str;
                this.u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t, this.u);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ SearchCallback s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;

            public e(SearchCallback searchCallback, String str, Bundle bundle) {
                this.s = searchCallback;
                this.t = str;
                this.u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t, this.u);
            }
        }

        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ CustomActionCallback s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;

            public f(CustomActionCallback customActionCallback, String str, Bundle bundle) {
                this.s = customActionCallback;
                this.t = str;
                this.u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t, this.u, null);
            }
        }

        /* loaded from: classes.dex */
        public class g implements Runnable {
            public final /* synthetic */ CustomActionCallback s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;

            public g(CustomActionCallback customActionCallback, String str, Bundle bundle) {
                this.s = customActionCallback;
                this.t = str;
                this.u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t, this.u, null);
            }
        }

        public c(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.c = bundle2;
            bundle2.putInt(s10.p, 1);
            connectionCallback.d(this);
            this.b = com.p7700g.p99005.g.b(context, componentName, connectionCallback.a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        @x1
        public MediaSessionCompat.Token a() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.d(com.p7700g.p99005.g.i(this.b));
            }
            return this.i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.a
        public void b() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        @x1
        public String c() {
            return com.p7700g.p99005.g.g(this.b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.a
        public void d() {
            Bundle f2 = com.p7700g.p99005.g.f(this.b);
            if (f2 == null) {
                return;
            }
            this.f = f2.getInt(s10.q, 0);
            IBinder a2 = ag.a(f2, s10.r);
            if (a2 != null) {
                this.g = new h(a2, this.c);
                Messenger messenger = new Messenger(this.d);
                this.h = messenger;
                this.d.a(messenger);
                try {
                    this.g.e(this.a, this.h);
                } catch (RemoteException unused) {
                }
            }
            IMediaSession N1 = IMediaSession.Stub.N1(ag.a(f2, s10.s));
            if (N1 != null) {
                this.i = MediaSessionCompat.Token.e(com.p7700g.p99005.g.i(this.b), N1);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void disconnect() {
            Messenger messenger;
            h hVar = this.g;
            if (hVar != null && (messenger = this.h) != null) {
                try {
                    hVar.j(messenger);
                } catch (RemoteException unused) {
                }
            }
            com.p7700g.p99005.g.e(this.b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.a
        public void e() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void f(@x1 String str, Bundle bundle, @z1 CustomActionCallback customActionCallback) {
            if (isConnected()) {
                if (this.g == null && customActionCallback != null) {
                    this.d.post(new f(customActionCallback, str, bundle));
                }
                try {
                    this.g.h(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.d), this.h);
                    return;
                } catch (RemoteException unused) {
                    String str2 = "Remote error sending a custom action: action=" + str + ", extras=" + bundle;
                    if (customActionCallback != null) {
                        this.d.post(new g(customActionCallback, str, bundle));
                        return;
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot send a custom action (");
            sb.append(str);
            sb.append(") with ");
            sb.append("extras ");
            sb.append(bundle);
            throw new IllegalStateException(wo1.C(sb, " because the browser is not connected to the ", "service."));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        @z1
        public Bundle getExtras() {
            return com.p7700g.p99005.g.f(this.b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public ComponentName h() {
            return com.p7700g.p99005.g.h(this.b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void i(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.h != messenger) {
                return;
            }
            i iVar = this.e.get(str);
            if (iVar == null) {
                boolean z = MediaBrowserCompat.b;
                return;
            }
            SubscriptionCallback a2 = iVar.a(bundle);
            if (a2 != null) {
                if (bundle == null) {
                    if (list == null) {
                        a2.c(str);
                        return;
                    }
                    this.j = bundle2;
                    a2.a(str, list);
                    this.j = null;
                } else if (list == null) {
                    a2.d(str, bundle);
                } else {
                    this.j = bundle2;
                    a2.b(str, list, bundle);
                    this.j = null;
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public boolean isConnected() {
            return com.p7700g.p99005.g.j(this.b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void j(@x1 String str, @x1 ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (itemCallback != null) {
                if (!com.p7700g.p99005.g.j(this.b)) {
                    this.d.post(new a(itemCallback, str));
                    return;
                } else if (this.g == null) {
                    this.d.post(new b(itemCallback, str));
                    return;
                } else {
                    try {
                        this.g.d(str, new ItemReceiver(str, itemCallback, this.d), this.h);
                        return;
                    } catch (RemoteException unused) {
                        this.d.post(new RunnableC0000c(itemCallback, str));
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("cb is null");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void k() {
            com.p7700g.p99005.g.a(this.b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void l(@x1 String str, Bundle bundle, @x1 SubscriptionCallback subscriptionCallback) {
            i iVar = this.e.get(str);
            if (iVar == null) {
                iVar = new i();
                this.e.put(str, iVar);
            }
            subscriptionCallback.e(iVar);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            iVar.e(bundle2, subscriptionCallback);
            h hVar = this.g;
            if (hVar == null) {
                com.p7700g.p99005.g.k(this.b, str, subscriptionCallback.a);
                return;
            }
            try {
                hVar.a(str, subscriptionCallback.b, bundle2, this.h);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void m(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void n(@x1 String str, SubscriptionCallback subscriptionCallback) {
            i iVar = this.e.get(str);
            if (iVar == null) {
                return;
            }
            h hVar = this.g;
            if (hVar != null) {
                try {
                    if (subscriptionCallback == null) {
                        hVar.f(str, null, this.h);
                    } else {
                        List<SubscriptionCallback> b2 = iVar.b();
                        List<Bundle> c = iVar.c();
                        for (int size = b2.size() - 1; size >= 0; size--) {
                            if (b2.get(size) == subscriptionCallback) {
                                this.g.f(str, subscriptionCallback.b, this.h);
                                b2.remove(size);
                                c.remove(size);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                }
            } else if (subscriptionCallback == null) {
                com.p7700g.p99005.g.l(this.b, str);
            } else {
                List<SubscriptionCallback> b3 = iVar.b();
                List<Bundle> c2 = iVar.c();
                for (int size2 = b3.size() - 1; size2 >= 0; size2--) {
                    if (b3.get(size2) == subscriptionCallback) {
                        b3.remove(size2);
                        c2.remove(size2);
                    }
                }
                if (b3.size() == 0) {
                    com.p7700g.p99005.g.l(this.b, str);
                }
            }
            if (iVar.d() || subscriptionCallback == null) {
                this.e.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void o(@x1 String str, Bundle bundle, @x1 SearchCallback searchCallback) {
            if (isConnected()) {
                if (this.g == null) {
                    this.d.post(new d(searchCallback, str, bundle));
                    return;
                }
                try {
                    this.g.g(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.d), this.h);
                    return;
                } catch (RemoteException unused) {
                    this.d.post(new e(searchCallback, str, bundle));
                    return;
                }
            }
            throw new IllegalStateException("search() called while not connected");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public Bundle p() {
            return this.j;
        }
    }

    @e2(23)
    /* loaded from: classes.dex */
    public static class d extends c {
        public d(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c, android.support.v4.media.MediaBrowserCompat.b
        public void j(@x1 String str, @x1 ItemCallback itemCallback) {
            if (this.g == null) {
                com.p7700g.p99005.h.b(this.b, str, itemCallback.a);
            } else {
                super.j(str, itemCallback);
            }
        }
    }

    @e2(26)
    /* loaded from: classes.dex */
    public static class e extends d {
        public e(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c, android.support.v4.media.MediaBrowserCompat.b
        public void l(@x1 String str, @z1 Bundle bundle, @x1 SubscriptionCallback subscriptionCallback) {
            if (this.g != null && this.f >= 2) {
                super.l(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                com.p7700g.p99005.g.k(this.b, str, subscriptionCallback.a);
            } else {
                com.p7700g.p99005.i.b(this.b, str, bundle, subscriptionCallback.a);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c, android.support.v4.media.MediaBrowserCompat.b
        public void n(@x1 String str, SubscriptionCallback subscriptionCallback) {
            if (this.g != null && this.f >= 2) {
                super.n(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                com.p7700g.p99005.g.l(this.b, str);
            } else {
                com.p7700g.p99005.i.c(this.b, str, subscriptionCallback.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f implements b, g {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public final Context f;
        public final ComponentName g;
        public final ConnectionCallback h;
        public final Bundle i;
        public final a j = new a(this);
        private final q7<String, i> k = new q7<>();
        public int l = 1;
        public g m;
        public h n;
        public Messenger o;
        private String p;
        private MediaSessionCompat.Token q;
        private Bundle r;
        private Bundle s;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                if (fVar.l == 0) {
                    return;
                }
                fVar.l = 2;
                if (MediaBrowserCompat.b && fVar.m != null) {
                    StringBuilder G = wo1.G("mServiceConnection should be null. Instead it is ");
                    G.append(f.this.m);
                    throw new RuntimeException(G.toString());
                } else if (fVar.n == null) {
                    if (fVar.o == null) {
                        Intent intent = new Intent(t10.v);
                        intent.setComponent(f.this.g);
                        f fVar2 = f.this;
                        fVar2.m = new g();
                        boolean z = false;
                        try {
                            f fVar3 = f.this;
                            z = fVar3.f.bindService(intent, fVar3.m, 1);
                        } catch (Exception unused) {
                            StringBuilder G2 = wo1.G("Failed binding to service ");
                            G2.append(f.this.g);
                            G2.toString();
                        }
                        if (!z) {
                            f.this.d();
                            f.this.h.b();
                        }
                        if (MediaBrowserCompat.b) {
                            f.this.b();
                            return;
                        }
                        return;
                    }
                    StringBuilder G3 = wo1.G("mCallbacksMessenger should be null. Instead it is ");
                    G3.append(f.this.o);
                    throw new RuntimeException(G3.toString());
                } else {
                    StringBuilder G4 = wo1.G("mServiceBinderWrapper should be null. Instead it is ");
                    G4.append(f.this.n);
                    throw new RuntimeException(G4.toString());
                }
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                Messenger messenger = fVar.o;
                if (messenger != null) {
                    try {
                        fVar.n.c(messenger);
                    } catch (RemoteException unused) {
                        StringBuilder G = wo1.G("RemoteException during connect for ");
                        G.append(f.this.g);
                        G.toString();
                    }
                }
                f fVar2 = f.this;
                int i = fVar2.l;
                fVar2.d();
                if (i != 0) {
                    f.this.l = i;
                }
                if (MediaBrowserCompat.b) {
                    f.this.b();
                }
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ ItemCallback s;
            public final /* synthetic */ String t;

            public c(ItemCallback itemCallback, String str) {
                this.s = itemCallback;
                this.t = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ ItemCallback s;
            public final /* synthetic */ String t;

            public d(ItemCallback itemCallback, String str) {
                this.s = itemCallback;
                this.t = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ SearchCallback s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;

            public e(SearchCallback searchCallback, String str, Bundle bundle) {
                this.s = searchCallback;
                this.t = str;
                this.u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t, this.u);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$f  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0001f implements Runnable {
            public final /* synthetic */ CustomActionCallback s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;

            public RunnableC0001f(CustomActionCallback customActionCallback, String str, Bundle bundle) {
                this.s = customActionCallback;
                this.t = str;
                this.u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.a(this.t, this.u, null);
            }
        }

        /* loaded from: classes.dex */
        public class g implements ServiceConnection {

            /* loaded from: classes.dex */
            public class a implements Runnable {
                public final /* synthetic */ ComponentName s;
                public final /* synthetic */ IBinder t;

                public a(ComponentName componentName, IBinder iBinder) {
                    this.s = componentName;
                    this.t = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z = MediaBrowserCompat.b;
                    if (z) {
                        StringBuilder G = wo1.G("MediaServiceConnection.onServiceConnected name=");
                        G.append(this.s);
                        G.append(" binder=");
                        G.append(this.t);
                        G.toString();
                        f.this.b();
                    }
                    if (g.this.a("onServiceConnected")) {
                        f fVar = f.this;
                        fVar.n = new h(this.t, fVar.i);
                        f.this.o = new Messenger(f.this.j);
                        f fVar2 = f.this;
                        fVar2.j.a(fVar2.o);
                        f.this.l = 2;
                        if (z) {
                            try {
                                f.this.b();
                            } catch (RemoteException unused) {
                                StringBuilder G2 = wo1.G("RemoteException during connect for ");
                                G2.append(f.this.g);
                                G2.toString();
                                if (MediaBrowserCompat.b) {
                                    f.this.b();
                                    return;
                                }
                                return;
                            }
                        }
                        f fVar3 = f.this;
                        fVar3.n.b(fVar3.f, fVar3.o);
                    }
                }
            }

            /* loaded from: classes.dex */
            public class b implements Runnable {
                public final /* synthetic */ ComponentName s;

                public b(ComponentName componentName) {
                    this.s = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.b) {
                        StringBuilder G = wo1.G("MediaServiceConnection.onServiceDisconnected name=");
                        G.append(this.s);
                        G.append(" this=");
                        G.append(this);
                        G.append(" mServiceConnection=");
                        G.append(f.this.m);
                        G.toString();
                        f.this.b();
                    }
                    if (g.this.a("onServiceDisconnected")) {
                        f fVar = f.this;
                        fVar.n = null;
                        fVar.o = null;
                        fVar.j.a(null);
                        f fVar2 = f.this;
                        fVar2.l = 4;
                        fVar2.h.c();
                    }
                }
            }

            public g() {
            }

            private void b(Runnable runnable) {
                if (Thread.currentThread() == f.this.j.getLooper().getThread()) {
                    runnable.run();
                } else {
                    f.this.j.post(runnable);
                }
            }

            public boolean a(String str) {
                int i;
                f fVar = f.this;
                if (fVar.m != this || (i = fVar.l) == 0 || i == 1) {
                    int i2 = fVar.l;
                    if (i2 == 0 || i2 == 1) {
                        return false;
                    }
                    StringBuilder L = wo1.L(str, " for ");
                    L.append(f.this.g);
                    L.append(" with mServiceConnection=");
                    L.append(f.this.m);
                    L.append(" this=");
                    L.append(this);
                    L.toString();
                    return false;
                }
                return true;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public f(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (connectionCallback != null) {
                this.f = context;
                this.g = componentName;
                this.h = connectionCallback;
                this.i = bundle == null ? null : new Bundle(bundle);
                return;
            }
            throw new IllegalArgumentException("connection callback must not be null");
        }

        private static String e(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? wo1.l("UNKNOWN/", i) : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
        }

        private boolean q(Messenger messenger, String str) {
            int i;
            if (this.o != messenger || (i = this.l) == 0 || i == 1) {
                int i2 = this.l;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                StringBuilder L = wo1.L(str, " for ");
                L.append(this.g);
                L.append(" with mCallbacksMessenger=");
                L.append(this.o);
                L.append(" this=");
                L.append(this);
                L.toString();
                return false;
            }
            return true;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        @x1
        public MediaSessionCompat.Token a() {
            if (isConnected()) {
                return this.q;
            }
            throw new IllegalStateException(wo1.z(wo1.G("getSessionToken() called while not connected(state="), this.l, ")"));
        }

        public void b() {
            StringBuilder G = wo1.G("  mServiceComponent=");
            G.append(this.g);
            G.toString();
            String str = "  mCallback=" + this.h;
            String str2 = "  mRootHints=" + this.i;
            e(this.l);
            StringBuilder G2 = wo1.G("  mServiceConnection=");
            G2.append(this.m);
            G2.toString();
            String str3 = "  mServiceBinderWrapper=" + this.n;
            String str4 = "  mCallbacksMessenger=" + this.o;
            String str5 = "  mMediaSessionToken=" + this.q;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        @x1
        public String c() {
            if (isConnected()) {
                return this.p;
            }
            throw new IllegalStateException(wo1.C(wo1.G("getRoot() called while not connected(state="), e(this.l), ")"));
        }

        public void d() {
            g gVar = this.m;
            if (gVar != null) {
                this.f.unbindService(gVar);
            }
            this.l = 1;
            this.m = null;
            this.n = null;
            this.o = null;
            this.j.a(null);
            this.p = null;
            this.q = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void disconnect() {
            this.l = 0;
            this.j.post(new b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void f(@x1 String str, Bundle bundle, @z1 CustomActionCallback customActionCallback) {
            if (isConnected()) {
                try {
                    this.n.h(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.j), this.o);
                    return;
                } catch (RemoteException unused) {
                    String str2 = "Remote error sending a custom action: action=" + str + ", extras=" + bundle;
                    if (customActionCallback != null) {
                        this.j.post(new RunnableC0001f(customActionCallback, str, bundle));
                        return;
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot send a custom action (");
            sb.append(str);
            sb.append(") with ");
            sb.append("extras ");
            sb.append(bundle);
            throw new IllegalStateException(wo1.C(sb, " because the browser is not connected to the ", "service."));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (q(messenger, "onConnect")) {
                int i = this.l;
                if (i != 2) {
                    e(i);
                    return;
                }
                this.p = str;
                this.q = token;
                this.r = bundle;
                this.l = 3;
                if (MediaBrowserCompat.b) {
                    b();
                }
                this.h.a();
                try {
                    for (Map.Entry<String, i> entry : this.k.entrySet()) {
                        String key = entry.getKey();
                        i value = entry.getValue();
                        List<SubscriptionCallback> b2 = value.b();
                        List<Bundle> c2 = value.c();
                        for (int i2 = 0; i2 < b2.size(); i2++) {
                            this.n.a(key, b2.get(i2).b, c2.get(i2), this.o);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        @z1
        public Bundle getExtras() {
            if (isConnected()) {
                return this.r;
            }
            throw new IllegalStateException(wo1.C(wo1.G("getExtras() called while not connected (state="), e(this.l), ")"));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        @x1
        public ComponentName h() {
            if (isConnected()) {
                return this.g;
            }
            throw new IllegalStateException(wo1.z(wo1.G("getServiceComponent() called while not connected (state="), this.l, ")"));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void i(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            SubscriptionCallback a2;
            if (q(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.b) {
                    StringBuilder G = wo1.G("onLoadChildren for ");
                    G.append(this.g);
                    G.append(" id=");
                    G.append(str);
                    G.toString();
                }
                i iVar = this.k.get(str);
                if (iVar == null || (a2 = iVar.a(bundle)) == null) {
                    return;
                }
                if (bundle == null) {
                    if (list == null) {
                        a2.c(str);
                        return;
                    }
                    this.s = bundle2;
                    a2.a(str, list);
                    this.s = null;
                } else if (list == null) {
                    a2.d(str, bundle);
                } else {
                    this.s = bundle2;
                    a2.b(str, list, bundle);
                    this.s = null;
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public boolean isConnected() {
            return this.l == 3;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void j(@x1 String str, @x1 ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (itemCallback != null) {
                if (!isConnected()) {
                    this.j.post(new c(itemCallback, str));
                    return;
                }
                try {
                    this.n.d(str, new ItemReceiver(str, itemCallback, this.j), this.o);
                    return;
                } catch (RemoteException unused) {
                    this.j.post(new d(itemCallback, str));
                    return;
                }
            }
            throw new IllegalArgumentException("cb is null");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void k() {
            int i = this.l;
            if (i != 0 && i != 1) {
                throw new IllegalStateException(wo1.C(wo1.G("connect() called while neigther disconnecting nor disconnected (state="), e(this.l), ")"));
            }
            this.l = 2;
            this.j.post(new a());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void l(@x1 String str, Bundle bundle, @x1 SubscriptionCallback subscriptionCallback) {
            i iVar = this.k.get(str);
            if (iVar == null) {
                iVar = new i();
                this.k.put(str, iVar);
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            iVar.e(bundle2, subscriptionCallback);
            if (isConnected()) {
                try {
                    this.n.a(str, subscriptionCallback.b, bundle2, this.o);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void m(Messenger messenger) {
            StringBuilder G = wo1.G("onConnectFailed for ");
            G.append(this.g);
            G.toString();
            if (q(messenger, "onConnectFailed")) {
                int i = this.l;
                if (i != 2) {
                    e(i);
                    return;
                }
                d();
                this.h.b();
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void n(@x1 String str, SubscriptionCallback subscriptionCallback) {
            i iVar = this.k.get(str);
            if (iVar == null) {
                return;
            }
            try {
                if (subscriptionCallback == null) {
                    if (isConnected()) {
                        this.n.f(str, null, this.o);
                    }
                } else {
                    List<SubscriptionCallback> b2 = iVar.b();
                    List<Bundle> c2 = iVar.c();
                    for (int size = b2.size() - 1; size >= 0; size--) {
                        if (b2.get(size) == subscriptionCallback) {
                            if (isConnected()) {
                                this.n.f(str, subscriptionCallback.b, this.o);
                            }
                            b2.remove(size);
                            c2.remove(size);
                        }
                    }
                }
            } catch (RemoteException unused) {
            }
            if (iVar.d() || subscriptionCallback == null) {
                this.k.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void o(@x1 String str, Bundle bundle, @x1 SearchCallback searchCallback) {
            if (isConnected()) {
                try {
                    this.n.g(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.j), this.o);
                    return;
                } catch (RemoteException unused) {
                    this.j.post(new e(searchCallback, str, bundle));
                    return;
                }
            }
            throw new IllegalStateException(wo1.C(wo1.G("search() called while not connected (state="), e(this.l), ")"));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public Bundle p() {
            return this.s;
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void g(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void i(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void m(Messenger messenger);
    }

    /* loaded from: classes.dex */
    public static class h {
        private Messenger a;
        private Bundle b;

        public h(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        private void i(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.a.send(obtain);
        }

        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(s10.d, str);
            ag.b(bundle2, s10.a, iBinder);
            bundle2.putBundle(s10.g, bundle);
            i(3, bundle2, messenger);
        }

        public void b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(s10.i, context.getPackageName());
            bundle.putBundle(s10.k, this.b);
            i(1, bundle, messenger);
        }

        public void c(Messenger messenger) throws RemoteException {
            i(2, null, messenger);
        }

        public void d(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(s10.d, str);
            bundle.putParcelable(s10.j, resultReceiver);
            i(5, bundle, messenger);
        }

        public void e(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(s10.i, context.getPackageName());
            bundle.putBundle(s10.k, this.b);
            i(6, bundle, messenger);
        }

        public void f(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(s10.d, str);
            ag.b(bundle, s10.a, iBinder);
            i(4, bundle, messenger);
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(s10.m, str);
            bundle2.putBundle(s10.l, bundle);
            bundle2.putParcelable(s10.j, resultReceiver);
            i(8, bundle2, messenger);
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(s10.n, str);
            bundle2.putBundle(s10.o, bundle);
            bundle2.putParcelable(s10.j, resultReceiver);
            i(9, bundle2, messenger);
        }

        public void j(Messenger messenger) throws RemoteException {
            i(7, null, messenger);
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        private final List<SubscriptionCallback> a = new ArrayList();
        private final List<Bundle> b = new ArrayList();

        public SubscriptionCallback a(Bundle bundle) {
            for (int i = 0; i < this.b.size(); i++) {
                if (r10.a(this.b.get(i), bundle)) {
                    return this.a.get(i);
                }
            }
            return null;
        }

        public List<SubscriptionCallback> b() {
            return this.a;
        }

        public List<Bundle> c() {
            return this.b;
        }

        public boolean d() {
            return this.a.isEmpty();
        }

        public void e(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.b.size(); i++) {
                if (r10.a(this.b.get(i), bundle)) {
                    this.a.set(i, subscriptionCallback);
                    return;
                }
            }
            this.a.add(subscriptionCallback);
            this.b.add(bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.i = new e(context, componentName, connectionCallback, bundle);
        } else if (i2 >= 23) {
            this.i = new d(context, componentName, connectionCallback, bundle);
        } else {
            this.i = new c(context, componentName, connectionCallback, bundle);
        }
    }

    public void a() {
        this.i.k();
    }

    public void b() {
        this.i.disconnect();
    }

    @z1
    public Bundle c() {
        return this.i.getExtras();
    }

    public void d(@x1 String str, @x1 ItemCallback itemCallback) {
        this.i.j(str, itemCallback);
    }

    @i2({i2.a.LIBRARY})
    @z1
    public Bundle e() {
        return this.i.p();
    }

    @x1
    public String f() {
        return this.i.c();
    }

    @x1
    public ComponentName g() {
        return this.i.h();
    }

    @x1
    public MediaSessionCompat.Token h() {
        return this.i.a();
    }

    public boolean i() {
        return this.i.isConnected();
    }

    public void j(@x1 String str, Bundle bundle, @x1 SearchCallback searchCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (searchCallback != null) {
            this.i.o(str, bundle, searchCallback);
            return;
        }
        throw new IllegalArgumentException("callback cannot be null");
    }

    public void k(@x1 String str, Bundle bundle, @z1 CustomActionCallback customActionCallback) {
        if (!TextUtils.isEmpty(str)) {
            this.i.f(str, bundle, customActionCallback);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void l(@x1 String str, @x1 Bundle bundle, @x1 SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle != null) {
            this.i.l(str, bundle, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("options are null");
    }

    public void m(@x1 String str, @x1 SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback != null) {
            this.i.l(str, null, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    public void n(@x1 String str) {
        if (!TextUtils.isEmpty(str)) {
            this.i.n(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void o(@x1 String str, @x1 SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback != null) {
            this.i.n(str, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public static final int s = 1;
        public static final int t = 2;
        private final int u;
        private final MediaDescriptionCompat v;

        @i2({i2.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Flags {
        }

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@x1 MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.k())) {
                    this.u = i;
                    this.v = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static MediaItem c(Object obj) {
            if (obj != null) {
                return new MediaItem(MediaDescriptionCompat.c(g.c.a(obj)), g.c.b(obj));
            }
            return null;
        }

        public static List<MediaItem> d(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
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

        @x1
        public MediaDescriptionCompat e() {
            return this.v;
        }

        public int g() {
            return this.u;
        }

        @z1
        public String i() {
            return this.v.k();
        }

        public boolean j() {
            return (this.u & 1) != 0;
        }

        public boolean k() {
            return (this.u & 2) != 0;
        }

        public String toString() {
            StringBuilder K = wo1.K("MediaItem{", "mFlags=");
            K.append(this.u);
            K.append(", mDescription=");
            K.append(this.v);
            K.append('}');
            return K.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.u);
            this.v.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.u = parcel.readInt();
            this.v = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}