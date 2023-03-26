package com.p7700g.p99005;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PathUtils.kt */
@vo4(d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\u0087\b¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010!\u001a6\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010\"\u001aK\u0010#\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010%\u001aB\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0001\u001a\r\u0010+\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010,\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a.\u0010-\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002000\u001a\"\u000200H\u0087\b¢\u0006\u0002\u00101\u001a\u001f\u0010-\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u000203H\u0087\b\u001a.\u00104\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u00105\u001a.\u00106\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u00105\u001a.\u00107\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u00105\u001a\u0015\u00108\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0087\b\u001a6\u00109\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010:\u001a\r\u0010;\u001a\u00020<*\u00020\u0002H\u0087\b\u001a\r\u0010=\u001a\u000203*\u00020\u0002H\u0087\b\u001a\u0015\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H\u0087\n\u001a\u0015\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010?\u001a\u00020\u0001H\u0087\n\u001a&\u0010@\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010B\u001a2\u0010C\u001a\u0002HD\"\n\b\u0000\u0010D\u0018\u0001*\u00020E*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010F\u001a4\u0010G\u001a\u0004\u0018\u0001HD\"\n\b\u0000\u0010D\u0018\u0001*\u00020E*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010F\u001a\r\u0010H\u001a\u00020I*\u00020\u0002H\u0087\b\u001a\r\u0010J\u001a\u00020K*\u00020\u0002H\u0087\b\u001a.\u0010L\u001a\u00020<*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u00012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020<0OH\u0087\bø\u0001\u0000\u001a0\u0010P\u001a\u0004\u0018\u00010Q*\u00020\u00022\u0006\u0010R\u001a\u00020\u00012\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010S\u001a&\u0010T\u001a\u00020U*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010V\u001a(\u0010W\u001a\u0004\u0018\u00010X*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010Y\u001a,\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010]\u001a&\u0010^\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010B\u001a\r\u0010_\u001a\u000203*\u00020\u0002H\u0087\b\u001a\r\u0010`\u001a\u000203*\u00020\u0002H\u0087\b\u001a\r\u0010a\u001a\u000203*\u00020\u0002H\u0087\b\u001a&\u0010b\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010B\u001a\u0015\u0010c\u001a\u000203*\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H\u0087\b\u001a\r\u0010d\u001a\u000203*\u00020\u0002H\u0087\b\u001a\r\u0010e\u001a\u000203*\u00020\u0002H\u0087\b\u001a\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020g*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u0001H\u0007\u001a.\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002000\u001a\"\u000200H\u0087\b¢\u0006\u0002\u00101\u001a\u001f\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u000203H\u0087\b\u001a&\u0010i\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010B\u001a2\u0010j\u001a\u0002Hk\"\n\b\u0000\u0010k\u0018\u0001*\u00020l*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010m\u001a<\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010Q0n*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010o\u001a\r\u0010p\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0016\u0010r\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0014\u0010s\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a8\u0010t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u00012\b\u0010u\u001a\u0004\u0018\u00010Q2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010v\u001a\u0015\u0010w\u001a\u00020\u0002*\u00020\u00022\u0006\u0010u\u001a\u00020UH\u0087\b\u001a\u0015\u0010x\u001a\u00020\u0002*\u00020\u00022\u0006\u0010u\u001a\u00020XH\u0087\b\u001a\u001b\u0010y\u001a\u00020\u0002*\u00020\u00022\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0087\b\u001a\r\u0010z\u001a\u00020\u0002*\u00020{H\u0087\b\u001a@\u0010|\u001a\u0002H}\"\u0004\b\u0000\u0010}*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u00012\u0018\u0010~\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u007f\u0012\u0004\u0012\u0002H}0OH\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u0080\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0081\u0001"}, d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension$annotations", "(Ljava/nio/file/Path;)V", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", "name", "getName$annotations", "getName", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "pathString", "getPathString$annotations", "getPathString", "Path", la1.k, "base", "subpaths", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "createTempDirectory", "directory", "prefix", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempFile", "suffix", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "fileAttributeViewNotAvailable", "", "attributeViewClass", "Ljava/lang/Class;", "absolute", "absolutePathString", "copyTo", "target", "options", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "overwrite", "", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "", "deleteIfExists", "div", "other", "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "fileAttributesView", bx.C4, "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "fileSize", "", "fileStore", "Ljava/nio/file/FileStore;", "forEachDirectoryEntry", "glob", "action", "Lkotlin/Function1;", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "isSymbolicLink", "isWritable", "listDirectoryEntries", "", "moveTo", "notExists", "readAttributes", bx.B4, "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "setAttribute", "value", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "setOwner", "setPosixFilePermissions", "toPath", "Ljava/net/URI;", "useDirectoryEntries", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
/* loaded from: classes3.dex */
public class vy4 extends uy4 {
    private static final String A0(Path path) {
        c25.p(path, "<this>");
        return path.toString();
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    public static /* synthetic */ void B0(Path path) {
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Set<PosixFilePermission> C0(Path path, LinkOption... linkOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        c25.o(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean D0(Path path, LinkOption... linkOptionArr) {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean E0(Path path) {
        c25.p(path, "<this>");
        return Files.isExecutable(path);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean F0(Path path) throws IOException {
        c25.p(path, "<this>");
        return Files.isHidden(path);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean G0(Path path) {
        c25.p(path, "<this>");
        return Files.isReadable(path);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path H(String str) {
        c25.p(str, la1.k);
        Path path = Paths.get(str, new String[0]);
        c25.o(path, "get(path)");
        return path;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean H0(Path path, LinkOption... linkOptionArr) {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path I(String str, String... strArr) {
        c25.p(str, "base");
        c25.p(strArr, "subpaths");
        Path path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        c25.o(path, "get(base, *subpaths)");
        return path;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean I0(Path path, Path path2) throws IOException {
        c25.p(path, "<this>");
        c25.p(path2, "other");
        return Files.isSameFile(path, path2);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path J(Path path) {
        c25.p(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        c25.o(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean J0(Path path) {
        c25.p(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final String K(Path path) {
        c25.p(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean K0(Path path) {
        c25.p(path, "<this>");
        return Files.isWritable(path);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path L(Path path, Path path2, boolean z) throws IOException {
        c25.p(path, "<this>");
        c25.p(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        c25.o(copy, "copy(this, target, *options)");
        return copy;
    }

    @dr4(markerClass = {ry4.class})
    @NotNull
    @tp4(version = "1.5")
    public static final List<Path> L0(@NotNull Path path, @NotNull String str) throws IOException {
        c25.p(path, "<this>");
        c25.p(str, "glob");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            c25.o(newDirectoryStream, "it");
            List<Path> Q5 = rs4.Q5(newDirectoryStream);
            ux4.a(newDirectoryStream, null);
            return Q5;
        } finally {
        }
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path M(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(path2, "target");
        c25.p(copyOptionArr, "options");
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        c25.o(copy, "copy(this, target, *options)");
        return copy;
    }

    public static /* synthetic */ List M0(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = tm4.g;
        }
        return L0(path, str);
    }

    public static /* synthetic */ Path N(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        c25.p(path, "<this>");
        c25.p(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        c25.o(copy, "copy(this, target, *options)");
        return copy;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path N0(Path path, Path path2, boolean z) throws IOException {
        c25.p(path, "<this>");
        c25.p(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        c25.o(move, "move(this, target, *options)");
        return move;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path O(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(fileAttributeArr, "attributes");
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createDirectories, "createDirectories(this, *attributes)");
        return createDirectories;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path O0(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(path2, "target");
        c25.p(copyOptionArr, "options");
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        c25.o(move, "move(this, target, *options)");
        return move;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path P(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(fileAttributeArr, "attributes");
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createDirectory, "createDirectory(this, *attributes)");
        return createDirectory;
    }

    public static /* synthetic */ Path P0(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        c25.p(path, "<this>");
        c25.p(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        c25.o(move, "move(this, target, *options)");
        return move;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path Q(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(fileAttributeArr, "attributes");
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createFile, "createFile(this, *attributes)");
        return createFile;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean Q0(Path path, LinkOption... linkOptionArr) {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path R(Path path, Path path2) throws IOException {
        c25.p(path, "<this>");
        c25.p(path2, "target");
        Path createLink = Files.createLink(path, path2);
        c25.o(createLink, "createLink(this, target)");
        return createLink;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final /* synthetic */ <A extends BasicFileAttributes> A R0(Path path, LinkOption... linkOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        c25.y(4, bx.B4);
        A a = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        c25.o(a, "readAttributes(this, A::class.java, *options)");
        return a;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path S(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(path2, "target");
        c25.p(fileAttributeArr, "attributes");
        Path createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return createSymbolicLink;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Map<String, Object> S0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(str, "attributes");
        c25.p(linkOptionArr, "options");
        Map<String, Object> readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        c25.o(readAttributes, "readAttributes(this, attributes, *options)");
        return readAttributes;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path T(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        c25.p(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path T0(Path path) throws IOException {
        c25.p(path, "<this>");
        Path readSymbolicLink = Files.readSymbolicLink(path);
        c25.o(readSymbolicLink, "readSymbolicLink(this)");
        return readSymbolicLink;
    }

    @dr4(markerClass = {ry4.class})
    @NotNull
    @tp4(version = "1.5")
    public static final Path U(@Nullable Path path, @Nullable String str, @NotNull FileAttribute<?>... fileAttributeArr) throws IOException {
        c25.p(fileAttributeArr, "attributes");
        if (path != null) {
            Path createTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            c25.o(createTempDirectory, "createTempDirectory(dire…ory, prefix, *attributes)");
            return createTempDirectory;
        }
        Path createTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createTempDirectory2, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory2;
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final Path U0(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "base");
        try {
            return sy4.a.a(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(((Object) e.getMessage()) + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    public static /* synthetic */ Path V(String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        c25.p(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    @Nullable
    public static final Path V0(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "base");
        try {
            return sy4.a.a(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static /* synthetic */ Path W(Path path, String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return U(path, str, fileAttributeArr);
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final Path W0(@NotNull Path path, @NotNull Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "base");
        Path V0 = V0(path, path2);
        return V0 == null ? path : V0;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path X(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        c25.p(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path X0(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(str, "attribute");
        c25.p(linkOptionArr, "options");
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        c25.o(attribute, "setAttribute(this, attribute, value, *options)");
        return attribute;
    }

    @dr4(markerClass = {ry4.class})
    @NotNull
    @tp4(version = "1.5")
    public static final Path Y(@Nullable Path path, @Nullable String str, @Nullable String str2, @NotNull FileAttribute<?>... fileAttributeArr) throws IOException {
        c25.p(fileAttributeArr, "attributes");
        if (path != null) {
            Path createTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            c25.o(createTempFile, "createTempFile(directory…fix, suffix, *attributes)");
            return createTempFile;
        }
        Path createTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createTempFile2, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile2;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path Y0(Path path, FileTime fileTime) throws IOException {
        c25.p(path, "<this>");
        c25.p(fileTime, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        c25.o(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path Z(String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        c25.p(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        c25.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path Z0(Path path, UserPrincipal userPrincipal) throws IOException {
        c25.p(path, "<this>");
        c25.p(userPrincipal, "value");
        Path owner = Files.setOwner(path, userPrincipal);
        c25.o(owner, "setOwner(this, value)");
        return owner;
    }

    public static /* synthetic */ Path a0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return Y(path, str, str2, fileAttributeArr);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path a1(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        c25.p(path, "<this>");
        c25.p(set, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, set);
        c25.o(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final void b0(Path path) throws IOException {
        c25.p(path, "<this>");
        Files.delete(path);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path b1(URI uri) {
        c25.p(uri, "<this>");
        Path path = Paths.get(uri);
        c25.o(path, "get(this)");
        return path;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean c0(Path path) throws IOException {
        c25.p(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final <T> T c1(Path path, String str, f05<? super g75<? extends Path>, ? extends T> f05Var) throws IOException {
        c25.p(path, "<this>");
        c25.p(str, "glob");
        c25.p(f05Var, "block");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            c25.o(newDirectoryStream, "it");
            T M = f05Var.M(rs4.v1(newDirectoryStream));
            z15.d(1);
            ux4.a(newDirectoryStream, null);
            z15.c(1);
            return M;
        } finally {
        }
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path d0(Path path, String str) {
        c25.p(path, "<this>");
        c25.p(str, "other");
        Path resolve = path.resolve(str);
        c25.o(resolve, "this.resolve(other)");
        return resolve;
    }

    public static /* synthetic */ Object d1(Path path, String str, f05 f05Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = tm4.g;
        }
        c25.p(path, "<this>");
        c25.p(str, "glob");
        c25.p(f05Var, "block");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            c25.o(newDirectoryStream, "it");
            Object M = f05Var.M(rs4.v1(newDirectoryStream));
            z15.d(1);
            ux4.a(newDirectoryStream, null);
            z15.c(1);
            return M;
        } finally {
        }
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path e0(Path path, Path path2) {
        c25.p(path, "<this>");
        c25.p(path2, "other");
        Path resolve = path.resolve(path2);
        c25.o(resolve, "this.resolve(other)");
        return resolve;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final boolean f0(Path path, LinkOption... linkOptionArr) {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @np4
    @NotNull
    public static final Void g0(@NotNull Path path, @NotNull Class<?> cls) {
        c25.p(path, la1.k);
        c25.p(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + '.');
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final /* synthetic */ <V extends FileAttributeView> V h0(Path path, LinkOption... linkOptionArr) {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        c25.y(4, bx.C4);
        V v = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (v != null) {
            return v;
        }
        c25.y(4, bx.C4);
        g0(path, FileAttributeView.class);
        throw new lo4();
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final /* synthetic */ <V extends FileAttributeView> V i0(Path path, LinkOption... linkOptionArr) {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        c25.y(4, bx.C4);
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final long j0(Path path) throws IOException {
        c25.p(path, "<this>");
        return Files.size(path);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final FileStore k0(Path path) throws IOException {
        c25.p(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        c25.o(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final void l0(Path path, String str, f05<? super Path, yq4> f05Var) throws IOException {
        c25.p(path, "<this>");
        c25.p(str, "glob");
        c25.p(f05Var, "action");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            c25.o(newDirectoryStream, "it");
            for (Path path2 : newDirectoryStream) {
                f05Var.M(path2);
            }
            yq4 yq4Var = yq4.a;
            z15.d(1);
            ux4.a(newDirectoryStream, null);
            z15.c(1);
        } finally {
        }
    }

    public static /* synthetic */ void m0(Path path, String str, f05 f05Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = tm4.g;
        }
        c25.p(path, "<this>");
        c25.p(str, "glob");
        c25.p(f05Var, "action");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            c25.o(newDirectoryStream, "it");
            for (Path path2 : newDirectoryStream) {
                f05Var.M(path2);
            }
            yq4 yq4Var = yq4.a;
            z15.d(1);
            ux4.a(newDirectoryStream, null);
            z15.c(1);
        } finally {
        }
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Object n0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(str, "attribute");
        c25.p(linkOptionArr, "options");
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @NotNull
    public static final String o0(@NotNull Path path) {
        c25.p(path, "<this>");
        Path fileName = path.getFileName();
        return fileName == null ? "" : c95.q5(fileName.toString(), '.', "");
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    public static /* synthetic */ void p0(Path path) {
    }

    private static final String q0(Path path) {
        c25.p(path, "<this>");
        return s0(path);
    }

    @xn4(level = zn4.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @op4(expression = "invariantSeparatorsPathString", imports = {}))
    @ry4
    @dx4
    @tp4(version = "1.4")
    public static /* synthetic */ void r0(Path path) {
    }

    @NotNull
    public static final String s0(@NotNull Path path) {
        c25.p(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (c25.g(separator, "/")) {
            return path.toString();
        }
        String obj = path.toString();
        c25.o(separator, "separator");
        return b95.k2(obj, separator, "/", false, 4, null);
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    public static /* synthetic */ void t0(Path path) {
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final FileTime u0(Path path, LinkOption... linkOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        c25.o(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @NotNull
    public static final String v0(@NotNull Path path) {
        c25.p(path, "<this>");
        Path fileName = path.getFileName();
        String obj = fileName == null ? null : fileName.toString();
        return obj == null ? "" : obj;
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    public static /* synthetic */ void w0(Path path) {
    }

    @NotNull
    public static final String x0(@NotNull Path path) {
        c25.p(path, "<this>");
        Path fileName = path.getFileName();
        return fileName == null ? "" : c95.B5(fileName.toString(), CryptoConstants.ALIAS_SEPARATOR, null, 2, null);
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    public static /* synthetic */ void y0(Path path) {
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final UserPrincipal z0(Path path, LinkOption... linkOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(linkOptionArr, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }
}