package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.p7700g.p99005.ff;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: StateSet.java */
/* renamed from: com.p7700g.p99005.if  reason: invalid class name */
/* loaded from: classes.dex */
public class Cif {
    public static final String a = "ConstraintLayoutStates";
    private static final boolean b = false;
    public af d;
    public int c = -1;
    public int e = -1;
    public int f = -1;
    private SparseArray<a> g = new SparseArray<>();
    private SparseArray<af> h = new SparseArray<>();
    private cf i = null;

    /* compiled from: StateSet.java */
    /* renamed from: com.p7700g.p99005.if$a */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public ArrayList<b> b = new ArrayList<>();
        public int c;
        public boolean d;

        public a(Context context, XmlPullParser parser) {
            this.c = -1;
            this.d = false;
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
                        this.d = true;
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

    /* compiled from: StateSet.java */
    /* renamed from: com.p7700g.p99005.if$b */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public float b;
        public float c;
        public float d;
        public float e;
        public int f;
        public boolean g;

        public b(Context context, XmlPullParser parser) {
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = Float.NaN;
            this.f = -1;
            this.g = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), ff.m.Tn);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.Un) {
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f);
                    context.getResources().getResourceName(this.f);
                    if ("layout".equals(resourceTypeName)) {
                        this.g = true;
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

    public Cif(Context context, XmlPullParser parser) {
        b(context, parser);
    }

    private void b(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), ff.m.Sl);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == ff.m.Tl) {
                this.c = obtainStyledAttributes.getResourceId(index, this.c);
            }
        }
        obtainStyledAttributes.recycle();
        a aVar = null;
        try {
            int eventType = parser.getEventType();
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    String name = parser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
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
                        aVar = new a(context, parser);
                        this.g.put(aVar.a, aVar);
                    } else if (c == 3) {
                        b bVar = new b(context, parser);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public int a(int currentConstrainSettId, int stateId, float width, float height) {
        a aVar = this.g.get(stateId);
        if (aVar == null) {
            return stateId;
        }
        if (width != -1.0f && height != -1.0f) {
            b bVar = null;
            Iterator<b> it = aVar.b.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next.a(width, height)) {
                    if (currentConstrainSettId == next.f) {
                        return currentConstrainSettId;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f;
            }
            return aVar.c;
        } else if (aVar.c == currentConstrainSettId) {
            return currentConstrainSettId;
        } else {
            Iterator<b> it2 = aVar.b.iterator();
            while (it2.hasNext()) {
                if (currentConstrainSettId == it2.next().f) {
                    return currentConstrainSettId;
                }
            }
            return aVar.c;
        }
    }

    public boolean c(int id, float width, float height) {
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

    public int e(int id, int width, int height) {
        return f(-1, id, width, height);
    }

    public int f(int currentId, int id, float width, float height) {
        a aVar;
        int b2;
        if (currentId != id) {
            a aVar2 = this.g.get(id);
            if (aVar2 == null) {
                return -1;
            }
            int b3 = aVar2.b(width, height);
            return b3 == -1 ? aVar2.c : aVar2.b.get(b3).f;
        }
        if (id == -1) {
            aVar = this.g.valueAt(0);
        } else {
            aVar = this.g.get(this.e);
        }
        if (aVar == null) {
            return -1;
        }
        return ((this.f == -1 || !aVar.b.get(currentId).a(width, height)) && currentId != (b2 = aVar.b(width, height))) ? b2 == -1 ? aVar.c : aVar.b.get(b2).f : currentId;
    }
}