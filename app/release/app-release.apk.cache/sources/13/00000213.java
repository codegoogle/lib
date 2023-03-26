package androidx.lifecycle;

import com.p7700g.p99005.cz;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.x1;

@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements oz {
    private final Object s;
    private final cz.a t;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.s = obj;
        this.t = cz.a.c(obj.getClass());
    }

    @Override // com.p7700g.p99005.oz
    public void i(@x1 qz qzVar, @x1 mz.b bVar) {
        this.t.a(qzVar, bVar, this.s);
    }
}