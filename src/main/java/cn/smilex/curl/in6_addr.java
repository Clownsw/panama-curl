// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class in6_addr {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Byte"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_SHORT$LAYOUT).withName("Word")
        ).withName("u")
    ).withName("in6_addr");
    public static MemoryLayout $LAYOUT() {
        return in6_addr.$struct$LAYOUT;
    }
    public static class u {

        static final  GroupLayout u$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Byte"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_SHORT$LAYOUT).withName("Word")
        );
        public static MemoryLayout $LAYOUT() {
            return u.u$union$LAYOUT;
        }
        public static MemorySegment Byte$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment Word$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


