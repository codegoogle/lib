package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NetworkResponse.java */
/* loaded from: classes3.dex */
public class p43 {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<l43> d;
    public final boolean e;
    public final long f;

    @Deprecated
    public p43(int statusCode, byte[] data, Map<String, String> headers, boolean notModified, long networkTimeMs) {
        this(statusCode, data, headers, a(headers), notModified, networkTimeMs);
    }

    private static List<l43> a(Map<String, String> headers) {
        if (headers == null) {
            return null;
        }
        if (headers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            arrayList.add(new l43(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> b(List<l43> allHeaders) {
        if (allHeaders == null) {
            return null;
        }
        if (allHeaders.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (l43 l43Var : allHeaders) {
            treeMap.put(l43Var.a(), l43Var.b());
        }
        return treeMap;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Status:");
        G.append(this.a);
        G.append("\n");
        G.append(this.c.toString());
        G.append(new String(this.b));
        return G.toString();
    }

    public p43(int statusCode, byte[] data, boolean notModified, long networkTimeMs, List<l43> allHeaders) {
        this(statusCode, data, b(allHeaders), allHeaders, notModified, networkTimeMs);
    }

    @Deprecated
    public p43(int statusCode, byte[] data, Map<String, String> headers, boolean notModified) {
        this(statusCode, data, headers, notModified, 0L);
    }

    public p43(byte[] data) {
        this(200, data, false, 0L, (List<l43>) Collections.emptyList());
    }

    @Deprecated
    public p43(byte[] data, Map<String, String> headers) {
        this(200, data, headers, false, 0L);
    }

    private p43(int statusCode, byte[] data, Map<String, String> headers, List<l43> allHeaders, boolean notModified, long networkTimeMs) {
        this.a = statusCode;
        this.b = data;
        this.c = headers;
        if (allHeaders == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(allHeaders);
        }
        this.e = notModified;
        this.f = networkTimeMs;
    }
}