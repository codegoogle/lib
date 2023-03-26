package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.p7700g.p99005.a02;

/* compiled from: ViewTransition.java */
/* loaded from: classes2.dex */
public class f02<R> implements a02<R> {
    private final a a;

    /* compiled from: ViewTransition.java */
    /* loaded from: classes2.dex */
    public interface a {
        Animation a(Context context);
    }

    public f02(a aVar) {
        this.a = aVar;
    }

    @Override // com.p7700g.p99005.a02
    public boolean a(R r, a02.a aVar) {
        View view = aVar.getView();
        if (view != null) {
            view.clearAnimation();
            view.startAnimation(this.a.a(view.getContext()));
            return false;
        }
        return false;
    }
}