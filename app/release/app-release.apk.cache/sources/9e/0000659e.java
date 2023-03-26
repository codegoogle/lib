package com.p7700g.p99005;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PackageInfoCompat.java */
/* loaded from: classes.dex */
public final class xh {

    /* compiled from: PackageInfoCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        @z1
        public static Signature[] a(@x1 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @e1
        public static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @e1
        @z1
        public static Signature[] c(@x1 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @e1
        public static boolean d(@x1 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @e1
        public static boolean e(@x1 PackageManager packageManager, @x1 String str, @x1 byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    private xh() {
    }

    private static boolean a(@x1 byte[][] bArr, @x1 byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    public static long c(@x1 PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(packageInfo);
        }
        return packageInfo.versionCode;
    }

    @x1
    public static List<Signature> d(@x1 PackageManager packageManager, @x1 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            if (a.d(signingInfo)) {
                signatureArr = a.a(signingInfo);
            } else {
                signatureArr = a.c(signingInfo);
            }
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        if (signatureArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(signatureArr);
    }

    public static boolean e(@x1 PackageManager packageManager, @x1 String str, @x1 @j2(min = 1) Map<byte[], Integer> map, boolean z) throws PackageManager.NameNotFoundException {
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr : keySet) {
            if (bArr != null) {
                Integer num = map.get(bArr);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue != 0 && intValue != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
                    }
                } else {
                    throw new IllegalArgumentException(wo1.t("Type must be specified for cert when verifying ", str));
                }
            } else {
                throw new IllegalArgumentException(wo1.t("Cert byte array cannot be null when verifying ", str));
            }
        }
        List<Signature> d = d(packageManager, str);
        if (!z && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr2 : keySet) {
                if (!a.e(packageManager, str, bArr2, map.get(bArr2).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (d.size() != 0 && map.size() <= d.size() && (!z || map.size() == d.size())) {
            byte[][] bArr3 = null;
            if (map.containsValue(1)) {
                bArr3 = new byte[d.size()];
                for (int i = 0; i < d.size(); i++) {
                    bArr3[i] = b(d.get(i).toByteArray());
                }
            }
            Iterator<byte[]> it = keySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 == 1) {
                        if (!a(bArr3, next)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                } else if (!d.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}