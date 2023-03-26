package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class DynamiteModule {
    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @KeepForSdk
    public static final int REMOTE = 1;
    @GuardedBy("DynamiteModule.class")
    @z1
    private static Boolean zzb = null;
    @GuardedBy("DynamiteModule.class")
    @z1
    private static String zzc = null;
    @GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;
    @GuardedBy("DynamiteModule.class")
    private static int zze = -1;
    @GuardedBy("DynamiteModule.class")
    @z1
    private static Boolean zzf;
    @GuardedBy("DynamiteModule.class")
    @z1
    private static zzq zzk;
    @GuardedBy("DynamiteModule.class")
    @z1
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    @x1
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    @x1
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    @x1
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    @x1
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    @x1
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    @x1
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    @x1
    public static final VersionPolicy zza = new zzl();

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @DynamiteApi
    /* loaded from: classes2.dex */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        @z1
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @KeepForSdk
        /* loaded from: classes2.dex */
        public interface IVersions {
            int zza(@x1 Context context, @x1 String str);

            int zzb(@x1 Context context, @x1 String str, boolean z) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @KeepForSdk
        /* loaded from: classes2.dex */
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @x1
        @KeepForSdk
        SelectionResult selectModule(@x1 Context context, @x1 String str, @x1 IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@x1 Context context, @x1 String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                String.valueOf(declaredField.get(null));
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@x1 Context context, @x1 String str) {
        return zza(context, str, false);
    }

    @x1
    @KeepForSdk
    public static DynamiteModule load(@x1 Context context, @x1 VersionPolicy versionPolicy, @x1 String str) throws LoadingException {
        long j;
        VersionPolicy.SelectionResult selectModule;
        int i;
        Boolean bool;
        IObjectWrapper zzh2;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        Boolean valueOf;
        IObjectWrapper zze2;
        ThreadLocal threadLocal = zzg;
        zzn zznVar = (zzn) threadLocal.get();
        zzn zznVar2 = new zzn(null);
        threadLocal.set(zznVar2);
        ThreadLocal threadLocal2 = zzh;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            selectModule = versionPolicy.selectModule(context, str, zzi);
            int i2 = selectModule.localVersion;
            i = selectModule.selection;
        } catch (Throwable th) {
            th = th;
            j = 0;
        }
        try {
            if (i != 0) {
                if (i == -1) {
                    if (selectModule.localVersion != 0) {
                        i = -1;
                    }
                }
                if (i != 1 || selectModule.remoteVersion != 0) {
                    if (i == -1) {
                        DynamiteModule zzc2 = zzc(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return zzc2;
                    } else if (i == 1) {
                        try {
                            int i3 = selectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (zzf(context)) {
                                        bool = zzb;
                                    } else {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        synchronized (DynamiteModule.class) {
                                            zzrVar = zzl;
                                        }
                                        if (zzrVar != null) {
                                            zzn zznVar3 = (zzn) threadLocal.get();
                                            if (zznVar3 != null && zznVar3.zza != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor2 = zznVar3.zza;
                                                ObjectWrapper.wrap(null);
                                                synchronized (DynamiteModule.class) {
                                                    valueOf = Boolean.valueOf(zze >= 2);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    zze2 = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i3, ObjectWrapper.wrap(cursor2));
                                                } else {
                                                    zze2 = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i3, ObjectWrapper.wrap(cursor2));
                                                }
                                                Context context2 = (Context) ObjectWrapper.unwrap(zze2);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context", null);
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                    } else {
                                        zzq zzg2 = zzg(context);
                                        if (zzg2 != null) {
                                            int zze3 = zzg2.zze();
                                            if (zze3 >= 3) {
                                                zzn zznVar4 = (zzn) threadLocal.get();
                                                if (zznVar4 != null) {
                                                    zzh2 = zzg2.zzi(ObjectWrapper.wrap(context), str, i3, ObjectWrapper.wrap(zznVar4.zza));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                            } else if (zze3 == 2) {
                                                zzh2 = zzg2.zzj(ObjectWrapper.wrap(context), str, i3);
                                            } else {
                                                zzh2 = zzg2.zzh(ObjectWrapper.wrap(context), str, i3);
                                            }
                                            Object unwrap = ObjectWrapper.unwrap(zzh2);
                                            if (unwrap != null) {
                                                dynamiteModule = new DynamiteModule((Context) unwrap);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = zznVar2.zza;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(zznVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e, null);
                            } catch (LoadingException e2) {
                                throw e2;
                            } catch (Throwable th2) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th2);
                                throw new LoadingException("Failed to load remote module.", th2, null);
                            }
                        } catch (LoadingException e3) {
                            e3.getMessage();
                            int i4 = selectModule.localVersion;
                            if (i4 != 0 && versionPolicy.selectModule(context, str, new zzo(i4, 0)).selection == -1) {
                                DynamiteModule zzc3 = zzc(context, str);
                                if (longValue == 0) {
                                    zzh.remove();
                                } else {
                                    zzh.set(Long.valueOf(longValue));
                                }
                                Cursor cursor4 = zznVar2.zza;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                zzg.set(zznVar);
                                return zzc3;
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                        }
                    } else {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i, null);
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectModule.localVersion + " and remote version is " + selectModule.remoteVersion + CryptoConstants.ALIAS_SEPARATOR, null);
        } catch (Throwable th3) {
            th = th3;
            j = 0;
            if (longValue == j) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = zznVar2.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zzg.set(zznVar);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0124, code lost:
        if (zze(r11) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0161 A[Catch: all -> 0x0168, TryCatch #3 {all -> 0x0168, blocks: (B:3:0x0002, B:61:0x00c2, B:63:0x00c8, B:68:0x00d2, B:90:0x012a, B:97:0x0137, B:114:0x0161, B:115:0x0164, B:110:0x015a, B:66:0x00ce, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00bf, B:19:0x0046, B:41:0x0098, B:44:0x009b, B:52:0x00b4, B:60:0x00c1, B:58:0x00ba), top: B:125:0x0002, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(@x1 Context context, @x1 String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        e2.toString();
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzd(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!zzf(context)) {
                            return 0;
                        } else {
                            if (!zzd) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int zzb2 = zzb(context, str, z, true);
                                        String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader zza2 = zzb.zza();
                                            if (zza2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    zza2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = zzc;
                                                    Preconditions.checkNotNull(str4);
                                                    zza2 = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            zzd(zza2);
                                            declaredField.set(null, zza2);
                                            zzb = bool2;
                                            return zzb2;
                                        }
                                        return zzb2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        zzb = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e3) {
                        e3.getMessage();
                        return 0;
                    }
                }
                zzq zzg2 = zzg(context);
                if (zzg2 != null) {
                    try {
                        int zze2 = zzg2.zze();
                        if (zze2 >= 3) {
                            zzn zznVar = (zzn) zzg.get();
                            if (zznVar != null && (cursor = zznVar.zza) != null) {
                                i = cursor.getInt(0);
                            } else {
                                Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzg2.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                if (cursor3 != null) {
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            int i2 = cursor3.getInt(0);
                                            if (i2 > 0) {
                                            }
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            i = i2;
                                        }
                                    } catch (RemoteException e4) {
                                        e = e4;
                                        cursor2 = cursor3;
                                        try {
                                            e.getMessage();
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                            }
                        } else if (zze2 == 2) {
                            i = zzg2.zzg(ObjectWrapper.wrap(context), str, z);
                        } else {
                            i = zzg2.zzf(ObjectWrapper.wrap(context), str, z);
                        }
                    } catch (RemoteException e5) {
                        e = e5;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return i;
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzb(Context context, String str, boolean z, boolean z2) throws LoadingException {
        Throwable th;
        Exception e;
        ?? r0 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z4 = false;
                            int i = query.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    zzc = query.getString(2);
                                    int columnIndex = query.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zze = query.getInt(columnIndex);
                                    }
                                    int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (query.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        zzd = z3;
                                        z4 = z3;
                                    }
                                }
                                if (zze(query)) {
                                    query = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", null);
                            }
                            return i;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        throw new LoadingException("V2 version check failed", e, null);
                    }
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", null);
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                if (r0 != 0) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r0 = context;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            zzf = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return z;
    }

    @z1
    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            return null;
        }
    }

    @x1
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @x1
    @KeepForSdk
    public IBinder instantiate(@x1 String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}