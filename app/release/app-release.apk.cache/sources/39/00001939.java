package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa;
    private final Api<O> zab;
    @z1
    private final O zac;
    @z1
    private final String zad;

    private ApiKey(Api<O> api, @z1 O o, @z1 String str) {
        this.zab = api;
        this.zac = o;
        this.zad = str;
        this.zaa = Objects.hashCode(api, o, str);
    }

    @x1
    public static <O extends Api.ApiOptions> ApiKey<O> zaa(@x1 Api<O> api, @z1 O o, @z1 String str) {
        return new ApiKey<>(api, o, str);
    }

    public final boolean equals(@z1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ApiKey) {
            ApiKey apiKey = (ApiKey) obj;
            return Objects.equal(this.zab, apiKey.zab) && Objects.equal(this.zac, apiKey.zac) && Objects.equal(this.zad, apiKey.zad);
        }
        return false;
    }

    public final int hashCode() {
        return this.zaa;
    }

    @x1
    public final String zab() {
        return this.zab.zad();
    }
}