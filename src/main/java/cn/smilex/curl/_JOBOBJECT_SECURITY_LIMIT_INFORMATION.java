// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _JOBOBJECT_SECURITY_LIMIT_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SecurityLimitFlags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("JobToken"),
        Constants$root.C_POINTER$LAYOUT.withName("SidsToDisable"),
        Constants$root.C_POINTER$LAYOUT.withName("PrivilegesToDelete"),
        Constants$root.C_POINTER$LAYOUT.withName("RestrictedSids")
    ).withName("_JOBOBJECT_SECURITY_LIMIT_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle SecurityLimitFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityLimitFlags"));
    public static VarHandle SecurityLimitFlags$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH;
    }
    public static int SecurityLimitFlags$get(MemorySegment seg) {
        return (int)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH.get(seg);
    }
    public static void SecurityLimitFlags$set( MemorySegment seg, int x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH.set(seg, x);
    }
    public static int SecurityLimitFlags$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityLimitFlags$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SecurityLimitFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobToken$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobToken"));
    public static VarHandle JobToken$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH;
    }
    public static MemoryAddress JobToken$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH.get(seg);
    }
    public static void JobToken$set( MemorySegment seg, MemoryAddress x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH.set(seg, x);
    }
    public static MemoryAddress JobToken$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobToken$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.JobToken$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SidsToDisable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SidsToDisable"));
    public static VarHandle SidsToDisable$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH;
    }
    public static MemoryAddress SidsToDisable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH.get(seg);
    }
    public static void SidsToDisable$set( MemorySegment seg, MemoryAddress x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH.set(seg, x);
    }
    public static MemoryAddress SidsToDisable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SidsToDisable$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.SidsToDisable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PrivilegesToDelete$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrivilegesToDelete"));
    public static VarHandle PrivilegesToDelete$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH;
    }
    public static MemoryAddress PrivilegesToDelete$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH.get(seg);
    }
    public static void PrivilegesToDelete$set( MemorySegment seg, MemoryAddress x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH.set(seg, x);
    }
    public static MemoryAddress PrivilegesToDelete$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrivilegesToDelete$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.PrivilegesToDelete$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RestrictedSids$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RestrictedSids"));
    public static VarHandle RestrictedSids$VH() {
        return _JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH;
    }
    public static MemoryAddress RestrictedSids$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH.get(seg);
    }
    public static void RestrictedSids$set( MemorySegment seg, MemoryAddress x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH.set(seg, x);
    }
    public static MemoryAddress RestrictedSids$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RestrictedSids$set(MemorySegment seg, long index, MemoryAddress x) {
        _JOBOBJECT_SECURITY_LIMIT_INFORMATION.RestrictedSids$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

