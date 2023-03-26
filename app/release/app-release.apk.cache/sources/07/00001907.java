package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class Api<O extends ApiOptions> {
    private final AbstractClientBuilder<?, O> zaa;
    private final ClientKey<?> zab;
    private final String zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @x1
        @KeepForSdk
        @Deprecated
        public T buildClient(@x1 Context context, @x1 Looper looper, @x1 ClientSettings clientSettings, @x1 O o, @x1 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @x1 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return buildClient(context, looper, clientSettings, (ClientSettings) o, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
        }

        @x1
        @KeepForSdk
        public T buildClient(@x1 Context context, @x1 Looper looper, @x1 ClientSettings clientSettings, @x1 O o, @x1 ConnectionCallbacks connectionCallbacks, @x1 OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface AnyClient {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class AnyClientKey<C extends AnyClient> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes2.dex */
    public interface ApiOptions {
        @x1
        public static final NoOptions NO_OPTIONS = new NoOptions(null);

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* loaded from: classes2.dex */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @x1
            Account getAccount();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* loaded from: classes2.dex */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @z1
            GoogleSignInAccount getGoogleSignInAccount();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* loaded from: classes2.dex */
        public interface HasOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* loaded from: classes2.dex */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            public /* synthetic */ NoOptions(zaa zaaVar) {
            }
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* loaded from: classes2.dex */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* loaded from: classes2.dex */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @KeepForSdk
        public static final int API_PRIORITY_GAMES = 1;
        @KeepForSdk
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        @KeepForSdk
        public static final int API_PRIORITY_PLUS = 2;

        @x1
        @KeepForSdk
        public List<Scope> getImpliedScopes(@z1 O o) {
            return Collections.emptyList();
        }

        @KeepForSdk
        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Client extends AnyClient {
        @KeepForSdk
        void connect(@x1 BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void disconnect(@x1 String str);

        @KeepForSdk
        void dump(@x1 String str, @z1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @z1 String[] strArr);

        @x1
        @KeepForSdk
        Feature[] getAvailableFeatures();

        @x1
        @KeepForSdk
        String getEndpointPackageName();

        @KeepForSdk
        @z1
        String getLastDisconnectMessage();

        @KeepForSdk
        int getMinApkVersion();

        @KeepForSdk
        void getRemoteService(@z1 IAccountAccessor iAccountAccessor, @z1 Set<Scope> set);

        @x1
        @KeepForSdk
        Feature[] getRequiredFeatures();

        @x1
        @KeepForSdk
        Set<Scope> getScopesForConnectionlessNonSignIn();

        @KeepForSdk
        @z1
        IBinder getServiceBrokerBinder();

        @x1
        @KeepForSdk
        Intent getSignInIntent();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        boolean isConnecting();

        @KeepForSdk
        void onUserSignOut(@x1 BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        boolean providesSignIn();

        @KeepForSdk
        boolean requiresAccount();

        @KeepForSdk
        boolean requiresGooglePlayServices();

        @KeepForSdk
        boolean requiresSignIn();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public <C extends Client> Api(@x1 String str, @x1 AbstractClientBuilder<C, O> abstractClientBuilder, @x1 ClientKey<C> clientKey) {
        Preconditions.checkNotNull(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(clientKey, "Cannot construct an Api with a null ClientKey");
        this.zac = str;
        this.zaa = abstractClientBuilder;
        this.zab = clientKey;
    }

    @x1
    public final AbstractClientBuilder<?, O> zaa() {
        return this.zaa;
    }

    @x1
    public final AnyClientKey<?> zab() {
        return this.zab;
    }

    @x1
    public final BaseClientBuilder<?, O> zac() {
        return this.zaa;
    }

    @x1
    public final String zad() {
        return this.zac;
    }
}