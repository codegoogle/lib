package com.p7700g.p99005;

import com.p7700g.p99005.um4;
import com.p7700g.p99005.ym4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: BaseFormProvider.java */
/* loaded from: classes3.dex */
public abstract class mt3<T extends um4<String, String>> extends av3<T> {
    public T k(T t, tm4 tm4Var, InputStream inputStream) throws IOException {
        String g = av3.g(inputStream, tm4Var);
        String name = ix3.b(tm4Var).name();
        StringTokenizer stringTokenizer = new StringTokenizer(g, "&");
        while (stringTokenizer.hasMoreTokens()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf < 0) {
                    t.d(URLDecoder.decode(nextToken, name), null);
                } else if (indexOf > 0) {
                    t.d(URLDecoder.decode(nextToken.substring(0, indexOf), name), URLDecoder.decode(nextToken.substring(indexOf + 1), name));
                }
            } catch (IllegalArgumentException e) {
                throw new lm4(e, ym4.b.BAD_REQUEST);
            }
        }
        return t;
    }

    public void l(T t, tm4 tm4Var, OutputStream outputStream) throws IOException {
        String name = ix3.b(tm4Var).name();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : t.entrySet()) {
            for (String str : (List) entry.getValue()) {
                if (sb.length() > 0) {
                    sb.append(h95.d);
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), name));
                if (str != null) {
                    sb.append('=');
                    sb.append(URLEncoder.encode(str, name));
                }
            }
        }
        av3.j(sb.toString(), outputStream, tm4Var);
    }
}