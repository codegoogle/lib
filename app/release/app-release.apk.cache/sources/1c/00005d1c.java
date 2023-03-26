package com.p7700g.p99005;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
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
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.u10;
import com.p7700g.p99005.v10;
import com.p7700g.p99005.w10;
import com.p7700g.p99005.x10;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public abstract class t10 extends Service {
    public static final int A = 4;
    @i2({i2.a.LIBRARY})
    public static final int B = -1;
    @i2({i2.a.LIBRARY})
    public static final int C = 0;
    @i2({i2.a.LIBRARY})
    public static final int D = 1;
    public static final String s = "MBServiceCompat";
    public static final boolean t = Log.isLoggable(s, 3);
    private static final float u = 1.0E-5f;
    public static final String v = "android.media.browse.MediaBrowserService";
    @i2({i2.a.LIBRARY})
    public static final String w = "media_item";
    @i2({i2.a.LIBRARY})
    public static final String x = "search_results";
    public static final int y = 1;
    public static final int z = 2;
    private g E;
    public f G;
    public MediaSessionCompat.Token I;
    public final q7<IBinder, f> F = new q7<>();
    public final q H = new q();

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class a extends m<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ f g;
        public final /* synthetic */ String h;
        public final /* synthetic */ Bundle i;
        public final /* synthetic */ Bundle j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.g = fVar;
            this.h = str;
            this.i = bundle;
            this.j = bundle2;
        }

        @Override // com.p7700g.p99005.t10.m
        /* renamed from: l */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            f fVar = t10.this.F.get(this.g.f.asBinder());
            f fVar2 = this.g;
            if (fVar != fVar2) {
                if (t10.t) {
                    String str = fVar2.a;
                    return;
                }
                return;
            }
            if ((c() & 1) != 0) {
                list = t10.this.b(list, this.i);
            }
            try {
                this.g.f.a(this.h, list, this.i, this.j);
            } catch (RemoteException unused) {
                String str2 = this.g.a;
            }
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class b extends m<MediaBrowserCompat.MediaItem> {
        public final /* synthetic */ ResultReceiver g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.g = resultReceiver;
        }

        @Override // com.p7700g.p99005.t10.m
        /* renamed from: l */
        public void g(MediaBrowserCompat.MediaItem mediaItem) {
            if ((c() & 2) != 0) {
                this.g.d(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(t10.w, mediaItem);
            this.g.d(0, bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class c extends m<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ ResultReceiver g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.g = resultReceiver;
        }

        @Override // com.p7700g.p99005.t10.m
        /* renamed from: l */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            if ((c() & 4) == 0 && list != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(t10.x, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                this.g.d(0, bundle);
                return;
            }
            this.g.d(-1, null);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class d extends m<Bundle> {
        public final /* synthetic */ ResultReceiver g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.g = resultReceiver;
        }

        @Override // com.p7700g.p99005.t10.m
        public void e(Bundle bundle) {
            this.g.d(-1, bundle);
        }

        @Override // com.p7700g.p99005.t10.m
        public void f(Bundle bundle) {
            this.g.d(1, bundle);
        }

        @Override // com.p7700g.p99005.t10.m
        /* renamed from: l */
        public void g(Bundle bundle) {
            this.g.d(0, bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public static final class e {
        public static final String a = "android.service.media.extra.RECENT";
        public static final String b = "android.service.media.extra.OFFLINE";
        public static final String c = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String d = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final String e;
        private final Bundle f;

        public e(@x1 String str, @z1 Bundle bundle) {
            if (str != null) {
                this.e = str;
                this.f = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public Bundle a() {
            return this.f;
        }

        public String b() {
            return this.e;
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class f implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final x10.b d;
        public final Bundle e;
        public final o f;
        public final HashMap<String, List<fp<IBinder, Bundle>>> g = new HashMap<>();
        public e h;

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                t10.this.F.remove(fVar.f.asBinder());
            }
        }

        public f(String str, int i, int i2, Bundle bundle, o oVar) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = new x10.b(str, i, i2);
            this.e = bundle;
            this.f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            t10.this.H.post(new a());
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        void a();

        Bundle c();

        void d(x10.b bVar, String str, Bundle bundle);

        x10.b f();

        IBinder g(Intent intent);

        void j(String str, Bundle bundle);

        void k(MediaSessionCompat.Token token);
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public class h implements g, u10.d {
        public final List<Bundle> a = new ArrayList();
        public Object b;
        public Messenger c;

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ MediaSessionCompat.Token s;

            public a(MediaSessionCompat.Token token) {
                this.s = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!h.this.a.isEmpty()) {
                    IMediaSession g = this.s.g();
                    if (g != null) {
                        for (Bundle bundle : h.this.a) {
                            ag.b(bundle, s10.s, g.asBinder());
                        }
                    }
                    h.this.a.clear();
                }
                u10.e(h.this.b, this.s.j());
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class b extends m<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ u10.c g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Object obj, u10.c cVar) {
                super(obj);
                this.g = cVar;
            }

            @Override // com.p7700g.p99005.t10.m
            public void b() {
                this.g.a();
            }

            @Override // com.p7700g.p99005.t10.m
            /* renamed from: l */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.g.c(arrayList);
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ String s;
            public final /* synthetic */ Bundle t;

            public c(String str, Bundle bundle) {
                this.s = str;
                this.t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : t10.this.F.keySet()) {
                    q7<IBinder, f> q7Var = t10.this.F;
                    h.this.n(q7Var.get(iBinder), this.s, this.t);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ x10.b s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;

            public d(x10.b bVar, String str, Bundle bundle) {
                this.s = bVar;
                this.t = str;
                this.u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < t10.this.F.size(); i++) {
                    f r = t10.this.F.r(i);
                    if (r.d.equals(this.s)) {
                        h.this.n(r, this.t, this.u);
                    }
                }
            }
        }

        public h() {
        }

        @Override // com.p7700g.p99005.t10.g
        public void a() {
            Object a2 = u10.a(t10.this, this);
            this.b = a2;
            u10.d(a2);
        }

        @Override // com.p7700g.p99005.t10.g
        public Bundle c() {
            if (this.c == null) {
                return null;
            }
            f fVar = t10.this.G;
            if (fVar != null) {
                if (fVar.e == null) {
                    return null;
                }
                return new Bundle(t10.this.G.e);
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // com.p7700g.p99005.t10.g
        public void d(x10.b bVar, String str, Bundle bundle) {
            l(bVar, str, bundle);
        }

        @Override // com.p7700g.p99005.u10.d
        public void e(String str, u10.c<List<Parcel>> cVar) {
            t10.this.m(str, new b(str, cVar));
        }

        @Override // com.p7700g.p99005.t10.g
        public x10.b f() {
            f fVar = t10.this.G;
            if (fVar != null) {
                return fVar.d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // com.p7700g.p99005.t10.g
        public IBinder g(Intent intent) {
            return u10.c(this.b, intent);
        }

        @Override // com.p7700g.p99005.u10.d
        public u10.a i(String str, int i, Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || bundle.getInt(s10.p, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(s10.p);
                this.c = new Messenger(t10.this.H);
                bundle2 = new Bundle();
                bundle2.putInt(s10.q, 2);
                ag.b(bundle2, s10.r, this.c.getBinder());
                MediaSessionCompat.Token token = t10.this.I;
                if (token != null) {
                    IMediaSession g = token.g();
                    ag.b(bundle2, s10.s, g == null ? null : g.asBinder());
                } else {
                    this.a.add(bundle2);
                }
            }
            t10 t10Var = t10.this;
            t10Var.G = new f(str, -1, i, bundle, null);
            e l = t10.this.l(str, i, bundle);
            t10.this.G = null;
            if (l == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = l.a();
            } else if (l.a() != null) {
                bundle2.putAll(l.a());
            }
            return new u10.a(l.b(), bundle2);
        }

        @Override // com.p7700g.p99005.t10.g
        public void j(String str, Bundle bundle) {
            o(str, bundle);
            m(str, bundle);
        }

        @Override // com.p7700g.p99005.t10.g
        public void k(MediaSessionCompat.Token token) {
            t10.this.H.a(new a(token));
        }

        public void l(x10.b bVar, String str, Bundle bundle) {
            t10.this.H.post(new d(bVar, str, bundle));
        }

        public void m(String str, Bundle bundle) {
            t10.this.H.post(new c(str, bundle));
        }

        public void n(f fVar, String str, Bundle bundle) {
            List<fp<IBinder, Bundle>> list = fVar.g.get(str);
            if (list != null) {
                for (fp<IBinder, Bundle> fpVar : list) {
                    if (r10.b(bundle, fpVar.b)) {
                        t10.this.t(str, fVar, fpVar.b, bundle);
                    }
                }
            }
        }

        public void o(String str, Bundle bundle) {
            u10.b(this.b, str);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public class i extends h implements v10.b {

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a extends m<MediaBrowserCompat.MediaItem> {
            public final /* synthetic */ u10.c g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, u10.c cVar) {
                super(obj);
                this.g = cVar;
            }

            @Override // com.p7700g.p99005.t10.m
            public void b() {
                this.g.a();
            }

            @Override // com.p7700g.p99005.t10.m
            /* renamed from: l */
            public void g(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.g.c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.g.c(obtain);
            }
        }

        public i() {
            super();
        }

        @Override // com.p7700g.p99005.t10.h, com.p7700g.p99005.t10.g
        public void a() {
            Object a2 = v10.a(t10.this, this);
            this.b = a2;
            u10.d(a2);
        }

        @Override // com.p7700g.p99005.v10.b
        public void b(String str, u10.c<Parcel> cVar) {
            t10.this.o(str, new a(str, cVar));
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public class j extends i implements w10.c {

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a extends m<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ w10.b g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, w10.b bVar) {
                super(obj);
                this.g = bVar;
            }

            @Override // com.p7700g.p99005.t10.m
            public void b() {
                this.g.a();
            }

            @Override // com.p7700g.p99005.t10.m
            /* renamed from: l */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.g.c(arrayList, c());
            }
        }

        public j() {
            super();
        }

        @Override // com.p7700g.p99005.t10.i, com.p7700g.p99005.t10.h, com.p7700g.p99005.t10.g
        public void a() {
            Object a2 = w10.a(t10.this, this);
            this.b = a2;
            u10.d(a2);
        }

        @Override // com.p7700g.p99005.t10.h, com.p7700g.p99005.t10.g
        public Bundle c() {
            f fVar = t10.this.G;
            if (fVar != null) {
                if (fVar.e == null) {
                    return null;
                }
                return new Bundle(t10.this.G.e);
            }
            return w10.b(this.b);
        }

        @Override // com.p7700g.p99005.w10.c
        public void h(String str, w10.b bVar, Bundle bundle) {
            t10.this.n(str, new a(str, bVar), bundle);
        }

        @Override // com.p7700g.p99005.t10.h
        public void o(String str, Bundle bundle) {
            if (bundle != null) {
                w10.c(this.b, str, bundle);
            } else {
                super.o(str, bundle);
            }
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public class k extends j {
        public k() {
            super();
        }

        @Override // com.p7700g.p99005.t10.h, com.p7700g.p99005.t10.g
        public x10.b f() {
            f fVar = t10.this.G;
            if (fVar != null) {
                return fVar.d;
            }
            return new x10.b(((MediaBrowserService) this.b).getCurrentBrowserInfo());
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class l implements g {
        private Messenger a;

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ MediaSessionCompat.Token s;

            public a(MediaSessionCompat.Token token) {
                this.s = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<f> it = t10.this.F.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f.c(next.h.b(), this.s, next.h.a());
                    } catch (RemoteException unused) {
                        String str = next.a;
                        it.remove();
                    }
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ String s;
            public final /* synthetic */ Bundle t;

            public b(String str, Bundle bundle) {
                this.s = str;
                this.t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : t10.this.F.keySet()) {
                    q7<IBinder, f> q7Var = t10.this.F;
                    l.this.b(q7Var.get(iBinder), this.s, this.t);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ x10.b s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;

            public c(x10.b bVar, String str, Bundle bundle) {
                this.s = bVar;
                this.t = str;
                this.u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < t10.this.F.size(); i++) {
                    f r = t10.this.F.r(i);
                    if (r.d.equals(this.s)) {
                        l.this.b(r, this.t, this.u);
                        return;
                    }
                }
            }
        }

        public l() {
        }

        @Override // com.p7700g.p99005.t10.g
        public void a() {
            this.a = new Messenger(t10.this.H);
        }

        public void b(f fVar, String str, Bundle bundle) {
            List<fp<IBinder, Bundle>> list = fVar.g.get(str);
            if (list != null) {
                for (fp<IBinder, Bundle> fpVar : list) {
                    if (r10.b(bundle, fpVar.b)) {
                        t10.this.t(str, fVar, fpVar.b, bundle);
                    }
                }
            }
        }

        @Override // com.p7700g.p99005.t10.g
        public Bundle c() {
            f fVar = t10.this.G;
            if (fVar != null) {
                if (fVar.e == null) {
                    return null;
                }
                return new Bundle(t10.this.G.e);
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // com.p7700g.p99005.t10.g
        public void d(@x1 x10.b bVar, @x1 String str, Bundle bundle) {
            t10.this.H.post(new c(bVar, str, bundle));
        }

        @Override // com.p7700g.p99005.t10.g
        public x10.b f() {
            f fVar = t10.this.G;
            if (fVar != null) {
                return fVar.d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // com.p7700g.p99005.t10.g
        public IBinder g(Intent intent) {
            if (t10.v.equals(intent.getAction())) {
                return this.a.getBinder();
            }
            return null;
        }

        @Override // com.p7700g.p99005.t10.g
        public void j(@x1 String str, Bundle bundle) {
            t10.this.H.post(new b(str, bundle));
        }

        @Override // com.p7700g.p99005.t10.g
        public void k(MediaSessionCompat.Token token) {
            t10.this.H.post(new a(token));
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public static class m<T> {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private int f;

        public m(Object obj) {
            this.a = obj;
        }

        private void a(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.f)) {
                float f = bundle.getFloat(MediaBrowserCompat.f);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        public void b() {
            if (!this.b) {
                if (!this.c) {
                    if (!this.e) {
                        this.b = true;
                        return;
                    }
                    StringBuilder G = wo1.G("detach() called when sendError() had already been called for: ");
                    G.append(this.a);
                    throw new IllegalStateException(G.toString());
                }
                StringBuilder G2 = wo1.G("detach() called when sendResult() had already been called for: ");
                G2.append(this.a);
                throw new IllegalStateException(G2.toString());
            }
            StringBuilder G3 = wo1.G("detach() called when detach() had already been called for: ");
            G3.append(this.a);
            throw new IllegalStateException(G3.toString());
        }

        public int c() {
            return this.f;
        }

        public boolean d() {
            return this.b || this.c || this.e;
        }

        public void e(Bundle bundle) {
            StringBuilder G = wo1.G("It is not supported to send an error for ");
            G.append(this.a);
            throw new UnsupportedOperationException(G.toString());
        }

        public void f(Bundle bundle) {
            StringBuilder G = wo1.G("It is not supported to send an interim update for ");
            G.append(this.a);
            throw new UnsupportedOperationException(G.toString());
        }

        public void g(T t) {
        }

        public void h(Bundle bundle) {
            if (!this.c && !this.e) {
                this.e = true;
                e(bundle);
                return;
            }
            StringBuilder G = wo1.G("sendError() called when either sendResult() or sendError() had already been called for: ");
            G.append(this.a);
            throw new IllegalStateException(G.toString());
        }

        public void i(Bundle bundle) {
            if (!this.c && !this.e) {
                a(bundle);
                this.d = true;
                f(bundle);
                return;
            }
            StringBuilder G = wo1.G("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
            G.append(this.a);
            throw new IllegalStateException(G.toString());
        }

        public void j(T t) {
            if (!this.c && !this.e) {
                this.c = true;
                g(t);
                return;
            }
            StringBuilder G = wo1.G("sendResult() called when either sendResult() or sendError() had already been called for: ");
            G.append(this.a);
            throw new IllegalStateException(G.toString());
        }

        public void k(int i) {
            this.f = i;
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class n {

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ o s;
            public final /* synthetic */ String t;
            public final /* synthetic */ int u;
            public final /* synthetic */ int v;
            public final /* synthetic */ Bundle w;

            public a(o oVar, String str, int i, int i2, Bundle bundle) {
                this.s = oVar;
                this.t = str;
                this.u = i;
                this.v = i2;
                this.w = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.s.asBinder();
                t10.this.F.remove(asBinder);
                f fVar = new f(this.t, this.u, this.v, this.w, this.s);
                t10 t10Var = t10.this;
                t10Var.G = fVar;
                e l = t10Var.l(this.t, this.v, this.w);
                fVar.h = l;
                t10 t10Var2 = t10.this;
                t10Var2.G = null;
                if (l == null) {
                    getClass().getName();
                    try {
                        this.s.b();
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                try {
                    t10Var2.F.put(asBinder, fVar);
                    asBinder.linkToDeath(fVar, 0);
                    if (t10.this.I != null) {
                        this.s.c(fVar.h.b(), t10.this.I, fVar.h.a());
                    }
                } catch (RemoteException unused2) {
                    t10.this.F.remove(asBinder);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ o s;

            public b(o oVar) {
                this.s = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f remove = t10.this.F.remove(this.s.asBinder());
                if (remove != null) {
                    remove.f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ o s;
            public final /* synthetic */ String t;
            public final /* synthetic */ IBinder u;
            public final /* synthetic */ Bundle v;

            public c(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.s = oVar;
                this.t = str;
                this.u = iBinder;
                this.v = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = t10.this.F.get(this.s.asBinder());
                if (fVar == null) {
                    return;
                }
                t10.this.a(this.t, fVar, this.u, this.v);
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ o s;
            public final /* synthetic */ String t;
            public final /* synthetic */ IBinder u;

            public d(o oVar, String str, IBinder iBinder) {
                this.s = oVar;
                this.t = str;
                this.u = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = t10.this.F.get(this.s.asBinder());
                if (fVar == null) {
                    return;
                }
                t10.this.w(this.t, fVar, this.u);
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ o s;
            public final /* synthetic */ String t;
            public final /* synthetic */ ResultReceiver u;

            public e(o oVar, String str, ResultReceiver resultReceiver) {
                this.s = oVar;
                this.t = str;
                this.u = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = t10.this.F.get(this.s.asBinder());
                if (fVar == null) {
                    return;
                }
                t10.this.u(this.t, fVar, this.u);
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ o s;
            public final /* synthetic */ String t;
            public final /* synthetic */ int u;
            public final /* synthetic */ int v;
            public final /* synthetic */ Bundle w;

            public f(o oVar, String str, int i, int i2, Bundle bundle) {
                this.s = oVar;
                this.t = str;
                this.u = i;
                this.v = i2;
                this.w = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.s.asBinder();
                t10.this.F.remove(asBinder);
                f fVar = new f(this.t, this.u, this.v, this.w, this.s);
                t10.this.F.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class g implements Runnable {
            public final /* synthetic */ o s;

            public g(o oVar) {
                this.s = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.s.asBinder();
                f remove = t10.this.F.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class h implements Runnable {
            public final /* synthetic */ o s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;
            public final /* synthetic */ ResultReceiver v;

            public h(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.s = oVar;
                this.t = str;
                this.u = bundle;
                this.v = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = t10.this.F.get(this.s.asBinder());
                if (fVar == null) {
                    return;
                }
                t10.this.v(this.t, this.u, fVar, this.v);
            }
        }

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class i implements Runnable {
            public final /* synthetic */ o s;
            public final /* synthetic */ String t;
            public final /* synthetic */ Bundle u;
            public final /* synthetic */ ResultReceiver v;

            public i(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.s = oVar;
                this.t = str;
                this.u = bundle;
                this.v = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = t10.this.F.get(this.s.asBinder());
                if (fVar == null) {
                    StringBuilder G = wo1.G("sendCustomAction for callback that isn't registered action=");
                    G.append(this.t);
                    G.append(", extras=");
                    G.append(this.u);
                    G.toString();
                    return;
                }
                t10.this.s(this.t, this.u, fVar, this.v);
            }
        }

        public n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            t10.this.H.a(new c(oVar, str, iBinder, bundle));
        }

        public void b(String str, int i2, int i3, Bundle bundle, o oVar) {
            if (t10.this.g(str, i3)) {
                t10.this.H.a(new a(oVar, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        public void c(o oVar) {
            t10.this.H.a(new b(oVar));
        }

        public void d(String str, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            t10.this.H.a(new e(oVar, str, resultReceiver));
        }

        public void e(o oVar, String str, int i2, int i3, Bundle bundle) {
            t10.this.H.a(new f(oVar, str, i2, i3, bundle));
        }

        public void f(String str, IBinder iBinder, o oVar) {
            t10.this.H.a(new d(oVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            t10.this.H.a(new h(oVar, str, bundle, resultReceiver));
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            t10.this.H.a(new i(oVar, str, bundle, resultReceiver));
        }

        public void i(o oVar) {
            t10.this.H.a(new g(oVar));
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public interface o {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public static class p implements o {
        public final Messenger a;

        public p(Messenger messenger) {
            this.a = messenger;
        }

        private void d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }

        @Override // com.p7700g.p99005.t10.o
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString(s10.d, str);
            bundle3.putBundle(s10.g, bundle);
            bundle3.putBundle(s10.h, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(s10.e, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            d(3, bundle3);
        }

        @Override // com.p7700g.p99005.t10.o
        public IBinder asBinder() {
            return this.a.getBinder();
        }

        @Override // com.p7700g.p99005.t10.o
        public void b() throws RemoteException {
            d(2, null);
        }

        @Override // com.p7700g.p99005.t10.o
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(s10.q, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(s10.d, str);
            bundle2.putParcelable(s10.f, token);
            bundle2.putBundle(s10.k, bundle);
            d(1, bundle2);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public final class q extends Handler {
        private final n a;

        public q() {
            this.a = new n();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(s10.k);
                    MediaSessionCompat.b(bundle);
                    this.a.b(data.getString(s10.i), data.getInt(s10.c), data.getInt(s10.b), bundle, new p(message.replyTo));
                    return;
                case 2:
                    this.a.c(new p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(s10.g);
                    MediaSessionCompat.b(bundle2);
                    this.a.a(data.getString(s10.d), ag.a(data, s10.a), bundle2, new p(message.replyTo));
                    return;
                case 4:
                    this.a.f(data.getString(s10.d), ag.a(data, s10.a), new p(message.replyTo));
                    return;
                case 5:
                    this.a.d(data.getString(s10.d), (ResultReceiver) data.getParcelable(s10.j), new p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(s10.k);
                    MediaSessionCompat.b(bundle3);
                    this.a.e(new p(message.replyTo), data.getString(s10.i), data.getInt(s10.c), data.getInt(s10.b), bundle3);
                    return;
                case 7:
                    this.a.i(new p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(s10.l);
                    MediaSessionCompat.b(bundle4);
                    this.a.g(data.getString(s10.m), bundle4, (ResultReceiver) data.getParcelable(s10.j), new p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(s10.o);
                    MediaSessionCompat.b(bundle5);
                    this.a.h(data.getString(s10.n), bundle5, (ResultReceiver) data.getParcelable(s10.j), new p(message.replyTo));
                    return;
                default:
                    String str = "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1;
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(s10.b, Binder.getCallingUid());
            data.putInt(s10.c, Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<fp<IBinder, Bundle>> list = fVar.g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (fp<IBinder, Bundle> fpVar : list) {
            if (iBinder == fpVar.a && r10.a(bundle, fpVar.b)) {
                return;
            }
        }
        list.add(new fp<>(iBinder, bundle));
        fVar.g.put(str, list);
        t(str, fVar, bundle, null);
        this.G = fVar;
        q(str, bundle);
        this.G = null;
    }

    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt(MediaBrowserCompat.c, -1);
        int i3 = bundle.getInt(MediaBrowserCompat.d, -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 >= 0 && i3 >= 1 && i4 < list.size()) {
            if (i5 > list.size()) {
                i5 = list.size();
            }
            return list.subList(i4, i5);
        }
        return Collections.emptyList();
    }

    @i2({i2.a.LIBRARY})
    public void c(Context context) {
        attachBaseContext(context);
    }

    public final Bundle d() {
        return this.E.c();
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @x1
    public final x10.b e() {
        return this.E.f();
    }

    @z1
    public MediaSessionCompat.Token f() {
        return this.I;
    }

    public boolean g(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void h(@x1 x10.b bVar, @x1 String str, @x1 Bundle bundle) {
        if (bVar == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.E.d(bVar, str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }

    public void i(@x1 String str) {
        if (str != null) {
            this.E.j(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void j(@x1 String str, @x1 Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.E.j(str, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }

    public void k(@x1 String str, Bundle bundle, @x1 m<Bundle> mVar) {
        mVar.h(null);
    }

    @z1
    public abstract e l(@x1 String str, int i2, @z1 Bundle bundle);

    public abstract void m(@x1 String str, @x1 m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void n(@x1 String str, @x1 m<List<MediaBrowserCompat.MediaItem>> mVar, @x1 Bundle bundle) {
        mVar.k(1);
        m(str, mVar);
    }

    public void o(String str, @x1 m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.k(2);
        mVar.j(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.E.g(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.E = new k();
        } else if (i2 >= 26) {
            this.E = new j();
        } else if (i2 >= 23) {
            this.E = new i();
        } else {
            this.E = new h();
        }
        this.E.a();
    }

    public void p(@x1 String str, Bundle bundle, @x1 m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.k(4);
        mVar.j(null);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void q(String str, Bundle bundle) {
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void r(String str) {
    }

    public void s(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        d dVar = new d(str, resultReceiver);
        this.G = fVar;
        k(str, bundle, dVar);
        this.G = null;
        if (dVar.d()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void t(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.G = fVar;
        if (bundle == null) {
            m(str, aVar);
        } else {
            n(str, aVar, bundle);
        }
        this.G = null;
        if (!aVar.d()) {
            throw new IllegalStateException(wo1.D(wo1.G("onLoadChildren must call detach() or sendResult() before returning for package="), fVar.a, " id=", str));
        }
    }

    public void u(String str, f fVar, ResultReceiver resultReceiver) {
        b bVar = new b(str, resultReceiver);
        this.G = fVar;
        o(str, bVar);
        this.G = null;
        if (!bVar.d()) {
            throw new IllegalStateException(wo1.t("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }

    public void v(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        c cVar = new c(str, resultReceiver);
        this.G = fVar;
        p(str, bundle, cVar);
        this.G = null;
        if (!cVar.d()) {
            throw new IllegalStateException(wo1.t("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }

    public boolean w(String str, f fVar, IBinder iBinder) {
        boolean z2 = false;
        try {
            if (iBinder == null) {
                return fVar.g.remove(str) != null;
            }
            List<fp<IBinder, Bundle>> list = fVar.g.get(str);
            if (list != null) {
                Iterator<fp<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.g.remove(str);
                }
            }
            return z2;
        } finally {
            this.G = fVar;
            r(str);
            this.G = null;
        }
    }

    public void x(MediaSessionCompat.Token token) {
        if (token != null) {
            if (this.I == null) {
                this.I = token;
                this.E.k(token);
                return;
            }
            throw new IllegalStateException("The session token has already been set.");
        }
        throw new IllegalArgumentException("Session token may not be null.");
    }
}