package com.p7700g.p99005;

import java.util.HashMap;
import java.util.Map;

/* compiled from: JsonEvent.java */
/* loaded from: classes2.dex */
public class v91 {
    @x1
    private String a;
    @x1
    @mw2("event")
    private String b;
    @x1
    @mw2("properties")
    private Map<String, Object> c;

    public v91(@x1 String str, @x1 String str2, @x1 Map<String, Object> map) {
        this.a = "";
        this.b = "";
        this.c = new HashMap();
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    @x1
    public String a() {
        return this.b;
    }

    @x1
    public String b() {
        return this.a;
    }

    @x1
    public Map<String, Object> c() {
        return this.c;
    }

    public String toString() {
        StringBuilder K = wo1.K("JsonEvent{", "id='");
        wo1.d0(K, this.a, '\'', ", event='");
        wo1.d0(K, this.b, '\'', ", properties=");
        K.append(this.c);
        K.append('}');
        return K.toString();
    }

    public v91() {
        this.a = "";
        this.b = "";
        this.c = new HashMap();
    }
}