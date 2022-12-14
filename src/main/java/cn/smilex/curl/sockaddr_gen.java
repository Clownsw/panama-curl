// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class sockaddr_gen {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("sa_family"),
            MemoryLayout.sequenceLayout(14, Constants$root.C_CHAR$LAYOUT).withName("sa_data")
        ).withName("Address"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("sin_family"),
            Constants$root.C_SHORT$LAYOUT.withName("sin_port"),
            MemoryLayout.structLayout(
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                        Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                        Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                        Constants$root.C_CHAR$LAYOUT.withName("s_b4")
                    ).withName("S_un_b"),
                    MemoryLayout.structLayout(
                        Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                        Constants$root.C_SHORT$LAYOUT.withName("s_w2")
                    ).withName("S_un_w"),
                    Constants$root.C_LONG$LAYOUT.withName("S_addr")
                ).withName("S_un")
            ).withName("sin_addr"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("sin_zero")
        ).withName("AddressIn"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("sin6_family"),
            Constants$root.C_SHORT$LAYOUT.withName("sin6_port"),
            Constants$root.C_LONG$LAYOUT.withName("sin6_flowinfo"),
            MemoryLayout.structLayout(
                MemoryLayout.unionLayout(
                    MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Byte"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_SHORT$LAYOUT).withName("Word")
                ).withName("u")
            ).withName("sin6_addr")
        ).withName("AddressIn6")
    ).withName("sockaddr_gen");
    public static MemoryLayout $LAYOUT() {
        return sockaddr_gen.$union$LAYOUT;
    }
    public static MemorySegment Address$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment AddressIn$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment AddressIn6$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


