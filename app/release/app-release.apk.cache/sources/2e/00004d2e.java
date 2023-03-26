package com.p7700g.p99005;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class ks {

    /* compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class b implements a {
    }

    /* compiled from: AccessibilityManagerCompat.java */
    /* loaded from: classes.dex */
    public static class c implements AccessibilityManager.AccessibilityStateChangeListener {
        public a a;

        public c(@x1 a aVar) {
            this.a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.a.onAccessibilityStateChanged(z);
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static boolean a(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
        }

        @e1
        public static boolean b(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final e a;

        public f(@x1 e eVar) {
            this.a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.a.equals(((f) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.a.onTouchExplorationStateChanged(z);
        }
    }

    private ks() {
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new c(aVar));
    }

    public static boolean b(@x1 AccessibilityManager accessibilityManager, @x1 e eVar) {
        return d.a(accessibilityManager, eVar);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new c(aVar));
    }

    public static boolean g(@x1 AccessibilityManager accessibilityManager, @x1 e eVar) {
        return d.b(accessibilityManager, eVar);
    }
}