// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _wireSAFEARR_HAVEIID {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("apUnknown"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("iid")
    ).withName("_wireSAFEARR_HAVEIID");
    public static MemoryLayout $LAYOUT() {
        return _wireSAFEARR_HAVEIID.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _wireSAFEARR_HAVEIID.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_wireSAFEARR_HAVEIID.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _wireSAFEARR_HAVEIID.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_wireSAFEARR_HAVEIID.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _wireSAFEARR_HAVEIID.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle apUnknown$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("apUnknown"));
    public static VarHandle apUnknown$VH() {
        return _wireSAFEARR_HAVEIID.apUnknown$VH;
    }
    public static MemoryAddress apUnknown$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_wireSAFEARR_HAVEIID.apUnknown$VH.get(seg);
    }
    public static void apUnknown$set( MemorySegment seg, MemoryAddress x) {
        _wireSAFEARR_HAVEIID.apUnknown$VH.set(seg, x);
    }
    public static MemoryAddress apUnknown$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_wireSAFEARR_HAVEIID.apUnknown$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void apUnknown$set(MemorySegment seg, long index, MemoryAddress x) {
        _wireSAFEARR_HAVEIID.apUnknown$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment iid$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

