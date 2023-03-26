package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class SRVRecord extends Record {
    private static final long serialVersionUID = -3886460132387522052L;
    private int port;
    private int priority;
    private Name target;
    private int weight;

    public SRVRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return this.target;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new SRVRecord();
    }

    public int getPort() {
        return this.port;
    }

    public int getPriority() {
        return this.priority;
    }

    public Name getTarget() {
        return this.target;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.priority = tokenizer.getUInt16();
        this.weight = tokenizer.getUInt16();
        this.port = tokenizer.getUInt16();
        this.target = tokenizer.getName(name);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.priority = dNSInput.readU16();
        this.weight = dNSInput.readU16();
        this.port = dNSInput.readU16();
        this.target = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.priority + " ");
        stringBuffer.append(this.weight + " ");
        stringBuffer.append(this.port + " ");
        stringBuffer.append(this.target);
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.priority);
        dNSOutput.writeU16(this.weight);
        dNSOutput.writeU16(this.port);
        this.target.toWire(dNSOutput, null, z);
    }

    public SRVRecord(Name name, int i, long j, int i2, int i3, int i4, Name name2) {
        super(name, 33, i, j);
        this.priority = Record.checkU16("priority", i2);
        this.weight = Record.checkU16("weight", i3);
        this.port = Record.checkU16("port", i4);
        this.target = Record.checkName("target", name2);
    }
}