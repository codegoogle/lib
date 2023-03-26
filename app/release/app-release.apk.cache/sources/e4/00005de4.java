package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: CharacterUtils.java */
/* loaded from: classes3.dex */
public class td3 {
    public static List<sd3> a(CharSequence charSequence, CharSequence charSequence2) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            int i2 = 0;
            while (true) {
                if (i2 >= charSequence2.length()) {
                    break;
                }
                if (!hashSet.contains(Integer.valueOf(i2)) && charAt == charSequence2.charAt(i2)) {
                    hashSet.add(Integer.valueOf(i2));
                    sd3 sd3Var = new sd3();
                    sd3Var.a = charAt;
                    sd3Var.b = i;
                    sd3Var.c = i2;
                    arrayList.add(sd3Var);
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public static float b(int i, int i2, float f, float f2, float f3, List<Float> list, List<Float> list2) {
        for (int i3 = 0; i3 < i2; i3++) {
            f2 += list.get(i3).floatValue();
        }
        for (int i4 = 0; i4 < i; i4++) {
            f3 += list2.get(i4).floatValue();
        }
        return wo1.a(f2, f3, f, f3);
    }

    public static int c(int i, List<sd3> list) {
        for (sd3 sd3Var : list) {
            if (sd3Var.b == i) {
                return sd3Var.c;
            }
        }
        return -1;
    }

    public static boolean d(int i, List<sd3> list) {
        for (sd3 sd3Var : list) {
            if (sd3Var.c == i) {
                return true;
            }
        }
        return false;
    }
}