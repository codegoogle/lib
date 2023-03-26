package androidx.work.impl;

import android.content.Context;
import com.p7700g.p99005.af0;
import com.p7700g.p99005.b40;
import com.p7700g.p99005.c50;
import com.p7700g.p99005.cf0;
import com.p7700g.p99005.d50;
import com.p7700g.p99005.fe0;
import com.p7700g.p99005.ge0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ie0;
import com.p7700g.p99005.je0;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.le0;
import com.p7700g.p99005.n60;
import com.p7700g.p99005.ne0;
import com.p7700g.p99005.o60;
import com.p7700g.p99005.oe0;
import com.p7700g.p99005.pc0;
import com.p7700g.p99005.q50;
import com.p7700g.p99005.qc0;
import com.p7700g.p99005.qe0;
import com.p7700g.p99005.re0;
import com.p7700g.p99005.te0;
import com.p7700g.p99005.ue0;
import com.p7700g.p99005.v60;
import com.p7700g.p99005.we0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xe0;
import com.p7700g.p99005.ze0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@i2({i2.a.LIBRARY_GROUP})
@q50({kb0.class, cf0.class})
@b40(entities = {fe0.class, we0.class, ze0.class, ne0.class, qe0.class, te0.class, ie0.class}, version = 12)
/* loaded from: classes.dex */
public abstract class WorkDatabase extends d50 {
    private static final String n = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";
    private static final String o = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    private static final long p = TimeUnit.DAYS.toMillis(1);

    /* loaded from: classes.dex */
    public class a implements o60.c {
        public final /* synthetic */ Context a;

        public a(final Context val$context) {
            this.a = val$context;
        }

        @Override // com.p7700g.p99005.o60.c
        @x1
        public o60 a(@x1 o60.b configuration) {
            o60.b.a a = o60.b.a(this.a);
            a.c(configuration.b).b(configuration.c).d(true);
            return new v60().a(a.a());
        }
    }

    /* loaded from: classes.dex */
    public class b extends d50.b {
        @Override // com.p7700g.p99005.d50.b
        public void c(@x1 n60 db) {
            super.c(db);
            db.t();
            try {
                db.I(WorkDatabase.F());
                db.A0();
            } finally {
                db.W0();
            }
        }
    }

    @x1
    public static WorkDatabase B(@x1 final Context context, @x1 Executor queryExecutor, boolean useTestDatabase) {
        d50.a a2;
        if (useTestDatabase) {
            a2 = c50.c(context, WorkDatabase.class).c();
        } else {
            a2 = c50.a(context, WorkDatabase.class, qc0.d());
            a2.k(new a(context));
        }
        return (WorkDatabase) a2.m(queryExecutor).a(D()).b(pc0.y).b(new pc0.h(context, 2, 3)).b(pc0.z).b(pc0.A).b(new pc0.h(context, 5, 6)).b(pc0.B).b(pc0.C).b(pc0.D).b(new pc0.i(context)).b(new pc0.h(context, 10, 11)).b(pc0.E).h().d();
    }

    public static d50.b D() {
        return new b();
    }

    public static long E() {
        return System.currentTimeMillis() - p;
    }

    @x1
    public static String F() {
        StringBuilder G = wo1.G(n);
        G.append(E());
        G.append(o);
        return G.toString();
    }

    @x1
    public abstract ge0 C();

    @x1
    public abstract je0 G();

    @x1
    public abstract le0 H();

    @x1
    public abstract oe0 I();

    @x1
    public abstract re0 J();

    @x1
    public abstract ue0 K();

    @x1
    public abstract xe0 L();

    @x1
    public abstract af0 M();
}