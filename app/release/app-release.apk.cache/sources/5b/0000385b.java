package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* compiled from: StringUtil.java */
@i2({i2.a.u})
/* loaded from: classes.dex */
public class a60 {
    public static final String[] a = new String[0];

    private a60() {
    }

    public static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    @z1
    public static String b(@z1 List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(Integer.toString(list.get(i).intValue()));
            if (i < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static StringBuilder c() {
        return new StringBuilder();
    }

    @z1
    public static List<Integer> d(@z1 String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
            } catch (NumberFormatException unused) {
            }
        }
        return arrayList;
    }
}