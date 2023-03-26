package com.anythink.basead.f.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.a.a;
import com.anythink.basead.a.f;
import com.anythink.basead.c.c;
import com.anythink.core.c.d;
import com.anythink.core.c.e;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    private static a a;
    private Context b;

    private a(Context context) {
        this.b = context.getApplicationContext();
    }

    public static a a(Context context) {
        if (a == null) {
            a = new a(context);
        }
        return a;
    }

    public final String b(String str) {
        d a2 = e.a(this.b).a(str);
        if (a2 == null) {
            return "";
        }
        List<q> z = a2.z();
        ArrayList arrayList = new ArrayList();
        if (z == null || z.size() == 0) {
            return "";
        }
        for (int size = z.size() - 1; size >= 0; size--) {
            q qVar = z.get(size);
            f.a();
            if (!f.a(qVar, a2.y())) {
                z.remove(size);
            } else {
                arrayList.add(b.a(this.b).d(qVar));
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        Collections.sort(arrayList, new Comparator<c>() { // from class: com.anythink.basead.f.a.a.1
            private static int a(c cVar, c cVar2) {
                return Integer.valueOf(cVar.d).compareTo(Integer.valueOf(cVar2.d));
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(c cVar, c cVar2) {
                return Integer.valueOf(cVar.d).compareTo(Integer.valueOf(cVar2.d));
            }
        });
        return ((c) arrayList.get(0)).a;
    }

    public final void a(String str) {
        List<q> z;
        s y;
        d a2 = e.a(this.b).a(str);
        if (a2 == null || (z = a2.z()) == null || (y = a2.y()) == null) {
            return;
        }
        f.a();
        int size = z.size();
        for (int i = 0; i < size; i++) {
            f.a(str, true, z.get(i), y, null);
        }
    }

    public final q a(String str, String str2) {
        d a2 = e.a(this.b).a(str);
        if (a2 == null) {
            return null;
        }
        return a2.e(str2);
    }

    public final String a(String str, s sVar) {
        List<q> c = e.a(this.b).c(str);
        JSONObject jSONObject = new JSONObject();
        if (c != null) {
            try {
                for (q qVar : c) {
                    f.a();
                    if (f.a(qVar, sVar)) {
                        jSONObject.put(qVar.k(), qVar.l());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public final void a(String str, q qVar, k kVar, a.InterfaceC0017a interfaceC0017a) {
        if (a(qVar)) {
            interfaceC0017a.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.h, com.anythink.basead.c.f.D));
        } else if (b.a(this.b).b(qVar)) {
            interfaceC0017a.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.e, com.anythink.basead.c.f.w));
        } else if (b.a(this.b).c(qVar)) {
            interfaceC0017a.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f, com.anythink.basead.c.f.x));
        } else {
            f.a();
            f.a(str, qVar, kVar, interfaceC0017a);
        }
    }

    private static boolean a(q qVar) {
        List<String> i = m.a().i();
        if (i != null) {
            for (String str : i) {
                if (TextUtils.equals(qVar.w(), str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean a(q qVar, k kVar, boolean z) {
        if (this.b == null || qVar == null || a(qVar)) {
            return false;
        }
        if (z) {
            f.a();
            return f.a(qVar, kVar);
        }
        if (!b.a(this.b).b(qVar) && !b.a(this.b).c(qVar)) {
            f.a();
            if (f.a(qVar, kVar)) {
                return true;
            }
        }
        return false;
    }
}