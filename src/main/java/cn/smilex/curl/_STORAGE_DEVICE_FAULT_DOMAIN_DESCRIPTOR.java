// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfFaultDomains"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("_GUID")).withName("FaultDomainIds")
    ).withName("_STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfFaultDomains$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfFaultDomains"));
    public static VarHandle NumberOfFaultDomains$VH() {
        return _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.NumberOfFaultDomains$VH;
    }
    public static int NumberOfFaultDomains$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.NumberOfFaultDomains$VH.get(seg);
    }
    public static void NumberOfFaultDomains$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.NumberOfFaultDomains$VH.set(seg, x);
    }
    public static int NumberOfFaultDomains$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.NumberOfFaultDomains$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfFaultDomains$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR.NumberOfFaultDomains$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FaultDomainIds$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


