package com.p7700g.p99005;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* compiled from: CrossProcessLock.java */
/* loaded from: classes3.dex */
public class nr2 {
    private static final String a = "CrossProcessLock";
    private final FileChannel b;
    private final FileLock c;

    private nr2(FileChannel fileChannel, FileLock fileLock) {
        this.b = fileChannel;
        this.c = fileLock;
    }

    public static nr2 a(Context context, String str) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new nr2(fileChannel, fileLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            fileChannel = null;
            fileLock = null;
        }
    }

    public void b() {
        try {
            this.c.release();
            this.b.close();
        } catch (IOException unused) {
        }
    }
}