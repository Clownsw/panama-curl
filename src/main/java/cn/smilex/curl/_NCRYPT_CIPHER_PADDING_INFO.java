// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NCRYPT_CIPHER_PADDING_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("pbIV"),
        Constants$root.C_LONG$LAYOUT.withName("cbIV"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbOtherInfo"),
        Constants$root.C_LONG$LAYOUT.withName("cbOtherInfo"),
        MemoryLayout.paddingLayout(32)
    ).withName("_NCRYPT_CIPHER_PADDING_INFO");
    public static MemoryLayout $LAYOUT() {
        return _NCRYPT_CIPHER_PADDING_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _NCRYPT_CIPHER_PADDING_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_NCRYPT_CIPHER_PADDING_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _NCRYPT_CIPHER_PADDING_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_CIPHER_PADDING_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _NCRYPT_CIPHER_PADDING_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _NCRYPT_CIPHER_PADDING_INFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_NCRYPT_CIPHER_PADDING_INFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _NCRYPT_CIPHER_PADDING_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_CIPHER_PADDING_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _NCRYPT_CIPHER_PADDING_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbIV$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbIV"));
    public static VarHandle pbIV$VH() {
        return _NCRYPT_CIPHER_PADDING_INFO.pbIV$VH;
    }
    public static MemoryAddress pbIV$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NCRYPT_CIPHER_PADDING_INFO.pbIV$VH.get(seg);
    }
    public static void pbIV$set( MemorySegment seg, MemoryAddress x) {
        _NCRYPT_CIPHER_PADDING_INFO.pbIV$VH.set(seg, x);
    }
    public static MemoryAddress pbIV$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NCRYPT_CIPHER_PADDING_INFO.pbIV$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbIV$set(MemorySegment seg, long index, MemoryAddress x) {
        _NCRYPT_CIPHER_PADDING_INFO.pbIV$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbIV$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbIV"));
    public static VarHandle cbIV$VH() {
        return _NCRYPT_CIPHER_PADDING_INFO.cbIV$VH;
    }
    public static int cbIV$get(MemorySegment seg) {
        return (int)_NCRYPT_CIPHER_PADDING_INFO.cbIV$VH.get(seg);
    }
    public static void cbIV$set( MemorySegment seg, int x) {
        _NCRYPT_CIPHER_PADDING_INFO.cbIV$VH.set(seg, x);
    }
    public static int cbIV$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_CIPHER_PADDING_INFO.cbIV$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbIV$set(MemorySegment seg, long index, int x) {
        _NCRYPT_CIPHER_PADDING_INFO.cbIV$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbOtherInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbOtherInfo"));
    public static VarHandle pbOtherInfo$VH() {
        return _NCRYPT_CIPHER_PADDING_INFO.pbOtherInfo$VH;
    }
    public static MemoryAddress pbOtherInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NCRYPT_CIPHER_PADDING_INFO.pbOtherInfo$VH.get(seg);
    }
    public static void pbOtherInfo$set( MemorySegment seg, MemoryAddress x) {
        _NCRYPT_CIPHER_PADDING_INFO.pbOtherInfo$VH.set(seg, x);
    }
    public static MemoryAddress pbOtherInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NCRYPT_CIPHER_PADDING_INFO.pbOtherInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbOtherInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _NCRYPT_CIPHER_PADDING_INFO.pbOtherInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbOtherInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbOtherInfo"));
    public static VarHandle cbOtherInfo$VH() {
        return _NCRYPT_CIPHER_PADDING_INFO.cbOtherInfo$VH;
    }
    public static int cbOtherInfo$get(MemorySegment seg) {
        return (int)_NCRYPT_CIPHER_PADDING_INFO.cbOtherInfo$VH.get(seg);
    }
    public static void cbOtherInfo$set( MemorySegment seg, int x) {
        _NCRYPT_CIPHER_PADDING_INFO.cbOtherInfo$VH.set(seg, x);
    }
    public static int cbOtherInfo$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_CIPHER_PADDING_INFO.cbOtherInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbOtherInfo$set(MemorySegment seg, long index, int x) {
        _NCRYPT_CIPHER_PADDING_INFO.cbOtherInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

