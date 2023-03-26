package com.p7700g.p99005;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: RoundRobinIpsRotator.java */
/* loaded from: classes2.dex */
public class if1 implements jf1 {
    private final Map<String, Long> b = new HashMap();

    private long b(@x1 String str) {
        Long l = this.b.get(str);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ int d(gt0 gt0Var, gt0 gt0Var2) {
        return Long.compare(b(gt0Var.c()), b(gt0Var2.c()));
    }

    @Override // com.p7700g.p99005.jf1
    @x1
    public List<gt0> a(@x1 ft0 ft0Var) {
        LinkedList linkedList = new LinkedList(ft0Var.r());
        Collections.sort(linkedList, new Comparator() { // from class: com.p7700g.p99005.ye1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return if1.this.d((gt0) obj, (gt0) obj2);
            }
        });
        this.b.put(((gt0) linkedList.get(0)).c(), Long.valueOf(System.currentTimeMillis()));
        return linkedList;
    }
}