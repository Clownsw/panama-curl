// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTER_CONNECTION_INFO_1A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszDriverName")
    ).withName("_PRINTER_CONNECTION_INFO_1A");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_CONNECTION_INFO_1A.$struct$LAYOUT;
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _PRINTER_CONNECTION_INFO_1A.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_PRINTER_CONNECTION_INFO_1A.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _PRINTER_CONNECTION_INFO_1A.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_PRINTER_CONNECTION_INFO_1A.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _PRINTER_CONNECTION_INFO_1A.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszDriverName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszDriverName"));
    public static VarHandle pszDriverName$VH() {
        return _PRINTER_CONNECTION_INFO_1A.pszDriverName$VH;
    }
    public static MemoryAddress pszDriverName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_CONNECTION_INFO_1A.pszDriverName$VH.get(seg);
    }
    public static void pszDriverName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_CONNECTION_INFO_1A.pszDriverName$VH.set(seg, x);
    }
    public static MemoryAddress pszDriverName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_CONNECTION_INFO_1A.pszDriverName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszDriverName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_CONNECTION_INFO_1A.pszDriverName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


