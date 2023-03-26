package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.p7700g.p99005.fv;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kv;
import com.p7700g.p99005.tn;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class kv extends fv.d {
    private static final b j = new b();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        private final long a;
        private long b;

        public a(long j) {
            this.a = j;
        }

        @Override // com.p7700g.p99005.kv.d
        public long a() {
            if (this.b == 0) {
                this.b = SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.b;
            if (uptimeMillis > this.a) {
                return -1L;
            }
            return Math.min(Math.max(uptimeMillis, 1000L), this.a - uptimeMillis);
        }
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {
        @z1
        public Typeface a(@x1 Context context, @x1 tn.c cVar) throws PackageManager.NameNotFoundException {
            return tn.a(context, null, new tn.c[]{cVar});
        }

        @x1
        public tn.b b(@x1 Context context, @x1 rn rnVar) throws PackageManager.NameNotFoundException {
            return tn.b(context, null, rnVar);
        }

        public void c(@x1 Context context, @x1 Uri uri, @x1 ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(@x1 Context context, @x1 ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class c implements fv.i {
        private static final String a = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        @x1
        private final Context b;
        @x1
        private final rn c;
        @x1
        private final b d;
        @x1
        private final Object e = new Object();
        @z1
        @k1("mLock")
        private Handler f;
        @z1
        @k1("mLock")
        private Executor g;
        @z1
        @k1("mLock")
        private ThreadPoolExecutor h;
        @z1
        @k1("mLock")
        private d i;
        @z1
        @k1("mLock")
        public fv.j j;
        @z1
        @k1("mLock")
        private ContentObserver k;
        @z1
        @k1("mLock")
        private Runnable l;

        /* compiled from: FontRequestEmojiCompatConfig.java */
        /* loaded from: classes.dex */
        public class a extends ContentObserver {
            public a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                c.this.d();
            }
        }

        public c(@x1 Context context, @x1 rn rnVar, @x1 b bVar) {
            jp.m(context, "Context cannot be null");
            jp.m(rnVar, "FontRequest cannot be null");
            this.b = context.getApplicationContext();
            this.c = rnVar;
            this.d = bVar;
        }

        private void b() {
            synchronized (this.e) {
                this.j = null;
                ContentObserver contentObserver = this.k;
                if (contentObserver != null) {
                    this.d.d(this.b, contentObserver);
                    this.k = null;
                }
                Handler handler = this.f;
                if (handler != null) {
                    handler.removeCallbacks(this.l);
                }
                this.f = null;
                ThreadPoolExecutor threadPoolExecutor = this.h;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.g = null;
                this.h = null;
            }
        }

        @s2
        private tn.c e() {
            try {
                tn.b b = this.d.b(this.b, this.c);
                if (b.c() == 0) {
                    tn.c[] b2 = b.b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                StringBuilder G = wo1.G("fetchFonts failed (");
                G.append(b.c());
                G.append(")");
                throw new RuntimeException(G.toString());
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @e2(19)
        @s2
        private void f(Uri uri, long j) {
            synchronized (this.e) {
                Handler handler = this.f;
                if (handler == null) {
                    handler = cv.d();
                    this.f = handler;
                }
                if (this.k == null) {
                    a aVar = new a(handler);
                    this.k = aVar;
                    this.d.c(this.b, uri, aVar);
                }
                if (this.l == null) {
                    this.l = new Runnable() { // from class: com.p7700g.p99005.av
                        @Override // java.lang.Runnable
                        public final void run() {
                            kv.c.this.d();
                        }
                    };
                }
                handler.postDelayed(this.l, j);
            }
        }

        @Override // com.p7700g.p99005.fv.i
        @e2(19)
        public void a(@x1 fv.j jVar) {
            jp.m(jVar, "LoaderCallback cannot be null");
            synchronized (this.e) {
                this.j = jVar;
            }
            d();
        }

        @e2(19)
        @s2
        public void c() {
            synchronized (this.e) {
                if (this.j == null) {
                    return;
                }
                try {
                    tn.c e = e();
                    int b = e.b();
                    if (b == 2) {
                        synchronized (this.e) {
                            d dVar = this.i;
                            if (dVar != null) {
                                long a2 = dVar.a();
                                if (a2 >= 0) {
                                    f(e.d(), a2);
                                    return;
                                }
                            }
                        }
                    }
                    if (b == 0) {
                        in.b(a);
                        Typeface a3 = this.d.a(this.b, e);
                        ByteBuffer f = ck.f(this.b, null, e.d());
                        if (f != null && a3 != null) {
                            mv e2 = mv.e(a3, f);
                            in.d();
                            synchronized (this.e) {
                                fv.j jVar = this.j;
                                if (jVar != null) {
                                    jVar.b(e2);
                                }
                            }
                            b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                } catch (Throwable th) {
                    synchronized (this.e) {
                        fv.j jVar2 = this.j;
                        if (jVar2 != null) {
                            jVar2.a(th);
                        }
                        b();
                    }
                }
            }
        }

        @e2(19)
        public void d() {
            synchronized (this.e) {
                if (this.j == null) {
                    return;
                }
                if (this.g == null) {
                    ThreadPoolExecutor b = cv.b("emojiCompat");
                    this.h = b;
                    this.g = b;
                }
                this.g.execute(new Runnable() { // from class: com.p7700g.p99005.xu
                    @Override // java.lang.Runnable
                    public final void run() {
                        kv.c.this.c();
                    }
                });
            }
        }

        public void g(@x1 Executor executor) {
            synchronized (this.e) {
                this.g = executor;
            }
        }

        public void h(@z1 d dVar) {
            synchronized (this.e) {
                this.i = dVar;
            }
        }
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract long a();
    }

    public kv(@x1 Context context, @x1 rn rnVar) {
        super(new c(context, rnVar, j));
    }

    @x1
    @Deprecated
    public kv k(@z1 Handler handler) {
        if (handler == null) {
            return this;
        }
        l(cv.a(handler));
        return this;
    }

    @x1
    public kv l(@x1 Executor executor) {
        ((c) a()).g(executor);
        return this;
    }

    @x1
    public kv m(@z1 d dVar) {
        ((c) a()).h(dVar);
        return this;
    }

    @i2({i2.a.LIBRARY})
    public kv(@x1 Context context, @x1 rn rnVar, @x1 b bVar) {
        super(new c(context, rnVar, bVar));
    }
}