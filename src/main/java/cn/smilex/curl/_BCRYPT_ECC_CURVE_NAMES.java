// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BCRYPT_ECC_CURVE_NAMES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwEccCurveNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pEccCurveNames")
    ).withName("_BCRYPT_ECC_CURVE_NAMES");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_ECC_CURVE_NAMES.$struct$LAYOUT;
    }
    static final VarHandle dwEccCurveNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwEccCurveNames"));
    public static VarHandle dwEccCurveNames$VH() {
        return _BCRYPT_ECC_CURVE_NAMES.dwEccCurveNames$VH;
    }
    public static int dwEccCurveNames$get(MemorySegment seg) {
        return (int)_BCRYPT_ECC_CURVE_NAMES.dwEccCurveNames$VH.get(seg);
    }
    public static void dwEccCurveNames$set( MemorySegment seg, int x) {
        _BCRYPT_ECC_CURVE_NAMES.dwEccCurveNames$VH.set(seg, x);
    }
    public static int dwEccCurveNames$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_ECC_CURVE_NAMES.dwEccCurveNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEccCurveNames$set(MemorySegment seg, long index, int x) {
        _BCRYPT_ECC_CURVE_NAMES.dwEccCurveNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEccCurveNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEccCurveNames"));
    public static VarHandle pEccCurveNames$VH() {
        return _BCRYPT_ECC_CURVE_NAMES.pEccCurveNames$VH;
    }
    public static MemoryAddress pEccCurveNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_ECC_CURVE_NAMES.pEccCurveNames$VH.get(seg);
    }
    public static void pEccCurveNames$set( MemorySegment seg, MemoryAddress x) {
        _BCRYPT_ECC_CURVE_NAMES.pEccCurveNames$VH.set(seg, x);
    }
    public static MemoryAddress pEccCurveNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_ECC_CURVE_NAMES.pEccCurveNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEccCurveNames$set(MemorySegment seg, long index, MemoryAddress x) {
        _BCRYPT_ECC_CURVE_NAMES.pEccCurveNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

