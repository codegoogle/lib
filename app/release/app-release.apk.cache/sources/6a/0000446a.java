package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.pe2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CheckableGroup.java */
@i2({i2.a.LIBRARY_GROUP})
@q2
/* loaded from: classes3.dex */
public class ge2<T extends pe2<T>> {
    private final Map<Integer, T> a = new HashMap();
    private final Set<Integer> b = new HashSet();
    private b c;
    private boolean d;
    private boolean e;

    /* compiled from: CheckableGroup.java */
    /* loaded from: classes3.dex */
    public class a implements pe2.a<T> {
        public a() {
        }

        @Override // com.p7700g.p99005.pe2.a
        /* renamed from: b */
        public void a(T t, boolean z) {
            if (z) {
                if (!ge2.this.g(t)) {
                    return;
                }
            } else {
                ge2 ge2Var = ge2.this;
                if (!ge2Var.t(t, ge2Var.e)) {
                    return;
                }
            }
            ge2.this.n();
        }
    }

    /* compiled from: CheckableGroup.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(@x1 Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(@x1 pe2<T> pe2Var) {
        int id = pe2Var.getId();
        if (this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.a.get(Integer.valueOf(k()));
        if (t != null) {
            t(t, false);
        }
        boolean add = this.b.add(Integer.valueOf(id));
        if (!pe2Var.isChecked()) {
            pe2Var.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(@x1 pe2<T> pe2Var, boolean z) {
        int id = pe2Var.getId();
        if (this.b.contains(Integer.valueOf(id))) {
            if (z && this.b.size() == 1 && this.b.contains(Integer.valueOf(id))) {
                pe2Var.setChecked(true);
                return false;
            }
            boolean remove = this.b.remove(Integer.valueOf(id));
            if (pe2Var.isChecked()) {
                pe2Var.setChecked(false);
            }
            return remove;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t) {
        this.a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            g(t);
        }
        t.setInternalOnCheckedChangeListener(new a());
    }

    public void f(@m1 int i) {
        T t = this.a.get(Integer.valueOf(i));
        if (t != null && g(t)) {
            n();
        }
    }

    public void h() {
        boolean z = !this.b.isEmpty();
        for (T t : this.a.values()) {
            t(t, false);
        }
        if (z) {
            n();
        }
    }

    @x1
    public Set<Integer> i() {
        return new HashSet(this.b);
    }

    @x1
    public List<Integer> j(@x1 ViewGroup viewGroup) {
        Set<Integer> i = i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof pe2) && i.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @m1
    public int k() {
        if (!this.d || this.b.isEmpty()) {
            return -1;
        }
        return this.b.iterator().next().intValue();
    }

    public boolean l() {
        return this.e;
    }

    public boolean m() {
        return this.d;
    }

    public void o(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.a.remove(Integer.valueOf(t.getId()));
        this.b.remove(Integer.valueOf(t.getId()));
    }

    public void p(@z1 b bVar) {
        this.c = bVar;
    }

    public void q(boolean z) {
        this.e = z;
    }

    public void r(boolean z) {
        if (this.d != z) {
            this.d = z;
            h();
        }
    }

    public void s(@m1 int i) {
        T t = this.a.get(Integer.valueOf(i));
        if (t != null && t(t, this.e)) {
            n();
        }
    }
}