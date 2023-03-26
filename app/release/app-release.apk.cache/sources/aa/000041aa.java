package com.p7700g.p99005;

import android.content.Context;
import com.anchorfree.sdk.fireshield.AlertPage;
import com.anchorfree.sdk.fireshield.FireshieldCategory;
import com.anchorfree.sdk.fireshield.FireshieldCategoryRule;
import com.anchorfree.sdk.fireshield.FireshieldConfig;
import com.p7700g.p99005.oq0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HydraConfigProvider.java */
/* loaded from: classes.dex */
public class f61 {
    @x1
    public static final String a = "scanned_connections";
    public static final String b = "category";
    @x1
    private static final String c = "{\n           \"https_client\":{}\n       }";
    @x1
    public final Context d;
    @x1
    public final File e;
    @x1
    public c61 f;
    @x1
    public final k31 g;
    @x1
    private final jf1 h;

    /* compiled from: HydraConfigProvider.java */
    /* loaded from: classes.dex */
    public enum a {
        BYPASS("bypass"),
        PROXY_PEER("proxy_peer"),
        VPN("vpn");
        
        @x1
        private final String w;

        a(@x1 String str) {
            this.w = str;
        }

        @Override // java.lang.Enum
        @x1
        public String toString() {
            return this.w;
        }
    }

    public f61(@x1 Context context, @x1 c61 c61Var, @x1 k31 k31Var, @x1 jf1 jf1Var) {
        this.e = context.getCacheDir();
        this.d = context;
        this.f = c61Var;
        this.g = k31Var;
        this.h = jf1Var;
    }

    @x1
    private JSONObject a(@x1 String str, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("id", i);
        return jSONObject;
    }

    @z1
    private JSONObject b(@z1 FireshieldConfig fireshieldConfig) throws IOException, JSONException {
        if (fireshieldConfig == null || !fireshieldConfig.isEnabled()) {
            return null;
        }
        la1 la1Var = new la1(this.f.b(oq0.l.g));
        la1Var.o("service-enabled", fireshieldConfig.isEnabled() ? 1L : 0L);
        JSONArray e = la1Var.e("services");
        if (e != null) {
            for (String str : fireshieldConfig.getServices()) {
                e.put(str);
            }
        }
        List<FireshieldCategory> categories = fireshieldConfig.getCategories();
        f(la1Var, categories, "categories");
        JSONArray e2 = la1Var.e("category-rules");
        if (e2 != null) {
            HashMap hashMap = new HashMap();
            for (FireshieldCategoryRule fireshieldCategoryRule : fireshieldConfig.getCategoryRules()) {
                List list = (List) hashMap.get(fireshieldCategoryRule.getCategory());
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(fireshieldCategoryRule);
                hashMap.put(fireshieldCategoryRule.getCategory(), list);
            }
            for (FireshieldCategory fireshieldCategory : categories) {
                List<FireshieldCategoryRule> list2 = (List) hashMap.get(fireshieldCategory.getCategory());
                if (list2 != null) {
                    LinkedList linkedList = new LinkedList();
                    for (FireshieldCategoryRule fireshieldCategoryRule2 : list2) {
                        File file = fireshieldCategoryRule2.getFile(this.d, this.e);
                        if (file != null) {
                            linkedList.add(file);
                        }
                    }
                    File b2 = i31.b("fireshield", linkedList);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(b, fireshieldCategory.getCategory());
                    jSONObject.put(o31.b, b2.getAbsolutePath());
                    e2.put(jSONObject);
                }
            }
        }
        return la1Var.k();
    }

    @x1
    private String c(@x1 String str, @x1 ft0 ft0Var, @z1 String str2, @z1 FireshieldConfig fireshieldConfig, @z1 List<a81> list, @z1 List<a81> list2, @x1 List<gt0> list3) throws Exception {
        d61 g = new d61().g(str);
        for (gt0 gt0Var : list3) {
            g.a("default", gt0Var.c());
        }
        la1 la1Var = new la1(this.f.a(g.f(), ft0Var));
        FireshieldConfig b2 = this.g.b(fireshieldConfig, str2);
        la1Var.r("modules/viper/generic-proxy/plugin-chain", d(b2));
        la1Var.s("modules/viper/categorization", b(b2));
        la1Var.p("modules/viper/categorization/scanned-conns-stats/slide-wnd-file", a);
        if (list != null) {
            la1Var.r("modules/viper/dns-proxy/proxy-rules", o31.a(this.d, this.e, str, list));
        }
        if (list2 != null) {
            la1Var.r("modules/viper/generic-proxy/proxy-rules", o31.b(this.d, str, list2));
        }
        return la1Var.j();
    }

    @x1
    private JSONArray d(@x1 FireshieldConfig fireshieldConfig) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (fireshieldConfig.isEnabled()) {
            JSONObject a2 = a("vpr-rules", 1);
            AlertPage alertPage = fireshieldConfig.getAlertPage();
            if (alertPage != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("domain", alertPage.getDomain());
                jSONObject.put(la1.k, alertPage.getPath());
                a2.put("alert-page", jSONObject);
            }
            jSONArray.put(a2);
        }
        jSONArray.put(a("gnrprx", 2));
        return jSONArray;
    }

    private boolean e(@x1 la1 la1Var) {
        JSONArray e = la1Var.e("modules/viper/categorization/categories");
        if (e != null) {
            for (int i = 0; i < e.length(); i++) {
                if (FireshieldConfig.Categories.SAFE.equals(e.optJSONObject(i).optString(b))) {
                    return true;
                }
            }
        }
        return false;
    }

    private void f(la1 la1Var, List<FireshieldCategory> list, String str) throws JSONException {
        boolean z;
        JSONArray e = la1Var.e(str);
        if (e == null) {
            e = new JSONArray();
            z = true;
        } else {
            z = false;
        }
        for (FireshieldCategory fireshieldCategory : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b, fireshieldCategory.getCategory());
            jSONObject.put("type", fireshieldCategory.getType());
            Map<String, Object> opts = fireshieldCategory.getOpts();
            for (String str2 : opts.keySet()) {
                jSONObject.put(str2, opts.get(str2));
            }
            e.put(jSONObject);
        }
        if (z) {
            la1Var.r(str, e);
        }
    }

    @x1
    public String g(@x1 ft0 ft0Var, @z1 String str, @z1 FireshieldConfig fireshieldConfig, @z1 List<a81> list, @z1 List<a81> list2) throws Exception {
        return h("proxy_peer", ft0Var, str, fireshieldConfig, list, list2);
    }

    @x1
    public String h(@x1 String str, @x1 ft0 ft0Var, @z1 String str2, @z1 FireshieldConfig fireshieldConfig, @z1 List<a81> list, @z1 List<a81> list2) throws Exception {
        return c(str, ft0Var, str2, fireshieldConfig, list, list2, this.h.a(ft0Var));
    }

    @x1
    public String i(@x1 String str) throws tb1, JSONException {
        la1 la1Var = new la1(str);
        if (la1Var.h() == null) {
            if (la1Var.i("modules/viper/categorization/service-enabled", -1) == 1 && !e(la1Var)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(FireshieldCategory.Builder.proxy(FireshieldConfig.Categories.SAFE));
                f(la1Var, arrayList, "modules/viper/categorization/categories");
            }
            return la1Var.j();
        }
        throw new tb1(la1Var.h());
    }
}