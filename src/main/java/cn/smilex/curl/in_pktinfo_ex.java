// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class in_pktinfo_ex {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            ).withName("ipi_addr"),
            Constants$root.C_LONG$LAYOUT.withName("ipi_ifindex")
        ).withName("pkt_info"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.paddingLayout(28).withName("Zone"),
                        MemoryLayout.paddingLayout(4).withName("Level")
                    )
                ).withName("$anon$0"),
                Constants$root.C_LONG$LAYOUT.withName("Value")
            ).withName("$anon$0")
        ).withName("scope_id")
    ).withName("in_pktinfo_ex");
    public static MemoryLayout $LAYOUT() {
        return in_pktinfo_ex.$struct$LAYOUT;
    }
    public static MemorySegment pkt_info$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment scope_id$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


