package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class URIRecord extends Record {
    private static final long serialVersionUID = 7955422413971804232L;
    private int priority;
    private byte[] target;
    private int weight;

    public URIRecord() {
        this.target = new byte[0];
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new URIRecord();
    }

    public int getPriority() {
        return this.priority;
    }

    public String getTarget() {
        return Record.byteArrayToString(this.target, false);
    }

    public int getWeight() {
        return this.weight;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.priority = tokenizer.getUInt16();
        this.weight = tokenizer.getUInt16();
        try {
            this.target = Record.byteArrayFromString(tokenizer.getString());
        } catch (TextParseException e) {
            throw tokenizer.exception(e.getMessage());
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.priority = dNSInput.readU16();
        this.weight = dNSInput.readU16();
        this.target = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.priority + " ");
        stringBuffer.append(this.weight + " ");
        stringBuffer.append(Record.byteArrayToString(this.target, true));
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.priority);
        dNSOutput.writeU16(this.weight);
        dNSOutput.writeByteArray(this.target);
    }

    public URIRecord(Name name, int i, long j, int i2, int i3, String str) {
        super(name, 256, i, j);
        this.priority = Record.checkU16("priority", i2);
        this.weight = Record.checkU16("weight", i3);
        try {
            this.target = Record.byteArrayFromString(str);
        } catch (TextParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}