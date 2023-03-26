package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AvailableCountries.java */
/* loaded from: classes.dex */
public class dt0 {
    @mw2("countries")
    @z1
    private List<pr0> a;
    @mw2("private_groups")
    @z1
    private List<tr0> b;

    public dt0(@x1 List<pr0> list, @x1 List<tr0> list2) {
        this.a = list;
        this.b = list2;
    }

    @x1
    public List<pr0> a() {
        List<pr0> list = this.a;
        return list == null ? new ArrayList() : Collections.unmodifiableList(list);
    }

    @x1
    public List<tr0> b() {
        List<tr0> list = this.b;
        return list == null ? new ArrayList() : Collections.unmodifiableList(list);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("AvailableCountries{countries=");
        G.append(this.a);
        G.append("privateGroups=");
        G.append(this.b);
        G.append('}');
        return G.toString();
    }
}