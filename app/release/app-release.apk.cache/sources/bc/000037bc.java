package com.onesignal;

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
import com.p7700g.p99005.e2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yc0;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class JobIntentService extends Service {
    public static final String s = "JobIntentService";
    public static final boolean t = false;
    public static final Object u = new Object();
    public static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> v = new HashMap<>();
    public CompatJobEngine w;
    public WorkEnqueuer x;
    public CommandProcessor y;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;
    public final ArrayList<CompatWorkItem> C = new ArrayList<>();

    /* loaded from: classes3.dex */
    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem a = JobIntentService.this.a();
                if (a == null) {
                    return null;
                }
                JobIntentService.this.h(a.getIntent());
                a.complete();
            }
        }

        @Override // android.os.AsyncTask
        public void onCancelled(Void r1) {
            JobIntentService.this.j();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r1) {
            JobIntentService.this.j();
        }
    }

    /* loaded from: classes3.dex */
    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    /* loaded from: classes3.dex */
    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        public boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        public boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if (!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000L);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(yc0.B);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class CompatWorkItem implements GenericWorkItem {
        public final Intent mIntent;
        public final int mStartId;

        public CompatWorkItem(Intent intent, int i) {
            this.mIntent = intent;
            this.mStartId = i;
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.mIntent;
        }
    }

    /* loaded from: classes3.dex */
    public static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        public ComponentNameWithWakeful(ComponentName componentName, boolean z) {
            this.componentName = componentName;
            this.useWakefulService = z;
        }
    }

    /* loaded from: classes3.dex */
    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    @e2(26)
    /* loaded from: classes3.dex */
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        public static final boolean DEBUG = false;
        public static final String TAG = "JobServiceEngineImpl";
        public final Object mLock;
        public JobParameters mParams;
        public final JobIntentService mService;

        /* loaded from: classes3.dex */
        public final class WrapperWorkItem implements GenericWorkItem {
            public final JobWorkItem mJobWork;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public void complete() {
                synchronized (JobServiceEngineImpl.this.mLock) {
                    JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.mJobWork);
                        } catch (IllegalArgumentException | SecurityException unused) {
                        }
                    }
                }
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mLock = new Object();
            this.mService = jobIntentService;
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
            synchronized (this.mLock) {
                JobParameters jobParameters = this.mParams;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    JobWorkItem dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork != null) {
                        dequeueWork.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
                        return new WrapperWorkItem(dequeueWork);
                    }
                    return null;
                } catch (SecurityException unused) {
                    return null;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.mService.b();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return b;
        }
    }

    @e2(26)
    /* loaded from: classes3.dex */
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i) {
            super(componentName);
            ensureJobId(i);
            this.mJobInfo = new JobInfo.Builder(i, this.mComponentName).setOverrideDeadline(0L).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class WorkEnqueuer {
        public final ComponentName mComponentName;
        public boolean mHasJobId;
        public int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public abstract void enqueueWork(Intent intent);

        public void ensureJobId(int i) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i;
            } else if (this.mJobId == i) {
            } else {
                StringBuilder H = wo1.H("Given job ID ", i, " is different than previous ");
                H.append(this.mJobId);
                throw new IllegalArgumentException(H.toString());
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    public static void c(@x1 Context context, @x1 ComponentName componentName, int i, @x1 Intent intent, boolean z) {
        if (intent != null) {
            synchronized (u) {
                WorkEnqueuer f = f(context, componentName, true, i, z);
                f.ensureJobId(i);
                try {
                    f.enqueueWork(intent);
                } catch (IllegalStateException e) {
                    if (z) {
                        f(context, componentName, true, i, false).enqueueWork(intent);
                    } else {
                        throw e;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(@x1 Context context, @x1 Class cls, int i, @x1 Intent intent, boolean z) {
        c(context, new ComponentName(context, cls), i, intent, z);
    }

    public static WorkEnqueuer f(Context context, ComponentName componentName, boolean z, int i, boolean z2) {
        WorkEnqueuer compatWorkEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z2);
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> hashMap = v;
        WorkEnqueuer workEnqueuer = hashMap.get(componentNameWithWakeful);
        if (workEnqueuer == null) {
            if (Build.VERSION.SDK_INT < 26 || z2) {
                compatWorkEnqueuer = new CompatWorkEnqueuer(context, componentName);
            } else if (z) {
                compatWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            WorkEnqueuer workEnqueuer2 = compatWorkEnqueuer;
            hashMap.put(componentNameWithWakeful, workEnqueuer2);
            return workEnqueuer2;
        }
        return workEnqueuer;
    }

    public GenericWorkItem a() {
        GenericWorkItem dequeueWork;
        CompatJobEngine compatJobEngine = this.w;
        if (compatJobEngine == null || (dequeueWork = compatJobEngine.dequeueWork()) == null) {
            synchronized (this.C) {
                if (this.C.size() > 0) {
                    return this.C.remove(0);
                }
                return null;
            }
        }
        return dequeueWork;
    }

    public boolean b() {
        CommandProcessor commandProcessor = this.y;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.z);
        }
        this.A = true;
        return i();
    }

    public void e(boolean z) {
        if (this.y == null) {
            this.y = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.x;
            if (workEnqueuer != null && z) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.y.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.A;
    }

    public abstract void h(@x1 Intent intent);

    public boolean i() {
        return true;
    }

    public void j() {
        ArrayList<CompatWorkItem> arrayList = this.C;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.y = null;
                ArrayList<CompatWorkItem> arrayList2 = this.C;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.B) {
                    this.x.serviceProcessingFinished();
                }
            }
        }
    }

    public void k(boolean z) {
        this.z = z;
    }

    @Override // android.app.Service
    public IBinder onBind(@x1 Intent intent) {
        CompatJobEngine compatJobEngine = this.w;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.w = new JobServiceEngineImpl(this);
            this.x = null;
        }
        this.x = f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b();
        synchronized (this.C) {
            this.B = true;
            this.x.serviceProcessingFinished();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@z1 Intent intent, int i, int i2) {
        this.x.serviceStartReceived();
        synchronized (this.C) {
            ArrayList<CompatWorkItem> arrayList = this.C;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i2));
            e(true);
        }
        return 3;
    }
}