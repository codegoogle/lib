package com.p7700g.p99005;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: DurationUnitJvm.kt */
@vo4(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"convertDurationUnit", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "", "convertDurationUnitOverflow", "toDurationUnit", "Ljava/util/concurrent/TimeUnit;", "toTimeUnit", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes3.dex */
public class t95 {

    /* compiled from: DurationUnitJvm.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            iArr[TimeUnit.SECONDS.ordinal()] = 4;
            iArr[TimeUnit.MINUTES.ordinal()] = 5;
            iArr[TimeUnit.HOURS.ordinal()] = 6;
            iArr[TimeUnit.DAYS.ordinal()] = 7;
            a = iArr;
        }
    }

    @tp4(version = "1.3")
    public static final double a(double d, @NotNull r95 r95Var, @NotNull r95 r95Var2) {
        c25.p(r95Var, "sourceUnit");
        c25.p(r95Var2, "targetUnit");
        long convert = r95Var2.g().convert(1L, r95Var.g());
        return convert > 0 ? d * convert : d / r95Var.g().convert(1L, r95Var2.g());
    }

    @tp4(version = "1.5")
    public static final long b(long j, @NotNull r95 r95Var, @NotNull r95 r95Var2) {
        c25.p(r95Var, "sourceUnit");
        c25.p(r95Var2, "targetUnit");
        return r95Var2.g().convert(j, r95Var.g());
    }

    @tp4(version = "1.5")
    public static final long c(long j, @NotNull r95 r95Var, @NotNull r95 r95Var2) {
        c25.p(r95Var, "sourceUnit");
        c25.p(r95Var2, "targetUnit");
        return r95Var2.g().convert(j, r95Var.g());
    }

    @v95
    @tp4(version = "1.6")
    @NotNull
    public static final r95 d(@NotNull TimeUnit timeUnit) {
        c25.p(timeUnit, "<this>");
        switch (a.a[timeUnit.ordinal()]) {
            case 1:
                return r95.NANOSECONDS;
            case 2:
                return r95.MICROSECONDS;
            case 3:
                return r95.MILLISECONDS;
            case 4:
                return r95.SECONDS;
            case 5:
                return r95.MINUTES;
            case 6:
                return r95.HOURS;
            case 7:
                return r95.DAYS;
            default:
                throw new wo4();
        }
    }

    @v95
    @tp4(version = "1.6")
    @NotNull
    public static final TimeUnit e(@NotNull r95 r95Var) {
        c25.p(r95Var, "<this>");
        return r95Var.g();
    }
}