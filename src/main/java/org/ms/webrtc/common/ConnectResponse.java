package org.ms.webrtc.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 连接响应
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConnectResponse {
    private String session_id;
}
