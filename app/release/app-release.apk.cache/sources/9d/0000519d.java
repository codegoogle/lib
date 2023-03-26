package com.p7700g.p99005;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class n30 extends fq {
    public final RecyclerView d;
    private final a e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends fq {
        public final n30 d;
        private Map<View, fq> e = new WeakHashMap();

        public a(@x1 n30 n30Var) {
            this.d = n30Var;
        }

        @Override // com.p7700g.p99005.fq
        public boolean a(@x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
            fq fqVar = this.e.get(view);
            if (fqVar != null) {
                return fqVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // com.p7700g.p99005.fq
        @z1
        public ms b(@x1 View view) {
            fq fqVar = this.e.get(view);
            if (fqVar != null) {
                return fqVar.b(view);
            }
            return super.b(view);
        }

        @Override // com.p7700g.p99005.fq
        public void f(@x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
            fq fqVar = this.e.get(view);
            if (fqVar != null) {
                fqVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().f1(view, lsVar);
                fq fqVar = this.e.get(view);
                if (fqVar != null) {
                    fqVar.g(view, lsVar);
                    return;
                } else {
                    super.g(view, lsVar);
                    return;
                }
            }
            super.g(view, lsVar);
        }

        @Override // com.p7700g.p99005.fq
        public void h(@x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
            fq fqVar = this.e.get(view);
            if (fqVar != null) {
                fqVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // com.p7700g.p99005.fq
        public boolean i(@x1 ViewGroup viewGroup, @x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
            fq fqVar = this.e.get(viewGroup);
            if (fqVar != null) {
                return fqVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // com.p7700g.p99005.fq
        public boolean j(View view, int i, Bundle bundle) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                fq fqVar = this.e.get(view);
                if (fqVar != null) {
                    if (fqVar.j(view, i, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i, bundle)) {
                    return true;
                }
                return this.d.d.getLayoutManager().z1(view, i, bundle);
            }
            return super.j(view, i, bundle);
        }

        @Override // com.p7700g.p99005.fq
        public void l(@x1 View view, int i) {
            fq fqVar = this.e.get(view);
            if (fqVar != null) {
                fqVar.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // com.p7700g.p99005.fq
        public void m(@x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
            fq fqVar = this.e.get(view);
            if (fqVar != null) {
                fqVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public fq n(View view) {
            return this.e.remove(view);
        }

        public void o(View view) {
            fq D = sr.D(view);
            if (D == null || D == this) {
                return;
            }
            this.e.put(view, D);
        }
    }

    public n30(@x1 RecyclerView recyclerView) {
        this.d = recyclerView;
        fq n = n();
        if (n != null && (n instanceof a)) {
            this.e = (a) n;
        } else {
            this.e = new a(this);
        }
    }

    @Override // com.p7700g.p99005.fq
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().b1(accessibilityEvent);
        }
    }

    @Override // com.p7700g.p99005.fq
    public void g(View view, ls lsVar) {
        super.g(view, lsVar);
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().d1(lsVar);
    }

    @Override // com.p7700g.p99005.fq
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().x1(i, bundle);
    }

    @x1
    public fq n() {
        return this.e;
    }

    public boolean o() {
        return this.d.B0();
    }
}