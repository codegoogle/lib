package androidx.work;

import android.net.Network;
import android.net.Uri;
import com.p7700g.p99005.cg0;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.hc0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.pb0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zb0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {
    @x1
    private UUID a;
    @x1
    private kb0 b;
    @x1
    private Set<String> c;
    @x1
    private a d;
    private int e;
    @x1
    private Executor f;
    @x1
    private cg0 g;
    @x1
    private hc0 h;
    @x1
    private zb0 i;
    @x1
    private pb0 j;

    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class a {
        @x1
        public List<String> a = Collections.emptyList();
        @x1
        public List<Uri> b = Collections.emptyList();
        @e2(28)
        public Network c;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public WorkerParameters(@x1 UUID id, @x1 kb0 inputData, @x1 Collection<String> tags, @x1 a runtimeExtras, @p1(from = 0) int runAttemptCount, @x1 Executor backgroundExecutor, @x1 cg0 workTaskExecutor, @x1 hc0 workerFactory, @x1 zb0 progressUpdater, @x1 pb0 foregroundUpdater) {
        this.a = id;
        this.b = inputData;
        this.c = new HashSet(tags);
        this.d = runtimeExtras;
        this.e = runAttemptCount;
        this.f = backgroundExecutor;
        this.g = workTaskExecutor;
        this.h = workerFactory;
        this.i = progressUpdater;
        this.j = foregroundUpdater;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public Executor a() {
        return this.f;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public pb0 b() {
        return this.j;
    }

    @x1
    public UUID c() {
        return this.a;
    }

    @x1
    public kb0 d() {
        return this.b;
    }

    @e2(28)
    @z1
    public Network e() {
        return this.d.c;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public zb0 f() {
        return this.i;
    }

    @p1(from = 0)
    public int g() {
        return this.e;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public a h() {
        return this.d;
    }

    @x1
    public Set<String> i() {
        return this.c;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public cg0 j() {
        return this.g;
    }

    @e2(24)
    @x1
    public List<String> k() {
        return this.d.a;
    }

    @e2(24)
    @x1
    public List<Uri> l() {
        return this.d.b;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public hc0 m() {
        return this.h;
    }
}