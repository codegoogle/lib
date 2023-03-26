package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import com.p7700g.p99005.rq1;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes2.dex */
public class lu1<Model> implements du1<Model, Model> {
    private static final lu1<?> a = new lu1<>();

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes2.dex */
    public static class a<Model> implements eu1<Model, Model> {
        private static final a<?> a = new a<>();

        public static <T> a<T> b() {
            return (a<T>) a;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Model, Model> c(hu1 hu1Var) {
            return lu1.c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes2.dex */
    public static class b<Model> implements rq1<Model> {
        private final Model s;

        public b(Model model) {
            this.s = model;
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public Class<Model> a() {
            return (Class<Model>) this.s.getClass();
        }

        @Override // com.p7700g.p99005.rq1
        public void b() {
        }

        @Override // com.p7700g.p99005.rq1
        public void cancel() {
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public aq1 d() {
            return aq1.LOCAL;
        }

        @Override // com.p7700g.p99005.rq1
        public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super Model> aVar) {
            aVar.f((Model) this.s);
        }
    }

    public static <T> lu1<T> c() {
        return (lu1<T>) a;
    }

    @Override // com.p7700g.p99005.du1
    public boolean a(@x1 Model model) {
        return true;
    }

    @Override // com.p7700g.p99005.du1
    public du1.a<Model> b(@x1 Model model, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(model), new b(model));
    }
}