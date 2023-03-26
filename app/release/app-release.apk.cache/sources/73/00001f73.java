package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbnr implements zzfok {
    public static final /* synthetic */ zzbnr zza = new zzbnr();

    private /* synthetic */ zzbnr() {
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbom zzbomVar = zzbol.zza;
        if (((Boolean) zzbjo.zzk.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "prepareClickUrl.attestation1");
            return "failure_click_attok";
        }
        return "failure_click_attok";
    }
}