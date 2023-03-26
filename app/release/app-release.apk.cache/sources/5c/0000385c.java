package com.p7700g.p99005;

import android.os.Build;
import com.p7700g.p99005.fr5;
import com.p7700g.p99005.oq5;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;

/* compiled from: Tls12Api19Compat.java */
/* loaded from: classes.dex */
public class a61 {
    @x1
    private static final kj1 a = kj1.b("Tls12Api19Compat");

    public static void a(@x1 fr5.a aVar) {
        if (Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, null, null);
                aVar.P0(new b61(sSLContext.getSocketFactory()));
                oq5 c = new oq5.a(oq5.d).p(mr5.TLS_1_2).c();
                ArrayList arrayList = new ArrayList();
                arrayList.add(c);
                arrayList.add(oq5.e);
                arrayList.add(oq5.f);
                aVar.n(arrayList);
            } catch (Exception e) {
                a.g(e, "Error while setting TLS 1.2", new Object[0]);
            }
        }
    }
}