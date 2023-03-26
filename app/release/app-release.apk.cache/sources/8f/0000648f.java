package com.p7700g.p99005;

import com.p7700g.p99005.zy2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GroupedLinkedMap.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001\u0011B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ/\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ/\u0010\f\u001a\u00020\u0007\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R.\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/p7700g/p99005/wy2;", "Lcom/p7700g/p99005/zy2;", "K", bx.C4, "", "Lcom/p7700g/p99005/wy2$a;", "entry", "Lcom/p7700g/p99005/yq4;", "b", "(Lcom/p7700g/p99005/wy2$a;)V", "c", com.anythink.basead.d.g.i, "e", "key", "value", "d", "(Lcom/p7700g/p99005/zy2;Ljava/lang/Object;)V", "a", "(Lcom/p7700g/p99005/zy2;)Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lcom/p7700g/p99005/wy2$a;", "head", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "keyToEntry", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class wy2<K extends zy2, V> {
    @NotNull
    private final a<K, V> a = new a<>(null, 1, null);
    @NotNull
    private final HashMap<K, a<K, V>> b = new HashMap<>();

    private final void b(a<K, V> aVar) {
        e(aVar);
        aVar.g(this.a);
        aVar.f(this.a.c());
        g(aVar);
    }

    private final void c(a<K, V> aVar) {
        e(aVar);
        aVar.g(this.a.d());
        aVar.f(this.a);
        g(aVar);
    }

    private final <K, V> void e(a<K, V> aVar) {
        aVar.d().f(aVar.c());
        aVar.c().g(aVar.d());
    }

    private final <K, V> void g(a<K, V> aVar) {
        aVar.c().g(aVar);
        aVar.d().f(aVar);
    }

    @Nullable
    public final V a(@NotNull K k) {
        c25.p(k, "key");
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        b(aVar);
        return aVar.e();
    }

    public final void d(@NotNull K k, V v) {
        c25.p(k, "key");
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            c(aVar);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    @Nullable
    public final V f() {
        for (a<K, V> d = this.a.d(); !c25.g(d, this.a); d = d.d()) {
            V e = d.e();
            if (e != null) {
                return e;
            }
            e(d);
            HashMap<K, a<K, V>> hashMap = this.b;
            K b = d.b();
            Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            k35.k(hashMap).remove(b);
            K b2 = d.b();
            c25.m(b2);
            b2.a();
        }
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a<K, V> c = this.a.c(); !c25.g(c, this.a); c = c.c()) {
            z = true;
            sb.append('{');
            sb.append(c.b());
            sb.append(':');
            sb.append(c.h());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        String sb2 = sb.toString();
        c25.o(sb2, "sb.append(\" )\").toString()");
        return sb2;
    }

    /* compiled from: GroupedLinkedMap.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0015\b\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u0004\u0018\u00018\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u0018\u0010\u0005¨\u0006\u001e"}, d2 = {"com/p7700g/p99005/wy2$a", "K", bx.C4, "", "e", "()Ljava/lang/Object;", "", "h", "()I", "value", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/Object;)V", "Lcom/p7700g/p99005/wy2$a;", "d", "Lcom/p7700g/p99005/wy2$a;", "()Lcom/p7700g/p99005/wy2$a;", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/wy2$a;)V", "prev", "c", "f", "next", "", "b", "Ljava/util/List;", "values", "Ljava/lang/Object;", "key", "<init>", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a<K, V> {
        @Nullable
        private final K a;
        @Nullable
        private List<V> b;
        @NotNull
        private a<K, V> c;
        @NotNull
        private a<K, V> d;

        @gz4
        public a() {
            this(null, 1, null);
        }

        @gz4
        public a(@Nullable K k) {
            this.a = k;
            this.d = this;
            this.c = this;
        }

        public final void a(V v) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            List<V> list = this.b;
            c25.m(list);
            list.add(v);
        }

        @Nullable
        public final K b() {
            return this.a;
        }

        @NotNull
        public final a<K, V> c() {
            return this.c;
        }

        @NotNull
        public final a<K, V> d() {
            return this.d;
        }

        @Nullable
        public final V e() {
            int h = h();
            if (h > 0) {
                List<V> list = this.b;
                c25.m(list);
                return list.remove(h - 1);
            }
            return null;
        }

        public final void f(@NotNull a<K, V> aVar) {
            c25.p(aVar, "<set-?>");
            this.c = aVar;
        }

        public final void g(@NotNull a<K, V> aVar) {
            c25.p(aVar, "<set-?>");
            this.d = aVar;
        }

        public final int h() {
            List<V> list = this.b;
            if (list != null) {
                c25.m(list);
                return list.size();
            }
            return 0;
        }

        public /* synthetic */ a(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }
    }
}