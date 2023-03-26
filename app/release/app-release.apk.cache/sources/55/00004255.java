package com.p7700g.p99005;

import android.content.res.Configuration;

/* compiled from: MultiWindowModeChangedInfo.java */
/* loaded from: classes.dex */
public final class fg {
    private final boolean a;
    private final Configuration b;

    public fg(boolean z) {
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
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.a;
    }

    @e2(26)
    public fg(boolean z, @x1 Configuration configuration) {
        this.a = z;
        this.b = configuration;
    }
}