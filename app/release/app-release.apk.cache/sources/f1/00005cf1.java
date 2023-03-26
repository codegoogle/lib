package com.p7700g.p99005;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.m00;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class sx extends k00 {
    private static final String d = "FragmentManager";
    private static final m00.b e = new a();
    private final boolean i;
    private final HashMap<String, Fragment> f = new HashMap<>();
    private final HashMap<String, sx> g = new HashMap<>();
    private final HashMap<String, p00> h = new HashMap<>();
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    public class a implements m00.b {
        @Override // com.p7700g.p99005.m00.b
        @x1
        public <T extends k00> T a(@x1 Class<T> cls) {
            return new sx(true);
        }

        @Override // com.p7700g.p99005.m00.b
        public /* synthetic */ k00 b(Class cls, z00 z00Var) {
            return n00.b(this, cls, z00Var);
        }
    }

    public sx(boolean z) {
        this.i = z;
    }

    @x1
    public static sx k(p00 p00Var) {
        return (sx) new m00(p00Var, e).a(sx.class);
    }

    @Override // com.p7700g.p99005.k00
    public void e() {
        if (FragmentManager.T0(3)) {
            String str = "onCleared called for " + this;
        }
        this.j = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sx.class != obj.getClass()) {
            return false;
        }
        sx sxVar = (sx) obj;
        return this.f.equals(sxVar.f) && this.g.equals(sxVar.g) && this.h.equals(sxVar.h);
    }

    public void g(@x1 Fragment fragment) {
        if (this.l) {
            FragmentManager.T0(2);
        } else if (this.f.containsKey(fragment.mWho)) {
        } else {
            this.f.put(fragment.mWho, fragment);
            if (FragmentManager.T0(2)) {
                String str = "Updating retained Fragments: Added " + fragment;
            }
        }
    }

    public void h(@x1 Fragment fragment) {
        if (FragmentManager.T0(3)) {
            String str = "Clearing non-config state for " + fragment;
        }
        sx sxVar = this.g.get(fragment.mWho);
        if (sxVar != null) {
            sxVar.e();
            this.g.remove(fragment.mWho);
        }
        p00 p00Var = this.h.get(fragment.mWho);
        if (p00Var != null) {
            p00Var.a();
            this.h.remove(fragment.mWho);
        }
    }

    public int hashCode() {
        int hashCode = this.g.hashCode();
        return this.h.hashCode() + ((hashCode + (this.f.hashCode() * 31)) * 31);
    }

    @z1
    public Fragment i(String str) {
        return this.f.get(str);
    }

    @x1
    public sx j(@x1 Fragment fragment) {
        sx sxVar = this.g.get(fragment.mWho);
        if (sxVar == null) {
            sx sxVar2 = new sx(this.i);
            this.g.put(fragment.mWho, sxVar2);
            return sxVar2;
        }
        return sxVar;
    }

    @x1
    public Collection<Fragment> l() {
        return new ArrayList(this.f.values());
    }

    @z1
    @Deprecated
    public qx m() {
        if (this.f.isEmpty() && this.g.isEmpty() && this.h.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, sx> entry : this.g.entrySet()) {
            qx m = entry.getValue().m();
            if (m != null) {
                hashMap.put(entry.getKey(), m);
            }
        }
        this.k = true;
        if (this.f.isEmpty() && hashMap.isEmpty() && this.h.isEmpty()) {
            return null;
        }
        return new qx(new ArrayList(this.f.values()), hashMap, new HashMap(this.h));
    }

    @x1
    public p00 n(@x1 Fragment fragment) {
        p00 p00Var = this.h.get(fragment.mWho);
        if (p00Var == null) {
            p00 p00Var2 = new p00();
            this.h.put(fragment.mWho, p00Var2);
            return p00Var2;
        }
        return p00Var;
    }

    public boolean o() {
        return this.j;
    }

    public void p(@x1 Fragment fragment) {
        if (this.l) {
            FragmentManager.T0(2);
            return;
        }
        if ((this.f.remove(fragment.mWho) != null) && FragmentManager.T0(2)) {
            String str = "Updating retained Fragments: Removed " + fragment;
        }
    }

    @Deprecated
    public void q(@z1 qx qxVar) {
        this.f.clear();
        this.g.clear();
        this.h.clear();
        if (qxVar != null) {
            Collection<Fragment> b = qxVar.b();
            if (b != null) {
                for (Fragment fragment : b) {
                    if (fragment != null) {
                        this.f.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, qx> a2 = qxVar.a();
            if (a2 != null) {
                for (Map.Entry<String, qx> entry : a2.entrySet()) {
                    sx sxVar = new sx(this.i);
                    sxVar.q(entry.getValue());
                    this.g.put(entry.getKey(), sxVar);
                }
            }
            Map<String, p00> c = qxVar.c();
            if (c != null) {
                this.h.putAll(c);
            }
        }
        this.k = false;
    }

    public void r(boolean z) {
        this.l = z;
    }

    public boolean s(@x1 Fragment fragment) {
        if (this.f.containsKey(fragment.mWho)) {
            if (this.i) {
                return this.j;
            }
            return !this.k;
        }
        return true;
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.g.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.h.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}