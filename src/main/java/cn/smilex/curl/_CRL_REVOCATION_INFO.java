// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRL_REVOCATION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pCrlEntry"),
        Constants$root.C_POINTER$LAYOUT.withName("pCrlContext"),
        Constants$root.C_POINTER$LAYOUT.withName("pCrlIssuerChain")
    ).withName("_CRL_REVOCATION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CRL_REVOCATION_INFO.$struct$LAYOUT;
    }
    static final VarHandle pCrlEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCrlEntry"));
    public static VarHandle pCrlEntry$VH() {
        return _CRL_REVOCATION_INFO.pCrlEntry$VH;
    }
    public static MemoryAddress pCrlEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRL_REVOCATION_INFO.pCrlEntry$VH.get(seg);
    }
    public static void pCrlEntry$set( MemorySegment seg, MemoryAddress x) {
        _CRL_REVOCATION_INFO.pCrlEntry$VH.set(seg, x);
    }
    public static MemoryAddress pCrlEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRL_REVOCATION_INFO.pCrlEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCrlEntry$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRL_REVOCATION_INFO.pCrlEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCrlContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCrlContext"));
    public static VarHandle pCrlContext$VH() {
        return _CRL_REVOCATION_INFO.pCrlContext$VH;
    }
    public static MemoryAddress pCrlContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRL_REVOCATION_INFO.pCrlContext$VH.get(seg);
    }
    public static void pCrlContext$set( MemorySegment seg, MemoryAddress x) {
        _CRL_REVOCATION_INFO.pCrlContext$VH.set(seg, x);
    }
    public static MemoryAddress pCrlContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRL_REVOCATION_INFO.pCrlContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCrlContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRL_REVOCATION_INFO.pCrlContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCrlIssuerChain$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCrlIssuerChain"));
    public static VarHandle pCrlIssuerChain$VH() {
        return _CRL_REVOCATION_INFO.pCrlIssuerChain$VH;
    }
    public static MemoryAddress pCrlIssuerChain$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRL_REVOCATION_INFO.pCrlIssuerChain$VH.get(seg);
    }
    public static void pCrlIssuerChain$set( MemorySegment seg, MemoryAddress x) {
        _CRL_REVOCATION_INFO.pCrlIssuerChain$VH.set(seg, x);
    }
    public static MemoryAddress pCrlIssuerChain$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRL_REVOCATION_INFO.pCrlIssuerChain$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCrlIssuerChain$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRL_REVOCATION_INFO.pCrlIssuerChain$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


