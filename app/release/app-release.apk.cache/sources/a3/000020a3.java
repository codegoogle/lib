package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.core.common.g.c;
import com.anythink.expressad.video.signal.a.f;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.p7700g.p99005.wo1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbyy implements zzbza {
    @VisibleForTesting
    public static zzbza zza;
    @VisibleForTesting
    public static zzbza zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzcfo zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    public zzbyy(Context context, zzcfo zzcfoVar) {
        zzfnv.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcfoVar;
    }

    public static zzbza zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbjx.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgz)).booleanValue()) {
                        zza = new zzbyy(context, zzcfo.zza());
                    }
                }
                zza = new zzbyz();
            }
        }
        return zza;
    }

    public static zzbza zzb(Context context, zzcfo zzcfoVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbjx.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgz)).booleanValue()) {
                        zzbyy zzbyyVar = new zzbyy(context, zzcfoVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbyyVar.zzd) {
                                zzbyyVar.zzf.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbyx(zzbyyVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbyw(zzbyyVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbyyVar;
                    }
                }
                zzb = new zzbyz();
            }
        }
        return zzb;
    }

    public final void zzc(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzcfb.zzn(stackTraceElement.getClassName());
                    z2 |= zzbyy.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zze(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzd(Throwable th, String str) {
        zze(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zze(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (zzcfb.zzf(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        double d = f;
        double random = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (random < d) {
            ArrayList arrayList = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th2) {
                zzcfi.zzh("Error fetching instant app info", th2);
                z = false;
            }
            try {
                str2 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzcfi.zzj("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = wo1.u(str3, " ", str4);
            }
            arrayList.add(appendQueryParameter.appendQueryParameter(AbstractLog.DEVICE, str4).appendQueryParameter(f.a, this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", zzbhz.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "458339781").appendQueryParameter(c.O, "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbjx.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : "1").toString());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final String str5 = (String) it.next();
                final zzcfn zzcfnVar = new zzcfn(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfn.this.zza(str5);
                    }
                });
            }
        }
    }
}