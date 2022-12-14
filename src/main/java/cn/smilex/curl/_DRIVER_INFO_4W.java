// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DRIVER_INFO_4W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pName"),
        Constants$root.C_POINTER$LAYOUT.withName("pEnvironment"),
        Constants$root.C_POINTER$LAYOUT.withName("pDriverPath"),
        Constants$root.C_POINTER$LAYOUT.withName("pDataFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pConfigFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pHelpFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pDependentFiles"),
        Constants$root.C_POINTER$LAYOUT.withName("pMonitorName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDefaultDataType"),
        Constants$root.C_POINTER$LAYOUT.withName("pszzPreviousNames")
    ).withName("_DRIVER_INFO_4W");
    public static MemoryLayout $LAYOUT() {
        return _DRIVER_INFO_4W.$struct$LAYOUT;
    }
    static final VarHandle cVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cVersion"));
    public static VarHandle cVersion$VH() {
        return _DRIVER_INFO_4W.cVersion$VH;
    }
    public static int cVersion$get(MemorySegment seg) {
        return (int)_DRIVER_INFO_4W.cVersion$VH.get(seg);
    }
    public static void cVersion$set( MemorySegment seg, int x) {
        _DRIVER_INFO_4W.cVersion$VH.set(seg, x);
    }
    public static int cVersion$get(MemorySegment seg, long index) {
        return (int)_DRIVER_INFO_4W.cVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cVersion$set(MemorySegment seg, long index, int x) {
        _DRIVER_INFO_4W.cVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    public static VarHandle pName$VH() {
        return _DRIVER_INFO_4W.pName$VH;
    }
    public static MemoryAddress pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pName$VH.get(seg);
    }
    public static void pName$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pName$VH.set(seg, x);
    }
    public static MemoryAddress pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEnvironment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEnvironment"));
    public static VarHandle pEnvironment$VH() {
        return _DRIVER_INFO_4W.pEnvironment$VH;
    }
    public static MemoryAddress pEnvironment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pEnvironment$VH.get(seg);
    }
    public static void pEnvironment$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pEnvironment$VH.set(seg, x);
    }
    public static MemoryAddress pEnvironment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pEnvironment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEnvironment$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pEnvironment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDriverPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDriverPath"));
    public static VarHandle pDriverPath$VH() {
        return _DRIVER_INFO_4W.pDriverPath$VH;
    }
    public static MemoryAddress pDriverPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pDriverPath$VH.get(seg);
    }
    public static void pDriverPath$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pDriverPath$VH.set(seg, x);
    }
    public static MemoryAddress pDriverPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pDriverPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pDriverPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDataFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDataFile"));
    public static VarHandle pDataFile$VH() {
        return _DRIVER_INFO_4W.pDataFile$VH;
    }
    public static MemoryAddress pDataFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pDataFile$VH.get(seg);
    }
    public static void pDataFile$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pDataFile$VH.set(seg, x);
    }
    public static MemoryAddress pDataFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pDataFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDataFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pDataFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pConfigFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pConfigFile"));
    public static VarHandle pConfigFile$VH() {
        return _DRIVER_INFO_4W.pConfigFile$VH;
    }
    public static MemoryAddress pConfigFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pConfigFile$VH.get(seg);
    }
    public static void pConfigFile$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pConfigFile$VH.set(seg, x);
    }
    public static MemoryAddress pConfigFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pConfigFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pConfigFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pConfigFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pHelpFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pHelpFile"));
    public static VarHandle pHelpFile$VH() {
        return _DRIVER_INFO_4W.pHelpFile$VH;
    }
    public static MemoryAddress pHelpFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pHelpFile$VH.get(seg);
    }
    public static void pHelpFile$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pHelpFile$VH.set(seg, x);
    }
    public static MemoryAddress pHelpFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pHelpFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pHelpFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pHelpFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDependentFiles$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDependentFiles"));
    public static VarHandle pDependentFiles$VH() {
        return _DRIVER_INFO_4W.pDependentFiles$VH;
    }
    public static MemoryAddress pDependentFiles$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pDependentFiles$VH.get(seg);
    }
    public static void pDependentFiles$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pDependentFiles$VH.set(seg, x);
    }
    public static MemoryAddress pDependentFiles$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pDependentFiles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDependentFiles$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pDependentFiles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMonitorName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMonitorName"));
    public static VarHandle pMonitorName$VH() {
        return _DRIVER_INFO_4W.pMonitorName$VH;
    }
    public static MemoryAddress pMonitorName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pMonitorName$VH.get(seg);
    }
    public static void pMonitorName$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pMonitorName$VH.set(seg, x);
    }
    public static MemoryAddress pMonitorName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pMonitorName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMonitorName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pMonitorName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDefaultDataType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDefaultDataType"));
    public static VarHandle pDefaultDataType$VH() {
        return _DRIVER_INFO_4W.pDefaultDataType$VH;
    }
    public static MemoryAddress pDefaultDataType$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pDefaultDataType$VH.get(seg);
    }
    public static void pDefaultDataType$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pDefaultDataType$VH.set(seg, x);
    }
    public static MemoryAddress pDefaultDataType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pDefaultDataType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDefaultDataType$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pDefaultDataType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszzPreviousNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszzPreviousNames"));
    public static VarHandle pszzPreviousNames$VH() {
        return _DRIVER_INFO_4W.pszzPreviousNames$VH;
    }
    public static MemoryAddress pszzPreviousNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pszzPreviousNames$VH.get(seg);
    }
    public static void pszzPreviousNames$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_4W.pszzPreviousNames$VH.set(seg, x);
    }
    public static MemoryAddress pszzPreviousNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_4W.pszzPreviousNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszzPreviousNames$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_4W.pszzPreviousNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


