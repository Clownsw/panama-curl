// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NV_MEMORY_RANGE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("BaseAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
    ).withName("_NV_MEMORY_RANGE");
    public static MemoryLayout $LAYOUT() {
        return _NV_MEMORY_RANGE.$struct$LAYOUT;
    }
    static final VarHandle BaseAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseAddress"));
    public static VarHandle BaseAddress$VH() {
        return _NV_MEMORY_RANGE.BaseAddress$VH;
    }
    public static MemoryAddress BaseAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NV_MEMORY_RANGE.BaseAddress$VH.get(seg);
    }
    public static void BaseAddress$set( MemorySegment seg, MemoryAddress x) {
        _NV_MEMORY_RANGE.BaseAddress$VH.set(seg, x);
    }
    public static MemoryAddress BaseAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NV_MEMORY_RANGE.BaseAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _NV_MEMORY_RANGE.BaseAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _NV_MEMORY_RANGE.Length$VH;
    }
    public static long Length$get(MemorySegment seg) {
        return (long)_NV_MEMORY_RANGE.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, long x) {
        _NV_MEMORY_RANGE.Length$VH.set(seg, x);
    }
    public static long Length$get(MemorySegment seg, long index) {
        return (long)_NV_MEMORY_RANGE.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, long x) {
        _NV_MEMORY_RANGE.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


