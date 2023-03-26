package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.p7700g.p99005.mz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public class vq {
    private final Runnable a;
    private final CopyOnWriteArrayList<zq> b = new CopyOnWriteArrayList<>();
    private final Map<zq, a> c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* loaded from: classes.dex */
    public static class a {
        public final mz a;
        private oz b;

        public a(@x1 mz mzVar, @x1 oz ozVar) {
            this.a = mzVar;
            this.b = ozVar;
            mzVar.a(ozVar);
        }

        public void a() {
            this.a.c(this.b);
            this.b = null;
        }
    }

    public vq(@x1 Runnable runnable) {
        this.a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e(zq zqVar, qz qzVar, mz.b bVar) {
        if (bVar == mz.b.ON_DESTROY) {
            l(zqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void g(mz.c cVar, zq zqVar, qz qzVar, mz.b bVar) {
        if (bVar == mz.b.h(cVar)) {
            a(zqVar);
        } else if (bVar == mz.b.ON_DESTROY) {
            l(zqVar);
        } else if (bVar == mz.b.a(cVar)) {
            this.b.remove(zqVar);
            this.a.run();
        }
    }

    public void a(@x1 zq zqVar) {
        this.b.add(zqVar);
        this.a.run();
    }

    public void b(@x1 final zq zqVar, @x1 qz qzVar) {
        a(zqVar);
        mz lifecycle = qzVar.getLifecycle();
        a remove = this.c.remove(zqVar);
        if (remove != null) {
            remove.a();
        }
        this.c.put(zqVar, new a(lifecycle, new oz() { // from class: com.p7700g.p99005.xp
            @Override // com.p7700g.p99005.oz
            public final void i(qz qzVar2, mz.b bVar) {
                vq.this.e(zqVar, qzVar2, bVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void c(@x1 final zq zqVar, @x1 qz qzVar, @x1 final mz.c cVar) {
        mz lifecycle = qzVar.getLifecycle();
        a remove = this.c.remove(zqVar);
        if (remove != null) {
            remove.a();
        }
        this.c.put(zqVar, new a(lifecycle, new oz() { // from class: com.p7700g.p99005.wp
            @Override // com.p7700g.p99005.oz
            public final void i(qz qzVar2, mz.b bVar) {
                vq.this.g(cVar, zqVar, qzVar2, bVar);
            }
        }));
    }

    public void h(@x1 Menu menu, @x1 MenuInflater menuInflater) {
        Iterator<zq> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(@x1 Menu menu) {
        Iterator<zq> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(@x1 MenuItem menuItem) {
        Iterator<zq> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(@x1 Menu menu) {
        Iterator<zq> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(@x1 zq zqVar) {
        this.b.remove(zqVar);
        a remove = this.c.remove(zqVar);
        if (remove != null) {
            remove.a();
        }
        this.a.run();
    }
}