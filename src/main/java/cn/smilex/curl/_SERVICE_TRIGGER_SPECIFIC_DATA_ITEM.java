// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwDataType"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        Constants$root.C_POINTER$LAYOUT.withName("pData")
    ).withName("_SERVICE_TRIGGER_SPECIFIC_DATA_ITEM");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.$struct$LAYOUT;
    }
    static final VarHandle dwDataType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDataType"));
    public static VarHandle dwDataType$VH() {
        return _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.dwDataType$VH;
    }
    public static int dwDataType$get(MemorySegment seg) {
        return (int)_SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.dwDataType$VH.get(seg);
    }
    public static void dwDataType$set( MemorySegment seg, int x) {
        _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.dwDataType$VH.set(seg, x);
    }
    public static int dwDataType$get(MemorySegment seg, long index) {
        return (int)_SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.dwDataType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDataType$set(MemorySegment seg, long index, int x) {
        _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.dwDataType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)_SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)_SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pData"));
    public static VarHandle pData$VH() {
        return _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.pData$VH;
    }
    public static MemoryAddress pData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.pData$VH.get(seg);
    }
    public static void pData$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.pData$VH.set(seg, x);
    }
    public static MemoryAddress pData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.pData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pData$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM.pData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


