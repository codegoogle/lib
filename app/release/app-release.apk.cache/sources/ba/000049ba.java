package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.p7700g.p99005.i2;

/* compiled from: ActionMenuItem.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class j4 implements vk {
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 4;
    private static final int o = 8;
    private static final int p = 16;
    private Drawable A;
    private Context B;
    private MenuItem.OnMenuItemClickListener C;
    private CharSequence D;
    private CharSequence E;
    private final int q;
    private final int r;
    private final int s;
    private CharSequence t;
    private CharSequence u;
    private Intent v;
    private char w;
    private char y;
    private int x = 4096;
    private int z = 4096;
    private ColorStateList F = null;
    private PorterDuff.Mode G = null;
    private boolean H = false;
    private boolean I = false;
    private int J = 16;

    public j4(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.B = context;
        this.q = i2;
        this.r = i;
        this.s = i4;
        this.t = charSequence;
    }

    private void e() {
        Drawable drawable = this.A;
        if (drawable != null) {
            if (this.H || this.I) {
                Drawable r = fk.r(drawable);
                this.A = r;
                Drawable mutate = r.mutate();
                this.A = mutate;
                if (this.H) {
                    fk.o(mutate, this.F);
                }
                if (this.I) {
                    fk.p(this.A, this.G);
                }
            }
        }
    }

    @Override // com.p7700g.p99005.vk
    @x1
    public vk a(gq gqVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.vk
    public gq b() {
        return null;
    }

    @Override // com.p7700g.p99005.vk
    public boolean c() {
        return false;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // com.p7700g.p99005.vk
    public boolean d() {
        return true;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.C;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            Intent intent = this.v;
            if (intent != null) {
                this.B.startActivity(intent);
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    /* renamed from: g */
    public vk setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.z;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.y;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.A;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.F;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.G;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.v;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public int getNumericModifiers() {
        return this.x;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.u;
        return charSequence != null ? charSequence : this.t;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.E;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    /* renamed from: h */
    public vk setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public j4 i(boolean z) {
        this.J = (z ? 4 : 0) | (this.J & (-5));
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.J & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.J & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.J & 8) == 0;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    /* renamed from: j */
    public vk setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.y = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.J = (z ? 1 : 0) | (this.J & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.J = (z ? 2 : 0) | (this.J & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.J = (z ? 16 : 0) | (this.J & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.A = drawable;
        e();
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setIconTintList(@z1 ColorStateList colorStateList) {
        this.F = colorStateList;
        this.H = true;
        e();
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.G = mode;
        this.I = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.v = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.w = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.C = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.w = c;
        this.y = Character.toLowerCase(c2);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.t = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.u = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.J = (this.J & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.y = Character.toLowerCase(c);
        this.z = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public vk setContentDescription(CharSequence charSequence) {
        this.D = charSequence;
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setNumericShortcut(char c, int i) {
        this.w = c;
        this.x = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.t = this.B.getResources().getString(i);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public vk setTooltipText(CharSequence charSequence) {
        this.E = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.A = gh.i(this.B, i);
        e();
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.w = c;
        this.x = KeyEvent.normalizeMetaState(i);
        this.y = Character.toLowerCase(c2);
        this.z = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}