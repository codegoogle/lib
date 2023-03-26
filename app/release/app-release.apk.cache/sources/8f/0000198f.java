package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zabu implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {
    public final /* synthetic */ GoogleApiManager zaa;
    private final Api.Client zab;
    private final ApiKey<?> zac;
    @z1
    private IAccountAccessor zad = null;
    @z1
    private Set<Scope> zae = null;
    private boolean zaf = false;

    public zabu(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.zaa = googleApiManager;
        this.zab = client;
        this.zac = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    public final void zag() {
        IAccountAccessor iAccountAccessor;
        if (!this.zaf || (iAccountAccessor = this.zad) == null) {
            return;
        }
        this.zab.getRemoteService(iAccountAccessor, this.zae);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@x1 ConnectionResult connectionResult) {
        Handler handler;
        handler = this.zaa.zat;
        handler.post(new zabt(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @s2
    public final void zae(ConnectionResult connectionResult) {
        Map map;
        map = this.zaa.zap;
        zabq zabqVar = (zabq) map.get(this.zac);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @s2
    public final void zaf(@z1 IAccountAccessor iAccountAccessor, @z1 Set<Scope> set) {
        if (iAccountAccessor != null && set != null) {
            this.zad = iAccountAccessor;
            this.zae = set;
            zag();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        zae(new ConnectionResult(4));
    }
}