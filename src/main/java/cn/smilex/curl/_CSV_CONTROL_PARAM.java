// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CSV_CONTROL_PARAM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Operation"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Unused")
    ).withName("_CSV_CONTROL_PARAM");
    public static MemoryLayout $LAYOUT() {
        return _CSV_CONTROL_PARAM.$struct$LAYOUT;
    }
    static final VarHandle Operation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Operation"));
    public static VarHandle Operation$VH() {
        return _CSV_CONTROL_PARAM.Operation$VH;
    }
    public static int Operation$get(MemorySegment seg) {
        return (int)_CSV_CONTROL_PARAM.Operation$VH.get(seg);
    }
    public static void Operation$set( MemorySegment seg, int x) {
        _CSV_CONTROL_PARAM.Operation$VH.set(seg, x);
    }
    public static int Operation$get(MemorySegment seg, long index) {
        return (int)_CSV_CONTROL_PARAM.Operation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Operation$set(MemorySegment seg, long index, int x) {
        _CSV_CONTROL_PARAM.Operation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Unused$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unused"));
    public static VarHandle Unused$VH() {
        return _CSV_CONTROL_PARAM.Unused$VH;
    }
    public static long Unused$get(MemorySegment seg) {
        return (long)_CSV_CONTROL_PARAM.Unused$VH.get(seg);
    }
    public static void Unused$set( MemorySegment seg, long x) {
        _CSV_CONTROL_PARAM.Unused$VH.set(seg, x);
    }
    public static long Unused$get(MemorySegment seg, long index) {
        return (long)_CSV_CONTROL_PARAM.Unused$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unused$set(MemorySegment seg, long index, long x) {
        _CSV_CONTROL_PARAM.Unused$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


