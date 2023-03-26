package com.p7700g.p99005;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: Regex.kt */
@vo4(d1 = {"\u0000>\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082\b\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0002¨\u0006\u0014"}, d2 = {"fromInt", "", "T", "Lkotlin/text/FlagEnum;", "", "value", "", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "from", "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "toInt", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class p85 {

    /* compiled from: Regex.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "Lkotlin/text/FlagEnum;", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements f05<T, Boolean> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.t = i;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Boolean M(Enum r3) {
            i85 i85Var = (i85) r3;
            return Boolean.valueOf((this.t & i85Var.f()) == i85Var.getValue());
        }
    }

    public static final /* synthetic */ m85 a(Matcher matcher, int i, CharSequence charSequence) {
        return f(matcher, i, charSequence);
    }

    public static final /* synthetic */ c55 c(MatchResult matchResult) {
        return i(matchResult);
    }

    public static final /* synthetic */ c55 d(MatchResult matchResult, int i) {
        return j(matchResult, i);
    }

    public static final m85 f(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new n85(matcher, charSequence);
        }
        return null;
    }

    private static final /* synthetic */ <T extends Enum<T> & i85> Set<T> g(int i) {
        c25.y(4, "T");
        EnumSet allOf = EnumSet.allOf(Enum.class);
        c25.o(allOf, "");
        c25.w();
        os4.N0(allOf, new a(i));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        c25.o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    public static final m85 h(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new n85(matcher, charSequence);
        }
        return null;
    }

    public static final c55 i(MatchResult matchResult) {
        return i55.z1(matchResult.start(), matchResult.end());
    }

    public static final c55 j(MatchResult matchResult, int i) {
        return i55.z1(matchResult.start(i), matchResult.end(i));
    }

    public static final int k(Iterable<? extends i85> iterable) {
        int i = 0;
        for (i85 i85Var : iterable) {
            i |= i85Var.getValue();
        }
        return i;
    }
}