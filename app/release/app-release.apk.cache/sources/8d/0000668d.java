package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.x10;

/* compiled from: MediaSessionManagerImplApi21.java */
@e2(21)
/* loaded from: classes.dex */
public class y10 extends a20 {
    public y10(Context context) {
        super(context);
        this.f = context;
    }

    private boolean d(@x1 x10.c cVar) {
        return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.b(), cVar.a()) == 0;
    }

    @Override // com.p7700g.p99005.a20, com.p7700g.p99005.x10.a
    public boolean a(@x1 x10.c cVar) {
        return d(cVar) || super.a(cVar);
    }
}