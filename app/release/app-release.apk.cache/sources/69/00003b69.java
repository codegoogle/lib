package com.p7700g.p99005;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes2.dex */
public class bp1 {
    private final Map<Class<?>, b> a;

    /* compiled from: GlideExperiments.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private final Map<Class<?>, b> a = new HashMap();

        public a b(b bVar) {
            this.a.put(bVar.getClass(), bVar);
            return this;
        }

        public bp1 c() {
            return new bp1(this);
        }

        public a d(b bVar, boolean z) {
            if (z) {
                b(bVar);
            } else {
                this.a.remove(bVar.getClass());
            }
            return this;
        }
    }

    /* compiled from: GlideExperiments.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public bp1(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }

    @z1
    public <T extends b> T a(Class<T> cls) {
        return (T) this.a.get(cls);
    }

    public boolean b(Class<? extends b> cls) {
        return this.a.containsKey(cls);
    }
}