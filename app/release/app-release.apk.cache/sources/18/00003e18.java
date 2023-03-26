package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ConfigOptionsBuilder.java */
/* loaded from: classes.dex */
public class d61 {
    @x1
    private final Map<String, List<String>> b = new HashMap();
    @x1
    private final Map<String, List<String>> c = new HashMap();
    @x1
    private String a = "";

    @x1
    public d61 a(@x1 String str, @x1 String str2) {
        List<String> list = this.c.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(str2);
        this.c.put(str, list);
        return this;
    }

    @x1
    public d61 b(@x1 String str, @x1 Collection<String> collection) {
        List<String> list = this.c.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(collection);
        this.c.put(str, list);
        return this;
    }

    @x1
    public d61 c(@x1 String str, @x1 String str2) {
        List<String> list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(str2);
        this.b.put(str, list);
        return this;
    }

    @x1
    public d61 d(@x1 String str, @x1 Collection<String> collection) {
        List<String> list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(collection);
        this.b.put(str, list);
        return this;
    }

    @x1
    public d61 e(@x1 String str, @x1 String[] strArr) {
        List<String> list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(Arrays.asList(strArr));
        this.b.put(str, list);
        return this;
    }

    @x1
    public e61 f() {
        return new e61(this.a, this.b, this.c);
    }

    @x1
    public d61 g(@x1 String str) {
        this.a = str;
        return this;
    }
}