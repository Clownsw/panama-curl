// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WOW64_ARCHITECTURE_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(16).withName("Machine"),
            MemoryLayout.paddingLayout(1).withName("KernelMode"),
            MemoryLayout.paddingLayout(1).withName("UserMode"),
            MemoryLayout.paddingLayout(1).withName("Native"),
            MemoryLayout.paddingLayout(1).withName("Process"),
            MemoryLayout.paddingLayout(12).withName("ReservedZero0")
        )
    ).withName("_WOW64_ARCHITECTURE_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _WOW64_ARCHITECTURE_INFORMATION.$struct$LAYOUT;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


