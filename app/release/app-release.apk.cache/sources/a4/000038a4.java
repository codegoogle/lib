package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.fb0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositePageTransformer.java */
/* loaded from: classes.dex */
public final class ab0 implements fb0.m {
    private final List<fb0.m> a = new ArrayList();

    @Override // com.p7700g.p99005.fb0.m
    public void a(@x1 View view, float f) {
        for (fb0.m mVar : this.a) {
            mVar.a(view, f);
        }
    }

    public void b(@x1 fb0.m mVar) {
        this.a.add(mVar);
    }

    public void c(@x1 fb0.m mVar) {
        this.a.remove(mVar);
    }
}