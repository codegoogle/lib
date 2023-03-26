package com.iab.omid.library.ironsrc.c;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements a {
    private final int[] a = new int[2];

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0105a interfaceC0105a) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC0105a.a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    @TargetApi(21)
    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0105a interfaceC0105a) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0105a.a((View) it2.next(), this, jSONObject);
            }
        }
    }

    @Override // com.iab.omid.library.ironsrc.c.a
    public JSONObject a(View view) {
        if (view == null) {
            return com.iab.omid.library.ironsrc.d.b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.a);
        int[] iArr = this.a;
        return com.iab.omid.library.ironsrc.d.b.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.ironsrc.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0105a interfaceC0105a, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                b(viewGroup, jSONObject, interfaceC0105a);
            } else {
                a(viewGroup, jSONObject, interfaceC0105a);
            }
        }
    }
}