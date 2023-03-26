package com.p7700g.p99005;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes.dex */
public class ak0 {
    private final List<tj0<am0, Path>> a;
    private final List<tj0<Integer, Integer>> b;
    private final List<ul0> c;

    public ak0(List<ul0> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<tj0<am0, Path>> a() {
        return this.a;
    }

    public List<ul0> b() {
        return this.c;
    }

    public List<tj0<Integer, Integer>> c() {
        return this.b;
    }
}