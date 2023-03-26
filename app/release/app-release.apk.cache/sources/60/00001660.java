package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.p7700g.p99005.f52;
import com.p7700g.p99005.k52;
import com.p7700g.p99005.o32;
import com.p7700g.p99005.p52;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements f52 {
    @Override // com.p7700g.p99005.f52
    public p52 create(k52 k52Var) {
        return new o32(k52Var.c(), k52Var.f(), k52Var.e());
    }
}