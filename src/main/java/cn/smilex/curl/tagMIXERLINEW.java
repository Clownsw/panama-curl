// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMIXERLINEW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStruct"),
        Constants$root.C_LONG$LAYOUT.withName("dwDestination"),
        Constants$root.C_LONG$LAYOUT.withName("dwSource"),
        Constants$root.C_LONG$LAYOUT.withName("dwLineID"),
        Constants$root.C_LONG$LAYOUT.withName("fdwLine"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwUser"),
        Constants$root.C_LONG$LAYOUT.withName("dwComponentType"),
        Constants$root.C_LONG$LAYOUT.withName("cChannels"),
        Constants$root.C_LONG$LAYOUT.withName("cConnections"),
        Constants$root.C_LONG$LAYOUT.withName("cControls"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_SHORT$LAYOUT).withName("szShortName"),
        MemoryLayout.sequenceLayout(64, Constants$root.C_SHORT$LAYOUT).withName("szName"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwType"),
            Constants$root.C_LONG$LAYOUT.withName("dwDeviceID"),
            Constants$root.C_SHORT$LAYOUT.withName("wMid"),
            Constants$root.C_SHORT$LAYOUT.withName("wPid"),
            Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szPname")
        ).withName("Target")
    ).withName("tagMIXERLINEW");
    public static MemoryLayout $LAYOUT() {
        return tagMIXERLINEW.$struct$LAYOUT;
    }
    static final VarHandle cbStruct$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStruct"));
    public static VarHandle cbStruct$VH() {
        return tagMIXERLINEW.cbStruct$VH;
    }
    public static int cbStruct$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.cbStruct$VH.get(seg);
    }
    public static void cbStruct$set( MemorySegment seg, int x) {
        tagMIXERLINEW.cbStruct$VH.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.cbStruct$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.cbStruct$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDestination$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDestination"));
    public static VarHandle dwDestination$VH() {
        return tagMIXERLINEW.dwDestination$VH;
    }
    public static int dwDestination$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.dwDestination$VH.get(seg);
    }
    public static void dwDestination$set( MemorySegment seg, int x) {
        tagMIXERLINEW.dwDestination$VH.set(seg, x);
    }
    public static int dwDestination$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.dwDestination$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDestination$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.dwDestination$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSource"));
    public static VarHandle dwSource$VH() {
        return tagMIXERLINEW.dwSource$VH;
    }
    public static int dwSource$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.dwSource$VH.get(seg);
    }
    public static void dwSource$set( MemorySegment seg, int x) {
        tagMIXERLINEW.dwSource$VH.set(seg, x);
    }
    public static int dwSource$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.dwSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSource$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.dwSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLineID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLineID"));
    public static VarHandle dwLineID$VH() {
        return tagMIXERLINEW.dwLineID$VH;
    }
    public static int dwLineID$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.dwLineID$VH.get(seg);
    }
    public static void dwLineID$set( MemorySegment seg, int x) {
        tagMIXERLINEW.dwLineID$VH.set(seg, x);
    }
    public static int dwLineID$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.dwLineID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLineID$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.dwLineID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fdwLine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fdwLine"));
    public static VarHandle fdwLine$VH() {
        return tagMIXERLINEW.fdwLine$VH;
    }
    public static int fdwLine$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.fdwLine$VH.get(seg);
    }
    public static void fdwLine$set( MemorySegment seg, int x) {
        tagMIXERLINEW.fdwLine$VH.set(seg, x);
    }
    public static int fdwLine$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.fdwLine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fdwLine$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.fdwLine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwUser$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwUser"));
    public static VarHandle dwUser$VH() {
        return tagMIXERLINEW.dwUser$VH;
    }
    public static long dwUser$get(MemorySegment seg) {
        return (long)tagMIXERLINEW.dwUser$VH.get(seg);
    }
    public static void dwUser$set( MemorySegment seg, long x) {
        tagMIXERLINEW.dwUser$VH.set(seg, x);
    }
    public static long dwUser$get(MemorySegment seg, long index) {
        return (long)tagMIXERLINEW.dwUser$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwUser$set(MemorySegment seg, long index, long x) {
        tagMIXERLINEW.dwUser$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwComponentType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwComponentType"));
    public static VarHandle dwComponentType$VH() {
        return tagMIXERLINEW.dwComponentType$VH;
    }
    public static int dwComponentType$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.dwComponentType$VH.get(seg);
    }
    public static void dwComponentType$set( MemorySegment seg, int x) {
        tagMIXERLINEW.dwComponentType$VH.set(seg, x);
    }
    public static int dwComponentType$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.dwComponentType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwComponentType$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.dwComponentType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cChannels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cChannels"));
    public static VarHandle cChannels$VH() {
        return tagMIXERLINEW.cChannels$VH;
    }
    public static int cChannels$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.cChannels$VH.get(seg);
    }
    public static void cChannels$set( MemorySegment seg, int x) {
        tagMIXERLINEW.cChannels$VH.set(seg, x);
    }
    public static int cChannels$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.cChannels$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cChannels$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.cChannels$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cConnections$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cConnections"));
    public static VarHandle cConnections$VH() {
        return tagMIXERLINEW.cConnections$VH;
    }
    public static int cConnections$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.cConnections$VH.get(seg);
    }
    public static void cConnections$set( MemorySegment seg, int x) {
        tagMIXERLINEW.cConnections$VH.set(seg, x);
    }
    public static int cConnections$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.cConnections$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cConnections$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.cConnections$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cControls$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cControls"));
    public static VarHandle cControls$VH() {
        return tagMIXERLINEW.cControls$VH;
    }
    public static int cControls$get(MemorySegment seg) {
        return (int)tagMIXERLINEW.cControls$VH.get(seg);
    }
    public static void cControls$set( MemorySegment seg, int x) {
        tagMIXERLINEW.cControls$VH.set(seg, x);
    }
    public static int cControls$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINEW.cControls$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cControls$set(MemorySegment seg, long index, int x) {
        tagMIXERLINEW.cControls$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szShortName$slice(MemorySegment seg) {
        return seg.asSlice(44, 32);
    }
    public static MemorySegment szName$slice(MemorySegment seg) {
        return seg.asSlice(76, 128);
    }
    public static class Target {

        static final  GroupLayout Target$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwType"),
            Constants$root.C_LONG$LAYOUT.withName("dwDeviceID"),
            Constants$root.C_SHORT$LAYOUT.withName("wMid"),
            Constants$root.C_SHORT$LAYOUT.withName("wPid"),
            Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szPname")
        );
        public static MemoryLayout $LAYOUT() {
            return Target.Target$struct$LAYOUT;
        }
        static final VarHandle dwType$VH = Target$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
        public static VarHandle dwType$VH() {
            return Target.dwType$VH;
        }
        public static int dwType$get(MemorySegment seg) {
            return (int)Target.dwType$VH.get(seg);
        }
        public static void dwType$set( MemorySegment seg, int x) {
            Target.dwType$VH.set(seg, x);
        }
        public static int dwType$get(MemorySegment seg, long index) {
            return (int)Target.dwType$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwType$set(MemorySegment seg, long index, int x) {
            Target.dwType$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwDeviceID$VH = Target$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDeviceID"));
        public static VarHandle dwDeviceID$VH() {
            return Target.dwDeviceID$VH;
        }
        public static int dwDeviceID$get(MemorySegment seg) {
            return (int)Target.dwDeviceID$VH.get(seg);
        }
        public static void dwDeviceID$set( MemorySegment seg, int x) {
            Target.dwDeviceID$VH.set(seg, x);
        }
        public static int dwDeviceID$get(MemorySegment seg, long index) {
            return (int)Target.dwDeviceID$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwDeviceID$set(MemorySegment seg, long index, int x) {
            Target.dwDeviceID$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle wMid$VH = Target$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
        public static VarHandle wMid$VH() {
            return Target.wMid$VH;
        }
        public static short wMid$get(MemorySegment seg) {
            return (short)Target.wMid$VH.get(seg);
        }
        public static void wMid$set( MemorySegment seg, short x) {
            Target.wMid$VH.set(seg, x);
        }
        public static short wMid$get(MemorySegment seg, long index) {
            return (short)Target.wMid$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void wMid$set(MemorySegment seg, long index, short x) {
            Target.wMid$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle wPid$VH = Target$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
        public static VarHandle wPid$VH() {
            return Target.wPid$VH;
        }
        public static short wPid$get(MemorySegment seg) {
            return (short)Target.wPid$VH.get(seg);
        }
        public static void wPid$set( MemorySegment seg, short x) {
            Target.wPid$VH.set(seg, x);
        }
        public static short wPid$get(MemorySegment seg, long index) {
            return (short)Target.wPid$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void wPid$set(MemorySegment seg, long index, short x) {
            Target.wPid$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle vDriverVersion$VH = Target$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
        public static VarHandle vDriverVersion$VH() {
            return Target.vDriverVersion$VH;
        }
        public static int vDriverVersion$get(MemorySegment seg) {
            return (int)Target.vDriverVersion$VH.get(seg);
        }
        public static void vDriverVersion$set( MemorySegment seg, int x) {
            Target.vDriverVersion$VH.set(seg, x);
        }
        public static int vDriverVersion$get(MemorySegment seg, long index) {
            return (int)Target.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
            Target.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment szPname$slice(MemorySegment seg) {
            return seg.asSlice(16, 64);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Target$slice(MemorySegment seg) {
        return seg.asSlice(204, 80);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


