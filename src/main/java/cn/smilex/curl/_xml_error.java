// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _xml_error {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("_nLine"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("_pchBuf"),
        Constants$root.C_LONG$LAYOUT.withName("_cchBuf"),
        Constants$root.C_LONG$LAYOUT.withName("_ich"),
        Constants$root.C_POINTER$LAYOUT.withName("_pszFound"),
        Constants$root.C_POINTER$LAYOUT.withName("_pszExpected"),
        Constants$root.C_LONG$LAYOUT.withName("_reserved1"),
        Constants$root.C_LONG$LAYOUT.withName("_reserved2")
    ).withName("_xml_error");
    public static MemoryLayout $LAYOUT() {
        return _xml_error.$struct$LAYOUT;
    }
    static final VarHandle _nLine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_nLine"));
    public static VarHandle _nLine$VH() {
        return _xml_error._nLine$VH;
    }
    public static int _nLine$get(MemorySegment seg) {
        return (int)_xml_error._nLine$VH.get(seg);
    }
    public static void _nLine$set( MemorySegment seg, int x) {
        _xml_error._nLine$VH.set(seg, x);
    }
    public static int _nLine$get(MemorySegment seg, long index) {
        return (int)_xml_error._nLine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _nLine$set(MemorySegment seg, long index, int x) {
        _xml_error._nLine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _pchBuf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pchBuf"));
    public static VarHandle _pchBuf$VH() {
        return _xml_error._pchBuf$VH;
    }
    public static MemoryAddress _pchBuf$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_xml_error._pchBuf$VH.get(seg);
    }
    public static void _pchBuf$set( MemorySegment seg, MemoryAddress x) {
        _xml_error._pchBuf$VH.set(seg, x);
    }
    public static MemoryAddress _pchBuf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_xml_error._pchBuf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pchBuf$set(MemorySegment seg, long index, MemoryAddress x) {
        _xml_error._pchBuf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _cchBuf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_cchBuf"));
    public static VarHandle _cchBuf$VH() {
        return _xml_error._cchBuf$VH;
    }
    public static int _cchBuf$get(MemorySegment seg) {
        return (int)_xml_error._cchBuf$VH.get(seg);
    }
    public static void _cchBuf$set( MemorySegment seg, int x) {
        _xml_error._cchBuf$VH.set(seg, x);
    }
    public static int _cchBuf$get(MemorySegment seg, long index) {
        return (int)_xml_error._cchBuf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _cchBuf$set(MemorySegment seg, long index, int x) {
        _xml_error._cchBuf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _ich$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_ich"));
    public static VarHandle _ich$VH() {
        return _xml_error._ich$VH;
    }
    public static int _ich$get(MemorySegment seg) {
        return (int)_xml_error._ich$VH.get(seg);
    }
    public static void _ich$set( MemorySegment seg, int x) {
        _xml_error._ich$VH.set(seg, x);
    }
    public static int _ich$get(MemorySegment seg, long index) {
        return (int)_xml_error._ich$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _ich$set(MemorySegment seg, long index, int x) {
        _xml_error._ich$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _pszFound$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pszFound"));
    public static VarHandle _pszFound$VH() {
        return _xml_error._pszFound$VH;
    }
    public static MemoryAddress _pszFound$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_xml_error._pszFound$VH.get(seg);
    }
    public static void _pszFound$set( MemorySegment seg, MemoryAddress x) {
        _xml_error._pszFound$VH.set(seg, x);
    }
    public static MemoryAddress _pszFound$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_xml_error._pszFound$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pszFound$set(MemorySegment seg, long index, MemoryAddress x) {
        _xml_error._pszFound$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _pszExpected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pszExpected"));
    public static VarHandle _pszExpected$VH() {
        return _xml_error._pszExpected$VH;
    }
    public static MemoryAddress _pszExpected$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_xml_error._pszExpected$VH.get(seg);
    }
    public static void _pszExpected$set( MemorySegment seg, MemoryAddress x) {
        _xml_error._pszExpected$VH.set(seg, x);
    }
    public static MemoryAddress _pszExpected$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_xml_error._pszExpected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pszExpected$set(MemorySegment seg, long index, MemoryAddress x) {
        _xml_error._pszExpected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_reserved1"));
    public static VarHandle _reserved1$VH() {
        return _xml_error._reserved1$VH;
    }
    public static int _reserved1$get(MemorySegment seg) {
        return (int)_xml_error._reserved1$VH.get(seg);
    }
    public static void _reserved1$set( MemorySegment seg, int x) {
        _xml_error._reserved1$VH.set(seg, x);
    }
    public static int _reserved1$get(MemorySegment seg, long index) {
        return (int)_xml_error._reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _reserved1$set(MemorySegment seg, long index, int x) {
        _xml_error._reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_reserved2"));
    public static VarHandle _reserved2$VH() {
        return _xml_error._reserved2$VH;
    }
    public static int _reserved2$get(MemorySegment seg) {
        return (int)_xml_error._reserved2$VH.get(seg);
    }
    public static void _reserved2$set( MemorySegment seg, int x) {
        _xml_error._reserved2$VH.set(seg, x);
    }
    public static int _reserved2$get(MemorySegment seg, long index) {
        return (int)_xml_error._reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _reserved2$set(MemorySegment seg, long index, int x) {
        _xml_error._reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


