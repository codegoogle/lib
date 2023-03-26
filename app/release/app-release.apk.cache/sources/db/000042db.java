package com.p7700g.p99005;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.nf;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class fq {
    private static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate b;
    private final View.AccessibilityDelegate c;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {
        public final fq a;

        public a(fq fqVar) {
            this.a = fqVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @e2(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            ms b = this.a.b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            ls X1 = ls.X1(accessibilityNodeInfo);
            X1.E1(sr.Y0(view));
            X1.k1(sr.M0(view));
            X1.y1(sr.I(view));
            X1.K1(sr.u0(view));
            this.a.g(view, X1);
            X1.f(accessibilityNodeInfo.getText(), view);
            List<ls.a> c = fq.c(view);
            for (int i = 0; i < c.size(); i++) {
                X1.b(c.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.a.l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @e1
        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public fq() {
        this(a);
    }

    public static List<ls.a> c(View view) {
        List<ls.a> list = (List) view.getTag(nf.e.d0);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] x = ls.x(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; x != null && i < x.length; i++) {
                if (clickableSpan.equals(x[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(nf.e.e0);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (e(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    public boolean a(@x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @z1
    public ms b(@x1 View view) {
        AccessibilityNodeProvider a2 = b.a(this.b, view);
        if (a2 != null) {
            return new ms(a2);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.c;
    }

    public void f(@x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(@x1 View view, @x1 ls lsVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, lsVar.W1());
    }

    public void h(@x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
        this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(@x1 ViewGroup viewGroup, @x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(@x1 View view, int i, @z1 Bundle bundle) {
        List<ls.a> c = c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            ls.a aVar = c.get(i2);
            if (aVar.b() == i) {
                z = aVar.d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = b.b(this.b, view, i, bundle);
        }
        return (z || i != nf.e.a || bundle == null) ? z : k(bundle.getInt(is.s, -1), view);
    }

    public void l(@x1 View view, int i) {
        this.b.sendAccessibilityEvent(view, i);
    }

    public void m(@x1 View view, @x1 AccessibilityEvent accessibilityEvent) {
        this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public fq(@x1 View.AccessibilityDelegate accessibilityDelegate) {
        this.b = accessibilityDelegate;
        this.c = new a(this);
    }
}