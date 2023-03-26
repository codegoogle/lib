package com.p7700g.p99005;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.p7700g.p99005.j41;
import java.util.List;

/* compiled from: ConfigUrlProvider.java */
/* loaded from: classes.dex */
public class x71 extends w71 {
    @x1
    private final c81 g;
    private final int h;

    public x71(@x1 Gson gson, @x1 o51 o51Var, @x1 s41 s41Var, @x1 h31 h31Var, @x1 c81 c81Var, @d2 int i) {
        super(gson, o51Var, s41Var, h31Var);
        this.g = c81Var;
        this.h = i;
    }

    @Override // com.p7700g.p99005.w71
    @z1
    public String f() {
        en1 b = b();
        try {
            j41.b bVar = (j41.b) this.c.n(this.g.b(this.h), j41.b.class);
            if (bVar.e()) {
                List<String> d = bVar.d(b != en1.CONNECTED);
                kj1 kj1Var = w71.a;
                kj1Var.c("Got domains from embedded config: %s", TextUtils.join(", ", d));
                String c = c(bVar, d);
                kj1Var.c("Return url from embedded config: %s state: %s", c, b);
                return c;
            }
        } catch (Throwable th) {
            w71.a.f(th);
        }
        return super.f();
    }
}