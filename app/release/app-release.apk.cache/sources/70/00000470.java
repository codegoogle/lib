package com.anythink.basead.d;

import com.anythink.basead.d.c;

/* loaded from: classes2.dex */
public final class d extends c {
    private String j;

    /* loaded from: classes2.dex */
    public static class a extends c.a {
        private String j;

        public final a b(String str) {
            this.j = str;
            return this;
        }

        public final a h(int i) {
            this.a = i;
            return this;
        }

        public final a i(int i) {
            this.b = i;
            return this;
        }

        @Override // com.anythink.basead.d.c.a
        public final /* bridge */ /* synthetic */ c.a a(int i) {
            this.a = i;
            return this;
        }

        @Override // com.anythink.basead.d.c.a
        /* renamed from: b */
        public final d a() {
            d dVar = new d();
            dVar.a = this.a;
            dVar.b = this.b;
            dVar.c = this.c;
            dVar.d = this.d;
            dVar.e = this.e;
            dVar.f = this.f;
            dVar.g = this.g;
            dVar.j = this.j;
            return dVar;
        }

        @Override // com.anythink.basead.d.c.a
        public final /* bridge */ /* synthetic */ c.a b(int i) {
            this.b = i;
            return this;
        }
    }

    public final String j() {
        return this.j;
    }
}