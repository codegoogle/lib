package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.ff;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class ye {
    public static final String a = "ConstraintLayoutStates";
    private static final boolean b = false;
    private final ConstraintLayout c;
    public af d;
    public int e = -1;
    public int f = -1;
    private SparseArray<a> g = new SparseArray<>();
    private SparseArray<af> h = new SparseArray<>();
    private cf i = null;

    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public ArrayList<b> b = new ArrayList<>();
        public int c;
        public af d;

        public a(Context context, XmlPullParser parser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), ff.m.Gl);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.Hl) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == ff.m.Il) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        af afVar = new af();
                        this.d = afVar;
                        afVar.G(context, this.c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b size) {
            this.b.add(size);
        }

        public int b(float width, float height) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(width, height)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public float b;
        public float c;
        public float d;
        public float e;
        public int f;
        public af g;

        public b(Context context, XmlPullParser parser) {
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = Float.NaN;
            this.f = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), ff.m.Tn);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.Un) {
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f);
                    context.getResources().getResourceName(this.f);
                    if ("layout".equals(resourceTypeName)) {
                        af afVar = new af();
                        this.g = afVar;
                        afVar.G(context, this.f);
                    }
                } else if (index == ff.m.Vn) {
                    this.e = obtainStyledAttributes.getDimension(index, this.e);
                } else if (index == ff.m.Wn) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == ff.m.Xn) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == ff.m.Yn) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float widthDp, float heightDp) {
            if (Float.isNaN(this.b) || widthDp >= this.b) {
                if (Float.isNaN(this.c) || heightDp >= this.c) {
                    if (Float.isNaN(this.d) || widthDp <= this.d) {
                        return Float.isNaN(this.e) || heightDp <= this.e;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public ye(Context context, ConstraintLayout layout, int resourceID) {
        this.c = layout;
        a(context, resourceID);
    }

    private void a(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        a aVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 2) {
                        aVar = new a(context, xml);
                        this.g.put(aVar.a, aVar);
                        continue;
                    } else if (c == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (c != 4) {
                        continue;
                    } else {
                        c(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void c(Context context, XmlPullParser parser) {
        af afVar = new af();
        int attributeCount = parser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = parser.getAttributeName(i);
            String attributeValue = parser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                afVar.x0(context, parser);
                this.h.put(identifier, afVar);
                return;
            }
        }
    }

    public boolean b(int id, float width, float height) {
        int i = this.e;
        if (i != id) {
            return true;
        }
        a valueAt = id == -1 ? this.g.valueAt(0) : this.g.get(i);
        int i2 = this.f;
        return (i2 == -1 || !valueAt.b.get(i2).a(width, height)) && this.f != valueAt.b(width, height);
    }

    public void d(cf constraintsChangedListener) {
        this.i = constraintsChangedListener;
    }

    public void e(int id, float width, float height) {
        af afVar;
        int i;
        a aVar;
        int b2;
        af afVar2;
        int i2;
        int i3 = this.e;
        if (i3 == id) {
            if (id == -1) {
                aVar = this.g.valueAt(0);
            } else {
                aVar = this.g.get(i3);
            }
            int i4 = this.f;
            if ((i4 == -1 || !aVar.b.get(i4).a(width, height)) && this.f != (b2 = aVar.b(width, height))) {
                if (b2 == -1) {
                    afVar2 = this.d;
                } else {
                    afVar2 = aVar.b.get(b2).g;
                }
                if (b2 == -1) {
                    i2 = aVar.c;
                } else {
                    i2 = aVar.b.get(b2).f;
                }
                if (afVar2 == null) {
                    return;
                }
                this.f = b2;
                cf cfVar = this.i;
                if (cfVar != null) {
                    cfVar.b(-1, i2);
                }
                afVar2.r(this.c);
                cf cfVar2 = this.i;
                if (cfVar2 != null) {
                    cfVar2.a(-1, i2);
                    return;
                }
                return;
            }
            return;
        }
        this.e = id;
        a aVar2 = this.g.get(id);
        int b3 = aVar2.b(width, height);
        if (b3 == -1) {
            afVar = aVar2.d;
        } else {
            afVar = aVar2.b.get(b3).g;
        }
        if (b3 == -1) {
            i = aVar2.c;
        } else {
            i = aVar2.b.get(b3).f;
        }
        if (afVar == null) {
            return;
        }
        this.f = b3;
        cf cfVar3 = this.i;
        if (cfVar3 != null) {
            cfVar3.b(id, i);
        }
        afVar.r(this.c);
        cf cfVar4 = this.i;
        if (cfVar4 != null) {
            cfVar4.a(id, i);
        }
    }
}