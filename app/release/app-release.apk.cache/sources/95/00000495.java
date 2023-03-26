package com.anythink.basead.f;

import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.BannerAdView;
import com.anythink.core.common.e.j;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends c {
    public com.anythink.basead.e.a a;
    private final String k;

    public b(Context context, j jVar, String str, boolean z) {
        super(context, jVar, str, z);
        this.k = b.class.getSimpleName();
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.a = aVar;
    }

    @Override // com.anythink.basead.f.a
    public final void a(Map<String, Object> map) {
    }

    public final View b() {
        if (a()) {
            return new BannerAdView(this.c, this.d, this.g, this.a);
        }
        return null;
    }

    @Override // com.anythink.basead.f.c
    public final void c() {
        this.a = null;
    }
}