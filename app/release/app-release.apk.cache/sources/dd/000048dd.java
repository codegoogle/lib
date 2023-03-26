package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.jv2;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class in2 implements jv2.a {
    public static final /* synthetic */ in2 a = new in2();

    @Override // com.p7700g.p99005.jv2.a
    public final String a(Object obj) {
        return r1.getPackageManager().getInstallerPackageName(((Context) obj).getPackageName());
    }
}