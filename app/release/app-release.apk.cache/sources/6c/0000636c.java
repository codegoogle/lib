package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkSpec.java */
@i2({i2.a.LIBRARY_GROUP})
@g40(indices = {@q40({"schedule_requested_at"}), @q40({"period_start_time"})})
/* loaded from: classes.dex */
public final class we0 {
    public static final long b = -1;
    @x1
    @x40
    @z30(name = "id")
    public String d;
    @x1
    @z30(name = CallMraidJS.b)
    public dc0.a e;
    @x1
    @z30(name = "worker_class_name")
    public String f;
    @z30(name = "input_merger_class_name")
    public String g;
    @x1
    @z30(name = "input")
    public kb0 h;
    @x1
    @z30(name = "output")
    public kb0 i;
    @z30(name = "initial_delay")
    public long j;
    @z30(name = "interval_duration")
    public long k;
    @z30(name = "flex_duration")
    public long l;
    @f40
    @x1
    public ib0 m;
    @p1(from = 0)
    @z30(name = "run_attempt_count")
    public int n;
    @x1
    @z30(name = "backoff_policy")
    public gb0 o;
    @z30(name = "backoff_delay_duration")
    public long p;
    @z30(name = "period_start_time")
    public long q;
    @z30(name = "minimum_retention_duration")
    public long r;
    @z30(name = "schedule_requested_at")
    public long s;
    @z30(name = "run_in_foreground")
    public boolean t;
    @x1
    @z30(name = "out_of_quota_policy")
    public xb0 u;
    private static final String a = tb0.f("WorkSpec");
    public static final m5<List<c>, List<dc0>> c = new a();

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public class a implements m5<List<c>, List<dc0>> {
        @Override // com.p7700g.p99005.m5
        /* renamed from: a */
        public List<dc0> apply(List<c> input) {
            if (input == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(input.size());
            for (c cVar : input) {
                arrayList.add(cVar.a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class b {
        @z30(name = "id")
        public String a;
        @z30(name = CallMraidJS.b)
        public dc0.a b;

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o instanceof b) {
                b bVar = (b) o;
                if (this.b != bVar.b) {
                    return false;
                }
                return this.a.equals(bVar.a);
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class c {
        @z30(name = "id")
        public String a;
        @z30(name = CallMraidJS.b)
        public dc0.a b;
        @z30(name = "output")
        public kb0 c;
        @z30(name = "run_attempt_count")
        public int d;
        @b50(entity = ze0.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        public List<String> e;
        @b50(entity = te0.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        public List<kb0> f;

        @x1
        public dc0 a() {
            kb0 kb0Var;
            List<kb0> list = this.f;
            if (list != null && !list.isEmpty()) {
                kb0Var = this.f.get(0);
            } else {
                kb0Var = kb0.b;
            }
            return new dc0(UUID.fromString(this.a), this.b, this.c, this.e, kb0Var, this.d);
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o instanceof c) {
                c cVar = (c) o;
                if (this.d != cVar.d) {
                    return false;
                }
                String str = this.a;
                if (str == null ? cVar.a == null : str.equals(cVar.a)) {
                    if (this.b != cVar.b) {
                        return false;
                    }
                    kb0 kb0Var = this.c;
                    if (kb0Var == null ? cVar.c == null : kb0Var.equals(cVar.c)) {
                        List<String> list = this.e;
                        if (list == null ? cVar.e == null : list.equals(cVar.e)) {
                            List<kb0> list2 = this.f;
                            List<kb0> list3 = cVar.f;
                            return list2 != null ? list2.equals(list3) : list3 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            dc0.a aVar = this.b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            kb0 kb0Var = this.c;
            int hashCode3 = (((hashCode2 + (kb0Var != null ? kb0Var.hashCode() : 0)) * 31) + this.d) * 31;
            List<String> list = this.e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<kb0> list2 = this.f;
            return hashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public we0(@x1 String id, @x1 String workerClassName) {
        this.e = dc0.a.ENQUEUED;
        kb0 kb0Var = kb0.b;
        this.h = kb0Var;
        this.i = kb0Var;
        this.m = ib0.a;
        this.o = gb0.EXPONENTIAL;
        this.p = 30000L;
        this.s = -1L;
        this.u = xb0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.d = id;
        this.f = workerClassName;
    }

    public long a() {
        long j;
        long j2;
        long scalb;
        if (c()) {
            if (this.o == gb0.LINEAR) {
                scalb = this.p * this.n;
            } else {
                scalb = Math.scalb((float) this.p, this.n - 1);
            }
            j2 = this.q;
            j = Math.min((long) gc0.b, scalb);
        } else {
            if (d()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = this.q;
                long j4 = j3 == 0 ? currentTimeMillis + this.j : j3;
                long j5 = this.l;
                long j6 = this.k;
                if (j5 != j6) {
                    return j4 + j6 + (j3 == 0 ? j5 * (-1) : 0L);
                }
                return j4 + (j3 != 0 ? j6 : 0L);
            }
            j = this.q;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            j2 = this.j;
        }
        return j + j2;
    }

    public boolean b() {
        return !ib0.a.equals(this.m);
    }

    public boolean c() {
        return this.e == dc0.a.ENQUEUED && this.n > 0;
    }

    public boolean d() {
        return this.k != 0;
    }

    public void e(long backoffDelayDuration) {
        if (backoffDelayDuration > gc0.b) {
            tb0.c().h(a, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            backoffDelayDuration = 18000000;
        }
        if (backoffDelayDuration < gc0.c) {
            tb0.c().h(a, "Backoff delay duration less than minimum value", new Throwable[0]);
            backoffDelayDuration = 10000;
        }
        this.p = backoffDelayDuration;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || we0.class != o.getClass()) {
            return false;
        }
        we0 we0Var = (we0) o;
        if (this.j == we0Var.j && this.k == we0Var.k && this.l == we0Var.l && this.n == we0Var.n && this.p == we0Var.p && this.q == we0Var.q && this.r == we0Var.r && this.s == we0Var.s && this.t == we0Var.t && this.d.equals(we0Var.d) && this.e == we0Var.e && this.f.equals(we0Var.f)) {
            String str = this.g;
            if (str == null ? we0Var.g == null : str.equals(we0Var.g)) {
                return this.h.equals(we0Var.h) && this.i.equals(we0Var.i) && this.m.equals(we0Var.m) && this.o == we0Var.o && this.u == we0Var.u;
            }
            return false;
        }
        return false;
    }

    public void f(long intervalDuration) {
        if (intervalDuration < yb0.g) {
            tb0.c().h(a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf((long) yb0.g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        g(intervalDuration, intervalDuration);
    }

    public void g(long intervalDuration, long flexDuration) {
        if (intervalDuration < yb0.g) {
            tb0.c().h(a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf((long) yb0.g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        if (flexDuration < yb0.h) {
            tb0.c().h(a, String.format("Flex duration lesser than minimum allowed value; Changed to %s", Long.valueOf((long) yb0.h)), new Throwable[0]);
            flexDuration = 300000;
        }
        if (flexDuration > intervalDuration) {
            tb0.c().h(a, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(intervalDuration)), new Throwable[0]);
            flexDuration = intervalDuration;
        }
        this.k = intervalDuration;
        this.l = flexDuration;
    }

    public int hashCode() {
        int x = wo1.x(this.f, (this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31);
        String str = this.g;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.h.hashCode();
        int hashCode3 = this.i.hashCode();
        long j = this.j;
        long j2 = this.k;
        long j3 = this.l;
        int hashCode4 = this.m.hashCode();
        int hashCode5 = this.o.hashCode();
        long j4 = this.p;
        long j5 = this.q;
        long j6 = this.r;
        long j7 = this.s;
        return this.u.hashCode() + ((((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((x + hashCode) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.n) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.t ? 1 : 0)) * 31);
    }

    @x1
    public String toString() {
        return wo1.C(wo1.G("{WorkSpec: "), this.d, "}");
    }

    public we0(@x1 we0 other) {
        this.e = dc0.a.ENQUEUED;
        kb0 kb0Var = kb0.b;
        this.h = kb0Var;
        this.i = kb0Var;
        this.m = ib0.a;
        this.o = gb0.EXPONENTIAL;
        this.p = 30000L;
        this.s = -1L;
        this.u = xb0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.d = other.d;
        this.f = other.f;
        this.e = other.e;
        this.g = other.g;
        this.h = new kb0(other.h);
        this.i = new kb0(other.i);
        this.j = other.j;
        this.k = other.k;
        this.l = other.l;
        this.m = new ib0(other.m);
        this.n = other.n;
        this.o = other.o;
        this.p = other.p;
        this.q = other.q;
        this.r = other.r;
        this.s = other.s;
        this.t = other.t;
        this.u = other.u;
    }
}