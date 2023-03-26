package com.p7700g.p99005;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* compiled from: JsonParser.java */
/* loaded from: classes3.dex */
public final class zv2 {
    public static uv2 d(nx2 nx2Var) throws vv2, ew2 {
        boolean r = nx2Var.r();
        nx2Var.d1(true);
        try {
            try {
                return cx2.a(nx2Var);
            } catch (OutOfMemoryError e) {
                throw new yv2("Failed parsing JSON source: " + nx2Var + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new yv2("Failed parsing JSON source: " + nx2Var + " to Json", e2);
            }
        } finally {
            nx2Var.d1(r);
        }
    }

    public static uv2 e(Reader reader) throws vv2, ew2 {
        try {
            nx2 nx2Var = new nx2(reader);
            uv2 d = d(nx2Var);
            if (!d.B() && nx2Var.Y() != px2.END_DOCUMENT) {
                throw new ew2("Did not consume the entire document.");
            }
            return d;
        } catch (rx2 e) {
            throw new ew2(e);
        } catch (IOException e2) {
            throw new vv2(e2);
        } catch (NumberFormatException e3) {
            throw new ew2(e3);
        }
    }

    public static uv2 f(String str) throws ew2 {
        return e(new StringReader(str));
    }

    @Deprecated
    public uv2 a(nx2 nx2Var) throws vv2, ew2 {
        return d(nx2Var);
    }

    @Deprecated
    public uv2 b(Reader reader) throws vv2, ew2 {
        return e(reader);
    }

    @Deprecated
    public uv2 c(String str) throws ew2 {
        return f(str);
    }
}