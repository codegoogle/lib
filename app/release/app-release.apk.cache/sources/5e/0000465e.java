package com.p7700g.p99005;

import androidx.lifecycle.LiveData;
import com.p7700g.p99005.i2;

/* compiled from: LiveDataUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class hf0 {

    /* compiled from: LiveDataUtils.java */
    /* loaded from: classes.dex */
    public class a implements yz<In> {
        public Out a = null;
        public final /* synthetic */ cg0 b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ m5 d;
        public final /* synthetic */ vz e;

        /* compiled from: LiveDataUtils.java */
        /* renamed from: com.p7700g.p99005.hf0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0188a implements Runnable {
            public final /* synthetic */ Object s;

            public RunnableC0188a(final Object val$input) {
                this.s = val$input;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Out] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.c) {
                    ?? apply = a.this.d.apply(this.s);
                    a aVar = a.this;
                    Out out = aVar.a;
                    if (out == 0 && apply != 0) {
                        aVar.a = apply;
                        aVar.e.n(apply);
                    } else if (out != 0 && !out.equals(apply)) {
                        a aVar2 = a.this;
                        aVar2.a = apply;
                        aVar2.e.n(apply);
                    }
                }
            }
        }

        public a(final cg0 val$workTaskExecutor, final Object val$lock, final m5 val$mappingMethod, final vz val$outputLiveData) {
            this.b = val$workTaskExecutor;
            this.c = val$lock;
            this.d = val$mappingMethod;
            this.e = val$outputLiveData;
        }

        @Override // com.p7700g.p99005.yz
        public void a(@z1 final In input) {
            this.b.c(new RunnableC0188a(input));
        }
    }

    private hf0() {
    }

    public static <In, Out> LiveData<Out> a(@x1 LiveData<In> inputLiveData, @x1 final m5<In, Out> mappingMethod, @x1 final cg0 workTaskExecutor) {
        Object obj = new Object();
        vz vzVar = new vz();
        vzVar.r(inputLiveData, new a(workTaskExecutor, obj, mappingMethod, vzVar));
        return vzVar;
    }
}