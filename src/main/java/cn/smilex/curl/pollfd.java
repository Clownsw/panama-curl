// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class pollfd {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("fd"),
        Constants$root.C_SHORT$LAYOUT.withName("events"),
        Constants$root.C_SHORT$LAYOUT.withName("revents"),
        MemoryLayout.paddingLayout(32)
    ).withName("pollfd");
    public static MemoryLayout $LAYOUT() {
        return pollfd.$struct$LAYOUT;
    }
    static final VarHandle fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fd"));
    public static VarHandle fd$VH() {
        return pollfd.fd$VH;
    }
    public static long fd$get(MemorySegment seg) {
        return (long)pollfd.fd$VH.get(seg);
    }
    public static void fd$set( MemorySegment seg, long x) {
        pollfd.fd$VH.set(seg, x);
    }
    public static long fd$get(MemorySegment seg, long index) {
        return (long)pollfd.fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fd$set(MemorySegment seg, long index, long x) {
        pollfd.fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle events$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("events"));
    public static VarHandle events$VH() {
        return pollfd.events$VH;
    }
    public static short events$get(MemorySegment seg) {
        return (short)pollfd.events$VH.get(seg);
    }
    public static void events$set( MemorySegment seg, short x) {
        pollfd.events$VH.set(seg, x);
    }
    public static short events$get(MemorySegment seg, long index) {
        return (short)pollfd.events$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void events$set(MemorySegment seg, long index, short x) {
        pollfd.events$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle revents$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("revents"));
    public static VarHandle revents$VH() {
        return pollfd.revents$VH;
    }
    public static short revents$get(MemorySegment seg) {
        return (short)pollfd.revents$VH.get(seg);
    }
    public static void revents$set( MemorySegment seg, short x) {
        pollfd.revents$VH.set(seg, x);
    }
    public static short revents$get(MemorySegment seg, long index) {
        return (short)pollfd.revents$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void revents$set(MemorySegment seg, long index, short x) {
        pollfd.revents$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


