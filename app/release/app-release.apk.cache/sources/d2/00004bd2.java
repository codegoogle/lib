package com.p7700g.p99005;

import android.text.TextUtils;
import com.anchorfree.sdk.fireshield.AlertPage;
import com.anchorfree.sdk.fireshield.FireshieldCategory;
import com.anchorfree.sdk.fireshield.FireshieldCategoryRule;
import com.anchorfree.sdk.fireshield.FireshieldConfig;
import com.microsoft.appcenter.utils.PrefStorageConstants;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FireshieldConfigProvider.java */
/* loaded from: classes.dex */
public class k31 {
    @x1
    private static final kj1 a = kj1.b("FireshieldConfigProvider");

    /* compiled from: FireshieldConfigProvider.java */
    /* loaded from: classes.dex */
    public static class a {
        @x1
        private final JSONObject a;

        private a(@x1 JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @z1
        public static a f(@z1 String str) {
            if (str == null) {
                return null;
            }
            try {
                JSONObject f = new la1(str).f("fireshield");
                if (f != null) {
                    return new a(f);
                }
            } catch (Throwable th) {
                k31.a.f(th);
            }
            return null;
        }

        @z1
        public AlertPage a() {
            JSONObject optJSONObject = this.a.optJSONObject("alert_page");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("domain");
                String optString2 = optJSONObject.optString(la1.k);
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                    return null;
                }
                return AlertPage.create(optString, optString2);
            }
            return null;
        }

        @x1
        public List<FireshieldCategory> b() {
            LinkedList linkedList = new LinkedList();
            JSONArray optJSONArray = this.a.optJSONArray("categories");
            for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString = optJSONObject.optString(f61.b);
                String optString2 = optJSONObject.optString("type");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && ("block_dns".equals(optString2) || "block_alert_page".equals(optString2) || "bypass".equals(optString2) || "proxy_peer".equals(optString2) || "vpn".equals(optString2))) {
                    linkedList.add(FireshieldCategory.Builder.custom(optString, optString2));
                }
            }
            return linkedList;
        }

        @x1
        public List<FireshieldCategoryRule> c() {
            LinkedList linkedList = new LinkedList();
            JSONObject optJSONObject = this.a.optJSONObject("domains");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                    LinkedList linkedList2 = new LinkedList();
                    for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
                        linkedList2.add(optJSONArray.optString(i));
                    }
                    if (!linkedList2.isEmpty()) {
                        linkedList.add(FireshieldCategoryRule.Builder.fromDomains(next, linkedList2));
                    }
                }
            }
            return linkedList;
        }

        @x1
        public List<String> d() {
            LinkedList linkedList = new LinkedList();
            JSONArray optJSONArray = this.a.optJSONArray("services");
            for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
                linkedList.add(optJSONArray.optString(i));
            }
            return linkedList;
        }

        public boolean e() {
            return this.a.optBoolean(PrefStorageConstants.KEY_ENABLED);
        }
    }

    @x1
    private FireshieldConfig.Builder c(@z1 FireshieldConfig fireshieldConfig) {
        if (fireshieldConfig != null && fireshieldConfig.isEnabled()) {
            return new FireshieldConfig.Builder(fireshieldConfig);
        }
        return new FireshieldConfig.Builder().enabled(true).addService(FireshieldConfig.Services.IP).addService(FireshieldConfig.Services.BITDEFENDER).addCategory(FireshieldCategory.Builder.proxy(FireshieldConfig.Categories.SAFE)).addCategory(FireshieldCategory.Builder.proxy(FireshieldConfig.Categories.UNSAFE));
    }

    @x1
    public FireshieldConfig b(@z1 FireshieldConfig fireshieldConfig, @z1 String str) {
        FireshieldConfig.Builder c = c(fireshieldConfig);
        a f = a.f(str);
        if (f != null) {
            c.enabled(f.e());
            c.alertPage(f.a());
            if (f.d().size() > 0) {
                c.clearServices();
                for (String str2 : f.d()) {
                    c.addService(str2);
                }
            }
            for (FireshieldCategory fireshieldCategory : f.b()) {
                c.replaceCategory(fireshieldCategory);
            }
            for (FireshieldCategoryRule fireshieldCategoryRule : f.c()) {
                c.addCategoryRule(fireshieldCategoryRule);
            }
        }
        return c.build();
    }
}