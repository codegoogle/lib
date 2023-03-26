package com.ironsource.sdk.b;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {
    public int b = 4;
    public int c = 4;
    public HashMap<String, Boolean> a = new a();

    /* loaded from: classes3.dex */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put("isVisible", Boolean.valueOf(d.this.b == 0));
            put("isWindowVisible", Boolean.valueOf(d.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put("isShown", bool);
            put("isViewVisible", bool);
        }
    }

    public final JSONObject a() {
        return new JSONObject(this.a);
    }
}