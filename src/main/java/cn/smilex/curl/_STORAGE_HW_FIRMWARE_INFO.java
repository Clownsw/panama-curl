// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_HW_FIRMWARE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(1).withName("SupportUpgrade"),
            MemoryLayout.paddingLayout(7).withName("Reserved0")
        ),
        Constants$root.C_CHAR$LAYOUT.withName("SlotCount"),
        Constants$root.C_CHAR$LAYOUT.withName("ActiveSlot"),
        Constants$root.C_CHAR$LAYOUT.withName("PendingActivateSlot"),
        Constants$root.C_CHAR$LAYOUT.withName("FirmwareShared"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("ImagePayloadAlignment"),
        Constants$root.C_LONG$LAYOUT.withName("ImagePayloadMaxSize"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Version"),
            Constants$root.C_LONG$LAYOUT.withName("Size"),
            Constants$root.C_CHAR$LAYOUT.withName("SlotNumber"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(1).withName("ReadOnly"),
                MemoryLayout.paddingLayout(7).withName("Reserved0")
            ),
            MemoryLayout.sequenceLayout(6, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
            MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Revision")
        ).withName("_STORAGE_HW_FIRMWARE_SLOT_INFO")).withName("Slot")
    ).withName("_STORAGE_HW_FIRMWARE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_HW_FIRMWARE_INFO.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_HW_FIRMWARE_INFO.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_INFO.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_INFO.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_INFO.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_INFO.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_HW_FIRMWARE_INFO.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_INFO.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_INFO.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_INFO.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_INFO.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SlotCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SlotCount"));
    public static VarHandle SlotCount$VH() {
        return _STORAGE_HW_FIRMWARE_INFO.SlotCount$VH;
    }
    public static byte SlotCount$get(MemorySegment seg) {
        return (byte)_STORAGE_HW_FIRMWARE_INFO.SlotCount$VH.get(seg);
    }
    public static void SlotCount$set( MemorySegment seg, byte x) {
        _STORAGE_HW_FIRMWARE_INFO.SlotCount$VH.set(seg, x);
    }
    public static byte SlotCount$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HW_FIRMWARE_INFO.SlotCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SlotCount$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HW_FIRMWARE_INFO.SlotCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ActiveSlot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActiveSlot"));
    public static VarHandle ActiveSlot$VH() {
        return _STORAGE_HW_FIRMWARE_INFO.ActiveSlot$VH;
    }
    public static byte ActiveSlot$get(MemorySegment seg) {
        return (byte)_STORAGE_HW_FIRMWARE_INFO.ActiveSlot$VH.get(seg);
    }
    public static void ActiveSlot$set( MemorySegment seg, byte x) {
        _STORAGE_HW_FIRMWARE_INFO.ActiveSlot$VH.set(seg, x);
    }
    public static byte ActiveSlot$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HW_FIRMWARE_INFO.ActiveSlot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActiveSlot$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HW_FIRMWARE_INFO.ActiveSlot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PendingActivateSlot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PendingActivateSlot"));
    public static VarHandle PendingActivateSlot$VH() {
        return _STORAGE_HW_FIRMWARE_INFO.PendingActivateSlot$VH;
    }
    public static byte PendingActivateSlot$get(MemorySegment seg) {
        return (byte)_STORAGE_HW_FIRMWARE_INFO.PendingActivateSlot$VH.get(seg);
    }
    public static void PendingActivateSlot$set( MemorySegment seg, byte x) {
        _STORAGE_HW_FIRMWARE_INFO.PendingActivateSlot$VH.set(seg, x);
    }
    public static byte PendingActivateSlot$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HW_FIRMWARE_INFO.PendingActivateSlot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PendingActivateSlot$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HW_FIRMWARE_INFO.PendingActivateSlot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirmwareShared$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirmwareShared"));
    public static VarHandle FirmwareShared$VH() {
        return _STORAGE_HW_FIRMWARE_INFO.FirmwareShared$VH;
    }
    public static byte FirmwareShared$get(MemorySegment seg) {
        return (byte)_STORAGE_HW_FIRMWARE_INFO.FirmwareShared$VH.get(seg);
    }
    public static void FirmwareShared$set( MemorySegment seg, byte x) {
        _STORAGE_HW_FIRMWARE_INFO.FirmwareShared$VH.set(seg, x);
    }
    public static byte FirmwareShared$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_HW_FIRMWARE_INFO.FirmwareShared$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirmwareShared$set(MemorySegment seg, long index, byte x) {
        _STORAGE_HW_FIRMWARE_INFO.FirmwareShared$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(13, 3);
    }
    static final VarHandle ImagePayloadAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImagePayloadAlignment"));
    public static VarHandle ImagePayloadAlignment$VH() {
        return _STORAGE_HW_FIRMWARE_INFO.ImagePayloadAlignment$VH;
    }
    public static int ImagePayloadAlignment$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_INFO.ImagePayloadAlignment$VH.get(seg);
    }
    public static void ImagePayloadAlignment$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_INFO.ImagePayloadAlignment$VH.set(seg, x);
    }
    public static int ImagePayloadAlignment$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_INFO.ImagePayloadAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImagePayloadAlignment$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_INFO.ImagePayloadAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImagePayloadMaxSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImagePayloadMaxSize"));
    public static VarHandle ImagePayloadMaxSize$VH() {
        return _STORAGE_HW_FIRMWARE_INFO.ImagePayloadMaxSize$VH;
    }
    public static int ImagePayloadMaxSize$get(MemorySegment seg) {
        return (int)_STORAGE_HW_FIRMWARE_INFO.ImagePayloadMaxSize$VH.get(seg);
    }
    public static void ImagePayloadMaxSize$set( MemorySegment seg, int x) {
        _STORAGE_HW_FIRMWARE_INFO.ImagePayloadMaxSize$VH.set(seg, x);
    }
    public static int ImagePayloadMaxSize$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_FIRMWARE_INFO.ImagePayloadMaxSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImagePayloadMaxSize$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_FIRMWARE_INFO.ImagePayloadMaxSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Slot$slice(MemorySegment seg) {
        return seg.asSlice(24, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

