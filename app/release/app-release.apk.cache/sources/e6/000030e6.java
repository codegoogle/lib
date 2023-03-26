package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzkc;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public class zzjy<MessageType extends zzkc<MessageType, BuilderType>, BuilderType extends zzjy<MessageType, BuilderType>> extends zzik<MessageType, BuilderType> {
    public zzkc zza;
    public boolean zzb = false;
    private final zzkc zzc;

    public zzjy(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzkc) messagetype.zzl(4, null, null);
    }

    private static final void zza(zzkc zzkcVar, zzkc zzkcVar2) {
        zzlr.zza().zzb(zzkcVar.getClass()).zzg(zzkcVar, zzkcVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    /* renamed from: zzaB */
    public final zzjy zzau() {
        zzjy zzjyVar = (zzjy) this.zzc.zzl(5, null, null);
        zzjyVar.zzaC(zzaG());
        return zzjyVar;
    }

    public final zzjy zzaC(zzkc zzkcVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zza(this.zza, zzkcVar);
        return this;
    }

    public final zzjy zzaD(byte[] bArr, int i, int i2, zzjo zzjoVar) throws zzkm {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        try {
            zzlr.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i2, new zzio(zzjoVar));
            return this;
        } catch (zzkm e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkm.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r3 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType zzaE() {
        MessageType zzaG = zzaG();
        byte byteValue = ((Byte) zzaG.zzl(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean zzk = zzlr.zza().zzb(zzaG.getClass()).zzk(zzaG);
                zzaG.zzl(2, true != zzk ? null : zzaG, null);
            }
            throw new zzmk(zzaG);
        }
        return zzaG;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* renamed from: zzaF */
    public MessageType zzaG() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzkc zzkcVar = this.zza;
        zzlr.zza().zzb(zzkcVar.getClass()).zzf(zzkcVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    public void zzaI() {
        zzkc zzkcVar = (zzkc) this.zza.zzl(4, null, null);
        zza(zzkcVar, this.zza);
        this.zza = zzkcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final /* synthetic */ zzik zzav(zzil zzilVar) {
        zzaC((zzkc) zzilVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final /* bridge */ /* synthetic */ zzik zzaw(byte[] bArr, int i, int i2) throws zzkm {
        zzaD(bArr, 0, i2, zzjo.zza());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final /* bridge */ /* synthetic */ zzik zzax(byte[] bArr, int i, int i2, zzjo zzjoVar) throws zzkm {
        zzaD(bArr, 0, i2, zzjoVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final /* synthetic */ zzlj zzbR() {
        return this.zzc;
    }
}