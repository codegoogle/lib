package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.p7700g.p99005.i2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: FirebaseApp.java */
/* loaded from: classes3.dex */
public class pn2 {
    private static final String a = "FirebaseApp";
    @x1
    public static final String b = "[DEFAULT]";
    private static final Object c = new Object();
    private static final Executor d = new d();
    @GuardedBy("LOCK")
    public static final Map<String, pn2> e = new q7();
    private static final String f = "fire-android";
    private static final String g = "fire-core";
    private static final String h = "kotlin";
    private final Context i;
    private final String j;
    private final vn2 k;
    private final xo2 l;
    private final ep2<os2> o;
    private final AtomicBoolean m = new AtomicBoolean(false);
    private final AtomicBoolean n = new AtomicBoolean();
    private final List<b> p = new CopyOnWriteArrayList();
    private final List<qn2> q = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface b {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* loaded from: classes3.dex */
    public static class c implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<c> a = new AtomicReference<>();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    c cVar = new c();
                    if (a.compareAndSet(null, cVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (pn2.c) {
                Iterator it = new ArrayList(pn2.e.values()).iterator();
                while (it.hasNext()) {
                    pn2 pn2Var = (pn2) it.next();
                    if (pn2Var.m.get()) {
                        pn2Var.D(z);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    /* loaded from: classes3.dex */
    public static class d implements Executor {
        private static final Handler s = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            s.post(runnable);
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* loaded from: classes3.dex */
    public static class e extends BroadcastReceiver {
        private static AtomicReference<e> a = new AtomicReference<>();
        private final Context b;

        public e(Context context) {
            this.b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (a.get() == null) {
                e eVar = new e(context);
                if (a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (pn2.c) {
                for (pn2 pn2Var : pn2.e.values()) {
                    pn2Var.t();
                }
            }
            c();
        }
    }

    public pn2(final Context context, String str, vn2 vn2Var) {
        this.i = (Context) Preconditions.checkNotNull(context);
        this.j = Preconditions.checkNotEmpty(str);
        this.k = (vn2) Preconditions.checkNotNull(vn2Var);
        this.l = xo2.g(d).c(uo2.c(context, ComponentDiscoveryService.class).b()).b(new FirebaseCommonRegistrar()).a(so2.q(context, Context.class, new Class[0])).a(so2.q(this, pn2.class, new Class[0])).a(so2.q(vn2Var, vn2.class, new Class[0])).d();
        this.o = new ep2<>(new er2() { // from class: com.p7700g.p99005.hn2
            @Override // com.p7700g.p99005.er2
            public final Object get() {
                return pn2.this.B(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ os2 B(Context context) {
        return new os2(context, r(), (lq2) this.l.a(lq2.class));
    }

    private static String C(@x1 String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z) {
        for (b bVar : this.p) {
            bVar.onBackgroundStateChanged(z);
        }
    }

    private void E() {
        for (qn2 qn2Var : this.q) {
            qn2Var.a(this.j, this.k);
        }
    }

    private void g() {
        Preconditions.checkState(!this.n.get(), "FirebaseApp was deleted");
    }

    @r2
    public static void h() {
        synchronized (c) {
            e.clear();
        }
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (c) {
            for (pn2 pn2Var : e.values()) {
                arrayList.add(pn2Var.p());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @x1
    public static List<pn2> m(@x1 Context context) {
        ArrayList arrayList;
        synchronized (c) {
            arrayList = new ArrayList(e.values());
        }
        return arrayList;
    }

    @x1
    public static pn2 n() {
        pn2 pn2Var;
        synchronized (c) {
            pn2Var = e.get("[DEFAULT]");
            if (pn2Var == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return pn2Var;
    }

    @x1
    public static pn2 o(@x1 String str) {
        pn2 pn2Var;
        List<String> k;
        String str2;
        synchronized (c) {
            pn2Var = e.get(C(str));
            if (pn2Var == null) {
                if (k().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", k);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return pn2Var;
    }

    @KeepForSdk
    public static String s(String str, vn2 vn2Var) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + ya2.z + Base64Utils.encodeUrlSafeNoPadding(vn2Var.j().getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!ln.a(this.i)) {
            p();
            e.b(this.i);
            return;
        }
        p();
        this.l.k(z());
    }

    @z1
    public static pn2 v(@x1 Context context) {
        synchronized (c) {
            if (e.containsKey("[DEFAULT]")) {
                return n();
            }
            vn2 h2 = vn2.h(context);
            if (h2 == null) {
                return null;
            }
            return w(context, h2);
        }
    }

    @x1
    public static pn2 w(@x1 Context context, @x1 vn2 vn2Var) {
        return x(context, vn2Var, "[DEFAULT]");
    }

    @x1
    public static pn2 x(@x1 Context context, @x1 vn2 vn2Var, @x1 String str) {
        pn2 pn2Var;
        c.b(context);
        String C = C(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (c) {
            Map<String, pn2> map = e;
            boolean z = !map.containsKey(C);
            Preconditions.checkState(z, "FirebaseApp name " + C + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            pn2Var = new pn2(context, C, vn2Var);
            map.put(C, pn2Var);
        }
        pn2Var.t();
        return pn2Var;
    }

    @KeepForSdk
    public void F(b bVar) {
        g();
        this.p.remove(bVar);
    }

    @KeepForSdk
    public void G(@x1 qn2 qn2Var) {
        g();
        Preconditions.checkNotNull(qn2Var);
        this.q.remove(qn2Var);
    }

    public void H(boolean z) {
        g();
        if (this.m.compareAndSet(!z, z)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && isInBackground) {
                D(true);
            } else if (z || !isInBackground) {
            } else {
                D(false);
            }
        }
    }

    @KeepForSdk
    public void I(Boolean bool) {
        g();
        this.o.get().e(bool);
    }

    @KeepForSdk
    @Deprecated
    public void J(boolean z) {
        I(Boolean.valueOf(z));
    }

    @KeepForSdk
    public void e(b bVar) {
        g();
        if (this.m.get() && BackgroundDetector.getInstance().isInBackground()) {
            bVar.onBackgroundStateChanged(true);
        }
        this.p.add(bVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof pn2) {
            return this.j.equals(((pn2) obj).p());
        }
        return false;
    }

    @KeepForSdk
    public void f(@x1 qn2 qn2Var) {
        g();
        Preconditions.checkNotNull(qn2Var);
        this.q.add(qn2Var);
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public void i() {
        if (this.n.compareAndSet(false, true)) {
            synchronized (c) {
                e.remove(this.j);
            }
            E();
        }
    }

    @KeepForSdk
    public <T> T j(Class<T> cls) {
        g();
        return (T) this.l.a(cls);
    }

    @x1
    public Context l() {
        g();
        return this.i;
    }

    @x1
    public String p() {
        g();
        return this.j;
    }

    @x1
    public vn2 q() {
        g();
        return this.k;
    }

    @KeepForSdk
    public String r() {
        return Base64Utils.encodeUrlSafeNoPadding(p().getBytes(Charset.defaultCharset())) + ya2.z + Base64Utils.encodeUrlSafeNoPadding(q().j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.j).add("options", this.k).toString();
    }

    @i2({i2.a.TESTS})
    @r2
    public void u() {
        this.l.j();
    }

    @KeepForSdk
    public boolean y() {
        g();
        return this.o.get().b();
    }

    @r2
    @KeepForSdk
    public boolean z() {
        return "[DEFAULT]".equals(p());
    }
}