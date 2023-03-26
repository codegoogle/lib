package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PackageIdentityUtils.java */
/* loaded from: classes.dex */
public class q6 {
    private static final String a = "PackageIdentity";

    /* compiled from: PackageIdentityUtils.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a implements c {
        @Override // com.p7700g.p99005.q6.c
        @z1
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(q6.a(signature));
                }
            } else {
                arrayList.add(q6.a(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        @Override // com.p7700g.p99005.q6.c
        public boolean b(String str, PackageManager packageManager, t6 t6Var) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> a;
            if (t6Var.g().equals(str) && (a = a(str, packageManager)) != null) {
                if (a.size() == 1) {
                    return packageManager.hasSigningCertificate(str, t6Var.e(0), 1);
                }
                return t6Var.equals(t6.b(str, a));
            }
            return false;
        }
    }

    /* compiled from: PackageIdentityUtils.java */
    /* loaded from: classes.dex */
    public static class b implements c {
        @Override // com.p7700g.p99005.q6.c
        @z1
        @SuppressLint({"PackageManagerGetSignatures"})
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] a = q6.a(signature);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
            }
            return arrayList;
        }

        @Override // com.p7700g.p99005.q6.c
        public boolean b(String str, PackageManager packageManager, t6 t6Var) throws IOException, PackageManager.NameNotFoundException {
            List<byte[]> a;
            if (str.equals(t6Var.g()) && (a = a(str, packageManager)) != null) {
                return t6Var.equals(t6.b(str, a));
            }
            return false;
        }
    }

    /* compiled from: PackageIdentityUtils.java */
    /* loaded from: classes.dex */
    public interface c {
        @z1
        List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException;

        boolean b(String str, PackageManager packageManager, t6 t6Var) throws IOException, PackageManager.NameNotFoundException;
    }

    private q6() {
    }

    @z1
    public static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @z1
    public static List<byte[]> b(String str, PackageManager packageManager) {
        try {
            return c().a(str, packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static c c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new a();
        }
        return new b();
    }

    public static boolean d(String str, PackageManager packageManager, t6 t6Var) {
        try {
            return c().b(str, packageManager, t6Var);
        } catch (PackageManager.NameNotFoundException | IOException unused) {
            return false;
        }
    }
}