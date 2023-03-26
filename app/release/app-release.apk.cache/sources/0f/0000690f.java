package com.p7700g.p99005;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ze3 {
    public String a;
    public com.ironsource.sdk.h.b b;

    /* loaded from: classes3.dex */
    public class a implements com.ironsource.sdk.k.c {
        private /* synthetic */ com.ironsource.sdk.controller.o s;
        private /* synthetic */ com.ironsource.sdk.controller.n t;

        public a(com.ironsource.sdk.controller.o oVar, com.ironsource.sdk.controller.n nVar) {
            this.s = oVar;
            this.t = nVar;
        }

        @Override // com.ironsource.sdk.k.c
        public final void a(com.ironsource.sdk.h.c cVar) {
            try {
                com.ironsource.sdk.controller.o oVar = this.s;
                com.ironsource.sdk.controller.n nVar = this.t;
                oVar.a(nVar, ze3.c(nVar, cVar.a()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.ironsource.sdk.k.c
        public final void a(com.ironsource.sdk.h.c cVar, com.ironsource.sdk.g.e eVar) {
            try {
                com.ironsource.sdk.controller.o oVar = this.s;
                com.ironsource.sdk.controller.n nVar = this.t;
                oVar.b(nVar, ze3.b(nVar, eVar.a));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ze3(String str, com.ironsource.sdk.h.b bVar) {
        this.a = str;
        this.b = bVar;
    }

    public static JSONObject a(com.ironsource.sdk.controller.n nVar, long j) {
        try {
            return nVar.a().put("result", j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public static JSONObject b(com.ironsource.sdk.controller.n nVar, String str) {
        try {
            return nVar.a().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public static JSONObject c(com.ironsource.sdk.controller.n nVar, JSONObject jSONObject) {
        try {
            return nVar.a().put("result", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }
}