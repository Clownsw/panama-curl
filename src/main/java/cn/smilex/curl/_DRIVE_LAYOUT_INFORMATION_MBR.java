// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DRIVE_LAYOUT_INFORMATION_MBR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Signature"),
        Constants$root.C_LONG$LAYOUT.withName("CheckSum")
    ).withName("_DRIVE_LAYOUT_INFORMATION_MBR");
    public static MemoryLayout $LAYOUT() {
        return _DRIVE_LAYOUT_INFORMATION_MBR.$struct$LAYOUT;
    }
    static final VarHandle Signature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Signature"));
    public static VarHandle Signature$VH() {
        return _DRIVE_LAYOUT_INFORMATION_MBR.Signature$VH;
    }
    public static int Signature$get(MemorySegment seg) {
        return (int)_DRIVE_LAYOUT_INFORMATION_MBR.Signature$VH.get(seg);
    }
    public static void Signature$set( MemorySegment seg, int x) {
        _DRIVE_LAYOUT_INFORMATION_MBR.Signature$VH.set(seg, x);
    }
    public static int Signature$get(MemorySegment seg, long index) {
        return (int)_DRIVE_LAYOUT_INFORMATION_MBR.Signature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, int x) {
        _DRIVE_LAYOUT_INFORMATION_MBR.Signature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CheckSum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CheckSum"));
    public static VarHandle CheckSum$VH() {
        return _DRIVE_LAYOUT_INFORMATION_MBR.CheckSum$VH;
    }
    public static int CheckSum$get(MemorySegment seg) {
        return (int)_DRIVE_LAYOUT_INFORMATION_MBR.CheckSum$VH.get(seg);
    }
    public static void CheckSum$set( MemorySegment seg, int x) {
        _DRIVE_LAYOUT_INFORMATION_MBR.CheckSum$VH.set(seg, x);
    }
    public static int CheckSum$get(MemorySegment seg, long index) {
        return (int)_DRIVE_LAYOUT_INFORMATION_MBR.CheckSum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CheckSum$set(MemorySegment seg, long index, int x) {
        _DRIVE_LAYOUT_INFORMATION_MBR.CheckSum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


