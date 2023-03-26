package pl.droidsonroids.gif;

import com.p7700g.p99005.rx5;
import com.p7700g.p99005.x1;
import java.io.IOException;

/* loaded from: classes4.dex */
public class GifIOException extends IOException {
    private static final long s = 13038402904505L;
    @x1
    public final rx5 t;
    private final String u;

    public GifIOException(int i, String str) {
        this.t = rx5.b(i);
        this.u = str;
    }

    public static GifIOException b(int i) {
        if (i == rx5.NO_ERROR.P) {
            return null;
        }
        return new GifIOException(i, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.u == null) {
            return this.t.g();
        }
        return this.t.g() + ": " + this.u;
    }
}