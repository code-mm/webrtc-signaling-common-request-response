package org.ms.webrtc.common;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class InitRequest {
    private static final String event_type = "__init";
    private String user_id;
    private String device_id;
    private String device_type;
    private String device_name;
}
