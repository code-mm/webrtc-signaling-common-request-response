package org.ms.webrtc.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 连接请求
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ConnectRequest {
    // 用户id
    private String user_id;
}
