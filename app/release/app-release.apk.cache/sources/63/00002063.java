package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwo implements View.OnClickListener {
    public final /* synthetic */ zzbwp zza;

    public zzbwo(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}