package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: SetBuilder.java */
/* loaded from: classes2.dex */
public final class s62<T> {
    private static final String a = "Set contributions cannot be null";
    private final List<T> b;

    private s62(int i) {
        this.b = new ArrayList(i);
    }

    public static <T> s62<T> d(int i) {
        return new s62<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s62<T> a(T t) {
        this.b.add(q62.c(t, a));
        return this;
    }

    public s62<T> b(Collection<? extends T> collection) {
        for (T t : collection) {
            q62.c(t, a);
        }
        this.b.addAll(collection);
        return this;
    }

    public Set<T> c() {
        int size = this.b.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableSet(new HashSet(this.b));
            }
            return Collections.singleton(this.b.get(0));
        }
        return Collections.emptySet();
    }
}