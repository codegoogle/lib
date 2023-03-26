package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.hx;
import com.p7700g.p99005.q7;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public abstract class GoogleApiClient {
    @x1
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    @GuardedBy("sAllClients")
    private static final Set<GoogleApiClient> zaa = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@x1 String str, @x1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @x1 String[] strArr) {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
            String concat = String.valueOf(str).concat(g54.A);
            int i = 0;
            for (GoogleApiClient googleApiClient : set) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(concat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @x1
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @x1
    public abstract ConnectionResult blockingConnect();

    @x1
    public abstract ConnectionResult blockingConnect(long j, @x1 TimeUnit timeUnit);

    @x1
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@x1 String str, @x1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @x1 String[] strArr);

    @x1
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@x1 T t) {
        throw new UnsupportedOperationException();
    }

    @x1
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@x1 T t) {
        throw new UnsupportedOperationException();
    }

    @x1
    @KeepForSdk
    public <C extends Api.Client> C getClient(@x1 Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @x1
    public abstract ConnectionResult getConnectionResult(@x1 Api<?> api);

    @x1
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @x1
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@x1 Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@x1 Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@x1 ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@x1 OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@x1 SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@x1 ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@x1 OnConnectionFailedListener onConnectionFailedListener);

    @x1
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@x1 L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@x1 hx hxVar);

    public abstract void unregisterConnectionCallbacks(@x1 ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@x1 OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class Builder {
        @z1
        private Account zaa;
        private final Set<Scope> zab;
        private final Set<Scope> zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map<Api<?>, com.google.android.gms.common.internal.zab> zah;
        private final Context zai;
        private final Map<Api<?>, Api.ApiOptions> zaj;
        private LifecycleActivity zak;
        private int zal;
        @z1
        private OnConnectionFailedListener zam;
        private Looper zan;
        private GoogleApiAvailability zao;
        private Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> zap;
        private final ArrayList<ConnectionCallbacks> zaq;
        private final ArrayList<OnConnectionFailedListener> zar;

        @KeepForSdk
        public Builder(@x1 Context context) {
            this.zab = new HashSet();
            this.zac = new HashSet();
            this.zah = new q7();
            this.zaj = new q7();
            this.zal = -1;
            this.zao = GoogleApiAvailability.getInstance();
            this.zap = com.google.android.gms.signin.zad.zac;
            this.zaq = new ArrayList<>();
            this.zar = new ArrayList<>();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        private final <O extends Api.ApiOptions> void zab(Api<O> api, @z1 O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zah.put(api, new com.google.android.gms.common.internal.zab(hashSet));
        }

        @x1
        public Builder addApi(@x1 Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @x1
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@x1 Api<O> api, @x1 O o, @x1 Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaj.put(api, o);
            zab(api, o, scopeArr);
            return this;
        }

        @x1
        public Builder addConnectionCallbacks(@x1 ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        @x1
        public Builder addOnConnectionFailedListener(@x1 OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        @x1
        public Builder addScope(@x1 Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zab.add(scope);
            return this;
        }

        @x1
        public GoogleApiClient build() {
            Preconditions.checkArgument(!this.zaj.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings zaa = zaa();
            Map<Api<?>, com.google.android.gms.common.internal.zab> zad = zaa.zad();
            q7 q7Var = new q7();
            q7 q7Var2 = new q7();
            ArrayList arrayList = new ArrayList();
            Api<?> api = null;
            boolean z = false;
            for (Api<?> api2 : this.zaj.keySet()) {
                Api.ApiOptions apiOptions = this.zaj.get(api2);
                boolean z2 = zad.get(api2) != null;
                q7Var.put(api2, Boolean.valueOf(z2));
                zat zatVar = new zat(api2, z2);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zaa());
                Api.Client buildClient = abstractClientBuilder.buildClient(this.zai, this.zan, zaa, (ClientSettings) apiOptions, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                q7Var2.put(api2.zab(), buildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z = apiOptions != null;
                }
                if (buildClient.providesSignIn()) {
                    if (api != null) {
                        String zad2 = api2.zad();
                        String zad3 = api.zad();
                        throw new IllegalStateException(wo1.D(new StringBuilder(String.valueOf(zad2).length() + 21 + String.valueOf(zad3).length()), zad2, " cannot be used with ", zad3));
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (!z) {
                    Preconditions.checkState(this.zaa == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                    Preconditions.checkState(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
                } else {
                    String zad4 = api.zad();
                    throw new IllegalStateException(wo1.D(new StringBuilder(String.valueOf(zad4).length() + 82), "With using ", zad4, ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
                }
            }
            zabe zabeVar = new zabe(this.zai, new ReentrantLock(), this.zan, zaa, this.zao, this.zap, q7Var, this.zaq, this.zar, q7Var2, this.zal, zabe.zad(q7Var2.values(), true), arrayList);
            synchronized (GoogleApiClient.zaa) {
                GoogleApiClient.zaa.add(zabeVar);
            }
            if (this.zal >= 0) {
                zak.zaa(this.zak).zad(this.zal, zabeVar, this.zam);
            }
            return zabeVar;
        }

        @x1
        public Builder enableAutoManage(@x1 hx hxVar, int i, @z1 OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) hxVar);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zal = i;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        @x1
        public Builder setAccountName(@x1 String str) {
            this.zaa = str == null ? null : new Account(str, AccountType.GOOGLE);
            return this;
        }

        @x1
        public Builder setGravityForPopups(int i) {
            this.zad = i;
            return this;
        }

        @x1
        public Builder setHandler(@x1 Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        @x1
        public Builder setViewForPopups(@x1 View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zae = view;
            return this;
        }

        @x1
        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        @x1
        @VisibleForTesting
        public final ClientSettings zaa() {
            SignInOptions signInOptions = SignInOptions.zaa;
            Map<Api<?>, Api.ApiOptions> map = this.zaj;
            Api<SignInOptions> api = com.google.android.gms.signin.zad.zag;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.zaj.get(api);
            }
            return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, signInOptions, false);
        }

        @x1
        public Builder enableAutoManage(@x1 hx hxVar, @z1 OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(hxVar, 0, onConnectionFailedListener);
            return this;
        }

        @x1
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@x1 Api<? extends Api.ApiOptions.NotRequiredOptions> api, @x1 Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            zab(api, null, scopeArr);
            return this;
        }

        @x1
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@x1 Api<O> api, @x1 O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaj.put(api, o);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @KeepForSdk
        public Builder(@x1 Context context, @x1 ConnectionCallbacks connectionCallbacks, @x1 OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }
    }
}