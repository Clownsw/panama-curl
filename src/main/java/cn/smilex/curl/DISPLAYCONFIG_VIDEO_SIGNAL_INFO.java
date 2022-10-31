// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DISPLAYCONFIG_VIDEO_SIGNAL_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("pixelRate"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Numerator"),
            Constants$root.C_LONG$LAYOUT.withName("Denominator")
        ).withName("hSyncFreq"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Numerator"),
            Constants$root.C_LONG$LAYOUT.withName("Denominator")
        ).withName("vSyncFreq"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cx"),
            Constants$root.C_LONG$LAYOUT.withName("cy")
        ).withName("activeSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cx"),
            Constants$root.C_LONG$LAYOUT.withName("cy")
        ).withName("totalSize"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(16).withName("videoStandard"),
                    MemoryLayout.paddingLayout(6).withName("vSyncFreqDivider"),
                    MemoryLayout.paddingLayout(10).withName("reserved")
                )
            ).withName("AdditionalSignalInfo"),
            Constants$root.C_LONG$LAYOUT.withName("videoStandard")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("scanLineOrdering")
    ).withName("DISPLAYCONFIG_VIDEO_SIGNAL_INFO");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_VIDEO_SIGNAL_INFO.$struct$LAYOUT;
    }
    static final VarHandle pixelRate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pixelRate"));
    public static VarHandle pixelRate$VH() {
        return DISPLAYCONFIG_VIDEO_SIGNAL_INFO.pixelRate$VH;
    }
    public static long pixelRate$get(MemorySegment seg) {
        return (long)DISPLAYCONFIG_VIDEO_SIGNAL_INFO.pixelRate$VH.get(seg);
    }
    public static void pixelRate$set( MemorySegment seg, long x) {
        DISPLAYCONFIG_VIDEO_SIGNAL_INFO.pixelRate$VH.set(seg, x);
    }
    public static long pixelRate$get(MemorySegment seg, long index) {
        return (long)DISPLAYCONFIG_VIDEO_SIGNAL_INFO.pixelRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pixelRate$set(MemorySegment seg, long index, long x) {
        DISPLAYCONFIG_VIDEO_SIGNAL_INFO.pixelRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment hSyncFreq$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment vSyncFreq$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment activeSize$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment totalSize$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static class AdditionalSignalInfo {

        static final  GroupLayout AdditionalSignalInfo$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(16).withName("videoStandard"),
                MemoryLayout.paddingLayout(6).withName("vSyncFreqDivider"),
                MemoryLayout.paddingLayout(10).withName("reserved")
            )
        );
        public static MemoryLayout $LAYOUT() {
            return AdditionalSignalInfo.AdditionalSignalInfo$struct$LAYOUT;
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment AdditionalSignalInfo$slice(MemorySegment seg) {
        return seg.asSlice(40, 4);
    }
    static final VarHandle videoStandard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("videoStandard"));
    public static VarHandle videoStandard$VH() {
        return DISPLAYCONFIG_VIDEO_SIGNAL_INFO.videoStandard$VH;
    }
    public static int videoStandard$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_VIDEO_SIGNAL_INFO.videoStandard$VH.get(seg);
    }
    public static void videoStandard$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_VIDEO_SIGNAL_INFO.videoStandard$VH.set(seg, x);
    }
    public static int videoStandard$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_VIDEO_SIGNAL_INFO.videoStandard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void videoStandard$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_VIDEO_SIGNAL_INFO.videoStandard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle scanLineOrdering$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("scanLineOrdering"));
    public static VarHandle scanLineOrdering$VH() {
        return DISPLAYCONFIG_VIDEO_SIGNAL_INFO.scanLineOrdering$VH;
    }
    public static int scanLineOrdering$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_VIDEO_SIGNAL_INFO.scanLineOrdering$VH.get(seg);
    }
    public static void scanLineOrdering$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_VIDEO_SIGNAL_INFO.scanLineOrdering$VH.set(seg, x);
    }
    public static int scanLineOrdering$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_VIDEO_SIGNAL_INFO.scanLineOrdering$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scanLineOrdering$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_VIDEO_SIGNAL_INFO.scanLineOrdering$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


