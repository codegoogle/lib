package com.anythink.core.common.j.a;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.anythink.core.common.j.a.f;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class c {
    private final f a;
    private final Map<View, b> b;
    private final Map<View, d<b>> c;
    private final f.b d;
    private f.d e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c() {
        this(r0, r1, r2, r3);
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        f.b bVar = new f.b();
        f fVar = new f();
        new Handler(Looper.getMainLooper());
    }

    @Deprecated
    private f.d c() {
        return this.e;
    }

    public final void b() {
        a();
        this.a.b();
        this.e = null;
    }

    public final void a(View view, b bVar) {
        if (this.b.get(view) == bVar) {
            return;
        }
        a(view);
        if (bVar.isImpressionRecorded()) {
            return;
        }
        this.b.put(view, bVar);
        f fVar = this.a;
        int impressionMinPercentageViewed = bVar.getImpressionMinPercentageViewed();
        fVar.a(view, view, impressionMinPercentageViewed, impressionMinPercentageViewed, bVar.getImpressionMinVisiblePx());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int i) {
        this(r0, r1, r2, r3);
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        f.b bVar = new f.b();
        f fVar = new f(i);
        new Handler(Looper.getMainLooper());
    }

    private void b(View view) {
        this.c.remove(view);
    }

    private c(Map<View, b> map, Map<View, d<b>> map2, f.b bVar, f fVar) {
        this.b = map;
        this.c = map2;
        this.d = bVar;
        this.a = fVar;
        f.d dVar = new f.d() { // from class: com.anythink.core.common.j.a.c.1
            @Override // com.anythink.core.common.j.a.f.d
            public final void a(List<View> list) {
                for (View view : list) {
                    b bVar2 = (b) c.this.b.get(view);
                    if (bVar2 == null) {
                        c.this.a(view);
                    } else {
                        bVar2.recordImpression(view);
                        bVar2.setImpressionRecorded();
                    }
                }
            }
        };
        this.e = dVar;
        fVar.a(dVar);
    }

    public final void a(View view) {
        this.b.remove(view);
        b(view);
        this.a.a(view);
    }

    public final void a() {
        this.b.clear();
        this.c.clear();
        this.a.a();
    }
}