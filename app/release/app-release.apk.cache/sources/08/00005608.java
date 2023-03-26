package com.p7700g.p99005;

import android.widget.Checkable;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.pe2;

/* compiled from: MaterialCheckable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface pe2<T extends pe2<T>> extends Checkable {

    /* compiled from: MaterialCheckable.java */
    /* loaded from: classes3.dex */
    public interface a<C> {
        void a(C c, boolean z);
    }

    @m1
    int getId();

    void setInternalOnCheckedChangeListener(@z1 a<T> aVar);
}