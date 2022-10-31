// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MMCKINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ckid"),
        Constants$root.C_LONG$LAYOUT.withName("cksize"),
        Constants$root.C_LONG$LAYOUT.withName("fccType"),
        Constants$root.C_LONG$LAYOUT.withName("dwDataOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags")
    ).withName("_MMCKINFO");
    public static MemoryLayout $LAYOUT() {
        return _MMCKINFO.$struct$LAYOUT;
    }
    static final VarHandle ckid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ckid"));
    public static VarHandle ckid$VH() {
        return _MMCKINFO.ckid$VH;
    }
    public static int ckid$get(MemorySegment seg) {
        return (int)_MMCKINFO.ckid$VH.get(seg);
    }
    public static void ckid$set( MemorySegment seg, int x) {
        _MMCKINFO.ckid$VH.set(seg, x);
    }
    public static int ckid$get(MemorySegment seg, long index) {
        return (int)_MMCKINFO.ckid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ckid$set(MemorySegment seg, long index, int x) {
        _MMCKINFO.ckid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cksize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cksize"));
    public static VarHandle cksize$VH() {
        return _MMCKINFO.cksize$VH;
    }
    public static int cksize$get(MemorySegment seg) {
        return (int)_MMCKINFO.cksize$VH.get(seg);
    }
    public static void cksize$set( MemorySegment seg, int x) {
        _MMCKINFO.cksize$VH.set(seg, x);
    }
    public static int cksize$get(MemorySegment seg, long index) {
        return (int)_MMCKINFO.cksize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cksize$set(MemorySegment seg, long index, int x) {
        _MMCKINFO.cksize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fccType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fccType"));
    public static VarHandle fccType$VH() {
        return _MMCKINFO.fccType$VH;
    }
    public static int fccType$get(MemorySegment seg) {
        return (int)_MMCKINFO.fccType$VH.get(seg);
    }
    public static void fccType$set( MemorySegment seg, int x) {
        _MMCKINFO.fccType$VH.set(seg, x);
    }
    public static int fccType$get(MemorySegment seg, long index) {
        return (int)_MMCKINFO.fccType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fccType$set(MemorySegment seg, long index, int x) {
        _MMCKINFO.fccType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDataOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDataOffset"));
    public static VarHandle dwDataOffset$VH() {
        return _MMCKINFO.dwDataOffset$VH;
    }
    public static int dwDataOffset$get(MemorySegment seg) {
        return (int)_MMCKINFO.dwDataOffset$VH.get(seg);
    }
    public static void dwDataOffset$set( MemorySegment seg, int x) {
        _MMCKINFO.dwDataOffset$VH.set(seg, x);
    }
    public static int dwDataOffset$get(MemorySegment seg, long index) {
        return (int)_MMCKINFO.dwDataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDataOffset$set(MemorySegment seg, long index, int x) {
        _MMCKINFO.dwDataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _MMCKINFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_MMCKINFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _MMCKINFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_MMCKINFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _MMCKINFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


