// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MIDL_INTERCEPTION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ProcString"),
        Constants$root.C_POINTER$LAYOUT.withName("ProcFormatOffsetTable"),
        Constants$root.C_LONG$LAYOUT.withName("ProcCount"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("TypeString")
    ).withName("_MIDL_INTERCEPTION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_INTERCEPTION_INFO.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _MIDL_INTERCEPTION_INFO.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_MIDL_INTERCEPTION_INFO.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _MIDL_INTERCEPTION_INFO.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_MIDL_INTERCEPTION_INFO.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _MIDL_INTERCEPTION_INFO.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcString"));
    public static VarHandle ProcString$VH() {
        return _MIDL_INTERCEPTION_INFO.ProcString$VH;
    }
    public static MemoryAddress ProcString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_INTERCEPTION_INFO.ProcString$VH.get(seg);
    }
    public static void ProcString$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_INTERCEPTION_INFO.ProcString$VH.set(seg, x);
    }
    public static MemoryAddress ProcString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_INTERCEPTION_INFO.ProcString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcString$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_INTERCEPTION_INFO.ProcString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcFormatOffsetTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcFormatOffsetTable"));
    public static VarHandle ProcFormatOffsetTable$VH() {
        return _MIDL_INTERCEPTION_INFO.ProcFormatOffsetTable$VH;
    }
    public static MemoryAddress ProcFormatOffsetTable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_INTERCEPTION_INFO.ProcFormatOffsetTable$VH.get(seg);
    }
    public static void ProcFormatOffsetTable$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_INTERCEPTION_INFO.ProcFormatOffsetTable$VH.set(seg, x);
    }
    public static MemoryAddress ProcFormatOffsetTable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_INTERCEPTION_INFO.ProcFormatOffsetTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcFormatOffsetTable$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_INTERCEPTION_INFO.ProcFormatOffsetTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcCount"));
    public static VarHandle ProcCount$VH() {
        return _MIDL_INTERCEPTION_INFO.ProcCount$VH;
    }
    public static int ProcCount$get(MemorySegment seg) {
        return (int)_MIDL_INTERCEPTION_INFO.ProcCount$VH.get(seg);
    }
    public static void ProcCount$set( MemorySegment seg, int x) {
        _MIDL_INTERCEPTION_INFO.ProcCount$VH.set(seg, x);
    }
    public static int ProcCount$get(MemorySegment seg, long index) {
        return (int)_MIDL_INTERCEPTION_INFO.ProcCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcCount$set(MemorySegment seg, long index, int x) {
        _MIDL_INTERCEPTION_INFO.ProcCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TypeString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TypeString"));
    public static VarHandle TypeString$VH() {
        return _MIDL_INTERCEPTION_INFO.TypeString$VH;
    }
    public static MemoryAddress TypeString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_INTERCEPTION_INFO.TypeString$VH.get(seg);
    }
    public static void TypeString$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_INTERCEPTION_INFO.TypeString$VH.set(seg, x);
    }
    public static MemoryAddress TypeString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_INTERCEPTION_INFO.TypeString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TypeString$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_INTERCEPTION_INFO.TypeString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


