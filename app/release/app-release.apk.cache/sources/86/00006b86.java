package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class U16NameBase extends Record {
    private static final long serialVersionUID = -8315884183112502995L;
    public Name nameField;
    public int u16Field;

    public U16NameBase() {
    }

    public Name getNameField() {
        return this.nameField;
    }

    public int getU16Field() {
        return this.u16Field;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.u16Field = tokenizer.getUInt16();
        this.nameField = tokenizer.getName(name);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.u16Field = dNSInput.readU16();
        this.nameField = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.u16Field);
        stringBuffer.append(" ");
        stringBuffer.append(this.nameField);
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.u16Field);
        this.nameField.toWire(dNSOutput, null, z);
    }

    public U16NameBase(Name name, int i, int i2, long j) {
        super(name, i, i2, j);
    }

    public U16NameBase(Name name, int i, int i2, long j, int i3, String str, Name name2, String str2) {
        super(name, i, i2, j);
        this.u16Field = Record.checkU16(str, i3);
        this.nameField = Record.checkName(str2, name2);
    }
}