// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BCRYPT_OAEP_PADDING_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszAlgId"),
        Constants$root.C_POINTER$LAYOUT.withName("pbLabel"),
        Constants$root.C_LONG$LAYOUT.withName("cbLabel"),
        MemoryLayout.paddingLayout(32)
    ).withName("_BCRYPT_OAEP_PADDING_INFO");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_OAEP_PADDING_INFO.$struct$LAYOUT;
    }
    static final VarHandle pszAlgId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszAlgId"));
    public static VarHandle pszAlgId$VH() {
        return _BCRYPT_OAEP_PADDING_INFO.pszAlgId$VH;
    }
    public static MemoryAddress pszAlgId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_OAEP_PADDING_INFO.pszAlgId$VH.get(seg);
    }
    public static void pszAlgId$set( MemorySegment seg, MemoryAddress x) {
        _BCRYPT_OAEP_PADDING_INFO.pszAlgId$VH.set(seg, x);
    }
    public static MemoryAddress pszAlgId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_OAEP_PADDING_INFO.pszAlgId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszAlgId$set(MemorySegment seg, long index, MemoryAddress x) {
        _BCRYPT_OAEP_PADDING_INFO.pszAlgId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbLabel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbLabel"));
    public static VarHandle pbLabel$VH() {
        return _BCRYPT_OAEP_PADDING_INFO.pbLabel$VH;
    }
    public static MemoryAddress pbLabel$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_OAEP_PADDING_INFO.pbLabel$VH.get(seg);
    }
    public static void pbLabel$set( MemorySegment seg, MemoryAddress x) {
        _BCRYPT_OAEP_PADDING_INFO.pbLabel$VH.set(seg, x);
    }
    public static MemoryAddress pbLabel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_OAEP_PADDING_INFO.pbLabel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbLabel$set(MemorySegment seg, long index, MemoryAddress x) {
        _BCRYPT_OAEP_PADDING_INFO.pbLabel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbLabel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbLabel"));
    public static VarHandle cbLabel$VH() {
        return _BCRYPT_OAEP_PADDING_INFO.cbLabel$VH;
    }
    public static int cbLabel$get(MemorySegment seg) {
        return (int)_BCRYPT_OAEP_PADDING_INFO.cbLabel$VH.get(seg);
    }
    public static void cbLabel$set( MemorySegment seg, int x) {
        _BCRYPT_OAEP_PADDING_INFO.cbLabel$VH.set(seg, x);
    }
    public static int cbLabel$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_OAEP_PADDING_INFO.cbLabel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbLabel$set(MemorySegment seg, long index, int x) {
        _BCRYPT_OAEP_PADDING_INFO.cbLabel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


