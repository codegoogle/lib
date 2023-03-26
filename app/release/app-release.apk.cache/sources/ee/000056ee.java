package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes2.dex */
public class pu1 implements du1<wt1, InputStream> {
    public static final iq1<Integer> a = iq1.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    @z1
    private final cu1<wt1, wt1> b;

    /* compiled from: HttpGlideUrlLoader.java */
    /* loaded from: classes2.dex */
    public static class a implements eu1<wt1, InputStream> {
        private final cu1<wt1, wt1> a = new cu1<>(500);

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<wt1, InputStream> c(hu1 hu1Var) {
            return new pu1(this.a);
        }
    }

    public pu1() {
        this(null);
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<InputStream> b(@x1 wt1 wt1Var, int i, int i2, @x1 jq1 jq1Var) {
        cu1<wt1, wt1> cu1Var = this.b;
        if (cu1Var != null) {
            wt1 b = cu1Var.b(wt1Var, 0, 0);
            if (b == null) {
                this.b.c(wt1Var, 0, 0, wt1Var);
            } else {
                wt1Var = b;
            }
        }
        return new du1.a<>(wt1Var, new xq1(wt1Var, ((Integer) jq1Var.c(a)).intValue()));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 wt1 wt1Var) {
        return true;
    }

    public pu1(@z1 cu1<wt1, wt1> cu1Var) {
        this.b = cu1Var;
    }
}