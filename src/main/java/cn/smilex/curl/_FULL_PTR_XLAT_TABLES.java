// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FULL_PTR_XLAT_TABLES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("RefIdToPointer"),
        Constants$root.C_POINTER$LAYOUT.withName("PointerToRefId"),
        Constants$root.C_LONG$LAYOUT.withName("NextRefId"),
        Constants$root.C_LONG$LAYOUT.withName("XlatSide")
    ).withName("_FULL_PTR_XLAT_TABLES");
    public static MemoryLayout $LAYOUT() {
        return _FULL_PTR_XLAT_TABLES.$struct$LAYOUT;
    }
    static final VarHandle RefIdToPointer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RefIdToPointer"));
    public static VarHandle RefIdToPointer$VH() {
        return _FULL_PTR_XLAT_TABLES.RefIdToPointer$VH;
    }
    public static MemoryAddress RefIdToPointer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_FULL_PTR_XLAT_TABLES.RefIdToPointer$VH.get(seg);
    }
    public static void RefIdToPointer$set( MemorySegment seg, MemoryAddress x) {
        _FULL_PTR_XLAT_TABLES.RefIdToPointer$VH.set(seg, x);
    }
    public static MemoryAddress RefIdToPointer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_FULL_PTR_XLAT_TABLES.RefIdToPointer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RefIdToPointer$set(MemorySegment seg, long index, MemoryAddress x) {
        _FULL_PTR_XLAT_TABLES.RefIdToPointer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PointerToRefId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PointerToRefId"));
    public static VarHandle PointerToRefId$VH() {
        return _FULL_PTR_XLAT_TABLES.PointerToRefId$VH;
    }
    public static MemoryAddress PointerToRefId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_FULL_PTR_XLAT_TABLES.PointerToRefId$VH.get(seg);
    }
    public static void PointerToRefId$set( MemorySegment seg, MemoryAddress x) {
        _FULL_PTR_XLAT_TABLES.PointerToRefId$VH.set(seg, x);
    }
    public static MemoryAddress PointerToRefId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_FULL_PTR_XLAT_TABLES.PointerToRefId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToRefId$set(MemorySegment seg, long index, MemoryAddress x) {
        _FULL_PTR_XLAT_TABLES.PointerToRefId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NextRefId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextRefId"));
    public static VarHandle NextRefId$VH() {
        return _FULL_PTR_XLAT_TABLES.NextRefId$VH;
    }
    public static int NextRefId$get(MemorySegment seg) {
        return (int)_FULL_PTR_XLAT_TABLES.NextRefId$VH.get(seg);
    }
    public static void NextRefId$set( MemorySegment seg, int x) {
        _FULL_PTR_XLAT_TABLES.NextRefId$VH.set(seg, x);
    }
    public static int NextRefId$get(MemorySegment seg, long index) {
        return (int)_FULL_PTR_XLAT_TABLES.NextRefId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextRefId$set(MemorySegment seg, long index, int x) {
        _FULL_PTR_XLAT_TABLES.NextRefId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle XlatSide$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("XlatSide"));
    public static VarHandle XlatSide$VH() {
        return _FULL_PTR_XLAT_TABLES.XlatSide$VH;
    }
    public static int XlatSide$get(MemorySegment seg) {
        return (int)_FULL_PTR_XLAT_TABLES.XlatSide$VH.get(seg);
    }
    public static void XlatSide$set( MemorySegment seg, int x) {
        _FULL_PTR_XLAT_TABLES.XlatSide$VH.set(seg, x);
    }
    public static int XlatSide$get(MemorySegment seg, long index) {
        return (int)_FULL_PTR_XLAT_TABLES.XlatSide$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void XlatSide$set(MemorySegment seg, long index, int x) {
        _FULL_PTR_XLAT_TABLES.XlatSide$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


