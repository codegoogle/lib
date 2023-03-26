package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public class GenericEDNSOption extends EDNSOption {
    private byte[] data;

    public GenericEDNSOption(int i) {
        super(i);
    }

    @Override // org.xbill.DNS.EDNSOption
    public void optionFromWire(DNSInput dNSInput) throws IOException {
        this.data = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.EDNSOption
    public String optionToString() {
        StringBuilder G = wo1.G("<");
        G.append(base16.toString(this.data));
        G.append(">");
        return G.toString();
    }

    @Override // org.xbill.DNS.EDNSOption
    public void optionToWire(DNSOutput dNSOutput) {
        dNSOutput.writeByteArray(this.data);
    }

    public GenericEDNSOption(int i, byte[] bArr) {
        super(i);
        this.data = Record.checkByteArrayLength("option data", bArr, 65535);
    }
}