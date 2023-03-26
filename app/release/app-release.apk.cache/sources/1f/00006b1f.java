package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class GPOSRecord extends Record {
    private static final long serialVersionUID = -6349714958085750705L;
    private byte[] altitude;
    private byte[] latitude;
    private byte[] longitude;

    public GPOSRecord() {
    }

    private void validate(double d, double d2) throws IllegalArgumentException {
        if (d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("illegal longitude " + d);
        } else if (d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("illegal latitude " + d2);
        }
    }

    public double getAltitude() {
        return Double.parseDouble(getAltitudeString());
    }

    public String getAltitudeString() {
        return Record.byteArrayToString(this.altitude, false);
    }

    public double getLatitude() {
        return Double.parseDouble(getLatitudeString());
    }

    public String getLatitudeString() {
        return Record.byteArrayToString(this.latitude, false);
    }

    public double getLongitude() {
        return Double.parseDouble(getLongitudeString());
    }

    public String getLongitudeString() {
        return Record.byteArrayToString(this.longitude, false);
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new GPOSRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        try {
            this.longitude = Record.byteArrayFromString(tokenizer.getString());
            this.latitude = Record.byteArrayFromString(tokenizer.getString());
            this.altitude = Record.byteArrayFromString(tokenizer.getString());
            try {
                validate(getLongitude(), getLatitude());
            } catch (IllegalArgumentException e) {
                throw new WireParseException(e.getMessage());
            }
        } catch (TextParseException e2) {
            throw tokenizer.exception(e2.getMessage());
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.longitude = dNSInput.readCountedString();
        this.latitude = dNSInput.readCountedString();
        this.altitude = dNSInput.readCountedString();
        try {
            validate(getLongitude(), getLatitude());
        } catch (IllegalArgumentException e) {
            throw new WireParseException(e.getMessage());
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Record.byteArrayToString(this.longitude, true));
        stringBuffer.append(" ");
        stringBuffer.append(Record.byteArrayToString(this.latitude, true));
        stringBuffer.append(" ");
        stringBuffer.append(Record.byteArrayToString(this.altitude, true));
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeCountedString(this.longitude);
        dNSOutput.writeCountedString(this.latitude);
        dNSOutput.writeCountedString(this.altitude);
    }

    public GPOSRecord(Name name, int i, long j, double d, double d2, double d3) {
        super(name, 27, i, j);
        validate(d, d2);
        this.longitude = Double.toString(d).getBytes();
        this.latitude = Double.toString(d2).getBytes();
        this.altitude = Double.toString(d3).getBytes();
    }

    public GPOSRecord(Name name, int i, long j, String str, String str2, String str3) {
        super(name, 27, i, j);
        try {
            this.longitude = Record.byteArrayFromString(str);
            this.latitude = Record.byteArrayFromString(str2);
            validate(getLongitude(), getLatitude());
            this.altitude = Record.byteArrayFromString(str3);
        } catch (TextParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}