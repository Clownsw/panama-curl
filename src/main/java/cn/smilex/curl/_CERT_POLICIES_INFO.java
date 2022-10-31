// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_POLICIES_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cPolicyInfo"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgPolicyInfo")
    ).withName("_CERT_POLICIES_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICIES_INFO.$struct$LAYOUT;
    }
    static final VarHandle cPolicyInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cPolicyInfo"));
    public static VarHandle cPolicyInfo$VH() {
        return _CERT_POLICIES_INFO.cPolicyInfo$VH;
    }
    public static int cPolicyInfo$get(MemorySegment seg) {
        return (int)_CERT_POLICIES_INFO.cPolicyInfo$VH.get(seg);
    }
    public static void cPolicyInfo$set( MemorySegment seg, int x) {
        _CERT_POLICIES_INFO.cPolicyInfo$VH.set(seg, x);
    }
    public static int cPolicyInfo$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICIES_INFO.cPolicyInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cPolicyInfo$set(MemorySegment seg, long index, int x) {
        _CERT_POLICIES_INFO.cPolicyInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgPolicyInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgPolicyInfo"));
    public static VarHandle rgPolicyInfo$VH() {
        return _CERT_POLICIES_INFO.rgPolicyInfo$VH;
    }
    public static MemoryAddress rgPolicyInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICIES_INFO.rgPolicyInfo$VH.get(seg);
    }
    public static void rgPolicyInfo$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICIES_INFO.rgPolicyInfo$VH.set(seg, x);
    }
    public static MemoryAddress rgPolicyInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_POLICIES_INFO.rgPolicyInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgPolicyInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICIES_INFO.rgPolicyInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


