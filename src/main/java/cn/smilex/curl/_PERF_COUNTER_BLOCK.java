// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PERF_COUNTER_BLOCK {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ByteLength")
    ).withName("_PERF_COUNTER_BLOCK");
    public static MemoryLayout $LAYOUT() {
        return _PERF_COUNTER_BLOCK.$struct$LAYOUT;
    }
    static final VarHandle ByteLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ByteLength"));
    public static VarHandle ByteLength$VH() {
        return _PERF_COUNTER_BLOCK.ByteLength$VH;
    }
    public static int ByteLength$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_BLOCK.ByteLength$VH.get(seg);
    }
    public static void ByteLength$set( MemorySegment seg, int x) {
        _PERF_COUNTER_BLOCK.ByteLength$VH.set(seg, x);
    }
    public static int ByteLength$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_BLOCK.ByteLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteLength$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_BLOCK.ByteLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


