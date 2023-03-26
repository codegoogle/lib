package com.p7700g.p99005;

import com.p7700g.p99005.v31;
import java.util.List;

/* compiled from: ProbeResultsUploader.java */
/* loaded from: classes.dex */
public class f41 {
    private static final kj1 a = w21.a;
    @x1
    private final v31 b;

    public f41(@x1 v31 v31Var) {
        this.b = v31Var;
    }

    public static /* synthetic */ Object a(List list, ti1 ti1Var, y41 y41Var, en1 en1Var, dq0 dq0Var) throws Exception {
        mg1.a.c(new u21(list, ti1Var, y41Var, (v31.b) dq0Var.F(), en1Var));
        return null;
    }

    public void b(@x1 final en1 en1Var, @x1 final ti1 ti1Var, @x1 final y41 y41Var, @x1 final List<g41> list) {
        a.c("ProbeTestResultsUpload in state %s", en1Var);
        this.b.a().q(new aq0() { // from class: com.p7700g.p99005.ky0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                f41.a(list, ti1Var, y41Var, en1Var, dq0Var);
                return null;
            }
        });
    }
}