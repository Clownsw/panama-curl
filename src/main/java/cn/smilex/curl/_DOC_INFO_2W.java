// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DOC_INFO_2W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pDocName"),
        Constants$root.C_POINTER$LAYOUT.withName("pOutputFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype"),
        Constants$root.C_LONG$LAYOUT.withName("dwMode"),
        Constants$root.C_LONG$LAYOUT.withName("JobId")
    ).withName("_DOC_INFO_2W");
    public static MemoryLayout $LAYOUT() {
        return _DOC_INFO_2W.$struct$LAYOUT;
    }
    static final VarHandle pDocName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDocName"));
    public static VarHandle pDocName$VH() {
        return _DOC_INFO_2W.pDocName$VH;
    }
    public static MemoryAddress pDocName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DOC_INFO_2W.pDocName$VH.get(seg);
    }
    public static void pDocName$set( MemorySegment seg, MemoryAddress x) {
        _DOC_INFO_2W.pDocName$VH.set(seg, x);
    }
    public static MemoryAddress pDocName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DOC_INFO_2W.pDocName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDocName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOC_INFO_2W.pDocName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pOutputFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pOutputFile"));
    public static VarHandle pOutputFile$VH() {
        return _DOC_INFO_2W.pOutputFile$VH;
    }
    public static MemoryAddress pOutputFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DOC_INFO_2W.pOutputFile$VH.get(seg);
    }
    public static void pOutputFile$set( MemorySegment seg, MemoryAddress x) {
        _DOC_INFO_2W.pOutputFile$VH.set(seg, x);
    }
    public static MemoryAddress pOutputFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DOC_INFO_2W.pOutputFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pOutputFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOC_INFO_2W.pOutputFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _DOC_INFO_2W.pDatatype$VH;
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DOC_INFO_2W.pDatatype$VH.get(seg);
    }
    public static void pDatatype$set( MemorySegment seg, MemoryAddress x) {
        _DOC_INFO_2W.pDatatype$VH.set(seg, x);
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DOC_INFO_2W.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOC_INFO_2W.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMode"));
    public static VarHandle dwMode$VH() {
        return _DOC_INFO_2W.dwMode$VH;
    }
    public static int dwMode$get(MemorySegment seg) {
        return (int)_DOC_INFO_2W.dwMode$VH.get(seg);
    }
    public static void dwMode$set( MemorySegment seg, int x) {
        _DOC_INFO_2W.dwMode$VH.set(seg, x);
    }
    public static int dwMode$get(MemorySegment seg, long index) {
        return (int)_DOC_INFO_2W.dwMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMode$set(MemorySegment seg, long index, int x) {
        _DOC_INFO_2W.dwMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    public static VarHandle JobId$VH() {
        return _DOC_INFO_2W.JobId$VH;
    }
    public static int JobId$get(MemorySegment seg) {
        return (int)_DOC_INFO_2W.JobId$VH.get(seg);
    }
    public static void JobId$set( MemorySegment seg, int x) {
        _DOC_INFO_2W.JobId$VH.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)_DOC_INFO_2W.JobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        _DOC_INFO_2W.JobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


