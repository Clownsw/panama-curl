// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_KEY_PROV_PARAM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwParam"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbData"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags")
    ).withName("_CRYPT_KEY_PROV_PARAM");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_KEY_PROV_PARAM.$struct$LAYOUT;
    }
    static final VarHandle dwParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwParam"));
    public static VarHandle dwParam$VH() {
        return _CRYPT_KEY_PROV_PARAM.dwParam$VH;
    }
    public static int dwParam$get(MemorySegment seg) {
        return (int)_CRYPT_KEY_PROV_PARAM.dwParam$VH.get(seg);
    }
    public static void dwParam$set( MemorySegment seg, int x) {
        _CRYPT_KEY_PROV_PARAM.dwParam$VH.set(seg, x);
    }
    public static int dwParam$get(MemorySegment seg, long index) {
        return (int)_CRYPT_KEY_PROV_PARAM.dwParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwParam$set(MemorySegment seg, long index, int x) {
        _CRYPT_KEY_PROV_PARAM.dwParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbData"));
    public static VarHandle pbData$VH() {
        return _CRYPT_KEY_PROV_PARAM.pbData$VH;
    }
    public static MemoryAddress pbData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_KEY_PROV_PARAM.pbData$VH.get(seg);
    }
    public static void pbData$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_KEY_PROV_PARAM.pbData$VH.set(seg, x);
    }
    public static MemoryAddress pbData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_KEY_PROV_PARAM.pbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbData$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_KEY_PROV_PARAM.pbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return _CRYPT_KEY_PROV_PARAM.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)_CRYPT_KEY_PROV_PARAM.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        _CRYPT_KEY_PROV_PARAM.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)_CRYPT_KEY_PROV_PARAM.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        _CRYPT_KEY_PROV_PARAM.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CRYPT_KEY_PROV_PARAM.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CRYPT_KEY_PROV_PARAM.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CRYPT_KEY_PROV_PARAM.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CRYPT_KEY_PROV_PARAM.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CRYPT_KEY_PROV_PARAM.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


