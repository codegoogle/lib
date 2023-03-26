package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiskLruCache.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t*\u0001d\u0018\u0000 w2\u00020\u00012\u00020\u0002:\u0004xyz{B9\b\u0000\u0012\u0006\u0010U\u001a\u00020Q\u0012\u0006\u0010c\u001a\u00020;\u0012\u0006\u0010]\u001a\u00020E\u0012\u0006\u0010J\u001a\u00020E\u0012\u0006\u0010D\u001a\u00020\u001a\u0012\u0006\u0010t\u001a\u00020s¢\u0006\u0004\bu\u0010vJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0005J\u001e\u0010\u0018\u001a\b\u0018\u00010\u0017R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00032\n\u0010!\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\"\u001a\u00020\u000eH\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u000e2\n\u0010(\u001a\u00060'R\u00020\u0000H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010\u0005J\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u0010J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010\u0005J\r\u0010.\u001a\u00020\u0003¢\u0006\u0004\b.\u0010\u0005J\r\u0010/\u001a\u00020\u0003¢\u0006\u0004\b/\u0010\u0005J\r\u00100\u001a\u00020\u0003¢\u0006\u0004\b0\u0010\u0005J\u0017\u00102\u001a\f\u0012\b\u0012\u00060\u0017R\u00020\u000001¢\u0006\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010D\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010@\u001a\u0004\bA\u0010 \"\u0004\bB\u0010CR\u001c\u0010J\u001a\u00020E8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010GR\u0016\u0010N\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00105R\u0016\u0010P\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00105R\u001c\u0010U\u001a\u00020Q8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b5\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010VR\"\u0010\\\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u00105\u001a\u0004\bY\u0010\u0010\"\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010GR\u0016\u0010_\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010=R\u0016\u0010a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u00105R\u0019\u0010c\u001a\u00020;8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\bF\u0010bR\u0016\u0010f\u001a\u00020d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010eR\u0016\u0010h\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010@R\u0016\u0010j\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010=R\u0016\u0010k\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010@R,\u0010p\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060'R\u00020\u00000l8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010m\u001a\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u00105¨\u0006|"}, d2 = {"Lcom/p7700g/p99005/yr5;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lcom/p7700g/p99005/yq4;", "T1", "()V", "Lcom/p7700g/p99005/tv5;", "J1", "()Lcom/p7700g/p99005/tv5;", "", "line", "Y1", "(Ljava/lang/String;)V", "K1", "", "D1", "()Z", "z", "c2", "key", "i2", com.anythink.expressad.foundation.g.a.N, "Z1", "Lcom/p7700g/p99005/yr5$d;", bx.y4, "(Ljava/lang/String;)Lcom/p7700g/p99005/yr5$d;", "", "expectedSequenceNumber", "Lcom/p7700g/p99005/yr5$b;", "K", "(Ljava/lang/String;J)Lcom/p7700g/p99005/yr5$b;", "f2", "()J", "editor", "success", bx.B4, "(Lcom/p7700g/p99005/yr5$b;Z)V", "a2", "(Ljava/lang/String;)Z", "Lcom/p7700g/p99005/yr5$c;", "entry", "b2", "(Lcom/p7700g/p99005/yr5$c;)Z", "flush", "isClosed", com.anythink.expressad.foundation.d.c.cd, "h2", "E", "U", "", "g2", "()Ljava/util/Iterator;", "R", "Z", "mostRecentRebuildFailed", "Lcom/p7700g/p99005/es5;", "T", "Lcom/p7700g/p99005/es5;", "cleanupQueue", "Ljava/io/File;", "H", "Ljava/io/File;", "journalFileBackup", "value", "J", "X0", "e2", "(J)V", "maxSize", "", "Y", AFHydra.STATUS_IDLE, "c1", "()I", "valueCount", "L", "redundantOpCount", "N", "civilizedFileSystem", "M", "hasJournalErrors", "Lcom/p7700g/p99005/st5;", bx.C4, "Lcom/p7700g/p99005/st5;", "()Lcom/p7700g/p99005/st5;", "fileSystem", "Lcom/p7700g/p99005/tv5;", "journalWriter", "P", "X", com.anythink.expressad.foundation.g.a.O, "(Z)V", "closed", "appVersion", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "journalFileTmp", "O", "initialized", "()Ljava/io/File;", "directory", "com/p7700g/p99005/yr5$e", "Lcom/p7700g/p99005/yr5$e;", "cleanupTask", "S", "nextSequenceNumber", "F", "journalFile", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "Ljava/util/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "x0", "()Ljava/util/LinkedHashMap;", "lruEntries", "Q", "mostRecentTrimFailed", "Lcom/p7700g/p99005/fs5;", "taskRunner", "<init>", "(Lcom/p7700g/p99005/st5;Ljava/io/File;IIJLcom/p7700g/p99005/fs5;)V", "D", "a", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class yr5 implements Closeable, Flushable {
    private long E;
    private final File F;
    private final File G;
    private final File H;
    private long I;
    private tv5 J;
    @NotNull
    private final LinkedHashMap<String, c> K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private long S;
    private final es5 T;
    private final e U;
    @NotNull
    private final st5 V;
    @NotNull
    private final File W;
    private final int X;
    private final int Y;
    public static final a D = new a(null);
    @cz4
    @NotNull
    public static final String s = "journal";
    @cz4
    @NotNull
    public static final String t = "journal.tmp";
    @cz4
    @NotNull
    public static final String u = rp1.u;
    @cz4
    @NotNull
    public static final String v = "libcore.io.DiskLruCache";
    @cz4
    @NotNull
    public static final String w = "1";
    @cz4
    public static final long x = -1;
    @cz4
    @NotNull
    public static final o85 y = new o85("[a-z0-9_-]{1,120}");
    @cz4
    @NotNull
    public static final String z = "CLEAN";
    @cz4
    @NotNull
    public static final String A = "DIRTY";
    @cz4
    @NotNull
    public static final String B = "REMOVE";
    @cz4
    @NotNull
    public static final String C = "READ";

    /* compiled from: DiskLruCache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\r\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"com/p7700g/p99005/yr5$a", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lcom/p7700g/p99005/o85;", "LEGAL_KEY_PATTERN", "Lcom/p7700g/p99005/o85;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0014\u001a\u00060\u000fR\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004R \u0010\u0014\u001a\u00060\u000fR\u00020\u00108\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"com/p7700g/p99005/yr5$b", "", "Lcom/p7700g/p99005/yq4;", "c", "()V", "", la1.l, "Lcom/p7700g/p99005/xw5;", com.anythink.basead.d.g.i, "(I)Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/vw5;", "f", "(I)Lcom/p7700g/p99005/vw5;", "b", "a", "Lcom/p7700g/p99005/yr5$c;", "Lcom/p7700g/p99005/yr5;", "Lcom/p7700g/p99005/yr5$c;", "d", "()Lcom/p7700g/p99005/yr5$c;", "entry", "", "Z", e31.c, "", "[Z", "e", "()[Z", "written", "<init>", "(Lcom/p7700g/p99005/yr5;Lcom/p7700g/p99005/yr5$c;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class b {
        @Nullable
        private final boolean[] a;
        private boolean b;
        @NotNull
        private final c c;
        public final /* synthetic */ yr5 d;

        /* compiled from: DiskLruCache.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/IOException;", "it", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1"}, k = 3, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a extends e25 implements f05<IOException, yq4> {
            public final /* synthetic */ int u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(1);
                b.this = r1;
                this.u = i;
            }

            @Override // com.p7700g.p99005.f05
            public /* bridge */ /* synthetic */ yq4 M(IOException iOException) {
                a(iOException);
                return yq4.a;
            }

            public final void a(@NotNull IOException iOException) {
                c25.p(iOException, "it");
                synchronized (b.this.d) {
                    b.this.c();
                    yq4 yq4Var = yq4.a;
                }
            }
        }

        public b(@NotNull yr5 yr5Var, c cVar) {
            c25.p(cVar, "entry");
            this.d = yr5Var;
            this.c = cVar;
            this.a = cVar.g() ? null : new boolean[yr5Var.c1()];
        }

        public final void a() throws IOException {
            synchronized (this.d) {
                if (!this.b) {
                    if (c25.g(this.c.b(), this)) {
                        this.d.A(this, false);
                    }
                    this.b = true;
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void b() throws IOException {
            synchronized (this.d) {
                if (!this.b) {
                    if (c25.g(this.c.b(), this)) {
                        this.d.A(this, true);
                    }
                    this.b = true;
                    yq4 yq4Var = yq4.a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void c() {
            if (c25.g(this.c.b(), this)) {
                if (this.d.N) {
                    this.d.A(this, false);
                } else {
                    this.c.q(true);
                }
            }
        }

        @NotNull
        public final c d() {
            return this.c;
        }

        @Nullable
        public final boolean[] e() {
            return this.a;
        }

        @NotNull
        public final vw5 f(int i) {
            synchronized (this.d) {
                if (!this.b) {
                    if (!c25.g(this.c.b(), this)) {
                        return jw5.b();
                    }
                    if (!this.c.g()) {
                        boolean[] zArr = this.a;
                        c25.m(zArr);
                        zArr[i] = true;
                    }
                    try {
                        return new zr5(this.d.Z().b(this.c.c().get(i)), new a(i));
                    } catch (FileNotFoundException unused) {
                        return jw5.b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        @Nullable
        public final xw5 g(int i) {
            synchronized (this.d) {
                if (!this.b) {
                    xw5 xw5Var = null;
                    if (!this.c.g() || (!c25.g(this.c.b(), this)) || this.c.i()) {
                        return null;
                    }
                    try {
                        xw5Var = this.d.Z().a(this.c.a().get(i));
                    } catch (FileNotFoundException unused) {
                    }
                    return xw5Var;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010,\u001a\u00020\u0003¢\u0006\u0004\bG\u0010HJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0018\u00010\u0014R\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\"\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010#R\u001c\u0010,\u001a\u00020\u00038\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00103\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b(\u00107\"\u0004\b8\u00109R\u001c\u0010>\u001a\u00020;8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b5\u0010=R\"\u0010@\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u00106\u001a\u0004\b-\u00107\"\u0004\b?\u00109R(\u0010F\u001a\b\u0018\u00010AR\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010B\u001a\u0004\b%\u0010C\"\u0004\bD\u0010E¨\u0006I"}, d2 = {"com/p7700g/p99005/yr5$c", "", "", "", "strings", "", "j", "(Ljava/util/List;)Ljava/lang/Void;", "", la1.l, "Lcom/p7700g/p99005/xw5;", "k", "(I)Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.d.a.b.dH, "(Ljava/util/List;)V", "Lcom/p7700g/p99005/tv5;", "writer", "s", "(Lcom/p7700g/p99005/tv5;)V", "Lcom/p7700g/p99005/yr5$d;", "Lcom/p7700g/p99005/yr5;", "r", "()Lcom/p7700g/p99005/yr5$d;", "", "h", "J", "()J", "p", "(J)V", "sequenceNumber", "", "Ljava/io/File;", "c", "Ljava/util/List;", "()Ljava/util/List;", "dirtyFiles", "b", "a", "cleanFiles", "i", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "key", com.anythink.basead.d.g.i, AFHydra.STATUS_IDLE, "f", "()I", "n", "(I)V", "lockingSourceCount", "", "e", "Z", "()Z", "q", "(Z)V", "zombie", "", "[J", "()[J", "lengths", ij3.b, "readable", "Lcom/p7700g/p99005/yr5$b;", "Lcom/p7700g/p99005/yr5$b;", "()Lcom/p7700g/p99005/yr5$b;", "l", "(Lcom/p7700g/p99005/yr5$b;)V", "currentEditor", "<init>", "(Lcom/p7700g/p99005/yr5;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class c {
        @NotNull
        private final long[] a;
        @NotNull
        private final List<File> b;
        @NotNull
        private final List<File> c;
        private boolean d;
        private boolean e;
        @Nullable
        private b f;
        private int g;
        private long h;
        @NotNull
        private final String i;
        public final /* synthetic */ yr5 j;

        /* compiled from: DiskLruCache.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"com/p7700g/p99005/yr5$c$a", "Lcom/p7700g/p99005/bw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "", "t", "Z", "closed", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a extends bw5 {
            private boolean t;
            public final /* synthetic */ xw5 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xw5 xw5Var, xw5 xw5Var2) {
                super(xw5Var2);
                c.this = r1;
                this.v = xw5Var;
            }

            @Override // com.p7700g.p99005.bw5, com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.t) {
                    return;
                }
                this.t = true;
                synchronized (c.this.j) {
                    c cVar = c.this;
                    cVar.n(cVar.f() - 1);
                    if (c.this.f() == 0 && c.this.i()) {
                        c cVar2 = c.this;
                        cVar2.j.b2(cVar2);
                    }
                    yq4 yq4Var = yq4.a;
                }
            }
        }

        public c(@NotNull yr5 yr5Var, String str) {
            c25.p(str, "key");
            this.j = yr5Var;
            this.i = str;
            this.a = new long[yr5Var.c1()];
            this.b = new ArrayList();
            this.c = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int c1 = yr5Var.c1();
            for (int i = 0; i < c1; i++) {
                sb.append(i);
                this.b.add(new File(yr5Var.Y(), sb.toString()));
                sb.append(".tmp");
                this.c.add(new File(yr5Var.Y(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void j(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final xw5 k(int i) {
            xw5 a2 = this.j.Z().a(this.b.get(i));
            if (this.j.N) {
                return a2;
            }
            this.g++;
            return new a(a2, a2);
        }

        @NotNull
        public final List<File> a() {
            return this.b;
        }

        @Nullable
        public final b b() {
            return this.f;
        }

        @NotNull
        public final List<File> c() {
            return this.c;
        }

        @NotNull
        public final String d() {
            return this.i;
        }

        @NotNull
        public final long[] e() {
            return this.a;
        }

        public final int f() {
            return this.g;
        }

        public final boolean g() {
            return this.d;
        }

        public final long h() {
            return this.h;
        }

        public final boolean i() {
            return this.e;
        }

        public final void l(@Nullable b bVar) {
            this.f = bVar;
        }

        public final void m(@NotNull List<String> list) throws IOException {
            c25.p(list, "strings");
            if (list.size() == this.j.c1()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.a[i] = Long.parseLong(list.get(i));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    j(list);
                    throw new lo4();
                }
            }
            j(list);
            throw new lo4();
        }

        public final void n(int i) {
            this.g = i;
        }

        public final void o(boolean z) {
            this.d = z;
        }

        public final void p(long j) {
            this.h = j;
        }

        public final void q(boolean z) {
            this.e = z;
        }

        @Nullable
        public final d r() {
            yr5 yr5Var = this.j;
            if (sr5.h && !Thread.holdsLock(yr5Var)) {
                StringBuilder G = wo1.G("Thread ");
                Thread currentThread = Thread.currentThread();
                c25.o(currentThread, "Thread.currentThread()");
                G.append(currentThread.getName());
                G.append(" MUST hold lock on ");
                G.append(yr5Var);
                throw new AssertionError(G.toString());
            } else if (this.d) {
                if (this.j.N || (this.f == null && !this.e)) {
                    ArrayList<xw5> arrayList = new ArrayList();
                    long[] jArr = (long[]) this.a.clone();
                    try {
                        int c1 = this.j.c1();
                        for (int i = 0; i < c1; i++) {
                            arrayList.add(k(i));
                        }
                        return new d(this.j, this.i, this.h, arrayList, jArr);
                    } catch (FileNotFoundException unused) {
                        for (xw5 xw5Var : arrayList) {
                            sr5.l(xw5Var);
                        }
                        try {
                            this.j.b2(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                return null;
            } else {
                return null;
            }
        }

        public final void s(@NotNull tv5 tv5Var) throws IOException {
            c25.p(tv5Var, "writer");
            for (long j : this.a) {
                tv5Var.g0(32).Q1(j);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"com/p7700g/p99005/yr5$d", "Ljava/io/Closeable;", "", "e", "()Ljava/lang/String;", "Lcom/p7700g/p99005/yr5$b;", "Lcom/p7700g/p99005/yr5;", "a", "()Lcom/p7700g/p99005/yr5$b;", "", la1.l, "Lcom/p7700g/p99005/xw5;", "d", "(I)Lcom/p7700g/p99005/xw5;", "", "b", "(I)J", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "s", "Ljava/lang/String;", "key", "t", "J", "sequenceNumber", "", "u", "Ljava/util/List;", ko3.f, "", com.ironsource.sdk.controller.v.a, "[J", "lengths", "<init>", "(Lcom/p7700g/p99005/yr5;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class d implements Closeable {
        private final String s;
        private final long t;
        private final List<xw5> u;
        private final long[] v;
        public final /* synthetic */ yr5 w;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull yr5 yr5Var, String str, @NotNull long j, @NotNull List<? extends xw5> list, long[] jArr) {
            c25.p(str, "key");
            c25.p(list, ko3.f);
            c25.p(jArr, "lengths");
            this.w = yr5Var;
            this.s = str;
            this.t = j;
            this.u = list;
            this.v = jArr;
        }

        @Nullable
        public final b a() throws IOException {
            return this.w.K(this.s, this.t);
        }

        public final long b(int i) {
            return this.v[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (xw5 xw5Var : this.u) {
                sr5.l(xw5Var);
            }
        }

        @NotNull
        public final xw5 d(int i) {
            return this.u.get(i);
        }

        @NotNull
        public final String e() {
            return this.s;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/yr5$e", "Lcom/p7700g/p99005/cs5;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class e extends cs5 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(str, false, 2, null);
            yr5.this = r3;
        }

        @Override // com.p7700g.p99005.cs5
        public long f() {
            synchronized (yr5.this) {
                if (!yr5.this.O || yr5.this.X()) {
                    return -1L;
                }
                try {
                    yr5.this.h2();
                } catch (IOException unused) {
                    yr5.this.Q = true;
                }
                try {
                    if (yr5.this.D1()) {
                        yr5.this.Z1();
                        yr5.this.L = 0;
                    }
                } catch (IOException unused2) {
                    yr5.this.R = true;
                    yr5.this.J = jw5.c(jw5.b());
                }
                return -1L;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class f extends e25 implements f05<IOException, yq4> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(1);
            yr5.this = r1;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(IOException iOException) {
            a(iOException);
            return yq4.a;
        }

        public final void a(@NotNull IOException iOException) {
            c25.p(iOException, "it");
            yr5 yr5Var = yr5.this;
            if (!sr5.h || Thread.holdsLock(yr5Var)) {
                yr5.this.M = true;
                return;
            }
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(yr5Var);
            throw new AssertionError(G.toString());
        }
    }

    /* compiled from: DiskLruCache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR,\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012 \r*\b\u0018\u00010\fR\u00020\u00030\fR\u00020\u00030\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"com/p7700g/p99005/yr5$g", "", "Lcom/p7700g/p99005/yr5$d;", "Lcom/p7700g/p99005/yr5;", "", "hasNext", "()Z", "a", "()Lcom/p7700g/p99005/yr5$d;", "Lcom/p7700g/p99005/yq4;", la1.b, "()V", "Lcom/p7700g/p99005/yr5$c;", "kotlin.jvm.PlatformType", "s", "Ljava/util/Iterator;", "delegate", "u", "Lcom/p7700g/p99005/yr5$d;", "removeSnapshot", "t", "nextSnapshot", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class g implements Iterator<d>, q35 {
        private final Iterator<c> s;
        private d t;
        private d u;

        public g() {
            yr5.this = r2;
            Iterator<c> it = new ArrayList(r2.x0().values()).iterator();
            c25.o(it, "ArrayList(lruEntries.values).iterator()");
            this.s = it;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: a */
        public d next() {
            if (hasNext()) {
                d dVar = this.t;
                this.u = dVar;
                this.t = null;
                c25.m(dVar);
                return dVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            d r;
            if (this.t != null) {
                return true;
            }
            synchronized (yr5.this) {
                if (yr5.this.X()) {
                    return false;
                }
                while (this.s.hasNext()) {
                    c next = this.s.next();
                    if (next != null && (r = next.r()) != null) {
                        this.t = r;
                        return true;
                    }
                }
                yq4 yq4Var = yq4.a;
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            d dVar = this.u;
            if (dVar != null) {
                try {
                    yr5.this.a2(dVar.e());
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.u = null;
                    throw th;
                }
                this.u = null;
                return;
            }
            throw new IllegalStateException("remove() before next()".toString());
        }
    }

    public yr5(@NotNull st5 st5Var, @NotNull File file, int i, int i2, long j, @NotNull fs5 fs5Var) {
        c25.p(st5Var, "fileSystem");
        c25.p(file, "directory");
        c25.p(fs5Var, "taskRunner");
        this.V = st5Var;
        this.W = file;
        this.X = i;
        this.Y = i2;
        this.E = j;
        this.K = new LinkedHashMap<>(0, 0.75f, true);
        this.T = fs5Var.j();
        this.U = new e(wo1.C(new StringBuilder(), sr5.i, " Cache"));
        if (!(j > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i2 > 0) {
            this.F = new File(file, s);
            this.G = new File(file, t);
            this.H = new File(file, u);
            return;
        }
        throw new IllegalArgumentException("valueCount <= 0".toString());
    }

    public final boolean D1() {
        int i = this.L;
        return i >= 2000 && i >= this.K.size();
    }

    private final tv5 J1() throws FileNotFoundException {
        return jw5.c(new zr5(this.V.g(this.F), new f()));
    }

    private final void K1() throws IOException {
        this.V.f(this.G);
        Iterator<c> it = this.K.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            c25.o(next, "i.next()");
            c cVar = next;
            int i = 0;
            if (cVar.b() == null) {
                int i2 = this.Y;
                while (i < i2) {
                    this.I += cVar.e()[i];
                    i++;
                }
            } else {
                cVar.l(null);
                int i3 = this.Y;
                while (i < i3) {
                    this.V.f(cVar.a().get(i));
                    this.V.f(cVar.c().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public static /* synthetic */ b P(yr5 yr5Var, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = x;
        }
        return yr5Var.K(str, j);
    }

    private final void T1() throws IOException {
        uv5 d2 = jw5.d(this.V.a(this.F));
        try {
            String m1 = d2.m1();
            String m12 = d2.m1();
            String m13 = d2.m1();
            String m14 = d2.m1();
            String m15 = d2.m1();
            if (!(!c25.g(v, m1)) && !(!c25.g(w, m12)) && !(!c25.g(String.valueOf(this.X), m13)) && !(!c25.g(String.valueOf(this.Y), m14))) {
                int i = 0;
                if (!(m15.length() > 0)) {
                    while (true) {
                        try {
                            Y1(d2.m1());
                            i++;
                        } catch (EOFException unused) {
                            this.L = i - this.K.size();
                            if (!d2.f0()) {
                                Z1();
                            } else {
                                this.J = J1();
                            }
                            yq4 yq4Var = yq4.a;
                            ux4.a(d2, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + m1 + ", " + m12 + ", " + m14 + ", " + m15 + f14.v);
        } finally {
        }
    }

    private final void Y1(String str) throws IOException {
        String substring;
        int q3 = c95.q3(str, gl4.R, 0, false, 6, null);
        if (q3 != -1) {
            int i = q3 + 1;
            int q32 = c95.q3(str, gl4.R, i, false, 4, null);
            if (q32 == -1) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                substring = str.substring(i);
                c25.o(substring, "(this as java.lang.String).substring(startIndex)");
                String str2 = B;
                if (q3 == str2.length() && b95.u2(str, str2, false, 2, null)) {
                    this.K.remove(substring);
                    return;
                }
            } else {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                substring = str.substring(i, q32);
                c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            c cVar = this.K.get(substring);
            if (cVar == null) {
                cVar = new c(this, substring);
                this.K.put(substring, cVar);
            }
            if (q32 != -1) {
                String str3 = z;
                if (q3 == str3.length() && b95.u2(str, str3, false, 2, null)) {
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = str.substring(q32 + 1);
                    c25.o(substring2, "(this as java.lang.String).substring(startIndex)");
                    List<String> S4 = c95.S4(substring2, new char[]{gl4.R}, false, 0, 6, null);
                    cVar.o(true);
                    cVar.l(null);
                    cVar.m(S4);
                    return;
                }
            }
            if (q32 == -1) {
                String str4 = A;
                if (q3 == str4.length() && b95.u2(str, str4, false, 2, null)) {
                    cVar.l(new b(this, cVar));
                    return;
                }
            }
            if (q32 == -1) {
                String str5 = C;
                if (q3 == str5.length() && b95.u2(str, str5, false, 2, null)) {
                    return;
                }
            }
            throw new IOException(wo1.t("unexpected journal line: ", str));
        }
        throw new IOException(wo1.t("unexpected journal line: ", str));
    }

    private final boolean c2() {
        for (c cVar : this.K.values()) {
            if (!cVar.i()) {
                c25.o(cVar, "toEvict");
                b2(cVar);
                return true;
            }
        }
        return false;
    }

    private final void i2(String str) {
        if (y.n(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + h95.b).toString());
    }

    private final synchronized void z() {
        if (!(!this.P)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized void A(@NotNull b bVar, boolean z2) throws IOException {
        c25.p(bVar, "editor");
        c d2 = bVar.d();
        if (c25.g(d2.b(), bVar)) {
            if (z2 && !d2.g()) {
                int i = this.Y;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] e2 = bVar.e();
                    c25.m(e2);
                    if (e2[i2]) {
                        if (!this.V.d(d2.c().get(i2))) {
                            bVar.a();
                            return;
                        }
                    } else {
                        bVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            int i3 = this.Y;
            for (int i4 = 0; i4 < i3; i4++) {
                File file = d2.c().get(i4);
                if (z2 && !d2.i()) {
                    if (this.V.d(file)) {
                        File file2 = d2.a().get(i4);
                        this.V.e(file, file2);
                        long j = d2.e()[i4];
                        long h = this.V.h(file2);
                        d2.e()[i4] = h;
                        this.I = (this.I - j) + h;
                    }
                } else {
                    this.V.f(file);
                }
            }
            d2.l(null);
            if (d2.i()) {
                b2(d2);
                return;
            }
            this.L++;
            tv5 tv5Var = this.J;
            c25.m(tv5Var);
            if (!d2.g() && !z2) {
                this.K.remove(d2.d());
                tv5Var.K0(B).g0(32);
                tv5Var.K0(d2.d());
                tv5Var.g0(10);
                tv5Var.flush();
                if (this.I <= this.E || D1()) {
                    es5.p(this.T, this.U, 0L, 2, null);
                }
                return;
            }
            d2.o(true);
            tv5Var.K0(z).g0(32);
            tv5Var.K0(d2.d());
            d2.s(tv5Var);
            tv5Var.g0(10);
            if (z2) {
                long j2 = this.S;
                this.S = 1 + j2;
                d2.p(j2);
            }
            tv5Var.flush();
            if (this.I <= this.E) {
            }
            es5.p(this.T, this.U, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void E() throws IOException {
        close();
        this.V.c(this.W);
    }

    @gz4
    @Nullable
    public final b F(@NotNull String str) throws IOException {
        return P(this, str, 0L, 2, null);
    }

    @gz4
    @Nullable
    public final synchronized b K(@NotNull String str, long j) throws IOException {
        c25.p(str, "key");
        d1();
        z();
        i2(str);
        c cVar = this.K.get(str);
        if (j == x || (cVar != null && cVar.h() == j)) {
            if ((cVar != null ? cVar.b() : null) != null) {
                return null;
            }
            if (cVar == null || cVar.f() == 0) {
                if (!this.Q && !this.R) {
                    tv5 tv5Var = this.J;
                    c25.m(tv5Var);
                    tv5Var.K0(A).g0(32).K0(str).g0(10);
                    tv5Var.flush();
                    if (this.M) {
                        return null;
                    }
                    if (cVar == null) {
                        cVar = new c(this, str);
                        this.K.put(str, cVar);
                    }
                    b bVar = new b(this, cVar);
                    cVar.l(bVar);
                    return bVar;
                }
                es5.p(this.T, this.U, 0L, 2, null);
                return null;
            }
            return null;
        }
        return null;
    }

    public final synchronized void U() throws IOException {
        c[] cVarArr;
        d1();
        Collection<c> values = this.K.values();
        c25.o(values, "lruEntries.values");
        Object[] array = values.toArray(new c[0]);
        if (array != null) {
            for (c cVar : (c[]) array) {
                c25.o(cVar, "entry");
                b2(cVar);
            }
            this.Q = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    @Nullable
    public final synchronized d W(@NotNull String str) throws IOException {
        c25.p(str, "key");
        d1();
        z();
        i2(str);
        c cVar = this.K.get(str);
        if (cVar != null) {
            c25.o(cVar, "lruEntries[key] ?: return null");
            d r = cVar.r();
            if (r != null) {
                this.L++;
                tv5 tv5Var = this.J;
                c25.m(tv5Var);
                tv5Var.K0(C).g0(32).K0(str).g0(10);
                if (D1()) {
                    es5.p(this.T, this.U, 0L, 2, null);
                }
                return r;
            }
            return null;
        }
        return null;
    }

    public final boolean X() {
        return this.P;
    }

    public final synchronized long X0() {
        return this.E;
    }

    @NotNull
    public final File Y() {
        return this.W;
    }

    @NotNull
    public final st5 Z() {
        return this.V;
    }

    public final synchronized void Z1() throws IOException {
        tv5 tv5Var = this.J;
        if (tv5Var != null) {
            tv5Var.close();
        }
        tv5 c2 = jw5.c(this.V.b(this.G));
        c2.K0(v).g0(10);
        c2.K0(w).g0(10);
        c2.Q1(this.X).g0(10);
        c2.Q1(this.Y).g0(10);
        c2.g0(10);
        for (c cVar : this.K.values()) {
            if (cVar.b() != null) {
                c2.K0(A).g0(32);
                c2.K0(cVar.d());
                c2.g0(10);
            } else {
                c2.K0(z).g0(32);
                c2.K0(cVar.d());
                cVar.s(c2);
                c2.g0(10);
            }
        }
        yq4 yq4Var = yq4.a;
        ux4.a(c2, null);
        if (this.V.d(this.F)) {
            this.V.e(this.F, this.H);
        }
        this.V.e(this.G, this.F);
        this.V.f(this.H);
        this.J = J1();
        this.M = false;
        this.R = false;
    }

    public final synchronized boolean a2(@NotNull String str) throws IOException {
        c25.p(str, "key");
        d1();
        z();
        i2(str);
        c cVar = this.K.get(str);
        if (cVar != null) {
            c25.o(cVar, "lruEntries[key] ?: return false");
            boolean b2 = b2(cVar);
            if (b2 && this.I <= this.E) {
                this.Q = false;
            }
            return b2;
        }
        return false;
    }

    public final boolean b2(@NotNull c cVar) throws IOException {
        tv5 tv5Var;
        c25.p(cVar, "entry");
        if (!this.N) {
            if (cVar.f() > 0 && (tv5Var = this.J) != null) {
                tv5Var.K0(A);
                tv5Var.g0(32);
                tv5Var.K0(cVar.d());
                tv5Var.g0(10);
                tv5Var.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b b2 = cVar.b();
        if (b2 != null) {
            b2.c();
        }
        int i = this.Y;
        for (int i2 = 0; i2 < i; i2++) {
            this.V.f(cVar.a().get(i2));
            this.I -= cVar.e()[i2];
            cVar.e()[i2] = 0;
        }
        this.L++;
        tv5 tv5Var2 = this.J;
        if (tv5Var2 != null) {
            tv5Var2.K0(B);
            tv5Var2.g0(32);
            tv5Var2.K0(cVar.d());
            tv5Var2.g0(10);
        }
        this.K.remove(cVar.d());
        if (D1()) {
            es5.p(this.T, this.U, 0L, 2, null);
        }
        return true;
    }

    public final int c1() {
        return this.Y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        c[] cVarArr;
        b b2;
        if (this.O && !this.P) {
            Collection<c> values = this.K.values();
            c25.o(values, "lruEntries.values");
            Object[] array = values.toArray(new c[0]);
            if (array != null) {
                for (c cVar : (c[]) array) {
                    if (cVar.b() != null && (b2 = cVar.b()) != null) {
                        b2.c();
                    }
                }
                h2();
                tv5 tv5Var = this.J;
                c25.m(tv5Var);
                tv5Var.close();
                this.J = null;
                this.P = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.P = true;
    }

    public final synchronized void d1() throws IOException {
        if (sr5.h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.O) {
            return;
        }
        if (this.V.d(this.H)) {
            if (this.V.d(this.F)) {
                this.V.f(this.H);
            } else {
                this.V.e(this.H, this.F);
            }
        }
        this.N = sr5.J(this.V, this.H);
        if (this.V.d(this.F)) {
            try {
                T1();
                K1();
                this.O = true;
                return;
            } catch (IOException e2) {
                au5 g2 = au5.e.g();
                g2.m("DiskLruCache " + this.W + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                E();
                this.P = false;
            }
        }
        Z1();
        this.O = true;
    }

    public final void d2(boolean z2) {
        this.P = z2;
    }

    public final synchronized void e2(long j) {
        this.E = j;
        if (this.O) {
            es5.p(this.T, this.U, 0L, 2, null);
        }
    }

    public final synchronized long f2() throws IOException {
        d1();
        return this.I;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.O) {
            z();
            h2();
            tv5 tv5Var = this.J;
            c25.m(tv5Var);
            tv5Var.flush();
        }
    }

    @NotNull
    public final synchronized Iterator<d> g2() throws IOException {
        d1();
        return new g();
    }

    public final void h2() throws IOException {
        while (this.I > this.E) {
            if (!c2()) {
                return;
            }
        }
        this.Q = false;
    }

    public final synchronized boolean isClosed() {
        return this.P;
    }

    @NotNull
    public final LinkedHashMap<String, c> x0() {
        return this.K;
    }
}