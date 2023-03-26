package com.p7700g.p99005;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Regex.kt */
@vo4(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 02\u00060\u0001j\u0002`\u0002:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0004J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\"\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170%J\u0016\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u0016\u0010'\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bJ \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bH\u0007J\u0006\u0010,\u001a\u00020\rJ\b\u0010-\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020/H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00062"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchAt", la1.l, "matchEntire", "matches", "matchesAt", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "splitToSequence", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class o85 implements Serializable {
    @NotNull
    public static final a s = new a(null);
    @NotNull
    private final Pattern t;
    @Nullable
    private Set<? extends q85> u;

    /* compiled from: Regex.kt */
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @NotNull
        public final String c(@NotNull String str) {
            c25.p(str, "literal");
            String quote = Pattern.quote(str);
            c25.o(quote, "quote(literal)");
            return quote;
        }

        @NotNull
        public final String d(@NotNull String str) {
            c25.p(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            c25.o(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }

        @NotNull
        public final o85 e(@NotNull String str) {
            c25.p(str, "literal");
            return new o85(str, q85.LITERAL);
        }
    }

    /* compiled from: Regex.kt */
    @vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Serializable {
        @NotNull
        public static final a s = new a(null);
        private static final long t = 0;
        @NotNull
        private final String u;
        private final int v;

        /* compiled from: Regex.kt */
        @vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(@NotNull String str, int i) {
            c25.p(str, "pattern");
            this.u = str;
            this.v = i;
        }

        private final Object h() {
            Pattern compile = Pattern.compile(this.u, this.v);
            c25.o(compile, "compile(pattern, flags)");
            return new o85(compile);
        }

        public final int f() {
            return this.v;
        }

        @NotNull
        public final String g() {
            return this.u;
        }
    }

    /* compiled from: Regex.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements uz4<m85> {
        public final /* synthetic */ CharSequence u;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence, int i) {
            super(0);
            this.u = charSequence;
            this.v = i;
        }

        @Override // com.p7700g.p99005.uz4
        @Nullable
        /* renamed from: h */
        public final m85 x() {
            return o85.this.c(this.u, this.v);
        }
    }

    /* compiled from: Regex.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class d extends y15 implements f05<m85, m85> {
        public static final d B = new d();

        public d() {
            super(1, m85.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: K4 */
        public final m85 M(@NotNull m85 m85Var) {
            c25.p(m85Var, "p0");
            return m85Var.next();
        }
    }

    /* compiled from: Regex.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "Lkotlin/text/FlagEnum;", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "kotlin/text/RegexKt$fromInt$1$1"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends e25 implements f05<q85, Boolean> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i) {
            super(1);
            this.t = i;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Boolean M(q85 q85Var) {
            q85 q85Var2 = q85Var;
            return Boolean.valueOf((this.t & q85Var2.f()) == q85Var2.getValue());
        }
    }

    /* compiled from: Regex.kt */
    @mw4(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {276, 284, com.anythink.expressad.foundation.g.a.aW}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends rw4 implements j05<i75<? super String>, uv4<? super yq4>, Object> {
        public final /* synthetic */ int A;
        public Object u;
        public int v;
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ CharSequence z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CharSequence charSequence, int i, uv4<? super f> uv4Var) {
            super(2, uv4Var);
            this.z = charSequence;
            this.A = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            Matcher matcher;
            f fVar;
            i75 i75Var;
            int i;
            String obj2;
            String obj3;
            Object h = gw4.h();
            int i2 = this.w;
            int i3 = 0;
            if (i2 == 0) {
                rp4.n(obj);
                i75 i75Var2 = (i75) this.x;
                matcher = o85.this.t.matcher(this.z);
                if (this.A != 1 && matcher.find()) {
                    fVar = this;
                    i75Var = i75Var2;
                    i = 0;
                    obj2 = fVar.z.subSequence(i3, matcher.start()).toString();
                    fVar.x = i75Var;
                    fVar.u = matcher;
                    fVar.v = i;
                    fVar.w = 2;
                    if (i75Var.b(obj2, fVar) == h) {
                    }
                    i3 = matcher.end();
                    i++;
                    if (i != fVar.A - 1) {
                    }
                    CharSequence charSequence = fVar.z;
                    obj3 = charSequence.subSequence(i3, charSequence.length()).toString();
                    fVar.x = null;
                    fVar.u = null;
                    fVar.w = 3;
                    if (i75Var.b(obj3, fVar) == h) {
                    }
                    return yq4.a;
                }
                String obj4 = this.z.toString();
                this.w = 1;
                if (i75Var2.b(obj4, this) == h) {
                    return h;
                }
            } else if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rp4.n(obj);
                    return yq4.a;
                }
                int i4 = this.v;
                i75Var = (i75) this.x;
                rp4.n(obj);
                fVar = this;
                i = i4;
                matcher = (Matcher) this.u;
                i3 = matcher.end();
                i++;
                if (i != fVar.A - 1 || !matcher.find()) {
                    CharSequence charSequence2 = fVar.z;
                    obj3 = charSequence2.subSequence(i3, charSequence2.length()).toString();
                    fVar.x = null;
                    fVar.u = null;
                    fVar.w = 3;
                    if (i75Var.b(obj3, fVar) == h) {
                        return h;
                    }
                    return yq4.a;
                }
                obj2 = fVar.z.subSequence(i3, matcher.start()).toString();
                fVar.x = i75Var;
                fVar.u = matcher;
                fVar.v = i;
                fVar.w = 2;
                if (i75Var.b(obj2, fVar) == h) {
                    return h;
                }
                i3 = matcher.end();
                i++;
                if (i != fVar.A - 1) {
                }
                CharSequence charSequence22 = fVar.z;
                obj3 = charSequence22.subSequence(i3, charSequence22.length()).toString();
                fVar.x = null;
                fVar.u = null;
                fVar.w = 3;
                if (i75Var.b(obj3, fVar) == h) {
                }
                return yq4.a;
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            f fVar = new f(this.z, this.A, uv4Var);
            fVar.x = obj;
            return fVar;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: t3 */
        public final Object w3(@NotNull i75<? super String> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((f) X(i75Var, uv4Var)).D1(yq4.a);
        }
    }

    @np4
    public o85(@NotNull Pattern pattern) {
        c25.p(pattern, "nativePattern");
        this.t = pattern;
    }

    public static /* synthetic */ g75 B(o85 o85Var, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return o85Var.A(charSequence, i);
    }

    private final Object E() {
        String pattern = this.t.pattern();
        c25.o(pattern, "nativePattern.pattern()");
        return new b(pattern, this.t.flags());
    }

    public static /* synthetic */ m85 d(o85 o85Var, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return o85Var.c(charSequence, i);
    }

    public static /* synthetic */ g75 f(o85 o85Var, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return o85Var.e(charSequence, i);
    }

    public static /* synthetic */ List y(o85 o85Var, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return o85Var.x(charSequence, i);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.6")
    @NotNull
    public final g75<String> A(@NotNull CharSequence charSequence, int i) {
        c25.p(charSequence, "input");
        c95.M4(i);
        return k75.b(new f(charSequence, i, null));
    }

    @NotNull
    public final Pattern D() {
        return this.t;
    }

    public final boolean b(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "input");
        return this.t.matcher(charSequence).find();
    }

    @Nullable
    public final m85 c(@NotNull CharSequence charSequence, int i) {
        c25.p(charSequence, "input");
        Matcher matcher = this.t.matcher(charSequence);
        c25.o(matcher, "nativePattern.matcher(input)");
        return p85.a(matcher, i, charSequence);
    }

    @NotNull
    public final g75<m85> e(@NotNull CharSequence charSequence, int i) {
        c25.p(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return m75.n(new c(charSequence, i), d.B);
        }
        StringBuilder H = wo1.H("Start index out of bounds: ", i, ", input length: ");
        H.append(charSequence.length());
        throw new IndexOutOfBoundsException(H.toString());
    }

    @NotNull
    public final Set<q85> g() {
        Set set = this.u;
        if (set == null) {
            int flags = this.t.flags();
            EnumSet allOf = EnumSet.allOf(q85.class);
            c25.o(allOf, "");
            os4.N0(allOf, new e(flags));
            Set<q85> unmodifiableSet = Collections.unmodifiableSet(allOf);
            c25.o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
            this.u = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    @NotNull
    public final String h() {
        String pattern = this.t.pattern();
        c25.o(pattern, "nativePattern.pattern()");
        return pattern;
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.7")
    @Nullable
    public final m85 i(@NotNull CharSequence charSequence, int i) {
        c25.p(charSequence, "input");
        Matcher region = this.t.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (region.lookingAt()) {
            c25.o(region, "this");
            return new n85(region, charSequence);
        }
        return null;
    }

    @Nullable
    public final m85 m(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "input");
        Matcher matcher = this.t.matcher(charSequence);
        c25.o(matcher, "nativePattern.matcher(input)");
        return p85.b(matcher, charSequence);
    }

    public final boolean n(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "input");
        return this.t.matcher(charSequence).matches();
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.7")
    public final boolean o(@NotNull CharSequence charSequence, int i) {
        c25.p(charSequence, "input");
        return this.t.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @NotNull
    public final String p(@NotNull CharSequence charSequence, @NotNull String str) {
        c25.p(charSequence, "input");
        c25.p(str, "replacement");
        String replaceAll = this.t.matcher(charSequence).replaceAll(str);
        c25.o(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @NotNull
    public final String t(@NotNull CharSequence charSequence, @NotNull f05<? super m85, ? extends CharSequence> f05Var) {
        c25.p(charSequence, "input");
        c25.p(f05Var, "transform");
        int i = 0;
        m85 d2 = d(this, charSequence, 0, 2, null);
        if (d2 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, d2.d().c().intValue());
            sb.append(f05Var.M(d2));
            i = d2.d().d().intValue() + 1;
            d2 = d2.next();
            if (i >= length) {
                break;
            }
        } while (d2 != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        c25.o(sb2, "sb.toString()");
        return sb2;
    }

    @NotNull
    public String toString() {
        String pattern = this.t.toString();
        c25.o(pattern, "nativePattern.toString()");
        return pattern;
    }

    @NotNull
    public final String u(@NotNull CharSequence charSequence, @NotNull String str) {
        c25.p(charSequence, "input");
        c25.p(str, "replacement");
        String replaceFirst = this.t.matcher(charSequence).replaceFirst(str);
        c25.o(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @NotNull
    public final List<String> x(@NotNull CharSequence charSequence, int i) {
        c25.p(charSequence, "input");
        c95.M4(i);
        Matcher matcher = this.t.matcher(charSequence);
        if (i != 1 && matcher.find()) {
            ArrayList arrayList = new ArrayList(i > 0 ? i55.u(i, 10) : 10);
            int i2 = 0;
            int i3 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return is4.l(charSequence.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o85(@NotNull String str) {
        this(r2);
        c25.p(str, "pattern");
        Pattern compile = Pattern.compile(str);
        c25.o(compile, "compile(pattern)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o85(@NotNull String str, @NotNull q85 q85Var) {
        this(r2);
        c25.p(str, "pattern");
        c25.p(q85Var, "option");
        Pattern compile = Pattern.compile(str, s.b(q85Var.getValue()));
        c25.o(compile, "compile(pattern, ensureUnicodeCase(option.value))");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o85(@NotNull String str, @NotNull Set<? extends q85> set) {
        this(r2);
        c25.p(str, "pattern");
        c25.p(set, "options");
        Pattern compile = Pattern.compile(str, s.b(p85.e(set)));
        c25.o(compile, "compile(pattern, ensureU…odeCase(options.toInt()))");
    }
}