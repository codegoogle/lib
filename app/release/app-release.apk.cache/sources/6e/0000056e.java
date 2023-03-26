package com.anythink.core.api;

import com.anythink.core.common.b.g;

@Deprecated
/* loaded from: classes2.dex */
public enum AreaCode {
    GLOBAL(g.d.a),
    CHINESE_MAINLAND(g.d.b);
    
    private int areaCode;

    AreaCode(int i) {
        this.areaCode = i;
    }

    public final int getAreaCode() {
        return this.areaCode;
    }

    public final void setAreaCode(int i) {
        this.areaCode = i;
    }
}