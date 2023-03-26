package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.p7700g.p99005.au2;
import com.p7700g.p99005.br2;
import com.p7700g.p99005.bu2;
import com.p7700g.p99005.er2;
import com.p7700g.p99005.et2;
import com.p7700g.p99005.eu2;
import com.p7700g.p99005.ft2;
import com.p7700g.p99005.gt2;
import com.p7700g.p99005.h32;
import com.p7700g.p99005.hu2;
import com.p7700g.p99005.jq2;
import com.p7700g.p99005.kq2;
import com.p7700g.p99005.kv2;
import com.p7700g.p99005.mq2;
import com.p7700g.p99005.mu2;
import com.p7700g.p99005.nn2;
import com.p7700g.p99005.nu2;
import com.p7700g.p99005.pn2;
import com.p7700g.p99005.pr2;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.ru2;
import com.p7700g.p99005.wt2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xq2;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class FirebaseMessaging {
    @x1
    @Deprecated
    public static final String a = "FCM";
    private static final long b = TimeUnit.HOURS.toSeconds(8);
    @SuppressLint({"StaticFieldLeak"})
    private static mu2 c;
    @r2
    @z1
    @SuppressLint({"FirebaseUnknownNullness"})
    public static h32 d;
    @r2
    @GuardedBy("FirebaseMessaging.class")
    public static ScheduledExecutorService e;
    private final pn2 f;
    @z1
    private final br2 g;
    private final pr2 h;
    private final Context i;
    private final wt2 j;
    private final hu2 k;
    private final a l;
    private final Executor m;
    private final Executor n;
    private final Task<ru2> o;
    private final bu2 p;
    @GuardedBy("this")
    private boolean q;
    private final Application.ActivityLifecycleCallbacks r;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public class a {
        private final mq2 a;
        @GuardedBy("this")
        private boolean b;
        @GuardedBy("this")
        @z1
        private kq2<nn2> c;
        @GuardedBy("this")
        @z1
        private Boolean d;

        public a(mq2 mq2Var) {
            this.a = mq2Var;
        }

        @z1
        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context l = FirebaseMessaging.this.f.l();
            SharedPreferences sharedPreferences = l.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = l.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(l.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void a() {
            if (this.b) {
                return;
            }
            Boolean d = d();
            this.d = d;
            if (d == null) {
                kq2<nn2> kq2Var = new kq2(this) { // from class: com.p7700g.p99005.st2
                    private final FirebaseMessaging.a a;

                    {
                        this.a = this;
                    }

                    @Override // com.p7700g.p99005.kq2
                    public void a(jq2 jq2Var) {
                        this.a.c(jq2Var);
                    }
                };
                this.c = kq2Var;
                this.a.a(nn2.class, kq2Var);
            }
            this.b = true;
        }

        public synchronized boolean b() {
            boolean y;
            a();
            Boolean bool = this.d;
            if (bool == null) {
                y = FirebaseMessaging.this.f.y();
            } else {
                y = bool.booleanValue();
            }
            return y;
        }

        public final /* synthetic */ void c(jq2 jq2Var) {
            if (b()) {
                FirebaseMessaging.this.F();
            }
        }

        public synchronized void e(boolean z) {
            a();
            kq2<nn2> kq2Var = this.c;
            if (kq2Var != null) {
                this.a.d(nn2.class, kq2Var);
                this.c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f.l().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.F();
            }
            this.d = Boolean.valueOf(z);
        }
    }

    public FirebaseMessaging(pn2 pn2Var, @z1 br2 br2Var, er2<kv2> er2Var, er2<xq2> er2Var2, pr2 pr2Var, @z1 h32 h32Var, mq2 mq2Var) {
        this(pn2Var, br2Var, er2Var, er2Var2, pr2Var, h32Var, mq2Var, new bu2(pn2Var.l()));
    }

    private synchronized void E() {
        if (this.q) {
            return;
        }
        H(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        br2 br2Var = this.g;
        if (br2Var != null) {
            br2Var.d();
        } else if (I(l())) {
            E();
        }
    }

    @x1
    @Keep
    public static synchronized FirebaseMessaging getInstance(@x1 pn2 pn2Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) pn2Var.j(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    @x1
    public static synchronized FirebaseMessaging i() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(pn2.n());
        }
        return firebaseMessaging;
    }

    private String j() {
        return "[DEFAULT]".equals(this.f.p()) ? "" : this.f.r();
    }

    @z1
    public static h32 m() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void d(String str) {
        if ("[DEFAULT]".equals(this.f.p())) {
            if (Log.isLoggable(rs2.a, 3)) {
                String valueOf = String.valueOf(this.f.p());
                if (valueOf.length() != 0) {
                    "Invoking onNewToken for app: ".concat(valueOf);
                } else {
                    new String("Invoking onNewToken for app: ");
                }
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, str);
            new et2(this.i).g(intent);
        }
    }

    public void A(@x1 eu2 eu2Var) {
        if (!TextUtils.isEmpty(eu2Var.getTo())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.i, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            eu2Var.j(intent);
            this.i.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void B(boolean z) {
        this.l.e(z);
    }

    public void C(boolean z) {
        au2.y(z);
    }

    public synchronized void D(boolean z) {
        this.q = z;
    }

    @x1
    public Task<Void> G(@x1 final String str) {
        return this.o.onSuccessTask(new SuccessContinuation(str) { // from class: com.p7700g.p99005.ot2
            private final String a;

            {
                this.a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object obj) {
                Task q;
                q = ((ru2) obj).q(this.a);
                return q;
            }
        });
    }

    public synchronized void H(long j) {
        g(new nu2(this, Math.min(Math.max(30L, j + j), b)), j);
        this.q = true;
    }

    @r2
    public boolean I(@z1 mu2.a aVar) {
        return aVar == null || aVar.b(this.p.a());
    }

    @x1
    public Task<Void> J(@x1 final String str) {
        return this.o.onSuccessTask(new SuccessContinuation(str) { // from class: com.p7700g.p99005.pt2
            private final String a;

            {
                this.a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object obj) {
                Task t;
                t = ((ru2) obj).t(this.a);
                return t;
            }
        });
    }

    public String c() throws IOException {
        br2 br2Var = this.g;
        if (br2Var != null) {
            try {
                return (String) Tasks.await(br2Var.b());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
        mu2.a l = l();
        if (!I(l)) {
            return l.b;
        }
        final String c2 = bu2.c(this.f);
        try {
            String str = (String) Tasks.await(this.h.getId().continueWithTask(ft2.d(), new Continuation(this, c2) { // from class: com.p7700g.p99005.qt2
                private final FirebaseMessaging a;
                private final String b;

                {
                    this.a = this;
                    this.b = c2;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task task) {
                    return this.a.r(this.b, task);
                }
            }));
            c.g(j(), c2, str, this.p.a());
            if (l == null || !str.equals(l.b)) {
                d(str);
            }
            return str;
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    @x1
    public Task<Void> e() {
        if (this.g != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.m.execute(new Runnable(this, taskCompletionSource) { // from class: com.p7700g.p99005.mt2
                private final FirebaseMessaging s;
                private final TaskCompletionSource t;

                {
                    this.s = this;
                    this.t = taskCompletionSource;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.s.s(this.t);
                }
            });
            return taskCompletionSource.getTask();
        } else if (l() == null) {
            return Tasks.forResult(null);
        } else {
            final ExecutorService d2 = ft2.d();
            return this.h.getId().continueWithTask(d2, new Continuation(this, d2) { // from class: com.p7700g.p99005.nt2
                private final FirebaseMessaging a;
                private final ExecutorService b;

                {
                    this.a = this;
                    this.b = d2;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task task) {
                    return this.a.u(this.b, task);
                }
            });
        }
    }

    @x1
    public boolean f() {
        return au2.a();
    }

    public void g(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (e == null) {
                e = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            e.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public Context h() {
        return this.i;
    }

    @x1
    public Task<String> k() {
        br2 br2Var = this.g;
        if (br2Var != null) {
            return br2Var.b();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.m.execute(new Runnable(this, taskCompletionSource) { // from class: com.p7700g.p99005.lt2
            private final FirebaseMessaging s;
            private final TaskCompletionSource t;

            {
                this.s = this;
                this.t = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.v(this.t);
            }
        });
        return taskCompletionSource.getTask();
    }

    @r2
    @z1
    public mu2.a l() {
        return c.e(j(), bu2.c(this.f));
    }

    public boolean o() {
        return this.l.b();
    }

    @r2
    public boolean p() {
        return this.p.g();
    }

    public final /* synthetic */ Task q(Task task) {
        return this.j.e((String) task.getResult());
    }

    public final /* synthetic */ Task r(String str, final Task task) throws Exception {
        return this.k.a(str, new hu2.a(this, task) { // from class: com.p7700g.p99005.rt2
            private final FirebaseMessaging a;
            private final Task b;

            {
                this.a = this;
                this.b = task;
            }

            @Override // com.p7700g.p99005.hu2.a
            public Task start() {
                return this.a.q(this.b);
            }
        });
    }

    public final /* synthetic */ void s(TaskCompletionSource taskCompletionSource) {
        try {
            this.g.a(bu2.c(this.f), a);
            taskCompletionSource.setResult(null);
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    public final /* synthetic */ Void t(Task task) throws Exception {
        c.d(j(), bu2.c(this.f));
        return null;
    }

    public final /* synthetic */ Task u(ExecutorService executorService, Task task) throws Exception {
        return this.j.b((String) task.getResult()).continueWith(executorService, new Continuation(this) { // from class: com.p7700g.p99005.it2
            private final FirebaseMessaging a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                this.a.t(task2);
                return null;
            }
        });
    }

    public final /* synthetic */ void v(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(c());
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    public final /* synthetic */ void w() {
        if (o()) {
            F();
        }
    }

    public final /* synthetic */ void x(ru2 ru2Var) {
        if (o()) {
            ru2Var.p();
        }
    }

    public FirebaseMessaging(pn2 pn2Var, @z1 br2 br2Var, er2<kv2> er2Var, er2<xq2> er2Var2, pr2 pr2Var, @z1 h32 h32Var, mq2 mq2Var, bu2 bu2Var) {
        this(pn2Var, br2Var, pr2Var, h32Var, mq2Var, bu2Var, new wt2(pn2Var, bu2Var, er2Var, er2Var2, pr2Var), ft2.e(), ft2.b());
    }

    public FirebaseMessaging(pn2 pn2Var, @z1 br2 br2Var, pr2 pr2Var, @z1 h32 h32Var, mq2 mq2Var, bu2 bu2Var, wt2 wt2Var, Executor executor, Executor executor2) {
        this.q = false;
        d = h32Var;
        this.f = pn2Var;
        this.g = br2Var;
        this.h = pr2Var;
        this.l = new a(mq2Var);
        Context l = pn2Var.l();
        this.i = l;
        gt2 gt2Var = new gt2();
        this.r = gt2Var;
        this.p = bu2Var;
        this.n = executor;
        this.j = wt2Var;
        this.k = new hu2(executor);
        this.m = executor2;
        Context l2 = pn2Var.l();
        if (l2 instanceof Application) {
            ((Application) l2).registerActivityLifecycleCallbacks(gt2Var);
        } else {
            String.valueOf(l2).length();
        }
        if (br2Var != null) {
            br2Var.c(new br2.a(this) { // from class: com.p7700g.p99005.ht2
                private final FirebaseMessaging a;

                {
                    this.a = this;
                }

                @Override // com.p7700g.p99005.br2.a
                public void a(String str) {
                    this.a.d(str);
                }
            });
        }
        synchronized (FirebaseMessaging.class) {
            if (c == null) {
                c = new mu2(l);
            }
        }
        executor2.execute(new Runnable(this) { // from class: com.p7700g.p99005.jt2
            private final FirebaseMessaging s;

            {
                this.s = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.w();
            }
        });
        Task<ru2> e2 = ru2.e(this, pr2Var, bu2Var, wt2Var, l, ft2.f());
        this.o = e2;
        e2.addOnSuccessListener(ft2.g(), new OnSuccessListener(this) { // from class: com.p7700g.p99005.kt2
            private final FirebaseMessaging a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.a.x((ru2) obj);
            }
        });
    }
}