// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CONTAINER_ROOT_INFO_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("ContainerRootIdLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("ContainerRootId"),
        MemoryLayout.paddingLayout(8)
    ).withName("_CONTAINER_ROOT_INFO_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _CONTAINER_ROOT_INFO_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle ContainerRootIdLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContainerRootIdLength"));
    public static VarHandle ContainerRootIdLength$VH() {
        return _CONTAINER_ROOT_INFO_OUTPUT.ContainerRootIdLength$VH;
    }
    public static short ContainerRootIdLength$get(MemorySegment seg) {
        return (short)_CONTAINER_ROOT_INFO_OUTPUT.ContainerRootIdLength$VH.get(seg);
    }
    public static void ContainerRootIdLength$set( MemorySegment seg, short x) {
        _CONTAINER_ROOT_INFO_OUTPUT.ContainerRootIdLength$VH.set(seg, x);
    }
    public static short ContainerRootIdLength$get(MemorySegment seg, long index) {
        return (short)_CONTAINER_ROOT_INFO_OUTPUT.ContainerRootIdLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContainerRootIdLength$set(MemorySegment seg, long index, short x) {
        _CONTAINER_ROOT_INFO_OUTPUT.ContainerRootIdLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ContainerRootId$slice(MemorySegment seg) {
        return seg.asSlice(2, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


