// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_PROPERTY_REF {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszProperty"),
        Constants$root.C_LONG$LAYOUT.withName("cbValue"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbValue")
    ).withName("_CRYPT_PROPERTY_REF");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_PROPERTY_REF.$struct$LAYOUT;
    }
    static final VarHandle pszProperty$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszProperty"));
    public static VarHandle pszProperty$VH() {
        return _CRYPT_PROPERTY_REF.pszProperty$VH;
    }
    public static MemoryAddress pszProperty$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROPERTY_REF.pszProperty$VH.get(seg);
    }
    public static void pszProperty$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PROPERTY_REF.pszProperty$VH.set(seg, x);
    }
    public static MemoryAddress pszProperty$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROPERTY_REF.pszProperty$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszProperty$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PROPERTY_REF.pszProperty$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbValue"));
    public static VarHandle cbValue$VH() {
        return _CRYPT_PROPERTY_REF.cbValue$VH;
    }
    public static int cbValue$get(MemorySegment seg) {
        return (int)_CRYPT_PROPERTY_REF.cbValue$VH.get(seg);
    }
    public static void cbValue$set( MemorySegment seg, int x) {
        _CRYPT_PROPERTY_REF.cbValue$VH.set(seg, x);
    }
    public static int cbValue$get(MemorySegment seg, long index) {
        return (int)_CRYPT_PROPERTY_REF.cbValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbValue$set(MemorySegment seg, long index, int x) {
        _CRYPT_PROPERTY_REF.cbValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbValue"));
    public static VarHandle pbValue$VH() {
        return _CRYPT_PROPERTY_REF.pbValue$VH;
    }
    public static MemoryAddress pbValue$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROPERTY_REF.pbValue$VH.get(seg);
    }
    public static void pbValue$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PROPERTY_REF.pbValue$VH.set(seg, x);
    }
    public static MemoryAddress pbValue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROPERTY_REF.pbValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbValue$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PROPERTY_REF.pbValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


