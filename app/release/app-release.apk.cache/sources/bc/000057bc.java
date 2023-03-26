package com.p7700g.p99005;

import com.p7700g.p99005.o95;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: Duration.kt */
@vo4(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0002\u0010&\u001a\u0018\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a \u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"!\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"!\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"!\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"!\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"!\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"!\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"!\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"!\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"!\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class q95 {
    public static final int a = 1000000;
    public static final long b = 4611686018426999999L;
    public static final long c = 4611686018427387903L;
    private static final long d = 4611686018426L;

    public static final long A(int i) {
        return m0(i, r95.MICROSECONDS);
    }

    public static final long B(long j) {
        return n0(j, r95.MICROSECONDS);
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void C(double d2) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void D(int i) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void E(long j) {
    }

    public static final long F(double d2) {
        return l0(d2, r95.MILLISECONDS);
    }

    public static final long G(int i) {
        return m0(i, r95.MILLISECONDS);
    }

    public static final long H(long j) {
        return n0(j, r95.MILLISECONDS);
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void I(double d2) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void J(int i) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void K(long j) {
    }

    public static final long L(double d2) {
        return l0(d2, r95.MINUTES);
    }

    public static final long M(int i) {
        return m0(i, r95.MINUTES);
    }

    public static final long N(long j) {
        return n0(j, r95.MINUTES);
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void O(double d2) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void P(int i) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void Q(long j) {
    }

    public static final long R(double d2) {
        return l0(d2, r95.NANOSECONDS);
    }

    public static final long S(int i) {
        return m0(i, r95.NANOSECONDS);
    }

    public static final long T(long j) {
        return n0(j, r95.NANOSECONDS);
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void U(double d2) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void V(int i) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void W(long j) {
    }

    public static final long X(double d2) {
        return l0(d2, r95.SECONDS);
    }

    public static final long Y(int i) {
        return m0(i, r95.SECONDS);
    }

    public static final long Z(long j) {
        return n0(j, r95.SECONDS);
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void a0(double d2) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void b0(int i) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void c0(long j) {
    }

    public static final long d0(long j) {
        return j * ((long) a);
    }

    public static final long e0(long j) {
        return j / ((long) a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x006c, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x014d, code lost:
        throw new java.lang.IllegalArgumentException(com.p7700g.p99005.wo1.t("Missing unit for value ", r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x009c A[LOOP:2: B:222:0x0070->B:233:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x00ab A[EDGE_INSN: B:356:0x00ab->B:235:0x00ab ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long f0(String str, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        String str2;
        long a1;
        int i2;
        boolean z4;
        long a12;
        boolean z5;
        int length = str.length();
        if (length != 0) {
            o95.a aVar = o95.s;
            long W = aVar.W();
            char charAt = str.charAt(0);
            int i3 = (charAt == '+' || charAt == '-') ? 1 : 0;
            boolean z6 = i3 > 0;
            boolean z7 = z6 && c95.d5(str, '-', false, 2, null);
            if (length > i3) {
                char c2 = '9';
                if (str.charAt(i3) == 'P') {
                    int i4 = i3 + 1;
                    if (i4 != length) {
                        boolean z8 = false;
                        r95 r95Var = null;
                        loop0: while (true) {
                            while (i4 < length) {
                                if (str.charAt(i4) != 'T') {
                                    int i5 = i4;
                                    char c3 = '0';
                                    while (true) {
                                        if (i5 >= str.length()) {
                                            i2 = length;
                                            z4 = z7;
                                            break;
                                        }
                                        char charAt2 = str.charAt(i5);
                                        z4 = z7;
                                        if (!new u45(c3, c2).o(charAt2)) {
                                            i2 = length;
                                            if (!c95.U2("+-.", charAt2, false, 2, null)) {
                                                z5 = false;
                                                if (z5) {
                                                    break;
                                                }
                                                i5++;
                                                c3 = '0';
                                                c2 = '9';
                                                z7 = z4;
                                                length = i2;
                                            }
                                        } else {
                                            i2 = length;
                                        }
                                        z5 = true;
                                        if (z5) {
                                        }
                                    }
                                    c25.n(str, "null cannot be cast to non-null type java.lang.String");
                                    String substring = str.substring(i4, i5);
                                    c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    if (!(substring.length() == 0)) {
                                        int length2 = substring.length() + i4;
                                        if (length2 < 0 || length2 > c95.i3(str)) {
                                            break;
                                        }
                                        i4 = length2 + 1;
                                        r95 f = u95.f(str.charAt(length2), z8);
                                        if (r95Var != null && r95Var.compareTo(f) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int q3 = c95.q3(substring, '.', 0, false, 6, null);
                                        if (f == r95.SECONDS && q3 > 0) {
                                            c25.n(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring2 = substring.substring(0, q3);
                                            c25.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            long a13 = o95.a1(W, n0(g0(substring2), f));
                                            c25.n(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring3 = substring.substring(q3);
                                            c25.o(substring3, "this as java.lang.String).substring(startIndex)");
                                            a12 = o95.a1(a13, l0(Double.parseDouble(substring3), f));
                                        } else {
                                            a12 = o95.a1(W, n0(g0(substring), f));
                                        }
                                        W = a12;
                                        c2 = '9';
                                        r95Var = f;
                                        z7 = z4;
                                        length = i2;
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                } else if (z8 || (i4 = i4 + 1) == length) {
                                    break loop0;
                                } else {
                                    z8 = true;
                                }
                            }
                            z2 = z7;
                            break loop0;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                z2 = z7;
                if (!z) {
                    String str3 = "Unexpected order of duration components";
                    if (b95.d2(str, i3, "Infinity", 0, Math.max(length - i3, 8), true)) {
                        W = aVar.q();
                    } else {
                        boolean z9 = !z6;
                        if (z6 && str.charAt(i3) == '(' && e95.t7(str) == ')') {
                            i3++;
                            int i6 = length - 1;
                            if (i3 == i6) {
                                throw new IllegalArgumentException("No components");
                            }
                            i = i6;
                            z9 = true;
                        } else {
                            i = length;
                        }
                        boolean z10 = false;
                        long j = W;
                        r95 r95Var2 = null;
                        while (i3 < i) {
                            if (z10 && z9) {
                                while (i3 < str.length()) {
                                    if (!(str.charAt(i3) == ' ')) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            int i7 = i3;
                            while (i7 < str.length()) {
                                char charAt3 = str.charAt(i7);
                                if (!(new u45('0', '9').o(charAt3) || charAt3 == '.')) {
                                    break;
                                }
                                i7++;
                            }
                            c25.n(str, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str.substring(i3, i7);
                            c25.o(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (!(substring4.length() == 0)) {
                                int length3 = substring4.length() + i3;
                                int i8 = length3;
                                while (true) {
                                    if (i8 >= str.length()) {
                                        z3 = z9;
                                        break;
                                    }
                                    z3 = z9;
                                    if (!new u45('a', 'z').o(str.charAt(i8))) {
                                        break;
                                    }
                                    i8++;
                                    z9 = z3;
                                }
                                c25.n(str, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str.substring(length3, i8);
                                c25.o(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                i3 = substring5.length() + length3;
                                r95 g = u95.g(substring5);
                                if (r95Var2 != null && r95Var2.compareTo(g) <= 0) {
                                    throw new IllegalArgumentException(str3);
                                }
                                int q32 = c95.q3(substring4, '.', 0, false, 6, null);
                                if (q32 > 0) {
                                    c25.n(substring4, "null cannot be cast to non-null type java.lang.String");
                                    String substring6 = substring4.substring(0, q32);
                                    c25.o(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str2 = str3;
                                    long a14 = o95.a1(j, n0(Long.parseLong(substring6), g));
                                    c25.n(substring4, "null cannot be cast to non-null type java.lang.String");
                                    String substring7 = substring4.substring(q32);
                                    c25.o(substring7, "this as java.lang.String).substring(startIndex)");
                                    a1 = o95.a1(a14, l0(Double.parseDouble(substring7), g));
                                    if (i3 < i) {
                                        throw new IllegalArgumentException("Fractional component must be last");
                                    }
                                } else {
                                    str2 = str3;
                                    a1 = o95.a1(j, n0(Long.parseLong(substring4), g));
                                }
                                j = a1;
                                z10 = true;
                                r95Var2 = g;
                                str3 = str2;
                                z9 = z3;
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        W = j;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                return z2 ? o95.T1(W) : W;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    private static final long g0(String str) {
        boolean z;
        int length = str.length();
        int i = (length <= 0 || !c95.U2("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i > 16) {
            c55 c55Var = new c55(i, c95.i3(str));
            if (!(c55Var instanceof Collection) || !((Collection) c55Var).isEmpty()) {
                Iterator<Integer> it = c55Var.iterator();
                while (it.hasNext()) {
                    if (!new u45('0', '9').o(str.charAt(((ft4) it).b()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        if (b95.u2(str, ya2.z, false, 2, null)) {
            str = e95.A6(str, 1);
        }
        return Long.parseLong(str);
    }

    private static final int h0(String str, int i, f05<? super Character, Boolean> f05Var) {
        while (i < str.length() && f05Var.M(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    public static final long i(long j, int i) {
        return o95.i((j << 1) + i);
    }

    private static final String i0(String str, int i, f05<? super Character, Boolean> f05Var) {
        int i2 = i;
        while (i2 < str.length() && f05Var.M(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        c25.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final long j(long j) {
        return o95.i((j << 1) + 1);
    }

    @dr4(markerClass = {v95.class})
    @dx4
    @tp4(version = "1.6")
    private static final long j0(double d2, long j) {
        return o95.c1(j, d2);
    }

    public static final long k(long j) {
        if (new f55(-4611686018426L, d).o(j)) {
            return l(d0(j));
        }
        return j(i55.D(j, -4611686018427387903L, c));
    }

    @dr4(markerClass = {v95.class})
    @dx4
    @tp4(version = "1.6")
    private static final long k0(int i, long j) {
        return o95.d1(j, i);
    }

    public static final long l(long j) {
        return o95.i(j << 1);
    }

    @dr4(markerClass = {v95.class})
    @tp4(version = "1.6")
    public static final long l0(double d2, @NotNull r95 r95Var) {
        c25.p(r95Var, "unit");
        double a2 = t95.a(d2, r95Var, r95.NANOSECONDS);
        if (!Double.isNaN(a2)) {
            long K0 = a45.K0(a2);
            if (new f55(-4611686018426999999L, b).o(K0)) {
                return l(K0);
            }
            return k(a45.K0(t95.a(d2, r95Var, r95.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long m(long j) {
        if (new f55(-4611686018426999999L, b).o(j)) {
            return l(j);
        }
        return j(e0(j));
    }

    @dr4(markerClass = {v95.class})
    @tp4(version = "1.6")
    public static final long m0(int i, @NotNull r95 r95Var) {
        c25.p(r95Var, "unit");
        if (r95Var.compareTo(r95.SECONDS) <= 0) {
            return l(t95.c(i, r95Var, r95.NANOSECONDS));
        }
        return n0(i, r95Var);
    }

    public static final long n(double d2) {
        return l0(d2, r95.DAYS);
    }

    @dr4(markerClass = {v95.class})
    @tp4(version = "1.6")
    public static final long n0(long j, @NotNull r95 r95Var) {
        c25.p(r95Var, "unit");
        r95 r95Var2 = r95.NANOSECONDS;
        long c2 = t95.c(b, r95Var2, r95Var);
        if (new f55(-c2, c2).o(j)) {
            return l(t95.c(j, r95Var, r95Var2));
        }
        return j(i55.D(t95.b(j, r95Var, r95.MILLISECONDS), -4611686018427387903L, c));
    }

    public static final long o(int i) {
        return m0(i, r95.DAYS);
    }

    public static final long p(long j) {
        return n0(j, r95.DAYS);
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void q(double d2) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void r(int i) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void s(long j) {
    }

    public static final long t(double d2) {
        return l0(d2, r95.HOURS);
    }

    public static final long u(int i) {
        return m0(i, r95.HOURS);
    }

    public static final long v(long j) {
        return n0(j, r95.HOURS);
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void w(double d2) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void x(int i) {
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @v95
    @tp4(version = "1.3")
    public static /* synthetic */ void y(long j) {
    }

    public static final long z(double d2) {
        return l0(d2, r95.MICROSECONDS);
    }
}