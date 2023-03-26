package com.p7700g.p99005;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes3.dex */
public final class kp2 extends qo2 {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final Set<Class<?>> f;
    private final to2 g;

    /* compiled from: RestrictedComponentContainer.java */
    /* loaded from: classes3.dex */
    public static class a implements lq2 {
        private final Set<Class<?>> a;
        private final lq2 b;

        public a(Set<Class<?>> set, lq2 lq2Var) {
            this.a = set;
            this.b = lq2Var;
        }

        @Override // com.p7700g.p99005.lq2
        public void c(jq2<?> jq2Var) {
            if (this.a.contains(jq2Var.b())) {
                this.b.c(jq2Var);
                return;
            }
            throw new bp2(String.format("Attempting to publish an undeclared event %s.", jq2Var));
        }
    }

    public kp2(so2<?> so2Var, to2 to2Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (zo2 zo2Var : so2Var.c()) {
            if (zo2Var.e()) {
                if (zo2Var.g()) {
                    hashSet4.add(zo2Var.c());
                } else {
                    hashSet.add(zo2Var.c());
                }
            } else if (zo2Var.d()) {
                hashSet3.add(zo2Var.c());
            } else if (zo2Var.g()) {
                hashSet5.add(zo2Var.c());
            } else {
                hashSet2.add(zo2Var.c());
            }
        }
        if (!so2Var.f().isEmpty()) {
            hashSet.add(lq2.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = so2Var.f();
        this.g = to2Var;
    }

    @Override // com.p7700g.p99005.qo2, com.p7700g.p99005.to2
    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T t = (T) this.g.a(cls);
            return !cls.equals(lq2.class) ? t : (T) new a(this.f, (lq2) t);
        }
        throw new bp2(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.p7700g.p99005.to2
    public <T> er2<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.g.b(cls);
        }
        throw new bp2(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.p7700g.p99005.to2
    public <T> er2<Set<T>> d(Class<T> cls) {
        if (this.e.contains(cls)) {
            return this.g.d(cls);
        }
        throw new bp2(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // com.p7700g.p99005.qo2, com.p7700g.p99005.to2
    public <T> Set<T> e(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.g.e(cls);
        }
        throw new bp2(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.p7700g.p99005.to2
    public <T> dr2<T> f(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.g.f(cls);
        }
        throw new bp2(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}