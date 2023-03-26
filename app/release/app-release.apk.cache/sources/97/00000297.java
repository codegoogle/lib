package androidx.work;

import android.content.Context;
import com.p7700g.p99005.a70;
import com.p7700g.p99005.ec0;
import com.p7700g.p99005.hb0;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.x1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements a70<ec0> {
    private static final String a = tb0.f("WrkMgrInitializer");

    @Override // com.p7700g.p99005.a70
    @x1
    /* renamed from: b */
    public ec0 a(@x1 Context context) {
        tb0.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        ec0.A(context, new hb0.b().a());
        return ec0.p(context);
    }

    @Override // com.p7700g.p99005.a70
    @x1
    public List<Class<? extends a70<?>>> dependencies() {
        return Collections.emptyList();
    }
}