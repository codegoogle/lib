package com.p7700g.p99005;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class cd2<S> extends hd2<S> {
    private static final String t = "THEME_RES_ID_KEY";
    private static final String u = "DATE_SELECTOR_KEY";
    private static final String v = "CALENDAR_CONSTRAINTS_KEY";
    @m2
    private int w;
    @z1
    private tc2<S> x;
    @z1
    private oc2 y;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes3.dex */
    public class a extends gd2<S> {
        public a() {
        }

        @Override // com.p7700g.p99005.gd2
        public void a() {
            Iterator<gd2<S>> it = cd2.this.s.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.p7700g.p99005.gd2
        public void b(S s) {
            Iterator<gd2<S>> it = cd2.this.s.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    @x1
    public static <T> cd2<T> g(tc2<T> tc2Var, @m2 int i, @x1 oc2 oc2Var) {
        cd2<T> cd2Var = new cd2<>();
        Bundle bundle = new Bundle();
        bundle.putInt(t, i);
        bundle.putParcelable(u, tc2Var);
        bundle.putParcelable(v, oc2Var);
        cd2Var.setArguments(bundle);
        return cd2Var;
    }

    @Override // com.p7700g.p99005.hd2
    @x1
    public tc2<S> e() {
        tc2<S> tc2Var = this.x;
        if (tc2Var != null) {
            return tc2Var;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.w = bundle.getInt(t);
        this.x = (tc2) bundle.getParcelable(u);
        this.y = (oc2) bundle.getParcelable(v);
    }

    @Override // androidx.fragment.app.Fragment
    @x1
    public View onCreateView(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle) {
        return this.x.A(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.w)), viewGroup, bundle, this.y, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@x1 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(t, this.w);
        bundle.putParcelable(u, this.x);
        bundle.putParcelable(v, this.y);
    }
}