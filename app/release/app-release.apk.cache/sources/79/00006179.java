package com.p7700g.p99005;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import com.p7700g.p99005.gc0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes.dex */
public final class vb0 extends gc0 {

    /* compiled from: OneTimeWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends gc0.a<a, vb0> {
        public a(@x1 Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            this.c.g = OverwritingInputMerger.class.getName();
        }

        @Override // com.p7700g.p99005.gc0.a
        @x1
        /* renamed from: r */
        public vb0 c() {
            if (this.a && Build.VERSION.SDK_INT >= 23 && this.c.m.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new vb0(this);
        }

        @Override // com.p7700g.p99005.gc0.a
        @x1
        /* renamed from: s */
        public a d() {
            return this;
        }

        @x1
        public a t(@x1 Class<? extends rb0> inputMerger) {
            this.c.g = inputMerger.getName();
            return this;
        }
    }

    public vb0(a builder) {
        super(builder.b, builder.c, builder.d);
    }

    @x1
    public static vb0 e(@x1 Class<? extends ListenableWorker> workerClass) {
        return new a(workerClass).b();
    }

    @x1
    public static List<vb0> f(@x1 List<Class<? extends ListenableWorker>> workerClasses) {
        ArrayList arrayList = new ArrayList(workerClasses.size());
        for (Class<? extends ListenableWorker> cls : workerClasses) {
            arrayList.add(new a(cls).b());
        }
        return arrayList;
    }
}