package com.p7700g.p99005;

import android.util.Log;
import com.p7700g.p99005.ip;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DecodePath.java */
/* loaded from: classes2.dex */
public class pr1<DataType, ResourceType, Transcode> {
    private static final String a = "DecodePath";
    private final Class<DataType> b;
    private final List<? extends lq1<DataType, ResourceType>> c;
    private final hx1<ResourceType, Transcode> d;
    private final ip.a<List<Throwable>> e;
    private final String f;

    /* compiled from: DecodePath.java */
    /* loaded from: classes2.dex */
    public interface a<ResourceType> {
        @x1
        cs1<ResourceType> a(@x1 cs1<ResourceType> cs1Var);
    }

    public pr1(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends lq1<DataType, ResourceType>> list, hx1<ResourceType, Transcode> hx1Var, ip.a<List<Throwable>> aVar) {
        this.b = cls;
        this.c = list;
        this.d = hx1Var;
        this.e = aVar;
        StringBuilder G = wo1.G("Failed DecodePath{");
        G.append(cls.getSimpleName());
        G.append("->");
        G.append(cls2.getSimpleName());
        G.append("->");
        G.append(cls3.getSimpleName());
        G.append("}");
        this.f = G.toString();
    }

    @x1
    private cs1<ResourceType> b(sq1<DataType> sq1Var, int i, int i2, @x1 jq1 jq1Var) throws xr1 {
        List<Throwable> list = (List) x02.d(this.e.b());
        try {
            return c(sq1Var, i, i2, jq1Var, list);
        } finally {
            this.e.a(list);
        }
    }

    @x1
    private cs1<ResourceType> c(sq1<DataType> sq1Var, int i, int i2, @x1 jq1 jq1Var, List<Throwable> list) throws xr1 {
        int size = this.c.size();
        cs1<ResourceType> cs1Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            lq1<DataType, ResourceType> lq1Var = this.c.get(i3);
            try {
                if (lq1Var.a(sq1Var.a(), jq1Var)) {
                    cs1Var = lq1Var.b(sq1Var.a(), i, i2, jq1Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable(a, 2)) {
                    String str = "Failed to decode data for " + lq1Var;
                }
                list.add(e);
            }
            if (cs1Var != null) {
                break;
            }
        }
        if (cs1Var != null) {
            return cs1Var;
        }
        throw new xr1(this.f, new ArrayList(list));
    }

    public cs1<Transcode> a(sq1<DataType> sq1Var, int i, int i2, @x1 jq1 jq1Var, a<ResourceType> aVar) throws xr1 {
        return this.d.a(aVar.a(b(sq1Var, i, i2, jq1Var)), jq1Var);
    }

    public String toString() {
        StringBuilder G = wo1.G("DecodePath{ dataClass=");
        G.append(this.b);
        G.append(", decoders=");
        G.append(this.c);
        G.append(", transcoder=");
        G.append(this.d);
        G.append('}');
        return G.toString();
    }
}