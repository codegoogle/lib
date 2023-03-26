package org.xbill.DNS;

import com.p7700g.p99005.gl4;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public class NSEC3PARAMRecord extends Record {
    private static final long serialVersionUID = -8689038598776316533L;
    private int flags;
    private int hashAlg;
    private int iterations;
    private byte[] salt;

    public NSEC3PARAMRecord() {
    }

    public int getFlags() {
        return this.flags;
    }

    public int getHashAlgorithm() {
        return this.hashAlg;
    }

    public int getIterations() {
        return this.iterations;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NSEC3PARAMRecord();
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public byte[] hashName(Name name) throws NoSuchAlgorithmException {
        return NSEC3Record.hashName(name, this.hashAlg, this.iterations, this.salt);
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.hashAlg = tokenizer.getUInt8();
        this.flags = tokenizer.getUInt8();
        this.iterations = tokenizer.getUInt16();
        if (tokenizer.getString().equals("-")) {
            this.salt = null;
            return;
        }
        tokenizer.unget();
        byte[] hexString = tokenizer.getHexString();
        this.salt = hexString;
        if (hexString.length > 255) {
            throw tokenizer.exception("salt value too long");
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.hashAlg = dNSInput.readU8();
        this.flags = dNSInput.readU8();
        this.iterations = dNSInput.readU16();
        int readU8 = dNSInput.readU8();
        if (readU8 > 0) {
            this.salt = dNSInput.readByteArray(readU8);
        } else {
            this.salt = null;
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.hashAlg);
        stringBuffer.append(gl4.R);
        stringBuffer.append(this.flags);
        stringBuffer.append(gl4.R);
        stringBuffer.append(this.iterations);
        stringBuffer.append(gl4.R);
        byte[] bArr = this.salt;
        if (bArr == null) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append(base16.toString(bArr));
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(this.hashAlg);
        dNSOutput.writeU8(this.flags);
        dNSOutput.writeU16(this.iterations);
        byte[] bArr = this.salt;
        if (bArr != null) {
            dNSOutput.writeU8(bArr.length);
            dNSOutput.writeByteArray(this.salt);
            return;
        }
        dNSOutput.writeU8(0);
    }

    public NSEC3PARAMRecord(Name name, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        super(name, 51, i, j);
        this.hashAlg = Record.checkU8("hashAlg", i2);
        this.flags = Record.checkU8("flags", i3);
        this.iterations = Record.checkU16("iterations", i4);
        if (bArr != null) {
            if (bArr.length <= 255) {
                if (bArr.length > 0) {
                    byte[] bArr2 = new byte[bArr.length];
                    this.salt = bArr2;
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid salt length");
        }
    }
}