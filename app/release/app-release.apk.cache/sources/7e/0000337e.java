package com.iab.omid.library.ironsrc.b;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class c {
    private final com.iab.omid.library.ironsrc.e.a a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @z1 String str) {
        this.a = new com.iab.omid.library.ironsrc.e.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public com.iab.omid.library.ironsrc.e.a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public FriendlyObstructionPurpose c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }
}