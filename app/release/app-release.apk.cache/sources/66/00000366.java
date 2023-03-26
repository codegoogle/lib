package com.anchorfree.vpnsdk.vpnservice;

import android.content.Context;
import com.p7700g.p99005.dn1;
import com.p7700g.p99005.hn1;
import com.p7700g.p99005.po1;
import com.p7700g.p99005.qa1;
import com.p7700g.p99005.td1;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class VpnTransportSetFactory implements qa1 {
    @x1
    private final List<qa1> a;

    public VpnTransportSetFactory(@x1 qa1[] qa1VarArr) {
        this.a = Arrays.asList(qa1VarArr);
    }

    @Override // com.p7700g.p99005.qa1
    @x1
    public hn1 create(@x1 Context context, @x1 po1 po1Var, @x1 td1 td1Var, @x1 td1 td1Var2) {
        ArrayList arrayList = new ArrayList(this.a.size());
        for (qa1 qa1Var : this.a) {
            arrayList.add(qa1Var.create(context, po1Var, td1Var, td1Var2));
        }
        return new dn1(arrayList);
    }
}