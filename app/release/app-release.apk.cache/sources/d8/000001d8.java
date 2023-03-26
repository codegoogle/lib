package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.p7700g.p99005.a70;
import com.p7700g.p99005.cv;
import com.p7700g.p99005.dv;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.ez;
import com.p7700g.p99005.fv;
import com.p7700g.p99005.fz;
import com.p7700g.p99005.in;
import com.p7700g.p99005.kv;
import com.p7700g.p99005.mv;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z60;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements a70<Boolean> {
    private static final long a = 500;
    private static final String b = "EmojiCompatInitializer";

    @e2(19)
    /* loaded from: classes.dex */
    public static class a extends fv.d {
        public a(Context context) {
            super(new b(context));
            f(1);
        }
    }

    @e2(19)
    /* loaded from: classes.dex */
    public static class b implements fv.i {
        private final Context a;

        /* loaded from: classes.dex */
        public class a extends fv.j {
            public final /* synthetic */ fv.j a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(fv.j jVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = jVar;
                this.b = threadPoolExecutor;
            }

            @Override // com.p7700g.p99005.fv.j
            public void a(@z1 Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // com.p7700g.p99005.fv.j
            public void b(@x1 mv mvVar) {
                try {
                    this.a.b(mvVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // com.p7700g.p99005.fv.i
        public void a(@x1 final fv.j jVar) {
            final ThreadPoolExecutor b = cv.b(EmojiCompatInitializer.b);
            b.execute(new Runnable() { // from class: com.p7700g.p99005.zu
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(jVar, b);
                }
            });
        }

        @s2
        /* renamed from: b */
        public void d(@x1 fv.j jVar, @x1 ThreadPoolExecutor threadPoolExecutor) {
            try {
                kv a2 = dv.a(this.a);
                if (a2 != null) {
                    a2.l(threadPoolExecutor);
                    a2.a().a(new a(jVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                jVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                in.b("EmojiCompat.EmojiCompatInitializer.run");
                if (fv.n()) {
                    fv.b().q();
                }
            } finally {
                in.d();
            }
        }
    }

    @Override // com.p7700g.p99005.a70
    @x1
    /* renamed from: b */
    public Boolean a(@x1 Context context) {
        fv.m(new a(context));
        c(context);
        return Boolean.TRUE;
    }

    @e2(19)
    public void c(@x1 Context context) {
        final mz lifecycle = ((qz) z60.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new fz() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // com.p7700g.p99005.fz, com.p7700g.p99005.hz
            public void a(@x1 qz qzVar) {
                EmojiCompatInitializer.this.d();
                lifecycle.c(this);
            }

            @Override // com.p7700g.p99005.fz, com.p7700g.p99005.hz
            public /* synthetic */ void b(qz qzVar) {
                ez.a(this, qzVar);
            }

            @Override // com.p7700g.p99005.fz, com.p7700g.p99005.hz
            public /* synthetic */ void c(qz qzVar) {
                ez.c(this, qzVar);
            }

            @Override // com.p7700g.p99005.fz, com.p7700g.p99005.hz
            public /* synthetic */ void d(qz qzVar) {
                ez.f(this, qzVar);
            }

            @Override // com.p7700g.p99005.fz, com.p7700g.p99005.hz
            public /* synthetic */ void g(qz qzVar) {
                ez.b(this, qzVar);
            }

            @Override // com.p7700g.p99005.fz, com.p7700g.p99005.hz
            public /* synthetic */ void h(qz qzVar) {
                ez.e(this, qzVar);
            }
        });
    }

    @e2(19)
    public void d() {
        cv.d().postDelayed(new c(), a);
    }

    @Override // com.p7700g.p99005.a70
    @x1
    public List<Class<? extends a70<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}