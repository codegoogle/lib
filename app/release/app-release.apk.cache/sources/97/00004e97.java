package com.p7700g.p99005;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.nf;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class li {
    private static final int a = 400;
    private static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = -1;
    private static final int f = 500;

    /* compiled from: FontResourcesParserCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class d implements b {
        @x1
        private final e[] a;

        public d(@x1 e[] eVarArr) {
            this.a = eVarArr;
        }

        @x1
        public e[] a() {
            return this.a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class e {
        @x1
        private final String a;
        private final int b;
        private final boolean c;
        private final String d;
        private final int e;
        private final int f;

        public e(@x1 String str, int i, boolean z, @z1 String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        @x1
        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        @z1
        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    private li() {
    }

    private static int a(TypedArray typedArray, int i) {
        return a.a(typedArray, i);
    }

    @z1
    public static b b(@x1 XmlPullParser xmlPullParser, @x1 Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @x1
    public static List<List<byte[]>> c(@x1 Resources resources, @p0 int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @z1
    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @z1
    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), nf.j.j);
        String string = obtainAttributes.getString(nf.j.k);
        String string2 = obtainAttributes.getString(nf.j.o);
        String string3 = obtainAttributes.getString(nf.j.p);
        int resourceId = obtainAttributes.getResourceId(nf.j.l, 0);
        int integer = obtainAttributes.getInteger(nf.j.m, 1);
        int integer2 = obtainAttributes.getInteger(nf.j.n, 500);
        String string4 = obtainAttributes.getString(nf.j.q);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new f(new rn(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    private static e f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), nf.j.r);
        int i = nf.j.A;
        if (!obtainAttributes.hasValue(i)) {
            i = nf.j.t;
        }
        int i2 = obtainAttributes.getInt(i, a);
        int i3 = nf.j.y;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = nf.j.u;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = nf.j.B;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = nf.j.v;
        }
        int i5 = nf.j.z;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = nf.j.w;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = nf.j.x;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = nf.j.s;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i2, z, string, i6, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class f implements b {
        @x1
        private final rn a;
        private final int b;
        private final int c;
        @z1
        private final String d;

        @i2({i2.a.LIBRARY})
        public f(@x1 rn rnVar, int i, int i2, @z1 String str) {
            this.a = rnVar;
            this.c = i;
            this.b = i2;
            this.d = str;
        }

        public int a() {
            return this.c;
        }

        @x1
        public rn b() {
            return this.a;
        }

        @i2({i2.a.LIBRARY})
        @z1
        public String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }

        public f(@x1 rn rnVar, int i, int i2) {
            this(rnVar, i, i2, null);
        }
    }
}