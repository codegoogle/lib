package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import com.p7700g.p99005.gn2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.zf0;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public zf0<ListenableWorker.a> mFuture;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.r(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@x1 Context context, @x1 WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @x1
    @s2
    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    @x1
    public final gn2<ListenableWorker.a> startWork() {
        this.mFuture = zf0.v();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}