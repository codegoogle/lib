package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import com.p7700g.p99005.by5;
import com.p7700g.p99005.qx5;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: GifDrawableInit.java */
/* loaded from: classes4.dex */
public abstract class qx5<T extends qx5<T>> {
    private by5 a;
    private ox5 b;
    private ScheduledThreadPoolExecutor c;
    private boolean d = true;
    private ux5 e = new ux5();

    public ox5 a() throws IOException {
        by5 by5Var = this.a;
        Objects.requireNonNull(by5Var, "Source is not set");
        return by5Var.a(this.b, this.c, this.d, this.e);
    }

    public T b(ContentResolver contentResolver, Uri uri) {
        this.a = new by5.j(contentResolver, uri);
        return t();
    }

    public T c(AssetFileDescriptor assetFileDescriptor) {
        this.a = new by5.b(assetFileDescriptor);
        return t();
    }

    public T d(AssetManager assetManager, String str) {
        this.a = new by5.c(assetManager, str);
        return t();
    }

    public T e(Resources resources, int i) {
        this.a = new by5.i(resources, i);
        return t();
    }

    public T f(File file) {
        this.a = new by5.g(file);
        return t();
    }

    public T g(FileDescriptor fileDescriptor) {
        this.a = new by5.f(fileDescriptor);
        return t();
    }

    public T h(InputStream inputStream) {
        this.a = new by5.h(inputStream);
        return t();
    }

    public T i(String str) {
        this.a = new by5.g(str);
        return t();
    }

    public T j(ByteBuffer byteBuffer) {
        this.a = new by5.e(byteBuffer);
        return t();
    }

    public T k(byte[] bArr) {
        this.a = new by5.d(bArr);
        return t();
    }

    public ScheduledThreadPoolExecutor l() {
        return this.c;
    }

    public by5 m() {
        return this.a;
    }

    public ox5 n() {
        return this.b;
    }

    public ux5 o() {
        return this.e;
    }

    public boolean p() {
        return this.d;
    }

    @jy5
    public T q(@z1 ux5 ux5Var) {
        this.e.b(ux5Var);
        return t();
    }

    public T r(boolean z) {
        this.d = z;
        return t();
    }

    public T s(@p1(from = 1, to = 65535) int i) {
        this.e.d(i);
        return t();
    }

    public abstract T t();

    public T u(boolean z) {
        return r(z);
    }

    public T v(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        return t();
    }

    public T w(int i) {
        this.c = new ScheduledThreadPoolExecutor(i);
        return t();
    }

    public T x(ox5 ox5Var) {
        this.b = ox5Var;
        return t();
    }
}