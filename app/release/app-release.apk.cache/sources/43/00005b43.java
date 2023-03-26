package com.p7700g.p99005;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p7700g.p99005.gq;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.x4;

/* compiled from: MenuItemImpl.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class s4 implements vk {
    private static final String l = "MenuItemImpl";
    private static final int m = 3;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 4;
    private static final int q = 8;
    private static final int r = 16;
    private static final int s = 32;
    public static final int t = 0;
    private Intent A;
    private char B;
    private char D;
    private Drawable F;
    public p4 H;
    private b5 I;
    private Runnable J;
    private MenuItem.OnMenuItemClickListener K;
    private CharSequence L;
    private CharSequence M;
    private int T;
    private View U;
    private gq V;
    private MenuItem.OnActionExpandListener W;
    private ContextMenu.ContextMenuInfo Y;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private CharSequence y;
    private CharSequence z;
    private int C = 4096;
    private int E = 4096;
    private int G = 0;
    private ColorStateList N = null;
    private PorterDuff.Mode O = null;
    private boolean P = false;
    private boolean Q = false;
    private boolean R = false;
    private int S = 16;
    private boolean X = false;

    /* compiled from: MenuItemImpl.java */
    /* loaded from: classes.dex */
    public class a implements gq.b {
        public a() {
        }

        @Override // com.p7700g.p99005.gq.b
        public void onActionProviderVisibilityChanged(boolean z) {
            s4 s4Var = s4.this;
            s4Var.H.M(s4Var);
        }
    }

    public s4(p4 p4Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.T = 0;
        this.H = p4Var;
        this.u = i2;
        this.v = i;
        this.w = i3;
        this.x = i4;
        this.y = charSequence;
        this.T = i5;
    }

    private static void f(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    private Drawable g(Drawable drawable) {
        if (drawable != null && this.R && (this.P || this.Q)) {
            drawable = fk.r(drawable).mutate();
            if (this.P) {
                fk.o(drawable, this.N);
            }
            if (this.Q) {
                fk.p(drawable, this.O);
            }
            this.R = false;
        }
        return drawable;
    }

    public void A(b5 b5Var) {
        this.I = b5Var;
        b5Var.setHeaderTitle(getTitle());
    }

    public boolean B(boolean z) {
        int i = this.S;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.S = i2;
        return i != i2;
    }

    public boolean C() {
        return this.H.D();
    }

    public boolean D() {
        return this.H.K() && j() != 0;
    }

    public boolean E() {
        return (this.T & 4) == 4;
    }

    @Override // com.p7700g.p99005.vk
    @x1
    public vk a(gq gqVar) {
        gq gqVar2 = this.V;
        if (gqVar2 != null) {
            gqVar2.reset();
        }
        this.U = null;
        this.V = gqVar;
        this.H.N(true);
        gq gqVar3 = this.V;
        if (gqVar3 != null) {
            gqVar3.setVisibilityListener(new a());
        }
        return this;
    }

    @Override // com.p7700g.p99005.vk
    public gq b() {
        return this.V;
    }

    @Override // com.p7700g.p99005.vk
    public boolean c() {
        return (d() || q()) ? false : true;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.T & 8) == 0) {
            return false;
        }
        if (this.U == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.W;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.H.g(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.vk
    public boolean d() {
        return (this.T & 2) == 2;
    }

    public void e() {
        this.H.L(this);
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public boolean expandActionView() {
        if (m()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.W;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.H.n(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public View getActionView() {
        View view = this.U;
        if (view != null) {
            return view;
        }
        gq gqVar = this.V;
        if (gqVar != null) {
            View onCreateActionView = gqVar.onCreateActionView(this);
            this.U = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.E;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.D;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.L;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.v;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.F;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.G != 0) {
            Drawable b = r3.b(this.H.x(), this.G);
            this.G = 0;
            this.F = b;
            return g(b);
        }
        return null;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.N;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.A;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.Y;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public int getNumericModifiers() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.I;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.y;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.z;
        return charSequence != null ? charSequence : this.y;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.M;
    }

    public Runnable h() {
        return this.J;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.I != null;
    }

    public int i() {
        return this.x;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.X;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.S & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.S & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.S & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        gq gqVar = this.V;
        return (gqVar == null || !gqVar.overridesItemVisibility()) ? (this.S & 8) == 0 : (this.S & 8) == 0 && this.V.isVisible();
    }

    public char j() {
        return this.H.J() ? this.D : this.B;
    }

    public String k() {
        char j = j();
        if (j == 0) {
            return "";
        }
        Resources resources = this.H.x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.H.x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(x2.k.r));
        }
        int i = this.H.J() ? this.E : this.C;
        f(sb, i, 65536, resources.getString(x2.k.n));
        f(sb, i, 4096, resources.getString(x2.k.j));
        f(sb, i, 2, resources.getString(x2.k.i));
        f(sb, i, 1, resources.getString(x2.k.o));
        f(sb, i, 4, resources.getString(x2.k.q));
        f(sb, i, 8, resources.getString(x2.k.m));
        if (j == '\b') {
            sb.append(resources.getString(x2.k.k));
        } else if (j == '\n') {
            sb.append(resources.getString(x2.k.l));
        } else if (j != ' ') {
            sb.append(j);
        } else {
            sb.append(resources.getString(x2.k.p));
        }
        return sb.toString();
    }

    public CharSequence l(x4.a aVar) {
        if (aVar != null && aVar.b()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    public boolean m() {
        gq gqVar;
        if ((this.T & 8) != 0) {
            if (this.U == null && (gqVar = this.V) != null) {
                this.U = gqVar.onCreateActionView(this);
            }
            return this.U != null;
        }
        return false;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.K;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            p4 p4Var = this.H;
            if (p4Var.i(p4Var, this)) {
                return true;
            }
            Runnable runnable = this.J;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.A != null) {
                try {
                    this.H.x().startActivity(this.A);
                    return true;
                } catch (ActivityNotFoundException unused) {
                }
            }
            gq gqVar = this.V;
            return gqVar != null && gqVar.onPerformDefaultAction();
        }
        return true;
    }

    public boolean o() {
        return (this.S & 32) == 32;
    }

    public boolean p() {
        return (this.S & 4) != 0;
    }

    public boolean q() {
        return (this.T & 1) == 1;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    /* renamed from: r */
    public vk setActionView(int i) {
        Context x = this.H.x();
        setActionView(LayoutInflater.from(x).inflate(i, (ViewGroup) new LinearLayout(x), false));
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    /* renamed from: s */
    public vk setActionView(View view) {
        int i;
        this.U = view;
        this.V = null;
        if (view != null && view.getId() == -1 && (i = this.u) > 0) {
            view.setId(i);
        }
        this.H.L(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.D == c) {
            return this;
        }
        this.D = Character.toLowerCase(c);
        this.H.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.S;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.S = i2;
        if (i != i2) {
            this.H.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.S & 4) != 0) {
            this.H.a0(this);
        } else {
            v(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.S |= 16;
        } else {
            this.S &= -17;
        }
        this.H.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.G = 0;
        this.F = drawable;
        this.R = true;
        this.H.N(false);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setIconTintList(@z1 ColorStateList colorStateList) {
        this.N = colorStateList;
        this.P = true;
        this.R = true;
        this.H.N(false);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.O = mode;
        this.Q = true;
        this.R = true;
        this.H.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.A = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.B == c) {
            return this;
        }
        this.B = c;
        this.H.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.W = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.K = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.B = c;
        this.D = Character.toLowerCase(c2);
        this.H.N(false);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.T = i;
        this.H.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.y = charSequence;
        this.H.N(false);
        b5 b5Var = this.I;
        if (b5Var != null) {
            b5Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.z = charSequence;
        this.H.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (B(z)) {
            this.H.M(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.X = z;
        this.H.N(false);
    }

    public String toString() {
        CharSequence charSequence = this.y;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.J = runnable;
        return this;
    }

    public void v(boolean z) {
        int i = this.S;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.S = i2;
        if (i != i2) {
            this.H.N(false);
        }
    }

    public void w(boolean z) {
        this.S = (z ? 4 : 0) | (this.S & (-5));
    }

    public void x(boolean z) {
        if (z) {
            this.S |= 32;
        } else {
            this.S &= -33;
        }
    }

    public void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.Y = contextMenuInfo;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    /* renamed from: z */
    public vk setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public vk setContentDescription(CharSequence charSequence) {
        this.L = charSequence;
        this.H.N(false);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public vk setTooltipText(CharSequence charSequence) {
        this.M = charSequence;
        this.H.N(false);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.D == c && this.E == i) {
            return this;
        }
        this.D = Character.toLowerCase(c);
        this.E = KeyEvent.normalizeMetaState(i);
        this.H.N(false);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.B == c && this.C == i) {
            return this;
        }
        this.B = c;
        this.C = KeyEvent.normalizeMetaState(i);
        this.H.N(false);
        return this;
    }

    @Override // com.p7700g.p99005.vk, android.view.MenuItem
    @x1
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.B = c;
        this.C = KeyEvent.normalizeMetaState(i);
        this.D = Character.toLowerCase(c2);
        this.E = KeyEvent.normalizeMetaState(i2);
        this.H.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.F = null;
        this.G = i;
        this.R = true;
        this.H.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.H.x().getString(i));
    }
}