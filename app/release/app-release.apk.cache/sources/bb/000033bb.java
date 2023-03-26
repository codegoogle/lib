package com.ironsource.b;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b implements Runnable {
    private c s;
    private String t;
    private String u;
    private ArrayList<com.ironsource.mediationsdk.a.c> v;

    public b(c cVar, String str, String str2, ArrayList<com.ironsource.mediationsdk.a.c> arrayList) {
        this.s = cVar;
        this.t = str;
        this.u = str2;
        this.v = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            com.ironsource.d.c a = com.ironsource.d.b.a(this.u, this.t, arrayList);
            if (a != null) {
                int i = a.a;
                if (i == 200 || i == 204) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        c cVar = this.s;
        if (cVar != null) {
            cVar.a(null, z);
        }
    }
}