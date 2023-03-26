package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;
import java.util.Collection;

/* compiled from: DateSelector.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface tc2<S> extends Parcelable {
    @x1
    View A(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle, @x1 oc2 oc2Var, @x1 gd2<S> gd2Var);

    @l2
    int E();

    @m2
    int P(Context context);

    boolean U();

    @x1
    Collection<Long> X();

    void X2(long j);

    @z1
    S Z();

    @x1
    String a(Context context);

    @x1
    Collection<fp<Long, Long>> f();

    void h(@x1 S s);
}