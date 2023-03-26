package org.xbill.DNS;

/* loaded from: classes4.dex */
public class NSIDOption extends GenericEDNSOption {
    private static final long serialVersionUID = 74739759292589056L;

    public NSIDOption() {
        super(3);
    }

    public NSIDOption(byte[] bArr) {
        super(3, bArr);
    }
}