// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_CNG_CONTENT_DECRYPT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("ContentEncryptionAlgorithm"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnAlloc"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFree"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hNCryptKey"),
        Constants$root.C_POINTER$LAYOUT.withName("pbContentEncryptKey"),
        Constants$root.C_LONG$LAYOUT.withName("cbContentEncryptKey"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hCNGContentEncryptKey"),
        Constants$root.C_POINTER$LAYOUT.withName("pbCNGContentEncryptKeyObject")
    ).withName("_CMSG_CNG_CONTENT_DECRYPT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ContentEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    static final VarHandle pfnAlloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnAlloc"));
    public static VarHandle pfnAlloc$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH;
    }
    public static MemoryAddress pfnAlloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH.get(seg);
    }
    public static void pfnAlloc$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH.set(seg, x);
    }
    public static MemoryAddress pfnAlloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAlloc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_ALLOC pfnAlloc (MemorySegment segment, MemorySession session) {
        return PFN_CMSG_ALLOC.ofAddress(pfnAlloc$get(segment), session);
    }
    static final VarHandle pfnFree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    public static VarHandle pfnFree$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH;
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH.get(seg);
    }
    public static void pfnFree$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH.set(seg, x);
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_FREE pfnFree (MemorySegment segment, MemorySession session) {
        return PFN_CMSG_FREE.ofAddress(pfnFree$get(segment), session);
    }
    static final VarHandle hNCryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hNCryptKey"));
    public static VarHandle hNCryptKey$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH;
    }
    public static long hNCryptKey$get(MemorySegment seg) {
        return (long)_CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH.get(seg);
    }
    public static void hNCryptKey$set( MemorySegment seg, long x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH.set(seg, x);
    }
    public static long hNCryptKey$get(MemorySegment seg, long index) {
        return (long)_CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hNCryptKey$set(MemorySegment seg, long index, long x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbContentEncryptKey"));
    public static VarHandle pbContentEncryptKey$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH;
    }
    public static MemoryAddress pbContentEncryptKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH.get(seg);
    }
    public static void pbContentEncryptKey$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH.set(seg, x);
    }
    public static MemoryAddress pbContentEncryptKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbContentEncryptKey$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbContentEncryptKey"));
    public static VarHandle cbContentEncryptKey$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH;
    }
    public static int cbContentEncryptKey$get(MemorySegment seg) {
        return (int)_CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH.get(seg);
    }
    public static void cbContentEncryptKey$set( MemorySegment seg, int x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH.set(seg, x);
    }
    public static int cbContentEncryptKey$get(MemorySegment seg, long index) {
        return (int)_CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbContentEncryptKey$set(MemorySegment seg, long index, int x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCNGContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCNGContentEncryptKey"));
    public static VarHandle hCNGContentEncryptKey$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH;
    }
    public static MemoryAddress hCNGContentEncryptKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH.get(seg);
    }
    public static void hCNGContentEncryptKey$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH.set(seg, x);
    }
    public static MemoryAddress hCNGContentEncryptKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCNGContentEncryptKey$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbCNGContentEncryptKeyObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbCNGContentEncryptKeyObject"));
    public static VarHandle pbCNGContentEncryptKeyObject$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH;
    }
    public static MemoryAddress pbCNGContentEncryptKeyObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH.get(seg);
    }
    public static void pbCNGContentEncryptKeyObject$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH.set(seg, x);
    }
    public static MemoryAddress pbCNGContentEncryptKeyObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbCNGContentEncryptKeyObject$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


