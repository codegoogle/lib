package com.p7700g.p99005;

import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: classes2.dex */
public interface du1<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: classes2.dex */
    public static class a<Data> {
        public final gq1 a;
        public final List<gq1> b;
        public final rq1<Data> c;

        public a(@x1 gq1 gq1Var, @x1 rq1<Data> rq1Var) {
            this(gq1Var, Collections.emptyList(), rq1Var);
        }

        public a(@x1 gq1 gq1Var, @x1 List<gq1> list, @x1 rq1<Data> rq1Var) {
            this.a = (gq1) x02.d(gq1Var);
            this.b = (List) x02.d(list);
            this.c = (rq1) x02.d(rq1Var);
        }
    }

    boolean a(@x1 Model model);

    @z1
    a<Data> b(@x1 Model model, int i, int i2, @x1 jq1 jq1Var);
}