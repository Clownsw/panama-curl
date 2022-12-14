// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class sockaddr_dl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("sdl_family"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("sdl_data"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("sdl_zero")
    ).withName("sockaddr_dl");
    public static MemoryLayout $LAYOUT() {
        return sockaddr_dl.$struct$LAYOUT;
    }
    static final VarHandle sdl_family$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sdl_family"));
    public static VarHandle sdl_family$VH() {
        return sockaddr_dl.sdl_family$VH;
    }
    public static short sdl_family$get(MemorySegment seg) {
        return (short)sockaddr_dl.sdl_family$VH.get(seg);
    }
    public static void sdl_family$set( MemorySegment seg, short x) {
        sockaddr_dl.sdl_family$VH.set(seg, x);
    }
    public static short sdl_family$get(MemorySegment seg, long index) {
        return (short)sockaddr_dl.sdl_family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sdl_family$set(MemorySegment seg, long index, short x) {
        sockaddr_dl.sdl_family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment sdl_data$slice(MemorySegment seg) {
        return seg.asSlice(2, 8);
    }
    public static MemorySegment sdl_zero$slice(MemorySegment seg) {
        return seg.asSlice(10, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


