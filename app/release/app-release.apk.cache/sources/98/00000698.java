package com.anythink.core.common.i;

import android.content.Context;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.h;
import com.anythink.core.common.g.a.b;
import com.anythink.core.common.n;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends n<h> {
    private static d e;

    private d(Context context) {
        super(context);
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (e == null) {
                e = new d(context);
            }
            dVar = e;
        }
        return dVar;
    }

    @Override // com.anythink.core.common.n
    public final void a(final List<h> list) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.i.d.1
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (h hVar : list) {
                    arrayList.add(hVar.a().toString());
                }
                com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(m.a().e()));
                if (l0 != null) {
                    if (l0.m() != 1) {
                        new com.anythink.core.common.g.b(d.this.d, l0.m(), arrayList).a(0, (com.anythink.core.common.g.h) null);
                        return;
                    }
                    com.anythink.core.common.g.a.a aVar = new com.anythink.core.common.g.a.a(arrayList);
                    aVar.a(1, l0.l());
                    aVar.a((b.a) null);
                    return;
                }
                new com.anythink.core.common.g.b(d.this.d, 0, arrayList).a(0, (com.anythink.core.common.g.h) null);
            }
        });
    }
}