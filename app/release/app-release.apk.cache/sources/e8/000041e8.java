package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: UCRTrackerBuilder.java */
/* loaded from: classes2.dex */
public class f91 {
    @x1
    public List<k81<? extends z91>> a = new ArrayList();
    @x1
    public Map<String, String> b = new HashMap();
    @x1
    public Map<String, String> c = new HashMap();
    @x1
    public List<k81<? extends q91>> d = new ArrayList();

    @x1
    public f91 a(@x1 k81<? extends z91> k81Var) {
        this.a.add(k81Var);
        return this;
    }

    public void b(@x1 k81<? extends q91> k81Var) {
        this.d.add(k81Var);
    }

    @x1
    public g91 c() {
        return new g91(this);
    }

    @x1
    public f91 d(@x1 Map<String, String> map) {
        this.c = map;
        return this;
    }

    public void e(@x1 List<k81<? extends q91>> list) {
        this.d = list;
    }

    @x1
    public f91 f(@x1 String str, @x1 String str2) {
        this.b.put(str, str2);
        return this;
    }
}