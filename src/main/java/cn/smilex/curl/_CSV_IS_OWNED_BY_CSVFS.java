// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CSV_IS_OWNED_BY_CSVFS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("OwnedByCSVFS")
    ).withName("_CSV_IS_OWNED_BY_CSVFS");
    public static MemoryLayout $LAYOUT() {
        return _CSV_IS_OWNED_BY_CSVFS.$struct$LAYOUT;
    }
    static final VarHandle OwnedByCSVFS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OwnedByCSVFS"));
    public static VarHandle OwnedByCSVFS$VH() {
        return _CSV_IS_OWNED_BY_CSVFS.OwnedByCSVFS$VH;
    }
    public static byte OwnedByCSVFS$get(MemorySegment seg) {
        return (byte)_CSV_IS_OWNED_BY_CSVFS.OwnedByCSVFS$VH.get(seg);
    }
    public static void OwnedByCSVFS$set( MemorySegment seg, byte x) {
        _CSV_IS_OWNED_BY_CSVFS.OwnedByCSVFS$VH.set(seg, x);
    }
    public static byte OwnedByCSVFS$get(MemorySegment seg, long index) {
        return (byte)_CSV_IS_OWNED_BY_CSVFS.OwnedByCSVFS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OwnedByCSVFS$set(MemorySegment seg, long index, byte x) {
        _CSV_IS_OWNED_BY_CSVFS.OwnedByCSVFS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


