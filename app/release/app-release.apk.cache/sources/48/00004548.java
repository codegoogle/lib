package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.rq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes2.dex */
public class gu1<Model, Data> implements du1<Model, Data> {
    private final List<du1<Model, Data>> a;
    private final ip.a<List<Throwable>> b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: classes2.dex */
    public static class a<Data> implements rq1<Data>, rq1.a<Data> {
        private final List<rq1<Data>> s;
        private final ip.a<List<Throwable>> t;
        private int u;
        private fp1 v;
        private rq1.a<? super Data> w;
        @z1
        private List<Throwable> x;
        private boolean y;

        public a(@x1 List<rq1<Data>> list, @x1 ip.a<List<Throwable>> aVar) {
            this.t = aVar;
            x02.c(list);
            this.s = list;
            this.u = 0;
        }

        private void g() {
            if (this.y) {
                return;
            }
            if (this.u < this.s.size() - 1) {
                this.u++;
                e(this.v, this.w);
                return;
            }
            x02.d(this.x);
            this.w.c(new xr1("Fetch failed", new ArrayList(this.x)));
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public Class<Data> a() {
            return this.s.get(0).a();
        }

        @Override // com.p7700g.p99005.rq1
        public void b() {
            List<Throwable> list = this.x;
            if (list != null) {
                this.t.a(list);
            }
            this.x = null;
            for (rq1<Data> rq1Var : this.s) {
                rq1Var.b();
            }
        }

        @Override // com.p7700g.p99005.rq1.a
        public void c(@x1 Exception exc) {
            ((List) x02.d(this.x)).add(exc);
            g();
        }

        @Override // com.p7700g.p99005.rq1
        public void cancel() {
            this.y = true;
            for (rq1<Data> rq1Var : this.s) {
                rq1Var.cancel();
            }
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public aq1 d() {
            return this.s.get(0).d();
        }

        @Override // com.p7700g.p99005.rq1
        public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super Data> aVar) {
            this.v = fp1Var;
            this.w = aVar;
            this.x = this.t.b();
            this.s.get(this.u).e(fp1Var, this);
            if (this.y) {
                cancel();
            }
        }

        @Override // com.p7700g.p99005.rq1.a
        public void f(@z1 Data data) {
            if (data != null) {
                this.w.f(data);
            } else {
                g();
            }
        }
    }

    public gu1(@x1 List<du1<Model, Data>> list, @x1 ip.a<List<Throwable>> aVar) {
        this.a = list;
        this.b = aVar;
    }

    @Override // com.p7700g.p99005.du1
    public boolean a(@x1 Model model) {
        for (du1<Model, Data> du1Var : this.a) {
            if (du1Var.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.du1
    public du1.a<Data> b(@x1 Model model, int i, int i2, @x1 jq1 jq1Var) {
        du1.a<Data> b;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        gq1 gq1Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            du1<Model, Data> du1Var = this.a.get(i3);
            if (du1Var.a(model) && (b = du1Var.b(model, i, i2, jq1Var)) != null) {
                gq1Var = b.a;
                arrayList.add(b.c);
            }
        }
        if (arrayList.isEmpty() || gq1Var == null) {
            return null;
        }
        return new du1.a<>(gq1Var, new a(arrayList, this.b));
    }

    public String toString() {
        StringBuilder G = wo1.G("MultiModelLoader{modelLoaders=");
        G.append(Arrays.toString(this.a.toArray()));
        G.append('}');
        return G.toString();
    }
}