// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _iobuf {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("_Placeholder")
    ).withName("_iobuf");
    public static MemoryLayout $LAYOUT() {
        return _iobuf.$struct$LAYOUT;
    }
    static final VarHandle _Placeholder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_Placeholder"));
    public static VarHandle _Placeholder$VH() {
        return _iobuf._Placeholder$VH;
    }
    public static MemoryAddress _Placeholder$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_iobuf._Placeholder$VH.get(seg);
    }
    public static void _Placeholder$set( MemorySegment seg, MemoryAddress x) {
        _iobuf._Placeholder$VH.set(seg, x);
    }
    public static MemoryAddress _Placeholder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_iobuf._Placeholder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _Placeholder$set(MemorySegment seg, long index, MemoryAddress x) {
        _iobuf._Placeholder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


