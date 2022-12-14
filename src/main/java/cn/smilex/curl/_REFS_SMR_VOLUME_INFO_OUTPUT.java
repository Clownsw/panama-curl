// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _REFS_SMR_VOLUME_INFO_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("SizeOfRandomlyWritableTier"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("FreeSpaceInRandomlyWritableTier"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("SizeofSMRTier"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("FreeSpaceInSMRTier"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("UsableFreeSpaceInSMRTier"),
        Constants$root.C_LONG$LAYOUT.withName("VolumeGcState"),
        Constants$root.C_LONG$LAYOUT.withName("VolumeGcLastStatus"),
        MemoryLayout.sequenceLayout(7, Constants$root.C_LONG_LONG$LAYOUT).withName("Unused")
    ).withName("_REFS_SMR_VOLUME_INFO_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _REFS_SMR_VOLUME_INFO_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _REFS_SMR_VOLUME_INFO_OUTPUT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_REFS_SMR_VOLUME_INFO_OUTPUT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _REFS_SMR_VOLUME_INFO_OUTPUT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_REFS_SMR_VOLUME_INFO_OUTPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _REFS_SMR_VOLUME_INFO_OUTPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _REFS_SMR_VOLUME_INFO_OUTPUT.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_REFS_SMR_VOLUME_INFO_OUTPUT.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _REFS_SMR_VOLUME_INFO_OUTPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_REFS_SMR_VOLUME_INFO_OUTPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _REFS_SMR_VOLUME_INFO_OUTPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SizeOfRandomlyWritableTier$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment FreeSpaceInRandomlyWritableTier$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment SizeofSMRTier$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment FreeSpaceInSMRTier$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment UsableFreeSpaceInSMRTier$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    static final VarHandle VolumeGcState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeGcState"));
    public static VarHandle VolumeGcState$VH() {
        return _REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcState$VH;
    }
    public static int VolumeGcState$get(MemorySegment seg) {
        return (int)_REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcState$VH.get(seg);
    }
    public static void VolumeGcState$set( MemorySegment seg, int x) {
        _REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcState$VH.set(seg, x);
    }
    public static int VolumeGcState$get(MemorySegment seg, long index) {
        return (int)_REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeGcState$set(MemorySegment seg, long index, int x) {
        _REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeGcLastStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeGcLastStatus"));
    public static VarHandle VolumeGcLastStatus$VH() {
        return _REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcLastStatus$VH;
    }
    public static int VolumeGcLastStatus$get(MemorySegment seg) {
        return (int)_REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcLastStatus$VH.get(seg);
    }
    public static void VolumeGcLastStatus$set( MemorySegment seg, int x) {
        _REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcLastStatus$VH.set(seg, x);
    }
    public static int VolumeGcLastStatus$get(MemorySegment seg, long index) {
        return (int)_REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcLastStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeGcLastStatus$set(MemorySegment seg, long index, int x) {
        _REFS_SMR_VOLUME_INFO_OUTPUT.VolumeGcLastStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Unused$slice(MemorySegment seg) {
        return seg.asSlice(56, 56);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


