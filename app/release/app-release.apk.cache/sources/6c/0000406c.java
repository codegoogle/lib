package com.p7700g.p99005;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: JobIntentService.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class eg extends Service {
    public static final String s = "JobIntentService";
    public static final boolean t = false;
    public static final Object u = new Object();
    public static final HashMap<ComponentName, h> v = new HashMap<>();
    public final ArrayList<d> C;
    public b w;
    public h x;
    public a y;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;

    /* compiled from: JobIntentService.java */
    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e c = eg.this.c();
                if (c == null) {
                    return null;
                }
                eg.this.j(c.getIntent());
                c.complete();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onCancelled(Void r1) {
            eg.this.l();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r1) {
            eg.this.l();
        }
    }

    /* compiled from: JobIntentService.java */
    /* loaded from: classes.dex */
    public interface b {
        IBinder compatGetBinder();

        e dequeueWork();
    }

    /* compiled from: JobIntentService.java */
    /* loaded from: classes.dex */
    public static final class c extends h {
        private final Context d;
        private final PowerManager.WakeLock e;
        private final PowerManager.WakeLock f;
        public boolean g;
        public boolean h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // com.p7700g.p99005.eg.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // com.p7700g.p99005.eg.h
        public void c() {
            synchronized (this) {
                if (this.h) {
                    if (this.g) {
                        this.e.acquire(60000L);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }

        @Override // com.p7700g.p99005.eg.h
        public void d() {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(yc0.B);
                    this.e.release();
                }
            }
        }

        @Override // com.p7700g.p99005.eg.h
        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }

    /* compiled from: JobIntentService.java */
    /* loaded from: classes.dex */
    public final class d implements e {
        public final Intent a;
        public final int b;

        public d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // com.p7700g.p99005.eg.e
        public void complete() {
            eg.this.stopSelf(this.b);
        }

        @Override // com.p7700g.p99005.eg.e
        public Intent getIntent() {
            return this.a;
        }
    }

    /* compiled from: JobIntentService.java */
    /* loaded from: classes.dex */
    public interface e {
        void complete();

        Intent getIntent();
    }

    /* compiled from: JobIntentService.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static final class f extends JobServiceEngine implements b {
        public static final String a = "JobServiceEngineImpl";
        public static final boolean b = false;
        public final eg c;
        public final Object d;
        public JobParameters e;

        /* compiled from: JobIntentService.java */
        /* loaded from: classes.dex */
        public final class a implements e {
            public final JobWorkItem a;

            public a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            @Override // com.p7700g.p99005.eg.e
            public void complete() {
                synchronized (f.this.d) {
                    JobParameters jobParameters = f.this.e;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.a);
                    }
                }
            }

            @Override // com.p7700g.p99005.eg.e
            public Intent getIntent() {
                return this.a.getIntent();
            }
        }

        public f(eg egVar) {
            super(egVar);
            this.d = new Object();
            this.c = egVar;
        }

        @Override // com.p7700g.p99005.eg.b
        public IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // com.p7700g.p99005.eg.b
        public e dequeueWork() {
            synchronized (this.d) {
                JobParameters jobParameters = this.e;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork != null) {
                    dequeueWork.getIntent().setExtrasClassLoader(this.c.getClassLoader());
                    return new a(dequeueWork);
                }
                return null;
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.e = jobParameters;
            this.c.g(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean d = this.c.d();
            synchronized (this.d) {
                this.e = null;
            }
            return d;
        }
    }

    /* compiled from: JobIntentService.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static final class g extends h {
        private final JobInfo d;
        private final JobScheduler e;

        public g(Context context, ComponentName componentName, int i) {
            super(componentName);
            b(i);
            this.d = new JobInfo.Builder(i, this.a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.p7700g.p99005.eg.h
        public void a(Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }

    /* compiled from: JobIntentService.java */
    /* loaded from: classes.dex */
    public static abstract class h {
        public final ComponentName a;
        public boolean b;
        public int c;

        public h(ComponentName componentName) {
            this.a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c == i) {
            } else {
                StringBuilder H = wo1.H("Given job ID ", i, " is different than previous ");
                H.append(this.c);
                throw new IllegalArgumentException(H.toString());
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public eg() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.C = null;
        } else {
            this.C = new ArrayList<>();
        }
    }

    public static void e(@x1 Context context, @x1 ComponentName componentName, int i, @x1 Intent intent) {
        if (intent != null) {
            synchronized (u) {
                h h2 = h(context, componentName, true, i);
                h2.b(i);
                h2.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void f(@x1 Context context, @x1 Class<?> cls, int i, @x1 Intent intent) {
        e(context, new ComponentName(context, cls), i, intent);
    }

    public static h h(Context context, ComponentName componentName, boolean z, int i) {
        h cVar;
        HashMap<ComponentName, h> hashMap = v;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                cVar = new c(context, componentName);
            } else if (z) {
                cVar = new g(context, componentName, i);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            h hVar2 = cVar;
            hashMap.put(componentName, hVar2);
            return hVar2;
        }
        return hVar;
    }

    public e c() {
        b bVar = this.w;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.C) {
            if (this.C.size() > 0) {
                return this.C.remove(0);
            }
            return null;
        }
    }

    public boolean d() {
        a aVar = this.y;
        if (aVar != null) {
            aVar.cancel(this.z);
        }
        this.A = true;
        return k();
    }

    public void g(boolean z) {
        if (this.y == null) {
            this.y = new a();
            h hVar = this.x;
            if (hVar != null && z) {
                hVar.d();
            }
            this.y.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean i() {
        return this.A;
    }

    public abstract void j(@x1 Intent intent);

    public boolean k() {
        return true;
    }

    public void l() {
        ArrayList<d> arrayList = this.C;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.y = null;
                ArrayList<d> arrayList2 = this.C;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    g(false);
                } else if (!this.B) {
                    this.x.c();
                }
            }
        }
    }

    public void m(boolean z) {
        this.z = z;
    }

    @Override // android.app.Service
    public IBinder onBind(@x1 Intent intent) {
        b bVar = this.w;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.w = new f(this);
            this.x = null;
            return;
        }
        this.w = null;
        this.x = h(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.C;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.B = true;
                this.x.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@z1 Intent intent, int i, int i2) {
        if (this.C != null) {
            this.x.e();
            synchronized (this.C) {
                ArrayList<d> arrayList = this.C;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new d(intent, i2));
                g(true);
            }
            return 3;
        }
        return 2;
    }
}