// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class SCOPE_ID {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(28).withName("Zone"),
                    MemoryLayout.paddingLayout(4).withName("Level")
                )
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("Value")
        ).withName("$anon$0")
    );
    public static MemoryLayout $LAYOUT() {
        return SCOPE_ID.$struct$LAYOUT;
    }
    static final VarHandle Value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Value"));
    public static VarHandle Value$VH() {
        return SCOPE_ID.Value$VH;
    }
    public static int Value$get(MemorySegment seg) {
        return (int)SCOPE_ID.Value$VH.get(seg);
    }
    public static void Value$set( MemorySegment seg, int x) {
        SCOPE_ID.Value$VH.set(seg, x);
    }
    public static int Value$get(MemorySegment seg, long index) {
        return (int)SCOPE_ID.Value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Value$set(MemorySegment seg, long index, int x) {
        SCOPE_ID.Value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

