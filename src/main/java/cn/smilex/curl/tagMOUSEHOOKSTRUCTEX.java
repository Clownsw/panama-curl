// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMOUSEHOOKSTRUCTEX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(256),
        Constants$root.C_LONG$LAYOUT.withName("mouseData"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagMOUSEHOOKSTRUCTEX");
    public static MemoryLayout $LAYOUT() {
        return tagMOUSEHOOKSTRUCTEX.$struct$LAYOUT;
    }
    static final VarHandle mouseData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mouseData"));
    public static VarHandle mouseData$VH() {
        return tagMOUSEHOOKSTRUCTEX.mouseData$VH;
    }
    public static int mouseData$get(MemorySegment seg) {
        return (int)tagMOUSEHOOKSTRUCTEX.mouseData$VH.get(seg);
    }
    public static void mouseData$set( MemorySegment seg, int x) {
        tagMOUSEHOOKSTRUCTEX.mouseData$VH.set(seg, x);
    }
    public static int mouseData$get(MemorySegment seg, long index) {
        return (int)tagMOUSEHOOKSTRUCTEX.mouseData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mouseData$set(MemorySegment seg, long index, int x) {
        tagMOUSEHOOKSTRUCTEX.mouseData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


