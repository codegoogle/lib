package com.p7700g.p99005;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bc3 {
    public static final int a(@NotNull List<?> list) {
        c25.p(list, "list");
        Iterator<?> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next == null ? 0 : next.hashCode());
        }
        return i;
    }

    public static final int b(@NotNull String... strArr) {
        c25.p(strArr, "values");
        return a(as4.iz(strArr));
    }
}