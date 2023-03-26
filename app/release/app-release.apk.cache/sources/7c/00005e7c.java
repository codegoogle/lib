package com.p7700g.p99005;

import com.microsoft.appcenter.crashes.utils.ErrorLogHelper;
import com.p7700g.p99005.i2;

/* compiled from: FileExtension.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public enum tm0 {
    JSON(ErrorLogHelper.ERROR_LOG_FILE_EXTENSION),
    ZIP(j20.w);
    
    public final String v;

    tm0(String str) {
        this.v = str;
    }

    public String f() {
        StringBuilder G = wo1.G(".temp");
        G.append(this.v);
        return G.toString();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.v;
    }
}