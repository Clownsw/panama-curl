// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CSV_QUERY_MDS_PATH_V2 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("RequiredSize"),
        Constants$root.C_LONG$LAYOUT.withName("MdsNodeId"),
        Constants$root.C_LONG$LAYOUT.withName("DsNodeId"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("DiskConnectivity"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("VolumeId"),
        Constants$root.C_LONG$LAYOUT.withName("IpAddressOffset"),
        Constants$root.C_LONG$LAYOUT.withName("IpAddressLength"),
        Constants$root.C_LONG$LAYOUT.withName("PathOffset"),
        Constants$root.C_LONG$LAYOUT.withName("PathLength"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CSV_QUERY_MDS_PATH_V2");
    public static MemoryLayout $LAYOUT() {
        return _CSV_QUERY_MDS_PATH_V2.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _CSV_QUERY_MDS_PATH_V2.Version$VH;
    }
    public static long Version$get(MemorySegment seg) {
        return (long)_CSV_QUERY_MDS_PATH_V2.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, long x) {
        _CSV_QUERY_MDS_PATH_V2.Version$VH.set(seg, x);
    }
    public static long Version$get(MemorySegment seg, long index) {
        return (long)_CSV_QUERY_MDS_PATH_V2.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, long x) {
        _CSV_QUERY_MDS_PATH_V2.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RequiredSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RequiredSize"));
    public static VarHandle RequiredSize$VH() {
        return _CSV_QUERY_MDS_PATH_V2.RequiredSize$VH;
    }
    public static int RequiredSize$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.RequiredSize$VH.get(seg);
    }
    public static void RequiredSize$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.RequiredSize$VH.set(seg, x);
    }
    public static int RequiredSize$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.RequiredSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RequiredSize$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.RequiredSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MdsNodeId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MdsNodeId"));
    public static VarHandle MdsNodeId$VH() {
        return _CSV_QUERY_MDS_PATH_V2.MdsNodeId$VH;
    }
    public static int MdsNodeId$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.MdsNodeId$VH.get(seg);
    }
    public static void MdsNodeId$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.MdsNodeId$VH.set(seg, x);
    }
    public static int MdsNodeId$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.MdsNodeId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MdsNodeId$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.MdsNodeId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DsNodeId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DsNodeId"));
    public static VarHandle DsNodeId$VH() {
        return _CSV_QUERY_MDS_PATH_V2.DsNodeId$VH;
    }
    public static int DsNodeId$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.DsNodeId$VH.get(seg);
    }
    public static void DsNodeId$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.DsNodeId$VH.set(seg, x);
    }
    public static int DsNodeId$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.DsNodeId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DsNodeId$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.DsNodeId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _CSV_QUERY_MDS_PATH_V2.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DiskConnectivity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DiskConnectivity"));
    public static VarHandle DiskConnectivity$VH() {
        return _CSV_QUERY_MDS_PATH_V2.DiskConnectivity$VH;
    }
    public static int DiskConnectivity$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.DiskConnectivity$VH.get(seg);
    }
    public static void DiskConnectivity$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.DiskConnectivity$VH.set(seg, x);
    }
    public static int DiskConnectivity$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.DiskConnectivity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DiskConnectivity$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.DiskConnectivity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment VolumeId$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    static final VarHandle IpAddressOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IpAddressOffset"));
    public static VarHandle IpAddressOffset$VH() {
        return _CSV_QUERY_MDS_PATH_V2.IpAddressOffset$VH;
    }
    public static int IpAddressOffset$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.IpAddressOffset$VH.get(seg);
    }
    public static void IpAddressOffset$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.IpAddressOffset$VH.set(seg, x);
    }
    public static int IpAddressOffset$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.IpAddressOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IpAddressOffset$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.IpAddressOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IpAddressLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IpAddressLength"));
    public static VarHandle IpAddressLength$VH() {
        return _CSV_QUERY_MDS_PATH_V2.IpAddressLength$VH;
    }
    public static int IpAddressLength$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.IpAddressLength$VH.get(seg);
    }
    public static void IpAddressLength$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.IpAddressLength$VH.set(seg, x);
    }
    public static int IpAddressLength$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.IpAddressLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IpAddressLength$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.IpAddressLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PathOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PathOffset"));
    public static VarHandle PathOffset$VH() {
        return _CSV_QUERY_MDS_PATH_V2.PathOffset$VH;
    }
    public static int PathOffset$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.PathOffset$VH.get(seg);
    }
    public static void PathOffset$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.PathOffset$VH.set(seg, x);
    }
    public static int PathOffset$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.PathOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PathOffset$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.PathOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PathLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PathLength"));
    public static VarHandle PathLength$VH() {
        return _CSV_QUERY_MDS_PATH_V2.PathLength$VH;
    }
    public static int PathLength$get(MemorySegment seg) {
        return (int)_CSV_QUERY_MDS_PATH_V2.PathLength$VH.get(seg);
    }
    public static void PathLength$set( MemorySegment seg, int x) {
        _CSV_QUERY_MDS_PATH_V2.PathLength$VH.set(seg, x);
    }
    public static int PathLength$get(MemorySegment seg, long index) {
        return (int)_CSV_QUERY_MDS_PATH_V2.PathLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PathLength$set(MemorySegment seg, long index, int x) {
        _CSV_QUERY_MDS_PATH_V2.PathLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


