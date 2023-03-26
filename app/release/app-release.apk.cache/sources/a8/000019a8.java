package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.z1;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@s2
/* loaded from: classes2.dex */
public interface zacs {
    void zae(ConnectionResult connectionResult);

    void zaf(@z1 IAccountAccessor iAccountAccessor, @z1 Set<Scope> set);
}