package study.ch20;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Oder {
    private int orderNumber;
    private List<OrderDetail> orderDetails;
    private LocalDateTime orderDateTime;
}
