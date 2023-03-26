package com.p7700g.p99005;

import android.text.TextUtils;
import com.p7700g.p99005.du1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseGlideUrlLoader.java */
/* loaded from: classes2.dex */
public abstract class ou1<Model> implements du1<Model, InputStream> {
    private final du1<wt1, InputStream> a;
    @z1
    private final cu1<Model, wt1> b;

    public ou1(du1<wt1, InputStream> du1Var) {
        this(du1Var, null);
    }

    private static List<gq1> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            arrayList.add(new wt1(str));
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.du1
    @z1
    public du1.a<InputStream> b(@x1 Model model, int i, int i2, @x1 jq1 jq1Var) {
        cu1<Model, wt1> cu1Var = this.b;
        wt1 b = cu1Var != null ? cu1Var.b(model, i, i2) : null;
        if (b == null) {
            String f = f(model, i, i2, jq1Var);
            if (TextUtils.isEmpty(f)) {
                return null;
            }
            wt1 wt1Var = new wt1(f, e(model, i, i2, jq1Var));
            cu1<Model, wt1> cu1Var2 = this.b;
            if (cu1Var2 != null) {
                cu1Var2.c(model, i, i2, wt1Var);
            }
            b = wt1Var;
        }
        List<String> d = d(model, i, i2, jq1Var);
        du1.a<InputStream> b2 = this.a.b(b, i, i2, jq1Var);
        return (b2 == null || d.isEmpty()) ? b2 : new du1.a<>(b2.a, c(d), b2.c);
    }

    public List<String> d(Model model, int i, int i2, jq1 jq1Var) {
        return Collections.emptyList();
    }

    @z1
    public xt1 e(Model model, int i, int i2, jq1 jq1Var) {
        return xt1.b;
    }

    public abstract String f(Model model, int i, int i2, jq1 jq1Var);

    public ou1(du1<wt1, InputStream> du1Var, @z1 cu1<Model, wt1> cu1Var) {
        this.a = du1Var;
        this.b = cu1Var;
    }
}