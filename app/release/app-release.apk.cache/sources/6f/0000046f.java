package com.anythink.basead.d.c;

import android.content.Context;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.y;
import com.anythink.core.common.j.n;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class b {
    private static b b;
    public ConcurrentHashMap<String, ArrayList<String>> a = new ConcurrentHashMap<>();

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
            }
            bVar = b;
        }
        return bVar;
    }

    public final synchronized void a(Context context, String str, i iVar, k kVar) {
        if (iVar.d() == 3 && (kVar instanceof y)) {
            if (((y) kVar).M() <= 0) {
                return;
            }
            y yVar = (y) kVar;
            ArrayList<String> arrayList = this.a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                try {
                    JSONArray jSONArray = new JSONArray(n.b(context, g.A, str, ""));
                    if (jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.optString(i));
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.put(str, arrayList);
            }
            if (arrayList.size() >= yVar.M()) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(0, iVar.k());
            n.a(context, g.A, str, new JSONArray((Collection) arrayList).toString());
        }
    }

    public final String[] a(Context context, String str) {
        ArrayList<String> arrayList = this.a.get(str);
        if (arrayList == null) {
            try {
                JSONArray jSONArray = new JSONArray(n.b(context, g.A, str, ""));
                if (jSONArray.length() > 0) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            arrayList2.add(jSONArray.optString(i));
                        } catch (Exception unused) {
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (Exception unused2) {
            }
        }
        if (arrayList != null) {
            this.a.put(str, arrayList);
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            return strArr;
        }
        return null;
    }

    public static String a(String str, String str2) {
        return wo1.t(str, str2);
    }
}