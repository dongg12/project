package com.wd.admin.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class GetByIdRequest {
    @NotNull(message = "id不能为空")
    private Long id;
}
