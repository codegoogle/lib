package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m extends f {
    private Activity b;
    private AnythinkContainerView c;

    public m(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.b = activity;
        this.c = anythinkContainerView;
    }

    private static com.anythink.expressad.videocommon.e.d c(String str) {
        if (com.anythink.expressad.videocommon.e.c.a() == null) {
            return null;
        }
        return com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), str);
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final String a() {
        if (this.c == null) {
            super.a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c.getCampaign());
                String unitID = this.c.getUnitID();
                String str = com.anythink.expressad.out.b.a + ",3.0.1";
                com.anythink.expressad.videocommon.e.d a = com.anythink.expressad.videocommon.e.c.a() == null ? null : com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), unitID);
                JSONObject jSONObject = new JSONObject();
                if (a != null) {
                    jSONObject = a.Q();
                }
                com.anythink.expressad.foundation.h.n.a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.c.getCampaign());
                return a(arrayList, unitID, str, jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.a();
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final void b(String str) {
        super.b(str);
        try {
            if (this.b == null || TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals("landscape")) {
                this.b.setRequestedOrientation(0);
            } else if (str.equals("portrait")) {
                this.b.setRequestedOrientation(1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i, com.anythink.expressad.video.signal.h
    public final void handlerPlayableException(String str) {
        AnythinkContainerView anythinkContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.b == null || TextUtils.isEmpty(str) || (anythinkContainerView = this.c) == null) {
                return;
            }
            anythinkContainerView.handlerPlayableException(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void install(com.anythink.expressad.foundation.d.c cVar) {
        super.install(cVar);
        AnythinkContainerView anythinkContainerView = this.c;
        if (anythinkContainerView != null) {
            anythinkContainerView.install(cVar);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        AnythinkContainerView anythinkContainerView = this.c;
        if (anythinkContainerView != null) {
            anythinkContainerView.notifyCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.c;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        AnythinkContainerView anythinkContainerView = this.c;
        if (anythinkContainerView != null) {
            anythinkContainerView.toggleCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.h
    public final void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.c;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.f, com.anythink.expressad.video.signal.i
    public final void a(String str) {
        AnythinkContainerView anythinkContainerView;
        super.a(str);
        try {
            if (this.b == null || TextUtils.isEmpty(str) || !str.equals(com.anythink.expressad.foundation.d.c.bY) || (anythinkContainerView = this.c) == null) {
                return;
            }
            anythinkContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static String a(List<com.anythink.expressad.foundation.d.c> list, String str, String str2, JSONObject jSONObject) {
        try {
            if (list.size() > 0) {
                com.anythink.expressad.foundation.h.a aVar = new com.anythink.expressad.foundation.h.a(com.anythink.expressad.foundation.b.a.b().d());
                Object b = com.anythink.expressad.foundation.d.c.b(list);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("campaignList", b);
                jSONObject2.put(AbstractLog.DEVICE, aVar.a());
                jSONObject2.put("unit_id", str);
                jSONObject2.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, str2);
                jSONObject2.put("unitSetting", jSONObject);
                if (com.anythink.expressad.d.b.a() != null) {
                    com.anythink.expressad.d.b.a();
                    String a = com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e());
                    if (!TextUtils.isEmpty(a)) {
                        JSONObject jSONObject3 = new JSONObject(a);
                        try {
                            Context d = com.anythink.expressad.foundation.b.a.b().d();
                            String obj = u.b(d, "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
                            String obj2 = u.b(d, "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
                            String obj3 = u.b(d, "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
                            String obj4 = u.b(d, "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
                            if (!TextUtils.isEmpty(obj)) {
                                jSONObject3.put(com.anythink.expressad.d.a.b.ct, obj);
                            }
                            if (!TextUtils.isEmpty(obj2)) {
                                jSONObject3.put(com.anythink.expressad.d.a.b.cu, obj2);
                            }
                            if (!TextUtils.isEmpty(obj3)) {
                                jSONObject3.put(com.anythink.expressad.d.a.b.cv, obj3);
                            }
                            if (!TextUtils.isEmpty(obj4)) {
                                jSONObject3.put(com.anythink.expressad.d.a.b.cx, obj4);
                            }
                            if (!TextUtils.isEmpty(obj4)) {
                                jSONObject3.put(com.anythink.expressad.d.a.b.cw, obj4);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        com.anythink.expressad.d.b.a();
                        String b2 = com.anythink.expressad.d.b.b(str);
                        if (!TextUtils.isEmpty(b2)) {
                            jSONObject3.put("ivreward", new JSONObject(b2));
                        }
                        jSONObject2.put("appSetting", jSONObject3);
                    }
                }
                return jSONObject2.toString();
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static void a(JSONObject jSONObject, String str) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            String obj = u.b(d, "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
            String obj2 = u.b(d, "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
            String obj3 = u.b(d, "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
            String obj4 = u.b(d, "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put(com.anythink.expressad.d.a.b.ct, obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cu, obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cv, obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put(com.anythink.expressad.d.a.b.cx, obj4);
            }
            if (TextUtils.isEmpty(obj4)) {
                return;
            }
            jSONObject.put(com.anythink.expressad.d.a.b.cw, obj4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}