package com.p7700g.p99005;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: FingerprintManagerCompat.java */
@Deprecated
/* loaded from: classes.dex */
public class rk {
    private final Context a;

    /* compiled from: FingerprintManagerCompat.java */
    /* loaded from: classes.dex */
    public class a extends FingerprintManager.AuthenticationCallback {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.a.a(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.a.c(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.a.d(new d(rk.f(b.b(authenticationResult))));
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        @h2("android.permission.USE_FINGERPRINT")
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @e1
        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @e1
        public static FingerprintManager c(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (i == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        @e1
        @h2("android.permission.USE_FINGERPRINT")
        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @e1
        @h2("android.permission.USE_FINGERPRINT")
        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @e1
        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        @e1
        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public void a(int i, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i, CharSequence charSequence) {
        }

        public void d(d dVar) {
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* loaded from: classes.dex */
    public static final class d {
        private final e a;

        public d(e eVar) {
            this.a = eVar;
        }

        public e a() {
            return this.a;
        }
    }

    private rk(Context context) {
        this.a = context;
    }

    @x1
    public static rk b(@x1 Context context) {
        return new rk(context);
    }

    @e2(23)
    @z1
    private static FingerprintManager c(@x1 Context context) {
        return b.c(context);
    }

    @e2(23)
    public static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    @e2(23)
    private static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new a(cVar);
    }

    @e2(23)
    private static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    @h2("android.permission.USE_FINGERPRINT")
    public void a(@z1 e eVar, int i, @z1 nm nmVar, @x1 c cVar, @z1 Handler handler) {
        FingerprintManager c2;
        if (Build.VERSION.SDK_INT < 23 || (c2 = c(this.a)) == null) {
            return;
        }
        b.a(c2, h(eVar), nmVar != null ? (CancellationSignal) nmVar.b() : null, i, g(cVar), handler);
    }

    @h2("android.permission.USE_FINGERPRINT")
    public boolean d() {
        FingerprintManager c2;
        return Build.VERSION.SDK_INT >= 23 && (c2 = c(this.a)) != null && b.d(c2);
    }

    @h2("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager c2;
        return Build.VERSION.SDK_INT >= 23 && (c2 = c(this.a)) != null && b.e(c2);
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        private final Signature a;
        private final Cipher b;
        private final Mac c;

        public e(@x1 Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
        }

        @z1
        public Cipher a() {
            return this.b;
        }

        @z1
        public Mac b() {
            return this.c;
        }

        @z1
        public Signature c() {
            return this.a;
        }

        public e(@x1 Cipher cipher) {
            this.b = cipher;
            this.a = null;
            this.c = null;
        }

        public e(@x1 Mac mac) {
            this.c = mac;
            this.b = null;
            this.a = null;
        }
    }
}