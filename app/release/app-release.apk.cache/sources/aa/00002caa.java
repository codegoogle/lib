package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgig extends ThreadLocal {
    public final /* synthetic */ zzgih zza;

    public zzgig(zzgih zzgihVar) {
        this.zza = zzgihVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzghs zzghsVar = zzghs.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzghsVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}