package com.google.android.gms.common;

import android.content.Intent;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(@x1 String str, @x1 Intent intent) {
        super(str);
        this.zza = intent;
    }

    @x1
    public Intent getIntent() {
        return new Intent(this.zza);
    }
}