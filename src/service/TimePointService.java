package service;

import model.InputData;
import model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {

    TimePoint calculate(BigDecimal installmentNumber, InputData inputData);
}
