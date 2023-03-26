package com.anchorfree.vpnsdk.switcher;

import android.content.Context;
import com.p7700g.p99005.an1;
import com.p7700g.p99005.h51;
import com.p7700g.p99005.hn1;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.o51;
import com.p7700g.p99005.pa1;
import com.p7700g.p99005.po1;
import com.p7700g.p99005.qa1;
import com.p7700g.p99005.td1;
import com.p7700g.p99005.x1;

/* loaded from: classes2.dex */
public class SwitchableTransportFactory implements qa1 {
    @Override // com.p7700g.p99005.qa1
    @x1
    public hn1 create(@x1 Context context, @x1 po1 po1Var, @x1 td1 td1Var, @x1 td1 td1Var2) {
        return new an1((pa1) i61.a().d(pa1.class), (h51) i61.a().d(h51.class), (o51) i61.a().d(o51.class), po1Var, td1Var, td1Var2);
    }
}