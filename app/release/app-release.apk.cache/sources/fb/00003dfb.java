package com.p7700g.p99005;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.p7700g.p99005.x2;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class d4 extends ContextWrapper {
    private static Configuration a;
    private int b;
    private Resources.Theme c;
    private LayoutInflater d;
    private Configuration e;
    private Resources f;

    /* compiled from: ContextThemeWrapper.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Context a(d4 d4Var, Configuration configuration) {
            return d4Var.createConfigurationContext(configuration);
        }
    }

    public d4() {
        super(null);
    }

    private Resources b() {
        if (this.f == null) {
            Configuration configuration = this.e;
            if (configuration != null && (Build.VERSION.SDK_INT < 26 || !e(configuration))) {
                this.f = a.a(this, this.e).getResources();
            } else {
                this.f = super.getResources();
            }
        }
        return this.f;
    }

    private void d() {
        boolean z = this.c == null;
        if (z) {
            this.c = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.c.setTo(theme);
            }
        }
        f(this.c, this.b, z);
    }

    @e2(26)
    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (a == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            a = configuration2;
        }
        return configuration.equals(a);
    }

    public void a(Configuration configuration) {
        if (this.f == null) {
            if (this.e == null) {
                this.e = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.b;
    }

    public void f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.d == null) {
                this.d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.d;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.c;
        if (theme != null) {
            return theme;
        }
        if (this.b == 0) {
            this.b = x2.l.c4;
        }
        d();
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.b != i) {
            this.b = i;
            d();
        }
    }

    public d4(Context context, @m2 int i) {
        super(context);
        this.b = i;
    }

    public d4(Context context, Resources.Theme theme) {
        super(context);
        this.c = theme;
    }
}