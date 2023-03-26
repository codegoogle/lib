package com.p7700g.p99005;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import com.p7700g.p99005.i2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DBUtil.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class w50 {
    private w50() {
    }

    @z1
    public static CancellationSignal a() {
        return new CancellationSignal();
    }

    public static void b(n60 n60Var) {
        ArrayList arrayList = new ArrayList();
        Cursor P0 = n60Var.P0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (P0.moveToNext()) {
            try {
                arrayList.add(P0.getString(0));
            } catch (Throwable th) {
                P0.close();
                throw th;
            }
        }
        P0.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                n60Var.I("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @x1
    @Deprecated
    public static Cursor c(d50 d50Var, q60 q60Var, boolean z) {
        return d(d50Var, q60Var, z, null);
    }

    @x1
    public static Cursor d(@x1 d50 d50Var, @x1 q60 q60Var, boolean z, @z1 CancellationSignal cancellationSignal) {
        Cursor w = d50Var.w(q60Var, cancellationSignal);
        if (z && (w instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) w;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? v50.a(abstractWindowedCursor) : w;
        }
        return w;
    }

    public static int e(@x1 File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                channel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}