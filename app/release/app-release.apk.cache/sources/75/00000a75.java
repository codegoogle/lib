package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.d.r;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class j extends c {
    private static final String t = "j";
    private static final String u = "正在下载中,请稍后...";
    private List<com.anythink.expressad.foundation.d.c> A;
    private int B;
    private String C;
    private String D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Activity v;
    private String w;
    private String x;
    private Context y;
    private com.anythink.expressad.foundation.d.c z;

    public j(Activity activity, com.anythink.expressad.foundation.d.c cVar) {
        this.C = "";
        this.D = "";
        this.E = false;
        this.F = false;
        this.G = true;
        this.v = activity;
        this.z = cVar;
    }

    private static JSONObject A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractLog.DEVICE, new com.anythink.expressad.foundation.h.b(com.anythink.core.common.b.m.a().e()).a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.s);
            jSONObject2.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, this.C);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.videocommon.e.d dVar = this.o;
        return dVar != null ? dVar.Q() : jSONObject;
    }

    private static JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.videocommon.e.a b = com.anythink.expressad.videocommon.e.c.a().b();
        return b != null ? b.k() : jSONObject;
    }

    private static boolean E() {
        return false;
    }

    private void c(boolean z) {
        this.G = z;
    }

    private boolean s() {
        return this.G;
    }

    private String t() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.foundation.h.b bVar = new com.anythink.expressad.foundation.h.b(com.anythink.core.common.b.m.a().e());
        try {
            jSONObject.put("unit_id", this.n);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, this.C);
            jSONObject2.put("rootViewInstanceId", this.D);
            jSONObject2.put("isRootTemplateWebView", this.E);
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.out.b.a + ",3.0.1");
            jSONObject2.put("playVideoMute", this.s);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(AbstractLog.DEVICE, bVar.a());
            JSONArray jSONArray = new JSONArray();
            List<com.anythink.expressad.foundation.d.c> list = this.A;
            if (list != null && list.size() > 0) {
                for (com.anythink.expressad.foundation.d.c cVar : this.A) {
                    jSONArray.put(com.anythink.expressad.foundation.d.c.a(cVar, cVar.av(), c(cVar)));
                }
            } else {
                jSONArray.put(com.anythink.expressad.foundation.d.c.a(this.z));
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", C());
            String e = com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.b.a();
            String a = com.anythink.expressad.d.b.a(e);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject3 = new JSONObject(a);
                a(jSONObject3);
                com.anythink.expressad.d.b.a();
                String b = com.anythink.expressad.d.b.b(this.n);
                if (!TextUtils.isEmpty(b)) {
                    jSONObject3.put("ivreward", new JSONObject(b));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", D());
            if (!TextUtils.isEmpty(this.n)) {
                jSONObject.put("unit_id", this.n);
            }
            jSONObject.put("rw_plus", this.F ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private com.anythink.expressad.a.a u() {
        if (this.q == null) {
            this.q = new com.anythink.expressad.a.a(com.anythink.core.common.b.m.a().e(), this.n);
        }
        return this.q;
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        com.anythink.expressad.foundation.h.b bVar = new com.anythink.expressad.foundation.h.b(com.anythink.core.common.b.m.a().e());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.s);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(AbstractLog.DEVICE, bVar.a());
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(com.anythink.expressad.foundation.d.c.a(this.z));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", C());
            String e = com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.b.a();
            String a = com.anythink.expressad.d.b.a(e);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject3 = new JSONObject(a);
                a(jSONObject3);
                com.anythink.expressad.d.b.a();
                String b = com.anythink.expressad.d.b.b(this.n);
                if (!TextUtils.isEmpty(b)) {
                    jSONObject3.put("ivreward", b);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", D());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SDK_INFO, com.anythink.expressad.out.b.a + ",3.0.1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.n)) {
                jSONObject.put("unit_id", this.n);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            String e = com.anythink.expressad.foundation.b.a.b().e();
            com.anythink.expressad.d.b.a();
            String a = com.anythink.expressad.d.b.a(e);
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put("appSetting", new JSONObject(a));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.anythink.expressad.videocommon.e.d dVar = this.o;
            if (dVar != null) {
                jSONObject.put("unitSetting", dVar.Q());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        this.z = cVar;
    }

    public final void b(boolean z) {
        this.F = z;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.d
    public void click(int i, String str) {
        List<com.anythink.expressad.foundation.d.c> list;
        int p;
        super.click(i, str);
        boolean z = true;
        try {
            if (i != 1) {
                if (i != 3) {
                    return;
                }
                com.anythink.expressad.foundation.d.c cVar = this.z;
                if (cVar != null && cVar.g() > -2) {
                    p = this.z.g();
                } else {
                    com.anythink.expressad.videocommon.e.d dVar = this.o;
                    p = dVar != null ? dVar.p() : 1;
                }
                if (p == -1) {
                    a(new c.b(this, this.r));
                }
                click(1, str);
                return;
            }
            if (this.z == null && (list = this.A) != null && list.size() > 0) {
                this.z = this.A.get(0);
            }
            com.anythink.expressad.foundation.d.c cVar2 = this.z;
            if (cVar2 == null) {
                return;
            }
            com.anythink.expressad.foundation.d.c a = a(str, cVar2);
            String queryParameter = Uri.parse(a.aj()).getQueryParameter(com.anythink.expressad.foundation.g.a.cf);
            int parseInt = !TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0;
            c.a aVar = this.r;
            if (parseInt != 2) {
                z = false;
            }
            aVar.a(a, z);
            u().a(this.r);
            u();
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(t, th.getMessage(), th);
        }
    }

    public final void d(String str) {
        this.D = str;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String h(int i) {
        switch (i) {
            case 1:
                return w().toString();
            case 2:
                return x().toString();
            case 3:
                return y().toString();
            case 4:
                return z().toString();
            case 5:
                return A().toString();
            case 6:
                return B().toString();
            default:
                return v().toString();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.r.a(i, str);
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(t, th.getMessage(), th);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String i() {
        this.r.b();
        this.e = true;
        if (TextUtils.isEmpty(this.w)) {
            this.w = t();
        }
        return this.w;
    }

    public final void j(int i) {
        this.B = i;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void l() {
        super.l();
        c.a aVar = this.r;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final String o() {
        com.anythink.expressad.foundation.h.n.a(t, "getNotchArea");
        return this.x;
    }

    public final void p() {
        this.E = true;
    }

    public final void q() {
        this.w = "";
    }

    public final int r() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(com.anythink.expressad.foundation.d.c cVar) {
        int i;
        String queryParameter;
        try {
            queryParameter = Uri.parse(cVar.aj()).getQueryParameter(com.anythink.expressad.foundation.g.a.cf);
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(t, "INSTALL", th);
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            i = Integer.parseInt(queryParameter);
            this.r.a(cVar, i == 2);
            u().a(this.r);
            u();
        }
        i = 0;
        this.r.a(cVar, i == 2);
        u().a(this.r);
        u();
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        this.A = list;
    }

    public final void c(String str) {
        this.C = str;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void j() {
        super.j();
        try {
            Activity activity = this.v;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(t, th.getMessage(), th);
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            Context d = com.anythink.expressad.foundation.b.a.b().d();
            String obj = u.b(d, "Anythink_ConfirmTitle" + this.n, "").toString();
            String obj2 = u.b(d, "Anythink_ConfirmContent" + this.n, "").toString();
            String obj3 = u.b(d, "Anythink_CancelText" + this.n, "").toString();
            String obj4 = u.b(d, "Anythink_ConfirmText" + this.n, "").toString();
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:10:0x002d, B:12:0x0033), top: B:17:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0019, B:8:0x0023, B:10:0x002d, B:12:0x0033), top: B:17:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(com.anythink.expressad.foundation.d.c cVar) {
        long j;
        try {
            if (!TextUtils.isEmpty(com.anythink.expressad.foundation.b.a.b().e())) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
                if (b != null) {
                    j = b.m() * 1000;
                    com.anythink.expressad.videocommon.e.a b2 = com.anythink.expressad.videocommon.e.c.a().b();
                    long c = b2 != null ? b2.c() : 0L;
                    if (cVar == null) {
                        return cVar.a(c, j);
                    }
                    return false;
                }
            }
            j = 0;
            com.anythink.expressad.videocommon.e.a b22 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b22 != null) {
            }
            if (cVar == null) {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public j(com.anythink.expressad.foundation.d.c cVar, List<com.anythink.expressad.foundation.d.c> list) {
        this.C = "";
        this.D = "";
        this.E = false;
        this.F = false;
        this.G = true;
        this.v = null;
        this.z = cVar;
        this.A = list;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.x = str;
    }

    private com.anythink.expressad.foundation.d.c a(String str, com.anythink.expressad.foundation.d.c cVar) {
        if (TextUtils.isEmpty(str)) {
            return cVar;
        }
        if (TextUtils.isEmpty(str) && cVar == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject a = com.anythink.expressad.foundation.d.c.a(cVar);
                com.anythink.expressad.foundation.d.c b = com.anythink.expressad.foundation.d.c.b(a);
                if (b == null) {
                    b = cVar;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(a, b);
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.anythink.expressad.foundation.g.a.ce);
                    if (optJSONObject != null) {
                        String.valueOf(s.b(this.v, Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.cc)).intValue()));
                        String.valueOf(s.b(this.v, Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.cd)).intValue()));
                    }
                    b.n(b.af());
                    String aj = b.aj();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (keys.hasNext()) {
                            sb.append("&");
                            String next = keys.next();
                            String optString = optJSONObject.optString(next);
                            if (com.anythink.expressad.foundation.g.a.cc.equals(next) || com.anythink.expressad.foundation.g.a.cd.equals(next)) {
                                optString = String.valueOf(s.b(this.v, Integer.valueOf(optString).intValue()));
                            }
                            sb.append(next);
                            sb.append(AppCenter.KEY_VALUE_DELIMITER);
                            sb.append(optString);
                        }
                        b.o(aj + ((Object) sb));
                    }
                }
                return b;
            } catch (JSONException e) {
                e.printStackTrace();
                return cVar;
            } catch (Throwable th) {
                th.printStackTrace();
                return cVar;
            }
        }
        try {
            JSONObject a2 = com.anythink.expressad.foundation.d.c.a(cVar);
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.opt(com.anythink.expressad.foundation.d.h.ct) == null) {
                jSONObject.put(com.anythink.expressad.foundation.d.h.ct, "");
            }
            try {
                if (!jSONObject.has(com.anythink.expressad.foundation.d.c.N)) {
                    a2.put(com.anythink.expressad.foundation.d.c.N, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                a2.put(next2, jSONObject.getString(next2));
            }
            com.anythink.expressad.foundation.d.c b2 = com.anythink.expressad.foundation.d.c.b(a2);
            a(a2, b2);
            return b2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return cVar;
        }
    }

    private static void a(JSONObject jSONObject, com.anythink.expressad.foundation.d.c cVar) {
        try {
            String optString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            cVar.j(optString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(int i, String str) {
        super.a(i, str);
        if (i != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("event", "event");
            String optString2 = jSONObject.optString("template", "-1");
            String optString3 = jSONObject.optString("layout", "-1");
            String optString4 = jSONObject.optString("unit_id", this.n);
            this.v.getApplication();
            int a = com.anythink.expressad.foundation.h.j.a();
            new r(r.j, optString, optString2, optString3, optString4, this.z.aZ(), a, com.anythink.expressad.foundation.h.j.a(this.v.getApplication(), a));
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(t, th.getMessage(), th);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(Activity activity) {
        this.v = activity;
    }

    @Override // com.anythink.expressad.video.signal.a.c, com.anythink.expressad.video.signal.c
    public final void a(Context context) {
        this.y = context;
    }
}