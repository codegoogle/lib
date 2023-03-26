package com.p7700g.p99005;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes3.dex */
public abstract class nv2 implements ov2 {
    public static final nv2 s;
    public static final nv2 t;
    public static final nv2 u;
    public static final nv2 v;
    public static final nv2 w;
    public static final nv2 x;
    public static final nv2 y;
    private static final /* synthetic */ nv2[] z;

    /* compiled from: FieldNamingPolicy.java */
    /* loaded from: classes3.dex */
    public enum a extends nv2 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.p7700g.p99005.ov2
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        s = aVar;
        nv2 nv2Var = new nv2("UPPER_CAMEL_CASE", 1) { // from class: com.p7700g.p99005.nv2.b
            @Override // com.p7700g.p99005.ov2
            public String a(Field field) {
                return nv2.c(field.getName());
            }
        };
        t = nv2Var;
        nv2 nv2Var2 = new nv2("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.p7700g.p99005.nv2.c
            @Override // com.p7700g.p99005.ov2
            public String a(Field field) {
                return nv2.c(nv2.b(field.getName(), gl4.R));
            }
        };
        u = nv2Var2;
        nv2 nv2Var3 = new nv2("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.p7700g.p99005.nv2.d
            @Override // com.p7700g.p99005.ov2
            public String a(Field field) {
                return nv2.b(field.getName(), n04.E).toUpperCase(Locale.ENGLISH);
            }
        };
        v = nv2Var3;
        nv2 nv2Var4 = new nv2("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.p7700g.p99005.nv2.e
            @Override // com.p7700g.p99005.ov2
            public String a(Field field) {
                return nv2.b(field.getName(), n04.E).toLowerCase(Locale.ENGLISH);
            }
        };
        w = nv2Var4;
        nv2 nv2Var5 = new nv2("LOWER_CASE_WITH_DASHES", 5) { // from class: com.p7700g.p99005.nv2.f
            @Override // com.p7700g.p99005.ov2
            public String a(Field field) {
                return nv2.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        x = nv2Var5;
        nv2 nv2Var6 = new nv2("LOWER_CASE_WITH_DOTS", 6) { // from class: com.p7700g.p99005.nv2.g
            @Override // com.p7700g.p99005.ov2
            public String a(Field field) {
                return nv2.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        y = nv2Var6;
        z = new nv2[]{aVar, nv2Var, nv2Var2, nv2Var3, nv2Var4, nv2Var5, nv2Var6};
    }

    private nv2(String str, int i) {
    }

    public static String b(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    StringBuilder F = wo1.F(upperCase);
                    F.append(str.substring(1));
                    return F.toString();
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static nv2 valueOf(String str) {
        return (nv2) Enum.valueOf(nv2.class, str);
    }

    public static nv2[] values() {
        return (nv2[]) z.clone();
    }

    public /* synthetic */ nv2(String str, int i, a aVar) {
        this(str, i);
    }
}