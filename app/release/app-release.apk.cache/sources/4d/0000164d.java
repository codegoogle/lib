package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import javax.annotation.Nullable;

/* compiled from: FileLocker.java */
/* loaded from: classes2.dex */
public final class p implements Closeable {
    private final FileOutputStream s;
    @Nullable
    private final FileLock t;

    private p(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.s = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.t = lock;
        } catch (Throwable th) {
            this.s.close();
            throw th;
        }
    }

    public static p a(File file) throws IOException {
        return new p(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.t;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.s.close();
        }
    }
}