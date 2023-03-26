package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import com.p7700g.p99005.gq;
import com.p7700g.p99005.i2;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class t4 extends l4 implements MenuItem {
    public static final String o = "MenuItemWrapper";
    private final vk p;
    private Method q;

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public class a extends gq {
        public final ActionProvider a;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.a = actionProvider;
        }

        @Override // com.p7700g.p99005.gq
        public boolean hasSubMenu() {
            return this.a.hasSubMenu();
        }

        @Override // com.p7700g.p99005.gq
        public View onCreateActionView() {
            return this.a.onCreateActionView();
        }

        @Override // com.p7700g.p99005.gq
        public boolean onPerformDefaultAction() {
            return this.a.onPerformDefaultAction();
        }

        @Override // com.p7700g.p99005.gq
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.a.onPrepareSubMenu(t4.this.f(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    @e2(16)
    /* loaded from: classes.dex */
    public class b extends a implements ActionProvider.VisibilityListener {
        private gq.b c;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // com.p7700g.p99005.gq
        public boolean isVisible() {
            return this.a.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            gq.b bVar = this.c;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // com.p7700g.p99005.gq
        public View onCreateActionView(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        @Override // com.p7700g.p99005.gq
        public boolean overridesItemVisibility() {
            return this.a.overridesItemVisibility();
        }

        @Override // com.p7700g.p99005.gq
        public void refreshVisibility() {
            this.a.refreshVisibility();
        }

        @Override // com.p7700g.p99005.gq
        public void setVisibilityListener(gq.b bVar) {
            this.c = bVar;
            this.a.setVisibilityListener(bVar != null ? this : null);
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public static class c extends FrameLayout implements c4 {
        public final CollapsibleActionView s;

        public c(View view) {
            super(view.getContext());
            this.s = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.s;
        }

        @Override // com.p7700g.p99005.c4
        public void onActionViewCollapsed() {
            this.s.onActionViewCollapsed();
        }

        @Override // com.p7700g.p99005.c4
        public void onActionViewExpanded() {
            this.s.onActionViewExpanded();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public class d implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(t4.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(t4.this.e(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public class e implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(t4.this.e(menuItem));
        }
    }

    public t4(Context context, vk vkVar) {
        super(context);
        if (vkVar != null) {
            this.p = vkVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.p.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.p.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        gq b2 = this.p.b();
        if (b2 instanceof a) {
            return ((a) b2).a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.p.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.p.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.p.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.p.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.p.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.p.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.p.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.p.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.p.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.p.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.p.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.p.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.p.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.p.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.p.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.p.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.p.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.p.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.p.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.p.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.p.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.p.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.p.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.p.isVisible();
    }

    public void j(boolean z) {
        try {
            if (this.q == null) {
                this.q = this.p.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.q.invoke(this.p, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.l, actionProvider);
        vk vkVar = this.p;
        if (actionProvider == null) {
            bVar = null;
        }
        vkVar.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.p.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.p.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.p.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.p.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.p.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.p.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.p.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.p.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.p.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.p.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.p.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.p.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.p.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.p.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.p.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.p.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.p.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.p.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.p.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.p.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.p.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.p.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.p.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.p.setActionView(i);
        View actionView = this.p.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.p.setActionView(new c(actionView));
        }
        return this;
    }
}