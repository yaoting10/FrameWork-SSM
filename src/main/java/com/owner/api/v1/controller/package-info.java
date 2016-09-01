package com.owner.api.v1.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@EqualsAndHashCode
final class BooleanEntity{

    @JsonProperty("v")
    @NotNull
    private Boolean value;

    @JsonCreator
    public BooleanEntity(@JsonProperty("v") @NotNull Boolean value){
        this.value = value;
    }
}

@Getter
@NoArgsConstructor
@EqualsAndHashCode
final class IntegerEntity{

    @JsonProperty("v")
    private long value;

    @JsonCreator
    public IntegerEntity(@JsonProperty("v") @NotNull Long value){
        this.value = value;
    }
}

@Getter
@NoArgsConstructor
@EqualsAndHashCode
final class StringEntity{

    @JsonProperty("v")
    @NotBlank
    private String value;

    @JsonCreator
    public StringEntity(@JsonProperty("v") @NotBlank String value){
        this.value = value;
    }
}

class Constant {

    public static final String EMPTY = "";
    public static final String IDENTITY = "identity";
    public static final String CELL_NO = "cellNo";
    public static final String PASSWORD = "password";
    public static final String TRANSACTION_CODE = "transactionCode";
    public static final String BANK_CARD = "bankCard";
    public static final String WDZJ_USER_NAME = "wdjz_66cf";
    public static final String WDZJ_PASSWORD = "YioGIP67fvY4nVso";
}


