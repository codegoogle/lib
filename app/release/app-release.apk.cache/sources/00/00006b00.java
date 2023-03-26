package org.xbill.DNS;

import com.p7700g.p99005.tq4;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class DNSInput {
    private ByteBuffer byteBuffer;
    private int saved_pos = -1;
    private int saved_end = -1;

    public DNSInput(byte[] bArr) {
        this.byteBuffer = ByteBuffer.wrap(bArr);
    }

    private void require(int i) throws WireParseException {
        if (i > remaining()) {
            throw new WireParseException("end of input");
        }
    }

    public void clearActive() {
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.limit(byteBuffer.capacity());
    }

    public int current() {
        return this.byteBuffer.position();
    }

    public int getActive() {
        return this.byteBuffer.limit();
    }

    public void jump(int i) {
        if (i < this.byteBuffer.capacity()) {
            this.byteBuffer.position(i);
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.limit(byteBuffer.capacity());
            return;
        }
        throw new IllegalArgumentException("cannot jump past end of input");
    }

    public void readByteArray(byte[] bArr, int i, int i2) throws WireParseException {
        require(i2);
        this.byteBuffer.get(bArr, i, i2);
    }

    public byte[] readCountedString() throws WireParseException {
        return readByteArray(readU8());
    }

    public int readU16() throws WireParseException {
        require(2);
        return this.byteBuffer.getShort() & tq4.u;
    }

    public long readU32() throws WireParseException {
        require(4);
        return this.byteBuffer.getInt() & 4294967295L;
    }

    public int readU8() throws WireParseException {
        require(1);
        return this.byteBuffer.get() & 255;
    }

    public int remaining() {
        return this.byteBuffer.remaining();
    }

    public void restore() {
        int i = this.saved_pos;
        if (i >= 0) {
            this.byteBuffer.position(i);
            this.byteBuffer.limit(this.saved_end);
            this.saved_pos = -1;
            this.saved_end = -1;
            return;
        }
        throw new IllegalStateException("no previous state");
    }

    public void restoreActive(int i) {
        if (i <= this.byteBuffer.capacity()) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.limit(byteBuffer.position());
            return;
        }
        throw new IllegalArgumentException("cannot set active region past end of input");
    }

    public void save() {
        this.saved_pos = this.byteBuffer.position();
        this.saved_end = this.byteBuffer.limit();
    }

    public void setActive(int i) {
        if (i <= this.byteBuffer.capacity() - this.byteBuffer.position()) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.limit(byteBuffer.position() + i);
            return;
        }
        throw new IllegalArgumentException("cannot set active region past end of input");
    }

    public byte[] readByteArray(int i) throws WireParseException {
        require(i);
        byte[] bArr = new byte[i];
        this.byteBuffer.get(bArr, 0, i);
        return bArr;
    }

    public DNSInput(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    public byte[] readByteArray() {
        int remaining = remaining();
        byte[] bArr = new byte[remaining];
        this.byteBuffer.get(bArr, 0, remaining);
        return bArr;
    }
}