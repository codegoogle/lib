package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@x1 StringBuilder sb, @x1 HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            wo1.g0(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append(pg1.d);
            } else {
                wo1.g0(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}