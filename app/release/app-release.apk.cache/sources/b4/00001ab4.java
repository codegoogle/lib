package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import com.p7700g.p99005.z1;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public interface zai<O> {
    @z1
    O zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException;
}