package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import com.p7700g.p99005.cg0;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.gn2;
import com.p7700g.p99005.hc0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.ob0;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zf0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    @x1
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    @x1
    private WorkerParameters mWorkerParams;

    /* loaded from: classes.dex */
    public static abstract class a {

        @i2({i2.a.LIBRARY_GROUP})
        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0004a extends a {
            private final kb0 a;

            public C0004a() {
                this(kb0.b);
            }

            @Override // androidx.work.ListenableWorker.a
            @x1
            public kb0 c() {
                return this.a;
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || C0004a.class != o.getClass()) {
                    return false;
                }
                return this.a.equals(((C0004a) o).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (C0004a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder G = wo1.G("Failure {mOutputData=");
                G.append(this.a);
                G.append('}');
                return G.toString();
            }

            public C0004a(@x1 kb0 outputData) {
                this.a = outputData;
            }
        }

        @i2({i2.a.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public static final class b extends a {
            @Override // androidx.work.ListenableWorker.a
            @x1
            public kb0 c() {
                return kb0.b;
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                return o != null && b.class == o.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        @i2({i2.a.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public static final class c extends a {
            private final kb0 a;

            public c() {
                this(kb0.b);
            }

            @Override // androidx.work.ListenableWorker.a
            @x1
            public kb0 c() {
                return this.a;
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || c.class != o.getClass()) {
                    return false;
                }
                return this.a.equals(((c) o).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder G = wo1.G("Success {mOutputData=");
                G.append(this.a);
                G.append('}');
                return G.toString();
            }

            public c(@x1 kb0 outputData) {
                this.a = outputData;
            }
        }

        @x1
        public static a a() {
            return new C0004a();
        }

        @x1
        public static a b(@x1 kb0 outputData) {
            return new C0004a(outputData);
        }

        @x1
        public static a d() {
            return new b();
        }

        @x1
        public static a e() {
            return new c();
        }

        @x1
        public static a f(@x1 kb0 outputData) {
            return new c(outputData);
        }

        @x1
        public abstract kb0 c();
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@x1 Context appContext, @x1 WorkerParameters workerParams) {
        if (appContext == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParams != null) {
            this.mAppContext = appContext;
            this.mWorkerParams = workerParams;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }

    @x1
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    @x1
    public gn2<ob0> getForegroundInfoAsync() {
        zf0 v = zf0.v();
        v.r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return v;
    }

    @x1
    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    @x1
    public final kb0 getInputData() {
        return this.mWorkerParams.d();
    }

    @e2(28)
    @z1
    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    @p1(from = 0)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    @x1
    public final Set<String> getTags() {
        return this.mWorkerParams.i();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public cg0 getTaskExecutor() {
        return this.mWorkerParams.j();
    }

    @e2(24)
    @x1
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.k();
    }

    @e2(24)
    @x1
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.l();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public hc0 getWorkerFactory() {
        return this.mWorkerParams.m();
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @x1
    public final gn2<Void> setForegroundAsync(@x1 ob0 foregroundInfo) {
        this.mRunInForeground = true;
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), foregroundInfo);
    }

    @x1
    public gn2<Void> setProgressAsync(@x1 kb0 data) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), data);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void setRunInForeground(boolean runInForeground) {
        this.mRunInForeground = runInForeground;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    @x1
    @u1
    public abstract gn2<a> startWork();

    @i2({i2.a.LIBRARY_GROUP})
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}