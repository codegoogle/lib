package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.p7700g.p99005.r7;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class ClientSettings {
    @Nullable
    private final Account zaa;
    private final Set<Scope> zab;
    private final Set<Scope> zac;
    private final Map<Api<?>, zab> zad;
    private final int zae;
    @Nullable
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private Integer zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class Builder {
        @Nullable
        private Account zaa;
        private r7<Scope> zab;
        private String zac;
        private String zad;
        private SignInOptions zae = SignInOptions.zaa;

        @x1
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        @x1
        @KeepForSdk
        public Builder setRealClientPackageName(@x1 String str) {
            this.zac = str;
            return this;
        }

        @x1
        public final Builder zaa(@x1 Collection<Scope> collection) {
            if (this.zab == null) {
                this.zab = new r7<>();
            }
            this.zab.addAll(collection);
            return this;
        }

        @x1
        public final Builder zab(@Nullable Account account) {
            this.zaa = account;
            return this;
        }

        @x1
        public final Builder zac(@x1 String str) {
            this.zad = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@x1 Account account, @x1 Set<Scope> set, @x1 Map<Api<?>, zab> map, int i, @Nullable View view, @x1 String str, @x1 String str2, @Nullable SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @x1
    @KeepForSdk
    public static ClientSettings createDefault(@x1 Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    @KeepForSdk
    @z1
    public Account getAccount() {
        return this.zaa;
    }

    @KeepForSdk
    @z1
    @Deprecated
    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @x1
    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.zaa;
        return account != null ? account : new Account("<<default account>>", AccountType.GOOGLE);
    }

    @x1
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    @x1
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@x1 Api<?> api) {
        zab zabVar = this.zad.get(api);
        if (zabVar != null && !zabVar.zaa.isEmpty()) {
            HashSet hashSet = new HashSet(this.zab);
            hashSet.addAll(zabVar.zaa);
            return hashSet;
        }
        return this.zab;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.zae;
    }

    @x1
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.zag;
    }

    @x1
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.zab;
    }

    @KeepForSdk
    @z1
    public View getViewForPopups() {
        return this.zaf;
    }

    @x1
    public final SignInOptions zaa() {
        return this.zai;
    }

    @z1
    public final Integer zab() {
        return this.zaj;
    }

    @z1
    public final String zac() {
        return this.zah;
    }

    @x1
    public final Map<Api<?>, zab> zad() {
        return this.zad;
    }

    public final void zae(@x1 Integer num) {
        this.zaj = num;
    }

    public ClientSettings(@Nullable Account account, @x1 Set<Scope> set, @x1 Map<Api<?>, zab> map, int i, @Nullable View view, @x1 String str, @x1 String str2, @Nullable SignInOptions signInOptions, boolean z) {
        this.zaa = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.zab = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i;
        this.zag = str;
        this.zah = str2;
        this.zai = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        for (zab zabVar : map.values()) {
            hashSet.addAll(zabVar.zaa);
        }
        this.zac = Collections.unmodifiableSet(hashSet);
    }
}