package com.anythink.basead.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.x;
import com.p7700g.p99005.sm4;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e extends com.anythink.core.common.g.a {
    public int a;
    public String b;
    public x c;
    public Map<String, Object> d;

    public e(int i, String str, x xVar, Map<String, Object> map) {
        this.a = i;
        this.b = str;
        this.c = xVar;
        this.d = map;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        if (this.d != null && !TextUtils.isEmpty(this.b)) {
            try {
                for (Map.Entry<String, Object> entry : this.d.entrySet()) {
                    String str = this.b;
                    this.b = str.replaceAll("\\{" + entry.getKey() + "\\}", (String) entry.getValue());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.b;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            k g = this.c.g();
            if (g != null && com.anythink.basead.a.b.a(this.a, g)) {
                String i = com.anythink.core.common.j.d.i();
                if (!TextUtils.isEmpty(i)) {
                    hashMap.put(sm4.v, i);
                }
            }
            return hashMap;
        }
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
}