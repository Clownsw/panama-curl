// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_SIGNER_ENCODE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pCertInfo"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("hNCryptKey")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("dwKeySpec"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm"),
        Constants$root.C_POINTER$LAYOUT.withName("pvHashAuxInfo"),
        Constants$root.C_LONG$LAYOUT.withName("cAuthAttr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgAuthAttr"),
        Constants$root.C_LONG$LAYOUT.withName("cUnauthAttr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgUnauthAttr")
    ).withName("_CMSG_SIGNER_ENCODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_SIGNER_ENCODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_SIGNER_ENCODE_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_SIGNER_ENCODE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNER_ENCODE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNER_ENCODE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCertInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCertInfo"));
    public static VarHandle pCertInfo$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.pCertInfo$VH;
    }
    public static MemoryAddress pCertInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNER_ENCODE_INFO.pCertInfo$VH.get(seg);
    }
    public static void pCertInfo$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_SIGNER_ENCODE_INFO.pCertInfo$VH.set(seg, x);
    }
    public static MemoryAddress pCertInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNER_ENCODE_INFO.pCertInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCertInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_SIGNER_ENCODE_INFO.pCertInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.hCryptProv$VH;
    }
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CMSG_SIGNER_ENCODE_INFO.hCryptProv$VH.get(seg);
    }
    public static void hCryptProv$set( MemorySegment seg, long x) {
        _CMSG_SIGNER_ENCODE_INFO.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CMSG_SIGNER_ENCODE_INFO.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CMSG_SIGNER_ENCODE_INFO.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hNCryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hNCryptKey"));
    public static VarHandle hNCryptKey$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.hNCryptKey$VH;
    }
    public static long hNCryptKey$get(MemorySegment seg) {
        return (long)_CMSG_SIGNER_ENCODE_INFO.hNCryptKey$VH.get(seg);
    }
    public static void hNCryptKey$set( MemorySegment seg, long x) {
        _CMSG_SIGNER_ENCODE_INFO.hNCryptKey$VH.set(seg, x);
    }
    public static long hNCryptKey$get(MemorySegment seg, long index) {
        return (long)_CMSG_SIGNER_ENCODE_INFO.hNCryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hNCryptKey$set(MemorySegment seg, long index, long x) {
        _CMSG_SIGNER_ENCODE_INFO.hNCryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwKeySpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeySpec"));
    public static VarHandle dwKeySpec$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.dwKeySpec$VH;
    }
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)_CMSG_SIGNER_ENCODE_INFO.dwKeySpec$VH.get(seg);
    }
    public static void dwKeySpec$set( MemorySegment seg, int x) {
        _CMSG_SIGNER_ENCODE_INFO.dwKeySpec$VH.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNER_ENCODE_INFO.dwKeySpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNER_ENCODE_INFO.dwKeySpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(32, 24);
    }
    static final VarHandle pvHashAuxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvHashAuxInfo"));
    public static VarHandle pvHashAuxInfo$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.pvHashAuxInfo$VH;
    }
    public static MemoryAddress pvHashAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNER_ENCODE_INFO.pvHashAuxInfo$VH.get(seg);
    }
    public static void pvHashAuxInfo$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_SIGNER_ENCODE_INFO.pvHashAuxInfo$VH.set(seg, x);
    }
    public static MemoryAddress pvHashAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNER_ENCODE_INFO.pvHashAuxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvHashAuxInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_SIGNER_ENCODE_INFO.pvHashAuxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAuthAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAuthAttr"));
    public static VarHandle cAuthAttr$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.cAuthAttr$VH;
    }
    public static int cAuthAttr$get(MemorySegment seg) {
        return (int)_CMSG_SIGNER_ENCODE_INFO.cAuthAttr$VH.get(seg);
    }
    public static void cAuthAttr$set( MemorySegment seg, int x) {
        _CMSG_SIGNER_ENCODE_INFO.cAuthAttr$VH.set(seg, x);
    }
    public static int cAuthAttr$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNER_ENCODE_INFO.cAuthAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAuthAttr$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNER_ENCODE_INFO.cAuthAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgAuthAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgAuthAttr"));
    public static VarHandle rgAuthAttr$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.rgAuthAttr$VH;
    }
    public static MemoryAddress rgAuthAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNER_ENCODE_INFO.rgAuthAttr$VH.get(seg);
    }
    public static void rgAuthAttr$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_SIGNER_ENCODE_INFO.rgAuthAttr$VH.set(seg, x);
    }
    public static MemoryAddress rgAuthAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNER_ENCODE_INFO.rgAuthAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgAuthAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_SIGNER_ENCODE_INFO.rgAuthAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cUnauthAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cUnauthAttr"));
    public static VarHandle cUnauthAttr$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.cUnauthAttr$VH;
    }
    public static int cUnauthAttr$get(MemorySegment seg) {
        return (int)_CMSG_SIGNER_ENCODE_INFO.cUnauthAttr$VH.get(seg);
    }
    public static void cUnauthAttr$set( MemorySegment seg, int x) {
        _CMSG_SIGNER_ENCODE_INFO.cUnauthAttr$VH.set(seg, x);
    }
    public static int cUnauthAttr$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNER_ENCODE_INFO.cUnauthAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cUnauthAttr$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNER_ENCODE_INFO.cUnauthAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgUnauthAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgUnauthAttr"));
    public static VarHandle rgUnauthAttr$VH() {
        return _CMSG_SIGNER_ENCODE_INFO.rgUnauthAttr$VH;
    }
    public static MemoryAddress rgUnauthAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNER_ENCODE_INFO.rgUnauthAttr$VH.get(seg);
    }
    public static void rgUnauthAttr$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_SIGNER_ENCODE_INFO.rgUnauthAttr$VH.set(seg, x);
    }
    public static MemoryAddress rgUnauthAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_SIGNER_ENCODE_INFO.rgUnauthAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgUnauthAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_SIGNER_ENCODE_INFO.rgUnauthAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


