package com.p7700g.p99005;

import android.text.TextUtils;
import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;

/* compiled from: PrefsConfigUrlProvider.java */
/* loaded from: classes.dex */
public class y71 extends w71 {
    public y71(@x1 Gson gson, @x1 o51 o51Var, @x1 s41 s41Var, @x1 h31 h31Var) {
        super(gson, o51Var, s41Var, h31Var);
    }

    @Override // com.p7700g.p99005.w71
    @z1
    public String f() {
        dq0<String> a = this.e.a();
        try {
            a.Z(2L, TimeUnit.SECONDS);
            String F = a.F();
            if (!TextUtils.isEmpty(F)) {
                return F;
            }
        } catch (Throwable th) {
            w71.a.f(th);
        }
        return super.f();
    }
}