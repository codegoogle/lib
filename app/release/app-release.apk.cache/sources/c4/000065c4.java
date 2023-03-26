package com.p7700g.p99005;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.fi3;
import com.p7700g.p99005.jm3;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: OSSystemConditionController.java */
/* loaded from: classes3.dex */
public class xl3 {
    private static final String a = "com.p7700g.p99005.xl3";
    private final c b;

    /* compiled from: OSSystemConditionController.java */
    /* loaded from: classes3.dex */
    public class a extends FragmentManager.m {
        public final /* synthetic */ FragmentManager a;

        public a(FragmentManager fragmentManager) {
            this.a = fragmentManager;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void e(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
            super.e(fragmentManager, fragment);
            if (fragment instanceof gx) {
                this.a.T1(this);
                xl3.this.b.c();
            }
        }
    }

    /* compiled from: OSSystemConditionController.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(@x1 String str, @x1 fi3.c cVar);
    }

    /* compiled from: OSSystemConditionController.java */
    /* loaded from: classes3.dex */
    public interface c {
        void c();
    }

    public xl3(c cVar) {
        this.b = cVar;
    }

    public boolean b(Context context) throws NoClassDefFoundError {
        if (context instanceof d3) {
            FragmentManager L = ((d3) context).L();
            L.v1(new a(L), true);
            List<Fragment> G0 = L.G0();
            int size = G0.size();
            if (size > 0) {
                Fragment fragment = G0.get(size - 1);
                return fragment.isVisible() && (fragment instanceof gx);
            }
            return false;
        }
        return false;
    }

    public boolean c() {
        if (jm3.f0() == null) {
            jm3.P1(jm3.u0.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (b(jm3.f0())) {
                jm3.P1(jm3.u0.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        } catch (NoClassDefFoundError e) {
            jm3.u0 u0Var = jm3.u0.INFO;
            jm3.P1(u0Var, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e);
        }
        fi3 b2 = gi3.b();
        boolean l = gm3.l(new WeakReference(jm3.f0()));
        if (l && b2 != null) {
            b2.c(a, this.b);
            jm3.P1(jm3.u0.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return !l;
    }
}