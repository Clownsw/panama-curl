// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISK_LOGGING {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Function"),
        MemoryLayout.paddingLayout(56),
        Constants$root.C_POINTER$LAYOUT.withName("BufferAddress"),
        Constants$root.C_LONG$LAYOUT.withName("BufferSize"),
        MemoryLayout.paddingLayout(32)
    ).withName("_DISK_LOGGING");
    public static MemoryLayout $LAYOUT() {
        return _DISK_LOGGING.$struct$LAYOUT;
    }
    static final VarHandle Function$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Function"));
    public static VarHandle Function$VH() {
        return _DISK_LOGGING.Function$VH;
    }
    public static byte Function$get(MemorySegment seg) {
        return (byte)_DISK_LOGGING.Function$VH.get(seg);
    }
    public static void Function$set( MemorySegment seg, byte x) {
        _DISK_LOGGING.Function$VH.set(seg, x);
    }
    public static byte Function$get(MemorySegment seg, long index) {
        return (byte)_DISK_LOGGING.Function$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Function$set(MemorySegment seg, long index, byte x) {
        _DISK_LOGGING.Function$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferAddress"));
    public static VarHandle BufferAddress$VH() {
        return _DISK_LOGGING.BufferAddress$VH;
    }
    public static MemoryAddress BufferAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DISK_LOGGING.BufferAddress$VH.get(seg);
    }
    public static void BufferAddress$set( MemorySegment seg, MemoryAddress x) {
        _DISK_LOGGING.BufferAddress$VH.set(seg, x);
    }
    public static MemoryAddress BufferAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DISK_LOGGING.BufferAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISK_LOGGING.BufferAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferSize"));
    public static VarHandle BufferSize$VH() {
        return _DISK_LOGGING.BufferSize$VH;
    }
    public static int BufferSize$get(MemorySegment seg) {
        return (int)_DISK_LOGGING.BufferSize$VH.get(seg);
    }
    public static void BufferSize$set( MemorySegment seg, int x) {
        _DISK_LOGGING.BufferSize$VH.set(seg, x);
    }
    public static int BufferSize$get(MemorySegment seg, long index) {
        return (int)_DISK_LOGGING.BufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSize$set(MemorySegment seg, long index, int x) {
        _DISK_LOGGING.BufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


