package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Storage {
    private static final Lock zaa = new ReentrantLock();
    @GuardedBy("sLk")
    @z1
    private static Storage zab;
    private final Lock zac = new ReentrantLock();
    @GuardedBy("mLk")
    private final SharedPreferences zad;

    @VisibleForTesting
    public Storage(Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @x1
    @KeepForSdk
    public static Storage getInstance(@x1 Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = zaa;
        lock.lock();
        try {
            if (zab == null) {
                zab = new Storage(context.getApplicationContext());
            }
            Storage storage = zab;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            zaa.unlock();
            throw th;
        }
    }

    private static final String zae(String str, String str2) {
        return wo1.D(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    @KeepForSdk
    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    @KeepForSdk
    @z1
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String zaa2;
        String zaa3 = zaa("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae("googleSignInAccount", zaa3))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.zab(zaa2);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    @z1
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String zaa2;
        String zaa3 = zaa("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa3) || (zaa2 = zaa(zae("googleSignInOptions", zaa3))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.zab(zaa2);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    @z1
    public String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@x1 GoogleSignInAccount googleSignInAccount, @x1 GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String zac = googleSignInAccount.zac();
        zad(zae("googleSignInAccount", zac), googleSignInAccount.zad());
        zad(zae("googleSignInOptions", zac), googleSignInOptions.zaf());
    }

    @z1
    public final String zaa(@x1 String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    public final void zab(@x1 String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        String zaa2 = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa2)) {
            return;
        }
        zab(zae("googleSignInAccount", zaa2));
        zab(zae("googleSignInOptions", zaa2));
    }

    public final void zad(@x1 String str, @x1 String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}