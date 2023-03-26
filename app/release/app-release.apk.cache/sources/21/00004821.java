package com.p7700g.p99005;

import android.net.Uri;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class ib0 {
    public static final ib0 a = new a().b();
    @z30(name = "required_network_type")
    private ub0 b;
    @z30(name = "requires_charging")
    private boolean c;
    @z30(name = "requires_device_idle")
    private boolean d;
    @z30(name = "requires_battery_not_low")
    private boolean e;
    @z30(name = "requires_storage_not_low")
    private boolean f;
    @z30(name = "trigger_content_update_delay")
    private long g;
    @z30(name = "trigger_max_content_delay")
    private long h;
    @z30(name = "content_uri_triggers")
    private jb0 i;

    @i2({i2.a.LIBRARY_GROUP})
    public ib0() {
        this.b = ub0.NOT_REQUIRED;
        this.g = -1L;
        this.h = -1L;
        this.i = new jb0();
    }

    @e2(24)
    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public jb0 a() {
        return this.i;
    }

    @x1
    public ub0 b() {
        return this.b;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public long c() {
        return this.g;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public long d() {
        return this.h;
    }

    @e2(24)
    @i2({i2.a.LIBRARY_GROUP})
    public boolean e() {
        return this.i.c() > 0;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || ib0.class != o.getClass()) {
            return false;
        }
        ib0 ib0Var = (ib0) o;
        if (this.c == ib0Var.c && this.d == ib0Var.d && this.e == ib0Var.e && this.f == ib0Var.f && this.g == ib0Var.g && this.h == ib0Var.h && this.b == ib0Var.b) {
            return this.i.equals(ib0Var.i);
        }
        return false;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.c;
    }

    @e2(23)
    public boolean h() {
        return this.d;
    }

    public int hashCode() {
        long j = this.g;
        long j2 = this.h;
        return this.i.hashCode() + (((((((((((((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public boolean i() {
        return this.f;
    }

    @e2(24)
    @i2({i2.a.LIBRARY_GROUP})
    public void j(@z1 jb0 mContentUriTriggers) {
        this.i = mContentUriTriggers;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void k(@x1 ub0 requiredNetworkType) {
        this.b = requiredNetworkType;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void l(boolean requiresBatteryNotLow) {
        this.e = requiresBatteryNotLow;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void m(boolean requiresCharging) {
        this.c = requiresCharging;
    }

    @e2(23)
    @i2({i2.a.LIBRARY_GROUP})
    public void n(boolean requiresDeviceIdle) {
        this.d = requiresDeviceIdle;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void o(boolean requiresStorageNotLow) {
        this.f = requiresStorageNotLow;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void p(long triggerContentUpdateDelay) {
        this.g = triggerContentUpdateDelay;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void q(long triggerMaxContentDelay) {
        this.h = triggerMaxContentDelay;
    }

    public ib0(a builder) {
        this.b = ub0.NOT_REQUIRED;
        this.g = -1L;
        this.h = -1L;
        this.i = new jb0();
        this.c = builder.a;
        int i = Build.VERSION.SDK_INT;
        this.d = i >= 23 && builder.b;
        this.b = builder.c;
        this.e = builder.d;
        this.f = builder.e;
        if (i >= 24) {
            this.i = builder.h;
            this.g = builder.f;
            this.h = builder.g;
        }
    }

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static final class a {
        public boolean a;
        public boolean b;
        public ub0 c;
        public boolean d;
        public boolean e;
        public long f;
        public long g;
        public jb0 h;

        public a() {
            this.a = false;
            this.b = false;
            this.c = ub0.NOT_REQUIRED;
            this.d = false;
            this.e = false;
            this.f = -1L;
            this.g = -1L;
            this.h = new jb0();
        }

        @e2(24)
        @x1
        public a a(@x1 Uri uri, boolean triggerForDescendants) {
            this.h.a(uri, triggerForDescendants);
            return this;
        }

        @x1
        public ib0 b() {
            return new ib0(this);
        }

        @x1
        public a c(@x1 ub0 networkType) {
            this.c = networkType;
            return this;
        }

        @x1
        public a d(boolean requiresBatteryNotLow) {
            this.d = requiresBatteryNotLow;
            return this;
        }

        @x1
        public a e(boolean requiresCharging) {
            this.a = requiresCharging;
            return this;
        }

        @e2(23)
        @x1
        public a f(boolean requiresDeviceIdle) {
            this.b = requiresDeviceIdle;
            return this;
        }

        @x1
        public a g(boolean requiresStorageNotLow) {
            this.e = requiresStorageNotLow;
            return this;
        }

        @e2(24)
        @x1
        public a h(long duration, @x1 TimeUnit timeUnit) {
            this.g = timeUnit.toMillis(duration);
            return this;
        }

        @e2(26)
        @x1
        public a i(Duration duration) {
            this.g = duration.toMillis();
            return this;
        }

        @e2(24)
        @x1
        public a j(long duration, @x1 TimeUnit timeUnit) {
            this.f = timeUnit.toMillis(duration);
            return this;
        }

        @e2(26)
        @x1
        public a k(Duration duration) {
            this.f = duration.toMillis();
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP})
        public a(@x1 ib0 constraints) {
            boolean z = false;
            this.a = false;
            this.b = false;
            this.c = ub0.NOT_REQUIRED;
            this.d = false;
            this.e = false;
            this.f = -1L;
            this.g = -1L;
            this.h = new jb0();
            this.a = constraints.g();
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && constraints.h()) {
                z = true;
            }
            this.b = z;
            this.c = constraints.b();
            this.d = constraints.f();
            this.e = constraints.i();
            if (i >= 24) {
                this.f = constraints.c();
                this.g = constraints.d();
                this.h = constraints.a();
            }
        }
    }

    public ib0(@x1 ib0 other) {
        this.b = ub0.NOT_REQUIRED;
        this.g = -1L;
        this.h = -1L;
        this.i = new jb0();
        this.c = other.c;
        this.d = other.d;
        this.b = other.b;
        this.e = other.e;
        this.f = other.f;
        this.i = other.i;
    }
}