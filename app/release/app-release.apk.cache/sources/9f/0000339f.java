package com.iab.omid.library.ironsrc.walking.a;

import com.iab.omid.library.ironsrc.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {
    public final HashSet<String> a;
    public final JSONObject b;
    public final long c;

    public a(b.InterfaceC0107b interfaceC0107b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0107b);
        this.a = new HashSet<>(hashSet);
        this.b = jSONObject;
        this.c = j;
    }
}