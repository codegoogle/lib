package com.anythink.core.b;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.af;
import com.anythink.core.common.j.p;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i {
    public static String a = "i";
    public com.anythink.core.common.e.a b;
    public Map<String, Object> c;
    public a d;

    /* renamed from: com.anythink.core.b.i$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ATBaseAdAdapter a;
        public final /* synthetic */ af b;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, af afVar) {
            this.a = aTBaseAdAdapter;
            this.b = afVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.a(i.this, this.a, this.b);
        }
    }

    /* renamed from: com.anythink.core.b.i$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements ATBidRequestInfoListener {
        public final /* synthetic */ af a;

        public AnonymousClass2(af afVar) {
            this.a = afVar;
        }

        @Override // com.anythink.core.api.ATBidRequestInfoListener
        public final void onFailed(String str) {
            a aVar = i.this.d;
            if (aVar != null) {
                aVar.a(str, this.a);
            }
        }

        @Override // com.anythink.core.api.ATBidRequestInfoListener
        public final void onSuccess(ATBidRequestInfo aTBidRequestInfo) {
            i.a(i.this, this.a, aTBidRequestInfo);
        }
    }

    /* renamed from: com.anythink.core.b.i$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ATBidRequestInfo a;
        public final /* synthetic */ af b;

        public AnonymousClass3(ATBidRequestInfo aTBidRequestInfo, af afVar) {
            this.a = aTBidRequestInfo;
            this.b = afVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject requestJSONObject;
            try {
                ATBidRequestInfo aTBidRequestInfo = this.a;
                if (aTBidRequestInfo != null && (requestJSONObject = aTBidRequestInfo.toRequestJSONObject()) != null) {
                    ATBidRequestInfo.fillBaseCommonParams(requestJSONObject, String.valueOf(i.this.b.e), this.b.t(), this.b.c());
                    if (this.b.l() == 3) {
                        requestJSONObject.put("unit_id", this.b.t());
                        requestJSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, m.a().j());
                    }
                    a aVar = i.this.d;
                    if (aVar != null) {
                        aVar.a(this.b, requestJSONObject);
                        return;
                    }
                    return;
                }
                a aVar2 = i.this.d;
                if (aVar2 != null) {
                    aVar2.a(ATBidRequestInfo.RETURN_PARAMS_ERROR_TYPE, this.b);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                a aVar3 = i.this.d;
                if (aVar3 != null) {
                    aVar3.a(th.getMessage(), this.b);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(af afVar, ATBaseAdAdapter aTBaseAdAdapter);

        void a(af afVar, JSONObject jSONObject);

        void a(String str, af afVar);
    }

    public i(com.anythink.core.common.e.a aVar) {
        this.b = aVar;
        this.c = aVar.q;
    }

    private void a(af afVar, a aVar) {
        this.d = aVar;
        ATBaseAdAdapter a2 = com.anythink.core.common.j.i.a(afVar);
        if (a2 == null) {
            aVar.a(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE, afVar);
        } else {
            com.anythink.core.common.j.b.a.a().a(new AnonymousClass1(a2, afVar));
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, af afVar) {
        try {
            com.anythink.core.common.e.a aVar = this.b;
            Map<String, Object> a2 = aVar.n.a(aVar.d, aVar.c, afVar);
            com.anythink.core.common.e.e M = this.b.s.M();
            p.a(M, afVar, 0, false);
            com.anythink.core.common.j.g.a(a2, M);
            aTBaseAdAdapter.getBidRequestInfo(this.b.a, a2, this.c, new AnonymousClass2(afVar));
            a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.a(afVar, aTBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar3 = this.d;
            if (aVar3 != null) {
                aVar3.a(th.getMessage(), afVar);
            }
        }
    }

    private void a(af afVar, ATBidRequestInfo aTBidRequestInfo) {
        com.anythink.core.common.j.b.a.a().a(new AnonymousClass3(aTBidRequestInfo, afVar));
    }

    public static /* synthetic */ void a(i iVar, ATBaseAdAdapter aTBaseAdAdapter, af afVar) {
        try {
            com.anythink.core.common.e.a aVar = iVar.b;
            Map<String, Object> a2 = aVar.n.a(aVar.d, aVar.c, afVar);
            com.anythink.core.common.e.e M = iVar.b.s.M();
            p.a(M, afVar, 0, false);
            com.anythink.core.common.j.g.a(a2, M);
            aTBaseAdAdapter.getBidRequestInfo(iVar.b.a, a2, iVar.c, new AnonymousClass2(afVar));
            a aVar2 = iVar.d;
            if (aVar2 != null) {
                aVar2.a(afVar, aTBaseAdAdapter);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a aVar3 = iVar.d;
            if (aVar3 != null) {
                aVar3.a(th.getMessage(), afVar);
            }
        }
    }

    public static /* synthetic */ void a(i iVar, af afVar, ATBidRequestInfo aTBidRequestInfo) {
        com.anythink.core.common.j.b.a.a().a(new AnonymousClass3(aTBidRequestInfo, afVar));
    }
}