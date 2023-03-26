package com.anchorfree.vpnsdk.transporthydra;

import android.content.Context;
import com.p7700g.p99005.hn1;
import com.p7700g.p99005.po1;
import com.p7700g.p99005.qa1;
import com.p7700g.p99005.qd1;
import com.p7700g.p99005.qg1;
import com.p7700g.p99005.td1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xg1;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class HydraTransportFactory implements qa1 {
    @Override // com.p7700g.p99005.qa1
    @x1
    public hn1 create(@x1 Context context, @x1 po1 po1Var, @x1 td1 td1Var, @x1 td1 td1Var2) {
        return new xg1(context, qg1.g(), td1Var, new qd1(context, td1Var2), Executors.newSingleThreadExecutor());
    }
}