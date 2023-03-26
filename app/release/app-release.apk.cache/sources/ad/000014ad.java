package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class VZ implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ C1057Vk A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"eOUuWViEzFdpoMILAqmgKfGD", "kQ8zGky5wq3o9AT", "ncGQnuO4sM8XFQVxbr6Mt1Vf36DFujo3", "a4nYvm2BizGaG1Ug1SxTpBLIw0WxQ6vz", "jAlZY9MHNrHTDDv2DRP1sCieuZx8QBhv", "RCRcS7R4oQOTyLjlpIEX5API7Ni0gnf1", "stcG16G11KY1ooFu5mTwbs8KzP9kRkND", "k7goAJY4JhsqFIUQ56a5dCg3eq5QWQcp"};
    }

    public VZ(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        PackageManager packageManager;
        PackageManager packageManager2;
        PackageManager packageManager3;
        PackageManager packageManager4;
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A08(EnumC04526t.A05);
        }
        packageManager = this.A00.A02;
        if (packageManager != null) {
            packageManager2 = this.A00.A02;
            if (packageManager2.getPackageInstaller() != null) {
                packageManager3 = this.A00.A02;
                if (packageManager3.getPackageInstaller().getSessionInfo(0) != null) {
                    C1057Vk c1057Vk = this.A00;
                    packageManager4 = c1057Vk.A02;
                    return c1057Vk.A05(packageManager4.getPackageInstaller().getSessionInfo(0).getInstallReason());
                }
            }
        }
        C1057Vk c1057Vk2 = this.A00;
        EnumC04526t enumC04526t = EnumC04526t.A07;
        if (A01[4].charAt(16) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "aumDgxyAyTkwYeibDzhpdrzSDvCJmfPb";
        strArr[4] = "aumDgxyAyTkwYeibDzhpdrzSDvCJmfPb";
        return c1057Vk2.A08(enumC04526t);
    }
}