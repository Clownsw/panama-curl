// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DDELN {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(13).withName("unused"),
            MemoryLayout.paddingLayout(1).withName("fRelease"),
            MemoryLayout.paddingLayout(1).withName("fDeferUpd"),
            MemoryLayout.paddingLayout(1).withName("fAckReq")
        ),
        Constants$root.C_SHORT$LAYOUT.withName("cfFormat")
    );
    public static MemoryLayout $LAYOUT() {
        return DDELN.$struct$LAYOUT;
    }
    static final VarHandle cfFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cfFormat"));
    public static VarHandle cfFormat$VH() {
        return DDELN.cfFormat$VH;
    }
    public static short cfFormat$get(MemorySegment seg) {
        return (short)DDELN.cfFormat$VH.get(seg);
    }
    public static void cfFormat$set( MemorySegment seg, short x) {
        DDELN.cfFormat$VH.set(seg, x);
    }
    public static short cfFormat$get(MemorySegment seg, long index) {
        return (short)DDELN.cfFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cfFormat$set(MemorySegment seg, long index, short x) {
        DDELN.cfFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


