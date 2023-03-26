package com.anchorfree.partner.celpher;

import android.content.Context;
import com.p7700g.p99005.hu0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class PartnerCelpher {
    @x1
    private final Context a;

    public PartnerCelpher(@x1 Context context) {
        this.a = context;
    }

    @x1
    public List<String> a() {
        hu0.b(this.a, "partner-celpher");
        String[] sc = sc(this.a);
        if (sc != null) {
            return Arrays.asList(sc);
        }
        return new ArrayList();
    }

    @x1
    public List<String> b(@x1 String str) {
        hu0.b(this.a, "partner-celpher");
        String[] ss = ss(this.a, str);
        if (ss != null) {
            return Arrays.asList(ss);
        }
        return new ArrayList();
    }

    @z1
    public native String[] sc(@x1 Context context);

    @z1
    public native String[] ss(@x1 Context context, @x1 String str);
}