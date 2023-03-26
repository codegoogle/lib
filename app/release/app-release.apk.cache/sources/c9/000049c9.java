package com.p7700g.p99005;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: classes.dex */
public class j50 implements o60 {
    @x1
    private final Context s;
    @z1
    private final String t;
    @z1
    private final File u;
    private final int v;
    @x1
    private final o60 w;
    @z1
    private c40 x;
    private boolean y;

    public j50(@x1 Context context, @z1 String str, @z1 File file, int i, @x1 o60 o60Var) {
        this.s = context;
        this.t = str;
        this.u = file;
        this.v = i;
        this.w = o60Var;
    }

    private void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.t != null) {
            channel = Channels.newChannel(this.s.getAssets().open(this.t));
        } else if (this.u != null) {
            channel = new FileInputStream(this.u).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.s.getCacheDir());
        createTempFile.deleteOnExit();
        x50.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            StringBuilder G = wo1.G("Failed to create directories for ");
            G.append(file.getAbsolutePath());
            throw new IOException(G.toString());
        } else if (createTempFile.renameTo(file)) {
        } else {
            StringBuilder G2 = wo1.G("Failed to move intermediate file (");
            G2.append(createTempFile.getAbsolutePath());
            G2.append(") to destination (");
            G2.append(file.getAbsolutePath());
            G2.append(").");
            throw new IOException(G2.toString());
        }
    }

    private void d() {
        String databaseName = getDatabaseName();
        File databasePath = this.s.getDatabasePath(databaseName);
        c40 c40Var = this.x;
        u50 u50Var = new u50(databaseName, this.s.getFilesDir(), c40Var == null || c40Var.j);
        try {
            u50Var.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else if (this.x == null) {
            } else {
                try {
                    int e2 = w50.e(databasePath);
                    int i = this.v;
                    if (e2 == i) {
                        return;
                    }
                    if (this.x.a(e2, i)) {
                        return;
                    }
                    if (this.s.deleteDatabase(databaseName)) {
                        try {
                            a(databasePath);
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException unused2) {
                }
            }
        } finally {
            u50Var.c();
        }
    }

    @Override // com.p7700g.p99005.o60
    public synchronized n60 H0() {
        if (!this.y) {
            d();
            this.y = true;
        }
        return this.w.H0();
    }

    @Override // com.p7700g.p99005.o60
    public synchronized n60 M0() {
        if (!this.y) {
            d();
            this.y = true;
        }
        return this.w.M0();
    }

    public void b(@z1 c40 c40Var) {
        this.x = c40Var;
    }

    @Override // com.p7700g.p99005.o60, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.w.close();
        this.y = false;
    }

    @Override // com.p7700g.p99005.o60
    public String getDatabaseName() {
        return this.w.getDatabaseName();
    }

    @Override // com.p7700g.p99005.o60
    @e2(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.w.setWriteAheadLoggingEnabled(z);
    }
}