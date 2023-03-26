package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import com.p7700g.p99005.j55;
import com.p7700g.p99005.m55;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: _URanges.kt */
@vo4(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\r\u001a&\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\nø\u0001\u0000¢\u0006\u0002\b*\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\nø\u0001\u0000¢\u0006\u0002\b4\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u001f\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u0014\u0010C\u001a\u00020\u0005*\u000208H\u0007ø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u0014\u0010C\u001a\u00020\b*\u00020>H\u0007ø\u0001\u0000¢\u0006\u0002\u0010E\u001a\u0011\u0010F\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007ø\u0001\u0000\u001a\u0011\u0010F\u001a\u0004\u0018\u00010\b*\u00020>H\u0007ø\u0001\u0000\u001a\u0014\u0010G\u001a\u00020\u0005*\u000208H\u0007ø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u0014\u0010G\u001a\u00020\b*\u00020>H\u0007ø\u0001\u0000¢\u0006\u0002\u0010E\u001a\u0011\u0010H\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007ø\u0001\u0000\u001a\u0011\u0010H\u001a\u0004\u0018\u00010\b*\u00020>H\u0007ø\u0001\u0000\u001a\u0015\u0010I\u001a\u00020\u0005*\u00020%H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010J\u001a\u001c\u0010I\u001a\u00020\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000¢\u0006\u0002\u0010L\u001a\u0015\u0010I\u001a\u00020\b*\u00020/H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010M\u001a\u001c\u0010I\u001a\u00020\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000¢\u0006\u0002\u0010N\u001a\u0012\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\bø\u0001\u0000\u001a\u0019\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000\u001a\u0012\u0010O\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\bø\u0001\u0000\u001a\u0019\u0010O\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000\u001a\f\u0010P\u001a\u000208*\u000208H\u0007\u001a\f\u0010P\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010Q\u001a\u000208*\u0002082\u0006\u0010Q\u001a\u00020RH\u0087\u0004\u001a\u0015\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010Q\u001a\u00020SH\u0087\u0004\u001a\u001f\u0010T\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u001f\u0010T\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\u001f\u0010T\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a\u001f\u0010T\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", aa.h.d, "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "first", "(Lkotlin/ranges/UIntProgression;)I", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes3.dex */
public class q55 {
    @tp4(version = "1.7")
    public static final int A(@NotNull j55 j55Var) {
        c25.p(j55Var, "<this>");
        if (!j55Var.isEmpty()) {
            return j55Var.e();
        }
        throw new NoSuchElementException("Progression " + j55Var + " is empty.");
    }

    @tp4(version = "1.7")
    public static final long B(@NotNull m55 m55Var) {
        c25.p(m55Var, "<this>");
        if (!m55Var.isEmpty()) {
            return m55Var.e();
        }
        throw new NoSuchElementException("Progression " + m55Var + " is empty.");
    }

    @tp4(version = "1.7")
    @Nullable
    public static final jq4 C(@NotNull j55 j55Var) {
        c25.p(j55Var, "<this>");
        if (j55Var.isEmpty()) {
            return null;
        }
        return jq4.b(j55Var.e());
    }

    @tp4(version = "1.7")
    @Nullable
    public static final nq4 D(@NotNull m55 m55Var) {
        c25.p(m55Var, "<this>");
        if (m55Var.isEmpty()) {
            return null;
        }
        return nq4.b(m55Var.e());
    }

    @tp4(version = "1.7")
    public static final int E(@NotNull j55 j55Var) {
        c25.p(j55Var, "<this>");
        if (!j55Var.isEmpty()) {
            return j55Var.h();
        }
        throw new NoSuchElementException("Progression " + j55Var + " is empty.");
    }

    @tp4(version = "1.7")
    public static final long F(@NotNull m55 m55Var) {
        c25.p(m55Var, "<this>");
        if (!m55Var.isEmpty()) {
            return m55Var.h();
        }
        throw new NoSuchElementException("Progression " + m55Var + " is empty.");
    }

    @tp4(version = "1.7")
    @Nullable
    public static final jq4 G(@NotNull j55 j55Var) {
        c25.p(j55Var, "<this>");
        if (j55Var.isEmpty()) {
            return null;
        }
        return jq4.b(j55Var.h());
    }

    @tp4(version = "1.7")
    @Nullable
    public static final nq4 H(@NotNull m55 m55Var) {
        c25.p(m55Var, "<this>");
        if (m55Var.isEmpty()) {
            return null;
        }
        return nq4.b(m55Var.h());
    }

    @dr4(markerClass = {go4.class})
    @dx4
    @tp4(version = "1.5")
    private static final int I(l55 l55Var) {
        c25.p(l55Var, "<this>");
        return J(l55Var, n45.s);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final int J(@NotNull l55 l55Var, @NotNull n45 n45Var) {
        c25.p(l55Var, "<this>");
        c25.p(n45Var, "random");
        try {
            return p45.h(n45Var, l55Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @dr4(markerClass = {go4.class})
    @dx4
    @tp4(version = "1.5")
    private static final long K(o55 o55Var) {
        c25.p(o55Var, "<this>");
        return L(o55Var, n45.s);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final long L(@NotNull o55 o55Var, @NotNull n45 n45Var) {
        c25.p(o55Var, "<this>");
        c25.p(n45Var, "random");
        try {
            return p45.l(n45Var, o55Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @dr4(markerClass = {fo4.class, go4.class})
    @dx4
    @tp4(version = "1.5")
    private static final jq4 M(l55 l55Var) {
        c25.p(l55Var, "<this>");
        return N(l55Var, n45.s);
    }

    @dr4(markerClass = {fo4.class, go4.class})
    @tp4(version = "1.5")
    @Nullable
    public static final jq4 N(@NotNull l55 l55Var, @NotNull n45 n45Var) {
        c25.p(l55Var, "<this>");
        c25.p(n45Var, "random");
        if (l55Var.isEmpty()) {
            return null;
        }
        return jq4.b(p45.h(n45Var, l55Var));
    }

    @dr4(markerClass = {fo4.class, go4.class})
    @dx4
    @tp4(version = "1.5")
    private static final nq4 O(o55 o55Var) {
        c25.p(o55Var, "<this>");
        return P(o55Var, n45.s);
    }

    @dr4(markerClass = {fo4.class, go4.class})
    @tp4(version = "1.5")
    @Nullable
    public static final nq4 P(@NotNull o55 o55Var, @NotNull n45 n45Var) {
        c25.p(o55Var, "<this>");
        c25.p(n45Var, "random");
        if (o55Var.isEmpty()) {
            return null;
        }
        return nq4.b(p45.l(n45Var, o55Var));
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final j55 Q(@NotNull j55 j55Var) {
        c25.p(j55Var, "<this>");
        return j55.s.a(j55Var.h(), j55Var.e(), -j55Var.i());
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final m55 R(@NotNull m55 m55Var) {
        c25.p(m55Var, "<this>");
        return m55.s.a(m55Var.h(), m55Var.e(), -m55Var.i());
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final j55 S(@NotNull j55 j55Var, int i) {
        c25.p(j55Var, "<this>");
        h55.a(i > 0, Integer.valueOf(i));
        j55.a aVar = j55.s;
        int e = j55Var.e();
        int h = j55Var.h();
        if (j55Var.i() <= 0) {
            i = -i;
        }
        return aVar.a(e, h, i);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final m55 T(@NotNull m55 m55Var, long j) {
        c25.p(m55Var, "<this>");
        h55.a(j > 0, Long.valueOf(j));
        m55.a aVar = m55.s;
        long e = m55Var.e();
        long h = m55Var.h();
        if (m55Var.i() <= 0) {
            j = -j;
        }
        return aVar.a(e, h, j);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final l55 U(short s, short s2) {
        int i = s2 & tq4.u;
        return c25.t(i, 0) <= 0 ? l55.w.a() : new l55(jq4.h(s & tq4.u), jq4.h(jq4.h(i) - 1), null);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final l55 V(int i, int i2) {
        return br4.c(i2, 0) <= 0 ? l55.w.a() : new l55(i, jq4.h(i2 - 1), null);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final l55 W(byte b, byte b2) {
        int i = b2 & 255;
        return c25.t(i, 0) <= 0 ? l55.w.a() : new l55(jq4.h(b & 255), jq4.h(jq4.h(i) - 1), null);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final o55 X(long j, long j2) {
        return br4.g(j2, 0L) <= 0 ? o55.w.a() : new o55(j, nq4.h(j2 - nq4.h(1 & 4294967295L)), null);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final short a(short s, short s2) {
        return c25.t(s & tq4.u, 65535 & s2) < 0 ? s2 : s;
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final int b(int i, int i2) {
        return br4.c(i, i2) < 0 ? i2 : i;
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final byte c(byte b, byte b2) {
        return c25.t(b & 255, b2 & 255) < 0 ? b2 : b;
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final long d(long j, long j2) {
        return br4.g(j, j2) < 0 ? j2 : j;
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final short e(short s, short s2) {
        return c25.t(s & tq4.u, 65535 & s2) > 0 ? s2 : s;
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final int f(int i, int i2) {
        return br4.c(i, i2) > 0 ? i2 : i;
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final byte g(byte b, byte b2) {
        return c25.t(b & 255, b2 & 255) > 0 ? b2 : b;
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final long h(long j, long j2) {
        return br4.g(j, j2) > 0 ? j2 : j;
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final long i(long j, @NotNull y45<nq4> y45Var) {
        c25.p(y45Var, "range");
        if (y45Var instanceof x45) {
            return ((nq4) i55.G(nq4.b(j), (x45) y45Var)).n1();
        }
        if (!y45Var.isEmpty()) {
            return br4.g(j, y45Var.c().n1()) < 0 ? y45Var.c().n1() : br4.g(j, y45Var.d().n1()) > 0 ? y45Var.d().n1() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + y45Var + '.');
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final short j(short s, short s2, short s3) {
        int i = s2 & tq4.u;
        int i2 = s3 & tq4.u;
        if (c25.t(i, i2) <= 0) {
            int i3 = 65535 & s;
            return c25.t(i3, i) < 0 ? s2 : c25.t(i3, i2) > 0 ? s3 : s;
        }
        StringBuilder G = wo1.G("Cannot coerce value to an empty range: maximum ");
        G.append((Object) tq4.w0(s3));
        G.append(" is less than minimum ");
        G.append((Object) tq4.w0(s2));
        G.append('.');
        throw new IllegalArgumentException(G.toString());
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final int k(int i, int i2, int i3) {
        if (br4.c(i2, i3) <= 0) {
            return br4.c(i, i2) < 0 ? i2 : br4.c(i, i3) > 0 ? i3 : i;
        }
        StringBuilder G = wo1.G("Cannot coerce value to an empty range: maximum ");
        G.append((Object) jq4.X0(i3));
        G.append(" is less than minimum ");
        G.append((Object) jq4.X0(i2));
        G.append('.');
        throw new IllegalArgumentException(G.toString());
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final byte l(byte b, byte b2, byte b3) {
        int i = b2 & 255;
        int i2 = b3 & 255;
        if (c25.t(i, i2) <= 0) {
            int i3 = b & 255;
            return c25.t(i3, i) < 0 ? b2 : c25.t(i3, i2) > 0 ? b3 : b;
        }
        StringBuilder G = wo1.G("Cannot coerce value to an empty range: maximum ");
        G.append((Object) fq4.w0(b3));
        G.append(" is less than minimum ");
        G.append((Object) fq4.w0(b2));
        G.append('.');
        throw new IllegalArgumentException(G.toString());
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final long m(long j, long j2, long j3) {
        if (br4.g(j2, j3) <= 0) {
            return br4.g(j, j2) < 0 ? j2 : br4.g(j, j3) > 0 ? j3 : j;
        }
        StringBuilder G = wo1.G("Cannot coerce value to an empty range: maximum ");
        G.append((Object) nq4.X0(j3));
        G.append(" is less than minimum ");
        G.append((Object) nq4.X0(j2));
        G.append('.');
        throw new IllegalArgumentException(G.toString());
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final int n(int i, @NotNull y45<jq4> y45Var) {
        c25.p(y45Var, "range");
        if (y45Var instanceof x45) {
            return ((jq4) i55.G(jq4.b(i), (x45) y45Var)).n1();
        }
        if (!y45Var.isEmpty()) {
            return br4.c(i, y45Var.c().n1()) < 0 ? y45Var.c().n1() : br4.c(i, y45Var.d().n1()) > 0 ? y45Var.d().n1() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + y45Var + '.');
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final boolean o(@NotNull l55 l55Var, byte b) {
        c25.p(l55Var, "$this$contains");
        return l55Var.n(jq4.h(b & 255));
    }

    @dr4(markerClass = {go4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean p(o55 o55Var, nq4 nq4Var) {
        c25.p(o55Var, "$this$contains");
        return nq4Var != null && o55Var.n(nq4Var.n1());
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final boolean q(@NotNull o55 o55Var, int i) {
        c25.p(o55Var, "$this$contains");
        return o55Var.n(nq4.h(i & 4294967295L));
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final boolean r(@NotNull o55 o55Var, byte b) {
        c25.p(o55Var, "$this$contains");
        return o55Var.n(nq4.h(b & 255));
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final boolean s(@NotNull l55 l55Var, short s) {
        c25.p(l55Var, "$this$contains");
        return l55Var.n(jq4.h(s & tq4.u));
    }

    @dr4(markerClass = {go4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean t(l55 l55Var, jq4 jq4Var) {
        c25.p(l55Var, "$this$contains");
        return jq4Var != null && l55Var.n(jq4Var.n1());
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final boolean u(@NotNull l55 l55Var, long j) {
        c25.p(l55Var, "$this$contains");
        return nq4.h(j >>> 32) == 0 && l55Var.n(jq4.h((int) j));
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    public static final boolean v(@NotNull o55 o55Var, short s) {
        c25.p(o55Var, "$this$contains");
        return o55Var.n(nq4.h(s & av5.s));
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final j55 w(short s, short s2) {
        return j55.s.a(jq4.h(s & tq4.u), jq4.h(s2 & tq4.u), -1);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final j55 x(int i, int i2) {
        return j55.s.a(i, i2, -1);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final j55 y(byte b, byte b2) {
        return j55.s.a(jq4.h(b & 255), jq4.h(b2 & 255), -1);
    }

    @dr4(markerClass = {go4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final m55 z(long j, long j2) {
        return m55.s.a(j, j2, -1L);
    }
}