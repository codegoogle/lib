package com.p7700g.p99005;

import android.content.res.Configuration;

/* compiled from: PictureInPictureModeChangedInfo.java */
/* loaded from: classes.dex */
public final class ug {
    private final boolean a;
    private final Configuration b;

    public ug(boolean z) {
        this.a = z;
        this.b = null;
    }

    @e2(26)
    @x1
    public Configuration a() {
        Configuration configuration = this.b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.a;
    }

    @e2(26)
    public ug(boolean z, @x1 Configuration configuration) {
        this.a = z;
        this.b = configuration;
    }
}