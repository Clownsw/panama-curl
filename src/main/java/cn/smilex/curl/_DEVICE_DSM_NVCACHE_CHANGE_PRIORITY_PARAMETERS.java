// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_CHAR$LAYOUT.withName("TargetPriority"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Reserved")
    ).withName("_DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetPriority"));
    public static VarHandle TargetPriority$VH() {
        return _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.TargetPriority$VH;
    }
    public static byte TargetPriority$get(MemorySegment seg) {
        return (byte)_DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.TargetPriority$VH.get(seg);
    }
    public static void TargetPriority$set( MemorySegment seg, byte x) {
        _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.TargetPriority$VH.set(seg, x);
    }
    public static byte TargetPriority$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.TargetPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetPriority$set(MemorySegment seg, long index, byte x) {
        _DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS.TargetPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(5, 3);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

