package androidx.lifecycle;

import com.p7700g.p99005.iz;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.wz;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements oz {
    private final iz[] s;

    public CompositeGeneratedAdaptersObserver(iz[] izVarArr) {
        this.s = izVarArr;
    }

    @Override // com.p7700g.p99005.oz
    public void i(@x1 qz qzVar, @x1 mz.b bVar) {
        wz wzVar = new wz();
        for (iz izVar : this.s) {
            izVar.a(qzVar, bVar, false, wzVar);
        }
        for (iz izVar2 : this.s) {
            izVar2.a(qzVar, bVar, true, wzVar);
        }
    }
}