// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SSL_ECCKEY_BLOB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwCurveType"),
        Constants$root.C_LONG$LAYOUT.withName("cbKey")
    ).withName("_SSL_ECCKEY_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _SSL_ECCKEY_BLOB.$struct$LAYOUT;
    }
    static final VarHandle dwCurveType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCurveType"));
    public static VarHandle dwCurveType$VH() {
        return _SSL_ECCKEY_BLOB.dwCurveType$VH;
    }
    public static int dwCurveType$get(MemorySegment seg) {
        return (int)_SSL_ECCKEY_BLOB.dwCurveType$VH.get(seg);
    }
    public static void dwCurveType$set( MemorySegment seg, int x) {
        _SSL_ECCKEY_BLOB.dwCurveType$VH.set(seg, x);
    }
    public static int dwCurveType$get(MemorySegment seg, long index) {
        return (int)_SSL_ECCKEY_BLOB.dwCurveType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCurveType$set(MemorySegment seg, long index, int x) {
        _SSL_ECCKEY_BLOB.dwCurveType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbKey"));
    public static VarHandle cbKey$VH() {
        return _SSL_ECCKEY_BLOB.cbKey$VH;
    }
    public static int cbKey$get(MemorySegment seg) {
        return (int)_SSL_ECCKEY_BLOB.cbKey$VH.get(seg);
    }
    public static void cbKey$set( MemorySegment seg, int x) {
        _SSL_ECCKEY_BLOB.cbKey$VH.set(seg, x);
    }
    public static int cbKey$get(MemorySegment seg, long index) {
        return (int)_SSL_ECCKEY_BLOB.cbKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKey$set(MemorySegment seg, long index, int x) {
        _SSL_ECCKEY_BLOB.cbKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


