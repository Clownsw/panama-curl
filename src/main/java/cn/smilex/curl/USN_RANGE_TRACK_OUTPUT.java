// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class USN_RANGE_TRACK_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Usn")
    );
    public static MemoryLayout $LAYOUT() {
        return USN_RANGE_TRACK_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Usn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Usn"));
    public static VarHandle Usn$VH() {
        return USN_RANGE_TRACK_OUTPUT.Usn$VH;
    }
    public static long Usn$get(MemorySegment seg) {
        return (long)USN_RANGE_TRACK_OUTPUT.Usn$VH.get(seg);
    }
    public static void Usn$set( MemorySegment seg, long x) {
        USN_RANGE_TRACK_OUTPUT.Usn$VH.set(seg, x);
    }
    public static long Usn$get(MemorySegment seg, long index) {
        return (long)USN_RANGE_TRACK_OUTPUT.Usn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Usn$set(MemorySegment seg, long index, long x) {
        USN_RANGE_TRACK_OUTPUT.Usn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


