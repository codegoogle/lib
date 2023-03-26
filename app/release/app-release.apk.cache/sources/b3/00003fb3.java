package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.a02;

/* compiled from: ViewPropertyTransition.java */
/* loaded from: classes2.dex */
public class e02<R> implements a02<R> {
    private final a a;

    /* compiled from: ViewPropertyTransition.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(View view);
    }

    public e02(a aVar) {
        this.a = aVar;
    }

    @Override // com.p7700g.p99005.a02
    public boolean a(R r, a02.a aVar) {
        if (aVar.getView() != null) {
            this.a.a(aVar.getView());
            return false;
        }
        return false;
    }
}