package com.p7700g.p99005;

import com.google.android.gms.ads.AdError;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* compiled from: Localizer.java */
/* loaded from: classes3.dex */
public class wx3 {
    private final Locale a;
    private final HashMap b;

    public wx3() {
        this(Locale.getDefault());
    }

    private String a(tx3 tx3Var) {
        String key = tx3Var.getKey();
        Object[] n = tx3Var.n();
        StringBuilder L = wo1.L("[failed to localize] ", key);
        if (n != null) {
            L.append('(');
            for (int i = 0; i < n.length; i++) {
                if (i != 0) {
                    L.append(", ");
                }
                L.append(String.valueOf(n[i]));
            }
            L.append(')');
        }
        return L.toString();
    }

    public Locale b() {
        return this.a;
    }

    public String c(tx3 tx3Var) {
        String string;
        String key = tx3Var.getKey();
        if (key == tx3.a) {
            return (String) tx3Var.n()[0];
        }
        String o = tx3Var.o();
        try {
            ResourceBundle resourceBundle = (ResourceBundle) this.b.get(o);
            if (resourceBundle == null) {
                try {
                    resourceBundle = ResourceBundle.getBundle(o, this.a);
                } catch (MissingResourceException unused) {
                    int lastIndexOf = o.lastIndexOf(46);
                    if (lastIndexOf != -1) {
                        try {
                            resourceBundle = ResourceBundle.getBundle(o.substring(lastIndexOf + 1), this.a);
                        } catch (MissingResourceException unused2) {
                            return a(tx3Var);
                        }
                    }
                }
                this.b.put(o, resourceBundle);
            }
            if (resourceBundle == null) {
                return a(tx3Var);
            }
            if (key == null) {
                key = AdError.UNDEFINED_DOMAIN;
            }
            try {
                string = resourceBundle.getString(key);
            } catch (MissingResourceException unused3) {
                string = resourceBundle.getString(AdError.UNDEFINED_DOMAIN);
            }
            Object[] n = tx3Var.n();
            for (int i = 0; i < n.length; i++) {
                if (n[i] instanceof tx3) {
                    n[i] = c((tx3) n[i]);
                }
            }
            return MessageFormat.format(string, n);
        } catch (MissingResourceException unused4) {
            return a(tx3Var);
        }
    }

    public wx3(Locale locale) {
        this.a = locale;
        this.b = new HashMap();
    }
}