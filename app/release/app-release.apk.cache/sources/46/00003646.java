package com.ironsource.sdk.e.a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.g.f;
import com.ironsource.sdk.utils.SDKUtils;
import com.p7700g.p99005.wo1;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public static final String a = Omid.getVersion();
    public final Partner b = Partner.createPartner("Ironsrc", "7");
    public boolean d = false;
    public final HashMap<String, AdSession> c = new HashMap<>();

    /* renamed from: com.ironsource.sdk.e.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0129a {
        public boolean a;
        public Owner b;
        public Owner c;
        public String d;
        public ImpressionType e;
        public CreativeType f;
        public String g;
        private Owner h;

        public static C0129a a(JSONObject jSONObject) {
            C0129a c0129a = new C0129a();
            c0129a.a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException("Missing OMID impressionOwner");
            }
            try {
                c0129a.b = Owner.valueOf(optString.toUpperCase());
                String optString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(optString)) {
                    throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                }
                try {
                    c0129a.c = Owner.valueOf(optString2.toUpperCase());
                    c0129a.d = jSONObject.optString("customReferenceData", "");
                    c0129a.f = c(jSONObject);
                    c0129a.e = b(jSONObject);
                    String optString3 = jSONObject.optString("adViewId", "");
                    if (TextUtils.isEmpty(optString3)) {
                        throw new IllegalArgumentException(wo1.s("Missing adview id in OMID params", optString3));
                    }
                    c0129a.g = optString3;
                    c0129a.h = d(jSONObject);
                    return c0129a;
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException(wo1.s("Invalid OMID videoEventsOwner ", optString2));
                }
            } catch (IllegalArgumentException unused2) {
                throw new IllegalArgumentException(wo1.s("Invalid OMID impressionOwner ", optString));
            }
        }

        private static ImpressionType b(JSONObject jSONObject) {
            String optString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(wo1.s("Missing OMID creativeType", optString));
            }
            ImpressionType[] values = ImpressionType.values();
            for (int i = 0; i < 8; i++) {
                ImpressionType impressionType = values[i];
                if (optString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(wo1.s("Missing OMID creativeType", optString));
        }

        private static CreativeType c(JSONObject jSONObject) {
            String optString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(wo1.s("Missing OMID creativeType", optString));
            }
            CreativeType[] values = CreativeType.values();
            for (int i = 0; i < 5; i++) {
                CreativeType creativeType = values[i];
                if (optString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(wo1.s("Missing OMID creativeType", optString));
        }

        private static Owner d(JSONObject jSONObject) {
            String optString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(optString.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return owner;
            }
        }
    }

    public final f a() {
        f fVar = new f();
        fVar.a("omidVersion", SDKUtils.encodeString(a));
        fVar.a("omidPartnerName", SDKUtils.encodeString("Ironsrc"));
        fVar.a("omidPartnerVersion", SDKUtils.encodeString("7"));
        fVar.a("omidActiveAdSessions", SDKUtils.encodeString(Arrays.toString(this.c.keySet().toArray())));
        return fVar;
    }

    public void a(JSONObject jSONObject) {
        if (!this.d) {
            throw new IllegalStateException("OMID has not been activated");
        }
        if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}