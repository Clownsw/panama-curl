// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _wireSAFEARR_VARIANT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("aVariant")
    ).withName("_wireSAFEARR_VARIANT");
    public static MemoryLayout $LAYOUT() {
        return _wireSAFEARR_VARIANT.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _wireSAFEARR_VARIANT.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_wireSAFEARR_VARIANT.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _wireSAFEARR_VARIANT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_wireSAFEARR_VARIANT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _wireSAFEARR_VARIANT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle aVariant$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("aVariant"));
    public static VarHandle aVariant$VH() {
        return _wireSAFEARR_VARIANT.aVariant$VH;
    }
    public static MemoryAddress aVariant$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_wireSAFEARR_VARIANT.aVariant$VH.get(seg);
    }
    public static void aVariant$set( MemorySegment seg, MemoryAddress x) {
        _wireSAFEARR_VARIANT.aVariant$VH.set(seg, x);
    }
    public static MemoryAddress aVariant$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_wireSAFEARR_VARIANT.aVariant$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void aVariant$set(MemorySegment seg, long index, MemoryAddress x) {
        _wireSAFEARR_VARIANT.aVariant$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

