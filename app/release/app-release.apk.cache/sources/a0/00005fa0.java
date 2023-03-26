package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: DurationUnit.kt */
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0001¨\u0006\t"}, d2 = {"durationUnitByIsoChar", "Lkotlin/time/DurationUnit;", "isoChar", "", "isTimeComponent", "", "durationUnitByShortName", "shortName", "", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes3.dex */
public class u95 extends t95 {

    /* compiled from: DurationUnit.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            r95.values();
            int[] iArr = new int[7];
            iArr[r95.NANOSECONDS.ordinal()] = 1;
            iArr[r95.MICROSECONDS.ordinal()] = 2;
            iArr[r95.MILLISECONDS.ordinal()] = 3;
            iArr[r95.SECONDS.ordinal()] = 4;
            iArr[r95.MINUTES.ordinal()] = 5;
            iArr[r95.HOURS.ordinal()] = 6;
            iArr[r95.DAYS.ordinal()] = 7;
            a = iArr;
        }
    }

    @tp4(version = "1.5")
    @NotNull
    public static final r95 f(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return r95.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        } else if (c == 'H') {
            return r95.HOURS;
        } else {
            if (c == 'M') {
                return r95.MINUTES;
            }
            if (c == 'S') {
                return r95.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
        }
    }

    @tp4(version = "1.5")
    @NotNull
    public static final r95 g(@NotNull String str) {
        c25.p(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return r95.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return r95.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return r95.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return r95.SECONDS;
                    }
                } else if (str.equals(com.anythink.expressad.d.a.b.dH)) {
                    return r95.MINUTES;
                }
            } else if (str.equals("h")) {
                return r95.HOURS;
            }
        } else if (str.equals("d")) {
            return r95.DAYS;
        }
        throw new IllegalArgumentException(wo1.t("Unknown duration unit short name: ", str));
    }

    @tp4(version = "1.3")
    @NotNull
    public static final String h(@NotNull r95 r95Var) {
        c25.p(r95Var, "<this>");
        switch (r95Var.ordinal()) {
            case 0:
                return "ns";
            case 1:
                return "us";
            case 2:
                return "ms";
            case 3:
                return "s";
            case 4:
                return com.anythink.expressad.d.a.b.dH;
            case 5:
                return "h";
            case 6:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + r95Var).toString());
        }
    }
}