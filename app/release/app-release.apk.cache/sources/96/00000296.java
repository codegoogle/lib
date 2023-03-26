package androidx.work;

import com.p7700g.p99005.kb0;
import com.p7700g.p99005.rb0;
import com.p7700g.p99005.x1;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends rb0 {
    @Override // com.p7700g.p99005.rb0
    @x1
    public kb0 b(@x1 List<kb0> inputs) {
        kb0.a aVar = new kb0.a();
        HashMap hashMap = new HashMap();
        for (kb0 kb0Var : inputs) {
            hashMap.putAll(kb0Var.x());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}