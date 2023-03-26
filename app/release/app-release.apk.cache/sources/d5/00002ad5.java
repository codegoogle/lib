package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfrl {
    public Object[] zza;
    public int zzb;
    public zzfrk zzc;

    public zzfrl() {
        this(4);
    }

    private final void zzd(int i) {
        int i2 = i + i;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfrd.zzd(length, i2));
        }
    }

    public final zzfrl zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfqi.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfrl zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfrm zzc() {
        zzfrk zzfrkVar = this.zzc;
        if (zzfrkVar == null) {
            zzfsx zzh = zzfsx.zzh(this.zzb, this.zza, this);
            zzfrk zzfrkVar2 = this.zzc;
            if (zzfrkVar2 == null) {
                return zzh;
            }
            throw zzfrkVar2.zza();
        }
        throw zzfrkVar.zza();
    }

    public zzfrl(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}