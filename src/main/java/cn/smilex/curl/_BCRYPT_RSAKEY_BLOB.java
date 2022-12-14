// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BCRYPT_RSAKEY_BLOB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Magic"),
        Constants$root.C_LONG$LAYOUT.withName("BitLength"),
        Constants$root.C_LONG$LAYOUT.withName("cbPublicExp"),
        Constants$root.C_LONG$LAYOUT.withName("cbModulus"),
        Constants$root.C_LONG$LAYOUT.withName("cbPrime1"),
        Constants$root.C_LONG$LAYOUT.withName("cbPrime2")
    ).withName("_BCRYPT_RSAKEY_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_RSAKEY_BLOB.$struct$LAYOUT;
    }
    static final VarHandle Magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Magic"));
    public static VarHandle Magic$VH() {
        return _BCRYPT_RSAKEY_BLOB.Magic$VH;
    }
    public static int Magic$get(MemorySegment seg) {
        return (int)_BCRYPT_RSAKEY_BLOB.Magic$VH.get(seg);
    }
    public static void Magic$set( MemorySegment seg, int x) {
        _BCRYPT_RSAKEY_BLOB.Magic$VH.set(seg, x);
    }
    public static int Magic$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_RSAKEY_BLOB.Magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Magic$set(MemorySegment seg, long index, int x) {
        _BCRYPT_RSAKEY_BLOB.Magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BitLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BitLength"));
    public static VarHandle BitLength$VH() {
        return _BCRYPT_RSAKEY_BLOB.BitLength$VH;
    }
    public static int BitLength$get(MemorySegment seg) {
        return (int)_BCRYPT_RSAKEY_BLOB.BitLength$VH.get(seg);
    }
    public static void BitLength$set( MemorySegment seg, int x) {
        _BCRYPT_RSAKEY_BLOB.BitLength$VH.set(seg, x);
    }
    public static int BitLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_RSAKEY_BLOB.BitLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BitLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_RSAKEY_BLOB.BitLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbPublicExp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbPublicExp"));
    public static VarHandle cbPublicExp$VH() {
        return _BCRYPT_RSAKEY_BLOB.cbPublicExp$VH;
    }
    public static int cbPublicExp$get(MemorySegment seg) {
        return (int)_BCRYPT_RSAKEY_BLOB.cbPublicExp$VH.get(seg);
    }
    public static void cbPublicExp$set( MemorySegment seg, int x) {
        _BCRYPT_RSAKEY_BLOB.cbPublicExp$VH.set(seg, x);
    }
    public static int cbPublicExp$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_RSAKEY_BLOB.cbPublicExp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPublicExp$set(MemorySegment seg, long index, int x) {
        _BCRYPT_RSAKEY_BLOB.cbPublicExp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbModulus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbModulus"));
    public static VarHandle cbModulus$VH() {
        return _BCRYPT_RSAKEY_BLOB.cbModulus$VH;
    }
    public static int cbModulus$get(MemorySegment seg) {
        return (int)_BCRYPT_RSAKEY_BLOB.cbModulus$VH.get(seg);
    }
    public static void cbModulus$set( MemorySegment seg, int x) {
        _BCRYPT_RSAKEY_BLOB.cbModulus$VH.set(seg, x);
    }
    public static int cbModulus$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_RSAKEY_BLOB.cbModulus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbModulus$set(MemorySegment seg, long index, int x) {
        _BCRYPT_RSAKEY_BLOB.cbModulus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbPrime1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbPrime1"));
    public static VarHandle cbPrime1$VH() {
        return _BCRYPT_RSAKEY_BLOB.cbPrime1$VH;
    }
    public static int cbPrime1$get(MemorySegment seg) {
        return (int)_BCRYPT_RSAKEY_BLOB.cbPrime1$VH.get(seg);
    }
    public static void cbPrime1$set( MemorySegment seg, int x) {
        _BCRYPT_RSAKEY_BLOB.cbPrime1$VH.set(seg, x);
    }
    public static int cbPrime1$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_RSAKEY_BLOB.cbPrime1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPrime1$set(MemorySegment seg, long index, int x) {
        _BCRYPT_RSAKEY_BLOB.cbPrime1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbPrime2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbPrime2"));
    public static VarHandle cbPrime2$VH() {
        return _BCRYPT_RSAKEY_BLOB.cbPrime2$VH;
    }
    public static int cbPrime2$get(MemorySegment seg) {
        return (int)_BCRYPT_RSAKEY_BLOB.cbPrime2$VH.get(seg);
    }
    public static void cbPrime2$set( MemorySegment seg, int x) {
        _BCRYPT_RSAKEY_BLOB.cbPrime2$VH.set(seg, x);
    }
    public static int cbPrime2$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_RSAKEY_BLOB.cbPrime2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPrime2$set(MemorySegment seg, long index, int x) {
        _BCRYPT_RSAKEY_BLOB.cbPrime2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


