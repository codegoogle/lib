package com.p7700g.p99005;

import android.os.Bundle;
import android.text.TextUtils;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.SessionConfig;
import com.google.gson.Gson;
import com.p7700g.p99005.gn1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SwitcherStartHelper.java */
/* loaded from: classes.dex */
public class h51 {
    @x1
    public static final String a = "extra:update_rules";
    @x1
    public static final String b = "key:transport:factories";
    @x1
    public static final String c = "extra:geoip";
    @x1
    public static final String d = "params:session";
    @x1
    public static final String e = "params:config:version";
    @x1
    public static final String f = "extra_fast_start";
    @x1
    public static final String g = "params:config:remote";
    @x1
    public static final String h = "vpn_service_params";
    @x1
    public static final String i = "params:credentials";
    @x1
    public static final String j = "params:sdk:version";
    @x1
    public static final String k = "params:sdk:fallback-start";
    @x1
    public static final String l = "extra:transportid";
    @x1
    public static final String m = "extra:client:info";
    @x1
    public static final String n = "extra:client:ip";
    @x1
    public static final String o = "vpn_start_response";
    @x1
    public static final String p = "hydrasdk:extra:patcher";
    @x1
    public static final String q = "transport:extra:mode";
    public static final int r = 3;
    private static final int s = 0;
    @x1
    private final Gson t;
    @x1
    private final Map<String, ti1> u = new HashMap();

    public h51(@x1 Gson gson) {
        this.t = gson;
    }

    private z51 f(@x1 Bundle bundle) {
        z51 z51Var = (z51) this.t.n(bundle.getString(d), z51.class);
        return z51Var == null ? new z51() : z51Var;
    }

    private ClientInfo i(@x1 Bundle bundle) {
        ClientInfo clientInfo = (ClientInfo) this.t.n(bundle.getString("params:clientid"), ClientInfo.class);
        return clientInfo == null ? ClientInfo.newBuilder().g(" ").f() : clientInfo;
    }

    @x1
    private g51 j(@x1 Bundle bundle) {
        ClientInfo i2 = i(bundle);
        z51 f2 = f(bundle);
        boolean z = bundle.getBoolean(a, false);
        boolean z2 = bundle.getBoolean("extra_fast_start", false);
        ft0 ft0Var = (ft0) this.t.n(bundle.getString(i), ft0.class);
        gn1 m2 = m(bundle.getString(h));
        return new g51(new SessionConfig.b().A(f2.b()).I(f2.i()).E(f2.f()).C(f2.a()).D(f2.e()).G(f2.h()).J(m2).s(), i2, ft0Var, (mr0) this.t.n(bundle.getString(g), mr0.class), null, z, z2, false);
    }

    @x1
    private List<xm1> k(@x1 JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            Iterator<String> keys = optJSONObject.keys();
            String str = "";
            int i3 = 0;
            while (keys.hasNext()) {
                Object obj = optJSONObject.get(keys.next());
                if (obj instanceof String) {
                    str = obj.toString();
                } else if (obj instanceof Integer) {
                    i3 = ((Integer) obj).intValue();
                }
            }
            if (!TextUtils.isEmpty(str) && i3 != 0) {
                arrayList.add(new xm1(str, i3));
            }
        }
        return arrayList;
    }

    @x1
    private g51 l(@x1 Bundle bundle) {
        ClientInfo clientInfo = (ClientInfo) this.t.n(bundle.getString(m), ClientInfo.class);
        SessionConfig sessionConfig = (SessionConfig) this.t.n(bundle.getString(d), SessionConfig.class);
        return new g51(sessionConfig, clientInfo, (ft0) this.t.n(bundle.getString(i), ft0.class), (mr0) this.t.n(bundle.getString(g), mr0.class), d(sessionConfig), bundle.getBoolean(a, false), bundle.getBoolean("extra_fast_start", false), bundle.getBoolean(k));
    }

    @x1
    private gn1 m(@z1 String str) {
        try {
            gn1.b g2 = gn1.g();
            JSONObject jSONObject = new JSONObject((String) r81.f(str));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                Object obj = jSONObject.get(keys.next());
                if (obj instanceof String) {
                    g2.e(obj.toString());
                } else if (obj instanceof JSONArray) {
                    g2.i(k((JSONArray) obj));
                }
            }
            return g2.d();
        } catch (Throwable th) {
            th.printStackTrace();
            return gn1.g().d();
        }
    }

    @x1
    public ClientInfo a(@x1 Bundle bundle) {
        return (ClientInfo) this.t.n(bundle.getString(m, ""), ClientInfo.class);
    }

    @x1
    public ft0 b(@x1 Bundle bundle) {
        return (ft0) this.t.n(bundle.getString(i, ""), ft0.class);
    }

    @z1
    public k81<? extends r21> c(@x1 SessionConfig sessionConfig) {
        try {
            String str = sessionConfig.getExtras().get(p);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (k81) this.t.n(str, k81.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    @z1
    public z21 d(@x1 SessionConfig sessionConfig) {
        try {
            return (z21) this.t.n(sessionConfig.getExtras().get(c), z21.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void e(@x1 Bundle bundle, @x1 ft0 ft0Var, @x1 SessionConfig sessionConfig, @x1 ClientInfo clientInfo) {
        bundle.putString(o, this.t.z(ft0Var));
        bundle.putString(d, this.t.z(sessionConfig));
        bundle.putString(m, this.t.z(clientInfo));
        bundle.putString(n, ft0Var.d());
        bundle.putString(i, this.t.z(ft0Var));
    }

    @x1
    public String g(@x1 g51 g51Var, @x1 ti1 ti1Var, boolean z) {
        ti1 ti1Var2;
        String sessionId = g51Var.e().getSessionId();
        String str = "";
        if (!TextUtils.isEmpty(sessionId) && !z) {
            ti1 ti1Var3 = this.u.get(sessionId);
            if (ti1Var3 != null) {
                str = ti1Var3.d();
            }
        } else if (z && (ti1Var2 = this.u.get(sessionId)) != null) {
            str = ti1Var2.d();
        }
        this.u.put(sessionId, ti1Var);
        return str;
    }

    @x1
    public g51 h(@x1 Bundle bundle) {
        if (bundle.getInt(e, 0) == 3) {
            return l(bundle);
        }
        return j(bundle);
    }

    @x1
    public g51 n(@x1 Bundle bundle) {
        return (g51) this.t.n(bundle.getString(b, ""), g51.class);
    }

    @x1
    public Bundle o(@x1 SessionConfig sessionConfig, @z1 ft0 ft0Var, @x1 ClientInfo clientInfo, @x1 String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(d, this.t.z(sessionConfig));
        bundle.putString(i, this.t.z(ft0Var));
        bundle.putString(m, this.t.z(clientInfo));
        bundle.putString(j, str);
        bundle.putBoolean(ve1.s, sessionConfig.isKeepVpnOnReconnect());
        bundle.putBoolean(ve1.t, sessionConfig.isCaptivePortalBlockBypass());
        bundle.putString("transport:extra:mode", sessionConfig.getTransport());
        bundle.putString("extra:transportid", sessionConfig.getTransport());
        bundle.putBoolean("extra_fast_start", z);
        bundle.putInt(e, 3);
        return bundle;
    }

    @x1
    public j51 p(@x1 fo1 fo1Var) {
        return (j51) this.t.n(fo1Var.w.getString("extra:transportid"), j51.class);
    }
}