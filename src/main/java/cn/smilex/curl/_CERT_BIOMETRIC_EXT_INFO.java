// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_BIOMETRIC_EXT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cBiometricData"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgBiometricData")
    ).withName("_CERT_BIOMETRIC_EXT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_BIOMETRIC_EXT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cBiometricData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBiometricData"));
    public static VarHandle cBiometricData$VH() {
        return _CERT_BIOMETRIC_EXT_INFO.cBiometricData$VH;
    }
    public static int cBiometricData$get(MemorySegment seg) {
        return (int)_CERT_BIOMETRIC_EXT_INFO.cBiometricData$VH.get(seg);
    }
    public static void cBiometricData$set( MemorySegment seg, int x) {
        _CERT_BIOMETRIC_EXT_INFO.cBiometricData$VH.set(seg, x);
    }
    public static int cBiometricData$get(MemorySegment seg, long index) {
        return (int)_CERT_BIOMETRIC_EXT_INFO.cBiometricData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBiometricData$set(MemorySegment seg, long index, int x) {
        _CERT_BIOMETRIC_EXT_INFO.cBiometricData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgBiometricData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgBiometricData"));
    public static VarHandle rgBiometricData$VH() {
        return _CERT_BIOMETRIC_EXT_INFO.rgBiometricData$VH;
    }
    public static MemoryAddress rgBiometricData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_BIOMETRIC_EXT_INFO.rgBiometricData$VH.get(seg);
    }
    public static void rgBiometricData$set( MemorySegment seg, MemoryAddress x) {
        _CERT_BIOMETRIC_EXT_INFO.rgBiometricData$VH.set(seg, x);
    }
    public static MemoryAddress rgBiometricData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_BIOMETRIC_EXT_INFO.rgBiometricData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgBiometricData$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_BIOMETRIC_EXT_INFO.rgBiometricData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


