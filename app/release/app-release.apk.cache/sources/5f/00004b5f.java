package com.p7700g.p99005;

import android.os.Build;
import com.p7700g.p99005.hu0;

/* compiled from: SystemLibraryLoader.java */
/* loaded from: classes.dex */
public final class ju0 implements hu0.b {
    @Override // com.p7700g.p99005.hu0.b
    public void a(String str) {
        System.loadLibrary(str);
    }

    @Override // com.p7700g.p99005.hu0.b
    public String b(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // com.p7700g.p99005.hu0.b
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // com.p7700g.p99005.hu0.b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !ku0.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // com.p7700g.p99005.hu0.b
    public void e(String str) {
        System.load(str);
    }
}