package org.xbill.DNS;

import java.io.IOException;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public class SSHFPRecord extends Record {
    private static final long serialVersionUID = -8104701402654687025L;
    private int alg;
    private int digestType;
    private byte[] fingerprint;

    /* loaded from: classes4.dex */
    public static class Algorithm {
        public static final int DSS = 2;
        public static final int RSA = 1;

        private Algorithm() {
        }
    }

    /* loaded from: classes4.dex */
    public static class Digest {
        public static final int SHA1 = 1;

        private Digest() {
        }
    }

    public SSHFPRecord() {
    }

    public int getAlgorithm() {
        return this.alg;
    }

    public int getDigestType() {
        return this.digestType;
    }

    public byte[] getFingerPrint() {
        return this.fingerprint;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new SSHFPRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.alg = tokenizer.getUInt8();
        this.digestType = tokenizer.getUInt8();
        this.fingerprint = tokenizer.getHex(true);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.alg = dNSInput.readU8();
        this.digestType = dNSInput.readU8();
        this.fingerprint = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.alg);
        stringBuffer.append(" ");
        stringBuffer.append(this.digestType);
        stringBuffer.append(" ");
        stringBuffer.append(base16.toString(this.fingerprint));
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(this.alg);
        dNSOutput.writeU8(this.digestType);
        dNSOutput.writeByteArray(this.fingerprint);
    }

    public SSHFPRecord(Name name, int i, long j, int i2, int i3, byte[] bArr) {
        super(name, 44, i, j);
        this.alg = Record.checkU8("alg", i2);
        this.digestType = Record.checkU8("digestType", i3);
        this.fingerprint = bArr;
    }
}