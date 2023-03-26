package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.p7700g.p99005.ff;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintAttribute.java */
/* loaded from: classes.dex */
public class we {
    private static final String a = "TransitionLayout";
    private boolean b;
    public String c;
    private b d;
    private int e;
    private float f;
    private String g;
    public boolean h;
    private int i;

    /* compiled from: ConstraintAttribute.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            b.values();
            int[] iArr = new int[8];
            a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ConstraintAttribute.java */
    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public we(String name, b attributeType) {
        this.b = false;
        this.c = name;
        this.d = attributeType;
    }

    private static int b(int c) {
        int i = (c & (~(c >> 31))) - 255;
        return (i & (i >> 31)) + 255;
    }

    public static HashMap<String, we> d(HashMap<String, we> base, View view) {
        HashMap<String, we> hashMap = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : base.keySet()) {
            we weVar = base.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap.put(str, new we(weVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap.put(str, new we(weVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap;
    }

    public static void q(Context context, XmlPullParser parser, HashMap<String, we> custom) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), ff.m.pd);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == ff.m.qd) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == ff.m.Ad) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == ff.m.rd) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == ff.m.td) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == ff.m.sd) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == ff.m.xd) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == ff.m.ud) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == ff.m.vd) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == ff.m.wd) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == ff.m.zd) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == ff.m.yd) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            custom.put(str, new we(str, bVar2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void r(View view, HashMap<String, we> map) {
        Class<?> cls = view.getClass();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            we weVar = map.get(next);
            if (!weVar.b) {
                next = wo1.t(la1.a, next);
            }
            try {
                switch (weVar.d.ordinal()) {
                    case 0:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(weVar.e));
                        break;
                    case 1:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(weVar.f));
                        break;
                    case 2:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(weVar.i));
                        break;
                    case 3:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(weVar.i);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(next, CharSequence.class).invoke(view, weVar.g);
                        break;
                    case 5:
                        cls.getMethod(next, Boolean.TYPE).invoke(view, Boolean.valueOf(weVar.h));
                        break;
                    case 6:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(weVar.f));
                        break;
                    case 7:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(weVar.e));
                        break;
                }
            } catch (IllegalAccessException e) {
                cls.getName();
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.getMessage();
                cls.getName();
            } catch (InvocationTargetException e3) {
                cls.getName();
                e3.printStackTrace();
            }
        }
    }

    public void a(View view) {
        Class<?> cls = view.getClass();
        String str = this.c;
        if (!this.b) {
            str = wo1.t(la1.a, str);
        }
        try {
            switch (this.d.ordinal()) {
                case 0:
                case 7:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.e));
                    return;
                case 1:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f));
                    return;
                case 2:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.i));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.i);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.g);
                    return;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.h));
                    return;
                case 6:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            cls.getName();
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.getMessage();
            cls.getName();
        } catch (InvocationTargetException e3) {
            cls.getName();
            e3.printStackTrace();
        }
    }

    public boolean c(we constraintAttribute) {
        b bVar;
        if (constraintAttribute == null || (bVar = this.d) != constraintAttribute.d) {
            return false;
        }
        switch (bVar.ordinal()) {
            case 0:
            case 7:
                return this.e == constraintAttribute.e;
            case 1:
                return this.f == constraintAttribute.f;
            case 2:
            case 3:
                return this.i == constraintAttribute.i;
            case 4:
                return this.e == constraintAttribute.e;
            case 5:
                return this.h == constraintAttribute.h;
            case 6:
                return this.f == constraintAttribute.f;
            default:
                return false;
        }
    }

    public int e() {
        return this.i;
    }

    public float f() {
        return this.f;
    }

    public int g() {
        return this.e;
    }

    public String h() {
        return this.c;
    }

    public String i() {
        return this.g;
    }

    public b j() {
        return this.d;
    }

    public float k() {
        switch (this.d.ordinal()) {
            case 0:
                return this.e;
            case 1:
                return this.f;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.h ? 1.0f : 0.0f;
            case 6:
                return this.f;
            default:
                return Float.NaN;
        }
    }

    public void l(float[] ret) {
        switch (this.d.ordinal()) {
            case 0:
                ret[0] = this.e;
                return;
            case 1:
                ret[0] = this.f;
                return;
            case 2:
            case 3:
                int i = this.i;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                ret[0] = pow;
                ret[1] = pow2;
                ret[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                ret[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                ret[0] = this.h ? 1.0f : 0.0f;
                return;
            case 6:
                ret[0] = this.f;
                return;
            default:
                return;
        }
    }

    public boolean m() {
        return this.h;
    }

    public boolean n() {
        int ordinal = this.d.ordinal();
        return (ordinal == 4 || ordinal == 5 || ordinal == 7) ? false : true;
    }

    public boolean o() {
        return this.b;
    }

    public int p() {
        int ordinal = this.d.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public void s(int value) {
        this.i = value;
    }

    public void t(float value) {
        this.f = value;
    }

    public void u(int value) {
        this.e = value;
    }

    public void v(String value) {
        this.g = value;
    }

    public void w(Object value) {
        switch (this.d.ordinal()) {
            case 0:
            case 7:
                this.e = ((Integer) value).intValue();
                return;
            case 1:
                this.f = ((Float) value).floatValue();
                return;
            case 2:
            case 3:
                this.i = ((Integer) value).intValue();
                return;
            case 4:
                this.g = (String) value;
                return;
            case 5:
                this.h = ((Boolean) value).booleanValue();
                return;
            case 6:
                this.f = ((Float) value).floatValue();
                return;
            default:
                return;
        }
    }

    public void x(float[] value) {
        switch (this.d.ordinal()) {
            case 0:
            case 7:
                this.e = (int) value[0];
                return;
            case 1:
                this.f = value[0];
                return;
            case 2:
            case 3:
                int HSVToColor = Color.HSVToColor(value);
                this.i = HSVToColor;
                this.i = (b((int) (value[3] * 255.0f)) << 24) | (HSVToColor & sr.s);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                this.h = ((double) value[0]) > 0.5d;
                return;
            case 6:
                this.f = value[0];
                return;
            default:
                return;
        }
    }

    public we(String name, b attributeType, Object value, boolean method) {
        this.b = false;
        this.c = name;
        this.d = attributeType;
        this.b = method;
        w(value);
    }

    public we(we source, Object value) {
        this.b = false;
        this.c = source.c;
        this.d = source.d;
        w(value);
    }
}