// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICEDUMP_RESTRICTED_SUBSECTION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("bData")
    ).withName("_DEVICEDUMP_RESTRICTED_SUBSECTION");
    public static MemoryLayout $LAYOUT() {
        return _DEVICEDUMP_RESTRICTED_SUBSECTION.$struct$LAYOUT;
    }
    public static MemorySegment bData$slice(MemorySegment seg) {
        return seg.asSlice(0, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


