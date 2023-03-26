package com.google.android.gms.internal.firebase_messaging;

import com.p7700g.p99005.sp2;
import com.p7700g.p99005.tp2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xp2;
import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaf implements xp2 {
    private boolean zza = false;
    private boolean zzb = false;
    private tp2 zzc;
    private final zzab zzd;

    public zzaf(zzab zzabVar) {
        this.zzd = zzabVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new sp2("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    public final xp2 add(double d) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, d, this.zzb);
        return this;
    }

    public final void zza(tp2 tp2Var, boolean z) {
        this.zza = false;
        this.zzc = tp2Var;
        this.zzb = z;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    public final xp2 add(float f) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, f, this.zzb);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    public final xp2 add(int i) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i, this.zzb);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    public final xp2 add(long j) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j, this.zzb);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    public final xp2 add(@z1 String str) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, str, this.zzb);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    public final xp2 add(boolean z) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z ? 1 : 0, this.zzb);
        return this;
    }

    @Override // com.p7700g.p99005.xp2
    @x1
    public final xp2 add(@x1 byte[] bArr) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, bArr, this.zzb);
        return this;
    }
}