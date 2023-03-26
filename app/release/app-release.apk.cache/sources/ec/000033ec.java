package com.ironsource.environment;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k {
    private static final String a = "k";
    private static final ArrayList<String> b = new a();

    /* loaded from: classes3.dex */
    public static class a extends ArrayList<String> {
        public a() {
            add("com.google.market");
            add("com.android.vending");
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends JSONObject {
        private /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
            put("isInstalled", this.a);
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{"com.google.market"}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});
        
        private static final Map<String, c> x = new HashMap();
        private final String[] A;
        private final int z;

        static {
            c[] values = values();
            for (int i = 0; i < 5; i++) {
                c cVar = values[i];
                for (String str : cVar.A) {
                    x.put(str, cVar);
                }
            }
        }

        c(int i, String[] strArr) {
            this.z = i;
            this.A = strArr;
        }

        public static /* synthetic */ ArrayList f() {
            return new ArrayList(x.keySet());
        }
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> c2 = c(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                jSONObject.put(next, new b(c2.contains(next.trim().toLowerCase())));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static boolean a(Context context) {
        JSONObject a2 = a(context, b);
        Iterator<String> keys = a2.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a2.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    public static Integer b(Context context) {
        JSONObject a2 = a(context, c.f());
        c[] values = c.values();
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            c cVar = values[i2];
            String[] strArr = cVar.A;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                JSONObject optJSONObject = a2.optJSONObject(strArr[i3]);
                if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                    i = (int) (Math.pow(2.0d, cVar.z - 1) + i);
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i);
    }

    private static ArrayList<String> c(Context context) {
        List<ApplicationInfo> p = h.p(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : p) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase());
            }
        }
        return arrayList;
    }
}