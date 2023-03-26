package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.Date;
import org.xbill.DNS.DNSSEC;
import org.xbill.DNS.utils.base64;

/* loaded from: classes4.dex */
public abstract class SIGBase extends Record {
    private static final long serialVersionUID = -3738444391533812369L;
    public int alg;
    public int covered;
    public Date expire;
    public int footprint;
    public int labels;
    public long origttl;
    public byte[] signature;
    public Name signer;
    public Date timeSigned;

    public SIGBase() {
    }

    public int getAlgorithm() {
        return this.alg;
    }

    public Date getExpire() {
        return this.expire;
    }

    public int getFootprint() {
        return this.footprint;
    }

    public int getLabels() {
        return this.labels;
    }

    public long getOrigTTL() {
        return this.origttl;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public Name getSigner() {
        return this.signer;
    }

    public Date getTimeSigned() {
        return this.timeSigned;
    }

    public int getTypeCovered() {
        return this.covered;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        String string = tokenizer.getString();
        int value = Type.value(string);
        this.covered = value;
        if (value >= 0) {
            String string2 = tokenizer.getString();
            int value2 = DNSSEC.Algorithm.value(string2);
            this.alg = value2;
            if (value2 >= 0) {
                this.labels = tokenizer.getUInt8();
                this.origttl = tokenizer.getTTL();
                this.expire = FormattedTime.parse(tokenizer.getString());
                this.timeSigned = FormattedTime.parse(tokenizer.getString());
                this.footprint = tokenizer.getUInt16();
                this.signer = tokenizer.getName(name);
                this.signature = tokenizer.getBase64();
                return;
            }
            throw wo1.X("Invalid algorithm: ", string2, tokenizer);
        }
        throw wo1.X("Invalid type: ", string, tokenizer);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.covered = dNSInput.readU16();
        this.alg = dNSInput.readU8();
        this.labels = dNSInput.readU8();
        this.origttl = dNSInput.readU32();
        this.expire = new Date(dNSInput.readU32() * 1000);
        this.timeSigned = new Date(dNSInput.readU32() * 1000);
        this.footprint = dNSInput.readU16();
        this.signer = new Name(dNSInput);
        this.signature = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Type.string(this.covered));
        stringBuffer.append(" ");
        stringBuffer.append(this.alg);
        stringBuffer.append(" ");
        stringBuffer.append(this.labels);
        stringBuffer.append(" ");
        stringBuffer.append(this.origttl);
        stringBuffer.append(" ");
        if (Options.check("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(FormattedTime.format(this.expire));
        stringBuffer.append(" ");
        stringBuffer.append(FormattedTime.format(this.timeSigned));
        stringBuffer.append(" ");
        stringBuffer.append(this.footprint);
        stringBuffer.append(" ");
        stringBuffer.append(this.signer);
        if (Options.check("multiline")) {
            stringBuffer.append("\n");
            stringBuffer.append(base64.formatString(this.signature, 64, "\t", true));
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(base64.toString(this.signature));
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.covered);
        dNSOutput.writeU8(this.alg);
        dNSOutput.writeU8(this.labels);
        dNSOutput.writeU32(this.origttl);
        dNSOutput.writeU32(this.expire.getTime() / 1000);
        dNSOutput.writeU32(this.timeSigned.getTime() / 1000);
        dNSOutput.writeU16(this.footprint);
        this.signer.toWire(dNSOutput, null, z);
        dNSOutput.writeByteArray(this.signature);
    }

    public void setSignature(byte[] bArr) {
        this.signature = bArr;
    }

    public SIGBase(Name name, int i, int i2, long j, int i3, int i4, long j2, Date date, Date date2, int i5, Name name2, byte[] bArr) {
        super(name, i, i2, j);
        Type.check(i3);
        TTL.check(j2);
        this.covered = i3;
        this.alg = Record.checkU8("alg", i4);
        this.labels = name.labels() - 1;
        if (name.isWild()) {
            this.labels--;
        }
        this.origttl = j2;
        this.expire = date;
        this.timeSigned = date2;
        this.footprint = Record.checkU16("footprint", i5);
        this.signer = Record.checkName("signer", name2);
        this.signature = bArr;
    }
}