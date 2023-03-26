package com.anythink.expressad.atsignalcommon.windvane;

import com.p7700g.p99005.ck3;
import com.p7700g.p99005.tm4;

/* loaded from: classes2.dex */
public enum h {
    JS(com.anythink.expressad.video.signal.a.f.a, "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", tm4.D),
    HTML(ck3.a, tm4.D);
    
    private String j;
    private String k;

    h(String str, String str2) {
        this.j = str;
        this.k = str2;
    }

    public final String a() {
        return this.j;
    }

    public final String b() {
        return this.k;
    }

    private void a(String str) {
        this.j = str;
    }

    private void b(String str) {
        this.k = str;
    }
}