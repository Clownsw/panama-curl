// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_START_REASON {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwReason")
    ).withName("_SERVICE_START_REASON");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_START_REASON.$struct$LAYOUT;
    }
    static final VarHandle dwReason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReason"));
    public static VarHandle dwReason$VH() {
        return _SERVICE_START_REASON.dwReason$VH;
    }
    public static int dwReason$get(MemorySegment seg) {
        return (int)_SERVICE_START_REASON.dwReason$VH.get(seg);
    }
    public static void dwReason$set( MemorySegment seg, int x) {
        _SERVICE_START_REASON.dwReason$VH.set(seg, x);
    }
    public static int dwReason$get(MemorySegment seg, long index) {
        return (int)_SERVICE_START_REASON.dwReason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReason$set(MemorySegment seg, long index, int x) {
        _SERVICE_START_REASON.dwReason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


