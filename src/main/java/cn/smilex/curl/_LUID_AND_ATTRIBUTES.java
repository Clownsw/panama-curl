// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _LUID_AND_ATTRIBUTES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("Luid"),
        Constants$root.C_LONG$LAYOUT.withName("Attributes")
    ).withName("_LUID_AND_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _LUID_AND_ATTRIBUTES.$struct$LAYOUT;
    }
    public static MemorySegment Luid$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _LUID_AND_ATTRIBUTES.Attributes$VH;
    }
    public static int Attributes$get(MemorySegment seg) {
        return (int)_LUID_AND_ATTRIBUTES.Attributes$VH.get(seg);
    }
    public static void Attributes$set( MemorySegment seg, int x) {
        _LUID_AND_ATTRIBUTES.Attributes$VH.set(seg, x);
    }
    public static int Attributes$get(MemorySegment seg, long index) {
        return (int)_LUID_AND_ATTRIBUTES.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, int x) {
        _LUID_AND_ATTRIBUTES.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


