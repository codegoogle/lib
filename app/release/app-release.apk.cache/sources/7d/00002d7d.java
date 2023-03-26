package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgqb implements zzako {
    private static final zzgqm zza = zzgqm.zzb(zzgqb.class);
    public final String zzb;
    public long zze;
    public zzgqg zzg;
    private zzakp zzh;
    private ByteBuffer zzi;
    public long zzf = -1;
    private ByteBuffer zzj = null;
    public boolean zzd = true;
    public boolean zzc = true;

    public zzgqb(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzgqm zzgqmVar = zza;
            String str = this.zzb;
            zzgqmVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final void zzb(zzgqg zzgqgVar, ByteBuffer byteBuffer, long j, zzakl zzaklVar) throws IOException {
        this.zze = zzgqgVar.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzgqgVar;
        zzgqgVar.zze(zzgqgVar.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final void zzc(zzakp zzakpVar) {
        this.zzh = zzakpVar;
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        String str;
        zzd();
        zzgqm zzgqmVar = zza;
        String str2 = this.zzb;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzgqmVar.zza(str);
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}