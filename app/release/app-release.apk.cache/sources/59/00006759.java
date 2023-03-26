package com.p7700g.p99005;

import com.p7700g.p99005.wy3;
import java.util.HashMap;
import java.util.Map;

/* compiled from: OpenVpnMultiApi.java */
/* loaded from: classes3.dex */
public class yh3 implements xh3 {
    @x1
    private final Map<String, xh3> a;
    @z1
    public xh3 b;
    @x1
    private final xh3 c;

    public yh3(@x1 Map<String, xh3> map, @x1 xh3 xh3Var) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.c = xh3Var;
        hashMap.putAll(map);
    }

    @Override // com.p7700g.p99005.xh3
    @z1
    public String a(@x1 String str, @x1 String str2) {
        xh3 xh3Var = this.b;
        if (xh3Var != null) {
            return xh3Var.a(str, str2);
        }
        return this.c.a(str, str2);
    }

    @Override // com.p7700g.p99005.xh3
    public boolean b(@x1 th3 th3Var, @x1 ln1 ln1Var, @x1 mn1 mn1Var, @x1 wy3.a aVar) {
        xh3 xh3Var = this.a.get(th3Var.a());
        this.b = xh3Var;
        if (xh3Var != null) {
            return xh3Var.b(th3Var, ln1Var, mn1Var, aVar);
        }
        return this.c.b(th3Var, ln1Var, mn1Var, aVar);
    }

    @Override // com.p7700g.p99005.xh3
    public void stop() {
        xh3 xh3Var = this.b;
        if (xh3Var != null) {
            xh3Var.stop();
        } else {
            this.c.stop();
        }
    }
}