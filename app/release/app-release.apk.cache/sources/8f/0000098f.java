package com.anythink.expressad.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.video.bt.module.AnythinkBTVideoView;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.p7700g.p99005.qm3;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private static final String c = "a";
    private static LinkedHashMap<String, AnythinkBTVideoView> e = new LinkedHashMap<>();
    private String d = "handlerNativeResult";
    public int a = 0;
    public int b = 1;

    /* renamed from: com.anythink.expressad.video.bt.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0076a {
        private static a a = new a();

        private C0076a() {
        }
    }

    public static a a() {
        return C0076a.a;
    }

    public static void a(String str, AnythinkBTVideoView anythinkBTVideoView) {
        e.put(str, anythinkBTVideoView);
    }

    public static void a(String str) {
        e.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00db A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:5:0x000b, B:7:0x0011, B:9:0x0018, B:12:0x002a, B:13:0x002e, B:15:0x0034, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0056, B:26:0x0060, B:28:0x0064, B:30:0x006a, B:32:0x0072, B:34:0x007c, B:36:0x0080, B:38:0x0086, B:40:0x008e, B:42:0x0098, B:44:0x009c, B:46:0x00a2, B:50:0x00af, B:52:0x00b6, B:54:0x00c0, B:57:0x00d2, B:60:0x00db, B:63:0x00ed, B:66:0x00f7, B:68:0x0101, B:70:0x0105, B:72:0x010b, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:83:0x0135, B:84:0x013a, B:86:0x0144, B:88:0x0148, B:90:0x014e), top: B:95:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:5:0x000b, B:7:0x0011, B:9:0x0018, B:12:0x002a, B:13:0x002e, B:15:0x0034, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0056, B:26:0x0060, B:28:0x0064, B:30:0x006a, B:32:0x0072, B:34:0x007c, B:36:0x0080, B:38:0x0086, B:40:0x008e, B:42:0x0098, B:44:0x009c, B:46:0x00a2, B:50:0x00af, B:52:0x00b6, B:54:0x00c0, B:57:0x00d2, B:60:0x00db, B:63:0x00ed, B:66:0x00f7, B:68:0x0101, B:70:0x0105, B:72:0x010b, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:83:0x0135, B:84:0x013a, B:86:0x0144, B:88:0x0148, B:90:0x014e), top: B:95:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:5:0x000b, B:7:0x0011, B:9:0x0018, B:12:0x002a, B:13:0x002e, B:15:0x0034, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:24:0x0056, B:26:0x0060, B:28:0x0064, B:30:0x006a, B:32:0x0072, B:34:0x007c, B:36:0x0080, B:38:0x0086, B:40:0x008e, B:42:0x0098, B:44:0x009c, B:46:0x00a2, B:50:0x00af, B:52:0x00b6, B:54:0x00c0, B:57:0x00d2, B:60:0x00db, B:63:0x00ed, B:66:0x00f7, B:68:0x0101, B:70:0x0105, B:72:0x010b, B:76:0x0117, B:78:0x011d, B:80:0x0123, B:83:0x0135, B:84:0x013a, B:86:0x0144, B:88:0x0148, B:90:0x014e), top: B:95:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, String str, JSONArray jSONArray) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        float f;
        AnythinkBTVideoView anythinkBTVideoView;
        float f2;
        String str2 = "";
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0 && (optJSONObject = jSONArray.optJSONObject(0)) != null) {
                    String optString = optJSONObject.optString("key");
                    int optInt = optJSONObject.optInt("type", 7);
                    if (ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID.equalsIgnoreCase(optString) && optInt == 0) {
                        str2 = optJSONObject.optString("value");
                    }
                }
            } catch (Throwable th) {
                n.a(c, th.getMessage());
                int i = this.b;
                a(i, "exception：" + th.getMessage(), obj);
                return;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            a(this.b, "instanceId find error", obj);
        } else if (!e.containsKey(str2)) {
            a(this.b, "can not find player", obj);
        } else if ("play".equalsIgnoreCase(str)) {
            AnythinkBTVideoView anythinkBTVideoView2 = e.get(str2);
            if (anythinkBTVideoView2 != null) {
                anythinkBTVideoView2.play();
            } else {
                a(this.b, "player is null", obj);
            }
        } else if (com.anythink.expressad.foundation.d.c.bZ.equalsIgnoreCase(str)) {
            AnythinkBTVideoView anythinkBTVideoView3 = e.get(str2);
            if (anythinkBTVideoView3 != null) {
                anythinkBTVideoView3.pause();
            } else {
                a(this.b, "player is null", obj);
            }
        } else if ("stop".equalsIgnoreCase(str)) {
            AnythinkBTVideoView anythinkBTVideoView4 = e.get(str2);
            if (anythinkBTVideoView4 != null) {
                anythinkBTVideoView4.stop();
            } else {
                a(this.b, "player is null", obj);
            }
        } else if (NativeAdvancedJsUtils.h.equalsIgnoreCase(str)) {
            float f3 = 0.0f;
            if (jSONArray != null && jSONArray.length() > 2) {
                JSONObject optJSONObject3 = jSONArray.optJSONObject(1);
                JSONObject optJSONObject4 = jSONArray.optJSONObject(2);
                if (optJSONObject3 != null) {
                    String optString2 = optJSONObject3.optString("key");
                    int optInt2 = optJSONObject3.optInt("type", 7);
                    if ("leftVolume".equalsIgnoreCase(optString2) && optInt2 == 3) {
                        f2 = (float) optJSONObject3.optDouble("value");
                        if (optJSONObject4 != null) {
                            String optString3 = optJSONObject4.optString("key");
                            int optInt3 = optJSONObject4.optInt("type", 7);
                            if ("rightVolume".equalsIgnoreCase(optString3) && optInt3 == 3) {
                                f = (float) optJSONObject4.optDouble("value");
                                f3 = f2;
                                anythinkBTVideoView = e.get(str2);
                                if (anythinkBTVideoView == null) {
                                    anythinkBTVideoView.setVolume(f3, f);
                                    return;
                                } else {
                                    a(this.b, "player is null", obj);
                                    return;
                                }
                            }
                        }
                        f3 = f2;
                    }
                }
                f2 = 0.0f;
                if (optJSONObject4 != null) {
                }
                f3 = f2;
            }
            f = 0.0f;
            anythinkBTVideoView = e.get(str2);
            if (anythinkBTVideoView == null) {
            }
        } else if ("setPlaybackParams".equalsIgnoreCase(str)) {
            float f4 = 1.0f;
            if (jSONArray != null && jSONArray.length() > 1 && (optJSONObject2 = jSONArray.optJSONObject(1)) != null) {
                String optString4 = optJSONObject2.optString("key");
                int optInt4 = optJSONObject2.optInt("type", 7);
                if ("speed".equalsIgnoreCase(optString4) && optInt4 == 3) {
                    f4 = (float) optJSONObject2.optDouble("value");
                }
            }
            AnythinkBTVideoView anythinkBTVideoView5 = e.get(str2);
            if (anythinkBTVideoView5 != null) {
                anythinkBTVideoView5.setPlaybackParams(f4);
            } else {
                a(this.b, "player is null", obj);
            }
        } else {
            a(this.b, "method not found", obj);
        }
    }

    private static void a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put(qm3.b.j, str);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e2) {
            n.a(c, e2.getMessage());
        } catch (Throwable th) {
            n.a(c, th.getMessage());
        }
    }
}