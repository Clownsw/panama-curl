// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICE_STORAGE_ADDRESS_RANGE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("StartAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LengthInBytes")
    ).withName("_DEVICE_STORAGE_ADDRESS_RANGE");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_STORAGE_ADDRESS_RANGE.$struct$LAYOUT;
    }
    static final VarHandle StartAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartAddress"));
    public static VarHandle StartAddress$VH() {
        return _DEVICE_STORAGE_ADDRESS_RANGE.StartAddress$VH;
    }
    public static long StartAddress$get(MemorySegment seg) {
        return (long)_DEVICE_STORAGE_ADDRESS_RANGE.StartAddress$VH.get(seg);
    }
    public static void StartAddress$set( MemorySegment seg, long x) {
        _DEVICE_STORAGE_ADDRESS_RANGE.StartAddress$VH.set(seg, x);
    }
    public static long StartAddress$get(MemorySegment seg, long index) {
        return (long)_DEVICE_STORAGE_ADDRESS_RANGE.StartAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartAddress$set(MemorySegment seg, long index, long x) {
        _DEVICE_STORAGE_ADDRESS_RANGE.StartAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LengthInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LengthInBytes"));
    public static VarHandle LengthInBytes$VH() {
        return _DEVICE_STORAGE_ADDRESS_RANGE.LengthInBytes$VH;
    }
    public static long LengthInBytes$get(MemorySegment seg) {
        return (long)_DEVICE_STORAGE_ADDRESS_RANGE.LengthInBytes$VH.get(seg);
    }
    public static void LengthInBytes$set( MemorySegment seg, long x) {
        _DEVICE_STORAGE_ADDRESS_RANGE.LengthInBytes$VH.set(seg, x);
    }
    public static long LengthInBytes$get(MemorySegment seg, long index) {
        return (long)_DEVICE_STORAGE_ADDRESS_RANGE.LengthInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LengthInBytes$set(MemorySegment seg, long index, long x) {
        _DEVICE_STORAGE_ADDRESS_RANGE.LengthInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


