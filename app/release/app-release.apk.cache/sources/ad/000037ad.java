package com.northghost.caketube;

import android.content.Context;
import com.p7700g.p99005.hn1;
import com.p7700g.p99005.po1;
import com.p7700g.p99005.qa1;
import com.p7700g.p99005.qh3;
import com.p7700g.p99005.td1;
import com.p7700g.p99005.wh3;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xy3;
import com.p7700g.p99005.yh3;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class CaketubeTransportFactory implements qa1 {
    @Override // com.p7700g.p99005.qa1
    @x1
    public hn1 create(@x1 Context context, @x1 po1 po1Var, @x1 td1 td1Var, @x1 td1 td1Var2) {
        wh3 wh3Var = new wh3(context, td1Var, new xy3());
        HashMap hashMap = new HashMap();
        hashMap.put(qh3.x, wh3Var);
        return new qh3(new yh3(hashMap, wh3Var));
    }
}