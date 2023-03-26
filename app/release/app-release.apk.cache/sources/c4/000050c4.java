package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import com.p7700g.p99005.xm3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSReceiveReceiptRepository.java */
/* loaded from: classes3.dex */
public class ml3 {
    private static final String a = "app_id";
    private static final String b = "player_id";
    private static final String c = "device_type";

    public void a(@x1 String str, @x1 String str2, @z1 Integer num, @x1 String str3, @x1 xm3.g gVar) {
        try {
            JSONObject put = new JSONObject().put("app_id", str).put(b, str2);
            if (num != null) {
                put.put("device_type", num);
            }
            xm3.l("notifications/" + str3 + "/report_received", put, gVar);
        } catch (JSONException e) {
            jm3.b(jm3.u0.ERROR, "Generating direct receive receipt:JSON Failed.", e);
        }
    }
}