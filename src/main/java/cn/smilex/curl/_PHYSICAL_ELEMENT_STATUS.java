// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PHYSICAL_ELEMENT_STATUS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("DescriptorCount"),
        Constants$root.C_LONG$LAYOUT.withName("ReturnedDescriptorCount"),
        Constants$root.C_LONG$LAYOUT.withName("ElementIdentifierBeingDepoped"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Version"),
            Constants$root.C_LONG$LAYOUT.withName("Size"),
            Constants$root.C_LONG$LAYOUT.withName("ElementIdentifier"),
            Constants$root.C_CHAR$LAYOUT.withName("PhysicalElementType"),
            Constants$root.C_CHAR$LAYOUT.withName("PhysicalElementHealth"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("AssociatedCapacity"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_LONG$LAYOUT).withName("Reserved2")
        ).withName("_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR")).withName("Descriptors")
    ).withName("_PHYSICAL_ELEMENT_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _PHYSICAL_ELEMENT_STATUS.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PHYSICAL_ELEMENT_STATUS.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _PHYSICAL_ELEMENT_STATUS.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DescriptorCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DescriptorCount"));
    public static VarHandle DescriptorCount$VH() {
        return _PHYSICAL_ELEMENT_STATUS.DescriptorCount$VH;
    }
    public static int DescriptorCount$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS.DescriptorCount$VH.get(seg);
    }
    public static void DescriptorCount$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS.DescriptorCount$VH.set(seg, x);
    }
    public static int DescriptorCount$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS.DescriptorCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DescriptorCount$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS.DescriptorCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReturnedDescriptorCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReturnedDescriptorCount"));
    public static VarHandle ReturnedDescriptorCount$VH() {
        return _PHYSICAL_ELEMENT_STATUS.ReturnedDescriptorCount$VH;
    }
    public static int ReturnedDescriptorCount$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS.ReturnedDescriptorCount$VH.get(seg);
    }
    public static void ReturnedDescriptorCount$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS.ReturnedDescriptorCount$VH.set(seg, x);
    }
    public static int ReturnedDescriptorCount$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS.ReturnedDescriptorCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReturnedDescriptorCount$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS.ReturnedDescriptorCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ElementIdentifierBeingDepoped$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ElementIdentifierBeingDepoped"));
    public static VarHandle ElementIdentifierBeingDepoped$VH() {
        return _PHYSICAL_ELEMENT_STATUS.ElementIdentifierBeingDepoped$VH;
    }
    public static int ElementIdentifierBeingDepoped$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS.ElementIdentifierBeingDepoped$VH.get(seg);
    }
    public static void ElementIdentifierBeingDepoped$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS.ElementIdentifierBeingDepoped$VH.set(seg, x);
    }
    public static int ElementIdentifierBeingDepoped$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS.ElementIdentifierBeingDepoped$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ElementIdentifierBeingDepoped$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS.ElementIdentifierBeingDepoped$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PHYSICAL_ELEMENT_STATUS.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Descriptors$slice(MemorySegment seg) {
        return seg.asSlice(24, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


