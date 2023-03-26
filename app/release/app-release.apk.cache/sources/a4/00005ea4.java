package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.List;

/* compiled from: VASTModelPostValidator.java */
/* loaded from: classes3.dex */
public class tp5 {
    private static final String a = "com.p7700g.p99005.tp5";

    public static boolean a(pp5 model, sp5 mediaPicker) {
        String str = a;
        bq5.a(str, "validate");
        boolean z = false;
        if (!b(model)) {
            bq5.a(str, "Validator returns: not valid (invalid model)");
            return false;
        }
        if (mediaPicker != null) {
            op5 a2 = mediaPicker.a(model.n());
            if (a2 != null) {
                String g = a2.g();
                if (!TextUtils.isEmpty(g)) {
                    model.y(g);
                    bq5.a(str, "mediaPicker selected mediaFile with URL " + g);
                    z = true;
                }
            }
        } else {
            bq5.h(str, "mediaPicker: We don't have a compatible media file to play.");
        }
        StringBuilder G = wo1.G("Validator returns: ");
        G.append(z ? "valid" : "not valid (no media file)");
        bq5.a(str, G.toString());
        return z;
    }

    private static boolean b(pp5 model) {
        String str = a;
        bq5.a(str, "validateModel");
        List<String> i = model.i();
        boolean z = (i == null || i.size() == 0) ? false : true;
        List<op5> n = model.n();
        if (n == null || n.size() == 0) {
            bq5.a(str, "Validator error: mediaFile list invalid");
            return false;
        }
        return z;
    }
}