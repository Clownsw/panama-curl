// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_LOGOTYPE_EXT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cCommunityLogo"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCommunityLogo"),
        Constants$root.C_POINTER$LAYOUT.withName("pIssuerLogo"),
        Constants$root.C_POINTER$LAYOUT.withName("pSubjectLogo"),
        Constants$root.C_LONG$LAYOUT.withName("cOtherLogo"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgOtherLogo")
    ).withName("_CERT_LOGOTYPE_EXT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_LOGOTYPE_EXT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cCommunityLogo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCommunityLogo"));
    public static VarHandle cCommunityLogo$VH() {
        return _CERT_LOGOTYPE_EXT_INFO.cCommunityLogo$VH;
    }
    public static int cCommunityLogo$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_EXT_INFO.cCommunityLogo$VH.get(seg);
    }
    public static void cCommunityLogo$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_EXT_INFO.cCommunityLogo$VH.set(seg, x);
    }
    public static int cCommunityLogo$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_EXT_INFO.cCommunityLogo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCommunityLogo$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_EXT_INFO.cCommunityLogo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCommunityLogo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCommunityLogo"));
    public static VarHandle rgCommunityLogo$VH() {
        return _CERT_LOGOTYPE_EXT_INFO.rgCommunityLogo$VH;
    }
    public static MemoryAddress rgCommunityLogo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_EXT_INFO.rgCommunityLogo$VH.get(seg);
    }
    public static void rgCommunityLogo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LOGOTYPE_EXT_INFO.rgCommunityLogo$VH.set(seg, x);
    }
    public static MemoryAddress rgCommunityLogo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_EXT_INFO.rgCommunityLogo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCommunityLogo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LOGOTYPE_EXT_INFO.rgCommunityLogo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pIssuerLogo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pIssuerLogo"));
    public static VarHandle pIssuerLogo$VH() {
        return _CERT_LOGOTYPE_EXT_INFO.pIssuerLogo$VH;
    }
    public static MemoryAddress pIssuerLogo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_EXT_INFO.pIssuerLogo$VH.get(seg);
    }
    public static void pIssuerLogo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LOGOTYPE_EXT_INFO.pIssuerLogo$VH.set(seg, x);
    }
    public static MemoryAddress pIssuerLogo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_EXT_INFO.pIssuerLogo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pIssuerLogo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LOGOTYPE_EXT_INFO.pIssuerLogo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSubjectLogo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSubjectLogo"));
    public static VarHandle pSubjectLogo$VH() {
        return _CERT_LOGOTYPE_EXT_INFO.pSubjectLogo$VH;
    }
    public static MemoryAddress pSubjectLogo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_EXT_INFO.pSubjectLogo$VH.get(seg);
    }
    public static void pSubjectLogo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LOGOTYPE_EXT_INFO.pSubjectLogo$VH.set(seg, x);
    }
    public static MemoryAddress pSubjectLogo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_EXT_INFO.pSubjectLogo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSubjectLogo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LOGOTYPE_EXT_INFO.pSubjectLogo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cOtherLogo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cOtherLogo"));
    public static VarHandle cOtherLogo$VH() {
        return _CERT_LOGOTYPE_EXT_INFO.cOtherLogo$VH;
    }
    public static int cOtherLogo$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_EXT_INFO.cOtherLogo$VH.get(seg);
    }
    public static void cOtherLogo$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_EXT_INFO.cOtherLogo$VH.set(seg, x);
    }
    public static int cOtherLogo$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_EXT_INFO.cOtherLogo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cOtherLogo$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_EXT_INFO.cOtherLogo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgOtherLogo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgOtherLogo"));
    public static VarHandle rgOtherLogo$VH() {
        return _CERT_LOGOTYPE_EXT_INFO.rgOtherLogo$VH;
    }
    public static MemoryAddress rgOtherLogo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_EXT_INFO.rgOtherLogo$VH.get(seg);
    }
    public static void rgOtherLogo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LOGOTYPE_EXT_INFO.rgOtherLogo$VH.set(seg, x);
    }
    public static MemoryAddress rgOtherLogo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_LOGOTYPE_EXT_INFO.rgOtherLogo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgOtherLogo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LOGOTYPE_EXT_INFO.rgOtherLogo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


