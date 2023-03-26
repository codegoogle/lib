package com.p7700g.p99005;

import android.database.Cursor;
import com.p7700g.p99005.i2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: FtsTableInfo.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class y50 {
    private static final String[] a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final String b;
    public final Set<String> c;
    public final Set<String> d;

    public y50(String str, Set<String> set, Set<String> set2) {
        this.b = str;
        this.c = set;
        this.d = set2;
    }

    @r2
    public static Set<String> a(String str) {
        if (str.isEmpty()) {
            return new HashSet();
        }
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = -1;
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt != '\"' && charAt != '\'') {
                if (charAt != ',') {
                    if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '`') {
                            }
                        } else if (!arrayDeque.isEmpty() && ((Character) arrayDeque.peek()).charValue() == '[') {
                            arrayDeque.pop();
                        }
                    } else if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayList.add(substring.substring(i + 1, i2).trim());
                    i = i2;
                }
            }
            if (arrayDeque.isEmpty()) {
                arrayDeque.push(Character.valueOf(charAt));
            } else if (((Character) arrayDeque.peek()).charValue() == charAt) {
                arrayDeque.pop();
            }
        }
        arrayList.add(substring.substring(i + 1).trim());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            for (String str3 : a) {
                if (str2.startsWith(str3)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public static y50 b(n60 n60Var, String str) {
        return new y50(str, c(n60Var, str), d(n60Var, str));
    }

    private static Set<String> c(n60 n60Var, String str) {
        Cursor P0 = n60Var.P0("PRAGMA table_info(`" + str + "`)");
        HashSet hashSet = new HashSet();
        try {
            if (P0.getColumnCount() > 0) {
                int columnIndex = P0.getColumnIndex("name");
                while (P0.moveToNext()) {
                    hashSet.add(P0.getString(columnIndex));
                }
            }
            return hashSet;
        } finally {
            P0.close();
        }
    }

    private static Set<String> d(n60 n60Var, String str) {
        Cursor P0 = n60Var.P0("SELECT * FROM sqlite_master WHERE `name` = '" + str + "'");
        try {
            String string = P0.moveToFirst() ? P0.getString(P0.getColumnIndexOrThrow("sql")) : "";
            P0.close();
            return a(string);
        } catch (Throwable th) {
            P0.close();
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y50 y50Var = (y50) obj;
        String str = this.b;
        if (str == null ? y50Var.b == null : str.equals(y50Var.b)) {
            Set<String> set = this.c;
            if (set == null ? y50Var.c == null : set.equals(y50Var.c)) {
                Set<String> set2 = this.d;
                Set<String> set3 = y50Var.d;
                return set2 != null ? set2.equals(set3) : set3 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<String> set = this.c;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.d;
        return hashCode2 + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("FtsTableInfo{name='");
        wo1.d0(G, this.b, '\'', ", columns=");
        G.append(this.c);
        G.append(", options=");
        G.append(this.d);
        G.append('}');
        return G.toString();
    }

    public y50(String str, Set<String> set, String str2) {
        this.b = str;
        this.c = set;
        this.d = a(str2);
    }
}