package org.xbill.DNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public class ARecord extends Record {
    private static final long serialVersionUID = -2172609200849142323L;
    private int addr;

    public ARecord() {
    }

    private static final int fromArray(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    private static final byte[] toArray(int i) {
        return new byte[]{(byte) ((i >>> 24) & 255), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public InetAddress getAddress() {
        try {
            Name name = this.name;
            if (name == null) {
                return InetAddress.getByAddress(toArray(this.addr));
            }
            return InetAddress.getByAddress(name.toString(), toArray(this.addr));
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new ARecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.addr = fromArray(tokenizer.getAddressBytes(1));
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.addr = fromArray(dNSInput.readByteArray(4));
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        return Address.toDottedQuad(toArray(this.addr));
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU32(this.addr & 4294967295L);
    }

    public ARecord(Name name, int i, long j, InetAddress inetAddress) {
        super(name, 1, i, j);
        if (Address.familyOf(inetAddress) == 1) {
            this.addr = fromArray(inetAddress.getAddress());
            return;
        }
        throw new IllegalArgumentException("invalid IPv4 address");
    }
}