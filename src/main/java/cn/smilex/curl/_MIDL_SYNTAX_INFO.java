// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MIDL_SYNTAX_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("SyntaxGUID"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
                Constants$root.C_SHORT$LAYOUT.withName("MinorVersion")
            ).withName("SyntaxVersion")
        ).withName("TransferSyntax"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("DispatchTable"),
        Constants$root.C_POINTER$LAYOUT.withName("ProcString"),
        Constants$root.C_POINTER$LAYOUT.withName("FmtStringOffset"),
        Constants$root.C_POINTER$LAYOUT.withName("TypeString"),
        Constants$root.C_POINTER$LAYOUT.withName("aUserMarshalQuadruple"),
        Constants$root.C_POINTER$LAYOUT.withName("pMethodProperties"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("pReserved2")
    ).withName("_MIDL_SYNTAX_INFO");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_SYNTAX_INFO.$struct$LAYOUT;
    }
    public static MemorySegment TransferSyntax$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    static final VarHandle DispatchTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DispatchTable"));
    public static VarHandle DispatchTable$VH() {
        return _MIDL_SYNTAX_INFO.DispatchTable$VH;
    }
    public static MemoryAddress DispatchTable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.DispatchTable$VH.get(seg);
    }
    public static void DispatchTable$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.DispatchTable$VH.set(seg, x);
    }
    public static MemoryAddress DispatchTable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.DispatchTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DispatchTable$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.DispatchTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcString"));
    public static VarHandle ProcString$VH() {
        return _MIDL_SYNTAX_INFO.ProcString$VH;
    }
    public static MemoryAddress ProcString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.ProcString$VH.get(seg);
    }
    public static void ProcString$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.ProcString$VH.set(seg, x);
    }
    public static MemoryAddress ProcString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.ProcString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcString$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.ProcString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FmtStringOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FmtStringOffset"));
    public static VarHandle FmtStringOffset$VH() {
        return _MIDL_SYNTAX_INFO.FmtStringOffset$VH;
    }
    public static MemoryAddress FmtStringOffset$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.FmtStringOffset$VH.get(seg);
    }
    public static void FmtStringOffset$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.FmtStringOffset$VH.set(seg, x);
    }
    public static MemoryAddress FmtStringOffset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.FmtStringOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FmtStringOffset$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.FmtStringOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TypeString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TypeString"));
    public static VarHandle TypeString$VH() {
        return _MIDL_SYNTAX_INFO.TypeString$VH;
    }
    public static MemoryAddress TypeString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.TypeString$VH.get(seg);
    }
    public static void TypeString$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.TypeString$VH.set(seg, x);
    }
    public static MemoryAddress TypeString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.TypeString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TypeString$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.TypeString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle aUserMarshalQuadruple$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("aUserMarshalQuadruple"));
    public static VarHandle aUserMarshalQuadruple$VH() {
        return _MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH;
    }
    public static MemoryAddress aUserMarshalQuadruple$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH.get(seg);
    }
    public static void aUserMarshalQuadruple$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH.set(seg, x);
    }
    public static MemoryAddress aUserMarshalQuadruple$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void aUserMarshalQuadruple$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMethodProperties$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMethodProperties"));
    public static VarHandle pMethodProperties$VH() {
        return _MIDL_SYNTAX_INFO.pMethodProperties$VH;
    }
    public static MemoryAddress pMethodProperties$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.pMethodProperties$VH.get(seg);
    }
    public static void pMethodProperties$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.pMethodProperties$VH.set(seg, x);
    }
    public static MemoryAddress pMethodProperties$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.pMethodProperties$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMethodProperties$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.pMethodProperties$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pReserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pReserved2"));
    public static VarHandle pReserved2$VH() {
        return _MIDL_SYNTAX_INFO.pReserved2$VH;
    }
    public static long pReserved2$get(MemorySegment seg) {
        return (long)_MIDL_SYNTAX_INFO.pReserved2$VH.get(seg);
    }
    public static void pReserved2$set( MemorySegment seg, long x) {
        _MIDL_SYNTAX_INFO.pReserved2$VH.set(seg, x);
    }
    public static long pReserved2$get(MemorySegment seg, long index) {
        return (long)_MIDL_SYNTAX_INFO.pReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pReserved2$set(MemorySegment seg, long index, long x) {
        _MIDL_SYNTAX_INFO.pReserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


