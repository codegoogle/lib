package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x2;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g4 extends MenuInflater {
    public static final String a = "SupportMenuInflater";
    private static final String b = "menu";
    private static final String c = "group";
    private static final String d = "item";
    public static final int e = 0;
    public static final Class<?>[] f;
    public static final Class<?>[] g;
    public final Object[] h;
    public final Object[] i;
    public Context j;
    private Object k;

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] a = {MenuItem.class};
        private Object b;
        private Method c;

        public a(Object obj, String str) {
            this.b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, a);
            } catch (Exception e) {
                StringBuilder M = wo1.M("Couldn't resolve menu item onClick handler ", str, " in class ");
                M.append(cls.getName());
                InflateException inflateException = new InflateException(M.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.c.invoke(this.b, menuItem)).booleanValue();
                }
                this.c.invoke(this.b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        private static final int a = 0;
        private static final int b = 0;
        private static final int c = 0;
        private static final int d = 0;
        private static final int e = 0;
        private static final boolean f = false;
        private static final boolean g = true;
        private static final boolean h = true;
        private boolean A;
        private boolean B;
        private boolean C;
        private int D;
        private int E;
        private String F;
        private String G;
        private String H;
        public gq I;
        private CharSequence J;
        private CharSequence K;
        private ColorStateList L = null;
        private PorterDuff.Mode M = null;
        private Menu i;
        private int j;
        private int k;
        private int l;
        private int m;
        private boolean n;
        private boolean o;
        private boolean p;
        private int q;
        private int r;
        private CharSequence s;
        private CharSequence t;
        private int u;
        private char v;
        private int w;
        private char x;
        private int y;
        private int z;

        public b(Menu menu) {
            this.i = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g4.this.j.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.A).setVisible(this.B).setEnabled(this.C).setCheckable(this.z >= 1).setTitleCondensed(this.t).setIcon(this.u);
            int i = this.D;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.H != null) {
                if (!g4.this.j.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g4.this.b(), this.H));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.z >= 2) {
                if (menuItem instanceof s4) {
                    ((s4) menuItem).w(true);
                } else if (menuItem instanceof t4) {
                    ((t4) menuItem).j(true);
                }
            }
            String str = this.F;
            if (str != null) {
                menuItem.setActionView((View) e(str, g4.f, g4.this.h));
                z = true;
            }
            int i2 = this.E;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            gq gqVar = this.I;
            if (gqVar != null) {
                wq.l(menuItem, gqVar);
            }
            wq.p(menuItem, this.J);
            wq.w(menuItem, this.K);
            wq.o(menuItem, this.v, this.w);
            wq.s(menuItem, this.x, this.y);
            PorterDuff.Mode mode = this.M;
            if (mode != null) {
                wq.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.L;
            if (colorStateList != null) {
                wq.q(menuItem, colorStateList);
            }
        }

        public void a() {
            this.p = true;
            i(this.i.add(this.j, this.q, this.r, this.s));
        }

        public SubMenu b() {
            this.p = true;
            SubMenu addSubMenu = this.i.addSubMenu(this.j, this.q, this.r, this.s);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.p;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g4.this.j.obtainStyledAttributes(attributeSet, x2.m.d4);
            this.j = obtainStyledAttributes.getResourceId(x2.m.f4, 0);
            this.k = obtainStyledAttributes.getInt(x2.m.h4, 0);
            this.l = obtainStyledAttributes.getInt(x2.m.i4, 0);
            this.m = obtainStyledAttributes.getInt(x2.m.j4, 0);
            this.n = obtainStyledAttributes.getBoolean(x2.m.g4, true);
            this.o = obtainStyledAttributes.getBoolean(x2.m.e4, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(g4.this.j, attributeSet, x2.m.k4);
            this.q = obtainStyledAttributes.getResourceId(x2.m.n4, 0);
            this.r = (obtainStyledAttributes.getInt(x2.m.q4, this.k) & tk.c) | (obtainStyledAttributes.getInt(x2.m.r4, this.l) & 65535);
            this.s = obtainStyledAttributes.getText(x2.m.s4);
            this.t = obtainStyledAttributes.getText(x2.m.t4);
            this.u = obtainStyledAttributes.getResourceId(x2.m.l4, 0);
            this.v = c(obtainStyledAttributes.getString(x2.m.u4));
            this.w = obtainStyledAttributes.getInt(x2.m.B4, 4096);
            this.x = c(obtainStyledAttributes.getString(x2.m.v4));
            this.y = obtainStyledAttributes.getInt(x2.m.F4, 4096);
            int i = x2.m.w4;
            if (obtainStyledAttributes.hasValue(i)) {
                this.z = obtainStyledAttributes.getBoolean(i, false) ? 1 : 0;
            } else {
                this.z = this.m;
            }
            this.A = obtainStyledAttributes.getBoolean(x2.m.o4, false);
            this.B = obtainStyledAttributes.getBoolean(x2.m.p4, this.n);
            this.C = obtainStyledAttributes.getBoolean(x2.m.m4, this.o);
            this.D = obtainStyledAttributes.getInt(x2.m.G4, -1);
            this.H = obtainStyledAttributes.getString(x2.m.x4);
            this.E = obtainStyledAttributes.getResourceId(x2.m.y4, 0);
            this.F = obtainStyledAttributes.getString(x2.m.A4);
            String string = obtainStyledAttributes.getString(x2.m.z4);
            this.G = string;
            if ((string != null) && this.E == 0 && this.F == null) {
                this.I = (gq) e(string, g4.g, g4.this.i);
            } else {
                this.I = null;
            }
            this.J = obtainStyledAttributes.getText(x2.m.C4);
            this.K = obtainStyledAttributes.getText(x2.m.H4);
            int i2 = x2.m.E4;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.M = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i2, -1), this.M);
            } else {
                this.M = null;
            }
            int i3 = x2.m.D4;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.L = obtainStyledAttributes.getColorStateList(i3);
            } else {
                this.L = null;
            }
            obtainStyledAttributes.recycle();
            this.p = false;
        }

        public void h() {
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = true;
            this.o = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f = clsArr;
        g = clsArr;
    }

    public g4(Context context) {
        super(context);
        this.j = context;
        Object[] objArr = {context};
        this.h = objArr;
        this.i = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(b)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(wo1.t("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals(c)) {
                            bVar.h();
                        } else if (name2.equals(d)) {
                            if (!bVar.d()) {
                                gq gqVar = bVar.I;
                                if (gqVar != null && gqVar.hasSubMenu()) {
                                    bVar.b();
                                } else {
                                    bVar.a();
                                }
                            }
                        } else if (name2.equals(b)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(c)) {
                        bVar.f(attributeSet);
                    } else if (name3.equals(d)) {
                        bVar.g(attributeSet);
                    } else if (name3.equals(b)) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        z2 = true;
                        str = name3;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public Object b() {
        if (this.k == null) {
            this.k = a(this.j);
        }
        return this.k;
    }

    @Override // android.view.MenuInflater
    public void inflate(@s1 int i, Menu menu) {
        if (!(menu instanceof tk)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.j.getResources().getLayout(i);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}