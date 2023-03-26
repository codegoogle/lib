package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Tu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1015Tu implements InterfaceC04416i {
    public final /* synthetic */ U7 A00;

    public C1015Tu(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws CertificateException, PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        Context context;
        Context context2;
        AbstractC04566x A05;
        context = this.A00.A00;
        PackageManager packageManager = context.getPackageManager();
        context2 = this.A00.A00;
        Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < signatureArr.length; i++) {
            hashMap.put(Integer.valueOf(i), new U6(signatureArr[i]));
        }
        A05 = this.A00.A05(hashMap);
        return A05;
    }
}