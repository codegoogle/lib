package com.p7700g.p99005;

import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.z30;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b60 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public final String d;
    public final Map<String, a> e;
    public final Set<b> f;
    @z1
    public final Set<d> g;

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final String b;
        @z30.b
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        private final int g;

        @Deprecated
        public a(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, null, 0);
        }

        @z30.b
        private static int a(@z1 String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.e == aVar.e && this.a.equals(aVar.a) && this.d == aVar.d) {
                if (this.g != 1 || aVar.g != 2 || (str3 = this.f) == null || str3.equals(aVar.f)) {
                    if (this.g != 2 || aVar.g != 1 || (str2 = aVar.f) == null || str2.equals(this.f)) {
                        int i = this.g;
                        return (i == 0 || i != aVar.g || ((str = this.f) == null ? aVar.f == null : str.equals(aVar.f))) && this.c == aVar.c;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            StringBuilder G = wo1.G("Column{name='");
            wo1.d0(G, this.a, '\'', ", type='");
            wo1.d0(G, this.b, '\'', ", affinity='");
            G.append(this.c);
            G.append('\'');
            G.append(", notNull=");
            G.append(this.d);
            G.append(", primaryKeyPosition=");
            G.append(this.e);
            G.append(", defaultValue='");
            G.append(this.f);
            G.append('\'');
            G.append('}');
            return G.toString();
        }

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            this.c = a(str2);
            this.f = str3;
            this.g = i2;
        }
    }

    /* compiled from: TableInfo.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class b {
        @x1
        public final String a;
        @x1
        public final String b;
        @x1
        public final String c;
        @x1
        public final List<String> d;
        @x1
        public final List<String> e;

        public b(@x1 String str, @x1 String str2, @x1 String str3, @x1 List<String> list, @x1 List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int x = wo1.x(this.c, wo1.x(this.b, this.a.hashCode() * 31, 31), 31);
            return this.e.hashCode() + ((this.d.hashCode() + x) * 31);
        }

        public String toString() {
            StringBuilder G = wo1.G("ForeignKey{referenceTable='");
            wo1.d0(G, this.a, '\'', ", onDelete='");
            wo1.d0(G, this.b, '\'', ", onUpdate='");
            wo1.d0(G, this.c, '\'', ", columnNames=");
            G.append(this.d);
            G.append(", referenceColumnNames=");
            G.append(this.e);
            G.append('}');
            return G.toString();
        }
    }

    /* compiled from: TableInfo.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {
        public final int s;
        public final int t;
        public final String u;
        public final String v;

        public c(int i, int i2, String str, String str2) {
            this.s = i;
            this.t = i2;
            this.u = str;
            this.v = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(@x1 c cVar) {
            int i = this.s - cVar.s;
            return i == 0 ? this.t - cVar.t : i;
        }
    }

    /* compiled from: TableInfo.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class d {
        public static final String a = "index_";
        public final String b;
        public final boolean c;
        public final List<String> d;

        public d(String str, boolean z, List<String> list) {
            this.b = str;
            this.c = z;
            this.d = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.c == dVar.c && this.d.equals(dVar.d)) {
                if (this.b.startsWith(a)) {
                    return dVar.b.startsWith(a);
                }
                return this.b.equals(dVar.b);
            }
            return false;
        }

        public int hashCode() {
            return this.d.hashCode() + ((((this.b.startsWith(a) ? -1184239155 : this.b.hashCode()) * 31) + (this.c ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder G = wo1.G("Index{name='");
            wo1.d0(G, this.b, '\'', ", unique=");
            G.append(this.c);
            G.append(", columns=");
            G.append(this.d);
            G.append('}');
            return G.toString();
        }
    }

    public b60(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.d = str;
        this.e = Collections.unmodifiableMap(map);
        this.f = Collections.unmodifiableSet(set);
        this.g = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static b60 a(n60 n60Var, String str) {
        return new b60(str, b(n60Var, str), d(n60Var, str), f(n60Var, str));
    }

    private static Map<String, a> b(n60 n60Var, String str) {
        Cursor P0 = n60Var.P0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (P0.getColumnCount() > 0) {
                int columnIndex = P0.getColumnIndex("name");
                int columnIndex2 = P0.getColumnIndex("type");
                int columnIndex3 = P0.getColumnIndex("notnull");
                int columnIndex4 = P0.getColumnIndex("pk");
                int columnIndex5 = P0.getColumnIndex("dflt_value");
                while (P0.moveToNext()) {
                    String string = P0.getString(columnIndex);
                    hashMap.put(string, new a(string, P0.getString(columnIndex2), P0.getInt(columnIndex3) != 0, P0.getInt(columnIndex4), P0.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            P0.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex(aa.h.d);
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(n60 n60Var, String str) {
        HashSet hashSet = new HashSet();
        Cursor P0 = n60Var.P0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = P0.getColumnIndex("id");
            int columnIndex2 = P0.getColumnIndex("seq");
            int columnIndex3 = P0.getColumnIndex("table");
            int columnIndex4 = P0.getColumnIndex("on_delete");
            int columnIndex5 = P0.getColumnIndex("on_update");
            List<c> c2 = c(P0);
            int count = P0.getCount();
            for (int i = 0; i < count; i++) {
                P0.moveToPosition(i);
                if (P0.getInt(columnIndex2) == 0) {
                    int i2 = P0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c2) {
                        if (cVar.s == i2) {
                            arrayList.add(cVar.u);
                            arrayList2.add(cVar.v);
                        }
                    }
                    hashSet.add(new b(P0.getString(columnIndex3), P0.getString(columnIndex4), P0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            P0.close();
        }
    }

    @z1
    private static d e(n60 n60Var, String str, boolean z) {
        Cursor P0 = n60Var.P0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = P0.getColumnIndex("seqno");
            int columnIndex2 = P0.getColumnIndex("cid");
            int columnIndex3 = P0.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (P0.moveToNext()) {
                    if (P0.getInt(columnIndex2) >= 0) {
                        int i = P0.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), P0.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            P0.close();
        }
    }

    @z1
    private static Set<d> f(n60 n60Var, String str) {
        Cursor P0 = n60Var.P0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = P0.getColumnIndex("name");
            int columnIndex2 = P0.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            int columnIndex3 = P0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (P0.moveToNext()) {
                    if ("c".equals(P0.getString(columnIndex2))) {
                        String string = P0.getString(columnIndex);
                        boolean z = true;
                        if (P0.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d e = e(n60Var, string, z);
                        if (e == null) {
                            return null;
                        }
                        hashSet.add(e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            P0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b60 b60Var = (b60) obj;
        String str = this.d;
        if (str == null ? b60Var.d == null : str.equals(b60Var.d)) {
            Map<String, a> map = this.e;
            if (map == null ? b60Var.e == null : map.equals(b60Var.e)) {
                Set<b> set2 = this.f;
                if (set2 == null ? b60Var.f == null : set2.equals(b60Var.f)) {
                    Set<d> set3 = this.g;
                    if (set3 == null || (set = b60Var.g) == null) {
                        return true;
                    }
                    return set3.equals(set);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.d;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.e;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("TableInfo{name='");
        wo1.d0(G, this.d, '\'', ", columns=");
        G.append(this.e);
        G.append(", foreignKeys=");
        G.append(this.f);
        G.append(", indices=");
        G.append(this.g);
        G.append('}');
        return G.toString();
    }

    public b60(String str, Map<String, a> map, Set<b> set) {
        this(str, map, set, Collections.emptySet());
    }
}