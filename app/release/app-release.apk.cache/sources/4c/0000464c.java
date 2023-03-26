package com.p7700g.p99005;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* loaded from: classes3.dex */
public abstract class hd2<S> extends Fragment {
    public final LinkedHashSet<gd2<S>> s = new LinkedHashSet<>();

    public boolean b(gd2<S> gd2Var) {
        return this.s.add(gd2Var);
    }

    public void d() {
        this.s.clear();
    }

    public abstract tc2<S> e();

    public boolean f(gd2<S> gd2Var) {
        return this.s.remove(gd2Var);
    }
}