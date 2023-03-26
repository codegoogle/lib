package com.anythink.core.common.res.image;

import com.anythink.core.common.b.m;
import com.anythink.core.common.j.f;
import com.anythink.core.common.res.d;
import com.anythink.core.common.res.e;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends b {
    public e a;
    public InterfaceC0051a b;

    /* renamed from: com.anythink.core.common.res.image.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0051a {
        void a(e eVar);

        void a(e eVar, String str);
    }

    public a(e eVar) {
        super(eVar.e);
        this.a = eVar;
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    public final void a(InterfaceC0051a interfaceC0051a) {
        this.b = interfaceC0051a;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
        InterfaceC0051a interfaceC0051a = this.b;
        if (interfaceC0051a != null) {
            interfaceC0051a.a(this.a);
        }
    }

    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        d a = d.a(m.a().e());
        e eVar = this.a;
        return a.a(eVar.d, f.a(eVar.e), inputStream);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.j.b.b bVar) {
        com.anythink.core.common.j.b.a.a().a(bVar, 5);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        InterfaceC0051a interfaceC0051a = this.b;
        if (interfaceC0051a != null) {
            interfaceC0051a.a(this.a, str2);
        }
    }
}