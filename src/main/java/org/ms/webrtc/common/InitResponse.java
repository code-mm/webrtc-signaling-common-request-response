package org.ms.webrtc.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InitResponse {
    private static final String event_type = "__init";
    private Boolean status;

}
