package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.jr5;
import com.p7700g.p99005.yq5;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CacheStrategy.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0002\n\u0003B\u001d\b\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/p7700g/p99005/xr5;", "", "Lcom/p7700g/p99005/hr5;", "b", "Lcom/p7700g/p99005/hr5;", "()Lcom/p7700g/p99005/hr5;", "networkRequest", "Lcom/p7700g/p99005/jr5;", "c", "Lcom/p7700g/p99005/jr5;", "a", "()Lcom/p7700g/p99005/jr5;", "cacheResponse", "<init>", "(Lcom/p7700g/p99005/hr5;Lcom/p7700g/p99005/jr5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class xr5 {
    public static final a a = new a(null);
    @Nullable
    private final hr5 b;
    @Nullable
    private final jr5 c;

    /* compiled from: CacheStrategy.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"com/p7700g/p99005/xr5$a", "", "Lcom/p7700g/p99005/jr5;", "response", "Lcom/p7700g/p99005/hr5;", "request", "", "a", "(Lcom/p7700g/p99005/jr5;Lcom/p7700g/p99005/hr5;)Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(@NotNull jr5 jr5Var, @NotNull hr5 hr5Var) {
            c25.p(jr5Var, "response");
            c25.p(hr5Var, "request");
            int E = jr5Var.E();
            if (E != 200 && E != 410 && E != 414 && E != 501 && E != 203 && E != 204) {
                if (E != 307) {
                    if (E != 308 && E != 404 && E != 405) {
                        switch (E) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (jr5.W(jr5Var, sm4.n, null, 2, null) == null && jr5Var.w().n() == -1 && !jr5Var.w().m() && !jr5Var.w().l()) {
                    return false;
                }
            }
            return (jr5Var.w().s() || hr5Var.g().s()) ? false : true;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CacheStrategy.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010%\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0018\u0010'\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006/"}, d2 = {"com/p7700g/p99005/xr5$b", "", "", com.anythink.basead.d.g.i, "()Z", "Lcom/p7700g/p99005/xr5;", "c", "()Lcom/p7700g/p99005/xr5;", "", "d", "()J", "a", "Lcom/p7700g/p99005/hr5;", "request", "f", "(Lcom/p7700g/p99005/hr5;)Z", "b", "", "Ljava/lang/String;", "lastModifiedString", "J", "sentRequestMillis", "j", "nowMillis", "receivedResponseMillis", "h", "etag", "Ljava/util/Date;", "e", "Ljava/util/Date;", "expires", "k", "Lcom/p7700g/p99005/hr5;", "()Lcom/p7700g/p99005/hr5;", "Lcom/p7700g/p99005/jr5;", "l", "Lcom/p7700g/p99005/jr5;", "cacheResponse", "servedDateString", "lastModified", "", "i", AFHydra.STATUS_IDLE, "ageSeconds", "servedDate", "<init>", "(JLcom/p7700g/p99005/hr5;Lcom/p7700g/p99005/jr5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private Date a;
        private String b;
        private Date c;
        private String d;
        private Date e;
        private long f;
        private long g;
        private String h;
        private int i;
        private final long j;
        @NotNull
        private final hr5 k;
        private final jr5 l;

        public b(long j, @NotNull hr5 hr5Var, @Nullable jr5 jr5Var) {
            c25.p(hr5Var, "request");
            this.j = j;
            this.k = hr5Var;
            this.l = jr5Var;
            this.i = -1;
            if (jr5Var != null) {
                this.f = jr5Var.Y1();
                this.g = jr5Var.K1();
                yq5 Y = jr5Var.Y();
                int size = Y.size();
                for (int i = 0; i < size; i++) {
                    String h = Y.h(i);
                    String t = Y.t(i);
                    if (b95.K1(h, sm4.l, true)) {
                        this.a = ts5.a(t);
                        this.b = t;
                    } else if (b95.K1(h, sm4.n, true)) {
                        this.e = ts5.a(t);
                    } else if (b95.K1(h, sm4.t, true)) {
                        this.c = ts5.a(t);
                        this.d = t;
                    } else if (b95.K1(h, sm4.m, true)) {
                        this.h = t;
                    } else if (b95.K1(h, "Age", true)) {
                        this.i = sr5.f0(t, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.a;
            long max = date != null ? Math.max(0L, this.g - date.getTime()) : 0L;
            int i = this.i;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.g;
            return max + (j - this.f) + (this.j - j);
        }

        private final xr5 c() {
            if (this.l == null) {
                return new xr5(this.k, null);
            }
            if (this.k.l() && this.l.K() == null) {
                return new xr5(this.k, null);
            }
            if (!xr5.a.a(this.l, this.k)) {
                return new xr5(this.k, null);
            }
            gq5 g = this.k.g();
            if (!g.r() && !f(this.k)) {
                gq5 w = this.l.w();
                long a = a();
                long d = d();
                if (g.n() != -1) {
                    d = Math.min(d, TimeUnit.SECONDS.toMillis(g.n()));
                }
                long j = 0;
                long millis = g.p() != -1 ? TimeUnit.SECONDS.toMillis(g.p()) : 0L;
                if (!w.q() && g.o() != -1) {
                    j = TimeUnit.SECONDS.toMillis(g.o());
                }
                if (!w.r()) {
                    long j2 = millis + a;
                    if (j2 < j + d) {
                        jr5.a c1 = this.l.c1();
                        if (j2 >= d) {
                            c1.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a > com.anythink.expressad.foundation.g.a.bV && g()) {
                            c1.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new xr5(null, c1.c());
                    }
                }
                String str = this.h;
                String str2 = sm4.q;
                if (str != null) {
                    str2 = sm4.r;
                } else if (this.c != null) {
                    str = this.d;
                } else if (this.a != null) {
                    str = this.b;
                } else {
                    return new xr5(this.k, null);
                }
                yq5.a m = this.k.k().m();
                c25.m(str);
                m.g(str2, str);
                return new xr5(this.k.n().o(m.i()).b(), this.l);
            }
            return new xr5(this.k, null);
        }

        private final long d() {
            jr5 jr5Var = this.l;
            c25.m(jr5Var);
            gq5 w = jr5Var.w();
            if (w.n() != -1) {
                return TimeUnit.SECONDS.toMillis(w.n());
            }
            Date date = this.e;
            if (date != null) {
                Date date2 = this.a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.c == null || this.l.T1().q().O() != null) {
                return 0L;
            } else {
                Date date3 = this.a;
                long time2 = date3 != null ? date3.getTime() : this.f;
                Date date4 = this.c;
                c25.m(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        private final boolean f(hr5 hr5Var) {
            return (hr5Var.i(sm4.q) == null && hr5Var.i(sm4.r) == null) ? false : true;
        }

        private final boolean g() {
            jr5 jr5Var = this.l;
            c25.m(jr5Var);
            return jr5Var.w().n() == -1 && this.e == null;
        }

        @NotNull
        public final xr5 b() {
            xr5 c = c();
            return (c.b() == null || !this.k.g().u()) ? c : new xr5(null, null);
        }

        @NotNull
        public final hr5 e() {
            return this.k;
        }
    }

    public xr5(@Nullable hr5 hr5Var, @Nullable jr5 jr5Var) {
        this.b = hr5Var;
        this.c = jr5Var;
    }

    @Nullable
    public final jr5 a() {
        return this.c;
    }

    @Nullable
    public final hr5 b() {
        return this.b;
    }
}