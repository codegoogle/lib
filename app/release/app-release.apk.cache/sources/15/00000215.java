package androidx.lifecycle;

import com.p7700g.p99005.c00;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements oz {
    private final String s;
    private boolean t = false;
    private final c00 u;

    public SavedStateHandleController(String str, c00 c00Var) {
        this.s = str;
        this.u = c00Var;
    }

    public void e(f60 f60Var, mz mzVar) {
        if (!this.t) {
            this.t = true;
            mzVar.a(this);
            f60Var.j(this.s, this.u.o());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public c00 f() {
        return this.u;
    }

    @Override // com.p7700g.p99005.oz
    public void i(@x1 qz qzVar, @x1 mz.b bVar) {
        if (bVar == mz.b.ON_DESTROY) {
            this.t = false;
            qzVar.getLifecycle().c(this);
        }
    }

    public boolean j() {
        return this.t;
    }
}