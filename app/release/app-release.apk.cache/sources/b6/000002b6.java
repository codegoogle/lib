package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.af0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ne0;
import com.p7700g.p99005.oe0;
import com.p7700g.p99005.rc0;
import com.p7700g.p99005.re0;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.we0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xe0;
import com.p7700g.p99005.z1;
import java.util.List;
import java.util.concurrent.TimeUnit;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    private static final String a = tb0.f("DiagnosticsWrkr");

    public DiagnosticsWorker(@x1 Context context, @x1 WorkerParameters parameters) {
        super(context, parameters);
    }

    @x1
    private static String a(@x1 we0 workSpec, @z1 String name, @z1 Integer systemId, @x1 String tags) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.d, workSpec.f, systemId, workSpec.e.name(), name, tags);
    }

    @x1
    private static String c(@x1 re0 workNameDao, @x1 af0 workTagDao, @x1 oe0 systemIdInfoDao, @x1 List<we0> workSpecs) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (we0 we0Var : workSpecs) {
            Integer num = null;
            ne0 c = systemIdInfoDao.c(we0Var.d);
            if (c != null) {
                num = Integer.valueOf(c.b);
            }
            sb.append(a(we0Var, TextUtils.join(",", workNameDao.c(we0Var.d)), num, TextUtils.join(",", workTagDao.b(we0Var.d))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    @x1
    public ListenableWorker.a doWork() {
        WorkDatabase M = rc0.H(getApplicationContext()).M();
        xe0 L = M.L();
        re0 J = M.J();
        af0 M2 = M.M();
        oe0 I = M.I();
        List<we0> f = L.f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<we0> n = L.n();
        List<we0> F = L.F(200);
        if (f != null && !f.isEmpty()) {
            tb0 c = tb0.c();
            String str = a;
            c.d(str, "Recently completed work:\n\n", new Throwable[0]);
            tb0.c().d(str, c(J, M2, I, f), new Throwable[0]);
        }
        if (n != null && !n.isEmpty()) {
            tb0 c2 = tb0.c();
            String str2 = a;
            c2.d(str2, "Running work:\n\n", new Throwable[0]);
            tb0.c().d(str2, c(J, M2, I, n), new Throwable[0]);
        }
        if (F != null && !F.isEmpty()) {
            tb0 c3 = tb0.c();
            String str3 = a;
            c3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            tb0.c().d(str3, c(J, M2, I, F), new Throwable[0]);
        }
        return ListenableWorker.a.e();
    }
}