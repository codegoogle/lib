package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public class by {
    private static final String a = "FragmentManager";
    private final ArrayList<Fragment> b = new ArrayList<>();
    private final HashMap<String, yx> c = new HashMap<>();
    private sx d;

    public void a(@x1 Fragment fragment) {
        if (!this.b.contains(fragment)) {
            synchronized (this.b) {
                this.b.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void b() {
        this.c.values().removeAll(Collections.singleton(null));
    }

    public boolean c(@x1 String str) {
        return this.c.get(str) != null;
    }

    public void d(int i) {
        for (yx yxVar : this.c.values()) {
            if (yxVar != null) {
                yxVar.u(i);
            }
        }
    }

    public void e(@x1 String str, @z1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @z1 String[] strArr) {
        String t = wo1.t(str, "    ");
        if (!this.c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (yx yxVar : this.c.values()) {
                printWriter.print(str);
                if (yxVar != null) {
                    Fragment k = yxVar.k();
                    printWriter.println(k);
                    k.dump(t, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(pg1.d);
                }
            }
        }
        int size = this.b.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.b.get(i).toString());
            }
        }
    }

    @z1
    public Fragment f(@x1 String str) {
        yx yxVar = this.c.get(str);
        if (yxVar != null) {
            return yxVar.k();
        }
        return null;
    }

    @z1
    public Fragment g(@m1 int i) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            Fragment fragment = this.b.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (yx yxVar : this.c.values()) {
            if (yxVar != null) {
                Fragment k = yxVar.k();
                if (k.mFragmentId == i) {
                    return k;
                }
            }
        }
        return null;
    }

    @z1
    public Fragment h(@z1 String str) {
        if (str != null) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                Fragment fragment = this.b.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (yx yxVar : this.c.values()) {
                if (yxVar != null) {
                    Fragment k = yxVar.k();
                    if (str.equals(k.mTag)) {
                        return k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @z1
    public Fragment i(@x1 String str) {
        Fragment findFragmentByWho;
        for (yx yxVar : this.c.values()) {
            if (yxVar != null && (findFragmentByWho = yxVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public int j(@x1 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.b.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.b.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.b.size()) {
                return -1;
            }
            Fragment fragment3 = this.b.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public int k() {
        return this.c.size();
    }

    @x1
    public List<yx> l() {
        ArrayList arrayList = new ArrayList();
        for (yx yxVar : this.c.values()) {
            if (yxVar != null) {
                arrayList.add(yxVar);
            }
        }
        return arrayList;
    }

    @x1
    public List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        for (yx yxVar : this.c.values()) {
            if (yxVar != null) {
                arrayList.add(yxVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @z1
    public yx n(@x1 String str) {
        return this.c.get(str);
    }

    @x1
    public List<Fragment> o() {
        ArrayList arrayList;
        if (this.b.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        return arrayList;
    }

    public sx p() {
        return this.d;
    }

    public void q(@x1 yx yxVar) {
        Fragment k = yxVar.k();
        if (c(k.mWho)) {
            return;
        }
        this.c.put(k.mWho, yxVar);
        if (k.mRetainInstanceChangedWhileDetached) {
            if (k.mRetainInstance) {
                this.d.g(k);
            } else {
                this.d.p(k);
            }
            k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.T0(2)) {
            String str = "Added fragment to active set " + k;
        }
    }

    public void r(@x1 yx yxVar) {
        Fragment k = yxVar.k();
        if (k.mRetainInstance) {
            this.d.p(k);
        }
        if (this.c.put(k.mWho, null) != null && FragmentManager.T0(2)) {
            String str = "Removed fragment from active set " + k;
        }
    }

    public void s() {
        Iterator<Fragment> it = this.b.iterator();
        while (it.hasNext()) {
            yx yxVar = this.c.get(it.next().mWho);
            if (yxVar != null) {
                yxVar.m();
            }
        }
        for (yx yxVar2 : this.c.values()) {
            if (yxVar2 != null) {
                yxVar2.m();
                Fragment k = yxVar2.k();
                if (k.mRemoving && !k.isInBackStack()) {
                    r(yxVar2);
                }
            }
        }
    }

    public void t(@x1 Fragment fragment) {
        synchronized (this.b) {
            this.b.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void u() {
        this.c.clear();
    }

    public void v(@z1 List<String> list) {
        this.b.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = f(str);
                if (f != null) {
                    if (FragmentManager.T0(2)) {
                        String str2 = "restoreSaveState: added (" + str + "): " + f;
                    }
                    a(f);
                } else {
                    throw new IllegalStateException(wo1.u("No instantiated fragment for (", str, ")"));
                }
            }
        }
    }

    @x1
    public ArrayList<xx> w() {
        xx s;
        ArrayList<xx> arrayList = new ArrayList<>(this.c.size());
        for (yx yxVar : this.c.values()) {
            if (yxVar != null) {
                Fragment k = yxVar.k();
                arrayList.add(yxVar.s());
                if (FragmentManager.T0(2)) {
                    String str = "Saved state of " + k + ": " + s.E;
                }
            }
        }
        return arrayList;
    }

    @z1
    public ArrayList<String> x() {
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.b.size());
            Iterator<Fragment> it = this.b.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.T0(2)) {
                    String str = "saveAllState: adding fragment (" + next.mWho + "): " + next;
                }
            }
            return arrayList;
        }
    }

    public void y(@x1 sx sxVar) {
        this.d = sxVar;
    }
}