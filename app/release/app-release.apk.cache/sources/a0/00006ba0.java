package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import com.p7700g.p99005.dy5;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.h95;
import com.p7700g.p99005.o31;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.rx5;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class GifInfoHandle {
    private volatile long a;

    static {
        dy5.c();
    }

    public GifInfoHandle() {
    }

    private void O(@p1(from = 0) int i) {
        int numberOfFrames = getNumberOfFrames(this.a);
        if (i < 0 || i >= numberOfFrames) {
            throw new IndexOutOfBoundsException("Frame index is not in range <0;" + numberOfFrames + h95.f);
        }
    }

    private static native void bindSurface(long j, Surface surface, long[] jArr);

    public static native int createTempNativeFileDescriptor() throws GifIOException;

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z) throws GifIOException;

    private static native void free(long j);

    private static native long getAllocationByteCount(long j);

    private static native String getComment(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getFrameDuration(long j, int i);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native long getMetadataByteCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native long getSourceLength(long j);

    private static native int getWidth(long j);

    private static native void glTexImage2D(long j, int i, int i2);

    private static native void glTexSubImage2D(long j, int i, int i2);

    private static native void initTexImageDescriptor(long j);

    private static native boolean isAnimationCompleted(long j);

    private static native boolean isOpaque(long j);

    @e2(21)
    private static int m(FileDescriptor fileDescriptor, boolean z) throws GifIOException, ErrnoException {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            return createTempNativeFileDescriptor;
        } finally {
            if (z) {
                Os.close(fileDescriptor);
            }
        }
    }

    public static native long openByteArray(byte[] bArr) throws GifIOException;

    public static native long openDirectByteBuffer(ByteBuffer byteBuffer) throws GifIOException;

    public static native long openFile(String str) throws GifIOException;

    public static native long openNativeFileDescriptor(int i, long j) throws GifIOException;

    public static native long openStream(InputStream inputStream) throws GifIOException;

    private static native void postUnbindSurface(long j);

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToFrame(long j, int i, Bitmap bitmap);

    private static native void seekToFrameGL(long j, int i);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c);

    private static native void setOptions(long j, char c, boolean z);

    private static native void setSpeedFactor(long j, float f);

    private static native void startDecoderThread(long j);

    private static native void stopDecoderThread(long j);

    private static long x(FileDescriptor fileDescriptor, long j, boolean z) throws GifIOException {
        int m;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                m = m(fileDescriptor, z);
            } catch (Exception e) {
                throw new GifIOException(rx5.OPEN_FAILED.P, e.getMessage());
            }
        } else {
            m = extractNativeFileDescriptor(fileDescriptor, z);
        }
        return openNativeFileDescriptor(m, j);
    }

    public static GifInfoHandle y(ContentResolver contentResolver, Uri uri) throws IOException {
        if (o31.b.equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return new GifInfoHandle(openAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    public synchronized void A() {
        free(this.a);
        this.a = 0L;
    }

    public synchronized long B(Bitmap bitmap) {
        return renderFrame(this.a, bitmap);
    }

    public synchronized boolean C() {
        return reset(this.a);
    }

    public synchronized long D() {
        return restoreRemainder(this.a);
    }

    public synchronized int E(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.a, jArr, bitmap);
    }

    public synchronized void F() {
        saveRemainder(this.a);
    }

    public synchronized void G(@p1(from = 0, to = 2147483647L) int i, Bitmap bitmap) {
        seekToFrame(this.a, i, bitmap);
    }

    public void H(@p1(from = 0) int i) {
        O(i);
        seekToFrameGL(this.a, i);
    }

    public synchronized void I(@p1(from = 0, to = 2147483647L) int i, Bitmap bitmap) {
        seekToTime(this.a, i, bitmap);
    }

    public void J(@p1(from = 0, to = 65535) int i) {
        if (i >= 0 && i <= 65535) {
            synchronized (this) {
                setLoopCount(this.a, (char) i);
            }
            return;
        }
        throw new IllegalArgumentException("Loop count of range <0, 65535>");
    }

    public void K(char c, boolean z) {
        setOptions(this.a, c, z);
    }

    public void L(@g1(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f && !Float.isNaN(f)) {
            if (f < 4.656613E-10f) {
                f = 4.656613E-10f;
            }
            synchronized (this) {
                setSpeedFactor(this.a, f);
            }
            return;
        }
        throw new IllegalArgumentException("Speed factor is not positive");
    }

    public void M() {
        startDecoderThread(this.a);
    }

    public void N() {
        stopDecoderThread(this.a);
    }

    public void a(Surface surface, long[] jArr) {
        bindSurface(this.a, surface, jArr);
    }

    public synchronized long b() {
        return getAllocationByteCount(this.a);
    }

    public synchronized String c() {
        return getComment(this.a);
    }

    public synchronized int d() {
        return getCurrentFrameIndex(this.a);
    }

    public synchronized int e() {
        return getCurrentLoop(this.a);
    }

    public synchronized int f() {
        return getCurrentPosition(this.a);
    }

    public void finalize() throws Throwable {
        try {
            A();
        } finally {
            super.finalize();
        }
    }

    public synchronized int g() {
        return getDuration(this.a);
    }

    public synchronized int h(@p1(from = 0) int i) {
        O(i);
        return getFrameDuration(this.a, i);
    }

    public synchronized int i() {
        return getHeight(this.a);
    }

    public synchronized int j() {
        return getLoopCount(this.a);
    }

    public synchronized long k() {
        return getMetadataByteCount(this.a);
    }

    public synchronized int l() {
        return getNativeErrorCode(this.a);
    }

    public synchronized int n() {
        return getNumberOfFrames(this.a);
    }

    public synchronized long[] o() {
        return getSavedState(this.a);
    }

    public synchronized long p() {
        return getSourceLength(this.a);
    }

    public synchronized int q() {
        return getWidth(this.a);
    }

    public void r(int i, int i2) {
        glTexImage2D(this.a, i, i2);
    }

    public void s(int i, int i2) {
        glTexSubImage2D(this.a, i, i2);
    }

    public void t() {
        initTexImageDescriptor(this.a);
    }

    public synchronized boolean u() {
        return isAnimationCompleted(this.a);
    }

    public synchronized boolean v() {
        return isOpaque(this.a);
    }

    public synchronized boolean w() {
        return this.a == 0;
    }

    public synchronized void z() {
        postUnbindSurface(this.a);
    }

    public GifInfoHandle(FileDescriptor fileDescriptor) throws GifIOException {
        this.a = x(fileDescriptor, 0L, true);
    }

    public GifInfoHandle(byte[] bArr) throws GifIOException {
        this.a = openByteArray(bArr);
    }

    public GifInfoHandle(ByteBuffer byteBuffer) throws GifIOException {
        this.a = openDirectByteBuffer(byteBuffer);
    }

    public GifInfoHandle(String str) throws GifIOException {
        this.a = openFile(str);
    }

    public GifInfoHandle(InputStream inputStream) throws GifIOException {
        if (inputStream.markSupported()) {
            this.a = openStream(inputStream);
            return;
        }
        throw new IllegalArgumentException("InputStream does not support marking");
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.a = x(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }
}