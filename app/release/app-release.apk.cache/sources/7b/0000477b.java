package com.p7700g.p99005;

import java.net.InetSocketAddress;
import java.util.Comparator;

/* compiled from: lambda */
/* loaded from: classes4.dex */
public final /* synthetic */ class hx5 implements Comparator {
    public static final /* synthetic */ hx5 s = new hx5();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        compare = Integer.compare(((InetSocketAddress) obj2).getAddress().getAddress().length, ((InetSocketAddress) obj).getAddress().getAddress().length);
        return compare;
    }
}