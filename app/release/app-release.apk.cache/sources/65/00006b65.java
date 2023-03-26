package org.xbill.DNS;

import com.p7700g.p99005.qk3;
import java.io.IOException;

/* loaded from: classes4.dex */
public class SOARecord extends Record {
    private static final long serialVersionUID = 1049740098229303931L;
    private Name admin;
    private long expire;
    private Name host;
    private long minimum;
    private long refresh;
    private long retry;
    private long serial;

    public SOARecord() {
    }

    public Name getAdmin() {
        return this.admin;
    }

    public long getExpire() {
        return this.expire;
    }

    public Name getHost() {
        return this.host;
    }

    public long getMinimum() {
        return this.minimum;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new SOARecord();
    }

    public long getRefresh() {
        return this.refresh;
    }

    public long getRetry() {
        return this.retry;
    }

    public long getSerial() {
        return this.serial;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.host = tokenizer.getName(name);
        this.admin = tokenizer.getName(name);
        this.serial = tokenizer.getUInt32();
        this.refresh = tokenizer.getTTLLike();
        this.retry = tokenizer.getTTLLike();
        this.expire = tokenizer.getTTLLike();
        this.minimum = tokenizer.getTTLLike();
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.host = new Name(dNSInput);
        this.admin = new Name(dNSInput);
        this.serial = dNSInput.readU32();
        this.refresh = dNSInput.readU32();
        this.retry = dNSInput.readU32();
        this.expire = dNSInput.readU32();
        this.minimum = dNSInput.readU32();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.host);
        stringBuffer.append(" ");
        stringBuffer.append(this.admin);
        if (Options.check("multiline")) {
            stringBuffer.append(" (\n\t\t\t\t\t");
            stringBuffer.append(this.serial);
            stringBuffer.append("\t; serial\n\t\t\t\t\t");
            stringBuffer.append(this.refresh);
            stringBuffer.append("\t; refresh\n\t\t\t\t\t");
            stringBuffer.append(this.retry);
            stringBuffer.append("\t; retry\n\t\t\t\t\t");
            stringBuffer.append(this.expire);
            stringBuffer.append("\t; expire\n\t\t\t\t\t");
            stringBuffer.append(this.minimum);
            stringBuffer.append(" )\t; minimum");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(this.serial);
            stringBuffer.append(" ");
            stringBuffer.append(this.refresh);
            stringBuffer.append(" ");
            stringBuffer.append(this.retry);
            stringBuffer.append(" ");
            stringBuffer.append(this.expire);
            stringBuffer.append(" ");
            stringBuffer.append(this.minimum);
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.host.toWire(dNSOutput, compression, z);
        this.admin.toWire(dNSOutput, compression, z);
        dNSOutput.writeU32(this.serial);
        dNSOutput.writeU32(this.refresh);
        dNSOutput.writeU32(this.retry);
        dNSOutput.writeU32(this.expire);
        dNSOutput.writeU32(this.minimum);
    }

    public SOARecord(Name name, int i, long j, Name name2, Name name3, long j2, long j3, long j4, long j5, long j6) {
        super(name, 6, i, j);
        this.host = Record.checkName("host", name2);
        this.admin = Record.checkName("admin", name3);
        this.serial = Record.checkU32("serial", j2);
        this.refresh = Record.checkU32("refresh", j3);
        this.retry = Record.checkU32(qk3.a, j4);
        this.expire = Record.checkU32("expire", j5);
        this.minimum = Record.checkU32("minimum", j6);
    }
}