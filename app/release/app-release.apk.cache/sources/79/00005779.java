package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;

/* compiled from: MySQLTranslator.java */
/* loaded from: classes3.dex */
public class q54 implements p54 {
    private StringBuilder f(StringBuilder sb, String str, char c, String str2, int i) {
        wo1.h0(sb, "LENGTH (", str, ") - LENGTH(REPLACE(", str);
        sb.append(", '");
        sb.append(c);
        sb.append("', '')) ");
        sb.append(str2);
        sb.append(" ");
        sb.append(i);
        return sb;
    }

    @Override // com.p7700g.p99005.p54
    public StringBuilder a(StringBuilder sb, String str, char c, int i, String str2) {
        sb.append("substring_index(");
        sb.append(str);
        sb.append(",'");
        sb.append(c);
        sb.append("',");
        sb.append(i);
        sb.append(") = ");
        sb.append('\'');
        sb.append(str2);
        sb.append('\'');
        return sb;
    }

    @Override // com.p7700g.p99005.p54
    public StringBuilder b(StringBuilder sb, String str, String str2) {
        wo1.h0(sb, str, " = '", str2, "'");
        return sb;
    }

    @Override // com.p7700g.p99005.p54
    public void c(String str) {
    }

    @Override // com.p7700g.p99005.p54
    public StringBuilder d(StringBuilder sb, String str, char c, int i) {
        return f(sb, str, c, "<=", i);
    }

    @Override // com.p7700g.p99005.p54
    public StringBuilder e(StringBuilder sb, String str, char c, int i) {
        return f(sb, str, c, AppCenter.KEY_VALUE_DELIMITER, i);
    }
}