// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("EntryLength"),
        Constants$root.C_LONG$LAYOUT.withName("DependencyTypeFlags"),
        Constants$root.C_LONG$LAYOUT.withName("ProviderSpecificFlags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("DeviceId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("VendorId")
        ).withName("VirtualStorageType"),
        Constants$root.C_LONG$LAYOUT.withName("AncestorLevel"),
        Constants$root.C_LONG$LAYOUT.withName("HostVolumeNameOffset"),
        Constants$root.C_LONG$LAYOUT.withName("HostVolumeNameSize"),
        Constants$root.C_LONG$LAYOUT.withName("DependentVolumeNameOffset"),
        Constants$root.C_LONG$LAYOUT.withName("DependentVolumeNameSize"),
        Constants$root.C_LONG$LAYOUT.withName("RelativePathOffset"),
        Constants$root.C_LONG$LAYOUT.withName("RelativePathSize"),
        Constants$root.C_LONG$LAYOUT.withName("DependentDeviceNameOffset"),
        Constants$root.C_LONG$LAYOUT.withName("DependentDeviceNameSize")
    ).withName("_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle EntryLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EntryLength"));
    public static VarHandle EntryLength$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.EntryLength$VH;
    }
    public static int EntryLength$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.EntryLength$VH.get(seg);
    }
    public static void EntryLength$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.EntryLength$VH.set(seg, x);
    }
    public static int EntryLength$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.EntryLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EntryLength$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.EntryLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DependencyTypeFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DependencyTypeFlags"));
    public static VarHandle DependencyTypeFlags$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependencyTypeFlags$VH;
    }
    public static int DependencyTypeFlags$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependencyTypeFlags$VH.get(seg);
    }
    public static void DependencyTypeFlags$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependencyTypeFlags$VH.set(seg, x);
    }
    public static int DependencyTypeFlags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependencyTypeFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DependencyTypeFlags$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependencyTypeFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProviderSpecificFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProviderSpecificFlags"));
    public static VarHandle ProviderSpecificFlags$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.ProviderSpecificFlags$VH;
    }
    public static int ProviderSpecificFlags$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.ProviderSpecificFlags$VH.get(seg);
    }
    public static void ProviderSpecificFlags$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.ProviderSpecificFlags$VH.set(seg, x);
    }
    public static int ProviderSpecificFlags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.ProviderSpecificFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProviderSpecificFlags$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.ProviderSpecificFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment VirtualStorageType$slice(MemorySegment seg) {
        return seg.asSlice(12, 20);
    }
    static final VarHandle AncestorLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AncestorLevel"));
    public static VarHandle AncestorLevel$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.AncestorLevel$VH;
    }
    public static int AncestorLevel$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.AncestorLevel$VH.get(seg);
    }
    public static void AncestorLevel$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.AncestorLevel$VH.set(seg, x);
    }
    public static int AncestorLevel$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.AncestorLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AncestorLevel$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.AncestorLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HostVolumeNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HostVolumeNameOffset"));
    public static VarHandle HostVolumeNameOffset$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameOffset$VH;
    }
    public static int HostVolumeNameOffset$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameOffset$VH.get(seg);
    }
    public static void HostVolumeNameOffset$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameOffset$VH.set(seg, x);
    }
    public static int HostVolumeNameOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HostVolumeNameOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HostVolumeNameSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HostVolumeNameSize"));
    public static VarHandle HostVolumeNameSize$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameSize$VH;
    }
    public static int HostVolumeNameSize$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameSize$VH.get(seg);
    }
    public static void HostVolumeNameSize$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameSize$VH.set(seg, x);
    }
    public static int HostVolumeNameSize$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HostVolumeNameSize$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.HostVolumeNameSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DependentVolumeNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DependentVolumeNameOffset"));
    public static VarHandle DependentVolumeNameOffset$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameOffset$VH;
    }
    public static int DependentVolumeNameOffset$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameOffset$VH.get(seg);
    }
    public static void DependentVolumeNameOffset$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameOffset$VH.set(seg, x);
    }
    public static int DependentVolumeNameOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DependentVolumeNameOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DependentVolumeNameSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DependentVolumeNameSize"));
    public static VarHandle DependentVolumeNameSize$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameSize$VH;
    }
    public static int DependentVolumeNameSize$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameSize$VH.get(seg);
    }
    public static void DependentVolumeNameSize$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameSize$VH.set(seg, x);
    }
    public static int DependentVolumeNameSize$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DependentVolumeNameSize$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentVolumeNameSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RelativePathOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RelativePathOffset"));
    public static VarHandle RelativePathOffset$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathOffset$VH;
    }
    public static int RelativePathOffset$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathOffset$VH.get(seg);
    }
    public static void RelativePathOffset$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathOffset$VH.set(seg, x);
    }
    public static int RelativePathOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RelativePathOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RelativePathSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RelativePathSize"));
    public static VarHandle RelativePathSize$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathSize$VH;
    }
    public static int RelativePathSize$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathSize$VH.get(seg);
    }
    public static void RelativePathSize$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathSize$VH.set(seg, x);
    }
    public static int RelativePathSize$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RelativePathSize$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.RelativePathSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DependentDeviceNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DependentDeviceNameOffset"));
    public static VarHandle DependentDeviceNameOffset$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameOffset$VH;
    }
    public static int DependentDeviceNameOffset$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameOffset$VH.get(seg);
    }
    public static void DependentDeviceNameOffset$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameOffset$VH.set(seg, x);
    }
    public static int DependentDeviceNameOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DependentDeviceNameOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DependentDeviceNameSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DependentDeviceNameSize"));
    public static VarHandle DependentDeviceNameSize$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameSize$VH;
    }
    public static int DependentDeviceNameSize$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameSize$VH.get(seg);
    }
    public static void DependentDeviceNameSize$set( MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameSize$VH.set(seg, x);
    }
    public static int DependentDeviceNameSize$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DependentDeviceNameSize$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY.DependentDeviceNameSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


