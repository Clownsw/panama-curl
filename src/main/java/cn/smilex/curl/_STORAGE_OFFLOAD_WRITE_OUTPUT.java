// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_OFFLOAD_WRITE_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("OffloadWriteFlags"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LengthCopied")
    ).withName("_STORAGE_OFFLOAD_WRITE_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_OFFLOAD_WRITE_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle OffloadWriteFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OffloadWriteFlags"));
    public static VarHandle OffloadWriteFlags$VH() {
        return _STORAGE_OFFLOAD_WRITE_OUTPUT.OffloadWriteFlags$VH;
    }
    public static int OffloadWriteFlags$get(MemorySegment seg) {
        return (int)_STORAGE_OFFLOAD_WRITE_OUTPUT.OffloadWriteFlags$VH.get(seg);
    }
    public static void OffloadWriteFlags$set( MemorySegment seg, int x) {
        _STORAGE_OFFLOAD_WRITE_OUTPUT.OffloadWriteFlags$VH.set(seg, x);
    }
    public static int OffloadWriteFlags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OFFLOAD_WRITE_OUTPUT.OffloadWriteFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OffloadWriteFlags$set(MemorySegment seg, long index, int x) {
        _STORAGE_OFFLOAD_WRITE_OUTPUT.OffloadWriteFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _STORAGE_OFFLOAD_WRITE_OUTPUT.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_STORAGE_OFFLOAD_WRITE_OUTPUT.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _STORAGE_OFFLOAD_WRITE_OUTPUT.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_STORAGE_OFFLOAD_WRITE_OUTPUT.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _STORAGE_OFFLOAD_WRITE_OUTPUT.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LengthCopied$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LengthCopied"));
    public static VarHandle LengthCopied$VH() {
        return _STORAGE_OFFLOAD_WRITE_OUTPUT.LengthCopied$VH;
    }
    public static long LengthCopied$get(MemorySegment seg) {
        return (long)_STORAGE_OFFLOAD_WRITE_OUTPUT.LengthCopied$VH.get(seg);
    }
    public static void LengthCopied$set( MemorySegment seg, long x) {
        _STORAGE_OFFLOAD_WRITE_OUTPUT.LengthCopied$VH.set(seg, x);
    }
    public static long LengthCopied$get(MemorySegment seg, long index) {
        return (long)_STORAGE_OFFLOAD_WRITE_OUTPUT.LengthCopied$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LengthCopied$set(MemorySegment seg, long index, long x) {
        _STORAGE_OFFLOAD_WRITE_OUTPUT.LengthCopied$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


