package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzflw {
    public static boolean zza(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int zzb(Context context, zzfku zzfkuVar) {
        int i;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            zzfkuVar.zzb(5017, "No lib/");
        } else {
            File[] listFiles = file.listFiles(new zzftm(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    bArr = new byte[20];
                } catch (IOException e) {
                    zzd(null, e.toString(), context, zzfkuVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzd(bArr, null, context, zzfkuVar);
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            fileInputStream.close();
                            i = 5;
                        } else if (s == 40) {
                            fileInputStream.close();
                            i = 3;
                        } else if (s == 62) {
                            fileInputStream.close();
                            i = 7;
                        } else if (s != 183) {
                            zzd(bArr, null, context, zzfkuVar);
                        } else {
                            fileInputStream.close();
                            i = 6;
                        }
                        if (i == 1000) {
                            String zzc = zzc(context, zzfkuVar);
                            if (TextUtils.isEmpty(zzc)) {
                                zzd(null, "Empty dev arch", context, zzfkuVar);
                            } else if (zzc.equalsIgnoreCase("i686") || zzc.equalsIgnoreCase("x86")) {
                                i = 5;
                            } else if (zzc.equalsIgnoreCase("x86_64")) {
                                i = 7;
                            } else if (zzc.equalsIgnoreCase("arm64-v8a")) {
                                i = 6;
                            } else if (zzc.equalsIgnoreCase("armeabi-v7a") || zzc.equalsIgnoreCase("armv71")) {
                                i = 3;
                            } else {
                                zzd(null, zzc, context, zzfkuVar);
                            }
                            i = 1;
                        }
                        zzfkuVar.zzb(5018, i != 1 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? pg1.d : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                        return i;
                    }
                }
                fileInputStream.close();
                i = 1;
                if (i == 1000) {
                }
                zzfkuVar.zzb(5018, i != 1 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? pg1.d : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                return i;
            }
            zzfkuVar.zzb(5017, "No .so");
        }
        i = 1000;
        if (i == 1000) {
        }
        zzfkuVar.zzb(5018, i != 1 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? pg1.d : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
        return i;
    }

    private static final String zzc(Context context, zzfku zzfkuVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfph.OS_ARCH.zza();
        if (TextUtils.isEmpty(zza) || !hashSet.contains(zza)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e) {
                zzfkuVar.zzc(2024, 0L, e);
            } catch (NoSuchFieldException e2) {
                zzfkuVar.zzc(2024, 0L, e2);
            }
            String str = Build.CPU_ABI;
            return str != null ? str : Build.CPU_ABI2;
        }
        return zza;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfku zzfkuVar) {
        StringBuilder G = wo1.G("os.arch:");
        G.append(zzfph.OS_ARCH.zza());
        G.append(AppCenter.PAIR_DELIMITER);
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                G.append("supported_abis:");
                G.append(Arrays.toString(strArr));
                G.append(AppCenter.PAIR_DELIMITER);
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        G.append("CPU_ABI:");
        G.append(Build.CPU_ABI);
        G.append(";CPU_ABI2:");
        G.append(Build.CPU_ABI2);
        G.append(AppCenter.PAIR_DELIMITER);
        if (bArr != null) {
            G.append("ELF:");
            G.append(Arrays.toString(bArr));
            G.append(AppCenter.PAIR_DELIMITER);
        }
        if (str != null) {
            wo1.g0(G, "dbg:", str, AppCenter.PAIR_DELIMITER);
        }
        zzfkuVar.zzb(4007, G.toString());
    }
}