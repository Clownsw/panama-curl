// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _QOS_SHAPING_RATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ObjectType"),
            Constants$root.C_LONG$LAYOUT.withName("ObjectLength")
        ).withName("ObjectHdr"),
        Constants$root.C_LONG$LAYOUT.withName("ShapingRate")
    ).withName("_QOS_SHAPING_RATE");
    public static MemoryLayout $LAYOUT() {
        return _QOS_SHAPING_RATE.$struct$LAYOUT;
    }
    public static MemorySegment ObjectHdr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ShapingRate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ShapingRate"));
    public static VarHandle ShapingRate$VH() {
        return _QOS_SHAPING_RATE.ShapingRate$VH;
    }
    public static int ShapingRate$get(MemorySegment seg) {
        return (int)_QOS_SHAPING_RATE.ShapingRate$VH.get(seg);
    }
    public static void ShapingRate$set( MemorySegment seg, int x) {
        _QOS_SHAPING_RATE.ShapingRate$VH.set(seg, x);
    }
    public static int ShapingRate$get(MemorySegment seg, long index) {
        return (int)_QOS_SHAPING_RATE.ShapingRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ShapingRate$set(MemorySegment seg, long index, int x) {
        _QOS_SHAPING_RATE.ShapingRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


