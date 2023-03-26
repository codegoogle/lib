package com.android.volley;

import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class NetworkResponse {
    @z1
    public final List<Header> allHeaders;
    public final byte[] data;
    @z1
    public final Map<String, String> headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    @Deprecated
    public NetworkResponse(int i, byte[] bArr, @z1 Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, toAllHeaderList(map), z, j);
    }

    @z1
    private static List<Header> toAllHeaderList(@z1 Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @z1
    private static Map<String, String> toHeaderMap(@z1 List<Header> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Header header : list) {
            treeMap.put(header.getName(), header.getValue());
        }
        return treeMap;
    }

    public NetworkResponse(int i, byte[] bArr, boolean z, long j, @z1 List<Header> list) {
        this(i, bArr, toHeaderMap(list), list, z, j);
    }

    @Deprecated
    public NetworkResponse(int i, byte[] bArr, @z1 Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }

    public NetworkResponse(byte[] bArr) {
        this(200, bArr, false, 0L, (List<Header>) Collections.emptyList());
    }

    @Deprecated
    public NetworkResponse(byte[] bArr, @z1 Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    private NetworkResponse(int i, byte[] bArr, @z1 Map<String, String> map, @z1 List<Header> list, boolean z, long j) {
        this.statusCode = i;
        this.data = bArr;
        this.headers = map;
        if (list == null) {
            this.allHeaders = null;
        } else {
            this.allHeaders = Collections.unmodifiableList(list);
        }
        this.notModified = z;
        this.networkTimeMs = j;
    }
}