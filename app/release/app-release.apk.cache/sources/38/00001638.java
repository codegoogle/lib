package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;

/* compiled from: ApplicationSoSource.java */
/* loaded from: classes2.dex */
public class c extends x {
    private Context j;
    private int k;
    private d l;

    public c(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.j = applicationContext;
        if (applicationContext == null) {
            this.j = context;
        }
        this.k = i;
        this.l = new d(new File(this.j.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // com.facebook.soloader.x
    public void a(Collection<String> collection) {
        this.l.a(collection);
    }

    @Override // com.facebook.soloader.x
    public int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.l.c(str, i, threadPolicy);
    }

    @Override // com.facebook.soloader.x
    public void d(int i) throws IOException {
        this.l.d(i);
    }

    @Override // com.facebook.soloader.x
    @Nullable
    public File e(String str) throws IOException {
        return this.l.e(str);
    }

    public boolean f() throws IOException {
        try {
            File file = this.l.l;
            Context context = this.j;
            Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            String str = "Native library directory updated from " + file + " to " + file2;
            int i = this.k | 1;
            this.k = i;
            d dVar = new d(file2, i);
            this.l = dVar;
            dVar.d(this.k);
            this.j = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.soloader.x
    public String toString() {
        return this.l.toString();
    }
}