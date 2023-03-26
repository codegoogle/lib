package com.iab.omid.library.ironsrc.adsession.media;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.iab.omid.library.ironsrc.d.c;
import com.iab.omid.library.ironsrc.d.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {
    private final boolean a;
    private final Float b;
    private final boolean c;
    private final Position d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.a);
            if (this.a) {
                jSONObject.put("skipOffset", this.b);
            }
            jSONObject.put(NativeAdvancedJsUtils.k, this.c);
            jSONObject.put("position", this.d);
        } catch (JSONException e) {
            c.a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.d;
    }

    public final Float getSkipOffset() {
        return this.b;
    }

    public final boolean isAutoPlay() {
        return this.c;
    }

    public final boolean isSkippable() {
        return this.a;
    }
}