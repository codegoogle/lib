package com.p7700g.p99005;

import java.util.Map;
import java.util.TreeMap;

/* compiled from: PrettyPrintTreeMap.java */
/* loaded from: classes2.dex */
public class us1<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder G = wo1.G("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            G.append('{');
            G.append(entry.getKey());
            G.append(':');
            G.append(entry.getValue());
            G.append("}, ");
        }
        if (!isEmpty()) {
            G.replace(G.length() - 2, G.length(), "");
        }
        G.append(" )");
        return G.toString();
    }
}