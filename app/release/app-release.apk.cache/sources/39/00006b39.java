package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public class Master {
    private int currentDClass;
    private long currentTTL;
    private int currentType;
    private long defaultTTL;
    private File file;
    private Generator generator;
    private List generators;
    private Master included;
    private Record last;
    private boolean needSOATTL;
    private boolean noExpandGenerate;
    private Name origin;
    private Tokenizer st;

    public Master(File file, Name name, long j) throws IOException {
        this.last = null;
        this.included = null;
        if (name != null && !name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        this.file = file;
        this.st = new Tokenizer(file);
        this.origin = name;
        this.defaultTTL = j;
    }

    private void endGenerate() throws IOException {
        this.st.getEOL();
        this.generator = null;
    }

    private Record nextGenerated() throws IOException {
        try {
            return this.generator.nextRecord();
        } catch (Tokenizer.TokenizerException e) {
            Tokenizer tokenizer = this.st;
            StringBuilder G = wo1.G("Parsing $GENERATE: ");
            G.append(e.getBaseMessage());
            throw tokenizer.exception(G.toString());
        } catch (TextParseException e2) {
            Tokenizer tokenizer2 = this.st;
            StringBuilder G2 = wo1.G("Parsing $GENERATE: ");
            G2.append(e2.getMessage());
            throw tokenizer2.exception(G2.toString());
        }
    }

    private Name parseName(String str, Name name) throws TextParseException {
        try {
            return Name.fromString(str, name);
        } catch (TextParseException e) {
            throw this.st.exception(e.getMessage());
        }
    }

    private void parseTTLClassAndType() throws IOException {
        boolean z;
        String string = this.st.getString();
        int value = DClass.value(string);
        this.currentDClass = value;
        if (value >= 0) {
            string = this.st.getString();
            z = true;
        } else {
            z = false;
        }
        this.currentTTL = -1L;
        try {
            this.currentTTL = TTL.parseTTL(string);
            string = this.st.getString();
        } catch (NumberFormatException unused) {
            long j = this.defaultTTL;
            if (j >= 0) {
                this.currentTTL = j;
            } else {
                Record record = this.last;
                if (record != null) {
                    this.currentTTL = record.getTTL();
                }
            }
        }
        if (!z) {
            int value2 = DClass.value(string);
            this.currentDClass = value2;
            if (value2 >= 0) {
                string = this.st.getString();
            } else {
                this.currentDClass = 1;
            }
        }
        int value3 = Type.value(string);
        this.currentType = value3;
        if (value3 >= 0) {
            if (this.currentTTL < 0) {
                if (value3 == 6) {
                    this.needSOATTL = true;
                    this.currentTTL = 0L;
                    return;
                }
                throw this.st.exception("missing TTL");
            }
            return;
        }
        Tokenizer tokenizer = this.st;
        throw tokenizer.exception("Invalid type '" + string + "'");
    }

    private long parseUInt32(String str) {
        long parseLong;
        if (Character.isDigit(str.charAt(0))) {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
            if (parseLong < 0 || parseLong > 4294967295L) {
                return -1L;
            }
            return parseLong;
        }
        return -1L;
    }

    private void startGenerate() throws IOException {
        String identifier = this.st.getIdentifier();
        int indexOf = identifier.indexOf("-");
        if (indexOf >= 0) {
            String substring = identifier.substring(0, indexOf);
            String substring2 = identifier.substring(indexOf + 1);
            String str = null;
            int indexOf2 = substring2.indexOf("/");
            if (indexOf2 >= 0) {
                str = substring2.substring(indexOf2 + 1);
                substring2 = substring2.substring(0, indexOf2);
            }
            long parseUInt32 = parseUInt32(substring);
            long parseUInt322 = parseUInt32(substring2);
            long parseUInt323 = str != null ? parseUInt32(str) : 1L;
            if (parseUInt32 >= 0 && parseUInt322 >= 0 && parseUInt32 <= parseUInt322 && parseUInt323 > 0) {
                String identifier2 = this.st.getIdentifier();
                parseTTLClassAndType();
                if (Generator.supportedType(this.currentType)) {
                    String identifier3 = this.st.getIdentifier();
                    this.st.getEOL();
                    this.st.unget();
                    this.generator = new Generator(parseUInt32, parseUInt322, parseUInt323, identifier2, this.currentType, this.currentDClass, this.currentTTL, identifier3, this.origin);
                    if (this.generators == null) {
                        this.generators = new ArrayList(1);
                    }
                    this.generators.add(this.generator);
                    return;
                }
                Tokenizer tokenizer = this.st;
                StringBuilder G = wo1.G("$GENERATE does not support ");
                G.append(Type.string(this.currentType));
                G.append(" records");
                throw tokenizer.exception(G.toString());
            }
            throw wo1.X("Invalid $GENERATE range specifier: ", identifier, this.st);
        }
        throw wo1.X("Invalid $GENERATE range specifier: ", identifier, this.st);
    }

    public Record _nextRecord() throws IOException {
        Name name;
        File file;
        Master master = this.included;
        if (master != null) {
            Record nextRecord = master.nextRecord();
            if (nextRecord != null) {
                return nextRecord;
            }
            this.included = null;
        }
        if (this.generator != null) {
            Record nextGenerated = nextGenerated();
            if (nextGenerated != null) {
                return nextGenerated;
            }
            endGenerate();
        }
        while (true) {
            Tokenizer.Token token = this.st.get(true, false);
            int i = token.type;
            if (i == 2) {
                int i2 = this.st.get().type;
                if (i2 != 1) {
                    if (i2 == 0) {
                        return null;
                    }
                    this.st.unget();
                    Record record = this.last;
                    if (record != null) {
                        name = record.getName();
                    } else {
                        throw this.st.exception("no owner");
                    }
                }
            } else if (i == 1) {
                continue;
            } else if (i == 0) {
                return null;
            } else {
                if (token.value.charAt(0) == '$') {
                    String str = token.value;
                    if (str.equalsIgnoreCase("$ORIGIN")) {
                        this.origin = this.st.getName(Name.root);
                        this.st.getEOL();
                    } else if (str.equalsIgnoreCase("$TTL")) {
                        this.defaultTTL = this.st.getTTL();
                        this.st.getEOL();
                    } else if (str.equalsIgnoreCase("$INCLUDE")) {
                        String string = this.st.getString();
                        File file2 = this.file;
                        if (file2 != null) {
                            file = new File(file2.getParent(), string);
                        } else {
                            file = new File(string);
                        }
                        Name name2 = this.origin;
                        Tokenizer.Token token2 = this.st.get();
                        if (token2.isString()) {
                            name2 = parseName(token2.value, Name.root);
                            this.st.getEOL();
                        }
                        this.included = new Master(file, name2, this.defaultTTL);
                        return nextRecord();
                    } else if (str.equalsIgnoreCase("$GENERATE")) {
                        if (this.generator == null) {
                            startGenerate();
                            if (this.noExpandGenerate) {
                                endGenerate();
                            } else {
                                return nextGenerated();
                            }
                        } else {
                            throw new IllegalStateException("cannot nest $GENERATE");
                        }
                    } else {
                        throw wo1.X("Invalid directive: ", str, this.st);
                    }
                } else {
                    name = parseName(token.value, this.origin);
                    Record record2 = this.last;
                    if (record2 != null && name.equals(record2.getName())) {
                        name = this.last.getName();
                    }
                }
            }
        }
        parseTTLClassAndType();
        Record fromString = Record.fromString(name, this.currentType, this.currentDClass, this.currentTTL, this.st, this.origin);
        this.last = fromString;
        if (this.needSOATTL) {
            long minimum = ((SOARecord) fromString).getMinimum();
            this.last.setTTL(minimum);
            this.defaultTTL = minimum;
            this.needSOATTL = false;
        }
        return this.last;
    }

    public void expandGenerate(boolean z) {
        this.noExpandGenerate = !z;
    }

    public void finalize() {
        Tokenizer tokenizer = this.st;
        if (tokenizer != null) {
            tokenizer.close();
        }
    }

    public Iterator generators() {
        List list = this.generators;
        if (list != null) {
            return Collections.unmodifiableList(list).iterator();
        }
        return Collections.EMPTY_LIST.iterator();
    }

    public Record nextRecord() throws IOException {
        try {
            Record _nextRecord = _nextRecord();
            if (_nextRecord == null) {
            }
            return _nextRecord;
        } finally {
            this.st.close();
        }
    }

    public Master(String str, Name name, long j) throws IOException {
        this(new File(str), name, j);
    }

    public Master(String str, Name name) throws IOException {
        this(new File(str), name, -1L);
    }

    public Master(String str) throws IOException {
        this(new File(str), (Name) null, -1L);
    }

    public Master(InputStream inputStream, Name name, long j) {
        this.last = null;
        this.included = null;
        if (name != null && !name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        this.st = new Tokenizer(inputStream);
        this.origin = name;
        this.defaultTTL = j;
    }

    public Master(InputStream inputStream, Name name) {
        this(inputStream, name, -1L);
    }

    public Master(InputStream inputStream) {
        this(inputStream, (Name) null, -1L);
    }
}