package com.p7700g.p99005;

import com.p7700g.p99005.h54;
import com.p7700g.p99005.l54;
import com.p7700g.p99005.o34;
import java.util.Iterator;

/* compiled from: IPAddressPartStringCollectionBase.java */
/* loaded from: classes3.dex */
public abstract class j54<T extends o34, P extends l54<?>, S extends h54<?, ?>> implements Iterable<S> {
    public String[] a() {
        String[] strArr = new String[size()];
        Iterator<S> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = ((h54) it.next()).b();
            i++;
        }
        return strArr;
    }

    public abstract int size();
}