// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagBinaryParam {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Buffer"),
        Constants$root.C_SHORT$LAYOUT.withName("Size"),
        MemoryLayout.paddingLayout(48)
    ).withName("tagBinaryParam");
    public static MemoryLayout $LAYOUT() {
        return tagBinaryParam.$struct$LAYOUT;
    }
    static final VarHandle Buffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Buffer"));
    public static VarHandle Buffer$VH() {
        return tagBinaryParam.Buffer$VH;
    }
    public static MemoryAddress Buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagBinaryParam.Buffer$VH.get(seg);
    }
    public static void Buffer$set( MemorySegment seg, MemoryAddress x) {
        tagBinaryParam.Buffer$VH.set(seg, x);
    }
    public static MemoryAddress Buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagBinaryParam.Buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        tagBinaryParam.Buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return tagBinaryParam.Size$VH;
    }
    public static short Size$get(MemorySegment seg) {
        return (short)tagBinaryParam.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, short x) {
        tagBinaryParam.Size$VH.set(seg, x);
    }
    public static short Size$get(MemorySegment seg, long index) {
        return (short)tagBinaryParam.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, short x) {
        tagBinaryParam.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


