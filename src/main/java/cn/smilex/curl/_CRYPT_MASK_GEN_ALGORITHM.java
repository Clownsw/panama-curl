// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_MASK_GEN_ALGORITHM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm")
    ).withName("_CRYPT_MASK_GEN_ALGORITHM");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_MASK_GEN_ALGORITHM.$struct$LAYOUT;
    }
    static final VarHandle pszObjId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszObjId"));
    public static VarHandle pszObjId$VH() {
        return _CRYPT_MASK_GEN_ALGORITHM.pszObjId$VH;
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_MASK_GEN_ALGORITHM.pszObjId$VH.get(seg);
    }
    public static void pszObjId$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_MASK_GEN_ALGORITHM.pszObjId$VH.set(seg, x);
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_MASK_GEN_ALGORITHM.pszObjId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_MASK_GEN_ALGORITHM.pszObjId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


