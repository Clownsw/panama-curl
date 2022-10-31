// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PORT_INFO_2A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pPortName"),
        Constants$root.C_POINTER$LAYOUT.withName("pMonitorName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDescription"),
        Constants$root.C_LONG$LAYOUT.withName("fPortType"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved")
    ).withName("_PORT_INFO_2A");
    public static MemoryLayout $LAYOUT() {
        return _PORT_INFO_2A.$struct$LAYOUT;
    }
    static final VarHandle pPortName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPortName"));
    public static VarHandle pPortName$VH() {
        return _PORT_INFO_2A.pPortName$VH;
    }
    public static MemoryAddress pPortName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PORT_INFO_2A.pPortName$VH.get(seg);
    }
    public static void pPortName$set( MemorySegment seg, MemoryAddress x) {
        _PORT_INFO_2A.pPortName$VH.set(seg, x);
    }
    public static MemoryAddress pPortName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PORT_INFO_2A.pPortName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPortName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PORT_INFO_2A.pPortName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMonitorName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMonitorName"));
    public static VarHandle pMonitorName$VH() {
        return _PORT_INFO_2A.pMonitorName$VH;
    }
    public static MemoryAddress pMonitorName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PORT_INFO_2A.pMonitorName$VH.get(seg);
    }
    public static void pMonitorName$set( MemorySegment seg, MemoryAddress x) {
        _PORT_INFO_2A.pMonitorName$VH.set(seg, x);
    }
    public static MemoryAddress pMonitorName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PORT_INFO_2A.pMonitorName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMonitorName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PORT_INFO_2A.pMonitorName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDescription$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDescription"));
    public static VarHandle pDescription$VH() {
        return _PORT_INFO_2A.pDescription$VH;
    }
    public static MemoryAddress pDescription$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PORT_INFO_2A.pDescription$VH.get(seg);
    }
    public static void pDescription$set( MemorySegment seg, MemoryAddress x) {
        _PORT_INFO_2A.pDescription$VH.set(seg, x);
    }
    public static MemoryAddress pDescription$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PORT_INFO_2A.pDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDescription$set(MemorySegment seg, long index, MemoryAddress x) {
        _PORT_INFO_2A.pDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fPortType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fPortType"));
    public static VarHandle fPortType$VH() {
        return _PORT_INFO_2A.fPortType$VH;
    }
    public static int fPortType$get(MemorySegment seg) {
        return (int)_PORT_INFO_2A.fPortType$VH.get(seg);
    }
    public static void fPortType$set( MemorySegment seg, int x) {
        _PORT_INFO_2A.fPortType$VH.set(seg, x);
    }
    public static int fPortType$get(MemorySegment seg, long index) {
        return (int)_PORT_INFO_2A.fPortType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fPortType$set(MemorySegment seg, long index, int x) {
        _PORT_INFO_2A.fPortType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PORT_INFO_2A.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_PORT_INFO_2A.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _PORT_INFO_2A.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_PORT_INFO_2A.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _PORT_INFO_2A.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


