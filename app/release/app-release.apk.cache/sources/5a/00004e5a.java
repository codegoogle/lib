package com.p7700g.p99005;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* loaded from: classes3.dex */
public class ld2 {
    private static final ld2 a = new ld2(null, null);
    @z1
    private final Long b;
    @z1
    private final TimeZone c;

    private ld2(@z1 Long l, @z1 TimeZone timeZone) {
        this.b = l;
        this.c = timeZone;
    }

    public static ld2 a(long j) {
        return new ld2(Long.valueOf(j), null);
    }

    public static ld2 b(long j, @z1 TimeZone timeZone) {
        return new ld2(Long.valueOf(j), timeZone);
    }

    public static ld2 e() {
        return a;
    }

    public Calendar c() {
        return d(this.c);
    }

    public Calendar d(@z1 TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.b;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}