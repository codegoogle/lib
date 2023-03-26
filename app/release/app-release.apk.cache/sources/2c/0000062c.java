package com.anythink.core.common.d;

import android.content.Context;
import com.anythink.core.common.c.h;
import com.anythink.core.common.e.u;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    public h a;
    public int b;

    public a(Context context) {
        this.a = h.a(com.anythink.core.common.c.c.a(context));
    }

    public final void a(String str, int i, int i2) {
        this.a.a(this.b, str, i, i2);
    }

    public final void a(String str, long j) {
        this.a.a(this.b, str, j);
    }

    public final void a(String str, String str2) {
        this.a.a(str, this.b, str2);
    }

    private List<u> a() {
        return this.a.a(this.b);
    }

    public final List<u> a(List<String> list) {
        return this.a.a(list, this.b);
    }
}