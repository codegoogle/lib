package org.xbill.DNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public class AAAARecord extends Record {
    private static final long serialVersionUID = -4588601512069748050L;
    private byte[] address;

    public AAAARecord() {
    }

    public InetAddress getAddress() {
        try {
            Name name = this.name;
            if (name == null) {
                return InetAddress.getByAddress(this.address);
            }
            return InetAddress.getByAddress(name.toString(), this.address);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new AAAARecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.address = tokenizer.getAddressBytes(2);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.address = dNSInput.readByteArray(16);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        try {
            InetAddress byAddress = InetAddress.getByAddress(null, this.address);
            if (byAddress.getAddress().length == 4) {
                StringBuffer stringBuffer = new StringBuffer("0:0:0:0:0:ffff:");
                byte[] bArr = this.address;
                int i = ((bArr[12] & 255) << 8) + (bArr[13] & 255);
                int i2 = ((bArr[14] & 255) << 8) + (bArr[15] & 255);
                stringBuffer.append(Integer.toHexString(i));
                stringBuffer.append(':');
                stringBuffer.append(Integer.toHexString(i2));
                return stringBuffer.toString();
            }
            return byAddress.getHostAddress();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeByteArray(this.address);
    }

    public AAAARecord(Name name, int i, long j, InetAddress inetAddress) {
        super(name, 28, i, j);
        if (Address.familyOf(inetAddress) == 2) {
            this.address = inetAddress.getAddress();
            return;
        }
        throw new IllegalArgumentException("invalid IPv6 address");
    }
}