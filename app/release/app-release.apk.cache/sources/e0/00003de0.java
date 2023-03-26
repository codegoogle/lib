package com.p7700g.p99005;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* compiled from: HostIdentifierException.java */
/* loaded from: classes3.dex */
public class d14 extends Exception {
    private static final long s = 4;
    public static ResourceBundle t;

    static {
        String str = d14.class.getPackage().getName() + ".IPAddressResources";
        try {
            t = ResourceBundle.getBundle(str);
        } catch (MissingResourceException unused) {
            System.err.println("bundle " + str + " is missing");
        }
    }

    public d14(CharSequence charSequence, String str, String str2, Throwable th) {
        super(charSequence.toString() + gl4.R + str + gl4.R + a(str2), th);
    }

    public static String a(String str) {
        ResourceBundle resourceBundle = t;
        if (resourceBundle != null) {
            try {
                return resourceBundle.getString(str);
            } catch (MissingResourceException unused) {
                return str;
            }
        }
        return str;
    }

    public d14(CharSequence charSequence, String str, String str2) {
        super(charSequence.toString() + gl4.R + str + gl4.R + a(str2));
    }

    public d14(CharSequence charSequence) {
        super(charSequence.toString());
    }

    public d14(CharSequence charSequence, Throwable th) {
        super(charSequence.toString(), th);
    }

    public d14(CharSequence charSequence, String str) {
        super(charSequence.toString() + gl4.R + a(str));
    }
}