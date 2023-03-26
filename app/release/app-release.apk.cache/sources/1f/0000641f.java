package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;

/* compiled from: MenuItemCompat.java */
/* loaded from: classes.dex */
public final class wq {
    private static final String a = "MenuItemCompat";
    @Deprecated
    public static final int b = 0;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    @Deprecated
    public static final int e = 4;
    @Deprecated
    public static final int f = 8;

    /* compiled from: MenuItemCompat.java */
    /* loaded from: classes.dex */
    public class a implements MenuItem.OnActionExpandListener {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(menuItem);
        }
    }

    /* compiled from: MenuItemCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @e1
        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @e1
        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @e1
        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @e1
        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @e1
        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @e1
        public static MenuItem g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @e1
        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @e1
        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @e1
        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @e1
        public static MenuItem k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @e1
        public static MenuItem l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        @e1
        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* compiled from: MenuItemCompat.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private wq() {
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @z1
    public static gq c(@x1 MenuItem menuItem) {
        if (menuItem instanceof vk) {
            return ((vk) menuItem).b();
        }
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(@x1 MenuItem menuItem) {
        if (menuItem instanceof vk) {
            return ((vk) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(menuItem);
        }
        return 0;
    }

    @z1
    public static CharSequence f(@x1 MenuItem menuItem) {
        if (menuItem instanceof vk) {
            return ((vk) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(menuItem);
        }
        return null;
    }

    @z1
    public static ColorStateList g(@x1 MenuItem menuItem) {
        if (menuItem instanceof vk) {
            return ((vk) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(menuItem);
        }
        return null;
    }

    @z1
    public static PorterDuff.Mode h(@x1 MenuItem menuItem) {
        if (menuItem instanceof vk) {
            return ((vk) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.d(menuItem);
        }
        return null;
    }

    public static int i(@x1 MenuItem menuItem) {
        if (menuItem instanceof vk) {
            return ((vk) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.e(menuItem);
        }
        return 0;
    }

    @z1
    public static CharSequence j(@x1 MenuItem menuItem) {
        if (menuItem instanceof vk) {
            return ((vk) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(menuItem);
        }
        return null;
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @z1
    public static MenuItem l(@x1 MenuItem menuItem, @z1 gq gqVar) {
        return menuItem instanceof vk ? ((vk) menuItem).a(gqVar) : menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(@x1 MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof vk) {
            ((vk) menuItem).setAlphabeticShortcut(c2, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.g(menuItem, c2, i);
        }
    }

    public static void p(@x1 MenuItem menuItem, @z1 CharSequence charSequence) {
        if (menuItem instanceof vk) {
            ((vk) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(@x1 MenuItem menuItem, @z1 ColorStateList colorStateList) {
        if (menuItem instanceof vk) {
            ((vk) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(@x1 MenuItem menuItem, @z1 PorterDuff.Mode mode) {
        if (menuItem instanceof vk) {
            ((vk) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.j(menuItem, mode);
        }
    }

    public static void s(@x1 MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof vk) {
            ((vk) menuItem).setNumericShortcut(c2, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.k(menuItem, c2, i);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(@x1 MenuItem menuItem, char c2, char c3, int i, int i2) {
        if (menuItem instanceof vk) {
            ((vk) menuItem).setShortcut(c2, c3, i, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.l(menuItem, c2, c3, i, i2);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    public static void w(@x1 MenuItem menuItem, @z1 CharSequence charSequence) {
        if (menuItem instanceof vk) {
            ((vk) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.m(menuItem, charSequence);
        }
    }
}