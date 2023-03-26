package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.m85;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Regex.kt */
@vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class n85 implements m85 {
    @NotNull
    private final Matcher a;
    @NotNull
    private final CharSequence b;
    @NotNull
    private final k85 c;
    @Nullable
    private List<String> d;

    /* compiled from: Regex.kt */
    @vo4(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", "get", la1.l, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends nr4<String> {
        public a() {
        }

        @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
        public int a() {
            return n85.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean b(String str) {
            return super.contains(str);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        @NotNull
        /* renamed from: c */
        public String get(int i) {
            String group = n85.this.f().group(i);
            return group == null ? "" : group;
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return b((String) obj);
            }
            return false;
        }

        public /* bridge */ int d(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int e(String str) {
            return super.lastIndexOf(str);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return d((String) obj);
            }
            return -1;
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return -1;
        }
    }

    public n85(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        c25.p(matcher, "matcher");
        c25.p(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult f() {
        return this.a;
    }

    @Override // com.p7700g.p99005.m85
    @NotNull
    public m85.b a() {
        return m85.a.a(this);
    }

    @Override // com.p7700g.p99005.m85
    @NotNull
    public List<String> b() {
        if (this.d == null) {
            this.d = new a();
        }
        List<String> list = this.d;
        c25.m(list);
        return list;
    }

    @Override // com.p7700g.p99005.m85
    @NotNull
    public k85 c() {
        return this.c;
    }

    @Override // com.p7700g.p99005.m85
    @NotNull
    public c55 d() {
        return p85.c(f());
    }

    @Override // com.p7700g.p99005.m85
    @NotNull
    public String getValue() {
        String group = f().group();
        c25.o(group, "matchResult.group()");
        return group;
    }

    @Override // com.p7700g.p99005.m85
    @Nullable
    public m85 next() {
        int end = f().end() + (f().end() == f().start() ? 1 : 0);
        if (end <= this.b.length()) {
            Matcher matcher = this.a.pattern().matcher(this.b);
            c25.o(matcher, "matcher.pattern().matcher(input)");
            return p85.a(matcher, end, this.b);
        }
        return null;
    }

    /* compiled from: Regex.kt */
    @vo4(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", "get", la1.l, "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends lr4<j85> implements l85 {

        /* compiled from: Regex.kt */
        @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends e25 implements f05<Integer, j85> {
            public a() {
                super(1);
            }

            @Override // com.p7700g.p99005.f05
            public /* bridge */ /* synthetic */ j85 M(Integer num) {
                return b(num.intValue());
            }

            @Nullable
            public final j85 b(int i) {
                return b.this.get(i);
            }
        }

        public b() {
        }

        @Override // com.p7700g.p99005.lr4
        public int a() {
            return n85.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean b(j85 j85Var) {
            return super.contains(j85Var);
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof j85) {
                return b((j85) obj);
            }
            return false;
        }

        @Override // com.p7700g.p99005.k85
        @Nullable
        public j85 get(int i) {
            c55 d = p85.d(n85.this.f(), i);
            if (d.c().intValue() >= 0) {
                String group = n85.this.f().group(i);
                c25.o(group, "matchResult.group(index)");
                return new j85(group, d);
            }
            return null;
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<j85> iterator() {
            return o75.k1(rs4.v1(js4.G(this)), new a()).iterator();
        }

        @Override // com.p7700g.p99005.l85
        @Nullable
        public j85 get(@NotNull String str) {
            c25.p(str, "name");
            return kx4.a.c(n85.this.f(), str);
        }
    }
}