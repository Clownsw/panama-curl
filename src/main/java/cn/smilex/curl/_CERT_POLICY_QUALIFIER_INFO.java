// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_POLICY_QUALIFIER_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszPolicyQualifierId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("Qualifier")
    ).withName("_CERT_POLICY_QUALIFIER_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY_QUALIFIER_INFO.$struct$LAYOUT;
    }
    static final VarHandle pszPolicyQualifierId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszPolicyQualifierId"));
    public static VarHandle pszPolicyQualifierId$VH() {
        return _CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH;
    }
    public static MemoryAddress pszPolicyQualifierId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH.get(seg);
    }
    public static void pszPolicyQualifierId$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH.set(seg, x);
    }
    public static MemoryAddress pszPolicyQualifierId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszPolicyQualifierId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Qualifier$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


