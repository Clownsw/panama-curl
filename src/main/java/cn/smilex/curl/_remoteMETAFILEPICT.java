// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _remoteMETAFILEPICT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("mm"),
        Constants$root.C_LONG$LAYOUT.withName("xExt"),
        Constants$root.C_LONG$LAYOUT.withName("yExt"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hMF")
    ).withName("_remoteMETAFILEPICT");
    public static MemoryLayout $LAYOUT() {
        return _remoteMETAFILEPICT.$struct$LAYOUT;
    }
    static final VarHandle mm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mm"));
    public static VarHandle mm$VH() {
        return _remoteMETAFILEPICT.mm$VH;
    }
    public static int mm$get(MemorySegment seg) {
        return (int)_remoteMETAFILEPICT.mm$VH.get(seg);
    }
    public static void mm$set( MemorySegment seg, int x) {
        _remoteMETAFILEPICT.mm$VH.set(seg, x);
    }
    public static int mm$get(MemorySegment seg, long index) {
        return (int)_remoteMETAFILEPICT.mm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mm$set(MemorySegment seg, long index, int x) {
        _remoteMETAFILEPICT.mm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xExt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xExt"));
    public static VarHandle xExt$VH() {
        return _remoteMETAFILEPICT.xExt$VH;
    }
    public static int xExt$get(MemorySegment seg) {
        return (int)_remoteMETAFILEPICT.xExt$VH.get(seg);
    }
    public static void xExt$set( MemorySegment seg, int x) {
        _remoteMETAFILEPICT.xExt$VH.set(seg, x);
    }
    public static int xExt$get(MemorySegment seg, long index) {
        return (int)_remoteMETAFILEPICT.xExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xExt$set(MemorySegment seg, long index, int x) {
        _remoteMETAFILEPICT.xExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yExt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yExt"));
    public static VarHandle yExt$VH() {
        return _remoteMETAFILEPICT.yExt$VH;
    }
    public static int yExt$get(MemorySegment seg) {
        return (int)_remoteMETAFILEPICT.yExt$VH.get(seg);
    }
    public static void yExt$set( MemorySegment seg, int x) {
        _remoteMETAFILEPICT.yExt$VH.set(seg, x);
    }
    public static int yExt$get(MemorySegment seg, long index) {
        return (int)_remoteMETAFILEPICT.yExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yExt$set(MemorySegment seg, long index, int x) {
        _remoteMETAFILEPICT.yExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hMF$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hMF"));
    public static VarHandle hMF$VH() {
        return _remoteMETAFILEPICT.hMF$VH;
    }
    public static MemoryAddress hMF$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_remoteMETAFILEPICT.hMF$VH.get(seg);
    }
    public static void hMF$set( MemorySegment seg, MemoryAddress x) {
        _remoteMETAFILEPICT.hMF$VH.set(seg, x);
    }
    public static MemoryAddress hMF$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_remoteMETAFILEPICT.hMF$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hMF$set(MemorySegment seg, long index, MemoryAddress x) {
        _remoteMETAFILEPICT.hMF$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


