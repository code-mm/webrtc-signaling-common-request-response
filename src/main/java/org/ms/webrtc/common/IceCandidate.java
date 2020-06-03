package org.ms.webrtc.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IceCandidate {

    private String sdpMid;
    private int sdpMLineIndex;
    private String sdp;
    private String serverUrl;
}
