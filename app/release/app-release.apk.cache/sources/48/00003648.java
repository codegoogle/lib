package com.ironsource.sdk;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public interface f {
    void a(Activity activity, Map<String, String> map);

    void a(String str, String str2, int i);

    void a(String str, String str2, com.ironsource.sdk.j.e eVar);

    void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.c cVar);

    void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.f fVar);

    void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(Activity activity);

    void b(JSONObject jSONObject);

    void c(Activity activity);

    void c(JSONObject jSONObject);

    void d(JSONObject jSONObject);
}