package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjo implements zzfjl {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfjt.zza(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.zza);
        int[] iArr = this.zza;
        return zzfjt.zza(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zzb(View view, JSONObject jSONObject, zzfjk zzfjkVar, boolean z) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i3));
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (true) {
                        i = i3 + 1;
                        if (i4 < size2) {
                            zzfjkVar.zza((View) arrayList3.get(i4), this, jSONObject);
                            i4++;
                        }
                    }
                    i3 = i;
                }
                return;
            }
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                zzfjkVar.zza(viewGroup.getChildAt(i5), this, jSONObject);
            }
        }
    }
}