package com.p7700g.p99005;

import com.p7700g.p99005.ip;
import com.p7700g.p99005.pr1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath.java */
/* loaded from: classes2.dex */
public class as1<Data, ResourceType, Transcode> {
    private final Class<Data> a;
    private final ip.a<List<Throwable>> b;
    private final List<? extends pr1<Data, ResourceType, Transcode>> c;
    private final String d;

    public as1(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<pr1<Data, ResourceType, Transcode>> list, ip.a<List<Throwable>> aVar) {
        this.a = cls;
        this.b = aVar;
        this.c = (List) x02.c(list);
        StringBuilder G = wo1.G("Failed LoadPath{");
        G.append(cls.getSimpleName());
        G.append("->");
        G.append(cls2.getSimpleName());
        G.append("->");
        G.append(cls3.getSimpleName());
        G.append("}");
        this.d = G.toString();
    }

    private cs1<Transcode> c(sq1<Data> sq1Var, @x1 jq1 jq1Var, int i, int i2, pr1.a<ResourceType> aVar, List<Throwable> list) throws xr1 {
        int size = this.c.size();
        cs1<Transcode> cs1Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                cs1Var = this.c.get(i3).a(sq1Var, i, i2, jq1Var, aVar);
            } catch (xr1 e) {
                list.add(e);
            }
            if (cs1Var != null) {
                break;
            }
        }
        if (cs1Var != null) {
            return cs1Var;
        }
        throw new xr1(this.d, new ArrayList(list));
    }

    public Class<Data> a() {
        return this.a;
    }

    public cs1<Transcode> b(sq1<Data> sq1Var, @x1 jq1 jq1Var, int i, int i2, pr1.a<ResourceType> aVar) throws xr1 {
        List<Throwable> list = (List) x02.d(this.b.b());
        try {
            return c(sq1Var, jq1Var, i, i2, aVar, list);
        } finally {
            this.b.a(list);
        }
    }

    public String toString() {
        StringBuilder G = wo1.G("LoadPath{decodePaths=");
        G.append(Arrays.toString(this.c.toArray()));
        G.append('}');
        return G.toString();
    }
}