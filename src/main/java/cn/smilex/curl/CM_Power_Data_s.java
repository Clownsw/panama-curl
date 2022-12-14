// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class CM_Power_Data_s {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PD_Size"),
        Constants$root.C_LONG$LAYOUT.withName("PD_MostRecentPowerState"),
        Constants$root.C_LONG$LAYOUT.withName("PD_Capabilities"),
        Constants$root.C_LONG$LAYOUT.withName("PD_D1Latency"),
        Constants$root.C_LONG$LAYOUT.withName("PD_D2Latency"),
        Constants$root.C_LONG$LAYOUT.withName("PD_D3Latency"),
        MemoryLayout.sequenceLayout(7, Constants$root.C_LONG$LAYOUT).withName("PD_PowerStateMapping"),
        Constants$root.C_LONG$LAYOUT.withName("PD_DeepestSystemWake")
    ).withName("CM_Power_Data_s");
    public static MemoryLayout $LAYOUT() {
        return CM_Power_Data_s.$struct$LAYOUT;
    }
    static final VarHandle PD_Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PD_Size"));
    public static VarHandle PD_Size$VH() {
        return CM_Power_Data_s.PD_Size$VH;
    }
    public static int PD_Size$get(MemorySegment seg) {
        return (int)CM_Power_Data_s.PD_Size$VH.get(seg);
    }
    public static void PD_Size$set( MemorySegment seg, int x) {
        CM_Power_Data_s.PD_Size$VH.set(seg, x);
    }
    public static int PD_Size$get(MemorySegment seg, long index) {
        return (int)CM_Power_Data_s.PD_Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PD_Size$set(MemorySegment seg, long index, int x) {
        CM_Power_Data_s.PD_Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PD_MostRecentPowerState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PD_MostRecentPowerState"));
    public static VarHandle PD_MostRecentPowerState$VH() {
        return CM_Power_Data_s.PD_MostRecentPowerState$VH;
    }
    public static int PD_MostRecentPowerState$get(MemorySegment seg) {
        return (int)CM_Power_Data_s.PD_MostRecentPowerState$VH.get(seg);
    }
    public static void PD_MostRecentPowerState$set( MemorySegment seg, int x) {
        CM_Power_Data_s.PD_MostRecentPowerState$VH.set(seg, x);
    }
    public static int PD_MostRecentPowerState$get(MemorySegment seg, long index) {
        return (int)CM_Power_Data_s.PD_MostRecentPowerState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PD_MostRecentPowerState$set(MemorySegment seg, long index, int x) {
        CM_Power_Data_s.PD_MostRecentPowerState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PD_Capabilities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PD_Capabilities"));
    public static VarHandle PD_Capabilities$VH() {
        return CM_Power_Data_s.PD_Capabilities$VH;
    }
    public static int PD_Capabilities$get(MemorySegment seg) {
        return (int)CM_Power_Data_s.PD_Capabilities$VH.get(seg);
    }
    public static void PD_Capabilities$set( MemorySegment seg, int x) {
        CM_Power_Data_s.PD_Capabilities$VH.set(seg, x);
    }
    public static int PD_Capabilities$get(MemorySegment seg, long index) {
        return (int)CM_Power_Data_s.PD_Capabilities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PD_Capabilities$set(MemorySegment seg, long index, int x) {
        CM_Power_Data_s.PD_Capabilities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PD_D1Latency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PD_D1Latency"));
    public static VarHandle PD_D1Latency$VH() {
        return CM_Power_Data_s.PD_D1Latency$VH;
    }
    public static int PD_D1Latency$get(MemorySegment seg) {
        return (int)CM_Power_Data_s.PD_D1Latency$VH.get(seg);
    }
    public static void PD_D1Latency$set( MemorySegment seg, int x) {
        CM_Power_Data_s.PD_D1Latency$VH.set(seg, x);
    }
    public static int PD_D1Latency$get(MemorySegment seg, long index) {
        return (int)CM_Power_Data_s.PD_D1Latency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PD_D1Latency$set(MemorySegment seg, long index, int x) {
        CM_Power_Data_s.PD_D1Latency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PD_D2Latency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PD_D2Latency"));
    public static VarHandle PD_D2Latency$VH() {
        return CM_Power_Data_s.PD_D2Latency$VH;
    }
    public static int PD_D2Latency$get(MemorySegment seg) {
        return (int)CM_Power_Data_s.PD_D2Latency$VH.get(seg);
    }
    public static void PD_D2Latency$set( MemorySegment seg, int x) {
        CM_Power_Data_s.PD_D2Latency$VH.set(seg, x);
    }
    public static int PD_D2Latency$get(MemorySegment seg, long index) {
        return (int)CM_Power_Data_s.PD_D2Latency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PD_D2Latency$set(MemorySegment seg, long index, int x) {
        CM_Power_Data_s.PD_D2Latency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PD_D3Latency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PD_D3Latency"));
    public static VarHandle PD_D3Latency$VH() {
        return CM_Power_Data_s.PD_D3Latency$VH;
    }
    public static int PD_D3Latency$get(MemorySegment seg) {
        return (int)CM_Power_Data_s.PD_D3Latency$VH.get(seg);
    }
    public static void PD_D3Latency$set( MemorySegment seg, int x) {
        CM_Power_Data_s.PD_D3Latency$VH.set(seg, x);
    }
    public static int PD_D3Latency$get(MemorySegment seg, long index) {
        return (int)CM_Power_Data_s.PD_D3Latency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PD_D3Latency$set(MemorySegment seg, long index, int x) {
        CM_Power_Data_s.PD_D3Latency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PD_PowerStateMapping$slice(MemorySegment seg) {
        return seg.asSlice(24, 28);
    }
    static final VarHandle PD_DeepestSystemWake$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PD_DeepestSystemWake"));
    public static VarHandle PD_DeepestSystemWake$VH() {
        return CM_Power_Data_s.PD_DeepestSystemWake$VH;
    }
    public static int PD_DeepestSystemWake$get(MemorySegment seg) {
        return (int)CM_Power_Data_s.PD_DeepestSystemWake$VH.get(seg);
    }
    public static void PD_DeepestSystemWake$set( MemorySegment seg, int x) {
        CM_Power_Data_s.PD_DeepestSystemWake$VH.set(seg, x);
    }
    public static int PD_DeepestSystemWake$get(MemorySegment seg, long index) {
        return (int)CM_Power_Data_s.PD_DeepestSystemWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PD_DeepestSystemWake$set(MemorySegment seg, long index, int x) {
        CM_Power_Data_s.PD_DeepestSystemWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


