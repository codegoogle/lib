package androidx.activity;

import android.annotation.SuppressLint;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.u;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.w;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    @z1
    private final Runnable a;
    public final ArrayDeque<w> b;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements oz, u {
        private final mz s;
        private final w t;
        @z1
        private u u;

        public LifecycleOnBackPressedCancellable(@x1 mz mzVar, @x1 w wVar) {
            this.s = mzVar;
            this.t = wVar;
            mzVar.a(this);
        }

        @Override // com.p7700g.p99005.u
        public void cancel() {
            this.s.c(this);
            this.t.e(this);
            u uVar = this.u;
            if (uVar != null) {
                uVar.cancel();
                this.u = null;
            }
        }

        @Override // com.p7700g.p99005.oz
        public void i(@x1 qz qzVar, @x1 mz.b bVar) {
            if (bVar == mz.b.ON_START) {
                this.u = OnBackPressedDispatcher.this.c(this.t);
            } else if (bVar == mz.b.ON_STOP) {
                u uVar = this.u;
                if (uVar != null) {
                    uVar.cancel();
                }
            } else if (bVar == mz.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements u {
        private final w s;

        public a(w wVar) {
            this.s = wVar;
        }

        @Override // com.p7700g.p99005.u
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.s);
            this.s.e(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @u1
    public void a(@x1 w wVar) {
        c(wVar);
    }

    @u1
    @SuppressLint({"LambdaLast"})
    public void b(@x1 qz qzVar, @x1 w wVar) {
        mz lifecycle = qzVar.getLifecycle();
        if (lifecycle.b() == mz.c.DESTROYED) {
            return;
        }
        wVar.a(new LifecycleOnBackPressedCancellable(lifecycle, wVar));
    }

    @x1
    @u1
    public u c(@x1 w wVar) {
        this.b.add(wVar);
        a aVar = new a(wVar);
        wVar.a(aVar);
        return aVar;
    }

    @u1
    public boolean d() {
        Iterator<w> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().c()) {
                return true;
            }
        }
        return false;
    }

    @u1
    public void e() {
        Iterator<w> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            w next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher(@z1 Runnable runnable) {
        this.b = new ArrayDeque<>();
        this.a = runnable;
    }
}