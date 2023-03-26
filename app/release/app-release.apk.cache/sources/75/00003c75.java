package com.p7700g.p99005;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cb3 extends EnumMap<l23, db3> {
    public cb3() {
        super(l23.class);
    }

    private final JSONObject x() {
        return i23.a.a(this);
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null ? true : obj instanceof l23) {
            return i((l23) obj);
        }
        return false;
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null ? true : obj instanceof db3) {
            return o((db3) obj);
        }
        return false;
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<l23, db3>> entrySet() {
        return h();
    }

    public Set<Map.Entry<l23, db3>> h() {
        return super.entrySet();
    }

    public boolean i(l23 l23Var) {
        return super.containsKey(l23Var);
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final Set<l23> keySet() {
        return p();
    }

    public boolean n(l23 l23Var, db3 db3Var) {
        return super.remove(l23Var, db3Var);
    }

    public boolean o(db3 db3Var) {
        return super.containsValue(db3Var);
    }

    public Set<l23> p() {
        return super.keySet();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if (obj == null ? true : obj instanceof l23) {
            if (obj2 != null ? obj2 instanceof db3 : true) {
                return n((l23) obj, (db3) obj2);
            }
            return false;
        }
        return false;
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return t();
    }

    public int t() {
        return super.size();
    }

    @Override // java.util.AbstractMap
    @NotNull
    public String toString() {
        String jSONObject;
        JSONObject x = x();
        return (x == null || (jSONObject = x.toString()) == null) ? "" : jSONObject;
    }

    public Collection<db3> u() {
        return super.values();
    }

    @Override // java.util.EnumMap, java.util.AbstractMap, java.util.Map
    public final Collection<db3> values() {
        return u();
    }
}