package com.p7700g.p99005;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class ms {
    public static final int a = -1;
    @z1
    private final Object b;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {
        public final ms a;

        public a(ms msVar) {
            this.a = msVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            ls b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.W1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<ls> c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).W1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(ms msVar) {
            super(msVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            ls d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.W1();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(ms msVar) {
            super(msVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, ls.X1(accessibilityNodeInfo), str, bundle);
        }
    }

    public ms() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = new c(this);
        } else {
            this.b = new b(this);
        }
    }

    public void a(int i, @x1 ls lsVar, @x1 String str, @z1 Bundle bundle) {
    }

    @z1
    public ls b(int i) {
        return null;
    }

    @z1
    public List<ls> c(@x1 String str, int i) {
        return null;
    }

    @z1
    public ls d(int i) {
        return null;
    }

    @z1
    public Object e() {
        return this.b;
    }

    public boolean f(int i, int i2, @z1 Bundle bundle) {
        return false;
    }

    public ms(@z1 Object obj) {
        this.b = obj;
    }
}