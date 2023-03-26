package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.p7700g.p99005.gy2;
import com.p7700g.p99005.k73;
import com.p7700g.p99005.l73;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g83 {
    @NotNull
    public static final a a = new a(null);
    private static final int b = 8298000;
    private static int c;
    @NotNull
    private final Context d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(@NotNull Context context) {
            c25.p(context, "context");
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                c25.o(applicationInfo, "context.packageManager.getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)");
                int i = applicationInfo.metaData.getInt("com.google.android.gms.version");
                xz2.c("PlyHlpr", c25.C("Play version from manifest: ", Integer.valueOf(i)));
                return i;
            } catch (PackageManager.NameNotFoundException e) {
                xz2.c("PlyHlpr", c25.C("[ERROR] Play services declaration not found in manifest hence pausing. GreedyGame doesn't run without play services library. ", e.getMessage()));
                return 0;
            } catch (NullPointerException e2) {
                xz2.c("PlyHlpr", c25.C("[ERROR] Play services declaration not found in manifest hence pausing. GreedyGame doesn't run without play services library. ", e2.getMessage()));
                return 0;
            }
        }

        public final boolean b() {
            if (g83.c >= 12451000) {
                try {
                    Class.forName("com.google.android.gms.ads.MobileAds");
                    return true;
                } catch (ClassNotFoundException unused) {
                    xz2.c("PlyHlpr", "[ERROR] ClassNotFoundException com.google.android.gms.ads.MobileAds");
                    return false;
                }
            }
            return false;
        }

        public final boolean c() {
            try {
                Class.forName("com.facebook.ads.NativeAd");
                return true;
            } catch (ClassNotFoundException unused) {
                xz2.c("PlyHlpr", "[ERROR] ClassNotFoundException com.facebook.ads.NativeAd");
                return false;
            }
        }

        public final boolean d() {
            try {
                Class.forName("com.mopub.nativeads.MoPubNative");
                return true;
            } catch (ClassNotFoundException unused) {
                xz2.c("PlyHlpr", "[ERROR] ClassNotFoundException com.mopub.nativeads.MoPubNative");
                return false;
            }
        }

        @NotNull
        public final String e() {
            if (b()) {
                String versionString = MobileAds.getVersionString();
                c25.o(versionString, "getVersionString()");
                return versionString;
            }
            return "unknown";
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(@NotNull String str);

        void b(@NotNull String str);

        void b(@NotNull String str, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(@NotNull Location location);

        void c(@NotNull String str);
    }

    public g83(@NotNull Context context) {
        c25.p(context, "context");
        this.d = context;
    }

    private final hp4<String, Boolean> d(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                String id = advertisingIdInfo.getId();
                c25.o(id, "advertisingIdInfo.id");
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                xz2.c("PlyHlpr", "Advertiser ID: " + id + " and limitedTracking: " + isLimitAdTrackingEnabled);
                return new hp4<>(id, Boolean.valueOf(isLimitAdTrackingEnabled));
            }
            xz2.c("PlyHlpr", "[ERROR] Advertising info null");
            i(context);
            return null;
        } catch (Exception e) {
            xz2.c("PlyHlpr", c25.C("[ERROR] Exception when trying to get the advertiser id falling back. ", e.getMessage()));
            return i(context);
        } catch (NoClassDefFoundError e2) {
            xz2.c("PlyHlpr", c25.C("[ERROR] Class Definition not found when trying to get the advertiser id falling back. ", e2.getMessage()));
            return i(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Location location, c cVar) {
        if (location == null) {
            cVar.c("Not able to fetch the location");
            return;
        }
        double longitude = location.getLongitude();
        double latitude = location.getLatitude();
        StringBuilder sb = new StringBuilder();
        sb.append("Location received Latitude: ");
        sb.append(latitude);
        sb.append(" Longitude: ");
        sb.append(longitude);
        sb.append(" Accuracy: ");
        sb.append(location.getAccuracy());
        sb.append(" LLF: ");
        sb.append(location.getTime());
        xz2.c("PlyHlpr", sb.toString());
        cVar.a(location);
    }

    private final hp4<String, Boolean> i(Context context) {
        xz2.c("PlyHlpr", "Failed to fetch Advertiser ID from play services hence fetching Advertiser ID from intent");
        try {
            k73.a a2 = k73.a.a(context);
            String a3 = a2.a();
            boolean b2 = a2.b();
            xz2.c("PlyHlpr", "Advertiser ID: " + a3 + " and limitedTracking: " + b2);
            return new hp4<>(a3, Boolean.valueOf(b2));
        } catch (Error e) {
            xz2.c("PlyHlpr", c25.C("[ERROR] Getting the Advertising Id by intent also failed.", e.getMessage()));
            return null;
        } catch (Exception e2) {
            xz2.c("PlyHlpr", c25.C("[ERROR] Getting the Advertising Id by intent also failed.", e2.getMessage()));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final Location j(Context context) {
        Location location;
        gy2.a aVar = gy2.a;
        gy2 a2 = aVar.a(context);
        c25.m(a2);
        if (!a2.e()) {
            xz2.c("PlyHlpr", "Location permission not available in fallback");
            return null;
        }
        Object systemService = context.getSystemService(ik3.b);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        gy2 a3 = aVar.a(context);
        c25.m(a3);
        if (a3.d("android.permission.ACCESS_FINE_LOCATION")) {
            if (locationManager.isProviderEnabled("gps")) {
                xz2.c("PlyHlpr", "Location received via GPS provider");
                location = locationManager.getLastKnownLocation("gps");
            } else {
                location = null;
            }
            if (location == null && locationManager.isProviderEnabled("passive")) {
                xz2.c("PlyHlpr", "Location received via passive provider");
                location = locationManager.getLastKnownLocation("passive");
            }
        } else {
            location = null;
        }
        if (location == null && locationManager.isProviderEnabled("network")) {
            gy2 a4 = aVar.a(context);
            c25.m(a4);
            if (a4.e()) {
                xz2.c("PlyHlpr", "Location received via network provider");
                location = locationManager.getLastKnownLocation("network");
            }
        }
        if (location != null) {
            return location;
        }
        xz2.c("PlyHlpr", "Location fetched by device api failed with null location. Proceeding without acquiring location");
        return null;
    }

    public final void f(@NotNull b bVar) {
        c25.p(bVar, "dataCollectionListener");
        int a2 = a.a(this.d);
        c = a2;
        bVar.a(String.valueOf(a2));
        if (c >= 6587000) {
            hp4<String, Boolean> d2 = d(this.d);
            if (d2 != null) {
                bVar.b(d2.m(), d2.n().booleanValue());
                return;
            } else {
                bVar.b("Not able to fetch AdvId");
                return;
            }
        }
        xz2.d("PlyHlpr", "Play services version smaller than the minimum supported version");
        bVar.b("Play services version smaller than the minimum supported version");
    }

    public final void g(@NotNull c cVar) {
        c25.p(cVar, "locationCollectionListener");
        if (c >= 6587000) {
            gy2 a2 = gy2.a.a(this.d);
            c25.m(a2);
            if (a2.e()) {
                boolean z = true;
                try {
                    Class.forName("com.google.android.gms.location.LocationServices");
                } catch (ClassNotFoundException unused) {
                    z = false;
                    xz2.c("PlyHlpr", "[ERROR] ClassNotFoundException com.google.android.gms.location.LocationServices");
                }
                if (c >= 8115000 && z) {
                    new l73(this.d, new d(cVar));
                    return;
                }
                xz2.c("PlyHlpr", "[ERROR] Play version less than required, can't acquire location using play services. Trying using device apis.");
                try {
                    e(j(this.d), cVar);
                    return;
                } catch (Exception e) {
                    Throwable cause = e.getCause();
                    if (cause == null) {
                        cause = new Throwable("Unknown error");
                    }
                    xz2.b("PlyHlpr", "Fetching location crashed", cause);
                    e(null, cVar);
                    return;
                }
            }
            xz2.c("PlyHlpr", "[ERROR] Location permission not available");
            e(null, cVar);
            return;
        }
        xz2.d("PlyHlpr", "Play services version smaller than the minimum supported version");
        e(null, cVar);
    }

    /* loaded from: classes3.dex */
    public static final class d implements l73.d {
        public final /* synthetic */ c b;

        public d(c cVar) {
            this.b = cVar;
        }

        @Override // com.p7700g.p99005.l73.d
        public void a(@NotNull Location location) {
            c25.p(location, ik3.b);
            xz2.c("PlyHlpr", "Location acquired from playservices. Setting location");
            g83.this.e(location, this.b);
        }

        @Override // com.p7700g.p99005.l73.d
        public void a() {
            xz2.c("PlyHlpr", "[ERROR] Acquiring location from playservices failed. Trying using device apis.");
            try {
                g83 g83Var = g83.this;
                g83Var.e(g83Var.j(g83Var.d), this.b);
            } catch (Exception e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cause = new Throwable("Unknown error");
                }
                xz2.b("PlyHlpr", "Fetching location crashed", cause);
                g83.this.e(null, this.b);
            }
        }
    }
}