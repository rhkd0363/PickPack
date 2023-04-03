package com.pickpack.flightservice.api.response;

import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class OnewayTicketListRes {
    private Long totalCount;
    private List<OneWayTicketRes> ticketList;
}
