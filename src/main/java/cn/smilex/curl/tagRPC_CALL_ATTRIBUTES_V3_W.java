// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRPC_CALL_ATTRIBUTES_V3_W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("ServerPrincipalNameBufferLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ServerPrincipalName"),
        Constants$root.C_LONG$LAYOUT.withName("ClientPrincipalNameBufferLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ClientPrincipalName"),
        Constants$root.C_LONG$LAYOUT.withName("AuthenticationLevel"),
        Constants$root.C_LONG$LAYOUT.withName("AuthenticationService"),
        Constants$root.C_LONG$LAYOUT.withName("NullSession"),
        Constants$root.C_LONG$LAYOUT.withName("KernelModeCaller"),
        Constants$root.C_LONG$LAYOUT.withName("ProtocolSequence"),
        Constants$root.C_LONG$LAYOUT.withName("IsClientLocal"),
        Constants$root.C_POINTER$LAYOUT.withName("ClientPID"),
        Constants$root.C_LONG$LAYOUT.withName("CallStatus"),
        Constants$root.C_LONG$LAYOUT.withName("CallType"),
        Constants$root.C_POINTER$LAYOUT.withName("CallLocalAddress"),
        Constants$root.C_SHORT$LAYOUT.withName("OpNum"),
        MemoryLayout.paddingLayout(16),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("InterfaceUuid"),
        Constants$root.C_LONG$LAYOUT.withName("ClientIdentifierBufferLength"),
        Constants$root.C_POINTER$LAYOUT.withName("ClientIdentifier")
    ).withName("tagRPC_CALL_ATTRIBUTES_V3_W");
    public static MemoryLayout $LAYOUT() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerPrincipalNameBufferLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ServerPrincipalNameBufferLength"));
    public static VarHandle ServerPrincipalNameBufferLength$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalNameBufferLength$VH;
    }
    public static int ServerPrincipalNameBufferLength$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalNameBufferLength$VH.get(seg);
    }
    public static void ServerPrincipalNameBufferLength$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalNameBufferLength$VH.set(seg, x);
    }
    public static int ServerPrincipalNameBufferLength$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalNameBufferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPrincipalNameBufferLength$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalNameBufferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerPrincipalName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ServerPrincipalName"));
    public static VarHandle ServerPrincipalName$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalName$VH;
    }
    public static MemoryAddress ServerPrincipalName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalName$VH.get(seg);
    }
    public static void ServerPrincipalName$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalName$VH.set(seg, x);
    }
    public static MemoryAddress ServerPrincipalName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPrincipalName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ServerPrincipalName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClientPrincipalNameBufferLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClientPrincipalNameBufferLength"));
    public static VarHandle ClientPrincipalNameBufferLength$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalNameBufferLength$VH;
    }
    public static int ClientPrincipalNameBufferLength$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalNameBufferLength$VH.get(seg);
    }
    public static void ClientPrincipalNameBufferLength$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalNameBufferLength$VH.set(seg, x);
    }
    public static int ClientPrincipalNameBufferLength$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalNameBufferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPrincipalNameBufferLength$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalNameBufferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClientPrincipalName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClientPrincipalName"));
    public static VarHandle ClientPrincipalName$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalName$VH;
    }
    public static MemoryAddress ClientPrincipalName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalName$VH.get(seg);
    }
    public static void ClientPrincipalName$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalName$VH.set(seg, x);
    }
    public static MemoryAddress ClientPrincipalName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPrincipalName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientPrincipalName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthenticationLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthenticationLevel"));
    public static VarHandle AuthenticationLevel$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationLevel$VH;
    }
    public static int AuthenticationLevel$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationLevel$VH.get(seg);
    }
    public static void AuthenticationLevel$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationLevel$VH.set(seg, x);
    }
    public static int AuthenticationLevel$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthenticationLevel$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthenticationService$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthenticationService"));
    public static VarHandle AuthenticationService$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationService$VH;
    }
    public static int AuthenticationService$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationService$VH.get(seg);
    }
    public static void AuthenticationService$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationService$VH.set(seg, x);
    }
    public static int AuthenticationService$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationService$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthenticationService$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.AuthenticationService$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NullSession$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NullSession"));
    public static VarHandle NullSession$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.NullSession$VH;
    }
    public static int NullSession$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.NullSession$VH.get(seg);
    }
    public static void NullSession$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.NullSession$VH.set(seg, x);
    }
    public static int NullSession$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.NullSession$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NullSession$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.NullSession$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle KernelModeCaller$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("KernelModeCaller"));
    public static VarHandle KernelModeCaller$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.KernelModeCaller$VH;
    }
    public static int KernelModeCaller$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.KernelModeCaller$VH.get(seg);
    }
    public static void KernelModeCaller$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.KernelModeCaller$VH.set(seg, x);
    }
    public static int KernelModeCaller$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.KernelModeCaller$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KernelModeCaller$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.KernelModeCaller$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtocolSequence$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProtocolSequence"));
    public static VarHandle ProtocolSequence$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.ProtocolSequence$VH;
    }
    public static int ProtocolSequence$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.ProtocolSequence$VH.get(seg);
    }
    public static void ProtocolSequence$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ProtocolSequence$VH.set(seg, x);
    }
    public static int ProtocolSequence$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.ProtocolSequence$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtocolSequence$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ProtocolSequence$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IsClientLocal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsClientLocal"));
    public static VarHandle IsClientLocal$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.IsClientLocal$VH;
    }
    public static int IsClientLocal$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.IsClientLocal$VH.get(seg);
    }
    public static void IsClientLocal$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.IsClientLocal$VH.set(seg, x);
    }
    public static int IsClientLocal$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.IsClientLocal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsClientLocal$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.IsClientLocal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClientPID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClientPID"));
    public static VarHandle ClientPID$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.ClientPID$VH;
    }
    public static MemoryAddress ClientPID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.ClientPID$VH.get(seg);
    }
    public static void ClientPID$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientPID$VH.set(seg, x);
    }
    public static MemoryAddress ClientPID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.ClientPID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientPID$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientPID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CallStatus"));
    public static VarHandle CallStatus$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.CallStatus$VH;
    }
    public static int CallStatus$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.CallStatus$VH.get(seg);
    }
    public static void CallStatus$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.CallStatus$VH.set(seg, x);
    }
    public static int CallStatus$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.CallStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallStatus$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.CallStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CallType"));
    public static VarHandle CallType$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.CallType$VH;
    }
    public static int CallType$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.CallType$VH.get(seg);
    }
    public static void CallType$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.CallType$VH.set(seg, x);
    }
    public static int CallType$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.CallType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallType$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.CallType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallLocalAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CallLocalAddress"));
    public static VarHandle CallLocalAddress$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.CallLocalAddress$VH;
    }
    public static MemoryAddress CallLocalAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.CallLocalAddress$VH.get(seg);
    }
    public static void CallLocalAddress$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.CallLocalAddress$VH.set(seg, x);
    }
    public static MemoryAddress CallLocalAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.CallLocalAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallLocalAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.CallLocalAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OpNum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OpNum"));
    public static VarHandle OpNum$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.OpNum$VH;
    }
    public static short OpNum$get(MemorySegment seg) {
        return (short)tagRPC_CALL_ATTRIBUTES_V3_W.OpNum$VH.get(seg);
    }
    public static void OpNum$set( MemorySegment seg, short x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.OpNum$VH.set(seg, x);
    }
    public static short OpNum$get(MemorySegment seg, long index) {
        return (short)tagRPC_CALL_ATTRIBUTES_V3_W.OpNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OpNum$set(MemorySegment seg, long index, short x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.OpNum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment InterfaceUuid$slice(MemorySegment seg) {
        return seg.asSlice(92, 16);
    }
    static final VarHandle ClientIdentifierBufferLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClientIdentifierBufferLength"));
    public static VarHandle ClientIdentifierBufferLength$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifierBufferLength$VH;
    }
    public static int ClientIdentifierBufferLength$get(MemorySegment seg) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifierBufferLength$VH.get(seg);
    }
    public static void ClientIdentifierBufferLength$set( MemorySegment seg, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifierBufferLength$VH.set(seg, x);
    }
    public static int ClientIdentifierBufferLength$get(MemorySegment seg, long index) {
        return (int)tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifierBufferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientIdentifierBufferLength$set(MemorySegment seg, long index, int x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifierBufferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ClientIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClientIdentifier"));
    public static VarHandle ClientIdentifier$VH() {
        return tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifier$VH;
    }
    public static MemoryAddress ClientIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifier$VH.get(seg);
    }
    public static void ClientIdentifier$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifier$VH.set(seg, x);
    }
    public static MemoryAddress ClientIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClientIdentifier$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_CALL_ATTRIBUTES_V3_W.ClientIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


