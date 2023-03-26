package org.xbill.DNS;

/* loaded from: classes4.dex */
public class MXRecord extends U16NameBase {
    private static final long serialVersionUID = 2914841027584208546L;

    public MXRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return getNameField();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new MXRecord();
    }

    public int getPriority() {
        return getU16Field();
    }

    public Name getTarget() {
        return getNameField();
    }

    @Override // org.xbill.DNS.U16NameBase, org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.u16Field);
        this.nameField.toWire(dNSOutput, compression, z);
    }

    public MXRecord(Name name, int i, long j, int i2, Name name2) {
        super(name, 15, i, j, i2, "priority", name2, "target");
    }
}