package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class NAPTRRecord extends Record {
    private static final long serialVersionUID = 5191232392044947002L;
    private byte[] flags;
    private int order;
    private int preference;
    private byte[] regexp;
    private Name replacement;
    private byte[] service;

    public NAPTRRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return this.replacement;
    }

    public String getFlags() {
        return Record.byteArrayToString(this.flags, false);
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NAPTRRecord();
    }

    public int getOrder() {
        return this.order;
    }

    public int getPreference() {
        return this.preference;
    }

    public String getRegexp() {
        return Record.byteArrayToString(this.regexp, false);
    }

    public Name getReplacement() {
        return this.replacement;
    }

    public String getService() {
        return Record.byteArrayToString(this.service, false);
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.order = tokenizer.getUInt16();
        this.preference = tokenizer.getUInt16();
        try {
            this.flags = Record.byteArrayFromString(tokenizer.getString());
            this.service = Record.byteArrayFromString(tokenizer.getString());
            this.regexp = Record.byteArrayFromString(tokenizer.getString());
            this.replacement = tokenizer.getName(name);
        } catch (TextParseException e) {
            throw tokenizer.exception(e.getMessage());
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.order = dNSInput.readU16();
        this.preference = dNSInput.readU16();
        this.flags = dNSInput.readCountedString();
        this.service = dNSInput.readCountedString();
        this.regexp = dNSInput.readCountedString();
        this.replacement = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.order);
        stringBuffer.append(" ");
        stringBuffer.append(this.preference);
        stringBuffer.append(" ");
        stringBuffer.append(Record.byteArrayToString(this.flags, true));
        stringBuffer.append(" ");
        stringBuffer.append(Record.byteArrayToString(this.service, true));
        stringBuffer.append(" ");
        stringBuffer.append(Record.byteArrayToString(this.regexp, true));
        stringBuffer.append(" ");
        stringBuffer.append(this.replacement);
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.order);
        dNSOutput.writeU16(this.preference);
        dNSOutput.writeCountedString(this.flags);
        dNSOutput.writeCountedString(this.service);
        dNSOutput.writeCountedString(this.regexp);
        this.replacement.toWire(dNSOutput, null, z);
    }

    public NAPTRRecord(Name name, int i, long j, int i2, int i3, String str, String str2, String str3, Name name2) {
        super(name, 35, i, j);
        this.order = Record.checkU16("order", i2);
        this.preference = Record.checkU16("preference", i3);
        try {
            this.flags = Record.byteArrayFromString(str);
            this.service = Record.byteArrayFromString(str2);
            this.regexp = Record.byteArrayFromString(str3);
            this.replacement = Record.checkName("replacement", name2);
        } catch (TextParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}