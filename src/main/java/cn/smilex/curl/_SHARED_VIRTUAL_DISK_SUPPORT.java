// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SHARED_VIRTUAL_DISK_SUPPORT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SharedVirtualDiskSupport"),
        Constants$root.C_LONG$LAYOUT.withName("HandleState")
    ).withName("_SHARED_VIRTUAL_DISK_SUPPORT");
    public static MemoryLayout $LAYOUT() {
        return _SHARED_VIRTUAL_DISK_SUPPORT.$struct$LAYOUT;
    }
    static final VarHandle SharedVirtualDiskSupport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SharedVirtualDiskSupport"));
    public static VarHandle SharedVirtualDiskSupport$VH() {
        return _SHARED_VIRTUAL_DISK_SUPPORT.SharedVirtualDiskSupport$VH;
    }
    public static int SharedVirtualDiskSupport$get(MemorySegment seg) {
        return (int)_SHARED_VIRTUAL_DISK_SUPPORT.SharedVirtualDiskSupport$VH.get(seg);
    }
    public static void SharedVirtualDiskSupport$set( MemorySegment seg, int x) {
        _SHARED_VIRTUAL_DISK_SUPPORT.SharedVirtualDiskSupport$VH.set(seg, x);
    }
    public static int SharedVirtualDiskSupport$get(MemorySegment seg, long index) {
        return (int)_SHARED_VIRTUAL_DISK_SUPPORT.SharedVirtualDiskSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SharedVirtualDiskSupport$set(MemorySegment seg, long index, int x) {
        _SHARED_VIRTUAL_DISK_SUPPORT.SharedVirtualDiskSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HandleState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HandleState"));
    public static VarHandle HandleState$VH() {
        return _SHARED_VIRTUAL_DISK_SUPPORT.HandleState$VH;
    }
    public static int HandleState$get(MemorySegment seg) {
        return (int)_SHARED_VIRTUAL_DISK_SUPPORT.HandleState$VH.get(seg);
    }
    public static void HandleState$set( MemorySegment seg, int x) {
        _SHARED_VIRTUAL_DISK_SUPPORT.HandleState$VH.set(seg, x);
    }
    public static int HandleState$get(MemorySegment seg, long index) {
        return (int)_SHARED_VIRTUAL_DISK_SUPPORT.HandleState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HandleState$set(MemorySegment seg, long index, int x) {
        _SHARED_VIRTUAL_DISK_SUPPORT.HandleState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

