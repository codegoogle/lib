package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.d.a.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.p7700g.p99005.x1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(2:2|3)|4|(21:47|48|7|8|9|10|11|12|13|(12:39|40|16|(9:35|36|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6 = null;
        try {
            method = WorkSource.class.getMethod(b.ay, Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        zzb = method;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                method2 = WorkSource.class.getMethod(b.ay, Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
            zzc = method2;
            Method method7 = WorkSource.class.getMethod(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, new Class[0]);
            zzd = method7;
            Method method8 = WorkSource.class.getMethod("get", Integer.TYPE);
            zze = method8;
            if (PlatformVersion.isAtLeastJellyBeanMR2()) {
                try {
                    method3 = WorkSource.class.getMethod("getName", Integer.TYPE);
                } catch (Exception unused3) {
                }
                zzf = method3;
                if (PlatformVersion.isAtLeastP()) {
                    try {
                        method4 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
                    } catch (Exception unused4) {
                    }
                    zzg = method4;
                    if (PlatformVersion.isAtLeastP()) {
                        try {
                            method5 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
                        } catch (Exception unused5) {
                        }
                        zzh = method5;
                        if (PlatformVersion.isAtLeastP()) {
                            try {
                                method6 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                                method6.setAccessible(true);
                            } catch (Exception unused6) {
                            }
                        }
                        zzi = method6;
                    }
                    method5 = null;
                    zzh = method5;
                    if (PlatformVersion.isAtLeastP()) {
                    }
                    zzi = method6;
                }
                method4 = null;
                zzg = method4;
                if (PlatformVersion.isAtLeastP()) {
                }
                method5 = null;
                zzh = method5;
                if (PlatformVersion.isAtLeastP()) {
                }
                zzi = method6;
            }
            method3 = null;
            zzf = method3;
            if (PlatformVersion.isAtLeastP()) {
            }
            method4 = null;
            zzg = method4;
            if (PlatformVersion.isAtLeastP()) {
            }
            method5 = null;
            zzh = method5;
            if (PlatformVersion.isAtLeastP()) {
            }
            zzi = method6;
        }
        method2 = null;
        zzc = method2;
        Method method72 = WorkSource.class.getMethod(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, new Class[0]);
        zzd = method72;
        Method method82 = WorkSource.class.getMethod("get", Integer.TYPE);
        zze = method82;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
        }
        method3 = null;
        zzf = method3;
        if (PlatformVersion.isAtLeastP()) {
        }
        method4 = null;
        zzg = method4;
        if (PlatformVersion.isAtLeastP()) {
        }
        method5 = null;
        zzh = method5;
        if (PlatformVersion.isAtLeastP()) {
        }
        zzi = method6;
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@x1 WorkSource workSource, int i, @x1 String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    @x1
    @KeepForSdk
    public static WorkSource fromPackage(@x1 Context context, @x1 String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    @x1
    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(@x1 Context context, @x1 String str, @x1 String str2) {
        Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            return null;
        }
        int i = -1;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                "Could not get applicationInfo from package: ".concat(str);
            } else {
                i = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            "Could not find package: ".concat(str);
        }
        if (i < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = zzg;
        if (method2 != null && (method = zzh) != null) {
            try {
                Object invoke = method2.invoke(workSource, new Object[0]);
                int i2 = zza;
                if (i != i2) {
                    method.invoke(invoke, Integer.valueOf(i), str);
                }
                method.invoke(invoke, Integer.valueOf(i2), str2);
            } catch (Exception unused2) {
            }
        } else {
            add(workSource, i, str);
        }
        return workSource;
    }

    @KeepForSdk
    public static int get(@x1 WorkSource workSource, int i) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    @x1
    @KeepForSdk
    public static String getName(@x1 WorkSource workSource, int i) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return null;
            }
        }
        return null;
    }

    @x1
    @KeepForSdk
    public static List<String> getNames(@x1 WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(@x1 Context context) {
        return (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    @KeepForSdk
    public static boolean isEmpty(@x1 WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(@x1 WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}