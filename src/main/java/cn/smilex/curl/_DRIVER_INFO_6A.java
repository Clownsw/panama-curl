// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DRIVER_INFO_6A {

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
        Constants$root.C_POINTER$LAYOUT.withName("pszzPreviousNames"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftDriverDate"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwlDriverVersion"),
        Constants$root.C_POINTER$LAYOUT.withName("pszMfgName"),
        Constants$root.C_POINTER$LAYOUT.withName("pszOEMUrl"),
        Constants$root.C_POINTER$LAYOUT.withName("pszHardwareID"),
        Constants$root.C_POINTER$LAYOUT.withName("pszProvider")
    ).withName("_DRIVER_INFO_6A");
    public static MemoryLayout $LAYOUT() {
        return _DRIVER_INFO_6A.$struct$LAYOUT;
    }
    static final VarHandle cVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cVersion"));
    public static VarHandle cVersion$VH() {
        return _DRIVER_INFO_6A.cVersion$VH;
    }
    public static int cVersion$get(MemorySegment seg) {
        return (int)_DRIVER_INFO_6A.cVersion$VH.get(seg);
    }
    public static void cVersion$set( MemorySegment seg, int x) {
        _DRIVER_INFO_6A.cVersion$VH.set(seg, x);
    }
    public static int cVersion$get(MemorySegment seg, long index) {
        return (int)_DRIVER_INFO_6A.cVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cVersion$set(MemorySegment seg, long index, int x) {
        _DRIVER_INFO_6A.cVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    public static VarHandle pName$VH() {
        return _DRIVER_INFO_6A.pName$VH;
    }
    public static MemoryAddress pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pName$VH.get(seg);
    }
    public static void pName$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pName$VH.set(seg, x);
    }
    public static MemoryAddress pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEnvironment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEnvironment"));
    public static VarHandle pEnvironment$VH() {
        return _DRIVER_INFO_6A.pEnvironment$VH;
    }
    public static MemoryAddress pEnvironment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pEnvironment$VH.get(seg);
    }
    public static void pEnvironment$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pEnvironment$VH.set(seg, x);
    }
    public static MemoryAddress pEnvironment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pEnvironment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEnvironment$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pEnvironment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDriverPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDriverPath"));
    public static VarHandle pDriverPath$VH() {
        return _DRIVER_INFO_6A.pDriverPath$VH;
    }
    public static MemoryAddress pDriverPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pDriverPath$VH.get(seg);
    }
    public static void pDriverPath$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pDriverPath$VH.set(seg, x);
    }
    public static MemoryAddress pDriverPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pDriverPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pDriverPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDataFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDataFile"));
    public static VarHandle pDataFile$VH() {
        return _DRIVER_INFO_6A.pDataFile$VH;
    }
    public static MemoryAddress pDataFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pDataFile$VH.get(seg);
    }
    public static void pDataFile$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pDataFile$VH.set(seg, x);
    }
    public static MemoryAddress pDataFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pDataFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDataFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pDataFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pConfigFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pConfigFile"));
    public static VarHandle pConfigFile$VH() {
        return _DRIVER_INFO_6A.pConfigFile$VH;
    }
    public static MemoryAddress pConfigFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pConfigFile$VH.get(seg);
    }
    public static void pConfigFile$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pConfigFile$VH.set(seg, x);
    }
    public static MemoryAddress pConfigFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pConfigFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pConfigFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pConfigFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pHelpFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pHelpFile"));
    public static VarHandle pHelpFile$VH() {
        return _DRIVER_INFO_6A.pHelpFile$VH;
    }
    public static MemoryAddress pHelpFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pHelpFile$VH.get(seg);
    }
    public static void pHelpFile$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pHelpFile$VH.set(seg, x);
    }
    public static MemoryAddress pHelpFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pHelpFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pHelpFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pHelpFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDependentFiles$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDependentFiles"));
    public static VarHandle pDependentFiles$VH() {
        return _DRIVER_INFO_6A.pDependentFiles$VH;
    }
    public static MemoryAddress pDependentFiles$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pDependentFiles$VH.get(seg);
    }
    public static void pDependentFiles$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pDependentFiles$VH.set(seg, x);
    }
    public static MemoryAddress pDependentFiles$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pDependentFiles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDependentFiles$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pDependentFiles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMonitorName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMonitorName"));
    public static VarHandle pMonitorName$VH() {
        return _DRIVER_INFO_6A.pMonitorName$VH;
    }
    public static MemoryAddress pMonitorName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pMonitorName$VH.get(seg);
    }
    public static void pMonitorName$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pMonitorName$VH.set(seg, x);
    }
    public static MemoryAddress pMonitorName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pMonitorName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMonitorName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pMonitorName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDefaultDataType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDefaultDataType"));
    public static VarHandle pDefaultDataType$VH() {
        return _DRIVER_INFO_6A.pDefaultDataType$VH;
    }
    public static MemoryAddress pDefaultDataType$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pDefaultDataType$VH.get(seg);
    }
    public static void pDefaultDataType$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pDefaultDataType$VH.set(seg, x);
    }
    public static MemoryAddress pDefaultDataType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pDefaultDataType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDefaultDataType$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pDefaultDataType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszzPreviousNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszzPreviousNames"));
    public static VarHandle pszzPreviousNames$VH() {
        return _DRIVER_INFO_6A.pszzPreviousNames$VH;
    }
    public static MemoryAddress pszzPreviousNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszzPreviousNames$VH.get(seg);
    }
    public static void pszzPreviousNames$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pszzPreviousNames$VH.set(seg, x);
    }
    public static MemoryAddress pszzPreviousNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszzPreviousNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszzPreviousNames$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pszzPreviousNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ftDriverDate$slice(MemorySegment seg) {
        return seg.asSlice(88, 8);
    }
    static final VarHandle dwlDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwlDriverVersion"));
    public static VarHandle dwlDriverVersion$VH() {
        return _DRIVER_INFO_6A.dwlDriverVersion$VH;
    }
    public static long dwlDriverVersion$get(MemorySegment seg) {
        return (long)_DRIVER_INFO_6A.dwlDriverVersion$VH.get(seg);
    }
    public static void dwlDriverVersion$set( MemorySegment seg, long x) {
        _DRIVER_INFO_6A.dwlDriverVersion$VH.set(seg, x);
    }
    public static long dwlDriverVersion$get(MemorySegment seg, long index) {
        return (long)_DRIVER_INFO_6A.dwlDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwlDriverVersion$set(MemorySegment seg, long index, long x) {
        _DRIVER_INFO_6A.dwlDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszMfgName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszMfgName"));
    public static VarHandle pszMfgName$VH() {
        return _DRIVER_INFO_6A.pszMfgName$VH;
    }
    public static MemoryAddress pszMfgName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszMfgName$VH.get(seg);
    }
    public static void pszMfgName$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pszMfgName$VH.set(seg, x);
    }
    public static MemoryAddress pszMfgName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszMfgName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszMfgName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pszMfgName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszOEMUrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszOEMUrl"));
    public static VarHandle pszOEMUrl$VH() {
        return _DRIVER_INFO_6A.pszOEMUrl$VH;
    }
    public static MemoryAddress pszOEMUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszOEMUrl$VH.get(seg);
    }
    public static void pszOEMUrl$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pszOEMUrl$VH.set(seg, x);
    }
    public static MemoryAddress pszOEMUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszOEMUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOEMUrl$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pszOEMUrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszHardwareID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszHardwareID"));
    public static VarHandle pszHardwareID$VH() {
        return _DRIVER_INFO_6A.pszHardwareID$VH;
    }
    public static MemoryAddress pszHardwareID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszHardwareID$VH.get(seg);
    }
    public static void pszHardwareID$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pszHardwareID$VH.set(seg, x);
    }
    public static MemoryAddress pszHardwareID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszHardwareID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszHardwareID$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pszHardwareID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszProvider$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszProvider"));
    public static VarHandle pszProvider$VH() {
        return _DRIVER_INFO_6A.pszProvider$VH;
    }
    public static MemoryAddress pszProvider$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszProvider$VH.get(seg);
    }
    public static void pszProvider$set( MemorySegment seg, MemoryAddress x) {
        _DRIVER_INFO_6A.pszProvider$VH.set(seg, x);
    }
    public static MemoryAddress pszProvider$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DRIVER_INFO_6A.pszProvider$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszProvider$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRIVER_INFO_6A.pszProvider$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


