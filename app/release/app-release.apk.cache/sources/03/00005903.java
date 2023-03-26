package com.p7700g.p99005;

import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.Map;

/* compiled from: FragmentManagerNonConfig.java */
@Deprecated
/* loaded from: classes.dex */
public class qx {
    @z1
    private final Collection<Fragment> a;
    @z1
    private final Map<String, qx> b;
    @z1
    private final Map<String, p00> c;

    public qx(@z1 Collection<Fragment> collection, @z1 Map<String, qx> map, @z1 Map<String, p00> map2) {
        this.a = collection;
        this.b = map;
        this.c = map2;
    }

    @z1
    public Map<String, qx> a() {
        return this.b;
    }

    @z1
    public Collection<Fragment> b() {
        return this.a;
    }

    @z1
    public Map<String, p00> c() {
        return this.c;
    }

    public boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}