package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: StringKeyIgnoreCaseMultivaluedMap.java */
/* loaded from: classes3.dex */
public class lx3<V> extends dx3<String, List<V>> implements um4<String, V> {
    public lx3() {
        super(kx3.s);
    }

    @Override // com.p7700g.p99005.um4
    /* renamed from: d3 */
    public void d(String str, V v) {
        if (v == null) {
            return;
        }
        j3(str).add(v);
    }

    @Override // com.p7700g.p99005.um4
    /* renamed from: i3 */
    public V b(String str) {
        List list = (List) get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (V) list.get(0);
    }

    public List<V> j3(String str) {
        List<V> list = (List) get(str);
        if (list == null) {
            LinkedList linkedList = new LinkedList();
            put(str, linkedList);
            return linkedList;
        }
        return list;
    }

    @Override // com.p7700g.p99005.um4
    /* renamed from: k3 */
    public void c(String str, V v) {
        if (v == null) {
            return;
        }
        List<V> j3 = j3(str);
        j3.clear();
        j3.add(v);
    }

    public lx3(lx3<V> lx3Var) {
        super(kx3.s);
        for (Map.Entry<String, V> entry : lx3Var.entrySet()) {
            put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
    }
}