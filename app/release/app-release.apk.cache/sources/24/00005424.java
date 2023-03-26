package com.p7700g.p99005;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.vb0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class oc0 extends cc0 {
    private static final String a = tb0.f("WorkContinuationImpl");
    private final rc0 b;
    private final String c;
    private final nb0 d;
    private final List<? extends gc0> e;
    private final List<String> f;
    private final List<String> g;
    private final List<oc0> h;
    private boolean i;
    private wb0 j;

    public oc0(@x1 rc0 workManagerImpl, @x1 List<? extends gc0> work) {
        this(workManagerImpl, null, nb0.KEEP, work, null);
    }

    @i2({i2.a.LIBRARY_GROUP})
    private static boolean p(@x1 oc0 continuation, @x1 Set<String> visited) {
        visited.addAll(continuation.j());
        Set<String> s = s(continuation);
        for (String str : visited) {
            if (s.contains(str)) {
                return true;
            }
        }
        List<oc0> l = continuation.l();
        if (l != null && !l.isEmpty()) {
            for (oc0 oc0Var : l) {
                if (p(oc0Var, visited)) {
                    return true;
                }
            }
        }
        visited.removeAll(continuation.j());
        return false;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static Set<String> s(oc0 continuation) {
        HashSet hashSet = new HashSet();
        List<oc0> l = continuation.l();
        if (l != null && !l.isEmpty()) {
            for (oc0 oc0Var : l) {
                hashSet.addAll(oc0Var.j());
            }
        }
        return hashSet;
    }

    @Override // com.p7700g.p99005.cc0
    @x1
    public cc0 b(@x1 List<cc0> continuations) {
        vb0 b = new vb0.a(CombineContinuationsWorker.class).t(ArrayCreatingInputMerger.class).b();
        ArrayList arrayList = new ArrayList(continuations.size());
        Iterator<cc0> it = continuations.iterator();
        while (it.hasNext()) {
            arrayList.add((oc0) it.next());
        }
        return new oc0(this.b, null, nb0.KEEP, Collections.singletonList(b), arrayList);
    }

    @Override // com.p7700g.p99005.cc0
    @x1
    public wb0 c() {
        if (!this.i) {
            ff0 ff0Var = new ff0(this);
            this.b.O().c(ff0Var);
            this.j = ff0Var.d();
        } else {
            tb0.c().h(a, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f)), new Throwable[0]);
        }
        return this.j;
    }

    @Override // com.p7700g.p99005.cc0
    @x1
    public gn2<List<dc0>> d() {
        pf0<List<dc0>> a2 = pf0.a(this.b, this.g);
        this.b.O().c(a2);
        return a2.f();
    }

    @Override // com.p7700g.p99005.cc0
    @x1
    public LiveData<List<dc0>> e() {
        return this.b.N(this.g);
    }

    @Override // com.p7700g.p99005.cc0
    @x1
    public cc0 g(@x1 List<vb0> work) {
        return work.isEmpty() ? this : new oc0(this.b, this.c, nb0.KEEP, work, Collections.singletonList(this));
    }

    public List<String> h() {
        return this.g;
    }

    public nb0 i() {
        return this.d;
    }

    @x1
    public List<String> j() {
        return this.f;
    }

    @z1
    public String k() {
        return this.c;
    }

    public List<oc0> l() {
        return this.h;
    }

    @x1
    public List<? extends gc0> m() {
        return this.e;
    }

    @x1
    public rc0 n() {
        return this.b;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean o() {
        return p(this, new HashSet());
    }

    public boolean q() {
        return this.i;
    }

    public void r() {
        this.i = true;
    }

    public oc0(@x1 rc0 workManagerImpl, @z1 String name, @x1 nb0 existingWorkPolicy, @x1 List<? extends gc0> work) {
        this(workManagerImpl, name, existingWorkPolicy, work, null);
    }

    public oc0(@x1 rc0 workManagerImpl, @z1 String name, @x1 nb0 existingWorkPolicy, @x1 List<? extends gc0> work, @z1 List<oc0> parents) {
        this.b = workManagerImpl;
        this.c = name;
        this.d = existingWorkPolicy;
        this.e = work;
        this.h = parents;
        this.f = new ArrayList(work.size());
        this.g = new ArrayList();
        if (parents != null) {
            for (oc0 oc0Var : parents) {
                this.g.addAll(oc0Var.g);
            }
        }
        for (int i = 0; i < work.size(); i++) {
            String b = work.get(i).b();
            this.f.add(b);
            this.g.add(b);
        }
    }
}