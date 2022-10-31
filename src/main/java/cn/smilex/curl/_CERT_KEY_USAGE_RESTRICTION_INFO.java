// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_KEY_USAGE_RESTRICTION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cCertPolicyId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCertPolicyId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData"),
            Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("RestrictedKeyUsage")
    ).withName("_CERT_KEY_USAGE_RESTRICTION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_KEY_USAGE_RESTRICTION_INFO.$struct$LAYOUT;
    }
    static final VarHandle cCertPolicyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCertPolicyId"));
    public static VarHandle cCertPolicyId$VH() {
        return _CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH;
    }
    public static int cCertPolicyId$get(MemorySegment seg) {
        return (int)_CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH.get(seg);
    }
    public static void cCertPolicyId$set( MemorySegment seg, int x) {
        _CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH.set(seg, x);
    }
    public static int cCertPolicyId$get(MemorySegment seg, long index) {
        return (int)_CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCertPolicyId$set(MemorySegment seg, long index, int x) {
        _CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCertPolicyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCertPolicyId"));
    public static VarHandle rgCertPolicyId$VH() {
        return _CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH;
    }
    public static MemoryAddress rgCertPolicyId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH.get(seg);
    }
    public static void rgCertPolicyId$set( MemorySegment seg, MemoryAddress x) {
        _CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH.set(seg, x);
    }
    public static MemoryAddress rgCertPolicyId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCertPolicyId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RestrictedKeyUsage$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


