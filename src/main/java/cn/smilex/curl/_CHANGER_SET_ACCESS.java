// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CHANGER_SET_ACCESS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("ElementType"),
            Constants$root.C_LONG$LAYOUT.withName("ElementAddress")
        ).withName("Element"),
        Constants$root.C_LONG$LAYOUT.withName("Control")
    ).withName("_CHANGER_SET_ACCESS");
    public static MemoryLayout $LAYOUT() {
        return _CHANGER_SET_ACCESS.$struct$LAYOUT;
    }
    public static MemorySegment Element$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle Control$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Control"));
    public static VarHandle Control$VH() {
        return _CHANGER_SET_ACCESS.Control$VH;
    }
    public static int Control$get(MemorySegment seg) {
        return (int)_CHANGER_SET_ACCESS.Control$VH.get(seg);
    }
    public static void Control$set( MemorySegment seg, int x) {
        _CHANGER_SET_ACCESS.Control$VH.set(seg, x);
    }
    public static int Control$get(MemorySegment seg, long index) {
        return (int)_CHANGER_SET_ACCESS.Control$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Control$set(MemorySegment seg, long index, int x) {
        _CHANGER_SET_ACCESS.Control$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


