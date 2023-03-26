package com.p7700g.p99005;

import android.view.View;
import android.widget.AdapterView;
import com.p7700g.p99005.z2;

/* compiled from: NavItemSelectedListener.java */
/* loaded from: classes.dex */
public class l3 implements AdapterView.OnItemSelectedListener {
    private final z2.e s;

    public l3(z2.e eVar) {
        this.s = eVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        z2.e eVar = this.s;
        if (eVar != null) {
            eVar.a(i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}