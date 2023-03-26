package com.anchorfree.vpnsdk.network.probe;

import android.content.Context;
import com.p7700g.p99005.hd1;
import com.p7700g.p99005.id1;
import com.p7700g.p99005.kd1;
import com.p7700g.p99005.md1;
import com.p7700g.p99005.pd1;
import com.p7700g.p99005.td1;
import com.p7700g.p99005.uc1;
import com.p7700g.p99005.x1;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class DefaultNetworkProbeFactory implements md1 {
    @Override // com.p7700g.p99005.md1
    @x1
    public kd1 a(@x1 Context context, @x1 td1 td1Var) {
        return new kd1(Arrays.asList(new pd1(new uc1(context)), new id1(context, td1Var), new hd1(context, td1Var)));
    }
}