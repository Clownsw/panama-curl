// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_SYSTEM_RECOGNITION_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(9, Constants$root.C_CHAR$LAYOUT).withName("FileSystem")
    ).withName("_FILE_SYSTEM_RECOGNITION_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _FILE_SYSTEM_RECOGNITION_INFORMATION.$struct$LAYOUT;
    }
    public static MemorySegment FileSystem$slice(MemorySegment seg) {
        return seg.asSlice(0, 9);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


