package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import com.p7700g.p99005.aa;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: TransitionInflater.java */
/* loaded from: classes.dex */
public class t80 {
    private static final Class<?>[] a = {Context.class, AttributeSet.class};
    private static final q7<String, Constructor<?>> b = new q7<>();
    private final Context c;

    private t80(@x1 Context context) {
        this.c = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue != null) {
            try {
                q7<String, Constructor<?>> q7Var = b;
                synchronized (q7Var) {
                    Constructor<?> constructor = q7Var.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.c.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = asSubclass.getConstructor(a);
                        constructor.setAccessible(true);
                        q7Var.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(this.c, attributeSet);
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        }
        throw new InflateException(wo1.t(str, " tag must have a 'class' attribute"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0179, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private s80 b(XmlPullParser xmlPullParser, AttributeSet attributeSet, s80 s80Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        x80 x80Var = s80Var instanceof x80 ? (x80) s80Var : null;
        loop0: while (true) {
            s80 s80Var2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            s80Var2 = new x70(this.c, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            s80Var2 = new q70(this.c, attributeSet);
                        } else if ("slide".equals(name)) {
                            s80Var2 = new q80(this.c, attributeSet);
                        } else if ("explode".equals(name)) {
                            s80Var2 = new w70(this.c, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            s80Var2 = new s70(this.c, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            s80Var2 = new u70(this.c, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            s80Var2 = new r70(this.c, attributeSet);
                        } else if (aa.h.f.equals(name)) {
                            s80Var2 = new o70(this.c, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            s80Var2 = new t70(this.c, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            s80Var2 = new x80(this.c, attributeSet);
                        } else if ("transition".equals(name)) {
                            s80Var2 = (s80) a(attributeSet, s80.class, "transition");
                        } else if ("targets".equals(name)) {
                            e(xmlPullParser, attributeSet, s80Var);
                        } else if ("arcMotion".equals(name)) {
                            if (s80Var != null) {
                                s80Var.K0(new n70(this.c, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        } else if ("pathMotion".equals(name)) {
                            if (s80Var != null) {
                                s80Var.K0((i80) a(attributeSet, i80.class, "pathMotion"));
                            } else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        } else if (!"patternPathMotion".equals(name)) {
                            StringBuilder G = wo1.G("Unknown scene name: ");
                            G.append(xmlPullParser.getName());
                            throw new RuntimeException(G.toString());
                        } else if (s80Var != null) {
                            s80Var.K0(new k80(this.c, attributeSet));
                        } else {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        if (s80Var2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                b(xmlPullParser, attributeSet, s80Var2);
                            }
                            if (x80Var != null) {
                                break;
                            } else if (s80Var != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            x80Var.V0(s80Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private v80 c(XmlPullParser xmlPullParser, AttributeSet attributeSet, ViewGroup viewGroup) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        v80 v80Var = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("transitionManager")) {
                        v80Var = new v80();
                    } else if (!name.equals("transition") || v80Var == null) {
                        break;
                    } else {
                        h(attributeSet, xmlPullParser, viewGroup, v80Var);
                    }
                }
            }
        }
        StringBuilder G = wo1.G("Unknown scene name: ");
        G.append(xmlPullParser.getName());
        throw new RuntimeException(G.toString());
    }

    public static t80 d(Context context) {
        return new t80(context);
    }

    @SuppressLint({"RestrictedApi"})
    private void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, s80 s80Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(attributeSet, r80.a);
                    int l = ri.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (l != 0) {
                        s80Var.b(l);
                    } else {
                        int l2 = ri.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (l2 != 0) {
                            s80Var.J(l2, true);
                        } else {
                            String m = ri.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (m != null) {
                                s80Var.e(m);
                            } else {
                                String m2 = ri.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (m2 != null) {
                                    s80Var.N(m2, true);
                                } else {
                                    String m3 = ri.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (m3 != null) {
                                        try {
                                            s80Var.M(Class.forName(m3), true);
                                        } catch (ClassNotFoundException e) {
                                            obtainStyledAttributes.recycle();
                                            throw new RuntimeException(wo1.t("Could not create ", m3), e);
                                        }
                                    } else {
                                        String m4 = ri.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (m4 != null) {
                                            s80Var.d(Class.forName(m4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    StringBuilder G = wo1.G("Unknown scene name: ");
                    G.append(xmlPullParser.getName());
                    throw new RuntimeException(G.toString());
                }
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    private void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, v80 v80Var) throws Resources.NotFoundException {
        s80 f;
        TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(attributeSet, r80.b);
        int l = ri.l(obtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int l2 = ri.l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        o80 d = l2 < 0 ? null : o80.d(viewGroup, l2, this.c);
        int l3 = ri.l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        o80 d2 = l3 >= 0 ? o80.d(viewGroup, l3, this.c) : null;
        if (l >= 0 && (f = f(l)) != null) {
            if (d2 == null) {
                throw new RuntimeException(wo1.l("No toScene for transition ID ", l));
            }
            if (d == null) {
                v80Var.l(d2, f);
            } else {
                v80Var.k(d, d2, f);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public s80 f(int i) {
        XmlResourceParser xml = this.c.getResources().getXml(i);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }

    public v80 g(int i, ViewGroup viewGroup) {
        XmlResourceParser xml = this.c.getResources().getXml(i);
        try {
            try {
                return c(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e.getMessage());
                inflateException.initCause(e);
                throw inflateException;
            } catch (XmlPullParserException e2) {
                InflateException inflateException2 = new InflateException(e2.getMessage());
                inflateException2.initCause(e2);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }
}