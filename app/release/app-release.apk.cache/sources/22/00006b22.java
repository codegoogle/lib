package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class HINFORecord extends Record {
    private static final long serialVersionUID = -4732870630947452112L;
    private byte[] cpu;
    private byte[] os;

    public HINFORecord() {
    }

    public String getCPU() {
        return Record.byteArrayToString(this.cpu, false);
    }

    public String getOS() {
        return Record.byteArrayToString(this.os, false);
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new HINFORecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        try {
            this.cpu = Record.byteArrayFromString(tokenizer.getString());
            this.os = Record.byteArrayFromString(tokenizer.getString());
        } catch (TextParseException e) {
            throw tokenizer.exception(e.getMessage());
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.cpu = dNSInput.readCountedString();
        this.os = dNSInput.readCountedString();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Record.byteArrayToString(this.cpu, true));
        stringBuffer.append(" ");
        stringBuffer.append(Record.byteArrayToString(this.os, true));
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeCountedString(this.cpu);
        dNSOutput.writeCountedString(this.os);
    }

    public HINFORecord(Name name, int i, long j, String str, String str2) {
        super(name, 13, i, j);
        try {
            this.cpu = Record.byteArrayFromString(str);
            this.os = Record.byteArrayFromString(str2);
        } catch (TextParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}