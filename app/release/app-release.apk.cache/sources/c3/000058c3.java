package com.p7700g.p99005;

/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes2.dex */
public abstract class qr1 {
    public static final qr1 a = new a();
    public static final qr1 b = new b();
    public static final qr1 c = new c();
    public static final qr1 d = new d();
    public static final qr1 e = new e();

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes2.dex */
    public class a extends qr1 {
        @Override // com.p7700g.p99005.qr1
        public boolean a() {
            return true;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean b() {
            return true;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean c(aq1 aq1Var) {
            return aq1Var == aq1.REMOTE;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean d(boolean z, aq1 aq1Var, cq1 cq1Var) {
            return (aq1Var == aq1.RESOURCE_DISK_CACHE || aq1Var == aq1.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes2.dex */
    public class b extends qr1 {
        @Override // com.p7700g.p99005.qr1
        public boolean a() {
            return false;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean b() {
            return false;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean c(aq1 aq1Var) {
            return false;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean d(boolean z, aq1 aq1Var, cq1 cq1Var) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes2.dex */
    public class c extends qr1 {
        @Override // com.p7700g.p99005.qr1
        public boolean a() {
            return true;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean b() {
            return false;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean c(aq1 aq1Var) {
            return (aq1Var == aq1.DATA_DISK_CACHE || aq1Var == aq1.MEMORY_CACHE) ? false : true;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean d(boolean z, aq1 aq1Var, cq1 cq1Var) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes2.dex */
    public class d extends qr1 {
        @Override // com.p7700g.p99005.qr1
        public boolean a() {
            return false;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean b() {
            return true;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean c(aq1 aq1Var) {
            return false;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean d(boolean z, aq1 aq1Var, cq1 cq1Var) {
            return (aq1Var == aq1.RESOURCE_DISK_CACHE || aq1Var == aq1.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes2.dex */
    public class e extends qr1 {
        @Override // com.p7700g.p99005.qr1
        public boolean a() {
            return true;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean b() {
            return true;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean c(aq1 aq1Var) {
            return aq1Var == aq1.REMOTE;
        }

        @Override // com.p7700g.p99005.qr1
        public boolean d(boolean z, aq1 aq1Var, cq1 cq1Var) {
            return ((z && aq1Var == aq1.DATA_DISK_CACHE) || aq1Var == aq1.LOCAL) && cq1Var == cq1.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(aq1 aq1Var);

    public abstract boolean d(boolean z, aq1 aq1Var, cq1 cq1Var);
}