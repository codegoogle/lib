package com.p7700g.p99005;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IidStore.java */
/* loaded from: classes3.dex */
public class ds2 {
    private static final String a = "com.google.android.gms.appid";
    private static final String b = "|S||P|";
    private static final String c = "|S|id";
    private static final String d = "|T|";
    private static final String e = "|";
    private static final String f = "token";
    private static final String g = "{";
    private static final String[] h = {tm4.g, FirebaseMessaging.a, CodePackage.GCM, ""};
    @k1("iidPrefs")
    private final SharedPreferences i;
    private final String j;

    public ds2(@x1 pn2 pn2Var) {
        this.i = pn2Var.l().getSharedPreferences(a, 0);
        this.j = b(pn2Var);
    }

    private String a(@x1 String str, @x1 String str2) {
        return wo1.v(d, str, "|", str2);
    }

    private static String b(pn2 pn2Var) {
        String m = pn2Var.q().m();
        if (m != null) {
            return m;
        }
        String j = pn2Var.q().j();
        if (j.startsWith("1:") || j.startsWith("2:")) {
            String[] split = j.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return j;
    }

    @z1
    private static String c(@x1 PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @z1
    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            String str2 = "Invalid key stored " + e2;
            return null;
        }
    }

    @z1
    private String g() {
        String string;
        synchronized (this.i) {
            string = this.i.getString(c, null);
        }
        return string;
    }

    @z1
    private String h() {
        synchronized (this.i) {
            String string = this.i.getString(b, null);
            if (string == null) {
                return null;
            }
            PublicKey e2 = e(string);
            if (e2 == null) {
                return null;
            }
            return c(e2);
        }
    }

    @z1
    public String f() {
        synchronized (this.i) {
            String g2 = g();
            if (g2 != null) {
                return g2;
            }
            return h();
        }
    }

    @z1
    public String i() {
        synchronized (this.i) {
            for (String str : h) {
                String string = this.i.getString(a(this.j, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(g)) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    @r2
    public ds2(@x1 SharedPreferences sharedPreferences, @z1 String str) {
        this.i = sharedPreferences;
        this.j = str;
    }
}