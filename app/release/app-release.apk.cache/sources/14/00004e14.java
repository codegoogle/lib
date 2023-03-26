package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l73 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private final Context b;
    @NotNull
    private final d c;
    @Nullable
    private GoogleApiClient d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements GoogleApiClient.ConnectionCallbacks {
        public final /* synthetic */ l73 s;

        public b(l73 l73Var) {
            c25.p(l73Var, "this$0");
            this.s = l73Var;
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        @SuppressLint({"MissingPermission"})
        public void onConnected(@Nullable Bundle bundle) {
            xz2.c("PlayAvl", "Play services onConnected");
            if (gh.a(this.s.b, "android.permission.ACCESS_FINE_LOCATION") == 0 || gh.a(this.s.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(this.s.d);
                if (lastLocation != null) {
                    this.s.c.a(lastLocation);
                    return;
                } else {
                    this.s.c.a();
                    return;
                }
            }
            xz2.c("PlayAvl", "Permission not available");
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            xz2.c("PlayAvl", c25.C("[ERROR] Play services onConnectionSuspended initialize state ", Integer.valueOf(i)));
        }
    }

    /* loaded from: classes3.dex */
    public final class c implements GoogleApiClient.OnConnectionFailedListener {
        public final /* synthetic */ l73 s;

        public c(l73 l73Var) {
            c25.p(l73Var, "this$0");
            this.s = l73Var;
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(@NotNull ConnectionResult connectionResult) {
            c25.p(connectionResult, "connectionResult");
            xz2.c("PlayAvl", c25.C("[ERROR] Play services onConnectionFailed with error: ", connectionResult.getErrorMessage()));
            this.s.c.a();
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a();

        void a(@NotNull Location location);
    }

    public l73(@NotNull Context context, @NotNull d dVar) {
        c25.p(context, "context");
        c25.p(dVar, "playLocationCallback");
        this.b = context;
        this.c = dVar;
        if (b()) {
            xz2.c("PlayAvl", "Google plays services is available and it's fetching the location via play services");
            try {
                GoogleApiClient build = new GoogleApiClient.Builder(context).addApi(LocationServices.API).addConnectionCallbacks(new b(this)).addOnConnectionFailedListener(new c(this)).build();
                this.d = build;
                c25.m(build);
                build.connect();
                xz2.c("PlayAvl", "Google plays services Play services is available and fetching adv ID from play services");
                return;
            } catch (Error e) {
                xz2.b("PlayAvl", "[ERROR] Error initializing GoogleApiClient", e);
                this.c.a();
                return;
            } catch (Exception e2) {
                xz2.b("PlayAvl", "[ERROR] Exception initializing GoogleApiClient", e2);
                this.c.a();
                return;
            }
        }
        dVar.a();
    }

    private final boolean b() {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        c25.o(googleApiAvailability, "getInstance()");
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.b);
        String[] strArr = new String[1];
        strArr[0] = c25.C("isGooglePlayServicesAvailable function returns ", Boolean.valueOf(isGooglePlayServicesAvailable == 0));
        xz2.c("PlayAvl", strArr);
        return isGooglePlayServicesAvailable == 0;
    }
}