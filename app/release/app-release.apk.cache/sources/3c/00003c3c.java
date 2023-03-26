package com.p7700g.p99005;

import android.database.Cursor;
import com.p7700g.p99005.i2;

/* compiled from: ViewInfo.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class c60 {
    public final String a;
    public final String b;

    public c60(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static c60 a(n60 n60Var, String str) {
        Cursor P0 = n60Var.P0("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + "'");
        try {
            if (P0.moveToFirst()) {
                return new c60(P0.getString(0), P0.getString(1));
            }
            return new c60(str, null);
        } finally {
            P0.close();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c60 c60Var = (c60) obj;
        String str = this.a;
        if (str == null ? c60Var.a == null : str.equals(c60Var.a)) {
            String str2 = this.b;
            if (str2 != null) {
                if (str2.equals(c60Var.b)) {
                    return true;
                }
            } else if (c60Var.b == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("ViewInfo{name='");
        wo1.d0(G, this.a, '\'', ", sql='");
        G.append(this.b);
        G.append('\'');
        G.append('}');
        return G.toString();
    }
}