package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class u50 {
    private static final Map<String, Lock> a = new HashMap();
    private final File b;
    private final Lock c;
    private final boolean d;
    private FileChannel e;

    public u50(@x1 String str, @x1 File file, boolean z) {
        File file2 = new File(file, wo1.t(str, ".lck"));
        this.b = file2;
        this.c = a(file2.getAbsolutePath());
        this.d = z;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = a;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.c.lock();
        if (this.d) {
            try {
                FileChannel channel = new FileOutputStream(this.b).getChannel();
                this.e = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.e;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.c.unlock();
    }
}