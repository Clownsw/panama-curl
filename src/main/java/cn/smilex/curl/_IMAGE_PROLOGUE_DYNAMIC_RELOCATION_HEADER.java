// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("PrologueByteCount")
    ).withName("_IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER.$struct$LAYOUT;
    }
    static final VarHandle PrologueByteCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrologueByteCount"));
    public static VarHandle PrologueByteCount$VH() {
        return _IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER.PrologueByteCount$VH;
    }
    public static byte PrologueByteCount$get(MemorySegment seg) {
        return (byte)_IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER.PrologueByteCount$VH.get(seg);
    }
    public static void PrologueByteCount$set( MemorySegment seg, byte x) {
        _IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER.PrologueByteCount$VH.set(seg, x);
    }
    public static byte PrologueByteCount$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER.PrologueByteCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrologueByteCount$set(MemorySegment seg, long index, byte x) {
        _IMAGE_PROLOGUE_DYNAMIC_RELOCATION_HEADER.PrologueByteCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


