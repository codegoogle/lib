package com.p7700g.p99005;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public class z80 {
    public View b;
    public final Map<String, Object> a = new HashMap();
    public final ArrayList<s80> c = new ArrayList<>();

    @Deprecated
    public z80() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof z80) {
            z80 z80Var = (z80) obj;
            return this.b == z80Var.b && this.a.equals(z80Var.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder G = wo1.G("TransitionValues@");
        G.append(Integer.toHexString(hashCode()));
        G.append(":\n");
        StringBuilder L = wo1.L(G.toString(), "    view = ");
        L.append(this.b);
        L.append("\n");
        String t = wo1.t(L.toString(), "    values:");
        for (String str : this.a.keySet()) {
            t = t + "    " + str + ": " + this.a.get(str) + "\n";
        }
        return t;
    }

    public z80(@x1 View view) {
        this.b = view;
    }
}