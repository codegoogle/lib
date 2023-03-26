package com.anythink.expressad.foundation.c.a;

import com.anythink.expressad.foundation.g.a.d;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    private d a;

    /* renamed from: com.anythink.expressad.foundation.c.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0060a {
        private static a a = new a((byte) 0);

        private C0060a() {
        }
    }

    public /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C0060a.a;
    }

    private JSONArray b() {
        return new JSONArray((Collection) this.a.a());
    }

    private a() {
        this.a = new d();
    }

    public final JSONObject a(String str) {
        JSONObject b = this.a.b(str);
        if (b != null) {
            return b;
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.a.a(next, jSONObject.optJSONObject(next));
            }
        }
    }
}