// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPOINTER_DEVICE_PROPERTY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("logicalMin"),
        Constants$root.C_LONG$LAYOUT.withName("logicalMax"),
        Constants$root.C_LONG$LAYOUT.withName("physicalMin"),
        Constants$root.C_LONG$LAYOUT.withName("physicalMax"),
        Constants$root.C_LONG$LAYOUT.withName("unit"),
        Constants$root.C_LONG$LAYOUT.withName("unitExponent"),
        Constants$root.C_SHORT$LAYOUT.withName("usagePageId"),
        Constants$root.C_SHORT$LAYOUT.withName("usageId")
    ).withName("tagPOINTER_DEVICE_PROPERTY");
    public static MemoryLayout $LAYOUT() {
        return tagPOINTER_DEVICE_PROPERTY.$struct$LAYOUT;
    }
    static final VarHandle logicalMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("logicalMin"));
    public static VarHandle logicalMin$VH() {
        return tagPOINTER_DEVICE_PROPERTY.logicalMin$VH;
    }
    public static int logicalMin$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_PROPERTY.logicalMin$VH.get(seg);
    }
    public static void logicalMin$set( MemorySegment seg, int x) {
        tagPOINTER_DEVICE_PROPERTY.logicalMin$VH.set(seg, x);
    }
    public static int logicalMin$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_PROPERTY.logicalMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void logicalMin$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_PROPERTY.logicalMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle logicalMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("logicalMax"));
    public static VarHandle logicalMax$VH() {
        return tagPOINTER_DEVICE_PROPERTY.logicalMax$VH;
    }
    public static int logicalMax$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_PROPERTY.logicalMax$VH.get(seg);
    }
    public static void logicalMax$set( MemorySegment seg, int x) {
        tagPOINTER_DEVICE_PROPERTY.logicalMax$VH.set(seg, x);
    }
    public static int logicalMax$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_PROPERTY.logicalMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void logicalMax$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_PROPERTY.logicalMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle physicalMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("physicalMin"));
    public static VarHandle physicalMin$VH() {
        return tagPOINTER_DEVICE_PROPERTY.physicalMin$VH;
    }
    public static int physicalMin$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_PROPERTY.physicalMin$VH.get(seg);
    }
    public static void physicalMin$set( MemorySegment seg, int x) {
        tagPOINTER_DEVICE_PROPERTY.physicalMin$VH.set(seg, x);
    }
    public static int physicalMin$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_PROPERTY.physicalMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void physicalMin$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_PROPERTY.physicalMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle physicalMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("physicalMax"));
    public static VarHandle physicalMax$VH() {
        return tagPOINTER_DEVICE_PROPERTY.physicalMax$VH;
    }
    public static int physicalMax$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_PROPERTY.physicalMax$VH.get(seg);
    }
    public static void physicalMax$set( MemorySegment seg, int x) {
        tagPOINTER_DEVICE_PROPERTY.physicalMax$VH.set(seg, x);
    }
    public static int physicalMax$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_PROPERTY.physicalMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void physicalMax$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_PROPERTY.physicalMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle unit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unit"));
    public static VarHandle unit$VH() {
        return tagPOINTER_DEVICE_PROPERTY.unit$VH;
    }
    public static int unit$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_PROPERTY.unit$VH.get(seg);
    }
    public static void unit$set( MemorySegment seg, int x) {
        tagPOINTER_DEVICE_PROPERTY.unit$VH.set(seg, x);
    }
    public static int unit$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_PROPERTY.unit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unit$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_PROPERTY.unit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle unitExponent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unitExponent"));
    public static VarHandle unitExponent$VH() {
        return tagPOINTER_DEVICE_PROPERTY.unitExponent$VH;
    }
    public static int unitExponent$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_PROPERTY.unitExponent$VH.get(seg);
    }
    public static void unitExponent$set( MemorySegment seg, int x) {
        tagPOINTER_DEVICE_PROPERTY.unitExponent$VH.set(seg, x);
    }
    public static int unitExponent$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_PROPERTY.unitExponent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unitExponent$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_PROPERTY.unitExponent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle usagePageId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usagePageId"));
    public static VarHandle usagePageId$VH() {
        return tagPOINTER_DEVICE_PROPERTY.usagePageId$VH;
    }
    public static short usagePageId$get(MemorySegment seg) {
        return (short)tagPOINTER_DEVICE_PROPERTY.usagePageId$VH.get(seg);
    }
    public static void usagePageId$set( MemorySegment seg, short x) {
        tagPOINTER_DEVICE_PROPERTY.usagePageId$VH.set(seg, x);
    }
    public static short usagePageId$get(MemorySegment seg, long index) {
        return (short)tagPOINTER_DEVICE_PROPERTY.usagePageId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usagePageId$set(MemorySegment seg, long index, short x) {
        tagPOINTER_DEVICE_PROPERTY.usagePageId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle usageId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usageId"));
    public static VarHandle usageId$VH() {
        return tagPOINTER_DEVICE_PROPERTY.usageId$VH;
    }
    public static short usageId$get(MemorySegment seg) {
        return (short)tagPOINTER_DEVICE_PROPERTY.usageId$VH.get(seg);
    }
    public static void usageId$set( MemorySegment seg, short x) {
        tagPOINTER_DEVICE_PROPERTY.usageId$VH.set(seg, x);
    }
    public static short usageId$get(MemorySegment seg, long index) {
        return (short)tagPOINTER_DEVICE_PROPERTY.usageId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usageId$set(MemorySegment seg, long index, short x) {
        tagPOINTER_DEVICE_PROPERTY.usageId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


