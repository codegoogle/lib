package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;

/* compiled from: NewCookieProvider.java */
/* loaded from: classes3.dex */
public class nu3 implements yx3<vm4> {
    @Override // com.p7700g.p99005.yx3
    public boolean c(Class<?> cls) {
        return cls == vm4.class;
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: d */
    public vm4 a(String str) {
        if (str != null) {
            return kt3.F(str);
        }
        throw new IllegalArgumentException("NewCookie is null");
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: e */
    public String b(vm4 vm4Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(vm4Var.b());
        sb.append('=');
        qu3.d(sb, vm4Var.d());
        sb.append(AppCenter.PAIR_DELIMITER);
        sb.append("Version=");
        sb.append(vm4Var.e());
        if (vm4Var.g() != null) {
            sb.append(";Comment=");
            qu3.d(sb, vm4Var.g());
        }
        if (vm4Var.a() != null) {
            sb.append(";Domain=");
            qu3.d(sb, vm4Var.a());
        }
        if (vm4Var.c() != null) {
            sb.append(";Path=");
            qu3.d(sb, vm4Var.c());
        }
        if (vm4Var.h() != -1) {
            sb.append(";Max-Age=");
            sb.append(vm4Var.h());
        }
        if (vm4Var.i()) {
            sb.append(";Secure");
        }
        return sb.toString();
    }
}