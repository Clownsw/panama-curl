// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BCRYPT_PKCS1_PADDING_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszAlgId")
    ).withName("_BCRYPT_PKCS1_PADDING_INFO");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_PKCS1_PADDING_INFO.$struct$LAYOUT;
    }
    static final VarHandle pszAlgId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszAlgId"));
    public static VarHandle pszAlgId$VH() {
        return _BCRYPT_PKCS1_PADDING_INFO.pszAlgId$VH;
    }
    public static MemoryAddress pszAlgId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_PKCS1_PADDING_INFO.pszAlgId$VH.get(seg);
    }
    public static void pszAlgId$set( MemorySegment seg, MemoryAddress x) {
        _BCRYPT_PKCS1_PADDING_INFO.pszAlgId$VH.set(seg, x);
    }
    public static MemoryAddress pszAlgId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_PKCS1_PADDING_INFO.pszAlgId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszAlgId$set(MemorySegment seg, long index, MemoryAddress x) {
        _BCRYPT_PKCS1_PADDING_INFO.pszAlgId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


