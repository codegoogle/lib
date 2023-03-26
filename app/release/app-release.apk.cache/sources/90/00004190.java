package com.p7700g.p99005;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.p7700g.p99005.b4;
import com.p7700g.p99005.i2;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f4 extends ActionMode {
    public final Context a;
    public final b4 b;

    /* compiled from: SupportActionModeWrapper.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class a implements b4.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<f4> c = new ArrayList<>();
        public final y7<Menu, Menu> d = new y7<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                y4 y4Var = new y4(this.b, (tk) menu);
                this.d.put(menu, y4Var);
                return y4Var;
            }
            return menu2;
        }

        @Override // com.p7700g.p99005.b4.a
        public void a(b4 b4Var) {
            this.a.onDestroyActionMode(e(b4Var));
        }

        @Override // com.p7700g.p99005.b4.a
        public boolean b(b4 b4Var, Menu menu) {
            return this.a.onCreateActionMode(e(b4Var), f(menu));
        }

        @Override // com.p7700g.p99005.b4.a
        public boolean c(b4 b4Var, Menu menu) {
            return this.a.onPrepareActionMode(e(b4Var), f(menu));
        }

        @Override // com.p7700g.p99005.b4.a
        public boolean d(b4 b4Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(b4Var), new t4(this.b, (vk) menuItem));
        }

        public ActionMode e(b4 b4Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                f4 f4Var = this.c.get(i);
                if (f4Var != null && f4Var.b == b4Var) {
                    return f4Var;
                }
            }
            f4 f4Var2 = new f4(this.b, b4Var);
            this.c.add(f4Var2);
            return f4Var2;
        }
    }

    public f4(Context context, b4 b4Var) {
        this.a = context;
        this.b = b4Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new y4(this.a, (tk) this.b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.l(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.o(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.r(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.m(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.p(i);
    }
}