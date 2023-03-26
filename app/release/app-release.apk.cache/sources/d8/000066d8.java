package com.p7700g.p99005;

import com.google.gson.Gson;

/* compiled from: EventsSerializer.java */
/* loaded from: classes2.dex */
public class y91 {
    @x1
    private final Gson a;

    public y91(@x1 Gson gson) {
        this.a = gson;
    }

    @x1
    public String a(@x1 v91 v91Var) {
        return this.a.z(v91Var).replace("\\\\t", "").replace("\\\\r", "").replace("\\\\n", "").replace("\\t", "").replace("\\r", "").replace("\\n", "").replaceAll("[\r\n\t]", "");
    }
}