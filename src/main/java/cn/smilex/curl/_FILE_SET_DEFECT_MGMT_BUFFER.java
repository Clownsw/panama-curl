// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_SET_DEFECT_MGMT_BUFFER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Disable")
    ).withName("_FILE_SET_DEFECT_MGMT_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _FILE_SET_DEFECT_MGMT_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle Disable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Disable"));
    public static VarHandle Disable$VH() {
        return _FILE_SET_DEFECT_MGMT_BUFFER.Disable$VH;
    }
    public static byte Disable$get(MemorySegment seg) {
        return (byte)_FILE_SET_DEFECT_MGMT_BUFFER.Disable$VH.get(seg);
    }
    public static void Disable$set( MemorySegment seg, byte x) {
        _FILE_SET_DEFECT_MGMT_BUFFER.Disable$VH.set(seg, x);
    }
    public static byte Disable$get(MemorySegment seg, long index) {
        return (byte)_FILE_SET_DEFECT_MGMT_BUFFER.Disable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Disable$set(MemorySegment seg, long index, byte x) {
        _FILE_SET_DEFECT_MGMT_BUFFER.Disable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


