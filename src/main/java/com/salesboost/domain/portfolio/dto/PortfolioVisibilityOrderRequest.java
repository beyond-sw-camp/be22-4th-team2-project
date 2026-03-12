package com.salesboost.domain.portfolio.dto;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PortfolioVisibilityOrderRequest {

    @NotNull(message = "portfolioIds는 필수입니다.")
    private List<Long> portfolioIds;
}
