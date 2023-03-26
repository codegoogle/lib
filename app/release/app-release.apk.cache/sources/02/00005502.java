package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: DeviceIDProvider.java */
/* loaded from: classes.dex */
public class ot0 {
    @x1
    private final Context a;
    @x1
    private final rt0 b;
    @x1
    private List<b> c;

    /* compiled from: DeviceIDProvider.java */
    /* loaded from: classes.dex */
    public static class a implements b {
        @Override // com.p7700g.p99005.ot0.b
        @SuppressLint({"MissingPermission", "HardwareIds"})
        public String a(Context context) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            return defaultAdapter != null ? defaultAdapter.getAddress() : "";
        }
    }

    /* compiled from: DeviceIDProvider.java */
    /* loaded from: classes.dex */
    public interface b {
        String a(Context context);
    }

    /* compiled from: DeviceIDProvider.java */
    /* loaded from: classes.dex */
    public static class c implements b {
        @Override // com.p7700g.p99005.ot0.b
        @SuppressLint({"HardwareIds"})
        public String a(Context context) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
    }

    /* compiled from: DeviceIDProvider.java */
    /* loaded from: classes.dex */
    public static class d implements b {
        @Override // com.p7700g.p99005.ot0.b
        @SuppressLint({"MissingPermission", "HardwareIds"})
        public String a(Context context) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getSimSerialNumber() : "";
        }
    }

    /* compiled from: DeviceIDProvider.java */
    /* loaded from: classes.dex */
    public static class e implements b {
        @Override // com.p7700g.p99005.ot0.b
        @SuppressLint({"MissingPermission", "HardwareIds"})
        public String a(Context context) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getDeviceId() : "";
        }
    }

    /* compiled from: DeviceIDProvider.java */
    /* loaded from: classes.dex */
    public static class f implements b {
        @Override // com.p7700g.p99005.ot0.b
        @SuppressLint({"MissingPermission", "HardwareIds"})
        public String a(Context context) {
            WifiInfo connectionInfo;
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(k21.b);
            return (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? "" : connectionInfo.getMacAddress();
        }
    }

    public ot0(@x1 Context context, @x1 rt0 rt0Var) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = context;
        this.b = rt0Var;
        arrayList.add(new c());
        this.c.add(new f());
        this.c.add(new a());
        this.c.add(new e());
        this.c.add(new d());
    }

    private static String b(String str) {
        return str.toLowerCase(Locale.US).replaceAll("[^A-Za-z0-9]", "");
    }

    public String a() {
        String b2;
        String str = this.b.get();
        if (TextUtils.isEmpty(str)) {
            for (b bVar : this.c) {
                try {
                    b2 = b(bVar.a(this.a));
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(b2)) {
                    this.b.a(b2);
                    return b2;
                }
                continue;
            }
            String b3 = b(UUID.randomUUID().toString());
            this.b.a(b3);
            return b3;
        }
        return str;
    }
}