package com.p7700g.p99005;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.Nullable;

/* compiled from: PublicSuffixDatabase.kt */
@vo4(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* synthetic */ class ou5 extends m25 {
    public ou5(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
    }

    @Override // com.p7700g.p99005.m25, com.p7700g.p99005.g65
    @Nullable
    public Object get() {
        return PublicSuffixDatabase.b((PublicSuffixDatabase) this.u);
    }

    @Override // com.p7700g.p99005.m25, com.p7700g.p99005.b65
    public void set(@Nullable Object obj) {
        ((PublicSuffixDatabase) this.u).i = (byte[]) obj;
    }
}