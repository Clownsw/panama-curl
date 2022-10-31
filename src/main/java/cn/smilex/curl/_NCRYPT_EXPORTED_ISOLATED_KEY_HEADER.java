// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("KeyUsage"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(1).withName("PerBootKey"),
            MemoryLayout.paddingLayout(31).withName("Reserved")
        ),
        Constants$root.C_LONG$LAYOUT.withName("cbAlgName"),
        Constants$root.C_LONG$LAYOUT.withName("cbNonce"),
        Constants$root.C_LONG$LAYOUT.withName("cbAuthTag"),
        Constants$root.C_LONG$LAYOUT.withName("cbWrappingKey"),
        Constants$root.C_LONG$LAYOUT.withName("cbIsolatedKey")
    ).withName("_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle KeyUsage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("KeyUsage"));
    public static VarHandle KeyUsage$VH() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.KeyUsage$VH;
    }
    public static int KeyUsage$get(MemorySegment seg) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.KeyUsage$VH.get(seg);
    }
    public static void KeyUsage$set( MemorySegment seg, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.KeyUsage$VH.set(seg, x);
    }
    public static int KeyUsage$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.KeyUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KeyUsage$set(MemorySegment seg, long index, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.KeyUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbAlgName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbAlgName"));
    public static VarHandle cbAlgName$VH() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAlgName$VH;
    }
    public static int cbAlgName$get(MemorySegment seg) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAlgName$VH.get(seg);
    }
    public static void cbAlgName$set( MemorySegment seg, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAlgName$VH.set(seg, x);
    }
    public static int cbAlgName$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAlgName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAlgName$set(MemorySegment seg, long index, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAlgName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbNonce$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbNonce"));
    public static VarHandle cbNonce$VH() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbNonce$VH;
    }
    public static int cbNonce$get(MemorySegment seg) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbNonce$VH.get(seg);
    }
    public static void cbNonce$set( MemorySegment seg, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbNonce$VH.set(seg, x);
    }
    public static int cbNonce$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbNonce$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbNonce$set(MemorySegment seg, long index, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbNonce$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbAuthTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbAuthTag"));
    public static VarHandle cbAuthTag$VH() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAuthTag$VH;
    }
    public static int cbAuthTag$get(MemorySegment seg) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAuthTag$VH.get(seg);
    }
    public static void cbAuthTag$set( MemorySegment seg, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAuthTag$VH.set(seg, x);
    }
    public static int cbAuthTag$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAuthTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAuthTag$set(MemorySegment seg, long index, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbAuthTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbWrappingKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbWrappingKey"));
    public static VarHandle cbWrappingKey$VH() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbWrappingKey$VH;
    }
    public static int cbWrappingKey$get(MemorySegment seg) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbWrappingKey$VH.get(seg);
    }
    public static void cbWrappingKey$set( MemorySegment seg, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbWrappingKey$VH.set(seg, x);
    }
    public static int cbWrappingKey$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbWrappingKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbWrappingKey$set(MemorySegment seg, long index, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbWrappingKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbIsolatedKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbIsolatedKey"));
    public static VarHandle cbIsolatedKey$VH() {
        return _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbIsolatedKey$VH;
    }
    public static int cbIsolatedKey$get(MemorySegment seg) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbIsolatedKey$VH.get(seg);
    }
    public static void cbIsolatedKey$set( MemorySegment seg, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbIsolatedKey$VH.set(seg, x);
    }
    public static int cbIsolatedKey$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbIsolatedKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbIsolatedKey$set(MemorySegment seg, long index, int x) {
        _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER.cbIsolatedKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


