package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.t52;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: TransportRuntimeComponent.java */
@t52(modules = {h52.class, k92.class, q42.class, o72.class, m72.class, y92.class})
@rl4
/* loaded from: classes2.dex */
public abstract class a52 implements Closeable {

    /* compiled from: TransportRuntimeComponent.java */
    @t52.a
    /* loaded from: classes2.dex */
    public interface a {
        @r52
        a a(Context context);

        a52 build();
    }

    public abstract i92 a();

    public abstract z42 b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}