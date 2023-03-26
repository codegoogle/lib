package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Locale;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: GifAnimationMetaData.java */
/* loaded from: classes4.dex */
public class mx5 implements Serializable, Parcelable {
    public static final Parcelable.Creator<mx5> CREATOR = new a();
    private static final long s = 5692363926580237325L;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final long y;
    private final long z;

    /* compiled from: GifAnimationMetaData.java */
    /* loaded from: classes4.dex */
    public static class a implements Parcelable.Creator<mx5> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public mx5 createFromParcel(Parcel parcel) {
            return new mx5(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public mx5[] newArray(int i) {
            return new mx5[i];
        }
    }

    public /* synthetic */ mx5(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long g() {
        return this.y;
    }

    @jy5
    public long i(@z1 ox5 ox5Var, @p1(from = 1, to = 65535) int i) {
        int i2;
        if (i >= 1 && i <= 65535) {
            int i3 = i * i;
            if (ox5Var != null && !ox5Var.x.isRecycled()) {
                i2 = ox5Var.x.getAllocationByteCount();
            } else {
                i2 = ((this.w * this.v) * 4) / i3;
            }
            return (this.y / i3) + i2;
        }
        throw new IllegalStateException("Sample size " + i + " out of range <1, " + j15.c + ">");
    }

    public int m() {
        return this.u;
    }

    public int n() {
        return this.v;
    }

    public int o() {
        return this.t;
    }

    public long p() {
        return this.z;
    }

    public int t() {
        return this.x;
    }

    @x1
    public String toString() {
        int i = this.t;
        String format = String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", Integer.valueOf(this.w), Integer.valueOf(this.v), Integer.valueOf(this.x), i == 0 ? "Infinity" : Integer.toString(i), Integer.valueOf(this.u));
        return x() ? wo1.t("Animated ", format) : format;
    }

    public int u() {
        return this.w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeLong(this.z);
        parcel.writeLong(this.y);
    }

    public boolean x() {
        return this.x > 1 && this.u > 0;
    }

    public mx5(@x1 Resources resources, @f1 @d2 int i) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i));
    }

    public mx5(@x1 AssetManager assetManager, @x1 String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public mx5(@x1 String str) throws IOException {
        this(new GifInfoHandle(str));
    }

    public mx5(@x1 File file) throws IOException {
        this(file.getPath());
    }

    public mx5(@x1 InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream));
    }

    public mx5(@x1 AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor));
    }

    public mx5(@x1 FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor));
    }

    public mx5(@x1 byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr));
    }

    public mx5(@x1 ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer));
    }

    public mx5(@z1 ContentResolver contentResolver, @x1 Uri uri) throws IOException {
        this(GifInfoHandle.y(contentResolver, uri));
    }

    private mx5(GifInfoHandle gifInfoHandle) {
        this.t = gifInfoHandle.j();
        this.u = gifInfoHandle.g();
        this.w = gifInfoHandle.q();
        this.v = gifInfoHandle.i();
        this.x = gifInfoHandle.n();
        this.z = gifInfoHandle.k();
        this.y = gifInfoHandle.b();
        gifInfoHandle.A();
    }

    private mx5(Parcel parcel) {
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.z = parcel.readLong();
        this.y = parcel.readLong();
    }
}