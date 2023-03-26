package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f extends a {
    public static final int e = 1;
    public String a;
    public int b;
    public String c;
    public int d;

    public f(String str) {
        this.d = 0;
        this.a = str;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        if (1 == this.d) {
            com.anythink.core.common.i.c.a(this.b, this.c, "200", "");
            return null;
        }
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        return this.a;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        return "";
    }

    @Override // com.anythink.core.common.g.a
    public final boolean h() {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final String i() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Context j() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String l() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, Object> m() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
        if (1 == this.d && ErrorCode.httpStatuException.equals(adError.getCode())) {
            com.anythink.core.common.i.c.a(this.b, this.c, adError.getPlatformCode(), adError.getPlatformMSG());
        }
    }

    public f(String str, int i, String str2) {
        this(str);
        this.d = 1;
        this.b = i;
        this.c = str2;
    }
}