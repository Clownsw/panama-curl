// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_POLICY_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszPolicyIdentifier"),
        Constants$root.C_LONG$LAYOUT.withName("cPolicyQualifier"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgPolicyQualifier")
    ).withName("_CERT_POLICY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY_INFO.$struct$LAYOUT;
    }
    static final VarHandle pszPolicyIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszPolicyIdentifier"));
    public static VarHandle pszPolicyIdentifier$VH() {
        return _CERT_POLICY_INFO.pszPolicyIdentifier$VH;
    }
    public static MemoryAddress pszPolicyIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_INFO.pszPolicyIdentifier$VH.get(seg);
    }
    public static void pszPolicyIdentifier$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY_INFO.pszPolicyIdentifier$VH.set(seg, x);
    }
    public static MemoryAddress pszPolicyIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_INFO.pszPolicyIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszPolicyIdentifier$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY_INFO.pszPolicyIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cPolicyQualifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cPolicyQualifier"));
    public static VarHandle cPolicyQualifier$VH() {
        return _CERT_POLICY_INFO.cPolicyQualifier$VH;
    }
    public static int cPolicyQualifier$get(MemorySegment seg) {
        return (int)_CERT_POLICY_INFO.cPolicyQualifier$VH.get(seg);
    }
    public static void cPolicyQualifier$set( MemorySegment seg, int x) {
        _CERT_POLICY_INFO.cPolicyQualifier$VH.set(seg, x);
    }
    public static int cPolicyQualifier$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICY_INFO.cPolicyQualifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cPolicyQualifier$set(MemorySegment seg, long index, int x) {
        _CERT_POLICY_INFO.cPolicyQualifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgPolicyQualifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgPolicyQualifier"));
    public static VarHandle rgPolicyQualifier$VH() {
        return _CERT_POLICY_INFO.rgPolicyQualifier$VH;
    }
    public static MemoryAddress rgPolicyQualifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_INFO.rgPolicyQualifier$VH.get(seg);
    }
    public static void rgPolicyQualifier$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY_INFO.rgPolicyQualifier$VH.set(seg, x);
    }
    public static MemoryAddress rgPolicyQualifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_INFO.rgPolicyQualifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgPolicyQualifier$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY_INFO.rgPolicyQualifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

