package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x1;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(@x1 Context context, @x1 WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override // androidx.work.Worker
    @x1
    public ListenableWorker.a doWork() {
        return ListenableWorker.a.f(getInputData());
    }
}