// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ICONINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fIcon"),
        Constants$root.C_LONG$LAYOUT.withName("xHotspot"),
        Constants$root.C_LONG$LAYOUT.withName("yHotspot"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hbmMask"),
        Constants$root.C_POINTER$LAYOUT.withName("hbmColor")
    ).withName("_ICONINFO");
    public static MemoryLayout $LAYOUT() {
        return _ICONINFO.$struct$LAYOUT;
    }
    static final VarHandle fIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fIcon"));
    public static VarHandle fIcon$VH() {
        return _ICONINFO.fIcon$VH;
    }
    public static int fIcon$get(MemorySegment seg) {
        return (int)_ICONINFO.fIcon$VH.get(seg);
    }
    public static void fIcon$set( MemorySegment seg, int x) {
        _ICONINFO.fIcon$VH.set(seg, x);
    }
    public static int fIcon$get(MemorySegment seg, long index) {
        return (int)_ICONINFO.fIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fIcon$set(MemorySegment seg, long index, int x) {
        _ICONINFO.fIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xHotspot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xHotspot"));
    public static VarHandle xHotspot$VH() {
        return _ICONINFO.xHotspot$VH;
    }
    public static int xHotspot$get(MemorySegment seg) {
        return (int)_ICONINFO.xHotspot$VH.get(seg);
    }
    public static void xHotspot$set( MemorySegment seg, int x) {
        _ICONINFO.xHotspot$VH.set(seg, x);
    }
    public static int xHotspot$get(MemorySegment seg, long index) {
        return (int)_ICONINFO.xHotspot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xHotspot$set(MemorySegment seg, long index, int x) {
        _ICONINFO.xHotspot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yHotspot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yHotspot"));
    public static VarHandle yHotspot$VH() {
        return _ICONINFO.yHotspot$VH;
    }
    public static int yHotspot$get(MemorySegment seg) {
        return (int)_ICONINFO.yHotspot$VH.get(seg);
    }
    public static void yHotspot$set( MemorySegment seg, int x) {
        _ICONINFO.yHotspot$VH.set(seg, x);
    }
    public static int yHotspot$get(MemorySegment seg, long index) {
        return (int)_ICONINFO.yHotspot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yHotspot$set(MemorySegment seg, long index, int x) {
        _ICONINFO.yHotspot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmMask"));
    public static VarHandle hbmMask$VH() {
        return _ICONINFO.hbmMask$VH;
    }
    public static MemoryAddress hbmMask$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ICONINFO.hbmMask$VH.get(seg);
    }
    public static void hbmMask$set( MemorySegment seg, MemoryAddress x) {
        _ICONINFO.hbmMask$VH.set(seg, x);
    }
    public static MemoryAddress hbmMask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ICONINFO.hbmMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmMask$set(MemorySegment seg, long index, MemoryAddress x) {
        _ICONINFO.hbmMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmColor"));
    public static VarHandle hbmColor$VH() {
        return _ICONINFO.hbmColor$VH;
    }
    public static MemoryAddress hbmColor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ICONINFO.hbmColor$VH.get(seg);
    }
    public static void hbmColor$set( MemorySegment seg, MemoryAddress x) {
        _ICONINFO.hbmColor$VH.set(seg, x);
    }
    public static MemoryAddress hbmColor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ICONINFO.hbmColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmColor$set(MemorySegment seg, long index, MemoryAddress x) {
        _ICONINFO.hbmColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


