package com.p7700g.p99005;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.anchorfree.hdr.AFHydra;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceHelper.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b3\u00104J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0006\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0013\u0010\b\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0013\u0010\n\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004R\u0013\u0010\f\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\r8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0004R\u0013\u0010\u0014\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004R\u0013\u0010\u0018\u001a\u00020\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010 R\u0013\u0010#\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004R\u0013\u0010%\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0015\u0010*\u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010\u0004R\u0013\u0010,\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010\u0004R\u0013\u0010.\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010\u0004R\u0013\u00100\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010\u0004R\u0013\u00102\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b1\u0010\u0004¨\u00065"}, d2 = {"Lcom/p7700g/p99005/cy2;", "", "", "i", "()Ljava/lang/String;", "p", "screenDensity", ij3.b, "roamingState", "n", "osVerName", "h", "deviceResolution", "Landroid/telephony/TelephonyManager;", "q", "()Landroid/telephony/TelephonyManager;", "telephonyManager", com.anythink.basead.d.g.i, "deviceModel", "j", "locale", "", "l", "()I", "osApiLevel", "Landroid/content/Context;", "d", "Landroid/content/Context;", "e", "()Landroid/content/Context;", "context", "Landroid/net/ConnectivityManager;", "()Landroid/net/ConnectivityManager;", "connectivityManager", "k", "mccmnc", "r", "uuid", "Lcom/p7700g/p99005/iy2;", "Lcom/p7700g/p99005/iy2;", "sharedPrefHelper", "a", "aI5", com.anythink.expressad.d.a.b.dH, "osNum", "b", "appName", "c", "carrierName", "f", "deviceManufacturer", "<init>", "(Landroid/content/Context;Lcom/p7700g/p99005/iy2;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class cy2 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = "DevHlpr";
    private static final int c = -1;
    @NotNull
    private final Context d;
    @NotNull
    private final iy2 e;

    /* compiled from: DeviceHelper.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/p7700g/p99005/cy2$a", "", "", "CONNECTION_TYPE_WIFI", AFHydra.STATUS_IDLE, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public cy2(@NotNull Context context, @NotNull iy2 iy2Var) {
        c25.p(context, "context");
        c25.p(iy2Var, "sharedPrefHelper");
        this.d = context;
        this.e = iy2Var;
    }

    private final ConnectivityManager d() {
        Object systemService = this.d.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    private final TelephonyManager q() {
        Object systemService = this.d.getSystemService("phone");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return (TelephonyManager) systemService;
    }

    @Nullable
    public final String a() {
        return zz2.b(r());
    }

    @NotNull
    public final String b() {
        return this.d.getApplicationInfo().loadLabel(this.d.getPackageManager()).toString();
    }

    @NotNull
    public final String c() {
        String networkOperatorName = q().getNetworkOperatorName();
        c25.o(networkOperatorName, "manager.networkOperatorName");
        return networkOperatorName;
    }

    @NotNull
    public final Context e() {
        return this.d;
    }

    @NotNull
    public final String f() {
        String str = Build.MANUFACTURER;
        c25.o(str, "MANUFACTURER");
        return str;
    }

    @NotNull
    public final String g() {
        String str = Build.MODEL;
        c25.o(str, "MODEL");
        return str;
    }

    @NotNull
    public final String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(dy2.g);
        sb.append(e14.f0);
        sb.append(dy2.e);
        return sb.toString();
    }

    @NotNull
    public final String i() {
        try {
            Object systemService = this.d.getSystemService("window");
            if (systemService != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
                return String.valueOf(a45.I0((a45.I0(Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d)) * 1000.0d) / 1000.0d) * 100.0d) / 100.0d);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        } catch (Exception unused) {
            return "-1";
        }
    }

    @NotNull
    public final String j() {
        String language = Locale.getDefault().getLanguage();
        c25.o(language, "getDefault().language");
        return language;
    }

    @fz4(name = "getMCCMNC")
    @NotNull
    public final String k() {
        String networkOperator = q().getNetworkOperator();
        c25.o(networkOperator, "tel.networkOperator");
        return networkOperator;
    }

    public final int l() {
        return Build.VERSION.SDK_INT;
    }

    @NotNull
    public final String m() {
        String str = Build.VERSION.RELEASE;
        c25.o(str, "RELEASE");
        return str;
    }

    @NotNull
    public final String n() {
        Field[] fields = Build.VERSION_CODES.class.getFields();
        c25.o(fields, "fields");
        int length = fields.length;
        int i = 0;
        while (i < length) {
            Field field = fields[i];
            i++;
            int i2 = -1;
            try {
                i2 = field.getInt(new Object());
            } catch (IllegalAccessException e) {
                xz2.c(b, c25.C("[ERROR] DeviceOs calculation IllegalAccessExc", e.getMessage()));
            } catch (IllegalArgumentException e2) {
                xz2.c(b, c25.C("[ERROR] DeviceOs calculation IllegalArgExc", e2.getMessage()));
            } catch (NullPointerException e3) {
                xz2.c(b, c25.C("[ERROR] DeviceOs calculation NullPointerExc", e3.getMessage()));
            }
            if (i2 == Build.VERSION.SDK_INT) {
                String name = field.getName();
                c25.o(name, "field.name");
                return name;
            }
        }
        return "";
    }

    @NotNull
    public final String o() {
        return q().isNetworkRoaming() ? "R" : "";
    }

    @NotNull
    public final String p() {
        return String.valueOf(dy2.f);
    }

    @fz4(name = "getUUID")
    @NotNull
    public final String r() {
        String h = this.e.h(iy2.b, "");
        if (TextUtils.isEmpty(h)) {
            String uuid = UUID.randomUUID().toString();
            c25.o(uuid, "uId.toString()");
            this.e.c(iy2.b, uuid);
            return uuid;
        }
        return h;
    }
}