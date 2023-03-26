package com.p7700g.p99005;

/* compiled from: WriterUtil.java */
/* loaded from: classes3.dex */
public class qu3 {
    public static void a(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append('\\');
            }
            sb.append(charAt);
        }
    }

    public static void b(StringBuilder sb, String str) {
        sb.append(h95.b);
        a(sb, str);
        sb.append(h95.b);
    }

    public static void c(StringBuilder sb, String str) {
        if (str == null) {
            return;
        }
        boolean z = !vs3.h(str);
        if (z) {
            sb.append(h95.b);
        }
        a(sb, str);
        if (z) {
            sb.append(h95.b);
        }
    }

    public static void d(StringBuilder sb, String str) {
        if (str == null) {
            return;
        }
        boolean a = vs3.a(str);
        if (a) {
            sb.append(h95.b);
        }
        a(sb, str);
        if (a) {
            sb.append(h95.b);
        }
    }
}